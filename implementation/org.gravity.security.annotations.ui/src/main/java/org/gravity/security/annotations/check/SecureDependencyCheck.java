package org.gravity.security.annotations.check;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
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
import org.eclipse.jdt.core.IMemberValuePair;
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
import org.gravity.security.annotations.check.helpers.ASTHelper;
import org.gravity.security.annotations.check.helpers.MemberHelper;
import org.gravity.security.annotations.marker.SecurityMarkerUtil;
import org.gravity.security.annotations.requirements.Critical;
import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

@SuppressWarnings("restriction")
public class SecureDependencyCheck extends CompilationParticipant {

	/**
	 * The logger of this class
	 */
	private static final Logger LOGGER = Logger.getLogger(SecureDependencyCheck.class);

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
//				&& (result.hasAnnotations(Secrecy.class.getName()) || result.hasAnnotations(Integrity.class.getName())
//						|| result.hasAnnotations(Critical.class.getName()))) {

			final var cu = (ICompilationUnit) JavaCore.create(result.getFile());
			SecurityMarkerUtil.deleteOldMarkers(cu, this.timestamp);

			final Set<String> secrecySignatures = new HashSet<>();
			final Set<String> integritySignatures = new HashSet<>();

			final Set<IMember> secrecyMembers = new HashSet<>();
			final Set<IMember> integrityMembers = new HashSet<>();

			final Collection<String> accessedSignatures = new HashSet<>();
			final var members = this.collectAllMembers(cu, secrecySignatures, integritySignatures, secrecyMembers,
					integrityMembers);
			members.parallelStream().forEach(member -> {
				accessedSignatures.addAll(this.checkOutgoingAccesses(secrecySignatures, integritySignatures, member));
				final var requiresSecrecy = secrecyMembers.contains(member);
				final var requiresIntegrity = integrityMembers.contains(member);
				if (requiresSecrecy || requiresIntegrity) {
					this.checkIncomingAccesses(member, requiresSecrecy, requiresIntegrity);
				}
			});

