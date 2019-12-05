package org.gravity.tgg.modisco;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.modisco.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.runtime.democles.DemoclesTGGEngine;
import org.gravity.eclipse.GravityActivator;
import org.gravity.modisco.ModiscoPackage;
import org.gravity.typegraph.basic.BasicPackage;

public class TGGApp extends SYNC {

	private static final String PLATFORM_RESOURCE = "platform:/resource/"; //$NON-NLS-1$

	private static final String MODISCO_FLATTENED_TGG_XMI_LOCATION = "model/Modisco_flattened.tgg.xmi"; //$NON-NLS-1$
	private static final String MODISCO_FLATTENED_TGG_XMI_URI = PLATFORM_RESOURCE + MoDiscoTGGActivator.PLUGIN_ID + "/" //$NON-NLS-1$
			+ MODISCO_FLATTENED_TGG_XMI_LOCATION;
	private static final String MODISCO_ECORE_LOCATION = "model/Modisco.ecore"; //$NON-NLS-1$
	private static final String MODISCO_ECORE_URI = PLATFORM_RESOURCE + MoDiscoTGGActivator.PLUGIN_ID + "/" //$NON-NLS-1$
			+ MODISCO_ECORE_LOCATION;
	private static final String MODISCO_TGG_XMI_LOCATION = "model/Modisco.tgg.xmi"; //$NON-NLS-1$
	private static final String MODISCO_TGG_XMI_URI = PLATFORM_RESOURCE + MoDiscoTGGActivator.PLUGIN_ID + "/" //$NON-NLS-1$
			+ MODISCO_TGG_XMI_LOCATION;

	private final String name;

	/**
	 * Create a new transformation application
	 *
	 * @param project The project which should be transformed
	 *
	 * @throws IOException If one of the models cannot be loaded
	 */
	public TGGApp(final IProject project) throws IOException {
		super(createIbexOptions());
		this.name = project.getName();
		registerBlackInterpreter(this.options.getBlackInterpreter());
	}

	@Override
	public void loadModels() throws IOException {
		final String gravityFolder = PLATFORM_RESOURCE + this.name + '/' + GravityActivator.GRAVITY_FOLDER_NAME + '/';
		this.s = createResource(gravityFolder + "src.xmi"); //$NON-NLS-1$
		this.t = createResource(gravityFolder + this.name + ".xmi"); //$NON-NLS-1$
		this.c = createResource(gravityFolder + "corr.xmi"); //$NON-NLS-1$
		this.p = createResource(gravityFolder + "protocol.xmi"); //$NON-NLS-1$
	}

	@Override
	protected void registerUserMetamodels() throws IOException {
		registerPackage(JavaPackage.eINSTANCE);
		registerPackage(ModiscoPackage.eINSTANCE);
		registerPackage(BasicPackage.eINSTANCE);
		final EPackage tggPackage = loadMetaModelPackage();
		registerPackage(tggPackage);
		this.options.setCorrMetamodel(tggPackage);
		EcoreUtil.resolveAll(this.rs);
	}

	/**
	 * Registers the package at the resource set
	 *
	 * @param ePackage The package
	 */
	private void registerPackage(final EPackage ePackage) {
		this.rs.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
		this.rs.getResources().remove(ePackage.eResource());
	}

	/**
	 * Load the meta model package
	 *
	 * @return The EPackage of the meta model
	 * @throws IOException If the file cannot be reador the URI hasn't a valid
	 *                     format
	 */
	private EPackage loadMetaModelPackage() throws IOException {
		try (InputStream stream = MoDiscoTGGActivator.getEntryAsStream(MODISCO_ECORE_LOCATION)) {
			final Resource resource = loadResource(MODISCO_ECORE_URI, stream);
			return (EPackage) resource.getContents().get(0);
		}
	}

	@Override
	public Resource loadResource(final String uri) throws IOException {
		try (InputStream stream = new URL(uri).openConnection().getInputStream()) {
			return loadResource(uri, stream);
		}
	}

	/**
	 * Loads a resource from the given input stream under the given URI
	 *
	 * @param uri    The URI of the resource
	 * @param stream The stream containing the resources contents
	 * @return The loaded resource
	 * @throws IOException If the resource couldn't be loaded
	 */
	private Resource loadResource(final String uri, final InputStream stream) throws IOException {
		final Resource resource = this.rs.createResource(URI.createURI(uri));
		resource.load(stream, Collections.emptyMap());
		EcoreUtil.resolveAll(resource);
		return resource;
	}

	@Override
	protected Resource loadTGGResource() throws IOException {
		try (InputStream stream = MoDiscoTGGActivator.getEntryAsStream(MODISCO_TGG_XMI_LOCATION)) {
			return loadResource(MODISCO_TGG_XMI_URI, stream);
		}
	}

	@Override
	protected Resource loadFlattenedTGGResource() throws IOException {
		try (InputStream stream = MoDiscoTGGActivator.getEntryAsStream(MODISCO_FLATTENED_TGG_XMI_LOCATION)) {
			return loadResource(MODISCO_FLATTENED_TGG_XMI_URI, stream);
		}
	}

	private static IbexOptions createIbexOptions() {
		final IbexOptions options = new IbexOptions();
		options.projectName("Modisco"); //$NON-NLS-1$
		options.projectPath(MoDiscoTGGActivator.PLUGIN_ID);
		options.debug(GravityActivator.getDefault().isVerbose());
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.setBlackInterpreter(new DemoclesTGGEngine());
		return options;
	}
}
