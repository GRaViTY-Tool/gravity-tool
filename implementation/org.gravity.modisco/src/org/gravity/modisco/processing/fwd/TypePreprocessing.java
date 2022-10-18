/**
 *
 */
package org.gravity.modisco.processing.fwd;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.processing.AbstractTypedModiscoProcessor;

/**
 * A processor for adding accesses to members
 *
 * @author speldszus
 *
 */
public class TypePreprocessing extends AbstractTypedModiscoProcessor<AbstractTypeDeclaration> {


	@Override
	public boolean process(final MGravityModel model, final Collection<AbstractTypeDeclaration> elements, final IFolder debug,
			final IProgressMonitor monitor) {
		final List<AbstractTypeDeclaration> unresolved = elements.parallelStream().filter(e -> e.eContainer() == null).collect(Collectors.toList());
		model.getOrphanTypes().addAll(unresolved);
		return true;
	}

	@Override
	public Class<AbstractTypeDeclaration> getSupportedType() {
		return AbstractTypeDeclaration.class;
	}

}
