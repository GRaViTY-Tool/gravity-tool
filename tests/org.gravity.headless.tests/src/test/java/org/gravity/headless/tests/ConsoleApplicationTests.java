/**
 *
 */
package org.gravity.headless.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

import org.apache.commons.cli.ParseException;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.gravity.headless.ConsoleApplication;
import org.gravity.headless.GravityServer;
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

	private final PrintStream standardOut = System.out;
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
	 *
	 * @throws Exception
	 */
	@Test
	void testStartNoParams() throws Exception {
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
	 * Tests wheter the help is printed if requested
	 *
	 * @throws Exception
	 */
	@Test
	void testStartHelp() throws Exception {
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
	 * Tests that the server is not started without a given port
	 *
	 * @throws Exception
	 */
	@Test
	void testStartServerNoPort() throws Exception {
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
	 * @throws Exception
	 */
	@Test
	@Timeout(value = 30, unit = TimeUnit.SECONDS)
	void testStartBatchCusomCache() throws Exception {
		final var cache = new File("cache");
		final var cmn = "6";
		final var crn = "7";
		final var args = new String[] { "-s", "-p", "8080", "-c", cache.getAbsolutePath(), "-cmn", cmn, "-crn", crn };
		run(args, app -> {
			assertNotNull(app);
			final var server = getServer(app);
			assertNotNull(server);
			assertTrue(cache.exists());
			assertTrue(cache.delete());
			writeToInputStream("exit");
		});
	}

	/**
	 * Restores the standard output
	 */
	@AfterEach
	public void tearDown() {
		System.setOut(this.standardOut);
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
	private void run(final String[] args, final Consumer<ConsoleApplication> assertions) throws Exception {
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
		}
	}

}
