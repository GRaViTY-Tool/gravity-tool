/**
 *
 */
package org.gravity.eclipse.importer.maven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.gravity.eclipse.importer.ImportException;
import org.gravity.eclipse.importer.ProjectImport;
import org.gravity.eclipse.io.ExtensionFileVisitor;
import org.gravity.eclipse.os.Execute;
import org.gravity.eclipse.os.UnsupportedOperationSystemException;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.eclipse.util.JavaProjectUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * A project importer for maven projects
 *
 * @author speldszus
 *
 */
public class MavenImport extends ProjectImport {

	private static final boolean LINKONPROJECT = false;

	private static final Logger LOGGER = Logger.getLogger(MavenImport.class);

	private final Set<File> modulePoms;
	private final Set<File> sourceFolders;
	private final Map<String, Path> dependencies;

	private final DocumentBuilder builder;

	private final File m2;
	private final File mavenRepository;

	/**
	 * Creates an new instance of the maven project importer
	 *
	 * @param rootDir           The root directory of the maven project to import
	 * @param ignoreBuildErrors If build errors should be ignored
	 * @throws ImportException If the importer cannot be created for the project
	 */
	public MavenImport(final File rootDir, final boolean ignoreBuildErrors) throws ImportException {
		super(rootDir, "pom.xml", ignoreBuildErrors);
		this.modulePoms = new HashSet<>();
		this.sourceFolders = new HashSet<>();
		this.dependencies = new HashMap<>();
		try {
			this.builder = PomParser.createDocumentBuilder();
		} catch (final ParserConfigurationException e) {
			throw new ImportException(e);
		}
		this.m2 = new File(new File(System.getProperty("user.home")), ".m2");
		if (!this.m2.exists()) {
			throw new ImportException(new FileNotFoundException("Maven user home not found"));
		}
		this.mavenRepository = new File(this.m2, "repository");
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.gravity.eclipse.importer.ProjectImport#importProject(org.eclipse.core.
	 * runtime.IProgressMonitor)
	 */
	@Override
	public IJavaProject importProject(final IProgressMonitor monitor) throws ImportException {
		final File parentPom = getRootFile();
		build();
		final Deque<File> stack = new LinkedList<>();
		stack.add(parentPom);
		while (!stack.isEmpty()) {
			stack.addAll(processPOM(stack.pop()));
		}
		final Set<File> libs = this.dependencies.values().parallelStream().map(Path::toFile).collect(Collectors.toSet());
		final IJavaProject javaProject = createJavaProject(this.sourceFolders, libs, monitor);
		try {
			final IProject project = javaProject.getProject();
			project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
			project.build(IncrementalProjectBuilder.FULL_BUILD, monitor);
		} catch (final CoreException e) {
			if (!ignoreBuildErrors()) {
				throw new ImportException(e);
			} else {
				LOGGER.error(e.getLocalizedMessage(), e);
			}
		}
		return javaProject;
	}

	/**
	 * Builds the maven project
	 *
	 * @throws ImportException If the project couldn't be built and build errors
	 *                         shouldn't be ignored
	 */
	private void build() throws ImportException {
		try {
			final List<String> args = Arrays.asList("clean", "compile");
			final File rootDir = getRootDir();
			final Process process = Execute.run(rootDir, "mvn", args, null);
			if (!Execute.execute(process) && !ignoreBuildErrors()) {
				throw new ImportException("Couldn't build the maven project");
			}
		} catch (UnsupportedOperationSystemException | IOException e) {
			if (ignoreBuildErrors()) {
				LOGGER.warn(e.getLocalizedMessage(), e);
			} else {
				throw new ImportException(e);
			}
		}
	}

	/**
	 * Creates a java project from the given source folders and libs
	 *
	 * @param sourceFolders The folders containing the java source files
	 * @param libs          A set of jar files containing libs
	 * @param monitor       A progress monitor
	 * @return The created project
	 * @throws ImportException If the creation of the project fails
	 */
	private IJavaProject createJavaProject(final Set<File> sourceFolders, final Set<File> libs, final IProgressMonitor monitor)
			throws ImportException {
		IJavaProject project;
		try {
			project = JavaProjectUtil.createJavaProjectWithUniqueName(getRootDir().getName(), monitor);
			addSourceFolders(sourceFolders, project, monitor);
			addLibsToProject(libs, project, monitor);
		} catch (CoreException | IOException e) {
			throw new ImportException(e);
		}
		return project;
	}

