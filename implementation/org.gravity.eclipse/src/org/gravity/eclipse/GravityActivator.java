package org.gravity.eclipse;

import java.util.Hashtable;

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

	/** The plug-in ID. */
	public static final String PLUGIN_ID = "org.gravity.eclipse"; //$NON-NLS-1$

	/** The shared instance. */
	private static GravityActivator plugin;

	/** All known source models with project name as key. */
	private Hashtable<String, EObject> sources;

	/** All target models (PGs) with project name as key. */
	private Hashtable<String, EObject> targets;


	/** The verbose state (not only for this plugin). */
	private boolean verbose = false;

	/**
	 * At startup all tables will be initialized empty. Currently no old states
	 * are loaded.
	 */
	public GravityActivator() {
	}

	/**
	 * @see org.eclipse.core.runtime.Plugin#start(org.osgi.framework.BundleContext)
	 * 
	 *      Additionally a java source code to PG transformation is loaded from
	 *      the extension point "org.gravity.eclipse.converters".
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	
		listener = new IResourceChangeListener() {
			
			@Override
			public void resourceChanged(IResourceChangeEvent event) {
				IResource resource = event.getResource();
				if(resource != null && resource.getType() == IResource.PROJECT){
					if(converters.containsKey(resource.getName())){
						if(event.getType()==IResourceChangeEvent.PRE_DELETE){
							converters.remove(resource.getName());
						}
					}
				}
			}
		};
		
		ResourcesPlugin.getWorkspace().addResourceChangeListener(listener);
		
	}

	private void initializeSelectedConverter() throws NoConverterRegisteredException {
		IExtensionRegistry extension_registry = Platform.getExtensionRegistry();
		IConfigurationElement[] configuration_elements = extension_registry
				.getConfigurationElementsFor("org.gravity.eclipse.converters"); //$NON-NLS-1$
		if (configuration_elements.length <= 0) {
			throw new NoConverterRegisteredException();
		}
		try {
			setSelectedConverterFactory((IPGConverterFactory) configuration_elements[0].createExecutableExtension("class")); //$NON-NLS-1$
		} catch (CoreException e) {
			throw new RuntimeException(e);
		} 
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(listener);
		
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
	 * @param projectName
	 *            the projects name
	 * @param srcModel
	 *            the source model
	 */
	public void addSrc(String projectName, EObject srcModel) {
		this.sources.put(projectName, srcModel);
	}

	/**
	 * Gets the source model of an java project.
	 *
	 * @param projectName
	 *            the projects name
	 * @return the source model
	 */
	public EObject getSrc(String projectName) {
		return this.sources.get(projectName);
	}

	/**
	 * Adds the target model (PG) of an java project to the table.
	 *
	 * @param projectName
	 *            the projects name
	 * @param trgModel
	 *            the target model
	 */
	public void addTrg(String projectName, EObject trgModel) {
		this.targets.put(projectName, trgModel);
	}

	/**
	 * Gets the target model (PG) of an java project.
	 *
	 * @param projectName
	 *            the projects name
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
	 * @param verbose
	 *            the new verbose state
	 */
	public void setVerbose(boolean verbose) {
		this.verbose = verbose;
		for(IPGConverter converter : converters.values()){
			converter.setDebug(verbose);
		}
	}

	/*
	 * Handling of SRC to PG converters
	 */

	/** The converters for java projects (project name as key). */
	private Hashtable<String, IPGConverter> converters = new Hashtable<>();

	/** The selected converter factory. */
	private IPGConverterFactory selected_factory;

	private IResourceChangeListener listener;

	/**
	 * Returns the selected converter or a new converter for an eclipse project.
	 *
	 * @param project
	 *            the project
	 * @return the converter
	 * @throws CoreException 
	 */
	public IPGConverter getConverter(IProject project) throws NoConverterRegisteredException {
		String name = project.getName();
		if (this.converters.containsKey(name)) {
			IPGConverter converter = this.converters.get(name);
			if (this.selected_factory.belongsToFactory(converter)) {
				return converter;
			}
		}
		IPGConverter converter = getNewConverter(project);
		converter.setDebug(isVerbose());
		return converter;
	}
	
	public boolean discardConverter(IProject project){
		if(this.converters.containsKey(project.getName())){
			IPGConverter converter = this.converters.remove(project.getName());
			return converter!=null;
		}
		return false;
	}

	/**
	 * Returns always a new converter for an eclipse project.
	 *
	 * @param project
	 *            the project
	 * @return the converter
	 * @throws CoreException 
	 */
	public IPGConverter getNewConverter(IProject project) throws NoConverterRegisteredException {
		IPGConverter converter = getSelectedConverterFactory().createConverter(project);
		this.converters.put(project.getName(), converter);
		return converter;
	}

	/**
	 * Sets the selected converter factory.
	 *
	 * @param selected_factory
	 *            the new selected converter factory
	 */
	public void setSelectedConverterFactory(IPGConverterFactory selected_factory) {
		this.selected_factory = selected_factory;
	}

	/**
	 * Gets the selected converter factory.
	 *
	 * @return the selected converter factory
	 * @throws CoreException 
	 */
	public IPGConverterFactory getSelectedConverterFactory() throws NoConverterRegisteredException {
		if(this.selected_factory == null){
			initializeSelectedConverter();
		}
		return this.selected_factory;
	}

}
