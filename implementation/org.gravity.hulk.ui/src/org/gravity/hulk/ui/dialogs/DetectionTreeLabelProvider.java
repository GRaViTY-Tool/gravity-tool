package org.gravity.hulk.ui.dialogs;

import org.eclipse.jface.viewers.LabelProvider;
import org.gravity.hulk.ui.Messages;

/**
 * A provider for anti-pattern labels
 *
 * @author speldszus
 *
 */
public class DetectionTreeLabelProvider extends LabelProvider {

	@Override
	public String getText(final Object element) {
		if (element instanceof final Class<?> eClass) {
			if (eClass.isInterface()) {
				return Messages.error;
			}
			return eClass.getName();
		}
		return element.toString();

	}
}