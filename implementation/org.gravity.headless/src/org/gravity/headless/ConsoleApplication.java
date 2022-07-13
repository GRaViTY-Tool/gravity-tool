package org.gravity.headless;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.text.MessageFormat;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.eclipse.core.runtime.Platform;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.gravity.eclipse.io.FileUtils;
import org.gravity.headless.config.LoggingConfiguration;

/**
 * A console application of GRaViTY
 *
 * @author speldszus
 *
 */
public class ConsoleApplication implements IApplication {

	public static final String BIN = "gravity"; //$NON-NLS-1$
	public static final String OPTION_CMN_LONG = "cache-model-number"; //$NON-NLS-1$
	public static final String OPTION_CMN_SHORT = "cmn"; //$NON-NLS-1$
	public static final String OPTION_CRN_LONG = "cache-repository-number"; //$NON-NLS-1$
	public static final String OPTION_CRN_SHORT = "crn"; //$NON-NLS-1$
	public static final String OPTION_CACHE_LONG = "cache"; //$NON-NLS-1$
	public static final String OPTION_CACHE_SHORT = "c"; //$NON-NLS-1$
	public static final String OPTION_PORT_LONG = "port"; //$NON-NLS-1$
	public static final String OPTION_PORT_SHORT = "p"; //$NON-NLS-1$
	public static final String OPTION_SERVER_LONG = "server"; //$NON-NLS-1$
	public static final String OPTION_SERVER_SHORT = "s"; //$NON-NLS-1$
	public static final String OPTION_HELP_LONG = "help"; //$NON-NLS-1$
	public static final String OPTION_HELP_SHORT = "h"; //$NON-NLS-1$
	private static final String OPTION_LOG = "log";//$NON-NLS-1$
	private static final String OPTION_LOG_SHORT = "l";//$NON-NLS-1$
	private static final String OPTION_SAVE_FAILED = "save-failed";//$NON-NLS-1$
	private static final String OPTION_SAVE_FAILED_SHORT = "sf";//$NON-NLS-1$
	private static final String OPTION_WORKSPACE_LOCATION = "data"; //$NON-NLS-1$
	private static final String OPTION_VERSION = "version";//$NON-NLS-1$
	private static final String OPTION_VERSION_SHORT = "v";//$NON-NLS-1$

	private GravityServer server;

	@Override
	public Object start(final IApplicationContext context) throws IOException, ParseException {
		final var args = (String[]) context.getArguments().get(IApplicationContext.APPLICATION_ARGS);

		final CommandLineParser parser = new DefaultParser();
		final var options = getCLIOptions();
		final var line = parser.parse(options, args);

		setWorspaceLocation(line);

		if (line.hasOption(OPTION_VERSION_SHORT)) {
			System.out.println(
					HeadlessActivator.PLUGIN_ID + ':' + Platform.getBundle(HeadlessActivator.PLUGIN_ID).getVersion());
			if (args.length == 1) {
				return IApplication.EXIT_OK;
			}
		}
		if (line.hasOption(OPTION_HELP_SHORT)) {
			printHelp(options);
			return IApplication.EXIT_OK;
		}
		final var cache = initCache(line);
		final var log = intLog(line);

		if (line.hasOption(OPTION_SERVER_SHORT)) {
			// Run in server mode
			if (line.hasOption(OPTION_PORT_SHORT)) {
				final var port = Integer.parseInt(line.getOptionValue(OPTION_PORT_SHORT));
				var crn = -1;
				if (line.hasOption(OPTION_CRN_SHORT)) {
					crn = Integer.parseInt(line.getOptionValue(OPTION_CRN_SHORT));
				}

				var cmn = -1;
				if (line.hasOption(OPTION_CMN_SHORT)) {
					cmn = Integer.parseInt(line.getOptionValue(OPTION_CRN_SHORT));
				}
				this.server = GravityServer.launchServer(cache, log, crn, cmn, "localhost", port);
				System.out.println(Messages.launched);
				System.out.println(MessageFormat.format(Messages.runningOn, Integer.toString(port)));
				System.out.println(Messages.howtoShutdown);
				waitForExit();
				return IApplication.EXIT_OK;
			} else {
				System.err.println(Messages.noPort);
			}
		} else {
			// Run in batch mode
			System.out.println(Messages.batch);
		}
		printHelp(options);
		return IApplication.EXIT_OK;
	}

