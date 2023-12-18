package org.gravity.security.annotations.check;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.internal.core.LambdaMethod;
import org.eclipse.jdt.internal.corext.callhierarchy.CallHierarchyVisitor;
import org.eclipse.jdt.internal.corext.callhierarchy.MethodWrapper;
import org.gravity.security.annotations.check.data.SecurityProperty;
import org.gravity.security.annotations.check.data.SecurityViolation;
import org.gravity.security.annotations.marker.SecurityMarkerUtil;

@SuppressWarnings("restriction")
final class IncomingAccessCheck extends CallHierarchyVisitor {

	/**
	 *
	 */
	private final SecureDependencyCheck secureDependencyCheck;
	private final IMember calledMember;
	private final boolean secrecy;
	private final MethodWrapper root;
	private final boolean integrity;
	private final ICompilationUnit cu;

	private final Collection<SecurityViolation> violations;

	IncomingAccessCheck(final SecureDependencyCheck secureDependencyCheck, final IMember member, final boolean secrecy,
			final MethodWrapper root, final boolean integrity) {
		this.secureDependencyCheck = secureDependencyCheck;
		this.calledMember = member;
		this.cu = member.getCompilationUnit();
		this.secrecy = secrecy;
		this.root = root;
		this.integrity = integrity;
		this.violations = new HashSet<>();

	}

	@Override
	public boolean visit(final MethodWrapper methodWrapper) {
		if (this.root == methodWrapper) {
			return true;
		}
		final var callingMember = methodWrapper.getMember();
		SecurityMarkerUtil.deleteOldMarkers(callingMember.getResource(),
				SecureDependencyCheck.getSignature(this.calledMember), this.secureDependencyCheck.timestamp);

		IType type;
		if (callingMember instanceof final IType itype) {
			type = itype;
		} else if (callingMember instanceof final LambdaMethod lambda) {
			type = lambda.getOuterMostLocalContext().getDeclaringType();
		} else {
			type = callingMember.getDeclaringType();
		}
		final var callerAnnotations = this.secureDependencyCheck.getSecurityRequirements(type);

		final var callerSecrecyRequirement = SecureDependencyCheck.getCorrespondingEntry(this.calledMember,
				callerAnnotations.getSecrecySignatures(), this.cu);
		final var callerSecrecy = callerSecrecyRequirement != null;
		if (callerSecrecy != this.secrecy) {
			if (callerSecrecy) {
				this.violations.add(new SecurityViolation(callingMember, this.calledMember, this.calledMember,
						SecurityProperty.SECRECY));
			} else {
				this.violations.add(new SecurityViolation(callingMember, this.calledMember, callingMember,
						SecurityProperty.SECRECY));
			}
		}

		final var callerIntegrityRequirement = SecureDependencyCheck.getCorrespondingEntry(this.calledMember,
				callerAnnotations.getIntegritySignatures(), this.cu);
		final var callerIntegrity = callerIntegrityRequirement != null;
		if (callerIntegrity != this.integrity) {
			if (callerIntegrity) {
				this.violations.add(new SecurityViolation(callingMember, this.calledMember, this.calledMember,
						SecurityProperty.INTEGRITY));
			} else {
				this.violations.add(new SecurityViolation(callingMember, this.calledMember, callingMember,
						SecurityProperty.SECRECY));
			}
		}

		return false;
	}

	public Collection<SecurityViolation> getViolations() {
		return this.violations;
	}
}