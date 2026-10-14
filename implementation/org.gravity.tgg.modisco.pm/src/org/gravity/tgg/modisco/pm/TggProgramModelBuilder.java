package org.gravity.tgg.modisco.pm;

import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.gravity.eclipse.programmodel.IBackwardSynchronizer;
import org.gravity.eclipse.programmodel.IForwardSynchronizer;
import org.gravity.eclipse.programmodel.IProgramModelBuilder;
import org.gravity.eclipse.programmodel.ProgramModelBuildException;
import org.gravity.eclipse.util.JavaProjectUtil;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * Program-model builder backed by the existing MoDisco + TGG converter.
 * The adapter keeps TGG technology out of the generic program-model API.
 */
public final class TggProgramModelBuilder
		implements IProgramModelBuilder, IForwardSynchronizer, IBackwardSynchronizer {

	public static final String ID = "org.gravity.java.modisco.tgg";

	@Override
	public String id() { return ID; }

	@Override
	public boolean supports(final IProject project) {
		return JavaProjectUtil.getJavaProject(project) != null;
	}

	@Override
	public TypeGraph build(final IProject project, final IProgressMonitor monitor) throws ProgramModelBuildException {
		try {
			final var converter = new MoDiscoTGGConverter(JavaProjectUtil.getJavaProject(project));
			if (!converter.convertProject(monitor)) {
				throw new ProgramModelBuildException("TGG conversion failed for " + project.getName());
			}
			return converter.getPG();
		} catch (IOException | CoreException e) {
			throw new ProgramModelBuildException("Cannot create TGG program model for " + project.getName(), e);
		}
	}

	@Override
	public boolean synchronizeForward(final IProject project, final TypeGraph model, final IProgressMonitor monitor) {
		try {
			return new MoDiscoTGGConverter(JavaProjectUtil.getJavaProject(project)).syncProjectFwd(monitor);
		} catch (IOException | CoreException e) {
			return false;
		}
	}

	@Override
	public boolean synchronizeBackward(final IProject project, final TypeGraph model, final IProgressMonitor monitor) {
		try {
			return new MoDiscoTGGConverter(JavaProjectUtil.getJavaProject(project))
					.syncProjectBwd(ignored -> { }, monitor);
		} catch (IOException | CoreException e) {
			return false;
		}
	}
}
