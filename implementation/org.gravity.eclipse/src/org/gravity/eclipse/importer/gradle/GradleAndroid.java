package org.gravity.eclipse.importer.gradle;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.gravity.eclipse.GravityActivator;
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

	private static final String ANDROID_HOME = "ANDROID_HOME";
	private static final String USER_HOME = "user.home";
	private static final String EXTRAS_M2REPOSITORY = "extras/m2repository";
	private static final String EXTRAS_GOOGLE_M2REPOSITORY = "extras/google/m2repository";
	private static final String EXTRAS_ANDROID_M2REPOSITORY = "extras/android/m2repository";
	private static final Logger LOGGER = Logger.getLogger(GradleAndroid.class);

	private GradleAndroid() {
		// This class shouldn't be instantiated
	}

	/**
	 * Searches for the generated R.java class in the gradle project
	 * 
	 * @param buildDotGradleFiles All build.gradle files of the gradle project
	 * @return The R.java classes
	 * @throws IOException If there was an error at reading one o the build.gradle
	 *                     files
	 */
	static Set<Path> getRClasses(Set<Path> buildDotGradleFiles) throws IOException {
		Set<Path> classes = new HashSet<Path>();
		for (Path buildDotGradle : buildDotGradleFiles) {
			File manifestFile = new File(buildDotGradle.getParent().toFile(), "src/main/AndroidManifest.xml");
			if (manifestFile.exists()) {
				File rFile = GradleAndroid.searchRClassInAdroidMainfest(manifestFile,
						buildDotGradle.getParent().toFile());
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
		return classes;
	}

	private static File searchRClassInAdroidMainfest(File manifestFile, File gradleRoot) throws IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
			Document document = factory.newDocumentBuilder().parse(manifestFile);
			document.getDocumentElement().normalize();
			NodeList manifest = document.getElementsByTagName("manifest");
			Node attribute = manifest.item(0).getAttributes().getNamedItem("package");
			String basePackage = attribute.getNodeValue();
			File rFolder = new File(gradleRoot, "build/generated/source/r");
			File releaseFolder = new File(rFolder, "release");
			if (!releaseFolder.exists()) {
				releaseFolder = new File(rFolder, "debug");
				if (!releaseFolder.exists()) {
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
				int value = Integer.parseInt(matcherSdk.group(6));
				double minSdk = sdkVersion.getMinSdk();
				if (Double.isNaN(minSdk) || minSdk > value) {
					sdkVersion.setMinSdk(value);
				}
			} else if ("targetSdkVersion".equals(group)) {
				int value = Integer.parseInt(matcherSdk.group(6));
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
		String androidHome = System.getenv(ANDROID_HOME);
		if (androidHome != null) {
			File tmpAndroidHome = new File(androidHome);
			if (tmpAndroidHome.exists()) {
				return tmpAndroidHome;
			}
		}
		File tmpAndroidHome = new File(new File(System.getProperty(USER_HOME)), "Android/Sdk");
		if (tmpAndroidHome.exists()) {
			return tmpAndroidHome;
		} else {
			String message = "Adroid home not specified.";
			LOGGER.log(Level.WARN, message);
			throw new GradleImportException(message);
		}

	}

	/**
	 * Searches the Android libraries
	 * 
	 * @param compileLibs The signatures of the compile libs
	 * @param useLibs     The signatures of the use libs
	 * @param sdkVersion  The SDK information for the project
	 * @return A mapping between the names of libraries and the jar files of the
	 *         libraries
	 * @throws GradleImportException If the search for the libraries in the Android
	 *                               SDK location failed
	 */
	static HashMap<String, Path> getAndroidLibs(Set<String> compileLibs, Set<String> useLibs, SdkVersion sdkVersion)
			throws GradleImportException {
		HashMap<String, Path> pathsToLibs = new HashMap<>();
		if (sdkVersion == null || Double.isNaN(sdkVersion.getTargetSdk()) || Double.isNaN(sdkVersion.getMinSdk())) {
			throw new GradleImportException("Couldn't determine the SDK version information");
		}

		File androidHome = initAndroidHome();

		boolean compAndroidSdk = false;
		File platforms = new File(androidHome, ANDROID_SDK_PLATFORMS);
		for (int i = (int) sdkVersion.getTargetSdk(); i >= (int) sdkVersion.getMinSdk(); i--) {
			String android = "android-" + i;
			File androidPlatform = new File(platforms, android);
			File androidJar = new File(androidPlatform, "android.jar");
			if (androidJar.exists()) {
				compAndroidSdk = true;
				pathsToLibs.put(android, androidJar.toPath());

				File optional = new File(androidPlatform, "optional");
				for (String use : useLibs) {
					File lib = new File(optional, use + '.'+GravityActivator.FILE_EXTENSION_JAR);
					if (lib.exists()) {
						pathsToLibs.put(use, lib.toPath());
					} else {
						LOGGER.log(Level.WARN, "UseLib dependency not resolved: " + use);
					}
				}
				break;
			}
		}
		if (!compAndroidSdk) {
			LOGGER.log(Level.WARN, "WARNING: Install android SDK " + sdkVersion.getTargetSdk());
			for (File sdk : platforms.listFiles()) {
				String name = sdk.getName();
				int i = Integer.parseInt(name.substring("android-".length()));
				if (i > sdkVersion.getTargetSdk()) {
					pathsToLibs.put(name, new File(sdk, "android.jar").toPath());
					break;
				}
			}
		}
		boolean newLibs = false;
		do {
			for (String location : new String[] { EXTRAS_ANDROID_M2REPOSITORY, EXTRAS_GOOGLE_M2REPOSITORY,
					EXTRAS_M2REPOSITORY }) {
				int before = compileLibs.size();
				try {
					pathsToLibs.putAll(PomParser.searchInCache(compileLibs, new File(androidHome, location)));
					newLibs |= compileLibs.size() > before;
					compileLibs.removeAll(pathsToLibs.keySet());
				} catch (IOException e) {
					throw new GradleImportException(e);
				}
			}
		} while (newLibs);

		return pathsToLibs;
	}

}
