package org.gravity.hulk.ui.visualization.util;

import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.emf.common.util.EList;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.codesmells.HDataClassAccessor;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;

public class ThresholdCalculator {

	/**
	 * Calculates the low/high-threshold. If isLowThreshold is set, the method returns before.last() or lowestPossibleValue if before is null or empty.
	 * If isLowThreshold is false, the method returns after.first() or -1 if after is null or empty.
	 * @param isLowThreshold: true = low threshold, false = high threshold
	 * @param before needed for the low threshold
	 * @param after needed for the high threshold
	 * @param lowestPossibleValue default return-value
	 * @return low or high threshold
	 */
	private static double calculateThresholdValue(boolean isLowThreshold, SortedSet<Double> before, SortedSet<Double> after, double lowestPossibleValue) {

		if (isLowThreshold)
			if(before==null || before.size()==0)
				return lowestPossibleValue;
			else 
				return before.last();
		else {
			if (after == null||after.size()==0)
				return -1;
			else
				return after.first();
		}

	}
	/**
	 * Gets the low/high threshold value that a metric at least/at most needs to have in comparison to other metrics of the same type to achieve the relative
	 * amount of the relativeValue parameter.  
	 * @param metric Metric for its type the threshold has to be calculated.
	 * @param relativeValue Value for which the threshold has to be calculated so that metric.getRelativeAmount()==relativeValue is true.
	 * @param isLowThreshold Determines if a low or high threshold is to be returned.
	 * @return Calculated threshold.
	 */

	public static double getThresholdValue(HMetric metric, HRelativeValueConstants relativeValue,
			boolean isLowThreshold) {
		EList<HAnnotation> annotations = metric.getApg().getHAnnotations();
		SortedSet<Double> keys = new TreeSet<>();

		SortedSet<Double> very_low = new TreeSet<>();
		SortedSet<Double> low = new TreeSet<>();
		SortedSet<Double> medium = new TreeSet<>();
		SortedSet<Double> high = new TreeSet<>();
		SortedSet<Double> very_high = new TreeSet<>();

		for (HAnnotation a : annotations) {
			if (metric.getClass().equals(a.getClass())) {
				double key = ((HMetric) a).getValue();
				keys.add(key);
			}
		}

		for (Double i : keys) {
			double index = keys.headSet(i).size();
			double q = (index + 1) / keys.size();

			if (q < 0.2)
				very_low.add(i);
			else if (q < 0.4)
				low.add(i);
			else if (q < 0.6)
				medium.add(i);
			else if (q < 0.8)
				high.add(i);
			else
				very_high.add(i);
		}

		if (relativeValue == HRelativeValueConstants.VERY_LOW) {
			if (low.size() == 0)
				if (medium.size() != 0)
					low = medium;
				else if (high.size() != 0)
					low = high;
				else
					low = very_high;
			return calculateThresholdValue(isLowThreshold, null, low, 0);
		}
		if (relativeValue == HRelativeValueConstants.LOW) {
			if (medium.size() == 0)
				if (high.size() != 0)
					medium = high;
				else
					medium = very_high;
			return calculateThresholdValue(isLowThreshold, very_low, medium, 0);
		}
		if (relativeValue == HRelativeValueConstants.MEDIUM) {
			if (high.size() == 0)
				high = very_high;
			if (low.size() == 0)
				low = very_low;
			return calculateThresholdValue(isLowThreshold, low, high, 0);
		}
		if (relativeValue == HRelativeValueConstants.HIGH) {
			if (medium.size() == 0)
				if (low.size() != 0)
					medium = low;
				else
					medium = very_low;
			return calculateThresholdValue(isLowThreshold, medium, very_high, 0);
		}
		if (relativeValue == HRelativeValueConstants.VERY_HIGH) {
			if(high.size()==0)
				if(medium.size()!=0)
					high=medium;
				else if(low.size()!=0)
					high=low;
				else
					high=very_low;
			return calculateThresholdValue(isLowThreshold, high, null, 0);
		}

		return 0;
	}
	/**
	 * Gets the low/high threshold value that a HDataClassAccessor at least/at most needs to have in comparison to other metrics of the same type to achieve the relative
	 * amount of the relativeValue parameter.  
	 * @param metric Metric for its type the threshold has to be calculated.
	 * @param relativeValue Value for which the threshold has to be calculated so that HDataClassAccessor.getRelativeAmount()==relativeValue is true.
	 * @param isLowThreshold Determines if a low or high threshold is to be returned.
	 * @return Calculated threshold.
	 */

	public static double getThresholdValue(HDataClassAccessor metric, HRelativeValueConstants relativeValue,boolean isLowThreshold){
			EList<HAnnotation> annotations = metric.getApg().getHAnnotations();

			SortedSet<Double> keys = new TreeSet<>();

			SortedSet<Double> very_low = new TreeSet<>();
			SortedSet<Double> low = new TreeSet<>();
			SortedSet<Double> medium = new TreeSet<>();
			SortedSet<Double> high = new TreeSet<>();
			SortedSet<Double> very_high = new TreeSet<>();

			for (HAnnotation a : annotations) {
				if (metric.getClass().equals(a.getClass())) {
					double key = ((HMetric) a).getValue();
					keys.add(key);
				}
			}

			for (Double i : keys) {
				double index = keys.headSet(i).size();
				double q = (index + 1) / keys.size();

				if (q < 0.2)
					very_low.add(i);
				else if (q < 0.4)
					low.add(i);
				else if (q < 0.6)
					medium.add(i);
				else if (q < 0.8)
					high.add(i);
				else
					very_high.add(i);
			}

			if (relativeValue == HRelativeValueConstants.VERY_LOW) {
				if (low.size() == 0)
					if (medium.size() != 0)
						low = medium;
					else if (high.size() != 0)
						low = high;
					else
						low = very_high;
				return calculateThresholdValue(isLowThreshold, null, low, 1);
			}
			if (relativeValue == HRelativeValueConstants.LOW) {
				if (medium.size() == 0)
					if (high.size() != 0)
						medium = high;
					else
						medium = very_high;
				return calculateThresholdValue(isLowThreshold, very_low, medium, 1);
			}
			if (relativeValue == HRelativeValueConstants.MEDIUM) {
				if (high.size() == 0)
					high = very_high;
				if (low.size() == 0)
					low = very_low;
				return calculateThresholdValue(isLowThreshold, low, high, 1);
			}
			if (relativeValue == HRelativeValueConstants.HIGH) {
				if (medium.size() == 0)
					if (low.size() != 0)
						medium = low;
					else
						medium = very_low;
				return calculateThresholdValue(isLowThreshold, medium, very_high, 1);
			}
			if (relativeValue == HRelativeValueConstants.VERY_HIGH) {
				if(high.size()==0)
					if(medium.size()!=0)
						high=medium;
					else if(low.size()!=0)
						high=low;
					else
						high=very_low;
				return calculateThresholdValue(isLowThreshold, high, null, 1);
			}

			return 1;
	}

}