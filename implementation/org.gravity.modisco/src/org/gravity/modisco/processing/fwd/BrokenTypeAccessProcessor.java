package org.gravity.modisco.processing.fwd;

import java.util.Collection;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.processing.AbstractTypedModiscoProcessor;

/**
 * This preprocessor removes broken references
 *
 * @author speldszus
 *
 */
public class BrokenTypeAccessProcessor extends AbstractTypedModiscoProcessor<Type> {

	@Override
	public boolean process(final MGravityModel model, final Collection<Type> elements,
			final IFolder debug, final IProgressMonitor monitor) {
		for(final Type type : elements) {
			final BasicEList<TypeAccess> accesses = (BasicEList<TypeAccess>) type.getUsagesInTypeAccess();
			final Object[] data = accesses.data();
			for(int i = accesses.size() -1; i >= 0; i--) {
				if(data[i] == null) {
					accesses.remove(i);
				}
			}
		}
		return true;
	}

	@Override
	public Class<Type> getSupportedType() {
		return Type.class;
	}

}
