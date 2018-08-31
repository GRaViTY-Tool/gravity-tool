package org.gravity.metrics.sourcemeter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.Map.Entry;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import javax.swing.JOptionPane;

public class MetricCalculator {

	private Hashtable<String, String[]> results;
	private Hashtable<String, String> unqualified;

	private static final Logger LOGGER = Logger.getLogger( MetricCalculator.class.getName() );
	
	public MetricCalculator() {
		this.results = new Hashtable<>();
		this.unqualified = new Hashtable<>();
	}

	private static final String SRC_METER_FOLDER = "SrcMeter"; //$NON-NLS-1$
	public final String env_variable_name = "SOURCE_METER_JAVA"; //$NON-NLS-1$

	public SourceMeterStatus calculateMetrics(File program_location, File out_location) {
		File src_meter_folder = new File(out_location, SRC_METER_FOLDER);
		clear(src_meter_folder);
		String[] params = {"-projectName=" + SRC_METER_FOLDER, //$NON-NLS-1$
				"-projectBaseDir=" + program_location.toString(), //$NON-NLS-1$
				"-resultsDir=" + out_location.toString() }; //$NON-NLS-1$
		
		SourceMeterStatus status = run(this.env_variable_name, params);
		if(!SourceMeterStatus.OK.equals(status)){
			return status;
		}

		File[] java_folder = new File(src_meter_folder, "java").listFiles(); //$NON-NLS-1$
		if (java_folder.length > 0) {
			String[] files = {"SrcMeter-Class.csv", "SrcMeter-Enum.csv"} ;
			for(String f : files){
			File metrics = new File(java_folder[0], f); //$NON-NLS-1$
			try {
				BufferedReader file_reader = new BufferedReader(new FileReader(metrics));
				String line = file_reader.readLine();
				if (line == null) {
					file_reader.close();
					LOGGER.log(Level.ERROR, "Sourcemeter metric file is empty");
					return SourceMeterStatus.ERROR;
				}
				while ((line = file_reader.readLine()) != null) {
					String[] values = line.substring(1, line.length() - 1).split("\",\""); //$NON-NLS-1$
					this.results.put(values[2], values);
					this.unqualified.put(values[1], values[2]);
				}
				file_reader.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				return SourceMeterStatus.ERROR;
			} catch (IOException e) {
				e.printStackTrace();
				return SourceMeterStatus.ERROR;
			}
			}
		} else {
			return SourceMeterStatus.ERROR;
		}

		return SourceMeterStatus.OK;
	}

	public SourceMeterStatus run(String exec, String[] params) {
		String src_meter = System.getenv(exec);
		if (src_meter == null) {
			JOptionPane.showMessageDialog(null,
					"Please download sourcemeter from \"www.sourcemeter.com\" and set the environment variable \""
							+ env_variable_name + "\" to the path of the \"SourceMeterJava\" file.");
			return SourceMeterStatus.NOT_INSTALLED;
		}
		if(!new File(src_meter).exists()){
			LOGGER.log(Level.WARN, "Sourcemeter is not installed at the specified location!");
			JOptionPane.showMessageDialog(null,
					"Sourcemeter is not installed at the specified location! Set the environment variable \""
							+ env_variable_name + "\" to the path of the \"SourceMeterJava\" file.");
			return SourceMeterStatus.NOT_INSTALLED;
		}

		String[] cmd = new String[params.length+1];
		cmd[0] = src_meter;
		System.arraycopy(params, 0, cmd, 1, params.length);
		Runtime run = Runtime.getRuntime();
		try {
			Process process = run.exec(cmd);
			BufferedReader stream_reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line;
			while ((line = stream_reader.readLine()) != null) {
				LOGGER.log( Level.INFO, "> " + line); //$NON-NLS-1$
			}
			stream_reader.close();
			process.waitFor();
		} catch (IOException e) {
			e.printStackTrace();
			return SourceMeterStatus.ERROR;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return SourceMeterStatus.OK;
	}

	public Hashtable<String, String> getMetrics(int id) {
		Hashtable<String, String> table = new Hashtable<String, String>();
		for(Entry<String, String[]> entry : results.entrySet()){
			table.put(entry.getKey(), entry.getValue()[id]);
		}
		return table;
	}

	public Hashtable<String, String> getMetrics(SourcemeterMetricKeys key) {
		return getMetrics(key.getRow());
	}

	public double getMetric(String fullyqualified_name, int id) {
		String resolved_name = ""; //$NON-NLS-1$
		String[] split = fullyqualified_name.split("\\."); //$NON-NLS-1$
		for (int i = 0; i < split.length; i++) {
			int percent = split[i].indexOf('%');
			if (percent >= 0) {
				String[] s = split[i].split("%");
				int j = 0;
				while(j<s.length){
					resolved_name += s[j];
					j+=2;
				}
			} else {
				resolved_name += split[i];
			}
			if (i < split.length - 1) {
				resolved_name += '.';
			}
		}

		if(resolved_name.startsWith("(default package).")){
			resolved_name = resolved_name.substring("(default package).".length());
		}
		
		String[] values = this.results.get(resolved_name);

		if (values == null) {
			if(this.unqualified.containsKey(resolved_name)){
				String string = this.unqualified.get(resolved_name);
				if(this.results.containsKey(string)){
					values = this.results.get(string);
				}
				else{
					throw new RuntimeException("Unknown class: \""+resolved_name+"\" with qualified name \""+string+"\"");
				}
			}
			else{
				throw new RuntimeException("Unknown class: \""+resolved_name+"\"");
			}
		}
		return Double.parseDouble(values[id]);
	}

	public double getMetric(String fullyQualifiedName, SourcemeterMetricKeys key) {
		return getMetric(fullyQualifiedName, key.getRow());
	}

	private void clear(File file) {
		if (file.exists()) {
			for (File f : file.listFiles()) {
				if (f.isDirectory()) {
					clear(f);
					f.delete();
				} else {
					f.delete();
				}
			}
		}
	}
}
