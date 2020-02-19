package org.gravity.tgg.uml;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.uml2.uml.Model;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.uml.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.runtime.democles.DemoclesTGGEngine;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.exceptions.ProcessingException;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.codegen.GravityModiscoCodeGenerator;
import org.gravity.modisco.discovery.GravityModiscoProjectDiscoverer;
import org.gravity.security.annotations.AnnotationsActivator;

/**
 * This class provides the API for transforming Java projects into UML models
 * and synchronizing changes
 *
 * @author speldszus
 *
 */
public final class Transformation extends SYNC {

	static final Logger LOGGER = Logger.getLogger(Transformation.class);


	private final IJavaProject project;
	final IFolder outputFolder;

	public Transformation(IJavaProject project, Resource target) throws IOException, CoreException {
		super(new GravityUml().createIbexOptions().resourceHandler(new GravityUmlresourceHandler(project)));
		final IProject iproject = project.getProject();
		this.project = project;
		outputFolder = ((GravityUmlresourceHandler) getResourceHandler()).getOutputFolder();
		if (!outputFolder.exists()) {
			outputFolder.create(true, true, new NullProgressMonitor());
		}
		if(target != null) {
			this.getResourceHandler().getTargetResource().getContents().addAll(target.getContents());
		}
	}

	public static class  GravityUml {
	public IbexOptions createIbexOptions() {
		final IbexOptions options = new IbexOptions();
		options.project.name("Uml");
		options.project.path("org.gravity.tgg.modisco.uml");
		options.debug.ibexDebug(GravityActivator.getDefault().isVerbose());
		options.csp.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.blackInterpreter(new DemoclesTGGEngine());
		return options;
	}

	}
	/**
	 * Translates the given java project into an UML model
	 *
	 * @param addUMLsec Iff the UMLsec annotations should be added to the java
	 *                  project
	 * @param monitor   A progress monitor
	 * @return The UML model
	 * @throws TransformationFailedException If the UML model couldn't be created
	 *                                       due to a transformation error
	 * @throws IOException                   If writing files failed
	 */
	public Model projectToModel(final boolean addUMLsec, final IProgressMonitor monitor)
			throws TransformationFailedException, IOException {

		final SubMonitor subMonitor = SubMonitor.convert(monitor, 100);

		Collection<IPath> libs;
		if (!addUMLsec) {
			libs = new ArrayList<>();
		} else {
			try {
				libs = AnnotationsActivator.applyUMLsecLib(project, subMonitor);
			} catch (CoreException | IOException e) {
				throw new TransformationFailedException(e);
			}
		}
		subMonitor.setWorkRemaining(95);
		subMonitor.setTaskName("Discover MoDiscoModel");

		final GravityModiscoProjectDiscoverer discoverer = new GravityModiscoProjectDiscoverer();

		MGravityModel mGravityModel;
		try {
			mGravityModel = discoverer.discoverMGravityModelFromProject(project, libs, subMonitor.split(25));
		} catch (OperationCanceledException | DiscoveryException e) {
			throw new TransformationFailedException(e);
		}
		mGravityModel.setName(mGravityModel.getName().replace('.', '-'));

		return modiscoToModel(mGravityModel, subMonitor);
	}

	public Model modiscoToModel(final MGravityModel mGravityModel, final IProgressMonitor monitor)
			throws TransformationFailedException, IOException {
		final SubMonitor subMonitor = SubMonitor.convert(monitor);

		getResourceHandler().getSourceResource().getContents().add(mGravityModel);

		final boolean debugging = GravityActivator.getDefault().isDebugging();
		if (debugging) {
			getResourceHandler().getSourceResource().save(Collections.emptyMap());
		}

		subMonitor.setTaskName("Transform MoDisco Model to UML Model");
		forward();

		subMonitor.setTaskName("Postprocess UML Model");
		subMonitor.setWorkRemaining(15);
		final Model model = (Model) getResourceHandler().getTargetResource().getContents().get(0);
		if (model == null) {
			throw new TransformationFailedException("Reverseengineering of a UML model failed.");
		}

		try {
			new UmlSecProcessor(model).processFwd();
		} catch (final ProcessingException e) {
			throw new TransformationFailedException(e);
		}

		((GravityUmlresourceHandler) getResourceHandler()).save(outputFolder, subMonitor);
		return model;
	}

	/**
	 * Synchronizes changes from the UML model to the Java project
	 *
	 * @param monitor A progress monitor
	 * @throws TransformationFailedException If the transformation wasn't successful
	 * @throws IOException                   If writing files failed
	 */
	public void umlToProject(final IProgressMonitor monitor) throws TransformationFailedException, IOException {
		final IFile corrFile = getResourceHandler().getCorrFile();
		if (!corrFile.exists()) {
			return;
		}

		final File oldTrgResource = getResourceHandler().getTrgFile().getLocation().toFile();
		final Resource r = getResourceHandler().getResourceSet().createResource(URI.createFileURI(oldTrgResource.getAbsolutePath()));
		try {
			r.load(Collections.emptyMap());
		} catch (final IOException e) {
			throw new TransformationFailedException(e);
		}

		final EObject oldModel = r.getContents().get(0);
		final EObject newModel = getResourceHandler().getTargetResource().getContents().get(0);

		try (OutputStream outputStreamOld = Files
				.newOutputStream(outputFolder.getFile("old.xmi").getLocation().toFile().toPath());
				OutputStream outputStreamNew = Files
						.newOutputStream(outputFolder.getFile("new.xmi").getLocation().toFile().toPath());) {
			oldModel.eResource().save(outputStreamOld, Collections.emptyMap());
			newModel.eResource().save(outputStreamNew, Collections.emptyMap());
		} catch (final IOException e) {
			throw new TransformationFailedException(e);
		}

		try {
			new UmlSecProcessor((Model) newModel).processBwd();
		} catch (final ProcessingException e) {
			throw new TransformationFailedException(e);
		}

		backward();

		getResourceHandler().save(outputFolder, monitor);

		GravityModiscoCodeGenerator.generateCode(project, (MGravityModel) getResourceHandler().getSourceResource().getContents().get(0), monitor);
	}

	public IJavaProject getProject() {
		return this.project;
	}

	@Override
	public GravityUmlresourceHandler getResourceHandler() {
		return (GravityUmlresourceHandler) super.getResourceHandler();
	}
}
