package org.gravity.hulk.ui.dialogs;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.viewers.LabelProvider;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkPackage;
import org.gravity.hulk.ui.Messages;

public class DetectionTreeLabelProvider extends LabelProvider {
	@Override
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
}