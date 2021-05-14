package org.gravity.eclipse.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
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
public final class ZipUtil {

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
	public static IFile extractZipEntry(final ZipInputStream stream, final IFile destination, final IProgressMonitor monitor)
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
		final Path destination = Paths.get(unzipLocation).normalize();
		if (!destination.toFile().exists()) {
			try {
				Files.createDirectories(destination);
			} catch (final IOException e) {

				LOGGER.log(Level.ERROR, e.getMessage(), e);
			}
		}
		try (ZipInputStream zipInputStream = new ZipInputStream(Files.newInputStream(Paths.get(zipFilePath)))) {
			ZipEntry entry;
			while ((entry = zipInputStream.getNextEntry()) != null) {

				final File filePath = new File(destination.toFile(), entry.getName());
				if(!filePath.getCanonicalPath().startsWith(unzipLocation)){
					throw new SecurityException("Entry is trying to leave the target dir: " + entry.getName());
				}
				if (!entry.isDirectory()) {
					unzipFiles(zipInputStream, filePath.toPath());
				} else {
					Files.createDirectories(filePath.toPath());
				}
				zipInputStream.closeEntry();
			}
		} catch (final Exception e) {
			LOGGER.log(Level.ERROR, e.getMessage(), e);
		}
	}

	public static void unzipFiles(final ZipInputStream zipInputStream, final Path unzipFilePath) {
		try (BufferedOutputStream bos = new BufferedOutputStream(Files.newOutputStream(unzipFilePath))) {
			final byte[] bytesIn = new byte[1024];
			int read = 0;
			while ((read = zipInputStream.read(bytesIn)) != -1) {
				bos.write(bytesIn, 0, read);
			}
		} catch (final Exception e) {
			LOGGER.log(Level.ERROR, e.getMessage(), e);
		}
	}
}
