package org.gravity.goblin.preconditions;

import org.apache.log4j.Logger;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TInterface;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.annotations.TAnnotationType;

public final class ChangeVisibilityPreConditions {

	private static final Logger LOGGER = Logger.getLogger(ChangeVisibilityPreConditions.class);

	private ChangeVisibilityPreConditions() {
		// This class shouldn't be instantiated
	}

	// if a childClass implements an interface with the same field as the field in
	// the violation do not change the visibility as this may introduce ambiguity
	private static boolean checkINH2Preconditions(TClass sourceClass, TMember member) {
		if (!(member instanceof TFieldDefinition)) {
			return true;
		}
		if (!member.getTModifier().isIsStatic()) {
			return true;
		}

		for (final TClass child : sourceClass.getChildClasses()) {
			for (final TInterface tInterface : child.getImplements()) {

				for (final TMember interfaceMember : tInterface.getDefines()) {
					if (interfaceMember.getTModifier() == null) {
						LOGGER.warn("Can't move " + interfaceMember.getDefinedBy().getFullyQualifiedName() + "."
								+ interfaceMember.getSignatureString() + ", REASON INH2-1");
						return false;
					}
					if (interfaceMember.getTModifier().isIsStatic()
							&& interfaceMember.getSignature() == member.getSignature()) {
						LOGGER.warn("Can't move " + interfaceMember.getDefinedBy().getFullyQualifiedName() + "."
								+ interfaceMember.getSignatureString() + ", REASON INH2-2");
						return false;
					}
				}
			}
		}
		return true;
	}

	// if a parentclass defines a method with the same signature do not change the
	// visibility as this may introduce a new dynamic binding
	private static boolean checkDynPreconditions(TClass sourceClass, TMember member) {

		TClass parent = sourceClass.getParentClass();
		final TSignature sig = member.getSignature();
		while (parent != null) {
			if (parent.getSignature().contains(sig)) {
				LOGGER.warn("Can't move " + member.getDefinedBy().getFullyQualifiedName() + "."
						+ member.getSignatureString() + ", REASON Dyn");
				return false;
			}
			parent = parent.getParentClass();
		}

		for (final TClass child : sourceClass.getAllChildren()) {
			if (child.getSignature().contains(sig)) {
				LOGGER.warn("Can't move " + member.getDefinedBy().getFullyQualifiedName() + "."
						+ member.getSignatureString() + ", REASON Dyn");
				return false;
			}
		}

		return true;
	}

	private static boolean checkSecurityPreconditions(TMember member) {
		for (final TAnnotation annotation : member.getTAnnotation()) {
			final TAnnotationType type = annotation.getType();
			if (type == null) {
				continue;
			}
			final String tName = annotation.getType().getTName();
			if (tName.equals("High") || tName.equals("Critical") || tName.equals("Secrecy")
					|| tName.equals("Integrity")) {
				LOGGER.warn("Can't move " + member.getDefinedBy().getFullyQualifiedName() + "."
						+ member.getSignatureString() + ", REASON Security");
				return false;
			}
		}
		return true;
	}

	public static boolean checkPreconditions(TMember member, TClass sourceClass) {
		boolean result = checkDynPreconditions(sourceClass, member);
		result &= checkINH2Preconditions(sourceClass, member);
		result &= checkSecurityPreconditions(member);

		return result;
	}
}
