package org.gravity.headless.webapi.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.file.Files;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.gravity.eclipse.io.FileUtils;
import org.gravity.headless.GravityServer;
import org.gravity.typegraph.basic.TypeGraph;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Tests the launch and access of/to the GRaViTY server
 *
 * @author speldszus
 *
 */
public class ServerTests {

	private static GravityServer server;
	private static File cache;
	private static final String DOMAIN = "localhost";
	private static final int PORT = 8080;
	private static final String LOCATION_MVN = "/pm/mvn";

	/**
	 * Launches the GRaViTY REST API server
	 *
	 * @throws IOException
	 */
	@BeforeAll
	public static void launchServer() throws IOException {
		cache = Files.createTempDirectory("gravity-test").toFile();
		final var maxRepositories = 1;
		final var maxModels = 1;
		server = GravityServer.launchServer(cache, maxRepositories, maxModels, DOMAIN, PORT);
	}

	/**
	 * Tests an invalid access with no arguments
	 *
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	@Test
	void testMvnWebAPI_fail_noParams1() throws MalformedURLException, IOException {
		final var connection = GetConnectionBuilder.getConnection(null, null, null);
		assertEquals(400, connection.getResponseCode());
	}

	/**
	 * Tests an illegal access where only one argument is given
	 *
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	@Test
	void testMvnWebAPI_fail_noParams2() throws MalformedURLException, IOException {
		final var connection = GetConnectionBuilder.getConnection("", null, null);
		assertEquals(400, connection.getResponseCode());
	}

	/**
	 * Tests an illegal access where only two of three mandatory arguments are given
	 *
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	@Test
	void testMvnWebAPI_fail_noParams3() throws MalformedURLException, IOException {
		final var connection = GetConnectionBuilder.getConnection("", "", null);
		assertEquals(400, connection.getResponseCode());
	}

	/**
	 * Tests a valid request for creating a program model for a artifact in the maven standard repository
	 *
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	@Test
	void testMvnWebAPI_success() throws MalformedURLException, IOException {
		final var connection = GetConnectionBuilder.getConnection("jakarta.xml.ws", "jakarta.xml.ws-api", "3.0.1");

		assertEquals(200, connection.getResponseCode());

		final var resource = new ResourceSetImpl().createResource(URI.createURI("pm.xmi"));
		resource.load(connection.getInputStream(), Collections.emptyMap());

		assertFalse(resource.getContents().isEmpty());
		assertTrue(resource.getContents().get(0) instanceof TypeGraph);
	}

	/**
	 * Stops the server and deletes the cache
	 */
	@AfterAll
	public static void cleanup() {
		server.stopServer();
		FileUtils.recursiveDelete(cache);
	}

	/**
	 * A helper for building requests to the GRaViTY server
	 *
	 * @author speldszus
	 *
	 */
	private static class GetConnectionBuilder {

		private final StringBuilder path;
		private boolean paramAppended;

		/**
		 * Starts the building of a new request for a server at the given location
		 *
		 * @param location The location on the server, e.g, "/pm/mvn"
		 */
		public GetConnectionBuilder(final String location) {
			this.path = new StringBuilder().append(location);
			this.paramAppended = false;
		}

		/**
		 * Creates a new connection to the server to request an artifact from the maven standard repo
		 *
		 * @param group The group id of the artifact
		 * @param artifact The artifact's id
		 * @param version The artifact's version
		 * @return A connection to the server
		 * @throws IOException
		 * @throws MalformedURLException
		 * @throws ProtocolException
		 */
		private static HttpURLConnection getConnection(final String group, final String artifact,
				final String version) throws IOException, MalformedURLException, ProtocolException {
			final var builder = new GetConnectionBuilder(LOCATION_MVN);
			if (group != null) {
				builder.appendParam("groupId=", group);
			}
			if (artifact != null) {
				builder.appendParam("artifactId=", artifact);
			}
			if (version != null) {
				builder.appendParam("version=", version);
			}
			return builder.getConnection();
		}

		/**
		 * Opens the connection that has been built
		 *
		 * @return The opened connection
		 * @throws IOException
		 * @throws MalformedURLException
		 * @throws ProtocolException
		 */
		private HttpURLConnection getConnection() throws IOException, MalformedURLException, ProtocolException {
			final var connection = (HttpURLConnection) new URL("http", DOMAIN, PORT, this.path.toString())
					.openConnection();
			connection.setRequestMethod("GET");
			return connection;
		}

		/**
		 * Adds a parameter to the url
		 * @param key the parameter's key
		 * @param value the parameter's value
		 */
		private void appendParam(final String key,
				final String value) {
			if (this.paramAppended) {
				this.path.append('&');
			} else {
				this.path.append('?');
				this.paramAppended=true;
			}
			this.path.append(key).append(value);
		}
	}
}
