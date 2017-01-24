package org.sidiff.difference.symmetric.execute.util;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

public class UIUtil {

	public static void showMessage(String message) {
		Display.getDefault().asyncExec(() -> {
			MessageDialog.openInformation(
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), 
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart().getTitle(),
					message);
		}); 
	}
}
