package org.gravity.headless;

import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Scanner;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.gravity.eclipse.io.FileUtils;

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
	private static final String OPTION_WORKSPACE_LOCATION = "data"; //$NON-NLS-1$

	private GravityServer server;

	@Override
	public Object start(final IApplicationContext context) throws IOException, ParseException {
		final var args = (String[]) context.getArguments().get(IApplicationContext.APPLICATION_ARGS);

		final CommandLineParser parser = new DefaultParser();
		final var options = getCLIOptions();
		final var line = parser.parse(options, args);
		if (line.hasOption(OPTION_HELP_SHORT)) {
			printHelp(options);
			return IApplication.EXIT_OK;
		}
		final var cache = initCache(line);

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
				this.server = GravityServer.launchServer(cache, crn, cmn, "localhost", port);
				System.out.println(Messages.launched);
				System.out.println(MessageFormat.format(Messages.runningOn, port));
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
	 * Scanns the standard input for the exit command and returns when the command has been entered
	 */
	private void waitForExit() {
		try(var scanner = new Scanner(System.in)){
			while(!"exit".equals(scanner.nextLine())) { //$NON-NLS-1$

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

		// Server mode specific
		opt.addOption(new Option(OPTION_SERVER_SHORT, OPTION_SERVER_LONG, false, Messages.explainOptionServer));

		final var portOption = new Option(OPTION_PORT_SHORT, OPTION_PORT_LONG, true, Messages.explainOptionPort);
		portOption.setRequired(false);
		opt.addOption(portOption);

		final var cacheOption = new Option(OPTION_CACHE_SHORT, OPTION_CACHE_LONG, true, Messages.explainOptionCache);
		cacheOption.setRequired(false);
		opt.addOption(cacheOption);

		final var cacheRepositoryNumberOption = new Option(OPTION_CRN_SHORT, OPTION_CRN_LONG, true, Messages.explainOptionCacheRepositoryNumber);
		cacheRepositoryNumberOption.setRequired(false);
		opt.addOption(cacheRepositoryNumberOption);

		final var cacheModelNumberOption = new Option(OPTION_CMN_SHORT, OPTION_CMN_LONG, true, Messages.explainOptionCacheModelNumber);
		cacheModelNumberOption.setRequired(false);
		opt.addOption(cacheModelNumberOption);

		return opt;
	}

	@Override
	public void stop() {
		if(this.server!=null) {
			this.server.stopServer();
		}
	}

}
