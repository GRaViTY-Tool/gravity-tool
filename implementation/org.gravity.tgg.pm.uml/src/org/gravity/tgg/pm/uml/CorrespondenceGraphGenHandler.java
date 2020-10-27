package org.gravity.tgg.pm.uml;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLPackage;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.eclipse.io.ModelSaver;
import org.gravity.eclipse.ui.GravityUiActivator;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.modisco.GravityMoDiscoActivator;
import org.gravity.modisco.ModiscoPackage;
import org.gravity.tgg.modisco.pm.MoDiscoTGGConverter;
import org.gravity.tgg.uml.GravityUmlActivator;
import org.gravity.tgg.uml.Transformation;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.annotations.AnnotationsPackage;
import org.moflon.tgg.runtime.CorrespondenceModel;

public class CorrespondenceGraphGenHandler extends AbstractHandler {

	private static final Logger LOGGER = Logger.getLogger(CorrespondenceGraphGenHandler.class);

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		NullProgressMonitor monitor = new NullProgressMonitor();
		List<?> selection = GravityUiActivator.getSelection(event);
		for (Object object : selection) {
			IJavaProject javaProject = null;
			if (object instanceof IProject) {
				try {
					IProject project = (IProject) object;
					if (project.hasNature(JavaCore.NATURE_ID)) {
						javaProject = JavaCore.create(project);
					}
				} catch (CoreException e) {
					LOGGER.error(e);
				}
			} else if (object instanceof IJavaProject) {
				javaProject = (IJavaProject) object;
			}
			if (javaProject == null) {
				continue;
			}
			Job job = launchJob(javaProject);
		}
		return null;
	}

	private Job launchJob(IJavaProject javaProject) {
		Job job = new Job("Generate UML PM Corr Model") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				CorrespondenceModel model = createModel(javaProject, monitor);
				if (model != null) {
					return Status.OK_STATUS;
				}
				return new Status(IStatus.ERROR, "org.garvity.tgg.pm.uml", "Creating the corr model failed");
			}

		};
		job.schedule();
		return job;
	}

	private CorrespondenceModel createModel(IJavaProject javaProject, IProgressMonitor monitor) {
		IProject project = javaProject.getProject();

		ResourceSet set = new ResourceSetImpl();
		set.getPackageRegistry().put(BasicPackage.eNS_URI, BasicPackage.eINSTANCE);
		set.getPackageRegistry().put(AnnotationsPackage.eNS_URI, AnnotationsPackage.eINSTANCE);
		set.getPackageRegistry().put(ModiscoPackage.eNS_URI, ModiscoPackage.eINSTANCE);
		set.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);

		try {
			IFolder gravityFolder = EclipseProjectUtil.getGravityFolder(project, monitor);

			loadModiscoModel(set, gravityFolder);
			TypeGraph pm = loadPM(project, set, monitor);
			Model uml = loadUMLModel(project, set, monitor);

			CorrespondenceModel umlCorr = loadOrCreateUMLCorr(project, set, monitor);
			CorrespondenceModel pmCorr = loadOrCreatePMCorr(javaProject, monitor, project, set);

			EcoreUtil.resolveAll(umlCorr);
			EcoreUtil.resolveAll(pmCorr);

			IFile file = gravityFolder.getFile("bi_corr.xmi");
			CorrespondenceModel correspondenceModel = new CorrespondenceGraphCreator(umlCorr, pmCorr)
					.createCorrespondenceGraph(URI.createPlatformResourceURI(file.getFullPath().toString(), true));
			correspondenceModel.setSource(uml);
			correspondenceModel.setTarget(pm);
			ModelSaver.saveModel(correspondenceModel, file, monitor);
			return correspondenceModel;
		} catch (IOException | TransformationFailedException | CoreException | InvocationTargetException e) {
			LOGGER.error(e);
		}
		return null;
	}

	private Model loadUMLModel(IProject project, ResourceSet set, IProgressMonitor monitor) {
		// Load UML model
		IFile umlFile;
		try {
			umlFile = Transformation.getUMLFile(project, monitor);
			if (!umlFile.exists()) {
				return null;
			}
		} catch (IOException e) {
			return null;
		}
		Resource resource = set.getResource(URI.createPlatformResourceURI(umlFile.getFullPath().toString(), true),
				true);
		if (!resource.getContents().isEmpty()) {
			return resource.getContents().parallelStream().filter(Model.class::isInstance).map(Model.class::cast)
					.findAny().orElse(null);
		}
		return null;
	}

	private TypeGraph loadPM(IProject project, ResourceSet set, IProgressMonitor monitor) {
		IFile pmFile;
		try {
			pmFile = MoDiscoTGGConverter.getPMFile(project, monitor);
		} catch (IOException e) {
			return null;
		}
		Resource resource = set.getResource(URI.createPlatformResourceURI(pmFile.getFullPath().toString(), true), true);
		if (!resource.getContents().isEmpty()) {
			return (TypeGraph) resource.getContents().get(0);
		}
		return null;
	}

	private void loadModiscoModel(ResourceSet set, IFolder gravityFolder) {
		// Load modisco model for project
		IFile modiscoFile = gravityFolder.getFile(GravityMoDiscoActivator.FILE_NAME);
		set.getResource(URI.createPlatformResourceURI(modiscoFile.getFullPath().toString(), true), true);
	}

	private CorrespondenceModel loadOrCreatePMCorr(IJavaProject javaProject, IProgressMonitor monitor, IProject project,
			ResourceSet set) throws IOException {
		CorrespondenceModel pmCorr = MoDiscoTGGConverter.getCorrespondenceModel(project, set);
		if (pmCorr == null) {
			MoDiscoTGGConverter converter = new MoDiscoTGGConverter(javaProject);
			converter.convertProject(monitor);
			pmCorr = converter.getCorr();
			set.getResources().add(pmCorr.eResource());
		}
		return pmCorr;
	}

	private CorrespondenceModel loadOrCreateUMLCorr(IProject project, ResourceSet set, IProgressMonitor monitor)
			throws IOException, CoreException, TransformationFailedException {
		CorrespondenceModel umlCorr = Transformation.getCorrespondenceModel(project, set);
		if (umlCorr == null) {
			Transformation transformation = GravityUmlActivator.getTransformationFactory().getTransformation(project);
			transformation.projectToModel(false, monitor);
			umlCorr = transformation.getCorr();
			set.getResources().add(umlCorr.eResource());
		}
		return umlCorr;
	}

}
