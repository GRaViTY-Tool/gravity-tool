package org.gravity.hulk.detection;

import java.util.Collections;
import java.util.List;

import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkPackage;

public class HulkDetectionPackage extends HulkPackage {

	public static final HulkDetectionPackage INSTANCE = new HulkDetectionPackage();

	private HulkDetectionPackage() {
		super("Hulk Detector Packages", Collections.emptyList());
	}

	protected HulkDetectionPackage(final String name, final List<Class<? extends HDetector>> detectors) {
		super(name, detectors);
	}
}