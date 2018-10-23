/**
 * 
 */
package org.gravity.eclipse.util;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.UsageCrossReferencer;

/**
 * Helpers for dealing with EMF Resources
 * 
 * @author speldszus
 *
 */
public class EMFUtil {
	
	private EMFUtil() {
		// As this class only has static methods we don't want instances
	}

	/**
	 * Efficiently deletes all Objects from the resource
	 * 
	 * @param objects The EObjects which should be deleted
	 * @param resource The containing resource
	 */
	public static void deleteAll(Collection<EObject> objects, Resource resource) {
		Map<EObject, Collection<Setting>> usages = UsageCrossReferencer.findAll(objects, resource);
		for (EObject eObject : objects) {
			if (eObject!= null && !usages.containsKey(eObject)) {
				EcoreUtil.delete(eObject);
			}
		}
		for (Entry<EObject, Collection<Setting>> entry : usages.entrySet()) {
			EObject eObject = entry.getKey();
			for (EStructuralFeature.Setting setting : entry.getValue()) {
				if (setting.getEStructuralFeature().isChangeable()) {
					EcoreUtil.remove(setting, eObject);
				}
			}
			EcoreUtil.remove(eObject);
		}
	}
}
