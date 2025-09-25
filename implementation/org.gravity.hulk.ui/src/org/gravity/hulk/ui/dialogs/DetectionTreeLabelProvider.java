package org.gravity.hulk.ui.dialogs;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.viewers.LabelProvider;
import org.gravity.hulk.HulkPackage;
import org.gravity.hulk.detection.HDetector;
import org.gravity.hulk.ui.Messages;

/**
 * A provider for anti-pattern labels
 * 
 * @author speldszus
 *
 */
public class DetectionTreeLabelProvider extends LabelProvider {
	
	@Override
	public String getText(Object element) {
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (eClass.isAbstract() || eClass.isInterface()) {
				return Messages.error;
			}
			if (HulkPackage.eINSTANCE.getHDetector().isSuperTypeOf(eClass)) {
				EPackage ePackage = eClass.getEPackage();
				return ((HDetector) ePackage.getEFactoryInstance().create(eClass)).getGuiName();
			}
			return eClass.getName();
		} else if (element instanceof EPackage) {
			return ((EPackage) element).getName();
		}
		return element.toString();

	}
}