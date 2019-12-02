package org.gravity.hulk.ui.visualization.util;

import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.emf.common.util.EList;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;

/**
 *
 * A class for calculating thresholds
 *
 */
public final class ThresholdCalculator {

	private ThresholdCalculator() {
		// This class shouldn't be instantiated
	}

	/**
	 * Calculates the low/high-threshold. If isLowThreshold is set, the method
	 * returns before.last() or lowestPossibleValue if before is null or empty. If
	 * isLowThreshold is false, the method returns after.first() or -1 if after is
	 * null or empty.
	 *
	 * @param isLowThreshold      true = low threshold, false = high threshold
	 * @param before              needed for the low threshold
	 * @param after               needed for the high threshold
	 * @param lowestPossibleValue default return-value
	 * @return low or high threshold
	 */
	private static double calculateThresholdValue(boolean isLowThreshold, SortedSet<Double> before,
			SortedSet<Double> after, double lowestPossibleValue) {

		if (isLowThreshold) {
			if (before == null || before.isEmpty()) {
				return lowestPossibleValue;
			} else {
				return before.last();
			}
		} else {
			if (after == null || after.isEmpty()) {
				return -1;
			} else {
				return after.first();
			}
		}

	}

	/**
	 * Gets the low/high threshold value that a metric at least/at most needs to
	 * have in comparison to other metrics of the same type to achieve the relative
	 * amount of the relativeValue parameter.
	 *
	 * @param metric         Metric for its type the threshold has to be calculated.
	 * @param relativeValue  Value for which the threshold has to be calculated so
	 *                       that metric.getRelativeAmount()==relativeValue is true.
	 * @param isLowThreshold Determines if a low or high threshold is to be
	 *                       returned.
	 * @return Calculated threshold.
	 */

	public static double getThresholdValue(HMetric metric, HRelativeValueConstants relativeValue,
			boolean isLowThreshold) {

		final SortedSet<Double> veryLow = new TreeSet<>();
		SortedSet<Double> low = new TreeSet<>();
		SortedSet<Double> medium = new TreeSet<>();
		SortedSet<Double> high = new TreeSet<>();
		final SortedSet<Double> veryHigh = new TreeSet<>();

		final EList<HAnnotation> annotations = metric.getApg().getHAnnotations();
		final SortedSet<Double> keys = new TreeSet<>();
		for (final HAnnotation a : annotations) {
			if (metric.getClass().equals(a.getClass())) {
				final double key = ((HMetric) a).getValue();
				keys.add(key);
			}
		}

		for (final Double i : keys) {
			final double index = keys.headSet(i).size();
			final double q = (index + 1) / keys.size();

			if (q < 0.2) {
				veryLow.add(i);
			} else if (q < 0.4) {
				low.add(i);
			} else if (q < 0.6) {
				medium.add(i);
			} else if (q < 0.8) {
				high.add(i);
			} else {
				veryHigh.add(i);
			}
		}

		switch (relativeValue) {
		case VERY_LOW:
			if (low.isEmpty()) {
				if (!medium.isEmpty()) {
					low = medium;
				} else if (!high.isEmpty()) {
					low = high;
				} else {
					low = veryHigh;
				}
			}
			return calculateThresholdValue(isLowThreshold, null, low, 1);

		case LOW:
			if (medium.isEmpty()) {
				if (high.isEmpty()) {
					medium = high;
				} else {
					medium = veryHigh;
				}
			}
			return calculateThresholdValue(isLowThreshold, veryLow, medium, 1);

		case MEDIUM:
			if (high.isEmpty()) {
				high = veryHigh;
			}
			if (low.isEmpty()) {
				low = veryLow;
			}
			return calculateThresholdValue(isLowThreshold, low, high, 1);

		case HIGH:
			if (medium.isEmpty()) {
				if (!low.isEmpty()) {
					medium = low;
				} else {
					medium = veryLow;
				}
			}
			return calculateThresholdValue(isLowThreshold, medium, veryHigh, 1);

		case VERY_HIGH:
			if (high.isEmpty()) {
				if (!medium.isEmpty()) {
					high = medium;
				} else if (!low.isEmpty()) {
					high = low;
				} else {
					high = veryLow;
				}
			}
			return calculateThresholdValue(isLowThreshold, high, null, 1);

		default:
			throw new UnsupportedOperationException();
		}
	}

}