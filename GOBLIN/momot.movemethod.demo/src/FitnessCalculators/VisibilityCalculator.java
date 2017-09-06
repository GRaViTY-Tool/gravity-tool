package FitnessCalculators;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.gravity.hulk.HAntiPatternDetection;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TModifier;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.TypeGraph;

public class VisibilityCalculator extends MetricCalculator {

	@Override
	public double calculate(EGraph graph) {
		int value = 0;

		TypeGraph pg = null;
		EObject root = graph.getRoots().get(0);
		if (root instanceof TypeGraph) {
			pg = (TypeGraph) root;
		} else if (root instanceof HAntiPatternGraph) {
			pg = ((HAntiPatternGraph) root).getPg();
		} else if (root instanceof HAntiPatternDetection) {
			pg = ((HAntiPatternDetection) root).getApg().getPg();

		}

		if (pg == null) {
			throw new RuntimeException("PG not found!");
		}

		for (TClass tClass : pg.getClasses()) {
			if (!tClass.isTLib()) {
				for (TMember tMember : tClass.getDefines()) {
					TModifier tModifier = tMember.getTModifier();
					if (tModifier == null) {
						System.err.println("The member \"" + tMember.getSignatureString() + "\" in the  class \""
								+ tClass.getFullyQualifiedName() + "\" has no modifier.");
					} else {
						TVisibility tVisibility = tModifier.getTVisibility();
						if (tVisibility != null) {
							switch (tVisibility) {
							case TPUBLIC:
								value += 3;
								break;
							case TPROTECTED:
								value += 2;
								break;
							case TPACKAGE:
								value += 1;
								break;
							case TPRIVATE:
								break;
							}
						}
					}
				}
			}
		}

		return value;
	}

}
