package org.gravity.eclipse.importer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
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

	private final static String gradleCache = "caches/modules-2/files-2.1";
	private final static String androidSdkPlatforms = "Sdk/platforms";
	
	public GradleImport(String gradleHome, String androidHome) {
		this.gradle = gradleHome;
		this.android = androidHome;
	}

	public IJavaProject importGradleProject(File folder, String name, IProgressMonitor monitor) throws Exception {
		File gradleFolder = new File(gradle);
		if (!gradleFolder.exists()) {
			return null;
		}

		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}

		// Find all java and gradle build files and output folders
		List<Path> java = new LinkedList<>();
		List<Path> gradle = new LinkedList<>();
		List<Path> ignore = new LinkedList<>();
		scanDirctory(folder, java, gradle, ignore);

		IJavaProject project = createJavaProject(name, monitor, java, ignore, gradle);

		// build gradle project
		buildGradleProject(folder);

		IFolder libFolder = project.getProject().getFolder("lib");
		libFolder.create(true, true, monitor);
		List<Path> libs = getLibs(gradle);
		IClasspathEntry[] oldEntries = project.getRawClasspath();
		int i = oldEntries.length;
		IClasspathEntry[] newEntries = new IClasspathEntry[libs.size() + i];
		System.arraycopy(oldEntries, 0, newEntries, 0, i);
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
							jarFile.create(zipStream, true, monitor);
//							zipStream.closeEntry();
							break;
						}
						zipStream.closeEntry();
					}
				}
			}
			IClasspathEntry entry = new ClasspathEntry(IPackageFragmentRoot.K_BINARY, IClasspathEntry.CPE_LIBRARY,
					jarFile.getFullPath(), ClasspathEntry.INCLUDE_ALL, // inclusion patterns
					ClasspathEntry.EXCLUDE_NONE, // exclusion patterns
					null, null, null, // specific output folder
					false, // exported
					ClasspathEntry.NO_ACCESS_RULES, false, // no access rules to combine
					ClasspathEntry.NO_EXTRA_ATTRIBUTES);
			newEntries[i++] = entry;
		}
		project.setRawClasspath(newEntries, monitor);

		return project;
	}

	private boolean buildGradleProject(File folder) throws IOException, InterruptedException {
		File gradlew = new File(folder, "gradlew");
		if (!gradlew.exists()) {
			return false;
		}
		gradlew.setExecutable(true);
		Process p = Runtime.getRuntime().exec(gradlew.getAbsolutePath());
		try (InputStream in = p.getInputStream()) {
			byte[] buffer = new byte[1024];
			while (in.read(buffer, 0, buffer.length) > 0) {
				System.out.write(buffer);
			}
		}
		p.waitFor();
		return p.exitValue() == 0;
	}

	private void scanDirctory(File folder, List<Path> java, List<Path> gradle, List<Path> ignore) throws IOException {
		Files.walkFileTree(folder.toPath(), new SimpleFileVisitor<Path>() {
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
				if (attrs.isRegularFile()) {
					if (file.getFileName().toString().equals("build.gradle")) {
						gradle.add(file);
						for (File silbing : file.getParent().toFile().listFiles()) {
							if (silbing.isDirectory() && "build".equals(silbing.getName())) {
								ignore.add(silbing.getAbsoluteFile().toPath());
							}
						}
					} else if (file.getFileName().toString().endsWith("java")) {
						java.add(file);
					}
				}
				return super.visitFile(file, attrs);
			}
		});
	}

	private IJavaProject createJavaProject(String name, IProgressMonitor monitor, List<Path> java, List<Path> ignore,
			List<Path> gradle) throws Exception {
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
		binFolder.create(false, true, null);
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
			boolean ignoreFile = false;
			for (Path i : ignore) {
				if (path.startsWith(i)) {
					ignoreFile = true;
					break;
				}
			}
			if (ignoreFile) {
				continue;
			}

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
				String className = fileName.substring(0, fileName.length() - ".java".length());
				IPath location = new org.eclipse.core.runtime.Path(javaFile.toFile().getAbsolutePath());
				IFile iFile = ((IFolder) pack.getResource()).getFile(fileName);
				if (iFile.exists()) {
					if (iFile.getLocation().toFile().getAbsolutePath().equals(location.toFile().getAbsolutePath())) {
						continue;
					} else {
						throw new RuntimeException("Duplicate");
					}
				}
				iFile.createLink(location, IResource.NONE, monitor);
				// ICompilationUnit cu = JavaCore.createCompilationUnitFrom(iFile);
			}
		}
		return javaProject;
	}

	private List<Path> getLibs(Iterable<Path> gradle) throws IOException, FileNotFoundException {
		List<String> libs = new LinkedList<>();

		int minSdk = Integer.MAX_VALUE;
		int targetSdk = -1;

		Pattern patternDepenenceies = Pattern.compile("(\\s*)(dependencies)(\\s+)(\\{)");
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

					Matcher mDeps = patternDepenenceies.matcher(line);
					if (mDeps.find()) {
						line = line.substring(mDeps.end(), line.length());
						break;
					}
				}
				if (line == null) {
					continue;
				}

				do {
					Matcher m = patternSingleDependency.matcher(line);
					while (m.find()) {
						libs.add(m.group(4));
					}
				} while ((line = in.readLine()) != null && line.indexOf('}') == -1);
			}
		}

		List<Path> libsAsJar = new LinkedList<>();
		File cacheFile = new File(new File(this.gradle), this.gradleCache);
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
		if (!compAndroidSdk) {
			throw new RuntimeException("Install android SDK " + targetSdk);
		}

		return libsAsJar;
	}
}
