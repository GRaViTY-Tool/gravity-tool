/**
 *
 */
package org.gravity.headless.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

import javax.ws.rs.core.Response;

import org.apache.commons.cli.ParseException;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.gravity.eclipse.io.FileUtils;
import org.gravity.headless.ConsoleApplication;
import org.gravity.headless.GravityServer;
import org.gravity.headless.HeadlessActivator;
import org.gravity.headless.Messages;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.osgi.framework.Bundle;

/**
 * @author speldszus
 *
 */
class ConsoleApplicationTests {

	private static final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@BeforeEach
	public void setUp() {
		System.setOut(new PrintStream(this.outputStreamCaptor));
	}

	/**
	 * Test method for
	 * {@link org.gravity.headless.ConsoleApplication#start(org.eclipse.equinox.app.IApplicationContext)}.
	 *
	 * Tests the launch of the console application without parameters
	 */
	@Test
	void testStartNoParams() {
		final var args = new String[] {};
		run(args, app -> {
			assertNotNull(app);
			final var server = getServer(app);
			assertNull(server);
			assertHelpPrinted();
		});
	}

	/**
	 * Test method for
	 * {@link org.gravity.headless.ConsoleApplication#start(org.eclipse.equinox.app.IApplicationContext)}.
	 *
	 * Tests whether the help is printed if requested
	 */
	@Test
	void testStartHelp() {
		final var args = new String[] { "-h" };
		run(args, app -> {
			assertNotNull(app);
			final var server = getServer(app);
			assertNull(server);
			assertHelpPrinted();
		});
	}

	/**
	 * Test method for
	 * {@link org.gravity.headless.ConsoleApplication#start(org.eclipse.equinox.app.IApplicationContext)}.
	 *
	 * Tests whether the help is printed if requested
	 */
	@Test
	void testStartVersion() {
		final var args = new String[] { "-v" };
		run(args, app -> {
			assertNotNull(app);
			final var server = getServer(app);
			assertNull(server);
			final var output = this.outputStreamCaptor.toString();
			assertTrue(output.contains(HeadlessActivator.PLUGIN_ID+':'), "Expected a version string but got: \""+output+'\"');
		});
	}

	/**
	 * Test method for
	 * {@link org.gravity.headless.ConsoleApplication#start(org.eclipse.equinox.app.IApplicationContext)}.
	 *
	 * Tests that the server is not started without a given port
	 */
	@Test
	void testStartServerNoPort() {
		final var args = new String[] { "-s" };
		run(args, app -> {
			assertNotNull(app);
			final var server = getServer(app);
			assertNull(server);
			assertTrue(this.outputStreamCaptor.toString().contains("usage:"));
		});
	}

	/**
	 * Test method for
	 * {@link org.gravity.headless.ConsoleApplication#start(org.eclipse.equinox.app.IApplicationContext)}.
	 *
	 * Tests whether the server can be started and terminated from the console
	 *
	 * @throws IOException If the cache cannot be deleted after the test
	 */
	@Test
	@Timeout(value = 30, unit = TimeUnit.SECONDS)
	void testStartServerCusomCache() throws IOException {
		final var cache = new File("cache");
		final var cmn = "6";
		final var crn = "7";
		final var args = new String[] { "-s", "-p", "8080", "-c", cache.getAbsolutePath(), "-cmn", cmn, "-crn", crn };
		run(args, app -> {
			assertNotNull(app);
			final var server = getServer(app);
			assertNotNull(server);
			assertTrue(cache.exists());
			writeToInputStream("exit");
		});
		//Clean up
		Files.delete(cache.toPath());
	}

	/**
	 * Test method for
	 * {@link org.gravity.headless.ConsoleApplication#start(org.eclipse.equinox.app.IApplicationContext)}.
	 *
	 * Tests whether the server can be started and terminated from the console using logging
	 *
	 * @throws IOException If the cache cannot be deleted after the test
	 */
	@Test
	@Timeout(value = 30, unit = TimeUnit.SECONDS)
	void testStartServerLogging() throws IOException {
		final var cache = new File("cache");
		final var cmn = "6";
		final var crn = "7";
		final var logs = new File("logs");
		final var args = new String[] { "-s", "-p", "8080", "-c", cache.getAbsolutePath(), "-cmn", cmn, "-crn", crn, "-l", logs.getAbsolutePath() };
		run(args, app -> {
			assertNotNull(app);
			final var server = getServer(app);
			assertNotNull(server);
			assertTrue(cache.exists());
			try {
				final var connection = (HttpURLConnection) new URL("http://localhost:8080/pm/mvn").openConnection();
				connection.setRequestMethod("GET");
				assertEquals(Response.Status.BAD_REQUEST.getStatusCode(), connection.getResponseCode());
				assertTrue(logs.listFiles().length > 0);
			} catch (final IOException e) {
				fail(e.getLocalizedMessage());
			}
			finally {
				writeToInputStream("exit");
			}
		});
		//Clean up
		FileUtils.recursiveDelete(logs);
		FileUtils.recursiveDelete(cache);
	}

