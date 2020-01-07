package org.gravity.hulk.help;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import org.gravity.hulk.antipatterngraph.HMetric;

public final class HSort {

	private HSort() {
		// This class shouldn't be instantiated
	}

	public static List<HMetric> sort(List<HMetric> v, BiFunction<HMetric, HMetric, Double> biFunction) {
		if (v.size() < 2) {
			return v;
		}

		final HMetric pivot = v.get(v.size() / 2);

		final List<HMetric> l = new LinkedList<>(
				sort(v.stream().filter(x -> biFunction.apply(x, pivot) < 0).collect(Collectors.toList()), biFunction));
		l.addAll(v.stream().filter(x -> biFunction.apply(x, pivot) == 0).collect(Collectors.toList()));
		l.addAll(sort(v.stream().filter(x -> biFunction.apply(x, pivot) > 0).collect(Collectors.toList()), biFunction));

		return l;
	}
}
