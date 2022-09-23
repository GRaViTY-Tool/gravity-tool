package org.gravity.eclipse.importer.maven;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.gravity.eclipse.io.ExtensionFileVisitor;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

/**
 * A class containing functionality for parsing pom files.
 *
 * @author speldszus
 *
 */
public class PomParser {

	private static final Logger LOGGER = Logger.getLogger(PomParser.class);

	private final Map<String, Map<String, String>> variables;
	private final Map<String, Path> libraries;
	private final Set<String> seenPoms;
	private final Map<String, File> modules;

	private static final Pattern VARIABLE_PATTERN = Pattern.compile("\\$\\{(.*?)\\}");

	private final DocumentBuilder builder;

	private XPathExpression xGroupId;
	private XPathExpression xAartifactId;
	private XPathExpression xVersion;
	private XPathExpression xParent;

	private final Map<String, Map<String, String>> moduleProperties;

	private void initXPath() {
		final var xPathfactory = XPathFactory.newInstance();
		try {
			this.xGroupId = xPathfactory.newXPath()
					.compile("(project/groupId/text()|project/parent/groupId/text())[last()]");
			this.xAartifactId = xPathfactory.newXPath().compile("project/artifactId/text()");
			this.xVersion = xPathfactory.newXPath()
					.compile("(project/version/text()|project/parent/version/text())[last()]");
			this.xParent = xPathfactory.newXPath().compile("project/parent/artifactId/text()");
		} catch (final XPathExpressionException e) {
			LOGGER.error(e);
		}
	}

	public PomParser() throws ParserConfigurationException {
		this.builder = createDocumentBuilder();
		this.variables = new HashMap<>();
		this.libraries = new HashMap<>();
		this.seenPoms = new HashSet<>();
		this.modules = new HashMap<>();
		this.moduleProperties = new HashMap<>();
		initXPath();
	}

	public PomParser(final Collection<File> modulePoms) throws ParserConfigurationException {
		this();
		for (final File file : modulePoms) {
			try {
				final var id = getModuleID(file);
				this.modules.put(id, file);
			} catch (IOException | SAXException | XPathExpressionException e) {
				LOGGER.error(e);
			}
		}
	}

	private String getModuleID(final File pomFile) throws SAXException, IOException, XPathExpressionException {
		final var pom = this.builder.parse(pomFile);

		final var groupId = getGroupId(pom);
		final var artifactId = getArtifactId(pom);
		final var version = getVersion(pom);

		return groupId + ":" + artifactId + ":" + version;
	}

	private String getVersion(final Document pom) throws XPathExpressionException {
		return this.xVersion.evaluate(pom);
	}

	private String getArtifactId(final Document pom) throws XPathExpressionException {
		return this.xAartifactId.evaluate(pom);
	}

	private String getGroupId(final Document pom) throws XPathExpressionException {
		return this.xGroupId.evaluate(pom);
	}

	/**
	 * Discovers new libs from the given pom file and all referenced pom files
	 *
	 * @param pom       The pom file
	 * @param cacheFile A cache of already discovered libs
	 * @return A mapping between libs and their locations
	 */
	public Map<String, Path> parsePomFile(final File pom, final File cacheFile) {
		try {
			final var document = this.builder.parse(pom);
			document.getDocumentElement().normalize();
			getDependencies(document, cacheFile);
			return this.libraries;
		} catch (SAXException | IOException e) {
			LOGGER.warn(e);
		}
		return Collections.emptyMap();
	}

	/**
	 * Creates a new document builder for parsing pom files
	 *
	 * @return the builder
	 * @throws ParserConfigurationException
	 */
	public static DocumentBuilder createDocumentBuilder() throws ParserConfigurationException {
		final var factory = DocumentBuilderFactory.newInstance();
		factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
		factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");
		factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
		return factory.newDocumentBuilder();
	}

	/**
	 * Discovers new libs from the given pom file
	 *
	 * @param pom     The pom file
	 * @param results A mapping between libs and their locations
	 * @return The by now undiscovered libs
	 * @throws IOException
	 * @throws IllegalAccessError
	 */
	boolean getDependencies(final Document pom, final File cacheFile) throws IOException, IllegalAccessError {
		Map<String, String> properties;
		try {
			properties = getProperties(pom);
		} catch (final XPathExpressionException e) {
			LOGGER.error(e);
			return false;
		}

		var success = true;
		final var deps = pom.getElementsByTagName("dependency");
		for (var i = 0; i < deps.getLength(); i++) {
			final var item = deps.item(i);
			if (item.getNodeType() == 1) {
				final var scopeElement = ((Element) item).getElementsByTagName("scope");
				if ((scopeElement.getLength() == 0) || (!"system".equals(scopeElement.item(0).getTextContent()) && !"provided".equals(scopeElement.item(0).getTextContent())
						&& !"include".equals(scopeElement.item(0).getTextContent()))) {
					success &= getDependency(item, cacheFile, properties);
				}
			}
		}
		return success;
	}