	/**
	 * Restores the standard output
	 */
	@AfterEach
	public void tearDown() {
		System.setOut(ConsoleApplicationTests.standardOut);
	}

	/**
	 * Asserts that the help content has been printed to the standard output
	 */
	private void assertHelpPrinted() {
		assertTrue(this.outputStreamCaptor.toString().contains("usage: " + ConsoleApplication.BIN));
	}

	/**
	 * Writes a message to the standard input stream
	 *
	 * @param message The message to be written
	 */
	private void writeToInputStream(final String message) {
		final var system = System.in;
		System.setIn(new ByteArrayInputStream(message.getBytes()));
		System.setIn(system);
	}

	/**
	 * Launches the console application with the given arguments and the executes a consumer, e.g., containing assertions for testing
	 *
	 * @param args The launch arguments
	 * @param assertions The consumer to which the launched application should be handed
	 * @throws Exception If the launch of the application failed
	 */
	private void run(final String[] args, final Consumer<ConsoleApplication> assertions) {
		final var app = new ConsoleApplication();
		try {
			final var thread = new Thread(() -> {
				try {
					final var start = app.start(new DummyApplicationContext(buildArgs(args)));
					assertEquals(IApplication.EXIT_OK, start);
				} catch (final IOException | ParseException e) {
					fail(e.getLocalizedMessage());
				}
			});
			thread.start();
			while (thread.isAlive()) {
				// Wait for batch mode to finish ...
				if (this.outputStreamCaptor.toString().contains(Messages.launched)) {
					// ... or for server being launched
					break;
				}
			}
			assertions.accept(app);
		} finally {
			app.stop();
		}
	}

	/**
	 * Builds a map containing the given arguments as application arguments
	 *
	 * @param args The arguments for the application
	 * @return The argument map
	 */
	private Map<String, Object> buildArgs(final String[] args) {
		final Map<String, Object> map = new HashMap<>();
		if (args != null) {
			map.put(IApplicationContext.APPLICATION_ARGS, args);
		} else {
			map.put(IApplicationContext.APPLICATION_ARGS, new String[0]);
		}
		return map;
	}

	private GravityServer getServer(final ConsoleApplication app) {
		GravityServer server = null;
		try {
			final var field = app.getClass().getDeclaredField("server");
			field.setAccessible(true);
			server = (GravityServer) field.get(app);
		} catch (final ReflectiveOperationException e) {
			fail("Couldn't get all information using Java reflection: " + e.getLocalizedMessage());
		}
		return server;
	}

	/**
	 * A dummy application context for launching the headless GRaViTY application.
	 * All information except the arguments are dropped.
	 *
	 * @author speldszus
	 *
	 */
	private static final class DummyApplicationContext implements IApplicationContext {
		private final Map<String, Object> args;

		public DummyApplicationContext(final Map<String, Object> args) {
			this.args = args;
		}

		@Override
		public void setResult(final Object result, final IApplication application) {
			// Not needed
		}

		@Override
		public String getBrandingProperty(final String key) {
			// Not needed
			return null;
		}

		@Override
		public String getBrandingName() {
			// Not needed
			return null;
		}

		@Override
		public String getBrandingId() {
			// Not needed
			return null;
		}

		@Override
		public String getBrandingDescription() {
			// Not needed
			return null;
		}

		@Override
		public Bundle getBrandingBundle() {
			// Not needed
			return null;
		}

		@Override
		public String getBrandingApplication() {
			// Not needed
			return null;
		}

		@Override
		public Map<String, Object> getArguments() {
			return this.args;
		}

		@Override
		public void applicationRunning() {
			// Not needed
		}
	}

}
