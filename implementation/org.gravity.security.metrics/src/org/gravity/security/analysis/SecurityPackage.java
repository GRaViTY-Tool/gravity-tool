package org.gravity.security.analysis;

import java.util.Arrays;

import org.gravity.hulk.detection.metrics.MetricsPackage;

public class SecurityPackage extends MetricsPackage {

	public static final SecurityPackage INSTANCE = new SecurityPackage();

	private SecurityPackage() {
		super("Security Metrics", Arrays.asList(CriticalClassRatioCalculator.class));
	}
}
