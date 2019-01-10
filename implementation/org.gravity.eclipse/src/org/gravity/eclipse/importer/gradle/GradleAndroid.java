package org.gravity.eclipse.importer.gradle;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.regex.Matcher;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.gravity.eclipse.importer.maven.PomParser;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * This class contains functionality to import Android projects
 * 
 * @author speldszus
 *
 */
public class GradleAndroid {

	private static final Logger LOGGER = Logger.getLogger(GradleAndroid.class);

	/**
	 * Searches for the generated R.java class in the gradle project
	 * 
	 * @param buildDotGradleFiles All build.gradle files of the gradle project
	 * @return The R.java classes
	 * @throws IOException If there was an error at reading one o the build.gradle files
	 */
	static Set<Path> getRClasses(Set<Path> buildDotGradleFiles) throws IOException {
		Set<Path> classes = new HashSet<Path>();
		for (Path buildDotGradle : buildDotGradleFiles) {
			File mainFolder = new File(buildDotGradle.getParent().toFile(), "src/main");
			if (mainFolder.exists() && mainFolder.isDirectory()) {
				File manifestFile = new File(mainFolder, "AndroidManifest.xml");
				if (manifestFile.exists()) {
					File rFile = GradleAndroid.searchRClassInAdroidMainfest(manifestFile, buildDotGradle.getParent().toFile());
	
					if (rFile != null) {
						if (rFile.exists()) {
							classes.add(rFile.toPath());
						} else {
							LOGGER.log(Level.WARN, "The R.java does not exist: " + rFile.getAbsolutePath());
						}
					} else {
						LOGGER.log(Level.WARN, "No R.java file found");
					}
				}
			}
		}
		return classes;
	}

	private static File searchRClassInAdroidMainfest(File manifestFile, File gradleRoot) throws IOException {
		try {
			Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(manifestFile);
			document.getDocumentElement().normalize();
			NodeList manifest = document.getElementsByTagName("manifest");
			Node attribute = manifest.item(0).getAttributes().getNamedItem("package");
			String basePackage = attribute.getNodeValue();
			File rFolder = new File(gradleRoot, "build/generated/source/r");
			File releaseFolder;
			if (!(releaseFolder = new File(rFolder, "release")).exists()) {
				if (!(releaseFolder = new File(rFolder, "debug")).exists()) {
					LOGGER.log(Level.WARN, "No \"release\" or \"debug\" folder in \"" + rFolder + "\"");
					return null;
				}
			}
			return new File(new File(releaseFolder, basePackage.replace('.', '/')), "R.java");
		} catch (ParserConfigurationException | SAXException e) {
			LOGGER.log(Level.ERROR, e);
		}
		return null;
	}

	static final String ANDROID_SDK_PLATFORMS = "platforms";

	/**
	 * Determines the SDK version information of the android project described in
	 * the gradle build file
	 * 
	 * @param gradleContent The content of the gradle build file
	 * @return The SDK version information
	 */
	static SdkVersion getAndroidSdkVersion(String gradleContent) {
		SdkVersion sdkVersion = new SdkVersion();
		Matcher matcherSdk = GradleRegexPatterns.ANDROID_SDK_VERSION.matcher(gradleContent);
		while (matcherSdk.find()) {
			String group = matcherSdk.group(1);
			if ("minSdkVersion".equals(group)) {
				int value = Integer.valueOf(matcherSdk.group(6));
				double minSdk = sdkVersion.getMinSdk();
				if (Double.isNaN(minSdk) || minSdk > value) {
					sdkVersion.setMinSdk(value);
				}
			} else if ("targetSdkVersion".equals(group)) {
				int value = Integer.valueOf(matcherSdk.group(6));
				double targetSdk = sdkVersion.getTargetSdk();
				if (Double.isNaN(targetSdk) || targetSdk < value) {
					sdkVersion.setTargetSdk(value);
				}
			}
		}
		return sdkVersion;
	}

	/**
	 * Searched the ANDROID_HOME location
	 * 
	 * @return The location of ANDROID_HOME
	 * @throws GradleImportException If the ANDROID_HOME cannot be found
	 */
	private static File initAndroidHome() throws GradleImportException {
		String androidHome = System.getenv("ANDROID_HOME");
		if (androidHome != null) {
			File tmpAndroidHome = new File(androidHome);
			if (tmpAndroidHome.exists()) {
				return tmpAndroidHome;
			}
		}
		File tmpAndroidHome = new File(new File(System.getProperty("user.home")), "Android/Sdk");
		if (tmpAndroidHome.exists()) {
			return tmpAndroidHome;
		} else {
			String message = "Adroid home not specified.";
			GradleImport.LOGGER.log(Level.WARN, message);
			throw new GradleImportException(message);
		}
	
	}

	/**
	 * Searches the Android libraries
	 * 
	 * @param compileLibs The signatures of the compile libs
	 * @param useLibs     The signatures of the use libs
	 * @param sdkVersion  The SDK information for the project
	 * @return The jar files of the libraries
	 * @throws GradleImportException If the search for the libraries in the Android
	 *                               SDK location failed
	 */
	static Set<Path> getAndroidLibs(Set<String> compileLibs, Set<String> useLibs, SdkVersion sdkVersion)
			throws GradleImportException {
		Hashtable<String, Path> pathsToLibs;
		if (sdkVersion == null || Double.isNaN(sdkVersion.getTargetSdk()) || Double.isNaN(sdkVersion.getMinSdk())) {
			throw new GradleImportException("Couldn't determine the SDK version information");
		}
	
		File androidHome = initAndroidHome();
	
		boolean compAndroidSdk = false;
		File platforms = new File(androidHome, ANDROID_SDK_PLATFORMS);
		Set<Path> libsAsJar = new HashSet<>();
		for (int i = (int) sdkVersion.getTargetSdk(); i >= (int) sdkVersion.getMinSdk(); i--) {
			File androidPlatform = new File(platforms, "android-" + i);
			File androidJar = new File(androidPlatform, "android.jar");
			if (androidJar.exists()) {
				compAndroidSdk = true;
				libsAsJar.add(androidJar.toPath());
	
				File optional = new File(androidPlatform, "optional");
				for (String use : useLibs) {
					File lib = new File(optional, use + ".jar");
					if (lib.exists()) {
						libsAsJar.add(lib.toPath());
					} else {
						GradleImport.LOGGER.log(Level.WARN, "UseLib dependency not resolved: " + use);
					}
				}
				break;
			}
		}
		if (!compAndroidSdk) {
			GradleImport.LOGGER.log(Level.WARN, "WARNING: Install android SDK " + sdkVersion.getTargetSdk());
			for (File sdk : platforms.listFiles()) {
				int i = Integer.valueOf(sdk.getName().substring("android-".length()));
				if (i > sdkVersion.getTargetSdk()) {
					libsAsJar.add(new File(sdk, "android.jar").toPath());
					break;
				}
			}
		}
		boolean newLibs = false;
		do {
			for (String location : new String[] { "extras/android/m2repository", "extras/google/m2repository",
					"extras/m2repository" }) {
				int before = compileLibs.size();
				try {
					pathsToLibs = PomParser.searchInCache(compileLibs, new File(androidHome, location));
					newLibs |= compileLibs.size() > before;
					compileLibs.removeAll(pathsToLibs.keySet());
					libsAsJar.addAll(pathsToLibs.values());
				} catch (IOException e) {
					throw new GradleImportException(e);
				}
			}
		} while (newLibs);
	
		return libsAsJar;
	}

}
