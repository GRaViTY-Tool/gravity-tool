package org.gravity.arte.ui.wizards;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.gravity.arte.Arte;
import org.gravity.arte.testdsl.arteLanguage.ArteLanguageFactory;
import org.gravity.arte.testdsl.arteLanguage.Test_File;
import org.gravity.arte.ui.Messages;
import org.gravity.arte.ui.wizards.pages.ARTETestFileWizardPage1;

public class ARTETestFileWizard extends Wizard implements IWorkbenchWizard {

	private ARTETestFileWizardPage1 page1;

	private IJavaProject java_project = null;

	public ARTETestFileWizard() {

	}

	public ARTETestFileWizard(IJavaProject java_project) {
		this.java_project = java_project;
	}

	@Override
	public String getWindowTitle() {
		return Messages.TTCTestFileWizard_0;
	}

	@Override
	public void addPages() {
		this.page1 = new ARTETestFileWizardPage1();
		if (this.java_project != null)
			this.page1.setJavaProject(this.java_project);
		addPage(this.page1);
	}

	@Override
	public boolean performFinish() {
		IFolder arte_folder = this.page1.getARTE_folder();
		IFile test_file = arte_folder.getFile(this.page1.getFile_name().getText() + ".arte"); //$NON-NLS-1$
		Test_File file = ArteLanguageFactory.eINSTANCE.createTest_File();
		file.setName(this.page1.getFile_name().getText());
		ResourceSet set = new ResourceSetImpl();

		Resource eResource = set.createResource(URI.createFileURI(test_file.getLocation().toString()));
		eResource.getContents().add(file);
		try {
			eResource.save(null);
		} catch (IOException e1) {
			e1.printStackTrace();
			return false;
		}

		// Set ARTE_NATURE_ID if not set
		try {
			IProject eclipse_project = this.page1.getJavaProject().getProject();
			if (!eclipse_project.hasNature(Arte.ARTE_NATURE_ID)) {
				IProjectDescription description = eclipse_project.getDescription();
				String[] old_natures = description.getNatureIds();
				String[] new_natures = new String[old_natures.length + 1];
				System.arraycopy(old_natures, 0, new_natures, 0, old_natures.length);
				new_natures[new_natures.length - 1] = Arte.ARTE_NATURE_ID;
				description.setNatureIds(new_natures);
				eclipse_project.setDescription(description, new NullProgressMonitor());
			}
		} catch (CoreException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		ARTETestFileWizard ttcTestFileWizard = new ARTETestFileWizard();
		ttcTestFileWizard.canFinish();
	}
}
