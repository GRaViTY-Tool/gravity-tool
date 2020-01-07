package org.gravity.goblin.preconditions;

import org.apache.log4j.Logger;
import org.eclipse.osgi.util.NLS;
import org.gravity.goblin.Messages;
import org.gravity.security.annotations.requirements.Critical;
import org.gravity.security.annotations.requirements.High;
import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TInterface;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.annotations.TAnnotationType;

public final class ChangeVisibilityPreConditions {

	private static final String SECRECY = Secrecy.class.getSimpleName();
	private static final String INTEGRITY = Integrity.class.getSimpleName();
	private static final String CRITICAL = Critical.class.getSimpleName();
	private static final String HIGH = High.class.getSimpleName();
	private static final Logger LOGGER = Logger.getLogger(ChangeVisibilityPreConditions.class);

	private ChangeVisibilityPreConditions() {
		// This class shouldn't be instantiated
	}

	/**
	 * Checks the INH2 preconditions: If a childClass implements an interface with
	 * the same field as the field in the violation do not change the visibility as
	 * this may introduce ambiguity
	 *
	 * @param sourceClass The class from which a member should be moved
	 * @param member      The member that should be moved
	 * @return true, if there is no violation
	 */
	private static boolean checkINH2Preconditions(final TClass sourceClass, final TMember member) {
		if (!(member instanceof TFieldDefinition)) {
			return true;
		}
		if (!member.getTModifier().isIsStatic()) {
			return true;
		}

		for (final TClass child : sourceClass.getChildClasses()) {
			for (final TInterface tInterface : child.getImplements()) {
				if (!checkInterfaceINH2Preconditions(tInterface, member)) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Checks the INH2 preconditions: If a childClass implements an interface with
	 * the same field as the field in the violation do not change the visibility as
	 * this may introduce ambiguity
	 *
	 * @param tInterface The interface against which the check should be performed
	 * @param tMember    The member for which should be checked
	 * @return true, if there is no violation
	 */
	private static boolean checkInterfaceINH2Preconditions(final TInterface tInterface, final TMember tMember) {
		for (final TMember interfaceMember : tInterface.getDefines()) {
			if (interfaceMember.getTModifier() == null) {
				final String name = interfaceMember.getDefinedBy().getFullyQualifiedName() + '.'
						+ interfaceMember.getSignatureString();
				LOGGER.warn(NLS.bind(Messages.cannotMove, name, "INH2-1")); //$NON-NLS-1$
				return false;
			}
			if (interfaceMember.getTModifier().isIsStatic()
					&& interfaceMember.getSignature() == tMember.getSignature()) {
				final String name = interfaceMember.getDefinedBy().getFullyQualifiedName() + '.'
						+ interfaceMember.getSignatureString();
				LOGGER.warn(NLS.bind(Messages.cannotMove, name, "INH2-2")); //$NON-NLS-1$
				return false;
			}
		}
		return true;
	}

	// if a parentclass defines a method with the same signature do not change the
	// visibility as this may introduce a new dynamic binding
	private static boolean checkDynPreconditions(final TClass sourceClass, final TMember member) {

		TClass parent = sourceClass.getParentClass();
		final TSignature sig = member.getSignature();
		while (parent != null) {
			if (parent.getSignature().contains(sig)) {
				final String name = member.getDefinedBy().getFullyQualifiedName() + '.' + member.getSignatureString();
				LOGGER.warn(NLS.bind(Messages.cannotMove, name, "Dyn")); //$NON-NLS-1$
				return false;
			}
			parent = parent.getParentClass();
		}

		for (final TClass child : sourceClass.getAllChildren()) {
			if (child.getSignature().contains(sig)) {
				final String name = member.getDefinedBy().getFullyQualifiedName() + '.' + member.getSignatureString();
				LOGGER.warn(NLS.bind(Messages.cannotMove, name, "Dyn")); //$NON-NLS-1$
				return false;
			}
		}

		return true;
	}

	private static boolean checkSecurityPreconditions(final TMember member) {
		for (final TAnnotation annotation : member.getTAnnotation()) {
			final TAnnotationType type = annotation.getType();
			if (type == null) {
				continue;
			}
			final String tName = annotation.getType().getTName();
			if (HIGH.equals(tName) || CRITICAL.equals(tName) || SECRECY.equals(tName) || INTEGRITY.equals(tName)) {
				final String name = member.getDefinedBy().getFullyQualifiedName() + '.' + member.getSignatureString();
				LOGGER.warn(NLS.bind(Messages.cannotMove, name, "Security")); //$NON-NLS-1$
				return false;
			}
		}
		return true;
	}

	public static boolean checkPreconditions(final TMember member, final TClass sourceClass) {
		boolean result = checkDynPreconditions(sourceClass, member);
		result &= checkINH2Preconditions(sourceClass, member);
		result &= checkSecurityPreconditions(member);

		return result;
	}
}
