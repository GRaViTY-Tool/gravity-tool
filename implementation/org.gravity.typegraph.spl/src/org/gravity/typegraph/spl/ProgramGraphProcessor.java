package org.gravity.typegraph.spl;

import java.io.IOException;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.gravity.eclipse.GravityActivator;
import org.gravity.tgg.modisco.processing.pg.IProgramGraphProcessor;
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
	public boolean process(TypeGraph pg, IProgressMonitor monitor) {
		IProject project = GravityActivator.getDefault().getProject(pg.getTName());
		IJavaProject javaProject = JavaCore.create(project);
		for (TAbstractType tType : pg.getOwnedTypes()) {
			if (tType.isDeclared() && tType.getOuterType() == null) {
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
