package org.gravity.security.annotations.check;

import java.util.Collection;
import java.util.Set;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.internal.corext.callhierarchy.MethodWrapper;
import org.gravity.security.annotations.check.data.SecurityRequirements;
import org.gravity.security.annotations.marker.SecurityMarkerUtil;

@SuppressWarnings("restriction")
final class OutgoingAccessCheck {
	/**
	 *
	 */
	private final SecureDependencyCheck outgoing;
	private final Collection<IMember> accessedMembers;
	private final MethodWrapper root;
	private final Set<String> secrecySignatures;
	private final Set<String> integritySignatures;
	private final ICompilationUnit cu;
	private final String analyzedMemberSignature;
	private final IType type;

	OutgoingAccessCheck(final SecureDependencyCheck secureDependencyCheck, final Collection<IMember> accessedMembers,
			final MethodWrapper root, final IMember caller, final SecurityRequirements requirements) {
		this.outgoing = secureDependencyCheck;
		this.accessedMembers = accessedMembers;
		this.root = root;
		this.cu = caller.getCompilationUnit();
		this.type = caller.getDeclaringType();
		this.secrecySignatures = requirements.getSecrecySignatures();
		this.integritySignatures = requirements.getIntegritySignatures();
		this.analyzedMemberSignature = SecureDependencyCheck.getSignature(caller);
	}

	public boolean visit(final MethodWrapper methodWrapper) {
		if (this.root == methodWrapper) {
			return true;
		}
		final var calledMember = methodWrapper.getMember();
		if (calledMember instanceof IType) {
			return false;
		}
		SecurityMarkerUtil.deleteOldMarkers(calledMember.getResource(), this.analyzedMemberSignature,
				this.outgoing.timestamp);

		final var calleeRequirements = this.outgoing.getSecurityRequirements(calledMember.getDeclaringType());

		final var callerSecrecyRequirement = SecureDependencyCheck.getCorrespondingEntry(calledMember,
				this.secrecySignatures, this.cu);
		final var callerSecrey = callerSecrecyRequirement != null;
		if (callerSecrey) {
			this.accessedMembers.add(calledMember);
		}
		if (callerSecrey != calleeRequirements.isSecrecyMember(calledMember)) {
			final var calledMemberSignature = SecureDependencyCheck.getSignature(calledMember);
			if (callerSecrey) {
				SecurityMarkerUtil.createErrorMarker(methodWrapper.getMethodCall(),
						"Secrecy is required but not provided by the accessed member!", this.analyzedMemberSignature,
						calledMemberSignature);
				SecurityMarkerUtil.createErrorMarker(calledMember,
						"Secrecy is required for this member by \"" + this.analyzedMemberSignature + "\"",
						this.analyzedMemberSignature, calledMemberSignature);

			} else {
				SecurityMarkerUtil.createErrorMarker(
						methodWrapper.getMethodCall(), "The class \"" + this.type.getElementName()
								+ "\" must specify secrecy for accessing \"" + calledMemberSignature + "\"!",
						this.analyzedMemberSignature, calledMemberSignature);
				SecurityMarkerUtil.createErrorMarker(calledMember,
						this.analyzedMemberSignature + " accesses this member without the required secrecy!",
						this.analyzedMemberSignature, calledMemberSignature);
			}
		}

		final var callerIntegrityRequirement = SecureDependencyCheck.getCorrespondingEntry(calledMember,
				this.integritySignatures, this.cu);
		final var callerIntegrity = callerIntegrityRequirement != null;
		if (callerIntegrity) {
			this.accessedMembers.add(calledMember);
		}
		if (callerIntegrity != calleeRequirements.isIntegrityMember(calledMember)) {
			final var calledMemberSignature = SecureDependencyCheck.getSignature(calledMember);
			if (callerIntegrity) {
				SecurityMarkerUtil.createErrorMarker(methodWrapper.getMethodCall(),
						"Integrity is required but not provided by the accessed member!", this.analyzedMemberSignature,
						calledMemberSignature);
				SecurityMarkerUtil.createErrorMarker(calledMember,
						"Integrity is required for this member by \"" + this.analyzedMemberSignature + "\"",
						this.analyzedMemberSignature, calledMemberSignature);
			} else {
				SecurityMarkerUtil.createErrorMarker(
						methodWrapper.getMethodCall(), "The class \"" + this.type.getElementName()
								+ "\" must specify integrity for accessing \"" + calledMemberSignature + "\"!",
						this.analyzedMemberSignature, calledMemberSignature);
				SecurityMarkerUtil.createErrorMarker(calledMember,
						this.analyzedMemberSignature + " accesses this member without the required integrity!",
						this.analyzedMemberSignature, calledMemberSignature);

			}
		}

		// Do not continue tree traversal
		return false;
	}
}