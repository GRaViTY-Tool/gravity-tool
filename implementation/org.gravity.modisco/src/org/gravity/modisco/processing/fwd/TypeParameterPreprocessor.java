package org.gravity.modisco.processing.fwd;

import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.modisco.java.TypeParameter;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.processing.AbstractTypedModiscoProcessor;

/**
 * Collects all type parameters
 * 
 * @author speldszus
 *
 */
public class TypeParameterPreprocessor extends AbstractTypedModiscoProcessor<TypeParameter> {

	@Override
	public boolean process(MGravityModel model, Collection<TypeParameter> elements, IProgressMonitor monitor) {
		model.getTypeParameters().addAll(elements);
		return true;
	}

	@Override
	public Class<TypeParameter> getSupportedType() {
		return TypeParameter.class;
	}

}
