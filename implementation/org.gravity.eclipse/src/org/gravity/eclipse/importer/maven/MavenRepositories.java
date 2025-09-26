package org.gravity.eclipse.importer.maven;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.apache.log4j.Logger;

public class MavenRepositories {

	private static final String[] REPOSITORIES = {
			"https://repo.maven.apache.org/maven2/",
			"https://maven.google.com/"
	};

	private static final Logger LOGGER = Logger.getLogger(MavenRepositories.class);

	private static MavenRepositories instance = new MavenRepositories();

	private final Map<String, Path> cache;

	private Path tmp;

	public MavenRepositories() {
		this.cache = new HashMap<>();
	}

	public static Path getDependencyJar(final String dependency) throws IOException {
		final var segements = dependency.split(":");
		if (segements.length != 3) {
			throw new IOException(
					"Dependency must be in the form groupId:artifactId:version, but was: " + dependency);
		}
		return getDependencyJar(segements[0], segements[1], segements[2]);
	}

	public static Path getDependencyJar(final String groupId, final String artifactId, final String version)
			throws IOException {
		try {
			return instance.cache(groupId, artifactId, version,
					k -> readFromMavenCentral(groupId, artifactId, version));
		} catch (final RuntimeException e) {
			if (e.getCause() instanceof final IOException ioe) {
				throw ioe;
			}
			throw e;
		}
	}

	private static Path readFromMavenCentral(final String groupId, final String artifactId, final String version) {
		final var jarName = artifactId + "-" + version + ".jar";
		for (final var repo : REPOSITORIES) {
			try (var inputStream = URI.create(
					repo + groupId.replace('.', '/') + "/" + artifactId + "/" + version + "/" + jarName)
					.toURL().openStream()) {
				final var tempFile = Paths.get(instance.tmp.toString(), artifactId + "-" + version + ".jar");
				Files.copy(inputStream, tempFile,
						StandardCopyOption.REPLACE_EXISTING);
				return tempFile;
			} catch (final IOException e) {
				LOGGER.error("Could not find " + groupId + ":" + artifactId + ":" + version + " in " + repo, e);
			}
		}
		throw new RuntimeException(new FileNotFoundException(
				"Could not find " + groupId + ":" + artifactId + ":" + version + " in any known repository."));
	}

	private Path cache(final String groupId, final String artifactId, final String version,
			final Function<? super String, ? extends Path> future) throws IOException {
		if (this.tmp == null) {
			this.tmp = Files.createTempDirectory("maven-repo-cache");
			this.tmp.toFile().deleteOnExit();
		}
		return this.cache.computeIfAbsent(groupId + ":" + artifactId + ":" + version, future);
	}
}