package org.gravity.goblin.preconditions;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import org.gravity.goblin.SearchParameters;
import org.gravity.refactorings.impl.Move_MethodImpl;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.annotations.TAnnotationType;

public class MoveMethodPreConditions {
	
	private static final Logger LOGGER = Logger.getLogger(MoveMethodPreConditions.class.getName());

	private static boolean securityPrecondition(TMethodSignature methodSig, TClass sourceClass) {
		List<TAnnotation> annotations = new ArrayList<TAnnotation>();
		annotations.addAll(methodSig.getTAnnotation());
		for (TMethodDefinition methodDef : methodSig.getDefinitions()) {
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
				LOGGER.log(Level.WARN, "Can't move " + sourceClass.getFullyQualifiedName() + "."
						+ methodSig.getSignatureString() + ", REASON security");
				return false;
			}
		}
		return true;
	}

	public static boolean methodPreconditions(TMethodSignature tMethodSignature, TClass sourceClass) {
		
		if (SearchParameters.useSecurity) {
			if (!securityPrecondition(tMethodSignature, sourceClass)) {
				return false;
			}
		}
		
		return Move_MethodImpl.getterSetterPrecondition(tMethodSignature)
				&& Move_MethodImpl.interfacePrecondition(tMethodSignature, sourceClass)
				&& Move_MethodImpl.overridePrecondition(tMethodSignature, sourceClass);
	}
}
