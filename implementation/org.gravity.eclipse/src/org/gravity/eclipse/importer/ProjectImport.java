/**
 * 
 */
package org.gravity.eclipse.importer;

import java.io.File;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.io.FileUtils;

/**
 * @author speldszus
 *
 */
public abstract class ProjectImport {
	
	/**
	 * If the project should be imported even if build errors occur
	 */
	private final boolean ignoreBuildErrors;
	
	/**
	 * The root directory from which the project should be imported
	 */
	private final File rootDir;
	
	/**
	 * The root configuration file of the project which should be imported
	 */
	private final File rootFile;

		/**
	 * Creates a new importer for the given project
	 * 
	 * @param rootDir The root directory from which the project should be imported
	 * @param rootFile The configuration file of the build system
	 * @param ignoreBuildErrors If the project should be imported even if build errors occur
	 * @return The importer
	 * @throws ImportException
	 */
	public ProjectImport(File rootDir, String rootFile, boolean ignoreBuildErrors) throws ImportException {
		this.ignoreBuildErrors = ignoreBuildErrors;
		this.rootDir = getRoot(rootDir, rootFile);
		this.rootFile = new File(getRootDir(), rootFile);
	}
	
	/**
	 * Imports the gradle project as single eclipse project
	 * 
	 * @param monitor A progress monitor
	 * @return The new eclipse java project
	 * @throws ImportException if the import failed
	 */
	public abstract IJavaProject importProject(IProgressMonitor monitor) throws ImportException;

	/**
	 * @return the ignoreBuildErrors
	 */
	protected boolean ignoreBuildErrors() {
		return ignoreBuildErrors;
	}

	/**
	 * A getter for the root directory of the project
	 * 
	 * @return the rootDir
	 */
	protected File getRootDir() {
		return rootDir;
	}

	/**
	 * Searches the root directory containing the root file e.g. a build.gradle or pom.xml
	 * 
	 * @param rootDir The top level root directory
	 * @param rootFile The name of the root file
	 * @return The root folder
	 * @throws NoRootFolderException If no root file has been found
	 */
	private File getRoot(File rootDir, String rootFile) throws NoRootFolderException {
		File buildDotGradle = FileUtils.findRecursive(rootDir, rootFile);
		if (buildDotGradle == null) {
			throw new NoRootFolderException();
		}
		return buildDotGradle.getParentFile();
	}

	/**
	 * @return the rootFile
	 */
	public File getRootFile() {
		return rootFile;
	}
}
