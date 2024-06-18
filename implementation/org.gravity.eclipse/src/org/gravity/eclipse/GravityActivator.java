package org.gravity.eclipse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.converter.IPGConverterFactory;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle of the GRaViTY main
 * plugin.
 */
public class GravityActivator extends Plugin {

	/** The ID of the extensionpoint where converters are registered. */
	private static final String GRAVITY_CONVERTER_EXTENSION_POINT_ID = "org.gravity.eclipse.converters"; //$NON-NLS-1$

	/** The plug-in ID. */
	public static final String PLUGIN_ID = "org.gravity.eclipse"; //$NON-NLS-1$

	/**
	 * The name of the gravity folder
	 */
	public static final String GRAVITY_FOLDER_NAME = ".gravity"; //$NON-NLS-1$
	public static final String GRAVITY_QUICKFIX_FOLDER_NAME = "quickfixcache";

	/*
	 * File extensions
	 */
	public static final String FILE_EXTENSION_JAVA = "java"; //$NON-NLS-1$
	public static final String FILE_EXTENSION_XMI = "xmi"; //$NON-NLS-1$
	public static final String FILE_EXTENSION_JAR = "jar";

	/** The shared instance. */
	private static GravityActivator plugin;

	/** The verbose state (not only for this plugin). */
	private boolean verbose;

	/*
	 * Handling of SRC to PG converters
	 */

	/** The converters for java projects (project name as key). */
	private final Map<IProject, IPGConverter> converters;

	/** The selected converter factory. */
	private IPGConverterFactory factory;

	/** A listener for changes in java files */
	private IResourceChangeListener listener;

	public static final boolean MEASURE_PERFORMANCE = true;

	private static final Logger LOGGER = Logger.getLogger(GravityActivator.class);

	/**
	 * At startup all tables will be initialized empty. Currently no old states are
	 * loaded.
	 */
	public GravityActivator() {
		this.converters = new HashMap<>();
	}