	/**
	 * Sets the workspace location to a temp directory if no location has been specified manually
	 *
	 * @param line The command line arguments
	 * @throws IOException If the workspace location cannot be set
	 */
	private void setWorspaceLocation(final CommandLine line) throws IOException {
		if(!line.hasOption(OPTION_WORKSPACE_LOCATION)) {
			final Set<PosixFilePermission> perms = new HashSet<>();
			// user permission
			perms.add(PosixFilePermission.OWNER_READ);
			perms.add(PosixFilePermission.OWNER_WRITE);
			perms.add(PosixFilePermission.OWNER_EXECUTE);
			// group permissions
			perms.add(PosixFilePermission.GROUP_READ);
			perms.add(PosixFilePermission.GROUP_EXECUTE);

			final var ws = Files.createTempDirectory("gravity-ws", PosixFilePermissions.asFileAttribute(perms));
			final var location = Platform.getInstanceLocation();
			if(!location.isSet()) {
				location.set(ws.toUri().toURL(), true);
			}
		}
	}

	/**
	 * Scanns the standard input for the exit command and returns when the command
	 * has been entered
	 */
	private void waitForExit() {
		try (var scanner = new Scanner(System.in)) {
			while (!scanner.hasNext() || !"exit".equals(scanner.nextLine())) { //$NON-NLS-1$

			}
		}
	}

	/**
	 * Initializes the cache according to the arguments on the command line
	 *
	 * @param line the parsed command line the application has been launched with
	 * @return The location of the initialized cache
	 * @throws IOException If the cache location cannot be initialized
	 */
	private File initCache(final CommandLine line) throws IOException {
		File cache;
		if (line.hasOption(OPTION_CACHE_SHORT)) {
			cache = new File(line.getOptionValue(OPTION_CACHE_SHORT));
			if (!cache.exists() && !cache.mkdirs()) {
				throw new IOException(Messages.createCacheFailed);
			}
		} else {
			cache = FileUtils.createTempDirectory("gravity-cache").toFile(); //$NON-NLS-1$
		}
		return cache;
	}

	/**
	 * Initializes the logging according to the arguments on the command line
	 *
	 * @param line the parsed command line the application has been launched with
	 * @return The configuration containing the location to which log files should be written
	 * @throws IOException If the log location cannot be initialized
	 */
	private LoggingConfiguration intLog(final CommandLine line) throws IOException {
		if (line.hasOption(OPTION_LOG_SHORT)) {
			final var log = new File(line.getOptionValue(OPTION_LOG_SHORT));
			if (!log.exists() && !log.mkdirs()) {
				throw new IOException(Messages.createLogFailed);
			}
			final var logfile = new File(log, "gravity-headless.log").getAbsolutePath();
			final var appender = new FileAppender(new SimpleLayout(), logfile, true);
			appender.setThreshold(Level.ERROR);
			Logger.getRootLogger().addAppender(appender);
			return new LoggingConfiguration(log, line.hasOption(OPTION_SAVE_FAILED_SHORT));
		}
		return LoggingConfiguration.NO_LOGGING;
	}

	/**
	 * Prints help for the given options
	 *
	 * @param options the options
	 */
	private void printHelp(final Options options) {
		new HelpFormatter().printHelp(BIN, options);
	}

	/**
	 * Defines the cli options of GRaViTY
	 */
	private static Options getCLIOptions() {
		final var opt = new Options();
		// General
		opt.addOption(OPTION_HELP_SHORT, OPTION_HELP_LONG, false, Messages.explainOptionHelp);
		opt.addOption(OPTION_WORKSPACE_LOCATION, true, Messages.explainOptionWorkspace);
		opt.addOption(OPTION_LOG_SHORT, OPTION_LOG, true, Messages.explainOptionLog);
		opt.addOption(OPTION_SAVE_FAILED_SHORT, OPTION_SAVE_FAILED, false, Messages.explainOptionSaveFailed);
		opt.addOption(OPTION_VERSION_SHORT, OPTION_VERSION, false, Messages.explainOptionVersion);

		// Server mode specific
		opt.addOption(new Option(OPTION_SERVER_SHORT, OPTION_SERVER_LONG, false, Messages.explainOptionServer));

		final var portOption = new Option(OPTION_PORT_SHORT, OPTION_PORT_LONG, true, Messages.explainOptionPort);
		portOption.setRequired(false);
		opt.addOption(portOption);

		final var cacheOption = new Option(OPTION_CACHE_SHORT, OPTION_CACHE_LONG, true, Messages.explainOptionCache);
		cacheOption.setRequired(false);
		opt.addOption(cacheOption);

		final var cacheRepositoryNumberOption = new Option(OPTION_CRN_SHORT, OPTION_CRN_LONG, true,
				Messages.explainOptionCacheRepositoryNumber);
		cacheRepositoryNumberOption.setRequired(false);
		opt.addOption(cacheRepositoryNumberOption);

		final var cacheModelNumberOption = new Option(OPTION_CMN_SHORT, OPTION_CMN_LONG, true,
				Messages.explainOptionCacheModelNumber);
		cacheModelNumberOption.setRequired(false);
		opt.addOption(cacheModelNumberOption);

		return opt;
	}

	@Override
	public void stop() {
		if (this.server != null) {
			this.server.stopServer();
		}
	}

}
