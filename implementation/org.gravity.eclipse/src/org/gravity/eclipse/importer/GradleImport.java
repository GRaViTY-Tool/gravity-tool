package org.gravity.eclipse.importer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.internal.core.ClasspathEntry;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.LibraryLocation;

public class GradleImport {

	private String gradle;
	private String android;

	private final static String gradleCache = "caches" + File.separator + "modules-2" + File.separator + "files-2.1";
	private final static String androidSdkPlatforms = "platforms";
	private static final boolean LINKONPROJECT = false;

	public GradleImport(String gradleHome, String androidHome) {
		this.gradle = gradleHome;
		this.android = androidHome;
	}

	public IJavaProject importGradleProject(File folder, String name, IProgressMonitor monitor) throws Exception {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}

		// build gradle project
		if (!buildGradleProject(folder)) {
			return null;
		}

		// Find all java and gradle build files and output folders
		List<Path> java = new LinkedList<>();
		List<Path> gradle = new LinkedList<>();
		scanDirectory(folder, java, gradle);

		IJavaProject project = createJavaProject(name, monitor, java, gradle);

		IFolder libFolder = project.getProject().getFolder("lib");
		libFolder.create(true, true, monitor);

		List<IClasspathEntry> entries = new LinkedList<>();
		List<Path> libs = getLibs(gradle);
		for (Path libPath : libs) {
			IFile jarFile = null;
			String libName = libPath.toFile().getName();
			if (libName.endsWith(".jar")) {
				jarFile = libFolder.getFile(libPath.getFileName().toString());
				IPath jarPath = new org.eclipse.core.runtime.Path(libPath.toFile().getAbsolutePath());
				jarFile.createLink(jarPath, IResource.NONE, monitor);
			} else if (libName.endsWith(".aar")) {
				try (ZipInputStream zipStream = new ZipInputStream(new FileInputStream(libPath.toFile()))) {
					ZipEntry entry;
					while ((entry = zipStream.getNextEntry()) != null) {
						if (entry.getName().endsWith(".jar")) {
							jarFile = libFolder
									.getFile(libName.substring(0, libName.length() - "aar".length()) + "jar");
							if (!jarFile.exists()) {
								jarFile.create(zipStream, true, monitor);
								// zipStream.closeEntry();
								break;
							} else {
								jarFile = null;
							}
						}
						zipStream.closeEntry();
					}
				}
			}
			if (jarFile == null) {
				continue;
			}
			IClasspathEntry entry = new ClasspathEntry(IPackageFragmentRoot.K_BINARY, IClasspathEntry.CPE_LIBRARY,
					jarFile.getFullPath(), ClasspathEntry.INCLUDE_ALL, // inclusion
																		// patterns
					ClasspathEntry.EXCLUDE_NONE, // exclusion patterns
					null, null, null, // specific output folder
					false, // exported
					ClasspathEntry.NO_ACCESS_RULES, false, // no access rules to
															// combine
					ClasspathEntry.NO_EXTRA_ATTRIBUTES);
			entries.add(entry);
		}

		IClasspathEntry[] oldEntries = project.getRawClasspath();
		int i = oldEntries.length;
		IClasspathEntry[] newEntries = new IClasspathEntry[entries.size() + i];
		System.arraycopy(oldEntries, 0, newEntries, 0, i);
		for (IClasspathEntry entry : entries) {
			newEntries[i++] = entry;
		}

		project.setRawClasspath(newEntries, monitor);

