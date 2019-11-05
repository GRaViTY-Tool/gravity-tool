package org.gravity.eclipse.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.LinkedList;
import java.util.stream.Stream;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Platform;

/**
 *
 * Helpful Utils when working with files
 *
 * @author speldszus
 *
 */
public class FileUtils {

	private static final Logger LOGGER = Logger.getLogger(FileUtils.class);

	private FileUtils() {
		// This class shouldn't be instantiated
	}

	/**
	 * Replaces the line endings with the endings of the current system
	 *
	 * @param file - The file
	 * @return true, if the endings have been replaced successfully
	 * @throws IOException Iff the original file has been lost due to an error
	 */
	public static boolean changeToOSEncoding(File file) throws IOException {
		File tempFile;
		try {
			tempFile = Files.createTempFile("gravity", null).toFile();
			tempFile.deleteOnExit();
		} catch (final IOException e) {
			LOGGER.log(Level.ERROR, "Couldn't create temp file: " + e.getMessage(), e);
			return false;
		}
		try {
			// move the file to a temporary file
			Files.move(file.toPath(), tempFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
			// print all lines to the original location using system encoding
			copy(file, tempFile);
		} catch (final IOException e) {
			LOGGER.log(Level.ERROR, "Replacing line endings of file failed: " + e.getMessage(), e);
			// Try to recover file
			try {
				Files.move(tempFile.toPath(), file.toPath());
			} catch (final IOException e2) {
				// Iff recover wasn't possible throw original error
				throw new IOException("A copy of the orgiginal file is maybe present at: " + tempFile.toString(), e);
			}
			return false;
		}
		// delete the temp file
		try {
			Files.deleteIfExists(tempFile.toPath());
		} catch (final IOException e) {
			/*
			 * As the temporal files will be deleted anyways we currently only log a
			 * warning. However, sensitive data might be leaked this way!
			 */
			LOGGER.log(Level.WARN, "The temporal copy of a file couldn't be deleted: " + e.getMessage(), e);
		}
		return true;
	}

	/**
	 * Copies a file from a source location to a target location using system
	 * specific line endings
	 *
	 * @param source The source file
	 * @param target The target file
	 * @throws IOException If the source file cannot be read or the target file
	 *                     cannot be written
	 */
	public static void copy(File source, File target) throws IOException {
		if (!target.exists() && !target.createNewFile()) {
			throw new IOException("Cannot create file: " + target);
		}
		try (PrintWriter stream = new PrintWriter(new FileWriter(source, true));
				Stream<String> lines = Files.lines(target.toPath());) {
			lines.forEach(s -> {
				stream.println(s);
			});
		}
	}

	/**
	 * Reads the contents from the stream and returns them as single string
	 *
	 * @param stream
	 * @return The contents of the stream as string
	 * @throws IOException if an I/O error occurs.
	 */
	public static String getContentsAsString(InputStream stream) throws IOException {
		final StringBuilder noComments = new StringBuilder();

		int nextInt;
		while ((nextInt = stream.read()) != -1) {
			noComments.append((char) nextInt);
		}
		return noComments.toString();
	}

	/**
	 * Reads the contents from the given file and returns them as single string
	 *
	 * @param file The file containing contents
	 * @return The content of the file
	 * @throws IOException If an I/O error occurs
	 */
	public static String getContentsAsString(File file) throws IOException {
		try (FileInputStream stream = new FileInputStream(file)) {
			return getContentsAsString(stream);
		}
	}

	/**
	 * Extracts an file from this plugin to a temporary file
	 *
	 * @param bundle The plugin id of the bundle from which data should be extracted
	 * @param folder The folder within this plugin
	 * @param file   The file name
	 * @return The location of the extracted file
	 * @throws IOException If reading or writing the file failed
	 */
	public static Path extractToTmpFile(final String bundle, final String folder, final String file)
			throws IOException {
		final URL image = Platform.getBundle(bundle).getEntry(folder + File.separator + file);
		final Path tmp = Files.createTempFile(file, "");
		Files.copy(image.openStream(), tmp, StandardCopyOption.REPLACE_EXISTING);
		tmp.toFile().deleteOnExit();
		return tmp;
	}

	/**
	 * Recursively searches the folder for a file with the given name and returns
	 * the first match
	 *
	 * @param folder   The folder
	 * @param filename The file name
	 * @return The match
	 */
	public static File findRecursive(File folder, String filename) {
		File nextRoot = null;
		final LinkedList<File> queue = new LinkedList<>();
		queue.add(folder);
		while (!queue.isEmpty()) {
			final File tmp = queue.poll();
			final File tmpSubProject = new File(tmp, filename);
			if (tmpSubProject.exists()) {
				nextRoot = tmpSubProject;
				break;
			} else {
				for (final File f : tmp.listFiles()) {
					if (f.isDirectory()) {
						queue.add(f);
					}
				}
			}
		}
		return nextRoot;
	}

	/**
	 * Creates a directory
	 *
	 * @param directoryPath - The path where the file will be created
	 * @return - The new File with the given path
	 */
	public static File createDirectory(String directoryPath) {
		try {
			final File dir = new File(directoryPath);
			if (dir.exists()) {
				return dir;
			}
			if (dir.mkdirs()) {
				return dir;
			}
		} catch (final Exception e) {
			LOGGER.log(Level.ERROR, "Could not create directory " + directoryPath);
			LOGGER.log(Level.ERROR, e.getMessage(), e);
		}
		return null;
	}

	/**
	 * This method recursively deletes a file
	 *
	 * @param file The file
	 * @return true, iff the file has been deleted successfully
	 */
	public static boolean recursiveDelete(File file) {
		boolean success = true;
		if (file.exists()) {
			if (file.isDirectory()) {
				for (final File f : file.listFiles()) {
					if (f.isDirectory()) {
						success &= recursiveDelete(f);
						success &= f.delete();
					} else {
						success &= f.delete();
					}
				}
			}
			success = file.delete();
		}
		return success;
	}

	/**
	 * This method recursively deletes a file
	 *
	 * @param file The file
	 * @return
	 * @return true, iff the file has been deleted successfully
	 */
	public static boolean recursiveDelete(String file) {
		return recursiveDelete(new File(file));
	}
}
