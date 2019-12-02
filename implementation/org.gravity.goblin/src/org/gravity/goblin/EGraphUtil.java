package org.gravity.goblin;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.gravity.hulk.HAntiPatternDetection;
import org.gravity.hulk.HAntiPatternHandling;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.typegraph.basic.TypeGraph;

/**
 *
 * Frequently used helpers for Henshin EGraphs
 *
 */
public final class EGraphUtil {

	private EGraphUtil() {
		// This class shouldn't be instantiated
	}

	/**
	 * Searches the TypeGraph in an Henshin egraph
	 *
	 * @param graph The egraph
	 * @return The program model
	 */
	public static TypeGraph getPG(EGraph graph) {
		TypeGraph pg = null;
		final EObject root = graph.getRoots().get(0);
		if (root instanceof TypeGraph) {
			pg = (TypeGraph) root;
		}

		if (root instanceof HAntiPatternGraph) {
			pg = ((HAntiPatternGraph) root).getPg();
		}

		if (root instanceof HAntiPatternHandling) {
			pg = ((HAntiPatternDetection) root).getApg().getPg();
		}
		return pg;
	}

}
