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
	private final IMember analyzedMember;
	private final boolean secrecy;
	private final MethodWrapper root;
	private final boolean integrity;
	private final ICompilationUnit cu;
	private final String analyzedMemberSignature;

	IncomingAccessCheck(final SecureDependencyCheck secureDependencyCheck, final IMember member, final boolean secrecy,
			final MethodWrapper root, final boolean integrity) {
		this.secureDependencyCheck = secureDependencyCheck;
		this.analyzedMember = member;
		this.cu = member.getCompilationUnit();
		this.secrecy = secrecy;
		this.root = root;
		this.integrity = integrity;
		this.analyzedMemberSignature = SecureDependencyCheck.getSignature(this.analyzedMember);

	}

	@Override
	public boolean visit(final MethodWrapper methodWrapper) {
		if (this.root == methodWrapper) {
			return true;
		}
		final var callingMember = methodWrapper.getMember();
		final var callingMemberSignature = SecureDependencyCheck.getSignature(callingMember);
		SecurityMarkerUtil.deleteOldMarkers(callingMember.getResource(), this.analyzedMemberSignature,
				this.secureDependencyCheck.timestamp);

		IType type;
		if (callingMember instanceof final IType itype) {
			type = itype;
		} else if (callingMember instanceof final LambdaMethod lambda) {
			type = lambda.getOuterMostLocalContext().getDeclaringType();
		} else {
			type = callingMember.getDeclaringType();
		}
		final var callerAnnotations = this.secureDependencyCheck.getSecurityRequirements(type);

		final var callerSecrecyRequirement = SecureDependencyCheck.getCorrespondingEntry(this.analyzedMember,
				callerAnnotations.getSecrecySignatures(), this.cu);
		final var callerSecrecy = callerSecrecyRequirement != null;
		if (callerSecrecy != this.secrecy) {
			if (callerSecrecy) {
				SecurityMarkerUtil.createErrorMarker(methodWrapper.getMethodCall(),
						"Secrecy is required but not provided by the accessed member!", this.analyzedMemberSignature,
						callingMemberSignature);
				SecurityMarkerUtil.createErrorMarker(this.analyzedMember,
						"Secrecy is required for this member by \""
								+ SecureDependencyCheck.getSimpleSignature(callingMember) + "\"",
						this.analyzedMemberSignature, callingMemberSignature);
			} else {
				SecurityMarkerUtil.createErrorMarker(this.analyzedMember,
						SecureDependencyCheck.getSimpleSignature(callingMember)
								+ " accesses this member without the required secrecy!",
						this.analyzedMemberSignature, callingMemberSignature);
				SecurityMarkerUtil.createErrorMarker(methodWrapper.getMethodCall(),
						"This class must specify secrecy for accessing \""
								+ SecureDependencyCheck.getSimpleSignature(this.analyzedMember) + "\"!",
						this.analyzedMemberSignature, callingMemberSignature);

			}
		}

		final var callerIntegrityRequirement = SecureDependencyCheck.getCorrespondingEntry(this.analyzedMember,
				callerAnnotations.getIntegritySignatures(), this.cu);
		final var callerIntegrity = callerIntegrityRequirement != null;
		if (callerIntegrity != this.integrity) {
			if (callerIntegrity) {
				SecurityMarkerUtil.createErrorMarker(this.analyzedMember,
						"Integrity is required for this member by \""
								+ SecureDependencyCheck.getSimpleSignature(callingMember) + "\"",
						this.analyzedMemberSignature, callingMemberSignature);
				SecurityMarkerUtil.createErrorMarker(methodWrapper.getMethodCall(),
						"Integrity is required but not provided by the accessed member!", this.analyzedMemberSignature,
						callingMemberSignature);
			} else {
				SecurityMarkerUtil.createErrorMarker(this.analyzedMember,
						SecureDependencyCheck.getSimpleSignature(callingMember)
								+ " accesses this member without the required integrity!",
						this.analyzedMemberSignature, callingMemberSignature);
				SecurityMarkerUtil.createErrorMarker(methodWrapper.getMethodCall(),
						"This class must specify integrity for accessing \""
								+ SecureDependencyCheck.getSimpleSignature(this.analyzedMember) + "\"!",
						this.analyzedMemberSignature, callingMemberSignature);

			}
		}

		return false;
	}
}