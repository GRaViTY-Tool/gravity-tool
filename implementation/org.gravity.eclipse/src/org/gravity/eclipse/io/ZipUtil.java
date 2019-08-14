package org.gravity.eclipse.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * Helpful functionality when working with zip archives
 * 
 * @author speldszus
 *
 */
public class ZipUtil {

	/**
	 * The logger of this class
	 */
	private static final Logger LOGGER = Logger.getLogger(ZipUtil.class);

	private ZipUtil() {
		// This class shouldn't be instantiated
	}

	/**
	 * Extracts a zip stream to the given location
	 * 
	 * @param stream      The zip stream
	 * @param destination The destination
	 * @param monitor     A progress monitor
	 * @return The destination
	 * @throws CoreException @see
	 *                       org.eclipse.core.resources.IFile.create(InputStream
	 *                       source, boolean force, IProgressMonitor monitor)
	 */
	public static IFile extractZipEntry(ZipInputStream stream, IFile destination, IProgressMonitor monitor)
			throws CoreException {
		destination.create(new BufferedInputStream(stream) {
			@Override
			public void close() throws IOException {
				// disable close
			}
		}, true, monitor);
		return destination;
	}

	/**
	 * Unzips a zip file to a given location
	 * 
	 * @param zipFilePath   - The path of the ZIP file
	 * @param unzipLocation - The location to be unzipped
	 */
	public static void unzip(final String zipFilePath, final String unzipLocation) {
		Path destination = Paths.get(unzipLocation).normalize();
		if (!(Files.exists(destination))) {
			try {
				Files.createDirectories(destination);
			} catch (IOException e) {

				LOGGER.log(Level.ERROR, e.getMessage(), e);
			}
		}
		try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFilePath))) {
			ZipEntry entry;
			while ((entry = zipInputStream.getNextEntry()) != null) {
				Path filePath = Paths.get(unzipLocation, entry.getName());
				if(!filePath.normalize().startsWith(destination)) {
					throw new SecurityException("Entry is trying to leave the target dir: " + entry.getName());
				}
				if (!entry.isDirectory()) {
					unzipFiles(zipInputStream, filePath);
				} else {
					Files.createDirectories(filePath);
				}
				zipInputStream.closeEntry();
			}
		} catch (Exception e) {
			LOGGER.log(Level.ERROR, e.getMessage(), e);
		}
	}

	public static void unzipFiles(final ZipInputStream zipInputStream, final Path unzipFilePath) {
		try (BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(unzipFilePath.toAbsolutePath().toString()))) {
			byte[] bytesIn = new byte[1024];
			int read = 0;
			while ((read = zipInputStream.read(bytesIn)) != -1) {
				bos.write(bytesIn, 0, read);
			}
		} catch (Exception e) {
			LOGGER.log(Level.ERROR, e.getMessage(), e);
		}
	}
}