	private Map<String, String> getProperties(final Document pom) throws XPathExpressionException {
		final var groupId = getGroupId(pom);
		final var artifactId = getArtifactId(pom);
		final var version = getVersion(pom);
		final var id = groupId + ":" + artifactId + ":" + version;

		final var properties = readAllVariables(id, pom);
		properties.put("project.groupId", groupId);
		properties.put("project.artifactId", artifactId);
		properties.put("project.version", version);

		final var parentArtifactId = this.xParent.evaluate(pom);
		if ((parentArtifactId != null) && !parentArtifactId.isBlank()) {
			final var parentId = groupId + ':' + parentArtifactId + ':' + version;
			final var parentProperties = getProperties(parentId);
			if(parentProperties != null) {
				for (final Entry<String, String> entry : parentProperties.entrySet()) {
					if (!properties.containsKey(entry.getKey())) {
						properties.put(entry.getKey(), entry.getValue());
					}
				}
			}
		}
		this.moduleProperties.put(id, properties);
		return properties;
	}

	/**
	 * Searches for the properties of a module
	 *
	 * @param moduleId The ID of the module
	 * @return the properties or null if none have been found
	 * @throws XPathExpressionException
	 */
	private Map<String, String> getProperties(final String moduleId)
			throws XPathExpressionException {
		final var parentProperties = this.moduleProperties.get(moduleId);
		if (parentProperties != null) {
			return parentProperties;
		}
		final var pomFile = this.modules.get(moduleId);
		if (pomFile != null) {
			try {
				final var parentPom = this.builder.parse(pomFile);
				return getProperties(parentPom);
			} catch (SAXException | IOException e) {
				LOGGER.error(e);
			}
		}
		return Collections.emptyMap();
	}

	private boolean getDependency(final Node item, final File cache, final Map<String, String> properties)
			throws IOException, IllegalAccessError {
		final var dependency = getResolvedDependency(item, properties);
		if (searchInCache(dependency, cache)) {
			return true;
		}
		final var jar = readLibFromMavenCentral(cache, dependency);
		if (jar.exists()) {
			this.libraries.put(dependency, jar.toPath());
			return true;
		}
		final var other = getAnyVersion(dependency, cache);
		final var success = (other != null) && other.exists();
		if (success) {
			this.libraries.put(dependency, other.toPath());
		}
		return success;
	}

	public File readLibFromMavenCentral(final File cache, final String dependency) throws MalformedURLException {
		final var folder = getFolderInCacheLocation(dependency.split(":"), cache);
		folder.mkdirs();
		final var path = cache.toPath().relativize(folder.toPath()).toString();
		final var fileName = folder.getParentFile().getName() + '-' + folder.getName() + ".jar";
		final var url = new URL("https://repo1.maven.org/maven2/" + path + '/' + fileName);
		final var jar = new File(folder, fileName);
		try (OutputStream out = new FileOutputStream(jar); InputStream in = new BufferedInputStream(url.openStream())) {
			final var buffer = new byte[1024];
			var count = 0;
			while ((count = in.read(buffer, 0, 1024)) != -1) {
				out.write(buffer, 0, count);
			}
		} catch (final IOException e) {
			LOGGER.error(e);
			try {
				Files.delete(jar.toPath());
			} catch (final IOException e1) {
				LOGGER.error("Cleanup failed!", e1);
			}
		}
		return jar;
	}

	/**
	 * Reads all properties from the pom file and puts them into the properties map
	 * under the given ID
	 *
	 * @param id  The module ID
	 * @param pom The pom file
	 * @return The properties contained in the pom file
	 */
	private Map<String, String> readAllVariables(final String id, final Document pom) {
		final var properties = this.variables.computeIfAbsent(id, s -> new HashMap<>());
		final var propertiesNode = pom.getElementsByTagName("properties");
		for (var i = 0; i < propertiesNode.getLength(); i++) {
			final var propertyNode = propertiesNode.item(i).getChildNodes();
			for (var j = 0; j < propertyNode.getLength(); j++) {
				final var entry = propertyNode.item(j);
				if (entry.getNodeType() == Node.ELEMENT_NODE) {
					properties.put(((Element) entry).getTagName(), entry.getTextContent());
				}
			}
		}
		return properties;
	}

	/**
	 * Creates a dependency string
	 *
	 * @param item       The dependency item from the pom file
	 * @param properties The properties of the pom file
	 * @return The dependency string with resolved properties
	 */
	private String getResolvedDependency(final Node item, final Map<String, String> properties) {
		var dependency = getDependency(item);
		var matcher = VARIABLE_PATTERN.matcher(dependency);
		while (matcher.find()) {
			final var variable = matcher.group(1);
			final var value = properties.get(variable);
			if (value != null) {
				dependency = dependency.replace(matcher.group(), value);
				matcher = VARIABLE_PATTERN.matcher(dependency);
			} else {
				LOGGER.error("Unresolved property " + matcher.group() + " in pom file!");
			}
		}
		return dependency;
	}

