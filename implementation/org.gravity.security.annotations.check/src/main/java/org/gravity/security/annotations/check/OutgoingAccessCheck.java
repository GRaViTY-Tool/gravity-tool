package org.gravity.security.annotations.check;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.internal.corext.callhierarchy.MethodWrapper;
import org.gravity.security.annotations.check.data.SecurityProperty;
import org.gravity.security.annotations.check.data.SecurityRequirements;
import org.gravity.security.annotations.check.data.SecurityViolation;
import org.gravity.security.annotations.marker.SecurityMarkerUtil;

@SuppressWarnings("restriction")
final class OutgoingAccessCheck {

	private final SecureDependencyCheck check;
	private final Collection<IMember> accessedMembers;
	private final MethodWrapper root;
	private final Set<String> secrecySignatures;
	private final Set<String> integritySignatures;
	private final ICompilationUnit cu;
	private final IMember callingMember;

	private final Collection<SecurityViolation> violations;

	OutgoingAccessCheck(final SecureDependencyCheck secureDependencyCheck, final Collection<IMember> accessedMembers,
			final MethodWrapper root, final IMember caller, final SecurityRequirements requirements) {
		this.check = secureDependencyCheck;
		this.accessedMembers = accessedMembers;
		this.root = root;
		this.callingMember = caller;
		this.cu = caller.getCompilationUnit();
		this.secrecySignatures = requirements.getAllSecrecySignatures();
		this.integritySignatures = requirements.getAllIntegritySignatures();

		this.violations = new HashSet<>();
	}

	public boolean visit(final MethodWrapper methodWrapper) {
		if (this.root == methodWrapper) {
			return true;
		}
		final var calledMember = methodWrapper.getMember();

		SecurityMarkerUtil.deleteOldMarkers(calledMember.getResource(),
				SecureDependencyCheck.getSignature(this.callingMember), this.check.timestamp);

		IType declaringType;
		if (calledMember instanceof final IType itype) {
			// Call to default constructor
			declaringType = itype;
		} else {
			declaringType = calledMember.getDeclaringType();
		}
		final var calleeRequirements = this.check.getSecurityRequirements(declaringType);

		final var callerSecrecyRequirement = SecureDependencyCheck.getCorrespondingEntry(calledMember,
				this.secrecySignatures, this.cu);
		final var callerSecrey = callerSecrecyRequirement != null;
		if (callerSecrey) {
			this.accessedMembers.add(calledMember);
		}
		if (callerSecrey != (calleeRequirements.isSecrecyMember(calledMember) || SecureDependencyCheck
				.getCorrespondingEntry(calledMember, calleeRequirements.getAllSecrecySignatures(), this.cu) != null)) {
			if (callerSecrey) {
				this.violations.add(new SecurityViolation(this.callingMember, calledMember, calledMember,
						SecurityProperty.SECRECY));
			} else {
				this.violations.add(new SecurityViolation(this.callingMember, calledMember, this.callingMember,
						SecurityProperty.SECRECY));
			}
		}

		final var callerIntegrityRequirement = SecureDependencyCheck.getCorrespondingEntry(calledMember,
				this.integritySignatures, this.cu);
		final var callerIntegrity = callerIntegrityRequirement != null;
		if (callerIntegrity) {
			this.accessedMembers.add(calledMember);
		}
		if (callerIntegrity != (calleeRequirements.isIntegrityMember(calledMember) || SecureDependencyCheck
				.getCorrespondingEntry(calledMember, calleeRequirements.getAllIntegritySignatures(), this.cu) != null)) {
			if (callerIntegrity) {
				this.violations.add(new SecurityViolation(this.callingMember, calledMember, calledMember,
						SecurityProperty.INTEGRITY));
			} else {
				this.violations.add(new SecurityViolation(this.callingMember, calledMember, this.callingMember,
						SecurityProperty.INTEGRITY));
			}
		}

		// Do not continue tree traversal
		return false;
	}

	public Collection<SecurityViolation> getViolations() {
		return this.violations;
	}
}