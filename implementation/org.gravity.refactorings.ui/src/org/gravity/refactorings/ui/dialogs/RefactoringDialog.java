package org.gravity.refactorings.ui.dialogs;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

public class RefactoringDialog extends Dialog {

	private String text;
	private String title;

	public RefactoringDialog(Shell parentShell, String title, String text) {
		super(parentShell);

		setShellStyle(SWT.BORDER | SWT.MIN | SWT.RESIZE);

		this.text = text;
		this.title = title;
	}

	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		shell.setText(this.title);
	}

	@Override
	protected Control createContents(Composite parent) {
		Composite composite = new Composite(parent, SWT.NULL);

		composite.setLayout(new GridLayout(1, false));

		CLabel lblNewLabel = new CLabel(composite, SWT.NONE);
		lblNewLabel.setText(this.text);

		return super.createContents(parent);
	}

}