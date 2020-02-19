package org.gravity.goblin.repair;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;
import org.gravity.goblin.EGraphUtil;
import org.gravity.hulk.antipatterngraph.metrics.HIGAMMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsPackage;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TConstructor;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.annotations.TAnnotation;

import at.ac.tuwien.big.momot.problem.solution.TransformationSolution;
import at.ac.tuwien.big.momot.search.solution.repair.ITransformationRepairer;

public class VisibilityReducer implements ITransformationRepairer {

	public static Collection<TMember> reduce(TypeGraph pg) {
		Collection<TMember> changed = new LinkedList<>();

		for (TClass tClass : pg.getClasses()) {
			if (tClass.isDeclared())
				for (TMember tMember : tClass.getDefines()) {
					if (!TConstructor.isConstructor(tMember) && !(tMember instanceof TFieldDefinition)) {
						EList<TAnnotation> annotations = tMember.getTAnnotation(MetricsPackage.eINSTANCE.getHIGAMMetric());	
						if(annotations.size() != 1) {
							throw new IllegalStateException("Unexpected amount of IGAM metrics on \""+tClass.getFullyQualifiedName()+"->"+tMember.getSignatureString()+"\".");
						}
						HIGAMMetric higamMetric = (HIGAMMetric) annotations.get(0);
						if(higamMetric.getValue() > 0.0) {
							higamMetric.setValue(0.0);
							tMember.getTModifier().setTVisibility(higamMetric.getHMinVis());
						}
					}
				}
		}

		return changed;
	}

	@Override
	public TransformationSolution repair(TransformationSolution arg0) {
		reduce(EGraphUtil.getPG(arg0.getResultGraph()));
		return arg0;
	}
}
