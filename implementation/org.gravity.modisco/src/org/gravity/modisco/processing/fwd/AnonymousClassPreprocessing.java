/**
 * 
 */
package org.gravity.modisco.processing.fwd;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.gravity.modisco.MAnonymous;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.processing.AbstractTypedModiscoProcessor;

/**
 * A processor for creating the MAnonymous.mSourroundigType link
 * 
 * @author speldszus
 *
 */
public class AnonymousClassPreprocessing extends AbstractTypedModiscoProcessor<AnonymousClassDeclaration> {

	private static final Logger LOGGER = Logger.getLogger(AnonymousClassPreprocessing.class);

	@Override
	public boolean process(MGravityModel model, Collection<AnonymousClassDeclaration> elements,
			IProgressMonitor monitor) {
		for (AnonymousClassDeclaration anonymous : elements) {
			EObject owner = anonymous.eContainer();
			while (owner != null && !(owner instanceof AbstractTypeDeclaration)) {
				owner = owner.eContainer();
			}
			if (owner == null) {
				LOGGER.error("Cannot find owner of anonymous class declaration: " + anonymous);
				return false;
			}
			((MAnonymous) anonymous).setMSourroundingType((AbstractTypeDeclaration) owner);
		}
		return true;
	}

	@Override
	public Class<AnonymousClassDeclaration> getSupportedType() {
		return AnonymousClassDeclaration.class;
	}

}
