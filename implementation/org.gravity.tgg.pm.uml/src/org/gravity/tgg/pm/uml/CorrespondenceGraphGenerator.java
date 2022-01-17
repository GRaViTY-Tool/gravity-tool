package org.gravity.tgg.pm.uml;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.eclipse.io.ModelSaver;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.tgg.modisco.pm.MoDiscoTGGConverter;
import org.gravity.tgg.uml.GravityUmlActivator;
import org.gravity.tgg.uml.Transformation;
import org.moflon.tgg.runtime.CorrespondenceModel;

public class CorrespondenceGraphGenerator {
	private static final Logger LOGGER = Logger.getLogger(CorrespondenceGraphGenerator.class);

	private CorrespondenceGraphGenerator() {
		// This class should not be instantiated
	}

	public static CorrespondenceModel createModel(final IJavaProject javaProject, final IProgressMonitor monitor) {
		final IProject project = javaProject.getProject();

		CorrespondenceModel umlCorr;
		try {
			umlCorr = loadOrCreateUMLCorr(project, monitor);
			EcoreUtil.resolveAll(umlCorr);
		} catch (IOException | CoreException | TransformationFailedException e) {
			LOGGER.error(e);
			return null;
		}

		CorrespondenceModel pmCorr;
		try {
			pmCorr = loadOrCreatePMCorr(project, monitor);
			EcoreUtil.resolveAll(pmCorr);
		} catch (CoreException | TransformationFailedException | NoConverterRegisteredException e) {
			LOGGER.error(e);
			return null;
		}

		try {
			CorrespondenceModel correspondenceModel;
			final IFile file = EclipseProjectUtil.getGravityFolder(project, monitor).getFile("bi_corr.xmi");
			final URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			if (file.exists() && (file.getModificationStamp() >= project.getModificationStamp())) {
				correspondenceModel = (CorrespondenceModel) pmCorr.eResource().getResourceSet().getResource(uri, true)
						.getContents().get(0);
			} else {
				correspondenceModel = new CorrespondenceGraphCreator(umlCorr, pmCorr).createCorrespondenceGraph(uri);
				correspondenceModel.setSource(umlCorr.getTarget());
				correspondenceModel.setTarget(pmCorr.getTarget());
				ModelSaver.saveModel(correspondenceModel, file, monitor);
			}
			return correspondenceModel;
		} catch (IOException | InvocationTargetException e) {
			LOGGER.error(e);
		}
		return null;
	}

	private static CorrespondenceModel loadOrCreatePMCorr(final IProject project, final IProgressMonitor monitor)
			throws CoreException, NoConverterRegisteredException, TransformationFailedException {
		final GravityActivator activator = GravityActivator.getDefault();
		final MoDiscoTGGConverter converter = (MoDiscoTGGConverter) activator.getConverter(project);
		if (!converter.convertProject(monitor)) {
			activator.discardConverter(project);
			throw new TransformationFailedException();
		}
		return converter.getCorr();
	}

	private static CorrespondenceModel loadOrCreateUMLCorr(final IProject project, final IProgressMonitor monitor)
			throws IOException, CoreException, TransformationFailedException {
		final Transformation transformation = GravityUmlActivator.getTransformationFactory().getTransformation(project);
		try {
			transformation.projectToModel(false, monitor);
		} catch (TransformationFailedException | IOException e) {
			GravityUmlActivator.getTransformationFactory().drop(project);
			throw e;
		}
		return transformation.getCorr();
	}
}
