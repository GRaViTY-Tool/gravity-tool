package org.gravity.security.annotations.check;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IAnnotatable;
import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.compiler.BuildContext;
import org.eclipse.jdt.core.compiler.CompilationParticipant;
import org.eclipse.jdt.internal.core.LambdaMethod;
import org.eclipse.jdt.internal.core.builder.CompilationParticipantResult;
import org.eclipse.jdt.internal.corext.callhierarchy.CallHierarchy;
import org.eclipse.jdt.internal.corext.callhierarchy.MethodWrapper;
import org.gravity.security.annotations.check.data.SecurityRequirements;
import org.gravity.security.annotations.check.data.SecurityRequirements.SecurityProperty;
import org.gravity.security.annotations.check.helpers.ASTHelper;
import org.gravity.security.annotations.check.helpers.MemberHelper;
import org.gravity.security.annotations.marker.SecurityMarkerUtil;
import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

@SuppressWarnings("restriction")
public class SecureDependencyCheck extends CompilationParticipant {

	/**
	 * The logger of this class
	 */
	static final Logger LOGGER = Logger.getLogger(SecureDependencyCheck.class);

	long timestamp;

	@Override
	public boolean isAnnotationProcessor() {
		return true;
	}

	@Override
	public boolean isActive(final IJavaProject project) {
		return true;
	}

	@Override
	public void processAnnotations(final BuildContext[] files) {
		this.cache = new HashMap<>();
		this.timestamp = System.currentTimeMillis();
		Stream.of(files).parallel().forEach(this::processChangedFile);
	}

	private void processChangedFile(final BuildContext context) {
		if (context instanceof final CompilationParticipantResult result) {

			final var cu = (ICompilationUnit) JavaCore.create(result.getFile());
			SecurityMarkerUtil.deleteOldMarkers(cu, this.timestamp);

			try {
				for (final IType type : cu.getAllTypes()) {
					final var requirements = this.getSecurityRequirements(type);
					final Collection<IMember> accessed = requirements.getMembers().parallelStream().flatMap(member -> {
						final var requiresSecrecy = requirements.isSecrecyMember(member);
						final var requiresIntegrity = requirements.isIntegrityMember(member);
						if (requiresSecrecy || requiresIntegrity) {
							this.checkIncomingAccesses(member, requiresSecrecy, requiresIntegrity);
						}
						return this.checkOutgoingAccesses(requirements, member).stream();
					}).collect(Collectors.toSet());
					this.checkForUnusedRequirements(requirements, accessed);

				}
			} catch (final CoreException e) {
				LOGGER.error(e);
			}
		}
	}

	/**
	 * Checks if calls of the member fulfill the secure dependency property
	 *
	 * @param member    The called member
	 * @param secrecy   Whether the member is on the secrecy security level
	 * @param integrity Whether the member is on the integrity security level
	 */
	private void checkIncomingAccesses(final IMember member, final boolean secrecy, final boolean integrity) {
		for (final MethodWrapper root : CallHierarchy.getDefault().getCallerRoots(new IMember[] { member })) {
			root.accept(new IncomingAccessCheck(this, member, secrecy, root, integrity), new NullProgressMonitor());
		}
	}

	/**
	 * Checks if the member accesses any security-critical member for which secrecy
	 * or integrity is not specified by the members class
	 *
	 * @param requirements The security requirements of the class defining the
	 *                     member
	 * @param caller       The member whose outgoing accesses should be analyzed
	 * @return The members accessed by the analyzed member
	 */
	private Collection<IMember> checkOutgoingAccesses(final SecurityRequirements requirements, final IMember caller) {
		final Collection<IMember> accessedMembers = new HashSet<>();
		for (final MethodWrapper root : CallHierarchy.getDefault().getCalleeRoots(new IMember[] { caller })) {
			// Check outgoing calls
			root.accept(new OutgoingAccessCheck(this, accessedMembers, root, caller, requirements),
					new NullProgressMonitor());
		}
		return accessedMembers;
	}

	/**
	 * Checks if security requirements are defined that do not match a defined or
	 * accessed member
	 *
	 * @param requirements    The security requirements of the analyzed type
	 * @param accessedMembers All external security-critical members that are
	 *                        accessed from the type
	 */
	private void checkForUnusedRequirements(final SecurityRequirements requirements,
			final Collection<IMember> accessedMembers) {
		this.checkForUnusedRequirements(requirements, accessedMembers, requirements.getSecrecySignatures(),
				SecurityProperty.SECRECY);
		this.checkForUnusedRequirements(requirements, accessedMembers, requirements.getIntegritySignatures(),
				SecurityProperty.INTEGRITY);
	}

	private void checkForUnusedRequirements(final SecurityRequirements requirements,
			final Collection<IMember> accessedMembers, final Set<String> classifiedSignatures,
			final SecurityProperty property) {
		final Collection<String> signatures = new ArrayList<>(classifiedSignatures);
		final var cu = requirements.getType().getCompilationUnit();

		if (!signatures.isEmpty()) {
			for (final IMember member : accessedMembers) {
				this.removeMember(member, signatures, cu);
			}
		}
		if (!signatures.isEmpty()) {
			for (final IMember member : requirements.getDefinedMembers()) {
				this.removeMember(member, signatures, cu);
			}
		}

		for (final String signature : signatures) {
			for (final IAnnotation defines : requirements.getCriticals(signature, property)) {
				SecurityMarkerUtil.createWarningMarker(defines, "There is a " + property + " requirement for \""
						+ signature + "\" but the signature is neither defined nor accessed!");
			}

		}
	}

