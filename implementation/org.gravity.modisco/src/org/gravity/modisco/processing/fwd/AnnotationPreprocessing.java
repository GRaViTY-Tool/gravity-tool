/**
 * 
 */
package org.gravity.modisco.processing.fwd;

import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;
import org.gravity.modisco.MAnnotation;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.processing.AbstractTypedModiscoProcessor;

/**
 * A processor for marking Annotations which should be translated
 * 
 * @author speldszus
 *
 */
public class AnnotationPreprocessing extends AbstractTypedModiscoProcessor<MAnnotation> {

	@Override
	public boolean process(MGravityModel model, Collection<MAnnotation> elements, IProgressMonitor monitor) {
		final EClass singleVariableDeclaration = JavaPackage.eINSTANCE.getSingleVariableDeclaration();
		final EClass bodyDeclaration = JavaPackage.eINSTANCE.getBodyDeclaration();
		elements.parallelStream().forEach(a -> {
			EClass eContainer = a.eContainer().eClass();
			boolean relevant = bodyDeclaration.isSuperTypeOf(eContainer)
					|| singleVariableDeclaration.isSuperTypeOf(eContainer);
			a.setMRelevant(relevant);
		});
		return true;
	}

	@Override
	public Class<MAnnotation> getSupportedType() {
		return MAnnotation.class;
	}

}
