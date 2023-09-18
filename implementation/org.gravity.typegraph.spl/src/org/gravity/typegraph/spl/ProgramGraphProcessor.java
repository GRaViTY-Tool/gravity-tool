package org.gravity.typegraph.spl;

import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.JavaCore;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.tgg.modisco.pm.processing.pg.IProgramGraphProcessor;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * Calculates PCs of the elements in the program model in a preprocessing
 *
 * @author speldszus
 *
 */
public class ProgramGraphProcessor implements IProgramGraphProcessor {

	private static final Logger LOGGER = Logger.getLogger(ProgramGraphProcessor.class);

	/**
	 * Adds variability annotations from Antenna annotations in the discovered
	 * project to the program model
	 *
	 * @param pg       The discovered program model
	 * @param monition A progress monitor
	 */
	@Override
	public boolean process(final TypeGraph pg, final IProgressMonitor monitor) {
		final var project = EclipseProjectUtil.getProjectByName(pg.getTName());
		try {
			if (!project.hasNature("de.ovgu.featureide.core.featureProjectNature")) {
				// Only process FeatureIDE projects
				return true;
			}
		} catch (final CoreException e) {
			LOGGER.error(e);
		}
		final var javaProject = JavaCore.create(project);
		for (final TAbstractType tType : pg.getAllTypes()) {
			if (tType.isDeclared() && (tType.getOuterType() == null)) {
				try {
					new TypeProcessor(tType, javaProject).process();
				} catch (IOException | CoreException e) {
					LOGGER.log(Level.ERROR, e);
					return false;
				}
			}
		}

		return true;
	}

}
