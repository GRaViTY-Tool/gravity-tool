package org.gravity.hulk.ui.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.gravity.hulk.HDetector;

public class DetectionTreeContentProvider implements ITreeContentProvider {

	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	@Override
	public Object[] getElements(Object inputElement) {
		List<Object> elements = new ArrayList<>();
		if (inputElement instanceof EPackage) {
			EPackage epackage = (EPackage) inputElement;
			for (EPackage esubpackage : epackage.getESubpackages()) {
				if (epackage.equals(esubpackage.getESuperPackage())) {
					elements.add(esubpackage);
				}
			}
			for (EClassifier eclassifier : epackage.getEClassifiers()) {
				if (epackage.equals(eclassifier.getEPackage()) && !eclassifier.getInstanceClass().isInterface()) {
					elements.add(eclassifier);
				}
			}
		}
		return elements.toArray();
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		List<Object> elements = new ArrayList<>();
		if (parentElement instanceof EPackage) {
			EPackage epackage = (EPackage) parentElement;
			for (EPackage esubpackage : epackage.getESubpackages()) {
				if (epackage.equals(esubpackage.getESuperPackage())) {
					elements.add(esubpackage);
				}
			}
			for (EClassifier eclassifier : epackage.getEClassifiers()) {
				if (HDetector.class.isAssignableFrom(eclassifier.getInstanceClass())) {
					if (!((EClass) eclassifier).isAbstract()) {
						elements.add(eclassifier);
					}
				}
			}
		}
		return elements.toArray();
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof EPackage) {
			return ((EPackage) element).getESuperPackage();
		} else if (element instanceof EClassifier) {
			return ((EClassifier) element).getEPackage();
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof EPackage) {
			EPackage ePackage = (EPackage) element;
			return ePackage.getESubpackages().size() > 0 || ePackage.getEClassifiers().size() > 0;
		}
		return false;
	}
}
