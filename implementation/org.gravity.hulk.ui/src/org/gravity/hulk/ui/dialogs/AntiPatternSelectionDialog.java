package org.gravity.hulk.ui.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.CheckedTreeSelectionDialog;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkPackage;
import org.gravity.hulk.ui.Messages;

public class AntiPatternSelectionDialog extends CheckedTreeSelectionDialog {

	private List<SelectionListener> listener = new ArrayList<>();

	public AntiPatternSelectionDialog(Shell parent, ILabelProvider labelProvider, ITreeContentProvider contentProvider,
			int style) {
		super(parent, labelProvider, contentProvider, style);
	}
	
	public String getText(Object element) {
		if (element instanceof EClass) {
			EClass e_class = (EClass) element;
			if (e_class.isAbstract() || e_class.isInterface()) {
				return Messages.HulkScanHandler_5;
			}
			if (HulkPackage.eINSTANCE.getHDetector().isSuperTypeOf(e_class)) {
				EPackage e_package = e_class.getEPackage();
				return ((HDetector) e_package.getEFactoryInstance().create(e_class)).getGuiName();
			}
			return e_class.getName();
		} else if (element instanceof EPackage) {
			return ((EPackage) element).getName();
		}
		return element.toString();

	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite createDialogArea = (Composite) super.createDialogArea(parent);
	        
		Button generateJavaAnnotationsButton = new Button(createDialogArea, SWT.CHECK);
		generateJavaAnnotationsButton.setText("Generate Java Annotations");
		for(SelectionListener l : listener){
			generateJavaAnnotationsButton.addSelectionListener(l);
		}
	
		return createDialogArea;
	}
	
	public void addJavaAnnotationsSelectedListener(SelectionListener listener){
		this.listener.add(listener);
	}
}
