package org.gravity.eclipse.importer.gradle;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Level;
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
							GradleImport.LOGGER.log(Level.WARN, "The R.java does not exist: " + rFile.getAbsolutePath());
						}
					} else {
						GradleImport.LOGGER.log(Level.WARN, "No R.java file found");
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
					GradleImport.LOGGER.log(Level.WARN, "No \"release\" or \"debug\" folder in \"" + rFolder + "\"");
					return null;
				}
			}
			return new File(new File(releaseFolder, basePackage.replace('.', '/')), "R.java");
		} catch (ParserConfigurationException | SAXException e) {
			GradleImport.LOGGER.log(Level.ERROR, e);
		}
		return null;
	}

	static final String ANDROID_SDK_PLATFORMS = "platforms";

}
