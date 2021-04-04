package org.gravity.hulk.detection;

import java.util.Collection;
import java.util.LinkedList;
import org.eclipse.emf.ecore.EClass;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;

public class Lcom5 {

	private static final EClass METHOD_DEFINITION = BasicPackage.eINSTANCE.getTMethodDefinition();
	private static final EClass FIELD_DEFINITION = BasicPackage.eINSTANCE.getTFieldDefinition();

	/**
	 * Calculates LCOM5 according to 
	 * Brian Henderson-Sellers:
	 * "Object-oriented Metics: Measures of Complexity"
	 * Prentice Hall PTR, 1996
	 * 
	 * @param tClass The class for which LCOM5 should be calculated
	 * @return The LCOM5 value
	 */
	public static double calculate(TClass tClass) {
		final Collection<TMethodDefinition> methods = new LinkedList<>();
		final Collection<TFieldDefinition> fields = new LinkedList<>();
		for (TMember member : tClass.getDefines()) {
			EClass eClass = member.eClass();
			if (eClass.equals(FIELD_DEFINITION)) {
				fields.add((TFieldDefinition) member);
			} else if (eClass.equals(METHOD_DEFINITION)) {
				methods.add((TMethodDefinition) member);
			}
		}
		int numMethods = methods.size();
		int numFields = fields.size();
		if(numFields == 0) {
			return 1;
		}

		double value = 0;
		for (TFieldDefinition field : fields) {
			value += field.getAccessedBy().parallelStream().map(access -> access.getSource()).distinct()
					.filter(member -> METHOD_DEFINITION.equals(member.eClass()))
					.filter(member -> tClass.equals(member.getDefinedBy())).count();
		}

		return ((value / numFields) - numMethods) / (1 - numMethods);
	}
}
