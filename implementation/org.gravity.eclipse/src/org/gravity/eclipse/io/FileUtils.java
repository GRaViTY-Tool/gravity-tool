package org.gravity.eclipse.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.regex.Pattern;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.gravity.eclipse.os.OperationSystem;

/**
 * 
 * Helpful Utils when working with files
 * 
 * @author speldszus
 *
 */
public class FileUtils {

	private static final Logger LOGGER = Logger.getLogger(FileUtils.class);

	/**
	 * Replaces the line endings with the endings of the current system
	 * 
	 * Currently only Windows and Linux are supported
	 * 
	 * @param file - The file
	 * @return true, if the endings have been replaced successfully
	 * @throws IOException - if an I/O error occurs writing to or creating the file,
	 *                     or the text cannot be encoded as UTF-8
	 */
	public static boolean changeToOSEncoding(File file) throws IOException {
		String regex;
		String replacement;
		switch (OperationSystem.os) {
		case WINDOWS:
			regex = "(?<!\\r)\\n";
			replacement = "\\r\\n";
			break;
		case LINUX:
			regex = "\\r\\n?";
			replacement = "\\n";
			break;
		default:
			LOGGER.log(Level.WARN, "WARNING: Lineendings of \"" + file.toString()
					+ "\" haven't been changed due to a unsupported operation sytem.");
			return false;
		}
		Pattern pattern = Pattern.compile(regex);
		List<String> lines = Files.readAllLines(file.toPath());
		file.delete();
		try (FileWriter stream = new FileWriter(file, true)) {
			for (String s : lines) {
				stream.write(pattern.matcher(s).replaceAll(replacement));
			}
		}

		return true;
	}

	/**
	 * Reads the contents from the given file and returns them as single string
	 * 
	 * @param file The file containing contents
	 * @return The content of the file
	 * @throws IOException If an I/O error occurs
	 * @throws FileNotFoundException Iff the file doesn't exists
	 */
	public static String getContentsAsString(File file) throws IOException, FileNotFoundException {
		String settingsContentString;
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
	
			StringBuilder contents = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				contents.append(line);
				contents.append('\n');
			}
			settingsContentString = contents.toString();
		}
		return settingsContentString;
	}
}
