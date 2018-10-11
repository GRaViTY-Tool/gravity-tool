package org.gravity.metrics.sourcemeter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;

import org.eclipse.core.resources.IProject;

public class MetricPrinter {



	public static Hashtable<String, String> printSourcemeterMetrics(IProject project, File folder) {
		Hashtable<String, String> results = new Hashtable<String, String>();
		MetricCalculator metrics = new MetricCalculator();
		SourceMeterStatus status = metrics.calculateMetrics(project.getLocation().toFile(),
				new File(folder, "sourcemeter"));
		
		if (SourceMeterStatus.OK.equals(status)) {
			HashMap<String, String> lcom5 = metrics.getMetrics(SourcemeterMetricKeys.LCOM5);
			String avgLcom = average(lcom5.values());
			results.put("lcom", avgLcom);
			HashMap<String, String> cbo = metrics.getMetrics(SourcemeterMetricKeys.CBO);
			String avgCbo = average(cbo.values());
			results.put("cbo", avgCbo);
			try {
				Files.write(new File(folder, "avgMetrics.txt").toPath(),
						("avg lcom5 = " + avgLcom + "\navg CBO = " + avgCbo).getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return results;
	}

	private static String average(Collection<String> values) {
		double average = 0;
		for (String value : values) {
			average += Double.valueOf(value);
		}
		average = average / values.size();
		return Double.toString(average);
	}
}
