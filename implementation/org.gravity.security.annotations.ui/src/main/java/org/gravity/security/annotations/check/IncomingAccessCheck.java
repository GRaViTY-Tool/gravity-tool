package org.gravity.security.annotations.check;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.internal.core.LambdaMethod;
import org.eclipse.jdt.internal.corext.callhierarchy.CallHierarchyVisitor;
import org.eclipse.jdt.internal.corext.callhierarchy.MethodWrapper;
import org.gravity.security.annotations.marker.SecurityMarkerUtil;

@SuppressWarnings("restriction")
final class IncomingAccessCheck extends CallHierarchyVisitor {

	/**
	 *
	 */
	private final SecureDependencyCheck secureDependencyCheck;
	private final IMember member;
	private final boolean secrecy;
	private final MethodWrapper root;
	private final boolean integrity;
	private final ICompilationUnit cu;
	private final String analyzedMemberSignature;

	IncomingAccessCheck(final SecureDependencyCheck secureDependencyCheck, final IMember member, final boolean secrecy,
			final MethodWrapper root, final boolean integrity) {
		this.secureDependencyCheck = secureDependencyCheck;
		this.member = member;
		this.cu = member.getCompilationUnit();
		this.secrecy = secrecy;
		this.root = root;
		this.integrity = integrity;
		this.analyzedMemberSignature = SecureDependencyCheck.getSignature(this.member);

	}

	@Override
	public boolean visit(final MethodWrapper methodWrapper) {
		if (this.root == methodWrapper) {
			return true;
		}
		final var caller = methodWrapper.getMember();
		final var callingMemberSignature = SecureDependencyCheck.getSignature(caller);
		SecurityMarkerUtil.deleteOldMarkers(caller.getResource(), this.analyzedMemberSignature,
				this.secureDependencyCheck.timestamp);

		IType type;
		if (caller instanceof final IType itype) {
			type = itype;
		} else if (caller instanceof final LambdaMethod lambda) {
			type = lambda.getOuterMostLocalContext().getDeclaringType();
		} else {
			type = caller.getDeclaringType();
		}
		final var callerAnnotations = this.secureDependencyCheck.getSecurityRequirements(type);

		final var callerSecrecyRequirement = SecureDependencyCheck.getCorrespondingEntry(this.member,
				callerAnnotations.getSecrecySignatures(), this.cu);
		final var callerSecrecy = callerSecrecyRequirement != null;
		if (callerSecrecy != this.secrecy) {
			if (callerSecrecy) {
				SecurityMarkerUtil.createErrorMarker(methodWrapper.getMethodCall(),
						"Secrecy is required but not provided by the accessed member!", this.analyzedMemberSignature,
						callingMemberSignature);
				SecurityMarkerUtil.createErrorMarker(this.member,
						"Secrecy is required for this member by \"" + callingMemberSignature + "\"",
						this.analyzedMemberSignature, callingMemberSignature);
			} else {
				SecurityMarkerUtil.createErrorMarker(this.member,
						callingMemberSignature + " accesses this member without the required secrecy!",
						this.analyzedMemberSignature, callingMemberSignature);
				SecurityMarkerUtil.createErrorMarker(methodWrapper.getMethodCall(),
						"This class must specify secrecy for accessing \"" + this.analyzedMemberSignature + "\"!",
						this.analyzedMemberSignature, callingMemberSignature);

			}
		}

		final var callerIntegrityRequirement = SecureDependencyCheck.getCorrespondingEntry(this.member,
				callerAnnotations.getIntegritySignatures(), this.cu);
		final var callerIntegrity = callerIntegrityRequirement != null;
		if (callerIntegrity != this.integrity) {
			if (callerIntegrity) {
				SecurityMarkerUtil.createErrorMarker(this.member,
						"Integrity is required for this member by \"" + callingMemberSignature + "\"",
						this.analyzedMemberSignature, callingMemberSignature);
				SecurityMarkerUtil.createErrorMarker(methodWrapper.getMethodCall(),
						"Integrity is required but not provided by the accessed member!", this.analyzedMemberSignature,
						callingMemberSignature);
			} else {
				SecurityMarkerUtil.createErrorMarker(this.member,
						callingMemberSignature + " accesses this member without the required integrity!",
						this.analyzedMemberSignature, callingMemberSignature);
				SecurityMarkerUtil.createErrorMarker(methodWrapper.getMethodCall(),
						"This class must specify integrity for accessing \"" + this.analyzedMemberSignature + "\"!",
						this.analyzedMemberSignature, callingMemberSignature);

			}
		}

		return false;
	}
}