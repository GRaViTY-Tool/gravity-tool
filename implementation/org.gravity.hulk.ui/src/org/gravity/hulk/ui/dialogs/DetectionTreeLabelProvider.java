package org.gravity.hulk.ui.dialogs;

import org.eclipse.jface.viewers.LabelProvider;
import org.gravity.hulk.HulkPackage;

/**
 * A provider for anti-pattern labels
 *
 * @author speldszus
 *
 */
public class DetectionTreeLabelProvider extends LabelProvider {

	@Override
	public String getText(final Object element) {
		if (element instanceof final HulkPackage hPackage) {
			return hPackage.getName();
		}
		if (element instanceof final Class<?> eClass) {
			return eClass.getSimpleName();
		}
		return element.toString();

	}
}