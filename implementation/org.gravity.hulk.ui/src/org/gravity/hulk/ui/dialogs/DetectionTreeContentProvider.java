package org.gravity.hulk.ui.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkPackage;

public class DetectionTreeContentProvider implements ITreeContentProvider {

	/**
	 * The logger of this class
	 */
	private static final Logger LOGGER = Logger.getLogger(DetectionTreeContentProvider.class);

	@Override
	public void dispose() {
		LOGGER.info("Dispose");
	}

	@Override
	public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Input changed from \"" + oldInput + "\" to \"" + newInput + "\"");
		}
	}

	@Override
	public Object[] getElements(final Object inputElement) {
		final List<Object> elements = new ArrayList<>();
		if (inputElement instanceof final HulkPackage epackage) {
			elements.addAll(epackage.getSubPackages());
			elements.addAll(epackage.getDetectors());
		} else {
			LOGGER.warn("Input element is not of type HulkPackage: " + inputElement);
		}
		return elements.toArray();
	}

	@Override
	public Object[] getChildren(final Object parentElement) {
		final List<Object> elements = new ArrayList<>();
		if (parentElement instanceof final HulkPackage epackage) {
			elements.addAll(epackage.getSubPackages());
			elements.addAll(epackage.getDetectors());
		}
		return elements.toArray();
	}

	@Override
	public Object getParent(final Object element) {
		if ((element instanceof final HulkPackage ePackage) || (element instanceof final HDetector detector)) {
		}
		return null;
	}

	@Override
	public boolean hasChildren(final Object element) {
		if (element instanceof final HulkPackage ePackage) {
			return !ePackage.getSubPackages().isEmpty() || !ePackage.getDetectors().isEmpty();
		}
		return false;
	}
}
