package org.gravity.eclipse.importer.maven;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.gravity.eclipse.io.ExtensionFileVisitor;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * A class containing functionality for parsing pom files
 * 
 * @author speldszus
 *
 */
public class PomParser {

	private static final Logger LOGGER = Logger.getLogger(PomParser.class);

	/**
	 * Discovers new libs from the given pom file
	 * 
	 * @param pom       The pom file
	 * @param cacheFile A cache of already discovered libs
	 * @param results   A mapping between libs and their locations
	 * @param newLibs   The set of newly discovered libs
	 */
	public static void parsePomFile(File pom, File cacheFile, Hashtable<String, Path> results, HashSet<String> newLibs) {
		try {
			Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(pom);
			document.getDocumentElement().normalize();
			NodeList deps = document.getElementsByTagName("dependency");
			for (int i = 0; i < deps.getLength(); i++) {
				Set<String> libs = new HashSet<>();
				String dependency = getDependency(deps.item(i));
				libs.add(dependency);
				Hashtable<String, Path> subResults = PomParser.searchInCache(libs, cacheFile);
				if (subResults.isEmpty()) {
					if (!results.containsKey(dependency)) {
						newLibs.add(dependency);
					}
				} else {
					results.putAll(subResults);
				}
			}
		} catch (SAXException | IOException | ParserConfigurationException e) {
			LOGGER.log(Level.WARN, e);
		}
	}

	/**
	 * Creates a dependency string from a pom dependency node
	 * 
	 * @param dependency The dependency node
	 * @return The string representation
	 */
	private static String getDependency(Node dependency) {
		String group = null;
		String artifact = null;
		String version = null;
		NodeList childNodes = dependency.getChildNodes();
		for (int j = 0; j < childNodes.getLength(); j++) {
			Node child = childNodes.item(j);
			String nodeName = child.getNodeName();
			if ("groupId".equals(nodeName)) {
				group = child.getChildNodes().item(0).getNodeValue();
			} else if ("artifactId".equals(nodeName)) {
				artifact = child.getChildNodes().item(0).getNodeValue();
			} else if ("version".equals(nodeName)) {
				version = child.getChildNodes().item(0).getNodeValue();
			}
		}
		String string = group + ':' + artifact + ':' + version;
		return string;
	}

	/**
	 * Searches the given libs in the maven cache
	 * 
	 * @param libs The names of the libs
	 * @param cacheFile The location of the maven cache
	 * @return A mapping to the binaries in the cache
	 * @throws IOException if an I/O error is thrown by a visitor method walking through the cache location
	 * @throws IllegalAccessError If a library string doesn't has the expected amount of segments
	 */
	public static Hashtable<String, Path> searchInCache(Set<String> libs, File cacheFile) throws IOException, IllegalAccessError {
		Hashtable<String, Path> results = new Hashtable<>();
		HashSet<String> newLibs = new HashSet<>();
		for (String lib : libs) {
			String[] segments = lib.split(":");
			File libFile = cacheFile;
			String name;
			if (segments.length == 1) {
				name = segments[0];
			} else if (segments.length >= 3) {
				name = segments[1] + '-' + segments[2];
			} else {
				throw new IllegalAccessError("The lib \"" + lib + "\" doesn't has the expected amount of segments");
			}
			for (String segment : segments) {
				File tmpLibFile = new File(libFile, segment);
				if (tmpLibFile.exists()) {
					libFile = tmpLibFile;
				} else {
					libFile = new File(libFile, segment.replace('.', '/'));
				}
			}
			if (libFile.exists()) {
				ExtensionFileVisitor extensionFileVisitor = new ExtensionFileVisitor(Arrays.asList("jar", "aar"));
				Files.walkFileTree(libFile.toPath(), extensionFileVisitor);
				List<Path> files = extensionFileVisitor.getFiles();
				if (files.size() == 1) {
					Path libJar = files.get(0);
					results.put(lib, libJar);
					File pom = libJar.getParent().resolve(name + ".pom").toFile();
					if (pom.exists()) {
						parsePomFile(pom, cacheFile, results, newLibs);
					}
				}
			}
		}
		if (newLibs.size() > 0) {
			libs.addAll(newLibs);
		}
		return results;
	}

}
