package org.gravity.arte.ui.handler;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.dialogs.CheckedTreeSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.gravity.arte.Arte;
import org.gravity.arte.testdsl.arteLanguage.Test_Case;
import org.gravity.arte.testdsl.arteLanguage.Test_File;
import org.gravity.arte.ui.Messages;

// TODO: Auto-generated Javadoc
/**
 * The Class ARTERunHandler.
 */
public class ARTERunHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		List<IResource> selected_items = new LinkedList<>();
		final List<IProject> all_java_projects = new LinkedList<>();
		final List<IFile> all_ttc_files = new LinkedList<>();

		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		ISelectionService service = window.getSelectionService();
		IStructuredSelection structured = (IStructuredSelection) service.getSelection();

		for (Object entry : structured.toArray()) {
			IProject project;

			if (entry instanceof IResource) {
				IResource resource = (IResource) entry;
				project = resource.getProject();
				try {
					if (project.hasNature(JavaCore.NATURE_ID)) {
						switch (resource.getType()) {
						case IResource.FILE:
							isIResourceARTEFile(selected_items, resource);
							break;
						case IResource.FOLDER:
							IFolder folder = (IFolder) resource;
							if (folder.getName().equals("arte")) { //$NON-NLS-1$
								if (project == folder.getParent()) {
									for (IResource member : folder.members()) {
										isIResourceARTEFile(selected_items, member);
									}
								}
							}
							break;
						case IResource.PROJECT:
							IFolder arte = project.getFolder("arte"); //$NON-NLS-1$
							if (arte != null) {
								for (IResource member : arte.members()) {
									isIResourceARTEFile(selected_items, member);
								}
							}
							break;
						case IResource.ROOT:
							// No default selection
							break;
						}
					} else {
						continue;
					}
				} catch (CoreException e) {
					e.printStackTrace();
					continue;
				}
			} else if (entry instanceof IJavaProject) {
				project = ((IJavaProject) entry).getProject();
				try {
					IResource arte = project.findMember("arte"); //$NON-NLS-1$
					if (arte != null && arte.getType() == IResource.FOLDER) {
						for (IResource member : ((IFolder) arte).members()) {
							isIResourceARTEFile(selected_items, member);
						}
					}
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				continue;
			}
		}

		IWorkspaceRoot workspace_root = ResourcesPlugin.getWorkspace().getRoot();

		for (IProject project : workspace_root.getProjects()) {
			if (project.isOpen()) {
				try {
					if (project.hasNature(JavaCore.NATURE_ID)) {
						IFolder arte = project.getFolder("arte"); //$NON-NLS-1$
						if (arte != null && arte.exists()) {
							boolean added = false;
							for (IResource member : arte.members()) {
								if (member.getFileExtension().equals("ttc") //$NON-NLS-1$
										|| member.getFileExtension().equals("arte")) { //$NON-NLS-1$
									all_ttc_files.add((IFile) member);
									added = true;
								}
							}
							if (added) {
								all_java_projects.add(project);
							}
						}
					}
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
		CheckedTreeSelectionDialog dialog = new CheckedTreeSelectionDialog(window.getShell(), new LabelProvider() {
			WorkbenchLabelProvider wlp = new WorkbenchLabelProvider();

			@Override
			public Image getImage(Object element) {
				return this.wlp.getImage(element);
			}

			@Override
			public String getText(Object element) {
				if (element instanceof Test_Case) {
					return ((Test_Case) element).getName().concat(" - ").concat(((Test_Case) element).getDescription()); //$NON-NLS-1$
				}
				return this.wlp.getText(element);
			}

		}, new ITreeContentProvider() {

			@Override
			public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
				// TODO Auto-generated method stub

			}

			@Override
			public void dispose() {
				// TODO Auto-generated method stub

			}

			@Override
			public boolean hasChildren(Object element) {
				if (element instanceof IWorkspaceRoot) {
					for (IProject project : ((IWorkspaceRoot) element).getProjects()) {
						try {
							if (project.hasNature(JavaCore.NATURE_ID)) {
								return true;
							}
						} catch (CoreException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					return false;
				} else if (element instanceof IProject) {
					IFolder arte = ((IProject) element).getFolder("arte"); //$NON-NLS-1$
					if (arte.exists()) {
						try {
							for (IResource member : arte.members()) {
								if ("ttc".equals(member.getFileExtension()) //$NON-NLS-1$
										|| "arte".equals(member.getFileExtension())) { //$NON-NLS-1$
									return true;
								}
							}
						} catch (CoreException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					return false;
				} else if (element instanceof IFolder) {
					IFolder arte = (IFolder) element;
					if ("arte".equals(arte.getName())) { //$NON-NLS-1$
						try {
							for (IResource member : arte.members()) {
								if ("ttc".equals(member.getFileExtension()) //$NON-NLS-1$
										|| "arte".equals(member.getFileExtension())) { //$NON-NLS-1$
									return true;
								}
							}
						} catch (CoreException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					return false;
				} else if (element instanceof IFile) {
					if ("ttc".equals(((IFile) element).getFileExtension()) //$NON-NLS-1$
							|| "arte".equals(((IFile) element).getFileExtension())) { //$NON-NLS-1$
						return getTestCasesForIFile((IFile) element).size() > 0;
					}
					return false;
				} else if (element instanceof Test_File) {
					EList<Test_Case> test_cases = ((Test_File) element).getTest_cases();
					return test_cases.size() > 0;
				}
				return false;
			}

			@Override
			public Object getParent(Object element) {
				if (element instanceof Test_Case) {
					EObject eContainer = ((Test_Case) element).eContainer();
					return eContainer;
				} else if (element instanceof Test_File) {
					IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
					IPath path = Path.fromOSString(((Test_File) element).eResource().getURI().path());
					IFile file = root.getFileForLocation(path);
					return file;
				} else if (element instanceof IFile) {
					return ((IFile) element).getParent();
				} else if (element instanceof IFolder) {
					return ((IFolder) element).getProject();
				} else if (element instanceof IProject) {
					return ((IProject) element).getWorkspace().getRoot();
				} else if (element instanceof IWorkspaceRoot) {
					return null;
				}
				return null;
			}

			@Override
			public Object[] getElements(Object inputElement) {
				if (inputElement instanceof IWorkspaceRoot) {
					return getElements((IWorkspaceRoot) inputElement).toArray();
				} else if (inputElement instanceof IProject) {
					return getElements((IProject) inputElement).toArray();
				} else if (inputElement instanceof IFolder) {
					return getElements((IFolder) inputElement).toArray();
				} else if (inputElement instanceof IFile) {
					return getElements((IFile) inputElement).toArray();
				} else if (inputElement instanceof Test_File) {
					return ((Test_File) inputElement).getTest_cases().toArray();
				}
				return new Object[0];
			}

			private List<IProject> getElements(IWorkspaceRoot root) {
				List<IProject> projects = new LinkedList<>();
				for (IProject project : root.getProjects()) {
					if (getElements(project).size() > 0) {
						projects.add(project);
					}
				}
				return projects;
			}

			private List<IFile> getElements(IProject project) {
				if (project.isOpen()) {
					try {
						if (project.hasNature(JavaCore.NATURE_ID)) {
							IFolder arte = project.getFolder("arte"); //$NON-NLS-1$
							if (arte != null && arte.exists()) {
								return getElements(arte);
							}
						}
					} catch (CoreException e) {
						e.printStackTrace();
					}
				}
				return Collections.emptyList();
			}

			private List<IFile> getElements(IFolder arte) {
				List<IFile> elements = new LinkedList<>();
				try {
					for (IResource member : arte.members()) {
						if (member.getType() == IResource.FILE) {
							IFile file = (IFile) member;
							if (0 < getElements(file).size()) {
								elements.add(file);
							}
						}
					}
				} catch (CoreException e) {
					e.printStackTrace();
				}
				return elements;
			}

			private List<Test_Case> getElements(IFile member) {
				if ("ttc".equals(member.getFileExtension()) || "arte".equals(member.getFileExtension())) { //$NON-NLS-1$ //$NON-NLS-2$
					return getTestCasesForIFile(member);
				}
				return Collections.emptyList();
			}

			private List<Test_Case> getTestCasesForIFile(IFile parentElement) {
				try {
					return Arte.getInstance().getTest_case_util().parseTestCase(parentElement).getTest_cases();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (CoreException e) {
					e.printStackTrace();
				}
				return Collections.emptyList();
			}

			@Override
			public Object[] getChildren(Object parentElement) {
				if (parentElement instanceof IProject) {
					IFolder arte = ((IProject) parentElement).getFolder("arte"); //$NON-NLS-1$
					List<IResource> ttc_files = new LinkedList<>();
					if (arte != null) {
						try {
							for (IResource member : arte.members()) {
								if ("ttc".equals(member.getFileExtension()) //$NON-NLS-1$
										|| "arte".equals(member.getFileExtension())) { //$NON-NLS-1$
									ttc_files.add(member);
								}
							}
						} catch (CoreException e) {
							e.printStackTrace();
						}
					}
					return ttc_files.toArray();
				} else if (parentElement instanceof IFile) {
					return getTestCasesForIFile((IFile) parentElement).toArray();
				}
				return new Object[0];
			}
		});

		dialog.setTitle(Messages.ARTERunHandler_0);
		dialog.setMessage(Messages.ARTERunHandler_1);
		dialog.setInput(workspace_root);
		dialog.setInitialElementSelections(selected_items);
		dialog.setContainerMode(true);
		dialog.open();

		Set<IFile> files = new HashSet<>();
		Set<String> cases = new HashSet<>();
		Object[] result = dialog.getResult();
		for (Object selected : result) {
			// if (selected instanceof IProject) {
			// try {
			// for (IResource ttc : ((IProject)
			// selected).getFolder("arte").members()) { //$NON-NLS-1$
			// if (ttc.getType() == IResource.FILE
			// && (ttc.getFileExtension().equals("ttc") ||
			// ttc.getFileExtension().equals("arte"))) { //$NON-NLS-1$
			// //$NON-NLS-2$
			// files.add((IFile) ttc);
			// }
			// }
			// } catch (CoreException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			// } else if (selected instanceof IFolder) {
			// try {
			// for (IResource ttc : ((IFolder) selected).members()) {
			// if (ttc.getType() == IResource.FILE
			// && (ttc.getFileExtension().equals("ttc") ||
			// ttc.getFileExtension().equals("arte"))) { //$NON-NLS-1$
			// //$NON-NLS-2$
			// files.add((IFile) ttc);
			// }
			// }
			// } catch (CoreException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			// } else
			if (selected instanceof IFile) {
				files.add((IFile) selected);
			} else if (selected instanceof Test_Case) {
				Test_Case test_case = (Test_Case) selected;
				Test_File test_file = (Test_File) test_case.eContainer();
				cases.add(test_file.getName() + test_case.getName());
			}
		}

		Job job = new Job("ARTE") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				monitor.beginTask("Execute Test Cases", cases.size());
				Arte arte = Arte.getInstance();
				for (IFile file : files) {
					try {
						Test_File test_file = arte.getTest_case_util().parseTestCase(file);
						for (Test_Case test_case : test_file.getTest_cases()) {
							if (cases.contains(test_file.getName() + test_case.getName())) {
								boolean success = arte.getTest_execution()
										.executeTestCase(JavaCore.create(file.getProject()), test_case);
								System.out.println(Messages.ARTERunHandler_2 + test_case.getName()
										+ Messages.ARTERunHandler_3 + success);
								monitor.worked(1);
							}
						}
					} catch (IOException | CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				return Status.OK_STATUS;
			}
		};
		job.setUser(true);
		job.schedule();

		return null;
	}

	/**
	 * Checks if the resource contains an arte file.
	 *
	 * @param selected_items
	 *            the selected_items
	 * @param member
	 *            the member
	 * @return true, if is i resource arte file
	 */
	private static boolean isIResourceARTEFile(List<IResource> selected_items, IResource member) {
		if (member.getType() == IResource.FILE) {
			IFile ttc = (IFile) member;
			if (ttc.getFileExtension().compareTo("ttc") == 0 || ttc.getFileExtension().compareTo("arte") == 0) { //$NON-NLS-1$ //$NON-NLS-2$
				return selected_items.add(member);
			}
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.commands.IHandler#isEnabled()
	 */
	@Override
	public boolean isEnabled() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.commands.IHandler#isHandled()
	 */
	@Override
	public boolean isHandled() {
		return true;
	}

}
