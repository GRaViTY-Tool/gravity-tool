package org.gravity.arte.ui.windows;

import java.util.Comparator;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.dialogs.FilteredItemsSelectionDialog;
import org.gravity.arte.testdsl.arteLanguage.Test_File;

public class RunTestCaseDialog extends FilteredItemsSelectionDialog {

	List<Test_File> testfiles;

	public RunTestCaseDialog(Shell shell, List<Test_File> testfiless) {
		super(shell, false);
		this.testfiles = testfiless;
		setTitle("Test Case Selection"); //$NON-NLS-1$
		setSelectionHistory(new SelectionHistory() {

			@Override
			protected Object restoreItemFromMemento(IMemento memento) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			protected void storeItemToMemento(Object item, IMemento memento) {
				// TODO Auto-generated method stub

			}

		});
	}

	@Override
	protected Control createExtendedContentArea(Composite parent) {
		return null;
	}

	@Override
	protected IDialogSettings getDialogSettings() {
		System.out.println("getDialogSettings"); //$NON-NLS-1$
		return new DialogSettings("JavaProjectSelection"); //$NON-NLS-1$
	}

	@Override
	protected IStatus validateItem(Object item) {
		System.out.println("validateItem"); //$NON-NLS-1$
		return Status.OK_STATUS;
	}

	@Override
	protected ItemsFilter createFilter() {
		System.out.println("createFilter"); //$NON-NLS-1$
		return new ItemsFilter() {

			@Override
			public boolean matchItem(Object item) {
				if (item instanceof IJavaProject) {
					String name = ((IJavaProject) item).getProject().getName();
					System.out.println("matchItem: " + name); //$NON-NLS-1$
					return true;
				}
				return false;
			}

			@Override
			public boolean isConsistentItem(Object item) {
				System.out.println("isConsistentItem: " + item); //$NON-NLS-1$
				return true;
			}

		};
	}

	@Override
	protected Comparator<IJavaProject> getItemsComparator() {
		return new Comparator<IJavaProject>() {

			@Override
			public int compare(IJavaProject o1, IJavaProject o2) {
				if (o1.equals(o2)) {
					return 0;
				}
				return 1;
			}
		};
	}

	@Override
	protected void fillContentProvider(AbstractContentProvider contentProvider, ItemsFilter itemsFilter,
			IProgressMonitor progressMonitor) throws CoreException {
		System.out.println("fillContentProvider"); //$NON-NLS-1$
		progressMonitor.beginTask("Searching all Java Projects...", this.testfiles.size()); //$NON-NLS-1$
		for (Test_File test_file : this.testfiles) {
			contentProvider.add(test_file, itemsFilter);
			progressMonitor.worked(1);
		}
	}

	@Override
	public String getElementName(Object item) {
		return ((Test_File) item).getName();
	}

}