			this.checkForUnusedRequirements(cu, secrecySignatures, integritySignatures, accessedSignatures);
		}
	}

	private void checkIncomingAccesses(final IMember member, final boolean secrecy, final boolean integrity) {
		for (final MethodWrapper root : CallHierarchy.getDefault().getCallerRoots(new IMember[] { member })) {
			root.accept(new IncomingAccessCheck(this, member, secrecy, root, integrity), new NullProgressMonitor());
		}
	}

	private Collection<String> checkOutgoingAccesses(final Set<String> secrecySignatures,
			final Set<String> integritySignatures, final IMember caller) {
		final Collection<String> accessedSignatures = new HashSet<>();
		for (final MethodWrapper root : CallHierarchy.getDefault().getCalleeRoots(new IMember[] { caller })) {
			// Check outgoing calls
			root.accept(new OutgoingAccessCheck(this, accessedSignatures, root, caller, secrecySignatures,
					integritySignatures), new NullProgressMonitor());
		}
		return accessedSignatures;
	}

	private void checkForUnusedRequirements(final ICompilationUnit cu, final Set<String> secrecySignatures,
			final Set<String> integritySignatures, final Collection<String> accessedSignatures) {
		if (!secrecySignatures.isEmpty() || !integritySignatures.isEmpty()) {
			try {
				final Collection<Annotations> annotations = new LinkedList<>();
				for (final IType type : cu.getAllTypes()) {
					annotations.add(this.getSecurityRequirements(type));
				}

				for (final String signature : secrecySignatures) {
					if (!accessedSignatures.contains(signature)) {
						annotations.forEach(a -> {
							if (a.secrecy().contains(signature)) {
								SecurityMarkerUtil.createWarningMarker(a.annotation,
										"There is a secrecy requirement for \"" + signature
												+ "\" but the signature is neither defined nor accessed!");
							}
						});
					}
				}
				for (final String signature : integritySignatures) {
					if (!accessedSignatures.contains(signature)) {
						annotations.forEach(a -> {
							if (a.integrity().contains(signature)) {
								SecurityMarkerUtil.createWarningMarker(a.annotation,
										"There is a integrity requirement for \"" + signature
												+ "\" but the signature is neither defined nor accessed!");
							}
						});
					}
				}
			} catch (final JavaModelException e) {
				LOGGER.error(e);
			}
		}
	}

	private Set<IMember> collectAllMembers(final ICompilationUnit cu, final Set<String> secrecySignatures,
			final Set<String> integritySignatures, final Set<IMember> secrecyMembers,
			final Set<IMember> integrityMembers) {
		final Set<IMember> members = new HashSet<>();
		try {
			for (final IType type : cu.getAllTypes()) {
				members.addAll(this.collectAllMembers(type, secrecySignatures, integritySignatures, secrecyMembers,
						integrityMembers));
			}
		} catch (final JavaModelException e) {
			throw new IllegalStateException(e);
		}
		return members;
	}

	private Collection<IMember> collectAllMembers(final IType type, final Set<String> secrecySignatures,
			final Set<String> integritySignatures, final Set<IMember> secrecyMembers,
			final Set<IMember> integrityMembers) throws JavaModelException {
		final var annotations = this.getSecurityRequirements(type);
		secrecySignatures.addAll(annotations.secrecy());
		integritySignatures.addAll(annotations.integrity());

		final var members = new LinkedList<IMember>();
		for (final IJavaElement element : type.getChildren()) {
			final var elementType = element.getElementType();
			if (elementType == IJavaElement.FIELD || elementType == IJavaElement.METHOD
					|| elementType == IJavaElement.INITIALIZER) {
				final var member = (IMember) element;
				members.add(member);
			}
		}

		final var cu = type.getCompilationUnit();
		for (final IMember method : members) {

			final List<String> memberAnnotations;
			if (method instanceof final IAnnotatable annotatable) {
				memberAnnotations = Stream.of((annotatable).getAnnotations()).map(IAnnotation::getElementName).toList();
			} else {
				memberAnnotations = Collections.emptyList();
			}

			if (this.removeMember(method, secrecySignatures, cu)
					|| memberAnnotations.contains(Secrecy.class.getSimpleName())) {
				secrecyMembers.add(method);
			}

			if (this.removeMember(method, integritySignatures, cu)
					|| memberAnnotations.contains(Integrity.class.getSimpleName())) {
				integrityMembers.add(method);
			}
		}
		return members;
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

	Map<IType, Annotations> cache = new HashMap<>();

	Annotations getSecurityRequirements(final IType type) {
		final var entry = this.cache.get(type);
		if (entry != null) {
			return entry;
		}
		final Set<String> secrecySignatures = new HashSet<>();
		final Set<String> integritySignatures = new HashSet<>();
		final IAnnotation critical = null;
		try {
			for (final var a : type.getAnnotations()) {
				if (Critical.class.getSimpleName().equals(a.getElementName())) {
					for (final IMemberValuePair pair : a.getMemberValuePairs()) {
						final var memberName = pair.getMemberName();
						if ("secrecy".equals(memberName)) {
							this.addToSignatures(secrecySignatures, pair);
						} else if ("integrity".equals(memberName)) {
							this.addToSignatures(integritySignatures, pair);
						}
					}
				}
			}
		} catch (final JavaModelException e) {
			LOGGER.error(e);
		}
		final var annotations = new Annotations(secrecySignatures, integritySignatures, type, critical);
		this.cache.put(type, annotations);
		return annotations;

	}

	private void addToSignatures(final Set<String> signatures, final IMemberValuePair pair) {
		final var secrecyValue = pair.getValue();
		if (secrecyValue instanceof final String string) {
			signatures.add(string);
		} else {
			for (final Object secrecy : (Object[]) secrecyValue) {
				signatures.add((String) secrecy);
			}
		}
	}
}
