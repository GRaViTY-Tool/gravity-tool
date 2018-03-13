package org.gravity.metrics.sourcemeter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Hashtable;

import org.eclipse.core.resources.IProject;

public class MetricPrinter {



	public static Hashtable<String, String> printSourcemeterMetrics(IProject project, File folder) {
		Hashtable<String, String> results = new Hashtable<String, String>();
		MetricCalculator metrics = new MetricCalculator();
		SourceMeterStatus status = metrics.calculateMetrics(project.getLocation().toFile(),
				new File(folder, "sourcemeter"));
		if (SourceMeterStatus.OK.equals(status)) {
			Hashtable<String, String> lcom5 = metrics.getMetrics(SourcemeterMetricKeys.LCOM5);
			double avgLCOM5 = 0;
			for (String value : lcom5.values()) {
				avgLCOM5 += Double.valueOf(value);
			}
			avgLCOM5 = avgLCOM5 / lcom5.size();
			results.put("lcom", Double.toString(avgLCOM5));
			Hashtable<String, String> cbo = metrics.getMetrics(SourcemeterMetricKeys.CBO);
			double avgCBO = 0;
			for (String value : cbo.values()) {
				avgCBO += Double.valueOf(value);
			}
			avgCBO = avgCBO / cbo.size();
			results.put("cbo", Double.toString(avgCBO));
			try {
				Files.write(new File(folder, "avgMetrics.txt").toPath(),
						("avg lcom5 = " + avgLCOM5 + "\navg CBO = " + avgCBO).getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return results;
	}
}
