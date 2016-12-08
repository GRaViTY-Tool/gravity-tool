package org.gravity.tgg.modisco.test.util;

import java.nio.file.Path;
import java.util.Iterator;
import java.util.LinkedList;

public class PathUtil {

	public static String getFileName(final Path path) {
		return path	.getFileName()
					.toString();
	}

	public static String getFileExtension(final String fileName) {
		final int last = fileName.lastIndexOf(".") + 1;
		if (last == 0 || fileName.length() <= last) {
			return "";
		}
		return fileName.substring(last);
	}

	public static String getFileExtension(final Path path) {
		return getFileExtension(getFileName(path));
	}

	public static boolean pathEndsWith(final Path path, final String expected) {
		return getFileName(path).endsWith(expected);
	}

	public static String getTestName(final String fileName) {
		return fileName.substring(0, fileName.lastIndexOf("."));
	}

	public static Path findExpectedResultForTestcase(final Path testcase, final LinkedList<Path> expectedResults) {
		final String fileName = getFileName(testcase);

		final Iterator<Path> it = expectedResults.iterator();
		while (it.hasNext()) {
			final Path result = it.next();
			if (fileName.equalsIgnoreCase(getFileName(result))) {
				it.remove();
				return result;
			}
		}

		return null;
	}

	public static TestBody createTestcase(final Path testcase, final LinkedList<Path> expectedResults,
			final Path logFolder) {
		final Path testResult = findExpectedResultForTestcase(testcase, expectedResults);
		return createTestcase(testcase, testResult, logFolder);
	}

	public static TestBody createTestcase(final Path testcase, final Path testResult, final Path logFolder) {
		final String testName = getTestName(getFileName(testcase));
		return new TestBody(testName, testcase, testResult, logFolder);
	}

}
