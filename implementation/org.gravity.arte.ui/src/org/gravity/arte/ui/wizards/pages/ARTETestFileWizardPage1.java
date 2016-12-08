package org.gravity.arte.ui.wizards.pages;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.gravity.arte.ui.Messages;
import org.gravity.arte.ui.windows.ProjectSelectionDialog;

public class ARTETestFileWizardPage1 extends WizardPage {

	private IFolder arte_folder;
	private Text project_name;
	private Text file_name;
	private Composite container;
	private IJavaProject java_project = null;

	public ARTETestFileWizardPage1() {
		super(Messages.TTCTestFileWizardPage1_0);
		setTitle(Messages.TTCTestFileWizardPage1_1);
	}

	@Override
	public void createControl(Composite parent) {
		this.container = new Composite(parent, SWT.NONE);

		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		this.container.setLayout(layout);

		Label label_file_name = new Label(this.container, SWT.NONE);
		label_file_name.setText(Messages.TTCTestFileWizardPage1_2);

		this.file_name = new Text(this.container, SWT.BORDER | SWT.SINGLE);
		this.file_name.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void keyReleased(KeyEvent e) {
				String text = ARTETestFileWizardPage1.this.getFile_name().getText();
				if (!text.isEmpty()) {
					boolean present = false;
					try {
						for (IResource file : getARTE_folder().members()) {
							if (file.getType() == IResource.FILE) {
								String name = file.getName();
								if (file.getFileExtension().equals(".arte") //$NON-NLS-1$
										&& name.equals(text.toString())) {
									present = true;
									setErrorMessage(Messages.TTCTestFileWizardPage1_3);
								}
							}
						}
					} catch (CoreException e1) {
						e1.printStackTrace();
					}
					if (!present) {
						setErrorMessage(null);
						setPageComplete(true);
					}
				}
			}
		});

		Label label1 = new Label(this.container, SWT.NONE);
		label1.setText(""); //$NON-NLS-1$

		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		this.file_name.setLayoutData(gd);

		Label labelProject = new Label(this.container, SWT.NONE);
		labelProject.setText(Messages.TTCTestFileWizardPage1_4);

		this.project_name = new Text(this.container, SWT.BORDER | SWT.SINGLE);
		if (getJavaProject() == null) {
			this.project_name.setText(""); //$NON-NLS-1$
		} else {
			this.project_name.setText(getJavaProject().getProject().getName());
		}

		Button browse_project = new Button(this.container, SWT.BUTTON1);
		browse_project.setText(Messages.TTCTestFileWizardPage1_5);
		browse_project.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("SELECT"); //$NON-NLS-1$
				IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
				List<IJavaProject> java_projects = new LinkedList<>();
				for (IProject proj : projects) {
					try {
						if (proj.hasNature(JavaCore.NATURE_ID)) {
							java_projects.add(JavaCore.create(proj));
						}
					} catch (CoreException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				ProjectSelectionDialog dialog = new ProjectSelectionDialog(getShell(), java_projects);
				dialog.setInitialPattern("?"); //$NON-NLS-1$
				dialog.open();
				setJavaProject((IJavaProject) dialog.getFirstResult());
				Text project_name_var = ARTETestFileWizardPage1.this.getProject_name();
				if (project_name_var != null) {
					project_name_var.setText(getJavaProject().getProject().getName());
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				System.out.println(Messages.TTCTestFileWizardPage1_6);
			}
		});

		GridData gd2 = new GridData(GridData.FILL_HORIZONTAL);
		this.project_name.setLayoutData(gd2);

		// required to avoid an error in the system
		setControl(this.container);
		setPageComplete(false);

	}

	public IFolder getARTE_folder() {
		return this.arte_folder;
	}

	public void setJavaProject(IJavaProject java_project) {
		this.java_project = java_project;
		this.arte_folder = java_project.getProject().getFolder("arte"); //$NON-NLS-1$
		if (!this.arte_folder.exists()) {
			try {
				this.arte_folder.create(true, true, new NullProgressMonitor());
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}

	public IJavaProject getJavaProject() {
		return this.java_project;
	}

	public Text getProject_name() {
		return this.project_name;
	}

	public Text getFile_name() {
		return this.file_name;
	}

}
