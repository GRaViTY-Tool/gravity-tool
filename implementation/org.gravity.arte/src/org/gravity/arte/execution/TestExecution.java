package org.gravity.arte.execution;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.IStreamListener;
import org.eclipse.debug.core.model.IStreamMonitor;
import org.eclipse.debug.core.model.IStreamsProxy;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.gravity.arte.Messages;
import org.gravity.arte.testdsl.arteLanguage.Assert_False;
import org.gravity.arte.testdsl.arteLanguage.Assert_True;
import org.gravity.arte.testdsl.arteLanguage.Assertion;
import org.gravity.arte.testdsl.arteLanguage.Class_Element;
import org.gravity.arte.testdsl.arteLanguage.Compile;
import org.gravity.arte.testdsl.arteLanguage.Condition;
import org.gravity.arte.testdsl.arteLanguage.Containment;
import org.gravity.arte.testdsl.arteLanguage.Contains;
import org.gravity.arte.testdsl.arteLanguage.Contains_Not;
import org.gravity.arte.testdsl.arteLanguage.Create_Superclass_Refactoring;
import org.gravity.arte.testdsl.arteLanguage.Expect_False;
import org.gravity.arte.testdsl.arteLanguage.Expect_True;
import org.gravity.arte.testdsl.arteLanguage.Extract_Superclass_Refactoring;
import org.gravity.arte.testdsl.arteLanguage.Implementation;
import org.gravity.arte.testdsl.arteLanguage.Implements;
import org.gravity.arte.testdsl.arteLanguage.Implements_Not;
import org.gravity.arte.testdsl.arteLanguage.Java_Class;
import org.gravity.arte.testdsl.arteLanguage.Java_Field;
import org.gravity.arte.testdsl.arteLanguage.Java_Method;
import org.gravity.arte.testdsl.arteLanguage.Pull_Up_Field_Refactoring;
import org.gravity.arte.testdsl.arteLanguage.Pull_Up_Method_Refactoring;
import org.gravity.arte.testdsl.arteLanguage.Refactoring;
import org.gravity.arte.testdsl.arteLanguage.Synchronize;
import org.gravity.arte.testdsl.arteLanguage.Test_Case;
import org.gravity.arte.testdsl.arteLanguage.Test_Step;
import org.gravity.arte.testdsl.arteLanguage.Test_Step_Element;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.refactorings.Changes;
import org.gravity.refactorings.application.RefactoringTool;
import org.gravity.typegraph.basic.TypeGraph;

public class TestExecution {

	private Execution_Status status;
	private Hashtable<String, Test_Status> test_record;
	private Timer timer;
	private IPGConverter gravity;
	private RefactoringTool refactoring_tool;

	private IJavaProject out_project;

	public TestExecution(Timer timer) {
		this.timer = timer;

		test_record = new Hashtable<String, Test_Status>();

		status = Execution_Status.Changed;
	}

