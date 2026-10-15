package org.gravity.tgg.modisco.pm;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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

	private final Map<IProject, MoDiscoTGGConverter> sessions = new HashMap<>();

	@Override
	public String id() { return ID; }

	@Override
	public boolean supports(final IProject project) {
		return JavaProjectUtil.getJavaProject(project) != null;
	}

	@Override
	public TypeGraph build(final IProject project, final IProgressMonitor monitor) throws ProgramModelBuildException {
		try {
			final var converter = new MoDiscoTGGConverter(JavaProjectUtil.getJavaProject(project), false);
			converter.disableAutosave();
			if (!converter.convertProject(monitor)) {
				throw new ProgramModelBuildException("TGG conversion failed for " + project.getName());
			}
			sessions.put(project, converter);
			return converter.getPG();
		} catch (IOException | CoreException e) {
			throw new ProgramModelBuildException("Cannot create TGG program model for " + project.getName(), e);
		}
	}


	@Override
	public boolean synchronizeForward(final IProject project, final TypeGraph model, final IProgressMonitor monitor) {
		final var converter = sessions.get(project);
		if (converter == null || converter.getPG() != model) return false;
		return converter.syncProjectFwd(monitor);
	}

	@Override
	public boolean synchronizeBackward(final IProject project, final TypeGraph model, final IProgressMonitor monitor) {
		final var converter = sessions.get(project);
		if (converter == null || converter.getPG() != model) return false;
		return converter.syncProjectBwd(ignored -> { }, monitor);
	}
}
