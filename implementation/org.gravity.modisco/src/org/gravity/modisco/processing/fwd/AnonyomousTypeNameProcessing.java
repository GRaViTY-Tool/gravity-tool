package org.gravity.modisco.processing.fwd;

import java.util.Collection;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.modisco.java.Type;
import org.gravity.modisco.MClassInstanceCreation;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.processing.AbstractTypedModiscoProcessor;

public class AnonyomousTypeNameProcessing extends AbstractTypedModiscoProcessor<Type> {

	@Override
	public boolean process(final MGravityModel model, final Collection<Type> elements, final IFolder debug,
			final IProgressMonitor monitor) {
		elements.parallelStream().forEach(cu -> {
			var i = 1;
			final var iterator = cu.eAllContents();
			while (iterator.hasNext()) {
				final var next = iterator.next();
				if (next instanceof final MClassInstanceCreation instance) {
					instance.setId(i++);
				}
			}
		});
		return true;
	}

	@Override
	public Class<Type> getSupportedType() {
		return Type.class;
	}

}