		return project;
	}

	private boolean buildGradleProject(File folder) throws IOException, InterruptedException {
		String command;
		File gradlew = new File(folder, "gradlew");
		if (gradlew.exists()) {
			gradlew.setExecutable(true);
			command = "gradlew assembleDebug";
			if (System.getProperty("os.name").toLowerCase().indexOf("linux") >= 0) {
				command = "./" + command;
			}
		} else {
			command = "gradle assembleDebug";
		}

		Process p = null;
		if (System.getProperty("os.name").toLowerCase().indexOf("windows") >= 0) {
			p = Runtime.getRuntime().exec("cmd /c \"" + command, null, folder);
		} else if (System.getProperty("os.name").toLowerCase().indexOf("linux") >= 0) {
			p = Runtime.getRuntime().exec(command, null, folder);
		} else {
			System.err.println("Unsupported OS");
			return false;
		}
		// try(BufferedReader stream = new BufferedReader(new
		// InputStreamReader(p.getInputStream()))){
		// String line;
		// while((line = stream.readLine()) != null) {
		// System.out.println("GRADLE: " + line);
		// }
		// }
		try (BufferedReader stream = new BufferedReader(new InputStreamReader(p.getErrorStream()))) {
			String line;
			while ((line = stream.readLine()) != null) {
				System.err.println("GRADLE: " + line);
			}
		}

		p.waitFor();
		return p.exitValue() == 0;
	}

	private void scanDirectory(File folder, List<Path> java, List<Path> gradle) throws IOException {
		File buildFile = new File(folder, "build.gradle");
		if (!buildFile.exists()) {
			return;
		}
		gradle.add(buildFile.toPath());

		File settingsFile = new File(folder, "settings.gradle");
		if (settingsFile.exists()) {
			Pattern includePattern = Pattern.compile("(include)(\\s*)(((':)(.+)('))(\\s*,\\s*)?)+");
			Pattern entryPattern = Pattern.compile("(':)((\\w|-| |\\.)+)(')");
			try (BufferedReader reader = new BufferedReader(new FileReader(settingsFile))) {
				String line;
				while ((line = reader.readLine()) != null) {
					Matcher m = includePattern.matcher(line);
					while (m.find()) {
						String match = m.group().substring("include".length() + 1);
						Matcher mEntry = entryPattern.matcher(match);
						while (mEntry.find()) {
							scanDirectory(new File(folder, mEntry.group(2)), java, gradle);
						}
					}
				}
			}
		}

		File srcFolder = new File(folder, "src");
		if (srcFolder.exists()) {
			Files.walkFileTree(srcFolder.toPath(), new SimpleFileVisitor<Path>() {

				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					if (attrs.isRegularFile() && file.getFileName().toString().endsWith("java")) {
						java.add(file);
					}
					return super.visitFile(file, attrs);
				}
			});
		}
	}

	private IJavaProject createJavaProject(String name, IProgressMonitor monitor, List<Path> java, List<Path> gradle)
			throws Exception {
		// Create new project with given name
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = workspaceRoot.getProject(name);
		project.create(monitor);
		project.open(monitor);

		// Add Java-Nature
		IProjectDescription description = project.getDescription();
		String[] oldNatures = description.getNatureIds();
		String[] newNatures = new String[oldNatures.length + 1];
		newNatures[0] = JavaCore.NATURE_ID;
		System.arraycopy(oldNatures, 0, newNatures, 1, oldNatures.length);
		description.setNatureIds(newNatures);
		project.setDescription(description, monitor);

		IJavaProject javaProject = JavaCore.create(project);

		// Add binary output folder
		IFolder binFolder = project.getFolder("bin");
		if (!binFolder.exists()) {
			binFolder.create(false, true, null);
		}
		javaProject.setOutputLocation(binFolder.getFullPath(), null);

		// Add libs
		List<IClasspathEntry> entries = new ArrayList<>();
		IVMInstall vmInstall = JavaRuntime.getDefaultVMInstall();
		LibraryLocation[] locations = JavaRuntime.getLibraryLocations(vmInstall);
		for (LibraryLocation element : locations) {
			entries.add(JavaCore.newLibraryEntry(element.getSystemLibraryPath(), null, null));
			// TODO: Add gradle libs
		}
		javaProject.setRawClasspath(entries.toArray(new IClasspathEntry[entries.size()]), null);

		// Create src
		IFolder sourceFolder = project.getFolder("src");
		sourceFolder.create(false, true, monitor);

		IPackageFragmentRoot packageFragmentRoot = javaProject.getPackageFragmentRoot(sourceFolder);
		IClasspathEntry[] oldEntries = javaProject.getRawClasspath();
		IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + 1];
		System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
		newEntries[oldEntries.length] = JavaCore.newSourceEntry(packageFragmentRoot.getPath());
		javaProject.setRawClasspath(newEntries, null);

		Hashtable<String, List<Path>> packages = new Hashtable<>();

		Pattern packagePattern = Pattern.compile("((package)\\s+)((\\w|(\\.\\s*))+)((\\s*);)");

		for (Path path : java) {
			try (BufferedReader reader = new BufferedReader(new FileReader(path.toFile()))) {
				String line;
				String packageName = null;
				while ((line = reader.readLine()) != null && packageName == null) {
					Matcher m = packagePattern.matcher(line);
					if (m.find()) {
						packageName = m.group(3);
						List<Path> files;
						if (packages.containsKey(packageName)) {
							files = packages.get(packageName);
						} else {
							files = new LinkedList<Path>();
							packages.put(packageName, files);
						}
						files.add(path);
					}
				}
			}
		}

		for (Entry<String, List<Path>> entry : packages.entrySet()) {
			String packageName = entry.getKey();
			IPackageFragment pack = packageFragmentRoot.createPackageFragment(packageName, false, null);
			for (Path javaFile : entry.getValue()) {
				String fileName = javaFile.getFileName().toFile().getName();
				IPath location = new org.eclipse.core.runtime.Path(javaFile.toFile().getAbsolutePath());
				IFile iFile = ((IFolder) pack.getResource()).getFile(fileName);
				if (iFile.exists()) {
					if (iFile.getLocation().toFile().getAbsolutePath().equals(location.toFile().getAbsolutePath())) {
						continue;
					} else {

						throw new RuntimeException(
								"Duplicate: \n\t" + iFile.getLocation().toString() + "\n\t" + location.toString());

					}
				}
				if (LINKONPROJECT) {
					iFile.createLink(location, IResource.NONE, monitor);
				} else {
					Files.createSymbolicLink(iFile.getLocation().toFile().toPath(), location.toFile().toPath());
				}

			}
		}
		return javaProject;
	}

	private List<Path> getLibs(Iterable<Path> gradle) throws IOException, FileNotFoundException {
		List<String> libs = new LinkedList<>();

		int minSdk = Integer.MAX_VALUE;
		int targetSdk = -1;

		// Pattern patternDepenencies =
		// Pattern.compile("(\\s*)(dependencies)(\\s+)(\\{)");
		Pattern patternSingleDependency = Pattern.compile("(compile)(\\s+)(')(.+)(')");
		Pattern patternSdk = Pattern.compile("(((min)|(target))SdkVersion)(\\s+)(\\d+)");
		for (Path path : gradle) {
			try (BufferedReader in = new BufferedReader(new FileReader(path.toFile()))) {

				String line;
				while ((line = in.readLine()) != null) {
					Matcher matcherSdk = patternSdk.matcher(line);
					while (matcherSdk.find()) {
						String group = matcherSdk.group(1);
						if ("minSdkVersion".equals(group)) {
							int value = Integer.valueOf(matcherSdk.group(6));
							if (minSdk > value) {
								minSdk = value;
							}
						} else if ("targetSdkVersion".equals(group)) {
							int value = Integer.valueOf(matcherSdk.group(6));
							if (targetSdk < value) {
								targetSdk = value;
							}
						}
					}

					Matcher m = patternSingleDependency.matcher(line);
					while (m.find()) {
						libs.add(m.group(4));
					}
				}
			}
		}

		List<Path> libsAsJar = new LinkedList<>();
		File cacheFile = new File(new File(this.gradle), gradleCache);
		for (String lib : libs) {
			String[] segments = lib.split(":");
			File libFile = cacheFile;
			String name = segments[1] + '-' + segments[2];
			for (String segment : segments) {
				libFile = new File(libFile, segment);
			}
			File libJar = null;
			if (libFile.exists()) {
				for (File child : libFile.listFiles()) {
					for (File potentialLib : child.listFiles()) {
						if (potentialLib.getName().equals(name + ".jar")
								|| potentialLib.getName().equals(name + ".aar")) {
							libJar = potentialLib;
							break;
						}
					}
					if (libJar != null) {
						break;
					}
				}
				if (libJar != null) {
					libsAsJar.add(libJar.toPath());
				} else {
					System.err.println("WARNING: jar \"" + name + "\" for lib \"" + lib + "\" not found.");
				}
			}
		}

		boolean compAndroidSdk = false;
		File platforms = new File(new File(android), androidSdkPlatforms);
		for (int i = targetSdk; i >= minSdk; i--) {
			File androidJar = new File(new File(platforms, "android-" + i), "android.jar");
			if (androidJar.exists()) {
				compAndroidSdk = true;
				libsAsJar.add(androidJar.toPath());
				break;
			}
		}
		System.out.println(platforms.listFiles());
		if (!compAndroidSdk) {
			System.err.println("WARNING: Install android SDK " + targetSdk);
			for (File sdk : platforms.listFiles()) {
				int i = Integer.valueOf(sdk.getName().substring("android-".length()));
				if (i > targetSdk) {
					libsAsJar.add(new File(sdk, "android.jar").toPath());
					break;
				}
			}
		}

		return libsAsJar;
	}
}