package org.gravity.headless.webapi.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;

import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.gravity.headless.Messages;
import org.gravity.typegraph.basic.TypeGraph;
import org.junit.jupiter.api.Test;

/**
 * Tests the git interface of the GRaViTY Server
 *
 * @author speldszus
 *
 */
class WebApiGitTests extends AbstractWebApiTests {

	private static final Logger LOGGER = Logger.getLogger(WebApiGitTests.class);

	/**
	 * Tests to create a program model for git repository containing a simple maven
	 * Java project
	 *
	 * @throws IOException
	 */
	@Test
	void testGitMvn() throws IOException {
		final var service = getService(this.cache);
		final var response1 = service.getPM4Git("https://github.com/GRaViTY-Tool/sample-maven-project.git",
				"2e89e222752e4d2ffc17666eb7ee89c449bf6862");
		final var resource1 = getResource(response1);
		assertFalse(resource1.getContents().isEmpty());
		assertTrue(resource1.getContents().get(0) instanceof TypeGraph);
	}

	/**
	 * Tests to create a program model for git repository containing a simple gradle
	 * Java project
	 *
	 * @throws IOException
	 */
	@Test
	void testGitGradle() throws IOException {
		final var service = getService(this.cache);
		final var response = service.getPM4Git("https://github.com/GRaViTY-Tool/sample-gradle-project.git",
				"1402375495783cd72b3aa8ab8a72282ebcef0cdd");
		final var resource = getResource(response);
		assertFalse(resource.getContents().isEmpty());
		assertTrue(resource.getContents().get(0) instanceof TypeGraph);
	}

	/**
	 * Tests to create a program model for git repository containing no supported
	 * project
	 *
	 * @throws IOException
	 */
	@Test
	void testGitUnknown() throws IOException {
		final var service = getService(this.cache);
		final var response = service.getPM4Git("https://github.com/GRaViTY-Tool/gravity-misc.git",
				"1920e688e90c75d8daa3ccd14863bfaf9c56296e");
		assertEquals(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), response.getStatus(),
				"Unexpected status code: " + response.getStatus());
		final var entity = response.getEntity();
		if (entity instanceof String) {
			assertEquals(Messages.errorNoSupportetBuildSystem, entity);
		} else {
			fail("Unknown response: " + entity);
		}
	}

	/**
	 * Tests to create a program model for git repository containing a simple maven
	 * Java project that has already been cached
	 *
	 * @throws IOException
	 */
	@Test
	void testGitCacheHit() throws IOException {
		final var start = System.currentTimeMillis();
		testGitMvn();
		final var mid = System.currentTimeMillis();
		testGitMvn();
		final var stop = System.currentTimeMillis();

		final var first = mid - start;
		final var second = stop - mid;
		LOGGER.info("First request: " + first + "ms");
		LOGGER.info("Second request: " + second + "ms");

		// We expect the cache hit to be substantial faster
		assertTrue(second < first);
	}
}
