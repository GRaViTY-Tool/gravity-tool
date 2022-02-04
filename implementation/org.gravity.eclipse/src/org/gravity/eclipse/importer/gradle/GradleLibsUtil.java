package org.gravity.eclipse.importer.gradle;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.gravity.eclipse.io.ZipUtil;

/**
 * Useful functionalities for handling libs of gradle projects
 *
 * @author speldszus
 *
 */
public final class GradleLibsUtil {

	private GradleLibsUtil() {
		// This class shouldn't be instantiated
	}

	/**
	 *
	 * Searches a other version of a lib. This method should only be used if an
	 * exact version match hasn't been found before!
	 *
	 * @param libName   The name of the lib
	 * @param libFolder The folder to which the lib should be linked or copied
	 * @param libPath   The path to the not existing exact version match
	 * @return The found files
	 * @throws IOException
	 * @throws CoreException
	 */
	static Collection<IFile> searchOtherVersionOfAarLib(final String libName, final IFolder libFolder,
			final Path libPath) throws IOException, CoreException {
		final var currentVersion = libPath.getParent().toFile();
		final List<File> otherVersions = Arrays.asList(currentVersion.getParentFile().listFiles());
		otherVersions.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
		for (var i = otherVersions.indexOf(currentVersion) - 1; i > 0; i--) {
			final var tmpFolder = otherVersions.get(i);
			final var tmpFile = new File(tmpFolder, libName.replace(currentVersion.getName(), tmpFolder.getName()));
			if (tmpFile.exists()) {
				final var jarFiles = extractAar(libPath, libFolder);
				if (!jarFiles.isEmpty()) {
					return jarFiles;
				}
			}
		}
		return Collections.emptyList();
	}

	/**
	 * Extracts the aar to the given location and returns all *.jar files
	 *
	 * @param aar The path to the *.aar file
	 * @param destination The folder to which the *.aar file should be extracted
	 * @return The *.jar files contained in the *.aar file
	 * @throws CoreException
	 * @throws IOException
	 */
	static List<IFile> extractAar(final Path aar, final IFolder destination)
			throws CoreException, IOException {
		ZipUtil.unzip(aar, destination.getLocation().toFile().toPath(), name -> name.endsWith(".jar"));
		final List<IFile> jarFiles = new LinkedList<>();
		destination.accept(resource -> {
			if (resource.getType() == IResource.FILE) {
				final var file = ((IFile) resource);
				if ("jar".equalsIgnoreCase(file.getFileExtension())) {
					jarFiles.add(file);
				}
			}
			return true;
		});
		return jarFiles;
	}

}
