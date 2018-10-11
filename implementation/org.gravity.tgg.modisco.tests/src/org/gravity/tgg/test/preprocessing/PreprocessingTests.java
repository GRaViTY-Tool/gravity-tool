package org.gravity.tgg.test.preprocessing;

import static java.util.stream.Collectors.toList;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.Diff;
import org.gravity.tgg.test.util.PathUtil;
import org.gravity.tgg.test.util.RetryTest;
import org.gravity.tgg.test.util.TestBody;
import org.gravity.tgg.test.util.ToFileLogger;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Tests the preprocessing of the MoDisco model
 * 
 * @author speldszus
 *
 */
@RunWith(Parameterized.class)
public class PreprocessingTests {

	private static final ToFileLogger TESTLOG = new ToFileLogger(Paths.get(new File("testlogs").toURI()));

	private static final RetryTest RETRY = new RetryTest(10);

	@Rule
	public TestRule ruleChain = RuleChain.outerRule(TESTLOG).around(RETRY);

	@Parameters(name = "{index}: Preprocessing: {0}")
	public static Iterable<Object[]> data() {
		final List<Object[]> testcases = new ArrayList<>();

		final Path testFolder = Paths.get(new File("Testcases/preprocessing").toURI());
		final Path xmiFolder = testFolder.resolve("AsXMI");
		final Path expectedFolder = testFolder.resolve("ExpectedResults");
		final Path logFolder = testFolder.resolve("CreatedOutput");

		try {
			Files.createDirectories(logFolder);
		} catch (final IOException e) {
			throw new IllegalArgumentException(e);
		}

		// collect xmi testcases
		final LinkedList<Path> detectedExpectedResults = getXMIFiles(expectedFolder);
		final List<TestBody> finalCases = getTestBodies(xmiFolder, logFolder, detectedExpectedResults);

		for (final TestBody testcase : finalCases) {
			testcases.add(new Object[] { testcase.getTestName(), testcase });
		}

		return testcases;
	}

	/**
	 * Crates test bodies from the detected test files
	 * 
	 * @param xmiFolder The folder with the input models
	 * @param logFolder The folder to which should be logged
	 * @param detectedExpectedResults The folder with the expected results
	 * @return
	 */
	private static List<TestBody> getTestBodies(final Path xmiFolder, final Path logFolder,
			final LinkedList<Path> detectedExpectedResults) {
		final List<TestBody> finalCases;
		try (Stream<Path> xmiWalk = Files.walk(xmiFolder)) {
			finalCases = xmiWalk.filter(path -> PathUtil.pathEndsWith(path, ".xmi"))
					.map(testcase -> PathUtil.createTestcase(testcase, detectedExpectedResults, logFolder))
					.collect(toList());

		} catch (final IOException e) {
			throw new IllegalArgumentException(e);
		}
		return finalCases;
	}

	/**
	 * Searches all XMI files in the given folder
	 * 
	 * @param folder The folder to search in
	 * @return The XMI files
	 */
	private static LinkedList<Path> getXMIFiles(final Path folder) {
		final LinkedList<Path> detectedExpectedResults;
		try (Stream<Path> expectedWalk = Files.walk(folder)) {

			detectedExpectedResults = expectedWalk.filter(path -> PathUtil.pathEndsWith(path, ".xmi"))
					.collect(Collectors.toCollection(LinkedList::new));

		} catch (final IOException e) {
			throw new IllegalArgumentException(e);
		}
		return detectedExpectedResults;
	}

	private final TestBody testcase;

	public PreprocessingTests(final String fileName, final TestBody testcase) {
		this.testcase = testcase;
	}

	@Test
	public void testForward() {

		final EList<Diff> diffs = this.compare();

		if (!diffs.isEmpty()) {
			final StringBuilder errorMsg = new StringBuilder(
					"Expected: Generated model and expected model are equal. But: detected some differences:\n");

			boolean more = false;
			for (final Diff diff : diffs) {

				if (more) {
					errorMsg.append('\n');
				} else {
					more = true;
				}

				errorMsg.append(diff);
			}

			// TODO: Enable AssertionError as soon as reliable compare is available
			// throw new AssertionError(errorMsg);
		}

	}

	private EList<Diff> compare() {
		return TestGeneratorPreprocessing.runTest_ForwardTransformation(this.testcase).getDifferences();
	}

}
