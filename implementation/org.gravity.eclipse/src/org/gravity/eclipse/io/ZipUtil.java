package org.gravity.eclipse.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;

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
		final var destination = Paths.get(unzipLocation).normalize();
		try (var zipInputStream = new ZipInputStream(Files.newInputStream(Paths.get(zipFilePath)))) {
			unzip(zipInputStream, destination);
		} catch (final Exception e) {
			LOGGER.log(Level.ERROR, e.getMessage(), e);
		}
	}

	public static void unzip(final ZipInputStream zipInputStream, final Path unzipLocation) throws IOException {
		if (!unzipLocation.toFile().exists()) {
			try {
				Files.createDirectories(unzipLocation);
			} catch (final IOException e) {

				LOGGER.log(Level.ERROR, e.getMessage(), e);
			}
		}

		ZipEntry entry;
		while ((entry = zipInputStream.getNextEntry()) != null) {

			final var filePath = new File(unzipLocation.toFile(), entry.getName());
			if(!filePath.getCanonicalPath().startsWith(unzipLocation.toString())){
				throw new SecurityException("Entry is trying to leave the target dir: " + entry.getName());
			}
			if (!entry.isDirectory()) {
				unzipFiles(zipInputStream, filePath.toPath());
			} else {
				Files.createDirectories(filePath.toPath());
			}
			zipInputStream.closeEntry();
		}
	}

	public static void unzipFiles(final ZipInputStream zipInputStream, final Path unzipFilePath) {
		try (var bos = new BufferedOutputStream(Files.newOutputStream(unzipFilePath))) {
			final var bytesIn = new byte[1024];
			var read = 0;
			while ((read = zipInputStream.read(bytesIn)) != -1) {
				bos.write(bytesIn, 0, read);
			}
		} catch (final Exception e) {
			LOGGER.log(Level.ERROR, e.getMessage(), e);
		}
	}

	/**
	 * Compresses a Java project into a zip file
	 *
	 * @param project The Java project
	 * @param zip The output file
	 * @throws IOException
	 */
	public static void zipProject(final IJavaProject project, final File zip) throws IOException {
		Path outPath = null;
		try {
			final var out = project.getOutputLocation();
			if(out != null) {
				outPath = out.toFile().toPath();
			}
		} catch (final JavaModelException e) {
			LOGGER.error("Binaries might be included in ZIP",e);
		}
		final var ignore = outPath;
		final var root = project.getProject().getLocation().toFile().toPath();
		try(var stream = new ZipOutputStream(new FileOutputStream(zip))){
			Files.walkFileTree(root, new SimpleFileVisitor<Path>() {
				@Override
				public FileVisitResult visitFile(final Path file, final BasicFileAttributes attrs) throws IOException {
					if(file.startsWith(ignore)) {
						return FileVisitResult.SKIP_SUBTREE;
					}
					stream.putNextEntry(new ZipEntry(root.relativize(file).toString()));
					Files.copy(file, stream);
					stream.closeEntry();
					return FileVisitResult.CONTINUE;
				}
			});
		}
	}
}
