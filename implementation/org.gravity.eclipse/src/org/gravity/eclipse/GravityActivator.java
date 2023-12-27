package org.gravity.eclipse;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.Predicate;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
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
	public static final String GRAVITY_CONVERTER_EXTENSION_POINT_ID = "org.gravity.eclipse.converters"; //$NON-NLS-1$

	/** The plug-in ID. */
	public static final String PLUGIN_ID = "org.gravity.eclipse"; //$NON-NLS-1$

	/**
	 * The name of the gravity folder
	 */
	public static final String GRAVITY_FOLDER_NAME = ".gravity"; //$NON-NLS-1$

	/**
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
	private final Map<IProject, IPGConverterFactory> factories;

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
		this.factories = new HashMap<>();
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
			return this.converters.get(project);
		}
		final var converter = this.getNewConverter(project);
		converter.setDebug(this.isVerbose());
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
		IPGConverterFactory factory;
		if (this.factories.containsKey(project)) {
			factory = this.factories.get(project);
		} else {
			final var compatibleFactories = this.getCompatibleConverterFactories(project);
			if (compatibleFactories.isEmpty()) {
				throw new NoConverterRegisteredException();
			}
			factory = compatibleFactories.iterator().next();
		}
		final var converter = factory.createConverter(project);
		converter.setDebug(this.isVerbose());
		final var old = this.converters.put(project, converter);
		if ((old != null) && (old != converter)) {
			old.discard();
		}
		return converter;
	}

	public Collection<IPGConverterFactory> getCompatibleConverterFactories(final IProject project)
			throws CoreException {
		final var extensionRegistry = Platform.getExtensionRegistry();

		final var compatibleFactories = new LinkedList<IPGConverterFactory>();
		for (final var element : extensionRegistry.getConfigurationElementsFor(GRAVITY_CONVERTER_EXTENSION_POINT_ID)) {
			final var tmp = ((IPGConverterFactory) element.createExecutableExtension("class")); //$NON-NLS-1$
			if (tmp.supported(project)) {
				compatibleFactories.add(tmp);
			}
		}
		return compatibleFactories;
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

	private IFile getConverterSelectionFile(final IProject project, final NullProgressMonitor monitor)
			throws IOException {
		return EclipseProjectUtil.getGravityFolder(project, monitor).getFile(".converter");
	}

	public IPGConverterFactory setSelectedConverterFactory(final IProject project,
			final IPGConverterFactory converter) {
		try {
			final var monitor = new NullProgressMonitor();
			final var file = this.getConverterSelectionFile(project, monitor);

			try (var stream = new ByteArrayInputStream(converter.getClass().getName().getBytes())) {
				if (file.exists()) {
					file.setContents(stream, IResource.FORCE, monitor);
				} else {
					file.create(stream, IResource.FORCE, monitor);
				}
			}
		} catch (IOException | CoreException e) {
			LOGGER.error(e);
		}
		return this.factories.put(project, converter);
	}

	/**
	 * Gets the selected converter factory.
	 *
	 * @param project The project for which a converter has been selected
	 *
	 * @return the selected converter factory
	 */
	public IPGConverterFactory getSelectedConverterFactory(final IProject project) {
		return this.factories.computeIfAbsent(project, this::readFactory);
	}

	private IPGConverterFactory readFactory(final IProject project) {
		try {
			final var file = this.getConverterSelectionFile(project, new NullProgressMonitor());
			if (file.exists()) {
				try (var stream = new BufferedReader(new InputStreamReader(file.getContents()))) {
					final var line = stream.readLine();
					if (line != null && !line.isBlank()) {
						final var factoryClass = Class.forName(line);
						final var factory = (IPGConverterFactory) factoryClass.getDeclaredConstructor().newInstance();
						this.factories.put(project, factory);
						return factory;
					}
				}
			}
		} catch (final IOException | CoreException | ReflectiveOperationException e) {
			LOGGER.error(e);
		}
		return null;
	}

	public IPGConverterFactory getSuitableConverterFactory(final IProject project,
			final Predicate<IPGConverterFactory> constraint) {
		try {
			for (final var factory : this.getCompatibleConverterFactories(project)) {
				if (constraint.test(factory)) {
					return factory;
				}
			}
		} catch (final CoreException e) {
			LOGGER.error(e);
		}
		return null;
	}
}
