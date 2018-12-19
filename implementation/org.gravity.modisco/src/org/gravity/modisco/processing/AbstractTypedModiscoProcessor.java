package org.gravity.modisco.processing;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.gravity.modisco.MGravityModel;

/**
 * A processor implementation for processing only elements of a single type
 * 
 * @author speldszus
 *
 * @param <T> The type of the objects which can be processed by this processor
 */
public abstract class AbstractTypedModiscoProcessor<T extends EObject> implements IMoDiscoProcessor {

	/**
	 * Applies a processing to all elements of type T
	 * 
	 * @param model The model containing the elements
	 * @param elements The elements
	 * @param monitor A progress monitor
	 * @return true, iff all elements have been processed successfully
	 */
	public abstract boolean process(MGravityModel model, Collection<T> elements, IProgressMonitor monitor);

	/**
	 * This method should be only used if there is no other possibility as it
	 * iterates over all elements contained in the model to find those of type T.
	 * 
	 * @param model The model which should be processed
	 * @param monitor A progress monitor
	 */
	@Override
	public boolean process(MGravityModel model, IProgressMonitor monitor) {
		Class<T> supportedType = getSupportedType();
		TreeIterator<EObject> iterator = model.eAllContents();
		LinkedList<T> elements = new LinkedList<>();
		while (iterator.hasNext()) {
			EObject next = iterator.next();
			if(supportedType.isAssignableFrom(next.getClass())) {
				elements.add((supportedType.cast(next)));
			} 
		}
		return process(model, elements, monitor);
	}
	
	/**
	 * Returns the type of the object which can be processed with this processor
	 * 
	 * @return The supported type
	 */
	public abstract Class<T> getSupportedType();
}
