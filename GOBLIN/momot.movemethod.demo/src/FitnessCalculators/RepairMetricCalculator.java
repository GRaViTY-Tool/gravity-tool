package FitnessCalculators;

import java.beans.Visibility;

import org.eclipse.emf.henshin.interpreter.EGraph;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.annotations.TAnnotation;

import Repair.RepairAnnotation;
import Repair.VisibilityRepairer;
import momotFiles.Utility;

public class RepairMetricCalculator extends MetricCalculator{

	@Override
	public double calculate(EGraph graph) {
		int value = 0;
		for(TClass tClass: Utility.getPG(graph).getClasses()){
			for(TMember member: tClass.getDefines()){
				for(TAnnotation annotation: member.getTAnnotation()){
					if(annotation instanceof RepairAnnotation){
						RepairAnnotation repairAnnot = (RepairAnnotation)annotation;
						value += repairAnnot.getNewVisibiliy().compareTo(repairAnnot.getOldVisibility());
						
						
					}
				}
			}
		}
		return value;
	}

}
