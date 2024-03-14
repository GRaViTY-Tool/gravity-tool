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
import org.gravity.security.annotations.check.data.SecurityProperty;
import org.gravity.security.annotations.check.data.SecurityRequirements;
import org.gravity.security.annotations.check.data.SecurityViolation;
import org.gravity.security.annotations.check.helpers.ASTHelper;
import org.gravity.security.annotations.check.helpers.MemberHelper;
import org.gravity.security.annotations.marker.SecurityMarkerUtil;
import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;
import org.gravity.security.annotations.ui.EnableSecurityCheckHandler;

@SuppressWarnings("restriction")
public class SecureDependencyCheck extends CompilationParticipant {

	/**
	 * The logger of this class
	 */
	static final Logger LOGGER = Logger.getLogger(SecureDependencyCheck.class);

	long timestamp;

	private Set<SecurityViolation> violations;

	@Override
	public boolean isAnnotationProcessor() {
		return true;
	}

	@Override
	public boolean isActive(final IJavaProject project) {
		return EnableSecurityCheckHandler.checksEnabled();
	}

	@Override
	public void processAnnotations(final BuildContext[] files) {
		this.cache = new HashMap<>();
		this.timestamp = System.currentTimeMillis();
		this.violations = new HashSet<>();
		Stream.of(files).parallel().forEach(this::processChangedFile);
		for (final var violation : this.violations) {
			SecurityMarkerUtil.createErrorMarker(violation);
		}
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
			try {
				final var check = new IncomingAccessCheck(this, member, secrecy, root, integrity);
				root.accept(check, new NullProgressMonitor());
				this.violations.addAll(check.getViolations());
			} catch (final Exception e) {
				// Only log all errors and let JDT handle the compile errors
				LOGGER.error("Searching incoming accesses for \"" + getSignature(member) + "\".");
				LOGGER.error(e);
			}
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
			try {
				final var check = new OutgoingAccessCheck(this, accessedMembers, root, caller, requirements);
				root.accept(check, new NullProgressMonitor());
				this.violations.addAll(check.getViolations());
			} catch (final Exception e) {
				// Only log all errors and let JDT handle the compile errors
				LOGGER.error("Searching outgoing accesses for \"" + getSignature(caller) + "\".");
				LOGGER.error(e);
			}
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

			if (getCorrespondingEntry(method, requirement.getSecrecySignatures(), cu) != null
					|| memberAnnotations.contains(Secrecy.class.getSimpleName())) {
				requirement.addSecrecyMember(method);
			}

			if (getCorrespondingEntry(method, requirement.getIntegritySignatures(), cu) != null
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
			} else if (elementType == IJavaElement.TYPE) {
				// We do not want to consider inner classes as members
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

	static String getCorrespondingEntry(final IMember member, final Collection<String> signatures,
			final ICompilationUnit cu) {
		final var name = member.getElementName();

		var context = member;
		if (member instanceof final LambdaMethod lambda) {
			context = lambda.getOuterMostLocalContext();
		}

		return switch (context.getElementType()) {
		case IJavaElement.METHOD -> {
			final var method = (IMethod) context;
			yield getMethod(method, name, signatures, cu);
		}
		case IJavaElement.FIELD -> getField(name, signatures, cu, context);
		case IJavaElement.TYPE -> getDefaultConstructor(name, member, signatures, cu);
		case IJavaElement.INITIALIZER -> /* Skip silently */ null;
		default -> throw new IllegalStateException("Unhandled member type: " + member.getElementType());
		};
	}

	private static String getDefaultConstructor(final String name, final IMember member,
			final Collection<String> signatures, final ICompilationUnit cu) {
		// Handle default constructor
		final var constructor = (IType) member;
		for (final String signature : signatures) {
			if (MemberHelper.isExpectedConstructor(cu, name, constructor, signature)) {
				return signature;
			}
		}
		return null;
	}

	private static String getField(final String name, final Collection<String> signatures, final ICompilationUnit cu,
			final IMember context) {
		final var field = (IField) context;

		for (final String signature : signatures) {
			if (MemberHelper.isExpectedField(cu, name, field, signature)) {
				return signature;
			}
		}
		return null;
	}

	private static String getMethod(final IMethod method, final String name, final Collection<String> signatures,
			final ICompilationUnit cu) {
		for (final String signature : signatures) {
			try {
				if (MemberHelper.isExpectedMethod(cu, name, method, signature)) {
					return signature;
				}
			} catch (final JavaModelException e) {
				LOGGER.error(e);
			}
		}
		return null;
	}

	public static String getSignature(final IMember member) {
		return getSignature(member, false);
	}

	static String getSignature(final IMember member, final boolean simple) {
		var context = member;
		if (member instanceof final LambdaMethod lambda) {
			context = lambda.getOuterMostLocalContext();
		}
		final var cu = context.getCompilationUnit();
		if (context instanceof final IMethod method) {
			return getMethodSignature(method, simple, context, cu);
		}
		if (context instanceof final IField field) {
			return getFieldSignature(field, simple, context, cu);
		}
		if (context instanceof final IType constructor) {
			return getDefaultConstructorSignature(constructor, simple);
		}
		return null;
	}

	private static String getDefaultConstructorSignature(final IType constructor, final boolean simple) {
		final var name = constructor.getElementName();
		String typeName;
		if (simple) {
			typeName = name;
		} else {
			typeName = constructor.getFullyQualifiedName();
		}
		return typeName + '.' + name + "()";
	}

	private static String getFieldSignature(final IField field, final boolean simple, final IMember context,
			final ICompilationUnit cu) {
		final var signature = new StringBuilder(getNameOfDeclaringType(context, simple));
		signature.append('.');
		signature.append(field.getElementName());
		try {
			final var type = ASTHelper.getFullyQualifiedName4JDT(cu, field.getTypeSignature(), field);
			signature.append(':');
			if (simple) {
				signature.append(type.substring(type.lastIndexOf('.') + 1));
			} else {
				signature.append(type);
			}
		} catch (final CoreException e) {
			LOGGER.error(e);
		}
		return signature.toString();
	}

	private static String getMethodSignature(final IMethod method, final boolean simple, final IMember context,
			final ICompilationUnit cu) {
		final var suffix = getMethodSuffix(simple, method, cu);
		final var type = getNameOfDeclaringType(context, simple);
		return Stream.of(method.getParameterTypes()).map(p -> getParameterTypeName(p, simple, method, cu))
				.collect(Collectors.joining(",", type + '.' + method.getElementName() + '(', suffix));
	}

	private static String getParameterTypeName(final String parameter, final boolean simple, final IMethod method,
			final ICompilationUnit cu) {
		try {
			final var name = ASTHelper.getFullyQualifiedName4JDT(cu, parameter, method);
			if (simple) {
				return name.substring(name.lastIndexOf('.') + 1);
			}
			return name;
		} catch (final JavaModelException e) {
			LOGGER.error(e);
			return null;
		}
	}

	private static String getMethodSuffix(final boolean simple, final IMethod method, final ICompilationUnit cu) {
		String suffix;
		try {
			if (method.isConstructor()) {
				suffix = ")";
			} else {
				final var returnType = ASTHelper.getFullyQualifiedName4JDT(cu, method.getReturnType(), method);
				suffix = "):";
				if (simple) {
					suffix += returnType.substring(returnType.lastIndexOf('.') + 1);
				} else {
					suffix += returnType;
				}
			}
		} catch (final JavaModelException e) {
			LOGGER.error(e);
			suffix = ")";
		}
		return suffix;
	}

	private static String getNameOfDeclaringType(final IMember member, final boolean simple) {
		String type;
		if (simple) {
			type = member.getDeclaringType().getElementName();
		} else {
			type = member.getDeclaringType().getFullyQualifiedName();
		}
		return type;
	}

	public static String getSimpleSignature(final IMember member) {
		return getSignature(member, true);
	}
}
