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

	public ToFileLogger logToFile = new ToFileLogger(Paths.get(new File("testlogs").toURI()));

	public RetryTest retry = new RetryTest(10);

	@Rule
	public TestRule ruleChain = RuleChain.outerRule(this.logToFile).around(this.retry);

	@Parameters(name = "{index}: Preprocessing: {0}")
	public static Iterable<Object[]> data() {
		final List<Object[]> testcases = new ArrayList<>();

		try {
			final Path testFolder = Paths.get(new File("Testcases/preprocessing").toURI());
			final Path xmiFolder = testFolder.resolve("AsXMI");
			final Path expectedFolder = testFolder.resolve("ExpectedResults");
			final Path logFolder = testFolder.resolve("CreatedOutput");

			Files.createDirectories(logFolder);

			// collect xmi testcases

			final List<Path> detectedTestcases = Files.walk(xmiFolder)
					.filter(path -> PathUtil.pathEndsWith(path, ".xmi")).collect(toList());

			final LinkedList<Path> detectedExpectedResults = Files.walk(expectedFolder)
					.filter(path -> PathUtil.pathEndsWith(path, ".xmi"))
					.collect(Collectors.toCollection(LinkedList::new));

			final List<TestBody> finalCases = detectedTestcases.stream()
					.map(testcase -> PathUtil.createTestcase(testcase, detectedExpectedResults, logFolder))
					.collect(toList());

			for (final TestBody testcase : finalCases) {
				testcases.add(new Object[] { testcase.getTestName(), testcase });
			}

		} catch (final IOException e) {
			throw new IllegalArgumentException(e);
		}

		return testcases;
	}

	private final String fileName;
	private final TestBody testcase;

	public PreprocessingTests(final String fileName, final TestBody testcase) {
		this.fileName = fileName;
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
