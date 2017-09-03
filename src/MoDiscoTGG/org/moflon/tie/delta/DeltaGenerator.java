package MoDiscoTGG.org.moflon.tie.delta;

import java.util.Random;
import java.util.Set;

import org.eclipse.gmt.modisco.java.Package;
import org.eclipse.gmt.modisco.java.emf.JavaFactory;

public interface DeltaGenerator {
	// find
	// create objects
	// create primitives
	// create edges
	// set primitives

	/**
	 * applies a new Delta to the source model
	 * 
	 * @param model
	 *            the source model
	 * @param r
	 *            the {@link Random} to use for the delta generation
	 * @return the sum of newly added nodes and edges
	 */
	public DeltaResult applyForward(IndexedModel<org.eclipse.gmt.modisco.java.Model> model, Random r);

	/**
	 * applies a new Delta to the target model
	 * 
	 * @param model
	 *            the target model
	 * @param r
	 *            the {@link Random} to use for the delta generation
	 * @return the sum of newly added nodes and edges
	 */
	public DeltaResult applyBackward(IndexedModel<org.eclipse.uml2.uml.Model> model, Random r);

	/**
	 * gets the classes this DeltaGenerator is searching for when generating a
	 * forward delta
	 */
	public Set<Class<?>> getForwardInterests();

	/**
	 * gets the classes this DeltaGenerator is searching for when generating a
	 * forward delta
	 */
	public Set<Class<?>> getBackwardInterests();
}
