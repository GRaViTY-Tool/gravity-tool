package org.gravity.headless.webapi.tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.gravity.typegraph.basic.TypeGraph;
import org.junit.jupiter.api.Test;

/**
 * Tests the Maven interface of the GRaViTY service
 *
 * @author speldszus
 *
 */
class WebApiMavenTests extends AbstractWebApiTests {

	private static final Logger LOGGER = Logger.getLogger(WebApiMavenTests.class);

	private static final String VERSION1 = "3.0.1";
	private static final String ARTIFACT1 = "jakarta.xml.ws-api";
	private static final String GROUP1 = "jakarta.xml.ws";

	@Test
	void testMvn() throws IOException {
		final var service = getService(this.cache);
		final var response = service.getPM4Mvn(GROUP1, ARTIFACT1, VERSION1, null);
		final var resource = getResource(response);
		assertFalse(resource.getContents().isEmpty());
		assertTrue(resource.getContents().get(0) instanceof TypeGraph);
	}

	@Test
	void testMvnCacheHit() throws IOException {
		final var start = System.currentTimeMillis();
		testMvn();
		final var mid = System.currentTimeMillis();
		testMvn();
		final var stop = System.currentTimeMillis();

		final var first = mid - start;
		final var second = stop - mid;
		LOGGER.info("First request: " + first + "ms");
		LOGGER.info("Second request: " + second + "ms");

		// We expect the cache hit to be substantial faster
		assertTrue(second < first);
	}

	@Test
	void testMvnCacheDrop() throws IOException {
		final var service = getService(this.cache);

		final var response1 = service.getPM4Mvn(GROUP1, ARTIFACT1, VERSION1, null);

		final var file = new File(
				new File(new File(new File(new File(this.cache, "mvn"), GROUP1), ARTIFACT1), VERSION1), "pm.xmi");
		assertTrue(file.exists(), "The model doesn't exist in the cache loaction afte rthe first run.");

		final var resource1 = getResource(response1);
		assertFalse(resource1.getContents().isEmpty());
		assertTrue(resource1.getContents().get(0) instanceof TypeGraph);

		final var response2 = service.getPM4Mvn("jakarta.annotation", "jakarta.annotation-api", "2.0.0", null);

		// We expect the old cache entry to be deleted
		assertFalse(file.exists());

		final var resource2 = getResource(response2);
		assertFalse(resource2.getContents().isEmpty());
		assertTrue(resource2.getContents().get(0) instanceof TypeGraph);
	}
}
