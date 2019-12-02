package org.gravity.goblin.preconditions;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

import org.gravity.goblin.SearchParameters;
import org.gravity.refactorings.impl.MoveMethod;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.annotations.TAnnotationType;

/**
 * Checks for the preconditions of a move method refactoring
 * 
 * @author speldszus
 *
 */
public class MoveMethodPreConditions {

	/**
	 * The logger of this class
	 */
	private static final Logger LOGGER = Logger.getLogger(MoveMethodPreConditions.class.getName());

	private MoveMethodPreConditions() {
		// This class shouldn't be instantiated
	}

	private static boolean securityPrecondition(TMethodSignature methodSig, TClass sourceClass) {
		List<TAnnotation> annotations = new ArrayList<TAnnotation>();
		annotations.addAll(methodSig.getTAnnotation());
		for (TMethodDefinition methodDef : methodSig.getMethodDefinitions()) {
			if (methodDef.getDefinedBy() == sourceClass) {
				annotations.addAll(methodDef.getTAnnotation());
			}
		}
		for (TAnnotation annotation : annotations) {
			TAnnotationType type = annotation.getType();
			if (type == null) {
				continue;
			}
			String tName = annotation.getType().getTName();
			if (tName.equals("High") || tName.equals("Critical") || tName.equals("Secrecy")
					|| tName.equals("Integrity")) {
				LOGGER.warn("Can't move " + sourceClass.getFullyQualifiedName() + "."
						+ methodSig.getSignatureString() + ", REASON security");
				return false;
			}
		}
		return true;
	}

	/**
	 * Checks is the mehtod with the given signature can be moved from the source class to an other class
	 * 
	 * @param tMethodSignature The signature of the method
	 * @param sourceClass The class defining the method
	 * @return true, iff the method can be moved to another class
	 */
	public static boolean methodPreconditions(TMethodSignature tMethodSignature, TClass sourceClass) {

		if (SearchParameters.useSecurity && !securityPrecondition(tMethodSignature, sourceClass)) {
			return false;
		}

		return MoveMethod.getterSetterPrecondition(tMethodSignature)
				&& MoveMethod.interfacePrecondition(tMethodSignature, sourceClass)
				&& MoveMethod.overridePrecondition(tMethodSignature, sourceClass);
	}
}
