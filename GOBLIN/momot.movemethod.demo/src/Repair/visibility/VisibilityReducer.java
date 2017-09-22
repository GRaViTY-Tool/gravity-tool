package Repair.visibility;

import java.util.Collection;
import java.util.LinkedList;

import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TConstructorDefinition;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TModifier;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.TypeGraph;

import ConstraintCalculators.AllConstraintsCalculator;
import ConstraintCalculators.ViolationsMap;
import PreConditions.ChangeVisibilityPreConditions;
import at.ac.tuwien.big.momot.problem.solution.TransformationSolution;
import at.ac.tuwien.big.momot.search.solution.repair.ITransformationRepairer;
import momotFiles.Utility;

public class VisibilityReducer implements ITransformationRepairer {

	public static Collection<TMember> reduce(TypeGraph pg) {
		Collection<TMember> changed = new LinkedList<>();

		for (TClass tClass : pg.getClasses()) {
			if (!tClass.isTLib() && !"Anonymous".equals(tClass.getTName()) && !"T".equals(tClass.getTName()))
				for (TMember tMember : tClass.getDefines()) {
					if (!(tMember instanceof TConstructorDefinition)) {
						if(ChangeVisibilityPreConditions.checkPreconditions(tMember, tClass)){
							TModifier tModifier = tMember.getTModifier();
							if (tModifier == null) {
								throw new RuntimeException(
										"Member has no modifier: " + tMember.getDefinedBy().getFullyQualifiedName() + " -> "
												+ tMember.getSignatureString());
							}
							TVisibility tCurVis = tModifier.getTVisibility();
							int tMinVis = TVisibility.TPRIVATE_VALUE;
							for (TAccess tAccess : tMember.getAccessedBy()) {
								TVisibility tVis = tMember.getMinimumRequiredVisibility(tAccess.getTSource());
								if (tVis.getValue() > tMinVis) {
									tMinVis = tVis.getValue();
								}
								if (tMinVis == TVisibility.TPUBLIC_VALUE) {
									break;
								}
							}
	
							if (tCurVis.getValue() != tMinVis) {
								tModifier.setTVisibility(TVisibility.get(tMinVis));
								ViolationsMap map = new AllConstraintsCalculator().memberLeadsToViolations(tMember);
								if(map.size() > 0){
									TVisibility visibility = map.getHashmap().get(tMember);
									tModifier.setTVisibility(visibility);
									if(tCurVis.getValue() != visibility.getValue()){
										changed.add(tMember);
									}
								}else{
									changed.add(tMember);
								}
							}
						}
					}
				}
		}

		return changed;
	}

	@Override
	public TransformationSolution repair(TransformationSolution arg0) {
		reduce(Utility.getPG(arg0.getResultGraph()));
		return arg0;
	}
}
