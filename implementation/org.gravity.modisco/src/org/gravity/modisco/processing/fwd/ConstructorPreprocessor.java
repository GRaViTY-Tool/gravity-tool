/**
 * 
 */
package org.gravity.modisco.processing.fwd;

import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.gravity.modisco.MConstructorDefinition;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.processing.AbstractTypedModiscoProcessor;
import org.gravity.modisco.util.MoDiscoUtil;

/**
 * A processor for creating translatable parameter lists in constructors
 * 
 * @author speldszus
 *
 */
public class ConstructorPreprocessor extends AbstractTypedModiscoProcessor<MConstructorDefinition> {

	@Override
	public boolean process(MGravityModel model, Collection<MConstructorDefinition> elements, IProgressMonitor monitor) {
		elements.parallelStream().forEach(a -> {
			MoDiscoUtil.fillParamList(a, a.getMParameterList());
		});
		return true;
	}

	@Override
	public Class<MConstructorDefinition> getSupportedType() {
		return MConstructorDefinition.class;
	}

}
