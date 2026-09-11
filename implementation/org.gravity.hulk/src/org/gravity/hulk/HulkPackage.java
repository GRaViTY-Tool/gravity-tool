package org.gravity.hulk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;

public class HulkPackage {

	private static final Logger LOGGER = Logger.getLogger(HulkPackage.class);

	// Singleton instance for global access

	public static final HulkPackage INSTANCE = new HulkPackage();

	private HulkPackage() {
		// Private constructor to prevent external instantiation
		this.name = "Hulk Detector Packages";
		this.detectors = Collections.emptyList();
	}

	private final String name;

	private final List<HulkPackage> packages = new ArrayList<>();

	private final List<Class<? extends HDetector>> detectors;

	protected HulkPackage(final String name,
			final List<Class<? extends HDetector>> detectors) {
		this.name = name;
		final var parent = this.getParentInstance();
		if (parent != null) {
			parent.packages.add(this);
		}
		this.detectors = Collections.unmodifiableList(detectors);
	}

	private HulkPackage getParentInstance() {
		final var thisClass = this.getClass();
		if (HulkPackage.class.equals(thisClass)) {
			// Already at top level
			return null;
		}
		final Class<?> parentClass = thisClass.getSuperclass();
		try {
			return (HulkPackage) parentClass.getDeclaredField("INSTANCE").get(null);
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			LOGGER.error("Could not access parent instance of HulkPackage", e);
			return null;
		}
	}

	public String getName() {
		return this.name;
	}

	public List<Class<? extends HDetector>> getDetectors() {
		return this.detectors;
	}

	public List<HulkPackage> getSubPackages() {
		return this.packages;
	}
}