	/**
	 * Creates a dependency string from a pom dependency node
	 *
	 * @param dependency The dependency node
	 * @return The string representation
	 */
	private static String getDependency(final Node dependency) {
		String group = null;
		String artifact = null;
		String version = null;
		final var childNodes = dependency.getChildNodes();
		for (var j = 0; j < childNodes.getLength(); j++) {
			final var child = childNodes.item(j);
			final var nodeName = child.getNodeName();
			if ("groupId".equals(nodeName)) {
				group = child.getChildNodes().item(0).getNodeValue();
			} else if ("artifactId".equals(nodeName)) {
				artifact = child.getChildNodes().item(0).getNodeValue();
			} else if ("version".equals(nodeName)) {
				version = child.getChildNodes().item(0).getNodeValue();
			}
		}
		final var string = new StringBuilder().append(group).append(':').append(artifact);
		if (version != null) {
			string.append(':').append(version);
		}
		return string.toString();
	}

	/**
	 * Searches the given libs in the maven cache
	 *
	 * @param libs      The names of the libs
	 * @param cacheFile The location of the maven cache
	 * @return Whether there was a cache hit
	 * @throws IOException        if an I/O error is thrown by a visitor method
	 *                            walking through the cache location
	 * @throws IllegalAccessError If a library string doesn't has the expected
	 *                            amount of segments
	 */
	public boolean searchInCache(final String lib, final File cacheFile) throws IOException, IllegalAccessError {
		if (this.modules.containsKey(lib) || !this.seenPoms.add(lib)) {
			return true;
		}

		final Map<String, Path> results = new ConcurrentHashMap<>();
		final var pom = createPathToLibInCache(lib, cacheFile);
		if (pom.exists()) {
			if (isPomPackaging(pom)) {
				results.putAll(parsePomFile(pom, cacheFile));
				this.seenPoms.add(lib);
				return true;
			}

			final var libJar = getBinary(pom, "jar");
			if (libJar.exists()) {
				this.libraries.put(lib, libJar.toPath());
				this.seenPoms.add(lib);
				return true;
			}
		}
		return false;
	}

	private File getAnyVersion(final String dependency, final File cache) throws IOException {
		final var segments = dependency.split(":");
		var folder = getFolderInCacheLocation(segments, cache);
		if (segments.length > 2) {
			folder = folder.getParentFile();
		}
		final var extensionFileVisitor = new ExtensionFileVisitor(Arrays.asList("jar"));
		Files.walkFileTree(folder.toPath(), extensionFileVisitor);
		final var files = extensionFileVisitor.getFiles();
		if (files.isEmpty()) {
			return null;
		}
		return files.get(0).toFile();
	}

	private File getBinary(final File pom, final String ending) {
		final var name = pom.getName();
		return new File(pom.getParentFile(), name.substring(0, name.length() - 3) + ending);
	}

	private boolean isPomPackaging(final File pom) {
		try {
			final var doc = this.builder.parse(new FileInputStream(pom));
			final var xpath = XPathFactory.newInstance().newXPath();
			final var expr = xpath.compile("/project/packaging/text()='pom'");
			return (Boolean) expr.evaluate(doc, XPathConstants.BOOLEAN);
		} catch (SAXException | IOException | XPathExpressionException e) {
			LOGGER.error(e.getMessage(), e);
		}
		return false;
	}

	/**
	 * Searches a lib in the cache
	 *
	 * @param lib   A string representing the lib
	 * @param cache The cache in which the lib should be searched
	 * @return The lib
	 */
	private static File createPathToLibInCache(final String lib, final File cache) {
		final var segments = lib.split(":");
		final var libFile = getFolderInCacheLocation(segments, cache);
		final var name = segments.length == 1 ? segments[0] : segments[1];
		final var pom = new StringBuilder().append(name);
		if (segments.length > 2) {
			pom.append('-').append(segments[2]);
		}
		pom.append(".pom");
		return new File(libFile, pom.toString());
	}

	public static File getFolderInCacheLocation(final String[] segments, final File cache) {
		var libFile = createNextFileSegment(cache, segments[0]);
		if (segments.length > 1) {
			libFile = new File(libFile, segments[1]);
			if (segments.length > 2) {
				libFile = new File(libFile, segments[2]);
				if ((segments.length > 3) && LOGGER.isEnabledFor(Level.WARN)) {
					LOGGER.warn("Unhandeled segments: " + String.join(":", segments));
				}
			}
		}
		return libFile;
	}

	/**
	 * Adds the segment to the location
	 *
	 * @param file The known parent
	 * @param next The next segment
	 * @return The resulting location
	 */
	private static File createNextFileSegment(File file, final String next) {
		final var tmpLibFile = new File(file, next);
		if (tmpLibFile.exists()) {
			file = tmpLibFile;
		} else {
			file = new File(file, next.replace('.', '/'));
		}
		return file;
	}

	public Collection<Path> allPaths() {
		return this.libraries.values();
	}

	public Map<String, Path> libraries() {
		return new HashMap<>(this.libraries);
	}
}
