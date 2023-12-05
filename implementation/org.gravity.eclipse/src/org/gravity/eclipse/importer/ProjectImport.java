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
	 * @param rootDir           The root directory from which the project should be
	 *                          imported
	 * @param ignoreBuildErrors If the project should be imported even if build
	 *                          errors occur
	 * @param rootFiles         Potential configuration files of the build system
	 * @return The importer
	 * @throws ImportException
	 */
	protected ProjectImport(final File rootDir, final boolean ignoreBuildErrors, final String... rootFiles)
			throws ImportException {
		this.ignoreBuildErrors = ignoreBuildErrors;
		this.rootFile = this.getRootConfigurationFile(rootDir, rootFiles);
		this.rootDir = this.rootFile.getParentFile();
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
		return this.ignoreBuildErrors;
	}

	/**
	 * A getter for the root directory of the project
	 *
	 * @return the rootDir
	 */
	protected File getRootDir() {
		return this.rootDir;
	}

	/**
	 * Searches the root directory containing the root file e.g. a build.gradle or
	 * pom.xml
	 *
	 * @param rootDir   The top level root directory
	 * @param rootFiles The names of potential root files
	 * @return The root file
	 * @throws NoRootFolderException If no root file has been found
	 */
	private final File getRootConfigurationFile(final File rootDir, final String... rootFiles)
			throws NoRootFolderException {
		var i = 0;
		File buildDotGradle = null;
		while (i < rootFiles.length && (buildDotGradle = FileUtils.findRecursive(rootDir, rootFiles[i])) == null) {
			i++;
		}
		if (buildDotGradle == null) {
			throw new NoRootFolderException();
		}
		return buildDotGradle;
	}

	/**
	 * @return the rootFile
	 */
	public File getRootFile() {
		return this.rootFile;
	}
}