	public boolean executeTestCase(IJavaProject project, Test_Case test_case) {
		timer = new Timer();

		if (!project.exists()) {
			return false;
		} else {

			test_record.put(test_case.getName(), Test_Status.SUCCESS);

			IProject tmp = project.getProject().getWorkspace().getRoot().getProject("tmp_project"); //$NON-NLS-1$
			if (tmp != null && tmp.exists()) {
				try {
					tmp.delete(true, null);
				} catch (CoreException e) {
					e.printStackTrace();
					return false;
				}
			}
			try {
				project.getProject().copy(new Path("tmp_project"), true, null); //$NON-NLS-1$
			} catch (CoreException e2) {
				e2.printStackTrace();
				return false;
			}
			out_project = JavaCore.create(project.getProject().getWorkspace().getRoot().getProject("tmp_project")); //$NON-NLS-1$

			try {
				out_project.getProject().build(IncrementalProjectBuilder.FULL_BUILD, null);

				try {
					String store_output = executeJavaProgram(out_project, test_case.getJava_program());

					// Generate TypeGraph
					System.out.println(Messages.getString("ascii.line.s.pg")); //$NON-NLS-1$
					gravity = GravityActivator.getDefault().getConverter(out_project.getProject());
					timer.start();
					boolean success = gravity.convertProject(out_project, new NullProgressMonitor());
					timer.pause();
					System.out.println(Messages.getString("ascii.line.s")); //$NON-NLS-1$

					if (success) {
						TypeGraph pg = gravity.getPG();
						refactoring_tool = new RefactoringTool(pg, true);
						Test_Status test_status = Test_Status.SUCCESS;

						// Process all test steps
						for (Test_Step_Element step : test_case.getTest_flow().getStep()) {
							test_status = test_status.getApplicationOf(handleTestStepElement(step, out_project));
							if (Test_Status.FAILURE == test_status) {
								break;
							}
						}

						// If the changes haven't been synchronized sync them
						if (!status.isCompatible(Execution_Status.Synchronized)) {
							System.out.println(Messages.getString("ascii.line.s.sync")); //$NON-NLS-1$
							boolean synchronizeChanges = sync(out_project);
							System.out.println(Messages.getString("ascii.line.s")); //$NON-NLS-1$
							if (!synchronizeChanges) {
								test_record.put(test_case.getName(),
										test_status = test_status.getApplicationOf(Test_Status.FAILURE));
								System.out.println(Messages.getString("fail")); //$NON-NLS-1$
								System.out.println(Messages.getString("fail.sync")); //$NON-NLS-1$
								try {
									out_project.getProject().delete(true, null);
								} catch (CoreException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								return false;
							} else {
								status = Execution_Status.Synchronized;
							}
						}

						// If the program isn't still compiled, compile it
						if (!status.isCompatible(Execution_Status.Compiled)) {
							if (!compileJavaprogram(out_project)) {
								System.out.println((Messages.getString("error") + Messages //$NON-NLS-1$
										.getString("error.compilation", new Object[] { test_case.getJava_program() }))); //$NON-NLS-1$
								test_record.put(test_case.getName(),
										test_status = test_status.getApplicationOf(Test_Status.FAILURE));
								try {
									out_project.getProject().delete(true, null);
								} catch (CoreException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								return false;
							}
						}

						// Execute program and compare console output with
						// records
						String new_output = executeJavaProgram(out_project, test_case.getJava_program());

						if (store_output.length() == new_output.length() && store_output.compareTo(new_output) == 0) {
							System.out.print(Messages.getString("success")); //$NON-NLS-1$
							System.out.println(Messages.getString("success.out.eq")); //$NON-NLS-1$
						} else {
							test_record.put(test_case.getName(),
									test_status = test_status.getApplicationOf(Test_Status.FAILURE));
							System.out.println(Messages.getString("fail")); //$NON-NLS-1$
							System.out.println(Messages.getString("fail.change.behav")); //$NON-NLS-1$
							try {
								out_project.getProject().delete(true, null);
							} catch (CoreException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							return false;
						}

						test_record.put(test_case.getName(),
								test_status = test_status.getApplicationOf(Test_Status.SUCCESS));
						try {
							out_project.getProject().delete(true, null);
						} catch (CoreException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						return test_status != Test_Status.FAILURE;

					} else {
						test_record.put(test_case.getName(),
								test_record.get(test_case.getName()).getApplicationOf(Test_Status.FAILURE));
						System.out.print(Messages.getString("fail")); //$NON-NLS-1$
						System.out.println(Messages.getString("fail.pg")); //$NON-NLS-1$
						try {
							out_project.getProject().delete(true, null);
						} catch (CoreException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						return false;
					}
				} catch (CoreException e) {
					test_record.put(test_case.getName(),
							test_record.get(test_case.getName()).getApplicationOf(Test_Status.FAILURE));
					System.out.println((Messages.getString("error") + Messages.getString("fail.run"))); //$NON-NLS-1$ //$NON-NLS-2$
					out_project.getProject().delete(true, null);
					return false;
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (NoConverterRegisteredException e1) {
					e1.printStackTrace();
				}
			} catch (CoreException e) {
				test_record.put(test_case.getName(),
						test_record.get(test_case.getName()).getApplicationOf(Test_Status.FAILURE));
				try {
					if (out_project != null) {
						out_project.getProject().delete(true, null);
					}
				} catch (CoreException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				return false;
			}
		}
		return false;
	}

	private Test_Status handleTestStepElement(Test_Step_Element step, IJavaProject java_program)
			throws JavaModelException {
		Test_Status test_status = Test_Status.SUCCESS;
		if (step instanceof Test_Step) {
			for (Test_Step_Element element : ((Test_Step) step).getElements()) {
				test_status = test_status.getApplicationOf(handleTestStepElement(element, java_program));
				if (Test_Status.FAILURE == test_status) {
					return test_status;
				}
			}
		} else if (step instanceof Assertion) {
			test_status = test_status.getApplicationOf(handleAssertion((Assertion) step));
		} else if (step instanceof Containment) {
			test_status = test_status.getApplicationOf(handleContainment(java_program, (Containment) step));
		} else if (step instanceof Implementation) {
			test_status = test_status.getApplicationOf(handleImplementation(java_program, (Implementation) step));
		} else if (step instanceof Condition) {
			test_status = test_status.getApplicationOf(handleCondition(java_program, (Condition) step));
		} 
		/*
		 * else if(step instanceof Propose_Refactoring){ test_status =
		 * test_status.getApplicationOf(handleProposal(java_program,
		 * (Propose_Refactoring) step)); }
		 */
		else if (step instanceof Synchronize) {
			System.out.println(Messages.getString("ascii.line.s.sync")); //$NON-NLS-1$
			boolean synchronizeChanges = sync(out_project);
			System.out.println(Messages.getString("ascii.line.s")); //$NON-NLS-1$
			if (!synchronizeChanges) {
				System.out.println(Messages.getString("fail")); //$NON-NLS-1$
				System.out.println(Messages.getString("fail.sync")); //$NON-NLS-1$
				return Test_Status.FAILURE;
			} else {
				status = Execution_Status.Synchronized;
				return test_status;
			}
		} else if (step instanceof Compile) {
			if (compileJavaprogram(out_project)) {
				return test_status;
			} else {
				return Test_Status.FAILURE;
			}
		} else {
			System.out.println((Messages.getString("error") //$NON-NLS-1$
					+ Messages.getString("error.unknown", new String[] { Messages.getString("tse_s") }))); //$NON-NLS-1$ //$NON-NLS-2$
			return Test_Status.FAILURE;
		}
		return test_status;
	}

	private Test_Status handleImplementation(IJavaProject java_program, Implementation implementation)
			throws JavaModelException {

		boolean implementation_expected;
		if (implementation instanceof Implements) {
			implementation_expected = true;
		} else if (implementation instanceof Implements_Not) {
			implementation_expected = false;
		} else {
			System.out.println((Messages.getString("error") + Messages.getString("error.u.impl"))); //$NON-NLS-1$ //$NON-NLS-2$
			return Test_Status.FAILURE;
		}

		// if(!status.isCompatible(Execution_Status.Synchronized)){
		// if(arte.timer.extended_case){
		// boolean synchronizeChanges;
		// System.out.println(Messages.getString("ascii.line.s.sync"));
		// //$NON-NLS-1$
		// synchronizeChanges = arte.timer.synchronizeChanges();
		// System.out.println(Messages.getString("ascii.line.s")); //$NON-NLS-1$
		// if(synchronizeChanges){
		// status = Execution_Status.Synchronized;
		// }
		// else{
		// log.print_red(Messages.getString("fail")+Messages.getString("fail.sync"));
		// //$NON-NLS-1$ //$NON-NLS-2$
		// return Test_Status.FAILURE;
		// }
		// }
		// }

		if (!status.isCompatible(Execution_Status.Compiled)) {
			if (!compileJavaprogram(java_program)) {
				return Test_Status.FAILURE;
			}
		}

		Java_Class child_class = implementation.getChild();
		try {
			String expected_class_name = child_class.getClass_name();
			IPath project_location = java_program.getProject().getLocation();
			IPath output_location = java_program.getOutputLocation();
			IPath absolute_output_location = project_location.removeLastSegments(1).append(output_location);
			URLClassLoader ucl = new URLClassLoader(new URL[] { absolute_output_location.toFile().toURI().toURL() });
			Class<?> child_class_instance = ucl.loadClass(child_class.getPackage() + "." + expected_class_name); //$NON-NLS-1$
			Java_Class parent_class = implementation.getParent();

			Class<?> parent_class_instance = child_class_instance.getSuperclass();

			Package package_instance = parent_class_instance.getPackage();
			String instance_package_name = package_instance.getName();

			String instance_name = parent_class_instance.getSimpleName().replaceAll(instance_package_name + ".", ""); //$NON-NLS-1$ //$NON-NLS-2$
			String expected_name = parent_class.getClass_name();
			boolean implement = instance_name.compareTo(expected_name) == 0;
			String expected_package_name = parent_class.getPackage();
			implement &= expected_package_name.compareTo(instance_package_name) == 0;
			if (implement != implementation_expected) {
				if (implementation_expected) {
					System.out.print(Messages.getString("fail")); //$NON-NLS-1$
					System.out.println(Messages.getString("impl.e.fn", //$NON-NLS-1$
							new String[] { expected_package_name + "." + expected_name, //$NON-NLS-1$
									instance_package_name + "." + instance_name })); //$NON-NLS-1$
				} else {
					System.out.println(Messages.getString("fail")); //$NON-NLS-1$
					System.out.println(Messages.getString("impl.e.fp", new String[] { //$NON-NLS-1$
							expected_package_name + "." + expected_name })); //$NON-NLS-1$
				}
				ucl.close();
				return Test_Status.FAILURE;
			}
			ucl.close();
			return Test_Status.SUCCESS;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Test_Status.FAILURE;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Test_Status.FAILURE;
		}
	}

	private Test_Status handleCondition(IJavaProject java_program, Condition condition) throws JavaModelException {
		Test_Status test_status = Test_Status.SUCCESS;
		if (handleRefactoring(condition.getRefactoring())) {
			if (condition.getWarning() != null) {
				if (condition instanceof Expect_False) {
					System.out.println(Messages.getString("warn")); //$NON-NLS-1$
					System.out.println(condition.getWarning().getMessage());
				}
			}

			for (Test_Step_Element step : condition.getTrue_steps()) {
				test_status = test_status.getApplicationOf(handleTestStepElement(step, java_program));
				if (test_status == Test_Status.FAILURE) {
					return test_status;
				}
			}
		} else {
			if (condition.getWarning() != null) {
				if (condition instanceof Expect_True) {
					System.out.println(Messages.getString("warn")); //$NON-NLS-1$
					System.out.println(condition.getWarning().getMessage());
				}
			}

			for (Test_Step_Element step : condition.getFalse_steps()) {
				test_status = test_status.getApplicationOf(handleTestStepElement(step, java_program));
				if (test_status == Test_Status.FAILURE) {
					return test_status;
				}
			}
		}
		return test_status;
	}

	private Test_Status handleContainment(IJavaProject java_program, Containment containment)
			throws JavaModelException {

		boolean containment_expected;
		if (containment instanceof Contains) {
			containment_expected = true;
		} else if (containment instanceof Contains_Not) {
			containment_expected = false;
		} else {
			System.out.println((Messages.getString("error") + Messages.getString("u.cont"))); //$NON-NLS-1$ //$NON-NLS-2$
			return Test_Status.FAILURE;
		}

		if (!status.isCompatible(Execution_Status.Compiled)) {
			try {
				NullProgressMonitor monitor = new NullProgressMonitor();
				out_project.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
				while (!out_project.getProject().isSynchronized(IResource.DEPTH_INFINITE)) {
					wait(10);
				}
			} catch (CoreException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (!compileJavaprogram(out_project)) {
				return Test_Status.FAILURE;
			}
		}

		Java_Class expected_class = containment.getClass_();
		try {
			String expected_class_name = expected_class.getClass_name();
			IPath bin = java_program.getProject().getWorkspace().getRoot().getLocation()
					.append(java_program.getOutputLocation());
			URLClassLoader ucl = new URLClassLoader(new URL[] { bin.toFile().toURI().toURL() });
			Class<?> class_instance = ucl.loadClass(expected_class.getPackage() + "." + expected_class_name); //$NON-NLS-1$
			Class_Element element = containment.getContains();

			boolean contains;
			if (element instanceof Java_Method) {
				contains = isMethodContainedInClass(class_instance, (Java_Method) element);
			} else if (element instanceof Java_Field) {
				contains = isFieldContainedInClass(class_instance, (Java_Field) element);
			} else {
				System.out.println((Messages.getString(Messages.getString("error") + Messages.getString("u.je")))); //$NON-NLS-1$ //$NON-NLS-2$
				ucl.close();
				return Test_Status.FAILURE;
			}
			if (contains != containment_expected) {
				if (containment_expected) {
					System.out.print(Messages.getString("fail")); //$NON-NLS-1$
					System.out.println(Messages.getString("cont.e.fn")); //$NON-NLS-1$
				} else {
					System.out.print(Messages.getString("fail")); //$NON-NLS-1$
					System.out.println(Messages.getString("cont.e.fp")); //$NON-NLS-1$
				}
				ucl.close();
				return Test_Status.FAILURE;
			} else {
				ucl.close();
				System.out.println(Messages.getString("success")); //$NON-NLS-1$
				System.out.println(Messages.getString("success.cont")); //$NON-NLS-1$
				return Test_Status.SUCCESS;
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.print(Messages.getString("fail")); //$NON-NLS-1$
			System.out.println(Messages.getString("fail.class", //$NON-NLS-1$
					new String[] { expected_class.getPackage() + "." + expected_class.getClass_name() })); //$NON-NLS-1$
		}

		return Test_Status.FAILURE;
	}

	private boolean compileJavaprogram(IJavaProject java_program) {
		try {
			java_program.getProject().build(IncrementalProjectBuilder.FULL_BUILD, null);
		} catch (CoreException e) {
			return false;
		}
		this.status = Execution_Status.Compiled;
		return true;
	}

	private boolean isFieldContainedInClass(Class<?> class_instance, Java_Field expected_field) {
		String expected_type_name = expected_field.getType().getClass_name();
		String expected_field_name = expected_field.getField_name();
		for (Field field : class_instance.getFields()) {
			if (!field.isSynthetic()) {
				if (0 == field.getType().getName().compareTo(expected_type_name)) {
					if (0 == field.getName().compareTo(expected_field_name)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	private boolean isMethodContainedInClass(Class<?> class_instance, Java_Method expected_method) {

		for (Method existing_method : class_instance.getDeclaredMethods()) {
			if (!existing_method.isBridge()) {

				String existing_method_name = existing_method.getName();
				String expected_method_name = expected_method.getMethod_name();
				if (0 == existing_method_name.compareTo(expected_method_name)) {

					EList<Java_Class> expected_params = expected_method.getParams();

					Class<?>[] existing_params = existing_method.getParameterTypes();
					int parameterCount = existing_params.length;
					if (parameterCount == expected_params.size()) {

						for (int i = 0; i < parameterCount; i++) {

							String expected_type_name = expected_params.get(i).getClass_name();
							String existing_type_name = existing_params[i].getSimpleName();
							if (0 != existing_type_name.compareTo(expected_type_name)) {
								break;
							}

						}
						return true;
					}
				}
			}
		}
		return false;
	}

	private Test_Status handleAssertion(Assertion element) {

		Assertion assertion = (Assertion) element;
		boolean expect;

		if (assertion instanceof Assert_True) {
			expect = true;
		} else if (assertion instanceof Assert_False) {
			expect = false;
		} else {
			System.out.println((Messages.getString("error") + Messages.getString("u.ass"))); //$NON-NLS-1$ //$NON-NLS-2$
			return Test_Status.FAILURE;
		}

		if (expect != handleRefactoring(assertion.getInput())) {
			System.out.print(Messages.getString("fail")); //$NON-NLS-1$
			if (expect) {
				System.out.println(Messages.getString("ref.e.fn")); //$NON-NLS-1$
			} else {
				System.out.println(Messages.getString("ref.e.fp")); //$NON-NLS-1$
			}
			return Test_Status.FAILURE;
		}
		return Test_Status.SUCCESS;
	}

	IJavaProject calculated_metrics = null;

	private boolean handleRefactoring(Refactoring refactoring) {

		status = Execution_Status.Changed;

		if (refactoring instanceof Pull_Up_Method_Refactoring) {
			System.out.println(Messages.getString("ascii.line.s.pum")); //$NON-NLS-1$
			boolean applyPullUpMethod = refactoring_tool.applyPullUpMethod((Pull_Up_Method_Refactoring) refactoring);
			System.out.println(Messages.getString("ascii.line.s")); //$NON-NLS-1$
			return applyPullUpMethod;
		}

		else if (refactoring instanceof Pull_Up_Field_Refactoring) {
			System.out.println(Messages.getString("ascii.line.s.puf")); //$NON-NLS-1$
			boolean applyPullUpField = refactoring_tool.applyPullupField((Pull_Up_Field_Refactoring) refactoring);
			System.out.println(Messages.getString("ascii.line.s")); //$NON-NLS-1$
			return applyPullUpField;
		}

		else if (refactoring instanceof Create_Superclass_Refactoring) {
			System.out.println(Messages.getString("ascii.line.s.cs")); //$NON-NLS-1$
			boolean applyCreateSuperclass = refactoring_tool
					.applyCreateSuperclass((Create_Superclass_Refactoring) refactoring);
			System.out.println(Messages.getString("ascii.line.s")); //$NON-NLS-1$
			return applyCreateSuperclass;
		}

		else if (refactoring instanceof Extract_Superclass_Refactoring) {
			System.out.println(Messages.getString("ascii.line.s.exs")); //$NON-NLS-1$
			boolean applyExtractSuperclass = refactoring_tool
					.applyExtractSuperclassRefactoring((Extract_Superclass_Refactoring) refactoring);
			System.out.println(Messages.getString("ascii.line.s")); //$NON-NLS-1$
			return applyExtractSuperclass;
		}

		else {
			System.out.println(
					(Messages.getString("error") + Messages.getString("u.ref") + Messages.getString("skip.tc"))); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			return false;
		}
	}

	private String executeJavaProgram(IJavaProject java_project, String main) throws CoreException {
		Set<IFile> launch_files = new HashSet<>();

		List<String> out = new LinkedList<>();

		IProject project = java_project.getProject();
		project.accept(new IResourceVisitor() {

			@Override
			public boolean visit(IResource resource) throws CoreException {
				switch (resource.getType()) {
				case IResource.PROJECT:
					return true;
				case IResource.FOLDER:
					return true;
				case IResource.FILE:
					if ("launch".equals(resource.getFileExtension())) { //$NON-NLS-1$
						launch_files.add((IFile) resource);
					}
					break;
				}
				return false;
			}
		});
		for (IFile file : launch_files) {
			ILaunchManager mgr = DebugPlugin.getDefault().getLaunchManager();
			ILaunchConfiguration launch_configuration = mgr.getLaunchConfiguration(file);
			ILaunch launch = launch_configuration.launch(ILaunchManager.RUN_MODE, null);
			IStreamsProxy sp = launch.getProcesses()[0].getStreamsProxy();
			IStreamMonitor osm = sp.getOutputStreamMonitor();
			osm.addListener(new IStreamListener() {

				@Override
				public void streamAppended(String text, IStreamMonitor monitor) {
					out.add(text);

				}
			});
			while (!launch.isTerminated()) {
				try {
					Thread.sleep(50);
				} catch (InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
			}
			String contents = ""; //$NON-NLS-1$
			for (String part : out) {
				contents += part;
			}
			return contents;

		}
		return ""; //$NON-NLS-1$
	}

	public void resetRecords() {
		test_record = new Hashtable<String, Test_Status>();
	}

	public void printTestResults() {
		Set<String> records = test_record.keySet();
		int success = 0;
		int failure = 0;
		int warning = 0;
		for (String test_name : records) {
			Test_Status test_status = test_record.get(test_name);
			switch (test_status) {
			case SUCCESS:
				success++;
				System.out.println(
						Messages.getString("list.test.res", new String[] { test_name, test_status.toString() })); //$NON-NLS-1$
				break;
			case WARNING:
				warning++;
				System.out.println(
						Messages.getString("list.test.res", new String[] { test_name, test_status.toString() })); //$NON-NLS-1$
				break;
			case FAILURE:
				failure++;
				System.out.println(
						Messages.getString("list.test.res", new String[] { test_name, test_status.toString() })); //$NON-NLS-1$
				break;
			}
		}
		Double p_success = new Double(((double) success) / records.size());
		Double p_warning = new Double(((double) warning) / records.size());
		Double p_failure = new Double(((double) failure) / records.size());
		System.out.println(Messages.getString("list.test.sum", new Object[] { p_success, p_warning, p_failure })); //$NON-NLS-1$
	}

	private boolean sync(IJavaProject project) {
		try {
			Changes change_container = refactoring_tool.executePlannedRefactorings(gravity.getPG());
			Consumer<EObject> consumer = change_container.getChanges();
			gravity.syncProjectBwd(consumer, null);
			project.getProject().refreshLocal(IProject.DEPTH_INFINITE, null);
			return true;
		} catch (CoreException e) {
			e.printStackTrace();
			return false;
		}
	}

}