	Map<IType, SecurityRequirements> cache = new HashMap<>();

	SecurityRequirements getSecurityRequirements(final IType type) {
		if (this.cache.containsKey(type)) {
			return this.cache.get(type);
		}
		final var requirement = new SecurityRequirements(type);
		this.cache.put(type, requirement);

		try {
			addRelevantMembers(type, requirement);
		} catch (final JavaModelException e) {
			LOGGER.error(e);
			return requirement;
		}

		final var cu = type.getCompilationUnit();
		for (final IMember method : requirement.getMembers()) {

			List<String> memberAnnotations;
			if (method instanceof final IAnnotatable annotatable) {
				try {
					memberAnnotations = Stream.of(annotatable.getAnnotations()).map(IAnnotation::getElementName)
							.toList();
				} catch (final JavaModelException e) {
					LOGGER.error(e);
					memberAnnotations = Collections.emptyList();
				}
			} else {
				memberAnnotations = Collections.emptyList();
			}

			if (this.removeMember(method, requirement.getSecrecySignatures(), cu)
					|| memberAnnotations.contains(Secrecy.class.getSimpleName())) {
				requirement.addSecrecyMember(method);
			}

			if (this.removeMember(method, requirement.getIntegritySignatures(), cu)
					|| memberAnnotations.contains(Integrity.class.getSimpleName())) {
				requirement.addIntegrityMember(method);
			}
		}
		return requirement;
	}

	private static void addRelevantMembers(final IType type, final SecurityRequirements requirement)
			throws JavaModelException {
		for (final IJavaElement element : type.getChildren()) {
			final var elementType = element.getElementType();
			if (elementType == IJavaElement.FIELD || elementType == IJavaElement.METHOD
					|| elementType == IJavaElement.INITIALIZER) {
				final var member = (IMember) element;
				requirement.addMember(member);
			} else {
				LOGGER.info("The member \"" + element + "\" will not be analyzed.");
			}
		}
	}

	private boolean removeMember(final IMember member, final Collection<String> signatures, final ICompilationUnit cu) {
		final var remove = SecureDependencyCheck.getCorrespondingEntry(member, signatures, cu);
		if (remove != null) {
			return signatures.remove(remove);
		}
		return false;
	}

	static String getSignature(final IMember member) {
		var context = member;
		if (member instanceof final LambdaMethod lambda) {
			context = lambda.getOuterMostLocalContext();
		}
		final var cu = context.getCompilationUnit();
		if (context instanceof final IMethod method) {
			String suffix;
			try {
				final var returnType = ASTHelper.getFullyQualifiedName4JDT(cu, method.getReturnType(),
						method.getTypeParameters());
				suffix = "):" + returnType.substring(returnType.lastIndexOf('.') + 1);
			} catch (final JavaModelException e) {
				LOGGER.error(e);
				suffix = ")";
			}
			final var type = context.getDeclaringType().getElementName();
			return Stream.of(method.getParameterTypes()).map(p -> {
				try {
					final var fqn = ASTHelper.getFullyQualifiedName4JDT(cu, p, method.getTypeParameters());
					return fqn.substring(fqn.lastIndexOf('.') + 1);
				} catch (final JavaModelException e) {
					LOGGER.error(e);
					// Fallback: Object
					return "java.lang.Object";
				}
			}).collect(Collectors.joining(",", type + '.' + method.getElementName() + '(', suffix));
		}
		if (context instanceof final IField field) {
			final var signature = new StringBuilder(context.getDeclaringType().getElementName());
			signature.append('.');
			signature.append(field.getElementName());
			try {
				final var type = ASTHelper.getFullyQualifiedName4JDT(cu, field.getTypeSignature());
				signature.append(':');
				signature.append(type.substring(type.lastIndexOf(':') + 1));
			} catch (final CoreException e) {
				LOGGER.error(e);
			}
			return signature.toString();
		}
		return null;
	}

	static String getCorrespondingEntry(final IMember member, final Collection<String> signatures,
			final ICompilationUnit cu) {
		final var name = member.getElementName();

		var context = member;
		if (member instanceof final LambdaMethod lambda) {
			context = lambda.getOuterMostLocalContext();
		}

		switch (context.getElementType()) {
		case IJavaElement.METHOD:
			final var method = (IMethod) context;

			for (final String signature : signatures) {
				try {
					if (MemberHelper.isExpectedMethod(member, cu, name, method, signature)) {
						return signature;
					}
				} catch (final JavaModelException e) {
					LOGGER.error(e);
				}
			}
			break;
		case IJavaElement.FIELD:
			final var field = (IField) context;

			for (final String signature : signatures) {
				if (MemberHelper.isExpectedField(member, cu, name, field, signature)) {
					return signature;
				}
			}
			break;
		case IJavaElement.TYPE, IJavaElement.INITIALIZER:
			LOGGER.warn("Skipped getting corresponding entry for an IMember: " + member);
			break;
		default:
			throw new IllegalStateException("Unhandled member type: " + member.getElementType());
		}
		return null;
	}
}
