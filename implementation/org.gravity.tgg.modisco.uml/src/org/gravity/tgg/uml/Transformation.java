package org.gravity.tgg.uml;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Consumer;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.uml2.uml.Model;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.exceptions.ProcessingException;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.eclipse.util.EMFUtil;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.modisco.GravityMoDiscoActivator;
import org.gravity.modisco.GravityModiscoTGGConverter;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.codegen.GravityModiscoCodeGenerator;
import org.gravity.security.annotations.AnnotationsActivator;
import org.gravity.tgg.modisco.uml.UmlPackage;
import org.moflon.tgg.algorithm.delta.Delta;
import org.moflon.tgg.algorithm.delta.OnlineChangeDetector;

import carisma.profile.umlsec.UMLsecActivator;

/**
 * This class provides the API for transforming Java projects into UML models
 * and synchronizing changes
 *
 * @author speldszus
 *
 */
public final class Transformation extends GravityModiscoTGGConverter {

	public static final Logger LOGGER = Logger.getLogger(Transformation.class);

	/**
	 * The name of the output folder
	 */
	static final String UML = "uml";

	public Transformation(final IJavaProject javaProject) throws IOException, CoreException {
		this(javaProject, true);
	}

	public Transformation(final IJavaProject javaProject, final boolean load)
			throws CoreException, IOException {
		super(javaProject, UML, load);
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
		if (this.load && (getTrg() != null) && (getSrc() != null) && (getCorr() != null)) {
			final var iproject = this.project.getProject();
			try {
				if (iproject.getModificationStamp() <= EclipseProjectUtil.getGravityFolder(iproject, monitor)
						.getModificationStamp()) {
					return (Model) getTrg();
				}
			} catch (final IOException e) {
				LOGGER.error(e.getMessage(), e);
				discard();
				clearChanges();
			}
		}

		final var subMonitor = SubMonitor.convert(monitor, 100);
		final var libs = getLibs(addUMLsec, subMonitor);
		subMonitor.setWorkRemaining(95);
		subMonitor.setTaskName("Discover MoDiscoModel");

		var start = 0L;
		if (GravityActivator.MEASURE_PERFORMANCE) {
			start = System.currentTimeMillis();
		}

		MGravityModel mGravityModel;
		try {
			mGravityModel = this.discoverer.discoverModel(libs, subMonitor.split(25));
		} catch (OperationCanceledException | DiscoveryException e) {
			throw new TransformationFailedException(e);
		}
		mGravityModel.setName(mGravityModel.getName().replace('.', '-'));

		if ((this.src != null) && this.src.equals(mGravityModel) && (this.trg instanceof Model)) {
			return (Model) this.trg;
		}

		try {
			clearChanges();
			final var model = modiscoToModel(mGravityModel, subMonitor);
			if (GravityActivator.MEASURE_PERFORMANCE) {
				GravityActivator.recordMessage("All:" + (System.currentTimeMillis() - start) + "ms");
			}
			if (addUMLsec) {
				postprocessUMLsec(model);
			}
			return model;
		} catch (final TransformationFailedException e) {
			mGravityModel.eResource().unload();
			throw e;
		}
	}

	/**
	 * Calculates the libraries to consider in detail
	 *
	 * @param addUMLsec Whether the UMLsec lib should be added as dependency
	 * @param monitor   A progress monitor
	 * @return The libs to consider, currently, none or only UMLsec iff added
	 * @throws TransformationFailedException If the UMLsec lib cannot be added to
	 *                                       the project
	 */
	private Collection<IPath> getLibs(final boolean addUMLsec, final SubMonitor monitor)
			throws TransformationFailedException {
		final Collection<IPath> libs = new ArrayList<>();
		if (addUMLsec) {
			try {
				libs.add(AnnotationsActivator.applyUMLsecLib(this.project, monitor));
			} catch (CoreException | IOException e) {
				throw new TransformationFailedException(e);
			}
		}
		return libs;
	}

	public Model modiscoToModel(final MGravityModel mGravityModel, final IProgressMonitor monitor)
			throws TransformationFailedException, IOException {
		final var subMonitor = SubMonitor.convert(monitor);
		final var eResource = mGravityModel.eResource();
		if (eResource == null) {
			getResourceSet().createResource(URI.createURI(GravityMoDiscoActivator.FILE_NAME)).getContents()
			.add(mGravityModel);
		} else if (!eResource.getResourceSet().equals(getResourceSet())) {
			getResourceSet().getResources().add(eResource);
		}

		setSrc(mGravityModel);

		final var debugging = GravityActivator.getDefault().isDebugging();
		if (debugging) {
			getSrc().eResource().save(Collections.emptyMap());
		}

		subMonitor.setTaskName("Transform MoDisco Model to UML Model");
		long start;
		if (GravityActivator.MEASURE_PERFORMANCE) {
			start = System.currentTimeMillis();
		}
		integrateForward();
		if (GravityActivator.MEASURE_PERFORMANCE) {
			GravityActivator.recordMessage("TGG:" + (System.currentTimeMillis() - start) + "ms");
		}

		subMonitor.setTaskName("Postprocess UML Model");
		subMonitor.setWorkRemaining(15);
		if (!(this.trg instanceof Model)) {
			if (this.trg != null) {
				final var trgResource = this.trg.eResource();
				if (trgResource != null) {
					trgResource.unload();
				}
			}
			throw new TransformationFailedException("Reverseengineering of a UML model failed.");
		}

		if (this.autosave) {
			save(subMonitor);
		}
		return (Model) this.trg;
	}

