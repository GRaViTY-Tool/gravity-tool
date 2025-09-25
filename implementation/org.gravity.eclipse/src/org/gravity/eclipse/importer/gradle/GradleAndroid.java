package org.gravity.eclipse.importer.gradle;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.importer.maven.PomParser;
import org.xml.sax.SAXException;

/**
 * This class contains functionality to import Android projects
 *
 * @author speldszus
 *
 */
public final class GradleAndroid {

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
	static Set<Path> getRClasses(final Set<Path> buildDotGradleFiles) throws IOException {
		final Set<Path> classes = new HashSet<>();
		for (final Path buildDotGradle : buildDotGradleFiles) {
			final var manifestFile = new File(buildDotGradle.getParent().toFile(), "src/main/AndroidManifest.xml");
			if (manifestFile.exists()) {
				final var rFile = GradleAndroid.searchRClassInAdroidMainfest(manifestFile,
						buildDotGradle.getParent().toFile());
				if (rFile != null) {
					if (rFile.exists()) {
						classes.add(rFile.toPath());
					} else {
						LOGGER.warn("The R.java does not exist: " + rFile.getAbsolutePath());
					}
				} else {
					LOGGER.warn("No R.java file found");
				}
			}
		}
		return classes;
	}

	private static File searchRClassInAdroidMainfest(final File manifestFile, final File gradleRoot)
			throws IOException {
		final var factory = DocumentBuilderFactory.newInstance();
		factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
		factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");
		try {
			factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
			final var document = factory.newDocumentBuilder().parse(manifestFile);
			document.getDocumentElement().normalize();
			final var manifest = document.getElementsByTagName("manifest");
			final var attribute = manifest.item(0).getAttributes().getNamedItem("package");
			final var basePackage = attribute.getNodeValue();
			final var rFolder = new File(gradleRoot, "build/generated/source/r");
			var releaseFolder = new File(rFolder, "release");
			if (!releaseFolder.exists()) {
				releaseFolder = new File(rFolder, "debug");
				if (!releaseFolder.exists()) {
					LOGGER.warn("No \"release\" or \"debug\" folder in \"" + rFolder + "\"");
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
	 * Searched the ANDROID_HOME location
	 *
	 * @return The location of ANDROID_HOME
	 * @throws GradleImportException If the ANDROID_HOME cannot be found
	 */
	private static File initAndroidHome() throws GradleImportException {
		final var androidHome = System.getenv(ANDROID_HOME);
		if (androidHome != null) {
			final var tmpAndroidHome = new File(androidHome);
			if (tmpAndroidHome.exists()) {
				return tmpAndroidHome;
			}
		}
		final var tmpAndroidHome = new File(new File(System.getProperty(USER_HOME)), "Android/Sdk");
		if (tmpAndroidHome.exists()) {
			return tmpAndroidHome;
		} else {
			final var message = "Adroid home not specified.";
			LOGGER.warn(message);
			throw new GradleImportException(message);
		}

	}

	/**
	 * Searches the Android libraries
	 *
	 * @param dependencies The dependencies
	 * @return A mapping between the names of libraries and the jar files of the
	 *         libraries
	 * @throws GradleImportException If the search for the libraries in the Android
	 *                               SDK location failed
	 */
	static Map<String, Path> getAndroidLibs(final GradleDependencies dependencies) throws GradleImportException {
		final var sdkVersion = dependencies.getSdkVersion();
		final var pathsToLibs = new HashMap<String, Path>();
		if (sdkVersion == null) {
			throw new GradleImportException("Couldn't determine the SDK version information");
		}

		final var androidHome = initAndroidHome();

		var compAndroidSdk = false;
		final var platforms = new File(androidHome, ANDROID_SDK_PLATFORMS);
		for (var i = sdkVersion.getTargetSdk(); i >= sdkVersion.getMinSdk(); i--) {
			final var android = "android-" + i;
			final var androidPlatform = new File(platforms, android);
			final var androidJar = new File(androidPlatform, "android.jar");
			if (androidJar.exists()) {
				compAndroidSdk = addAndroidJarAndOptionalDependencies(dependencies, pathsToLibs, android,
						androidPlatform, androidJar);
				break;
			}
		}
		if (!compAndroidSdk) {
			LOGGER.warn("WARNING: Install android SDK " + sdkVersion.getTargetSdk());
			for (final File sdk : platforms.listFiles()) {
				final var name = sdk.getName();
				final var i = Integer.parseInt(name.substring("android-".length()));
				if (i > sdkVersion.getTargetSdk()) {
					pathsToLibs.put(name, new File(sdk, "android.jar").toPath());
					break;
				}
			}
		}
		return recursivelyAddCompileDependencies(dependencies, androidHome, pathsToLibs);
	}

	/**
	 * @param dependencies
	 * @param androidHome
	 * @param pathsToLibs
	 * @return
	 * @throws IllegalAccessError
	 * @throws GradleImportException
	 */
	public static Map<String, Path> recursivelyAddCompileDependencies(final GradleDependencies dependencies,
			final File androidHome, final Map<String, Path> pathsToLibs)
					throws IllegalAccessError, GradleImportException {
		var newLibs = false;
		do {
			final var compileLibs = dependencies.getCompileDependencies();
			for (final String location : new String[] { EXTRAS_ANDROID_M2REPOSITORY, EXTRAS_GOOGLE_M2REPOSITORY,
					EXTRAS_M2REPOSITORY }) {
				final var before = compileLibs.size();
				try {
					final var parser = new PomParser();
					for (final String lib : compileLibs) {
						if (parser.searchInCache(lib, new File(androidHome, location))) {
							pathsToLibs.putAll(parser.libraries());
						}
						newLibs |= compileLibs.size() > before;
						compileLibs.removeAll(pathsToLibs.keySet());
					}
				} catch (final IOException | ParserConfigurationException e) {
					throw new GradleImportException(e);
				}
			}
		} while (newLibs);
		return pathsToLibs;
	}

	/**
	 * @param dependencies
	 * @param pathsToLibs
	 * @param android
	 * @param androidPlatform
	 * @param androidJar
	 * @return
	 */
	public static boolean addAndroidJarAndOptionalDependencies(final GradleDependencies dependencies,
			final Map<String, Path> pathsToLibs, final String android, final File androidPlatform,
			final File androidJar) {
		boolean compAndroidSdk;
		compAndroidSdk = true;
		pathsToLibs.put(android, androidJar.toPath());

		final var optional = new File(androidPlatform, "optional");
		for (final String use : dependencies.getUseDependencies()) {
			final var lib = new File(optional, use + '.' + GravityActivator.FILE_EXTENSION_JAR);
			if (lib.exists()) {
				pathsToLibs.put(use, lib.toPath());
			} else {
				LOGGER.warn("UseLib dependency not resolved: " + use);
			}
		}
		return compAndroidSdk;
	}

}
