/**
 * Most of this functions are extracted and customized from the EcoreUtil class.
 */
package org.sidiff.difference.symmetric.execute.util;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

/**
 * This class contains convenient static methods for working with EMF objects.
 */
public class EcoreMergeUtil {

	/**
	 * Returns a copy of the given eObject but not copies the EReferences.
	 * 
	 * @param eObject
	 *            the object to copy.
	 * @return the copy.
	 */
	public static EObject copyWithoutReferences(EObject eObject) {
		if (eObject == null) {
			return null;
		}
		else {
			EObject copyEObject = EcoreUtil.create(eObject.eClass());
			EClass eClass = eObject.eClass();
			for (int i = 0, size = eClass.getFeatureCount(); i < size; ++i) {
				EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(i);
				if (eStructuralFeature.isChangeable() && !eStructuralFeature.isDerived()) {
					if (eStructuralFeature instanceof EAttribute) {
						copyAttribute((EAttribute) eStructuralFeature, eObject, copyEObject);
					}
				}
			}

			copyProxyURI(eObject, copyEObject);

			return copyEObject;
		}
	}

	/**
	 * Called to handle the copying of an attribute; this adds a list of values
	 * or sets a single value as appropriate for the multiplicity.
	 * 
	 * @param eAttribute
	 *            the attribute to copy.
	 * @param eObject
	 *            the object from which to copy.
	 * @param copyEObject
	 *            the object to copy to.
	 */
	public static void copyAttribute(EAttribute eAttribute, EObject eObject, EObject copyEObject) {
		// Standard value changed?
		if (eObject.eIsSet(eAttribute)) {
			if (FeatureMapUtil.isFeatureMap(eAttribute)) {
				FeatureMap featureMap = (FeatureMap) eObject.eGet(eAttribute);
				for (int i = 0, size = featureMap.size(); i < size; ++i) {
					EStructuralFeature feature = featureMap.getEStructuralFeature(i);

					if (feature instanceof EReference && ((EReference) feature).isContainment()) {
						Object value = featureMap.getValue(i);

						if (value != null) {
							EcoreUtil.copy((EObject) value);
						}
					}
				}
			}
			else if (eAttribute.isMany()) {
				List<?> source = (List<?>) eObject.eGet(eAttribute);
				@SuppressWarnings("unchecked")
				List<Object> target = (List<Object>) copyEObject.eGet(eAttribute);
				if (source.isEmpty()) {
					target.clear();
				}
				else {
					target.addAll(source);
				}
			}
			else {
				copyEObject.eSet(eAttribute, eObject.eGet(eAttribute));
			}
		}
	}

	/**
	 * Copies the proxy URI from the original to the copy, if present.
	 * 
	 * @param eObject
	 *            the object being copied.
	 * @param copyEObject
	 *            the copy being initialized.
	 */
	public static void copyProxyURI(EObject eObject, EObject copyEObject) {
		if (eObject.eIsProxy()) {
			((InternalEObject) copyEObject).eSetProxyURI(((InternalEObject) eObject).eProxyURI());
		}
	}

	/**
	 * Compares two EObjects
	 * 
	 * @param obj1
	 *            the first compare object
	 * @param obj2
	 *            the second compare object
	 * @return true if the objects are equal and false if they are not
	 */
	public static boolean equalsEObject(EObject obj1, EObject obj2) {
		if (obj1.eIsProxy() && obj2.eIsProxy()) {
			return EcoreUtil.getURI(obj1).equals(EcoreUtil.getURI(obj2));
		} else if (!obj1.eIsProxy() && !obj2.eIsProxy()) {
			return obj1.equals(obj2);
		} else {
			return false;
		}
	}
}

