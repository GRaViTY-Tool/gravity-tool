package org.gravity.security.annotations.check;

import java.util.Collection;
import java.util.Set;

import org.eclipse.jdt.core.IAnnotatable;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.internal.corext.callhierarchy.CallHierarchyVisitor;
import org.eclipse.jdt.internal.corext.callhierarchy.MethodWrapper;
import org.gravity.security.annotations.marker.SecurityMarkerUtil;
import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

@SuppressWarnings("restriction")
final class OutgoingAccessCheck extends CallHierarchyVisitor {
	/**
	 *
	 */
	private final SecureDependencyCheck outgoing;
	private final Collection<String> accessedSignatures;
	private final MethodWrapper root;
	private final Set<String> secrecySignatures;
	private final Set<String> integritySignatures;
	private final ICompilationUnit cu;
	private final String analyzedMemberSignature;
	private final IType type;

	OutgoingAccessCheck(final SecureDependencyCheck secureDependencyCheck, final Collection<String> accessedSignatures,
			final MethodWrapper root, final IMember caller, final Set<String> secrecySignatures,
			final Set<String> integritySignatures) {
		this.outgoing = secureDependencyCheck;
		this.accessedSignatures = accessedSignatures;
		this.root = root;
		this.cu = caller.getCompilationUnit();
		this.type = caller.getDeclaringType();
		this.secrecySignatures = secrecySignatures;
		this.integritySignatures = integritySignatures;
		this.analyzedMemberSignature = SecureDependencyCheck.getSignature(caller);
	}

	@Override
	public boolean visit(final MethodWrapper methodWrapper) {
		if (this.root == methodWrapper) {
			return true;
		}
		final var calledMember = methodWrapper.getMember();
		if (calledMember instanceof IType) {
			return false;
		}
		final var calledMemberSignature = SecureDependencyCheck.getSignature(calledMember);
		SecurityMarkerUtil.deleteOldMarkers(calledMember.getResource(), this.analyzedMemberSignature,
				this.outgoing.timestamp);

		final var calleeSecrecy = this.requiresSecrecy(calledMember);
		final var callerSecrecyRequirement = SecureDependencyCheck.getCorrespondingEntry(calledMember,
				this.secrecySignatures, this.cu);
		final var callerSecrey = callerSecrecyRequirement != null;
		if (callerSecrey) {
			this.accessedSignatures.add(callerSecrecyRequirement);
		}
		if (callerSecrey != calleeSecrecy) {
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

		final var calleeIntegrity = this.requiresIntegrity(calledMember);
		final var callerIntegrityRequirement = SecureDependencyCheck.getCorrespondingEntry(calledMember,
				this.integritySignatures, this.cu);
		final var callerIntegrity = callerIntegrityRequirement != null;
		if (callerIntegrity) {
			this.accessedSignatures.add(callerIntegrityRequirement);
		}
		if (callerIntegrity != calleeIntegrity) {
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

	private boolean requiresSecrecy(final IMember member) {
		if (member instanceof final IAnnotatable annotatable) {
			if (member instanceof IType) {
				return false;
			}
			return annotatable.getAnnotation(Secrecy.class.getSimpleName()).exists()
					|| SecureDependencyCheck.getCorrespondingEntry(member,
							this.outgoing.getSecurityRequirements(member.getDeclaringType()).secrecy(),
							this.cu) != null;
		}
		return false;
	}

	private boolean requiresIntegrity(final IMember member) {
		if (member instanceof final IAnnotatable annotatable) {
			return annotatable.getAnnotation(Integrity.class.getSimpleName()).exists()
					|| SecureDependencyCheck.getCorrespondingEntry(member,
							this.outgoing.getSecurityRequirements(member.getDeclaringType()).integrity(),
							this.cu) != null;
		}
		return false;
	}
}