	/**
	 * Adds the source folders to the project
	 *
	 * @param sources The root folder containing the sources
	 * @param project The java project
	 * @param monitor A progress monitor
	 * @throws CoreException
	 * @throws IOException
	 */
	private void addSourceFolders(final Set<File> sources, final IJavaProject project, final IProgressMonitor monitor)
			throws CoreException, IOException {
		for (final File src : sources) {
			final String srcFolderName = getRootDir().toPath().relativize(src.toPath()).toString();
			final String[] names = srcFolderName.split("/|\\\\");
			IFolder folder = project.getProject().getFolder(names[0]);
			for (int i = 1; i < names.length; i++) {
				folder = folder.getFolder(names[i]);
				if (!folder.exists()) {
					EclipseProjectUtil.createFolder(folder, monitor);
				}
			}
			final IPackageFragmentRoot packageFragmentRoot = project.getPackageFragmentRoot(folder);
			JavaProjectUtil.addToClassPath(project,
					Arrays.asList(JavaCore.newSourceEntry(packageFragmentRoot.getPath())), monitor);
			final ExtensionFileVisitor visitor = new ExtensionFileVisitor("java");
			Files.walkFileTree(src.toPath(), visitor);
			JavaProjectUtil.addJavaSourceFilesToRoot(visitor.getFiles(), packageFragmentRoot, LINKONPROJECT, monitor);
		}
	}

	/**
	 * Adds a set of libs to the project
	 *
	 * @param libs    The jar files
	 * @param project The project
	 * @param monitor A progress monitor
	 * @throws JavaModelException If adding a lib fails
	 */
	private void addLibsToProject(final Set<File> libs, final IJavaProject project, final IProgressMonitor monitor)
			throws JavaModelException {
		final IFolder libFolder = project.getProject().getFolder("lib");
		final Stream<IFile> linkedFiles = libs.stream().map(libPath -> {
			final IFile libFileInProject = libFolder.getFile(libPath.getName());
			if (libFileInProject.exists()) {
				LOGGER.warn("Lib is already existent");
			} else {
				try {
					EclipseProjectUtil.createLink(libPath, libFileInProject, monitor);
				} catch (final CoreException e) {
					throw new IllegalStateException(e);
				}
			}
			return libFileInProject;
		});
		final Stream<IClasspathEntry> entries = JavaProjectUtil.getClasspathEntries(linkedFiles.distinct());
		JavaProjectUtil.addToClassPath(project, entries.collect(Collectors.toList()), monitor);
	}

	/**
	 * Discovers all modules, source folders and dependencies
	 *
	 * @param pomFile The parent pom file
	 * @throws ImportException
	 */
	private Collection<File> processPOM(final File pomFile) throws ImportException {
		if (this.modulePoms.contains(pomFile)) {
			return Collections.emptyList();
		}
		final File parent = pomFile.getParentFile();
		final File src = new File(parent, "src/main/java");
		if (src.exists()) {
			this.sourceFolders.add(src);
		}
		Document document;
		try {
			document = this.builder.parse(pomFile);
			final Collection<File> child = getModules(document, parent);
			PomParser.getDependencies(document, this.mavenRepository, this.dependencies);
			this.modulePoms.add(pomFile);
			return child;
		} catch (SAXException | IOException e) {
			throw new ImportException(e);
		}
	}

	/**
	 * Gets the modules of the pom file
	 *
	 * @param pom    The parsed pom file
	 * @param parent The folder containing the pom
	 * @return The modules
	 */
	public Collection<File> getModules(final Document pom, final File parent) {
		final NodeList modules = pom.getElementsByTagName("module");
		final List<File> child = new ArrayList<>(modules.getLength());
		for (int i = 0; i < modules.getLength(); i++) {
			final Node module = modules.item(i);
			final String text = module.getTextContent();
			final File moduleFile = new File(new File(parent, text), "pom.xml");
			if (moduleFile.exists()) {
				child.add(moduleFile);
			}
		}
		return child;
	}

}
