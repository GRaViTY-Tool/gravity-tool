package org.gravity.tgg.uml;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.uml2.uml.Model;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.exceptions.ProcessingException;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.eclipse.io.ModelSaver;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.codegen.GravityModiscoCodeGenerator;
import org.gravity.modisco.discovery.GravityModiscoProjectDiscoverer;
import org.gravity.security.annotations.AnnotationsActivator;
import org.gravity.tgg.modisco.uml.UmlPackage;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;
import org.moflon.tgg.language.analysis.StaticAnalysis;

/**
 * This class provides the API for transforming Java projects into UML models
 * and synchronizing changes
 *
 * @author speldszus
 *
 */
public final class Transformation extends SynchronizationHelper {

	static final Logger LOGGER = Logger.getLogger(Transformation.class);

	/**
	 * The name of the protocol file
	 */
	public static final String PROTOCOL_XMI = "protocol.xmi";

	/**
	 * The name of the modisco model file
	 */
	public static final String SRC_XMI = "modisco.xmi";

	/**
	 * The name of the correspondence model file
	 */
	public static final String CORR_XMI = "corr.xmi";

	/**
	 * The name of the output folder
	 */
	static final String UML = "uml";

	private final IJavaProject project;
	final IFolder outputFolder;

	private Resource tggRulesResource;

	public Transformation(IJavaProject javaProject, Resource target) throws IOException, CoreException {
		this.project = javaProject;
		this.outputFolder = EclipseProjectUtil.getGravityFolder(javaProject.getProject(), new NullProgressMonitor())
				.getFolder(UML);
		if (!outputFolder.exists()) {
			outputFolder.create(true, true, new NullProgressMonitor());
		}
		if (target != null) {
			this.set = target.getResourceSet();
			this.getTrg().eResource().getContents().addAll(target.getContents());
		}
		else {
			this.set = new ResourceSetImpl();
		}
		setCorrPackage(UmlPackage.eINSTANCE);

		this.configurator = new org.moflon.tgg.algorithm.configuration.Configurator() {
		};
		clearChanges();

		loadRulesFromProject();
	}

	private void loadRulesFromProject() throws IOException, MalformedURLException {
		String smaXmiURI = "platform:/plugin/org.gravity.tgg.modisco.uml/model/Uml.sma.xmi"; //$NON-NLS-1$
		try (InputStream tggRulesStream = new URL(smaXmiURI).openConnection().getInputStream()) {
			this.tggRulesResource = this.set.createResource(URI.createURI(smaXmiURI));
			this.tggRulesResource.load(tggRulesStream, Collections.EMPTY_MAP);
		}

		setRules((StaticAnalysis) this.tggRulesResource.getContents().get(0));
	}

	/**
	 * Sets the eMoflon changes to empty consumers
	 */
	private void clearChanges() {
		this.changeSrc = (root -> {
		});
		this.changeTrg = (root -> {
		});
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
		Resource eResource = mGravityModel.eResource();
		if(eResource == null ) {
			getResourceSet().createResource(URI.createURI(mGravityModel.getName()+".xmi")).getContents().add(mGravityModel);
		}
		else if(!eResource.getResourceSet().equals(getResourceSet())) {
			getResourceSet().getResources().add(eResource);
		}
		
		setSrc(mGravityModel);

		final boolean debugging = GravityActivator.getDefault().isDebugging();
		if (debugging) {
			getSrc().eResource().save(Collections.emptyMap());
		}

		subMonitor.setTaskName("Transform MoDisco Model to UML Model");
		integrateForward();

		subMonitor.setTaskName("Postprocess UML Model");
		subMonitor.setWorkRemaining(15);
		final Model model = (Model) getTrg();
		if (model == null) {
			throw new TransformationFailedException("Reverseengineering of a UML model failed.");
		}

		try {
			new UmlSecProcessor(model).processFwd();
		} catch (final ProcessingException e) {
			throw new TransformationFailedException(e);
		}

		save(outputFolder, subMonitor);
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
		final IFile corrFile = outputFolder.getFile(CORR_XMI);
		if (!corrFile.exists()) {
			return;
		}

		final File oldTrgResource = getTrgFile().getLocation().toFile();
		final Resource r = getResourceSet()
				.createResource(URI.createFileURI(oldTrgResource.getAbsolutePath()));
		try {
			r.load(Collections.emptyMap());
		} catch (final IOException e) {
			throw new TransformationFailedException(e);
		}

		final EObject oldModel = r.getContents().get(0);
		final EObject newModel = getTrg();

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

		integrateBackward();

		save(outputFolder, monitor);

		GravityModiscoCodeGenerator.generateCode(project, (MGravityModel) getSrc(), monitor);
	}

	public IFile getTrgFile() {
		return outputFolder.getFile(project.getProject().getName() + "." + UML);
	}

	private boolean save(IFolder folder, IProgressMonitor monitor) {
		monitor.setTaskName("Save UML Model");
		IFile umlFile = folder.getProject().getFile(folder.getProject().getName() + ".uml");
		if(!ModelSaver.saveModel(getTrg(), umlFile, monitor)) {
			return false;
		}
		if(!ModelSaver.saveModel(getSrc(), folder.getFile(SRC_XMI), monitor)) {
			return false;
		}
		if(!ModelSaver.saveModel(getCorr(), folder.getFile(CORR_XMI), monitor)) {
			return false;
		}
		saveSynchronizationProtocol(folder.getFile("sync__protocol.xmi").getLocation().toString()); //$NON-NLS-1$
		return true;
	}

	public IJavaProject getProject() {
		return this.project;
	}
}