	/**
	 * Applies postprocessors to the transformed model
	 *
	 * @param model The model
	 * @throws TransformationFailedException
	 */
	public void postprocessUMLsec(final Model model) throws TransformationFailedException {
		try {
			long start;
			if (GravityActivator.MEASURE_PERFORMANCE) {
				start = System.currentTimeMillis();
			}
			final var profile = UMLsecActivator.loadUMLsecProfile(this.set);
			model.applyProfile(profile);
			new UmlSecProcessor(model).processFwd();
			if (GravityActivator.MEASURE_PERFORMANCE) {
				GravityActivator.recordMessage("Postpocessing: " + (System.currentTimeMillis() - start) + "ms");
			}
		} catch (final ProcessingException | IOException e) {
			throw new TransformationFailedException(e);
		}
	}

	/**
	 * Synchronizes changes from the UML model to the Java project
	 *
	 * @param monitor A progress monitor
	 * @throws TransformationFailedException If the transformation wasn't successful
	 * @throws IOException                   If writing files failed
	 */
	public void umlToProject(final IProgressMonitor monitor) throws TransformationFailedException, IOException {
		final var corrFile = getCorrFile();
		if (!corrFile.exists()) {
			return;
		}

		final var oldTrgResource = getTargetFile();
		final var r = getResourceSet().createResource(EMFUtil.getPlatformResourceURI(oldTrgResource));
		try {
			r.load(Collections.emptyMap());
		} catch (final IOException e) {
			throw new TransformationFailedException(e);
		}

		final var oldModel = r.getContents().get(0);
		final var newModel = getTrg();

		try (var outputStreamOld = Files
				.newOutputStream(this.outputFolder.getFile("old.xmi").getLocation().toFile().toPath());
				var outputStreamNew = Files
						.newOutputStream(this.outputFolder.getFile("new.xmi").getLocation().toFile().toPath());) {
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

		save(monitor);

		GravityModiscoCodeGenerator.generateCode(this.project.getProject(), (MGravityModel) getSrc(), null, monitor);
	}

	public void applyChangeAndGenerateCode(final Consumer<EObject> changeTrg, final IProgressMonitor monitor)
			throws IOException {

		final var model = (MGravityModel) getSrc();

		setChangeTrg(changeTrg.andThen(x -> {
			try {
				new UmlSecProcessor((Model) getTrg()).processBwd();
			} catch (final ProcessingException e) {
				LOGGER.error(e);
			}
		}));
		final var delta = integrateBackwardAndRecordDelta();

		GravityModiscoCodeGenerator.generateCode(this.project.getProject(), model, delta, monitor);

	}

	/**
	 * @return
	 */
	public Delta integrateBackwardAndRecordDelta() {
		return applyChangeAndRecordDelta(x -> integrateBackward(), getSrc());
	}

	/**
	 * Applies a change to a model and records the changes as delta
	 *
	 * @param change The change
	 * @param model  The model the change should be applied to
	 * @return The recorded delta
	 */
	private Delta applyChangeAndRecordDelta(final Consumer<EObject> change, final EObject model) {
		final var delta = new Delta();
		new OnlineChangeDetector(delta, model);
		change.accept(model);
		OnlineChangeDetector.removeDeltaListeners(model);
		return delta;
	}

	@Override
	public boolean discard() {
		unload();
		return GravityUmlActivator.getTransformationFactory().drop(this.project.getProject());
	}


	public static IFile getUMLFile(final IProject project, final NullProgressMonitor monitor) throws IOException {
		return EclipseProjectUtil.getGravityFolder(project, monitor).getFile(project.getName()+".uml");
	}

	@Override
	protected IFile getTargetFile() {
		return this.outputFolder.getFile(this.outputFolder.getProject().getName() + ".uml");
	}

	@Override
	protected UmlPackage getCorrPackage() {
		return UmlPackage.eINSTANCE;
	}

	@Override
	protected String getSmaURI() {
		return "platform:/plugin/org.gravity.tgg.modisco.uml/model/Uml.sma.xmi";
	}
}
