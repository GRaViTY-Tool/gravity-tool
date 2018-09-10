/**
 * 
 */
package org.gravity.modisco.processing.fwd;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.AnonymousClassDeclaration;
import org.gravity.modisco.MAnonymous;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.processing.IMoDiscoProcessor;

/**
 * A processor for creating the MAnonymous.mSourroundigType link
 * 
 * @author speldszus
 *
 */
public class AnonymousClassPreprocessing implements IMoDiscoProcessor {
	
private static final Logger LOGGER = Logger.getLogger(AnonymousClassPreprocessing.class);

	/* (non-Javadoc)
	 * @see org.gravity.modisco.processing.IMoDiscoProcessor#process(org.gravity.modisco.MGravityModel, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public boolean process(MGravityModel model, IProgressMonitor monitor) {
		for(AnonymousClassDeclaration anonymous : model.getAnonymousClassDeclarations()) {
			EObject owner = anonymous.eContainer();
			while(owner != null && !(owner instanceof AbstractTypeDeclaration)) {
				owner = owner.eContainer();
			}
			if(owner == null) {
				LOGGER.log(Level.ERROR, "Cannot find owner of anonymous class declaration: "+anonymous);
				return false;
			}
			((MAnonymous) anonymous).setMSourroundingType((AbstractTypeDeclaration) owner);
		}
		return true;
	}

}