	/**
	 * @see org.eclipse.core.runtime.Plugin#start(org.osgi.framework.BundleContext)
	 *
	 *      Additionally a java source code to PG transformation is loaded from the
	 *      extension point "org.gravity.eclipse.converters".
	 */
	@Override
	public void start(final BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

		this.listener = event -> {
			final var resource = event.getResource();
			if ((resource != null) && (resource.getType() == IResource.PROJECT)
					&& GravityActivator.this.converters.containsKey(resource)
					&& (event.getType() == IResourceChangeEvent.PRE_DELETE)) {
				GravityActivator.this.converters.remove(resource);

			}
		};
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this.listener);
	}

	/**
	 * Selects the first converter registered at "org.gravity.eclipse.converters"
	 *
	 * @throws NoConverterRegisteredException If no converter has been registered at
	 *                                        the extension point
	 * @throws CoreException                  If the extension point couldn't be
	 *                                        read
	 */
	private boolean initializeSelectedConverter() throws NoConverterRegisteredException, CoreException {
		final var extensionRegistry = Platform.getExtensionRegistry();
		final var configurationElements = extensionRegistry
				.getConfigurationElementsFor(GRAVITY_CONVERTER_EXTENSION_POINT_ID);
		if (configurationElements.length <= 0) {
			throw new NoConverterRegisteredException();
		}
		this.factory = ((IPGConverterFactory) configurationElements[0].createExecutableExtension("class")); //$NON-NLS-1$
		return this.factory != null;
	}

	/**
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 *
	 *      Additionally change listeners are removed
	 */
	@Override
	public void stop(final BundleContext context) throws Exception {
		final IProgressMonitor monitor = new NullProgressMonitor();
		for (final IPGConverter converter : this.converters.values()) {
			converter.save(monitor);
			converter.discard();
		}
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this.listener);
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance of this activator class.
	 *
	 * @return the shared instance
	 */
	public static GravityActivator getDefault() {
		return plugin;
	}

	/**
	 * Checks if the plugin is in verbose mode.
	 *
	 * @return true, if is verbose is enabled
	 */
	public boolean isVerbose() {
		return this.verbose;
	}

	/**
	 * Sets the verbose mode.
	 *
	 * @param verbose the new verbose state
	 */
	public void setVerbose(final boolean verbose) {
		this.verbose = verbose;
		for (final IPGConverter converter : this.converters.values()) {
			converter.setDebug(verbose);
		}
	}

	/**
	 * Returns the selected converter or a new converter for an eclipse project.
	 *
	 * @param project the project
	 * @return the converter
	 *
	 * @throws NoConverterRegisteredException If no converter has been registered at
	 *                                        the extension point
	 * @throws CoreException                  If the extension point couldn't be
	 *                                        read
	 */
	public IPGConverter getConverter(final IProject project) throws NoConverterRegisteredException, CoreException {
		if (this.converters.containsKey(project)) {
			final var converter = this.converters.get(project);
			if (this.factory.belongsToFactory(converter)) {
				return converter;
			}
		}
		final var converter = getNewConverter(project);
		converter.setDebug(isVerbose());
		return converter;
	}

	/**
	 * Discards the converter used to convert the given project and all unsaved
	 * artifacts created during conversion
	 *
	 * @param project The project for which an converter has been created
	 * @return true iff the converter has been discarded
	 */
	public boolean discardConverter(final IProject project) {
		final var converter = this.converters.remove(project);
		if (converter != null) {
			return converter.discard();
		}
		return true;
	}

	/**
	 * Returns always a new converter for an eclipse project.
	 *
	 * @param project the project
	 * @return the converter
	 *
	 * @throws NoConverterRegisteredException If no converter has been registered at
	 *                                        the extension point
	 * @throws CoreException                  If the extension point couldn't be
	 *                                        read
	 */
	public IPGConverter getNewConverter(final IProject project) throws NoConverterRegisteredException, CoreException {
		final var converter = getSelectedConverterFactory().createConverter(project);
		converter.setDebug(isVerbose());
		final var old = this.converters.put(project, converter);
		if ((old != null) && (old != converter)) {
			old.discard();
		}
		return converter;
	}

	/**
	 * Sets the selected converter factory.
	 *
	 * @param factory the new selected converter factory
	 */
	public void setSelectedConverterFactory(final IPGConverterFactory selectedConverterFactory) {
		this.factory = selectedConverterFactory;
	}

	/**
	 * Gets the selected converter factory.
	 *
	 * @return the selected converter factory
	 *
	 * @throws NoConverterRegisteredException If no converter has been registered at
	 *                                        the extension point
	 * @throws CoreException                  If the extension point couldn't be
	 *                                        read
	 */
	public IPGConverterFactory getSelectedConverterFactory() throws NoConverterRegisteredException, CoreException {
		if ((this.factory == null) && !initializeSelectedConverter()) {
			throw new NoConverterRegisteredException();
		}
		return this.factory;
	}

	private static String measureRecordsKey;
	private static String measureLocation = "../measurements";

	public static void recordMessage(final String string) {
		if (measureRecordsKey == null) {
			LOGGER.error("No key for recording set");
			return;
		}
		LOGGER.info(string);
		try {
			final var path = Paths.get(measureLocation, measureRecordsKey, "data.txt");
			final var file = path.getParent().toFile();
			if (!file.exists() && !file.mkdirs()) {
				throw new IOException("Couldn't create folder: " + path.getParent());
			}
			Files.write(path, (string + '\n').getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		} catch (final IOException e) {
			LOGGER.error(e);
		}
	}

	public static void setRecordKey(final String key) {
		GravityActivator.measureRecordsKey = key;
	}

	public static void setMeasurementsLocation(final String path) {
		measureRecordsKey = path;
	}

	public static IFolder getProgramModelFolder(final IProject project, final IProgressMonitor monitor)
			throws IOException {
		return EclipseProjectUtil.getGravityFolder(project, monitor).getFolder("pm");
	}
}
