package org.gravity.metrics.sourcemeter;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.swing.JOptionPane;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * This class provides the functionality to execute SourceMeter and get values
 * of specific metrics
 *
 * https://www.sourcemeter.com/
 *
 * @author speldszus
 *
 */
public class MetricCalculator {

	private final HashMap<String, String[]> results = new HashMap<>();
	private final HashMap<String, String> unqualified = new HashMap<>();

	private static final Logger LOGGER = Logger.getLogger(MetricCalculator.class.getName());

	private static final String SRC_METER_FOLDER = "SrcMeter"; //$NON-NLS-1$
	private static final String ENV_VARIABLE_NAME = "SOURCE_METER_JAVA"; //$NON-NLS-1$

	/**
	 * This method executes sourcemater on a given location
	 *
	 * @param programLocation The location of the source code on which sourcemeter
	 *                        should be executed
	 * @param outputLocation  The location to which sourcemeter should write the
	 *                        results
	 * @return A object describing the results status
	 */
	public SourceMeterStatus calculateMetrics(File programLocation, File outputLocation) {
		final File sourcemeterOutputFolder = new File(outputLocation, SRC_METER_FOLDER);
		clear(sourcemeterOutputFolder);
		final String[] params = { "-projectName=" + SRC_METER_FOLDER, //$NON-NLS-1$
				"-projectBaseDir=" + programLocation.toString(), //$NON-NLS-1$
				"-resultsDir=" + outputLocation.toString() }; //$NON-NLS-1$

		final SourceMeterStatus status = run(MetricCalculator.ENV_VARIABLE_NAME, params);
		if (!SourceMeterStatus.OK.equals(status)) {
			return status;
		}

		final File[] sourcemeterJavaFolder = new File(sourcemeterOutputFolder, "java").listFiles(); //$NON-NLS-1$
		if (sourcemeterJavaFolder.length > 0) {
			final String[] files = { "SrcMeter-Class.csv", "SrcMeter-Enum.csv" };
			for (final String f : files) {
				final File metrics = new File(sourcemeterJavaFolder[0], f); // $NON-NLS-1$
				try (BufferedReader fileReader = Files.newBufferedReader(metrics.toPath())) {
					String line = fileReader.readLine();
					if (line == null) {
						LOGGER.log(Level.ERROR, "Sourcemeter metric file is empty");
						return SourceMeterStatus.ERROR;
					}
					while ((line = fileReader.readLine()) != null) {
						final String[] values = line.substring(1, line.length() - 1).split("\",\""); //$NON-NLS-1$
						this.results.put(values[2], values);
						this.unqualified.put(values[1], values[2]);
					}
				} catch (final IOException e) {
					LOGGER.log(Level.ERROR, e.getMessage(), e);
					return SourceMeterStatus.ERROR;
				}
			}
		} else {
			return SourceMeterStatus.ERROR;
		}

		return SourceMeterStatus.OK;
	}

	private SourceMeterStatus run(String exec, String[] params) {
		final String sourcemmeter = System.getenv(exec);
		if (sourcemmeter == null) {
			JOptionPane.showMessageDialog(null,
					"Please download sourcemeter from \"www.sourcemeter.com\" and set the environment variable \""
							+ ENV_VARIABLE_NAME + "\" to the path of the \"SourceMeterJava\" file.");
			return SourceMeterStatus.NOT_INSTALLED;
		}
		if (!new File(sourcemmeter).exists()) {
			LOGGER.warn("Sourcemeter is not installed at the specified location!");
			JOptionPane.showMessageDialog(null,
					"Sourcemeter is not installed at the specified location! Set the environment variable \""
							+ ENV_VARIABLE_NAME + "\" to the path of the \"SourceMeterJava\" file.");
			return SourceMeterStatus.NOT_INSTALLED;
		}

		final String[] cmd = new String[params.length + 1];
		cmd[0] = sourcemmeter;
		System.arraycopy(params, 0, cmd, 1, params.length);
		final Runtime run = Runtime.getRuntime();
		try {
			final Process process = run.exec(cmd);
			try (BufferedReader streamReader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
				String line;
				while ((line = streamReader.readLine()) != null) {
					LOGGER.log(Level.INFO, "> " + line); //$NON-NLS-1$
				}
			}
			try {
				process.waitFor();
			} catch (final InterruptedException e) {
				LOGGER.log(Level.ERROR, e.getMessage(), e);
				Thread.currentThread().interrupt();
			}
		} catch (final IOException e) {
			LOGGER.log(Level.ERROR, e.getMessage(), e);
			return SourceMeterStatus.ERROR;
		}
		return SourceMeterStatus.OK;
	}

