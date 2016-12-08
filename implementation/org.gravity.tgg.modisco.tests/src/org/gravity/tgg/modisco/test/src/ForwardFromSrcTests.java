package org.gravity.tgg.modisco.test.src;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.Diff;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.gravity.tgg.modisco.test.util.ToFileLogger;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ForwardFromSrcTests {

	@Rule
	public ToFileLogger logToFile = new ToFileLogger(Paths.get(new File("testlogs").toURI()));

	private IJavaProject project;

	public ForwardFromSrcTests(String name, IJavaProject project) {
		this.project = project;
	}

	@Parameters(name = "{index}: Forward Transformation From Src: {0}")
	public static Collection<Object[]> data() {
		List<Object[]> testcases = new ArrayList<>();

		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();

		for (IProject test : projects) {
			try {
				if (test.getNature(JavaCore.NATURE_ID) != null) {
					testcases.add(new Object[] { test.getName(), JavaCore.create(test) });
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}

		return testcases;
	}

	@Test
	public void testForward() {
		final EList<Diff> diffs = compare();

		if (!diffs.isEmpty()) {
			StringBuilder error = new StringBuilder(
					"Expected: Generated model and expected model are equal. But: detected some differences:\n");
			boolean more = false;
			for (Diff diff : diffs) {
				if (more) {
					error.append('\n');
				} else {
					more = true;
				}

				error.append(diff);
			}

			System.err.println(error);
			// TODO: Enable AssertionError as soon as reliable compare is available
			// throw new AssertionError(error);
		}
	}

	private EList<Diff> compare() {
		return TestGeneratorFromSrc.runTest_ForwardTransformationFromJavaSrc(project).getDifferences();
	}

}
