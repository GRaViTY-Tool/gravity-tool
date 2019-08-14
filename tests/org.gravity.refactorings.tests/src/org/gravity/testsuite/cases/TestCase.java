package org.gravity.testsuite.cases;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestCase {

	private static final Logger LOGGER = Logger.getLogger(TestCase.class);
	private Pair data;

	public TestCase(Pair data) {
		this.setData(data);
	}

	@Parameters
	public static Collection<Pair> data() throws IOException, CoreException {
		Collection<Pair> data = new ArrayList<>();

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		java.nio.file.Path testWorkspace = root.getLocation().toFile().toPath();
		java.nio.file.Path dataWorkspace = root.getLocation().removeLastSegments(1).append("data_workspace").toFile() //$NON-NLS-1$
				.toPath();
		Files.walkFileTree(dataWorkspace, new SimpleFileVisitor<java.nio.file.Path>() {
			@Override
			public FileVisitResult preVisitDirectory(final java.nio.file.Path dir, final BasicFileAttributes attrs)
					throws IOException {
				if (dir.endsWith(".metadata")) { //$NON-NLS-1$
					return FileVisitResult.SKIP_SUBTREE;
				}
				Files.createDirectories(testWorkspace.resolve(dataWorkspace.relativize(dir)));
				return FileVisitResult.CONTINUE;
			}

			@Override
			public FileVisitResult visitFile(final java.nio.file.Path file, final BasicFileAttributes attrs)
					throws IOException {
				java.nio.file.Path target = Files.copy(file, testWorkspace.resolve(dataWorkspace.relativize(file)));
				if (target.endsWith(".project")) { //$NON-NLS-1$
					try {
						IProjectDescription description = ResourcesPlugin.getWorkspace()
								.loadProjectDescription(new Path(target.toString()));
						IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(description.getName());
						project.create(description, null);
						project.open(null);
					} catch (CoreException e) {
						LOGGER.error(e);
					}
				}
				return FileVisitResult.CONTINUE;
			}
		});

		for (IProject p : root.getProjects()) {
			if (p.getName().startsWith("__TestProject")) { //$NON-NLS-1$
				IJavaProject javaProject = JavaCore.create(p);

				IFolder arteFolder = p.getFolder("arte"); //$NON-NLS-1$
				p.refreshLocal(IResource.DEPTH_INFINITE, null);
				if (!arteFolder.exists()) {
					arteFolder.create(true, true, null);
				}
				for (IResource res : arteFolder.members()) {
					String file_extension = res.getFileExtension();
					if (res.getType() == IResource.FILE
							&& ("arte".equals(file_extension) || "ttc".equals(file_extension))) { //$NON-NLS-1$ //$NON-NLS-2$
						// TODO: Convert to classical JUnit tests

//						Test_File test_file = arte.getTest_case_util().parseTestCase((IFile) res);
//						EList<Test_Case> test_cases = test_file.getTest_cases();
//						for (Test_Case test_case : test_cases) {
//							data.add(new Pair(test_case, java_project));
//						}
					}
				}
			}
		}
		return data;
	}

	@Test
	public void test() {
		// TODO: Implement tests as classical JUnit tests

//		LOGGER.log( Level.INFO, "Start GRaViTY Test ***"); //$NON-NLS-1$
//		Pair test_data = getData();
//		boolean test_result = arte.getTest_execution().executeTestCase(test_data.getJavaProject(),
//				test_data.getTestCase());
//		if (!test_result) {
//			// Retry due to moflon parallel streams bug
//			test_result = arte.getTest_execution().executeTestCase(test_data.getJavaProject(), test_data.getTestCase());
//		}
//		assertTrue(test_result);
//		LOGGER.log( Level.INFO, "*** End Test"); //$NON-NLS-1$
	}

	@After
	public void after() {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		try {
			workspace.delete(root.members(), true, null);
		} catch (CoreException e) {
			LOGGER.error(e);
		}
		try {
			root.refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {
			LOGGER.error(e);
		}
	}

	public Pair getData() {
		return this.data;
	}

	public void setData(Pair data) {
		this.data = data;
	}

	private static class Pair {
//		private IJavaProject project;
//		private Test_Case test_case;
//
//		Pair(Test_Case test_case, IJavaProject project) {
//			this.test_case = test_case;
//			this.project = project;
//		}
//
//		IJavaProject getJavaProject() {
//			return this.project;
//		}
//
//		Test_Case getTestCase() {
//			return this.test_case;
//		}
	}
}