	/**
	 * Returns the metric at the given index
	 *
	 * @param index The index of the metric
	 * @return A mapping between the class names and the according values of the
	 *         requested metric
	 */
	public HashMap<String, String> getMetrics(int index) {
		final HashMap<String, String> table = new HashMap<>();
		for (final Entry<String, String[]> entry : this.results.entrySet()) {
			table.put(entry.getKey(), entry.getValue()[index]);
		}
		return table;
	}

	/**
	 * Returns the metric at the given key
	 *
	 * @param key The key of the metric
	 * @return A mapping between the class names and the according values of the
	 *         requested metric
	 */
	public HashMap<String, String> getMetrics(SourcemeterMetricKeys key) {
		return getMetrics(key.getRow());
	}

	/**
	 * Returns the metric value of a specific class for the metric at the given
	 * index
	 *
	 * @param fullyqualifiedName The fully qualified name of the class
	 * @param index              The index of the metric
	 * @return A mapping between the class names and the according values of the
	 *         requested metric
	 * @throws UnknownClassException If the class cannot be found in the results
	 */
	public double getMetric(String fullyqualifiedName, int index) throws UnknownClassException {
		StringBuilder builder = new StringBuilder();
		final String[] split = fullyqualifiedName.split("\\."); //$NON-NLS-1$
		for (int i = 0; i < split.length; i++) {
			final int percent = split[i].indexOf('%');
			if (percent >= 0) {
				final String[] s = split[i].split("%");
				int j = 0;
				while (j < s.length) {
					builder = builder.append(s[j]);
					j += 2;
				}
			} else {
				builder = builder.append( split[i]);
			}
			if (i < split.length - 1) {
				builder = builder.append('.');
			}
		}

		String resolvedName = builder.toString();
		if (resolvedName.startsWith("(default package).")) {
			resolvedName = resolvedName.substring("(default package).".length());
		}

		String[] values = this.results.get(resolvedName);

		if (values == null) {
			if (this.unqualified.containsKey(resolvedName)) {
				final String string = this.unqualified.get(resolvedName);
				if (this.results.containsKey(string)) {
					values = this.results.get(string);
				} else {
					throw new UnknownClassException(resolvedName, string);
				}
			} else {
				throw new UnknownClassException("Unknown class: \"" + resolvedName + "\"");
			}
		}
		return Double.parseDouble(values[index]);
	}

	/**
	 * Returns the metric value of a specific class for a metric
	 *
	 * @param fullyQualifiedName The fully qualified name of the class
	 * @param key                The key of the metric
	 * @return A mapping between the class names and the according values of the
	 *         requested metric
	 * @throws UnknownClassException If the class cannot be found in the results
	 */
	public double getMetric(String fullyQualifiedName, SourcemeterMetricKeys key) throws UnknownClassException {
		return getMetric(fullyQualifiedName, key.getRow());
	}

	private boolean clear(File file) {
		boolean success = true;
		if (file.exists()) {
			for (final File f : file.listFiles()) {
				if (f.isDirectory()) {
					success &= (clear(f) && f.delete());
				} else {
					success &= f.delete();
				}
			}
		}
		return success;
	}
}
