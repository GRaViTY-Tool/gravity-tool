package org.gravity.eclipse;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.ecore.EObject;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.converter.IPGConverterFactory;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
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

	/*
	 * File extensions
	 */
	public static final String FILE_EXTENSION_JAVA = "java"; //$NON-NLS-1$
	public static final String FILE_EXTENSION_XMI = "xmi"; //$NON-NLS-1$
	public static final String FILE_EXTENSION_JAR = "jar";

	/** The shared instance. */
	private static GravityActivator plugin;

	/** All known source models with project name as key. */
	private final HashMap<String, EObject> sources;

	/** All target models (PGs) with project name as key. */
	private final HashMap<String, EObject> targets;

	/** All converted projects with project name as key */
	private final Map<String, IProject> project;

	/** The verbose state (not only for this plugin). */
	private boolean verbose = false;

	/*
	 * Handling of SRC to PG converters
	 */

	/** The converters for java projects (project name as key). */
	private final HashMap<String, IPGConverter> converters;

	/** The selected converter factory. */
	private IPGConverterFactory selectedConverterFactory;

	/** A listener for changes in java files */
	private IResourceChangeListener listener;

	/**
	 * At startup all tables will be initialized empty. Currently no old states are
	 * loaded.
	 */
	public GravityActivator() {
		this.sources = new HashMap<>();
		this.targets = new HashMap<>();
		this.project = new HashMap<>();
		this.converters = new HashMap<>();
	}

	/**
	 * @see org.eclipse.core.runtime.Plugin#start(org.osgi.framework.BundleContext)
	 *
	 *      Additionally a java source code to PG transformation is loaded from the
	 *      extension point "org.gravity.eclipse.converters".
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

		this.listener = event -> {
			final IResource resource = event.getResource();
			if (resource != null && resource.getType() == IResource.PROJECT
					&& GravityActivator.this.converters.containsKey(resource.getName())
					&& event.getType() == IResourceChangeEvent.PRE_DELETE) {
				GravityActivator.this.converters.remove(resource.getName());

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
	private void initializeSelectedConverter() throws NoConverterRegisteredException, CoreException {
		final IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
		final IConfigurationElement[] configurationElements = extensionRegistry
				.getConfigurationElementsFor(GRAVITY_CONVERTER_EXTENSION_POINT_ID);
		if (configurationElements.length <= 0) {
			throw new NoConverterRegisteredException();
		}
		setSelectedConverterFactory((IPGConverterFactory) configurationElements[0].createExecutableExtension("class")); //$NON-NLS-1$

	}

	/**
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 *
	 *      Additionally change listeners are removed
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this.listener);
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
	 * Adds the source model of an translated project to the table.
	 *
	 * @param projectName the projects name
	 * @param srcModel    the source model
	 */
	public void addSrc(String projectName, EObject srcModel) {
		this.sources.put(projectName, srcModel);
	}

	/**
	 * Gets the source model of an java project.
	 *
	 * @param projectName the projects name
	 * @return the source model
	 */
	public EObject getSrc(String projectName) {
		return this.sources.get(projectName);
	}

	/**
	 * Adds the target model (PG) of an java project to the table.
	 *
	 * @param projectName the projects name
	 * @param trgModel    the target model
	 */
	public void addTrg(String projectName, EObject trgModel) {
		this.targets.put(projectName, trgModel);
	}

	/**
	 * Gets the target model (PG) of an java project.
	 *
	 * @param projectName the projects name
	 * @return the target model (PG)
	 */
	public EObject getTrg(String projectName) {
		return this.targets.get(projectName);
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
	public void setVerbose(boolean verbose) {
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
	public IPGConverter getConverter(IProject project) throws NoConverterRegisteredException, CoreException {
		final String name = project.getName();
		if (this.converters.containsKey(name)) {
			final IPGConverter converter = this.converters.get(name);
			if (this.selectedConverterFactory.belongsToFactory(converter)) {
				return converter;
			}
		}
		final IPGConverter converter = getNewConverter(project);
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
	public boolean discardConverter(IProject project) {
		if (this.converters.containsKey(project.getName())) {
			final IPGConverter converter = this.converters.remove(project.getName());
			return converter != null && converter.discard();
		}
		return false;
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
	public IPGConverter getNewConverter(IProject project) throws NoConverterRegisteredException, CoreException {
		final IPGConverter converter = getSelectedConverterFactory().createConverter(project);
		converter.setDebug(isVerbose());
		this.converters.put(project.getName(), converter);
		return converter;
	}

	/**
	 * Sets the selected converter factory.
	 *
	 * @param selectedConverterFactory the new selected converter factory
	 */
	public void setSelectedConverterFactory(IPGConverterFactory selectedConverterFactory) {
		this.selectedConverterFactory = selectedConverterFactory;
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
		if (this.selectedConverterFactory == null) {
			initializeSelectedConverter();
		}
		return this.selectedConverterFactory;
	}

	/**
	 * Returns the project with the given name iff already converted into a program
	 * model
	 *
	 * @param tName The name of the project
	 * @return the according eclipse project
	 */
	public IProject getProject(String tName) {
		return this.project.get(tName);
	}

	/**
	 * Adds a project to the list of converted projects
	 *
	 * @param project the eclipse projecte
	 */
	public void addProject(IProject project) {
		this.project.put(project.getName(), project);
	}

}
