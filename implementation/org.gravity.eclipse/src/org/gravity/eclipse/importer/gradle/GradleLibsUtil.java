package org.gravity.eclipse.importer.gradle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.gravity.eclipse.io.ZipUtil;


/**
 * Useful functionalities for handling libs of gradle projects
 * 
 * @author speldszus
 *
 */
public class GradleLibsUtil {
	
	private GradleLibsUtil() {
		// This class shouldn't be instantiated
	}

	static List<IFile> extractAar(Path pathToAar, IFolder destinationFolder, IProgressMonitor monitor)
			throws IOException, CoreException {
		String libName = pathToAar.getFileName().toString();
		List<IFile> extractedJarFiles = new LinkedList<>();
		try (ZipInputStream zipStream = new ZipInputStream(new FileInputStream(pathToAar.toFile()))) {
			boolean copy = false;
			ZipEntry entry;
			while ((entry = zipStream.getNextEntry()) != null) {
				String name = entry.getName();
				if (copy) {
					if (entry.isDirectory()) {
						copy = false;
					} else {
						IFile extractedJarFile = destinationFolder
								.getFile(name.substring(name.lastIndexOf('/') + 1, name.length()));
						if (!extractedJarFile.exists()) {
							extractedJarFiles.add(ZipUtil.extractZipEntry(zipStream, extractedJarFile, monitor));
						}
					}
	
				} else {
					if (entry.isDirectory() && "libs/".equals(name)) {
						copy = true;
					} else if ("classes.jar".equals(name)) {
						IFile extractedJarFile = destinationFolder
								.getFile(libName.substring(0, libName.length() - "aar".length()) + "jar");
						if (!extractedJarFile.exists()) {
							extractedJarFiles.add(ZipUtil.extractZipEntry(zipStream, extractedJarFile, monitor));
						}
					}
				}
			}
		}
		return extractedJarFiles;
	}

	/**
	 * 
	 * Searches a other version of a lib. This method should only be used if an
	 * exact version match hasn't been found before!
	 * 
	 * @param libName   The name of the lib
	 * @param libFolder The folder to which the lib should be linked or copied
	 * @param libPath   The path to the not existing exact version match
	 * @param jarFiles  The found files
	 * @param monitor   A progress monitor
	 * @return The found files
	 * @throws IOException
	 * @throws CoreException
	 * @throws FileNotFoundException
	 */
	static List<IFile> searchOtherVersionOfAarLib(String libName, IFolder libFolder, Path libPath, List<IFile> jarFiles,
			IProgressMonitor monitor) throws IOException, CoreException {
		File currentVersion = libPath.getParent().toFile();
		List<File> otherVersions = Arrays.asList(currentVersion.getParentFile().listFiles());
		otherVersions.sort(new Comparator<File>() {
	
			@Override
			public int compare(File o1, File o2) {
				return o1.getName().compareTo(o2.getName());
			}
	
		});
		for (int i = otherVersions.indexOf(currentVersion) - 1; i > 0; i--) {
			File tmpFolder = otherVersions.get(i);
			File tmpFile = new File(tmpFolder,
					libName.replace(currentVersion.getName(), tmpFolder.getName()));
			if (tmpFile.exists()) {
				jarFiles = extractAar(tmpFile.toPath(), libFolder, monitor);
				if (!jarFiles.isEmpty()) {
					break;
				}
			}
		}
		return jarFiles;
	}

}
