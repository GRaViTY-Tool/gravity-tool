package org.gravity.security.annotations.check;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IAnnotatable;
import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IImportDeclaration;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IMemberValuePair;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageDeclaration;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.eclipse.jdt.core.compiler.BuildContext;
import org.eclipse.jdt.core.compiler.CompilationParticipant;
import org.eclipse.jdt.internal.compiler.util.Util;
import org.eclipse.jdt.internal.core.builder.CompilationParticipantResult;
import org.eclipse.jdt.internal.corext.callhierarchy.CallHierarchy;
import org.eclipse.jdt.internal.corext.callhierarchy.CallHierarchyVisitor;
import org.eclipse.jdt.internal.corext.callhierarchy.CallLocation;
import org.eclipse.jdt.internal.corext.callhierarchy.MethodCall;
import org.eclipse.jdt.internal.corext.callhierarchy.MethodWrapper;
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

	private IJavaProject project;

	private long timestamp;

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
		for (final BuildContext context : files) {
			if (context instanceof final CompilationParticipantResult result
					&& (result.hasAnnotations(Secrecy.class.getName())
							|| result.hasAnnotations(Integrity.class.getName())
							|| result.hasAnnotations(Critical.class.getName()))) {

				final var cu = (ICompilationUnit) JavaCore.create(result.getFile());
				this.project = cu.getJavaProject();

				SecurityMarkerUtil.deleteOldMarkers(cu, this.timestamp);

				final Set<String> secrecySignatures = new HashSet<>();
				final Set<String> integritySignatures = new HashSet<>();

				final Set<IMember> secrecyMembers = new HashSet<>();
				final Set<IMember> integrityMembers = new HashSet<>();

				final Collection<String> accessedSignatures = new HashSet<>();
				final var members = this.collectAllMembers(cu, secrecySignatures, integritySignatures, secrecyMembers,
						integrityMembers);
				members.parallelStream().forEach(member -> {
					accessedSignatures
							.addAll(this.checkOutgoingAccesses(secrecySignatures, integritySignatures, member));
					this.checkIncomingAccesses(member, secrecyMembers.contains(member),
							integrityMembers.contains(member));
				});

				this.checkForUnusedRequirements(cu, secrecySignatures, integritySignatures, accessedSignatures);
			}
		}
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

		final var methods = type.getMethods();
		final var fields = type.getFields();
		final var cu = type.getCompilationUnit();
		final Collection<IMember> members = new ArrayList<>(methods.length + fields.length);
		for (final IMethod method : methods) {
			members.add(method);
			final var memberAnnotations = Stream.of(method.getAnnotations()).map(IAnnotation::getElementName).toList();

			if (this.removeMember(method, secrecySignatures, cu)
					|| memberAnnotations.contains(Secrecy.class.getSimpleName())) {
				secrecyMembers.add(method);
			}

			if (this.removeMember(method, integritySignatures, cu)
					|| memberAnnotations.contains(Integrity.class.getSimpleName())) {
				integrityMembers.add(method);
			}
		}
		for (final IField field : fields) {
			members.add(field);
			final var memberAnnotations = Stream.of(field.getAnnotations()).map(IAnnotation::getElementName).toList();

			if (this.removeMember(field, secrecySignatures, cu)
					|| memberAnnotations.contains(Secrecy.class.getSimpleName())) {
				secrecyMembers.add(field);
			}
			if (this.removeMember(field, integritySignatures, cu)
					|| memberAnnotations.contains(Integrity.class.getSimpleName())) {
				integrityMembers.add(field);
			}
		}
		return members;
	}

	private void checkIncomingAccesses(final IMember member, final boolean secrecy, final boolean integrity) {
		for (final MethodWrapper root : CallHierarchy.getDefault().getCallerRoots(new IMember[] { member })) {
			root.accept(new IncomingAccessCheck(member, secrecy, root, integrity), new NullProgressMonitor());
		}
	}

	private Collection<String> checkOutgoingAccesses(final Set<String> secrecySignatures,
			final Set<String> integritySignatures, final IMember caller) {
		final Collection<String> accessedSignatures = new HashSet<>();
		for (final MethodWrapper root : CallHierarchy.getDefault().getCalleeRoots(new IMember[] { caller })) {
			// Check outgoing calls
			root.accept(
					new OutgoingAccessCheck(accessedSignatures, root, caller, secrecySignatures, integritySignatures),
					new NullProgressMonitor());
		}
		return accessedSignatures;
	}

	private boolean removeMember(final IMember member, final Collection<String> signatures, final ICompilationUnit cu) {
		final var remove = this.getCorrespondingEntry(member, signatures, cu);
		if (remove != null) {
			return signatures.remove(remove);
		}
		return false;
	}

	private String getSignature(final IMember member) {
		final var cu = member.getCompilationUnit();
		if (member instanceof final IMethod method) {
			String suffix;
			try {
				final var returnType = this.getFullyQualifiedName4JDT(cu, method.getReturnType());
				suffix = "):" + returnType.substring(returnType.lastIndexOf('.') + 1);
			} catch (final JavaModelException e) {
				LOGGER.error(e);
				suffix = ")";
			}
			return Stream.of(method.getParameterTypes()).map(p -> {
				final var fqn = this.getFullyQualifiedName4JDT(cu, p);
				return fqn.substring(fqn.lastIndexOf('.') + 1);
			}).collect(Collectors.joining(",",
					member.getDeclaringType().getElementName() + '.' + method.getElementName() + '(', suffix));
		}
		if (member instanceof final IField field) {
			final var signature = new StringBuilder(member.getDeclaringType().getElementName());
			signature.append('.');
			signature.append(field.getElementName());
			try {
				final var type = this.getFullyQualifiedName4JDT(cu, field.getTypeSignature());
				signature.append(':');
				signature.append(type.substring(type.lastIndexOf(':') + 1));
			} catch (final CoreException e) {
				LOGGER.error(e);
			}
			return signature.toString();
		}
		return null;
	}

	private String getCorrespondingEntry(final IMember member, final Collection<String> signatures,
			final ICompilationUnit cu) {
		final var name = member.getElementName();
		switch (member.getElementType()) {
		case IJavaElement.METHOD:
			final var method = (IMethod) member;

			for (final String signature : signatures) {
				try {
					if (this.isInExpectedType(signature, member, cu) && this.isMethodWithName(name, signature)
							&& this.compareReturnType(method, signature) && this.compareParameters(method, signature)) {
						return signature;
					}
				} catch (final JavaModelException e) {
					LOGGER.error(e);
				}
			}
			break;
		case IJavaElement.FIELD:
			final var field = (IField) member;

			for (final String signature : signatures) {
				if (this.isInExpectedType(signature, member, cu) && this.isFieldWithName(name, signature)
						&& this.compareFieldType(field, signature)) {
					return signature;
				}
			}
			break;
		case IJavaElement.TYPE:
			LOGGER.warn("Skipped getting corresponding entry for an IMember: " + member);
			break;
		default:
			throw new IllegalStateException("Unhandled member type: " + member.getElementType());
		}
		return null;
	}

	private boolean isInExpectedType(final String signature, final IMember member, final ICompilationUnit cu) {
		var method = signature.indexOf('(');
		if (method == -1) {
			method = signature.indexOf(':');
		}
		final var dot = signature.substring(0, method).lastIndexOf('.');
		if (dot >= 0) {
			final var signatureType = this.getFullyQualifiedName4Text(cu, signature.substring(0, dot));
			final var memberType = member.getDeclaringType().getFullyQualifiedName();
			if (!signatureType.equals(memberType)) {
				return false;
			}
		}
		return true;
	}

	private boolean isFieldWithName(final String name, final String signature) {
		final var notMethod = signature.indexOf('(') == -1;
		return notMethod && signature.substring(0, signature.indexOf(':')).endsWith(name);
	}

	private boolean compareFieldType(final IField field, final String signature) {
		try {
			final var signatureType = this.getFullyQualifiedName4Text(field.getCompilationUnit(),
					signature.substring(signature.indexOf(':') + 1));
			final var fieldType = this.getFullyQualifiedName4JDT(field.getCompilationUnit(), field.getTypeSignature());
			return signatureType.equals(fieldType);
		} catch (final JavaModelException e) {
			throw new IllegalStateException(e);
		}
	}

	private boolean isMethodWithName(final String name, final String signature) {
		final var open = signature.indexOf('(');
		return open > 0 && signature.substring(0, open).trim().endsWith(name);
	}

	private boolean compareParameters(final IMethod method, final String signature) {
		final var end = signature.indexOf(')');
		final var start = signature.indexOf('(') + 1;
		if (start == end) {
			return true;
		}
		final var signaturePlainParameters = signature.substring(start, end).split(",");
		final var methodPlainParameters = method.getParameterTypes();
		if (signaturePlainParameters.length == methodPlainParameters.length) {
			final var signatureParameters = Stream.of(signaturePlainParameters).map(String::trim)
					.map(p -> this.getFullyQualifiedName4Text(method.getCompilationUnit(), p)).toList();
			final var methodParameters = Stream.of(methodPlainParameters)
					.map(p -> this.getFullyQualifiedName4JDT(method.getCompilationUnit(), p)).toList();
			if (this.equals(signatureParameters, methodParameters)) {
				return true;
			}
		}
		return false;
	}

	private boolean compareReturnType(final IMethod method, final String signature) throws JavaModelException {
		String signatureReturnType;
		final var colon = signature.indexOf(':');
		final var cu = method.getCompilationUnit();
		if (colon >= 0) {
			signatureReturnType = signature.substring(colon + 1).trim();
			if ("void".equalsIgnoreCase(signatureReturnType)) {
				signatureReturnType = "void";
			} else {
				signatureReturnType = this.getFullyQualifiedName4Text(cu, signatureReturnType);
			}
		} else {
			signatureReturnType = "void";
		}
		final var methodReturnType = this.getFullyQualifiedName4JDT(cu, method.getReturnType());
		return methodReturnType.equals(signatureReturnType);
	}

	private boolean equals(final List<String> signatureParameters, final List<String> methodParameters) {
		for (var i = 0; i < signatureParameters.size(); i++) {
			if (!methodParameters.get(i).equals(signatureParameters.get(i))) {
				return false;
			}
		}
		return true;
	}

	private String getFullyQualifiedName4Text(final ICompilationUnit cu, String type) {
		type = type.replace(" ", "");
		final var genericStart = type.indexOf('<');
		if (genericStart >= 0) {
			type = type.substring(0, genericStart);
		}
		var array = 0;
		var arrayStart = type.indexOf('[');
		if (arrayStart == -1) {
			arrayStart = type.length();
		} else {
			for (var i = arrayStart; i < type.length(); i++) {
				if ('[' == type.charAt(i)) {
					array++;
				}
			}
		}

		final var plainType = type.substring(0, arrayStart);
		final var resolvedType = this.findType(cu, plainType);
		if (resolvedType == null) {
			return this.buildArray(array, plainType);
		}
		return this.buildArray(array, resolvedType);
	}

	private String getFullyQualifiedName4JDT(final ICompilationUnit cu, final String typeName) {
		var arrays = 0;
		while (typeName.charAt(arrays) == Util.C_ARRAY) {
			arrays++;
		}

		final var type = typeName.substring(arrays);

		switch (type) {
		case Signature.SIG_VOID:
			return this.buildArray(arrays, void.class.toString());
		case Signature.SIG_BOOLEAN:
			return this.buildArray(arrays, boolean.class.toString());
		case Signature.SIG_BYTE:
			return this.buildArray(arrays, byte.class.toString());
		case Signature.SIG_CHAR:
			return this.buildArray(arrays, char.class.toString());
		case Signature.SIG_DOUBLE:
			return this.buildArray(arrays, double.class.toString());
		case Signature.SIG_FLOAT:
			return this.buildArray(arrays, float.class.toString());
		case Signature.SIG_INT:
			return this.buildArray(arrays, int.class.toString());
		case Signature.SIG_LONG:
			return this.buildArray(arrays, long.class.toString());
		case Signature.SIG_SHORT:
			return this.buildArray(arrays, short.class.toString());
		default:
			final var genericStart = type.indexOf(Util.C_GENERIC_START);
			final var end = genericStart == -1 ? type.indexOf(Util.C_NAME_END) : genericStart;
			final var prefix = type.charAt(0);
			switch (prefix) {
			case Util.C_UNRESOLVED:
				var resolvedType = this.findType(cu, type.substring(1, end));
				if (resolvedType == null) {
					resolvedType = type.substring(1, type.indexOf(';'));
					LOGGER.warn(
							"Could not resolve type \"" + typeName + "\" in JDT, assuming \"" + resolvedType + ".\"");
				}
				return this.buildArray(arrays, resolvedType);
			case Util.C_RESOLVED:
				return this.buildArray(arrays, type.substring(1, end));
			case Util.C_TYPE_VARIABLE:
				return this.buildArray(arrays, type.substring(1, end));
			default:
				LOGGER.error("Unhandled JDT type prefix: " + prefix);
			}
		}
		throw new IllegalStateException("Unhandled return type \"" + type + "\" in " + cu.getPath());
	}

	private String findType(final ICompilationUnit cu, final String name) {
		try {
			// Check if the type already has a fully qualified name
			if (name.indexOf(Util.C_DOT) > -1) {
				return name;
			}

			// Search the imports for the type
			final var importedType = this.searchTypeInImports(cu, name);
			if (importedType != null) {
				return importedType;
			}

			// Search java.lang for the type
			final var packageFragment = this.getPackageFragment("java.lang");
			if (packageFragment != null) {
				final var fullyQualifiedName = this.findTypeInPackage(name, packageFragment);
				if (fullyQualifiedName != null) {
					return fullyQualifiedName;
				}
			}

			// Search the own package
			final var type = this.findTypeOwnPackage(cu, name);
			if (type != null) {
				return type;
			}

			final var qualifiedType = this.findQualifiedTypeUsage(cu, name);
			if (qualifiedType != null) {
				return qualifiedType;
			}
		} catch (final CoreException e) {
			throw new IllegalStateException(e);
		}

		return null;
	}

	private String findQualifiedTypeUsage(final ICompilationUnit cu, final String name) throws JavaModelException {
		for (final IType definedType : cu.getTypes()) {
			for (final IField field : definedType.getFields()) {
				final var fieldType = field.getTypeSignature();
				if (this.isQualifiedVersion(name, fieldType)) {
					return this.getFullyQualifiedName4JDT(cu, fieldType);
				}
			}
			for (final IMethod method : definedType.getMethods()) {
				final var returnType = method.getReturnType();
				if (this.isQualifiedVersion(name, returnType)) {
					return this.getFullyQualifiedName4JDT(cu, returnType);
				}
				for (final String parameterType : method.getParameterTypes()) {
					if (this.isQualifiedVersion(name, parameterType)) {
						return this.getFullyQualifiedName4JDT(cu, parameterType);
					}
				}
			}
		}
		return null;
	}

	private boolean isQualifiedVersion(final String nonQualified, final String potentiallyQualified) {
		String current;
		final var genericStart = potentiallyQualified.indexOf(Util.C_GENERIC_START);
		if (genericStart == -1) {
			current = potentiallyQualified;
		} else {
			current = potentiallyQualified.substring(0, genericStart)
					+ potentiallyQualified.substring(1 + potentiallyQualified.lastIndexOf(Util.C_GENERIC_END));
		}

		final var index = current.lastIndexOf(Util.C_DOT);
		return index >= 0 && nonQualified.equals(current.substring(index + 1, current.indexOf(Util.C_SEMICOLON)));
	}

	/**
	 * Searches the type in the imports of the compilation unit
	 *
	 * @param cu
	 * @param name
	 * @return
	 * @throws JavaModelException
	 */
	private String searchTypeInImports(final ICompilationUnit cu, final String name) throws JavaModelException {
		if (cu != null) {
			for (final IImportDeclaration imp : cu.getImports()) {
				final var importName = imp.getElementName();

				if (Util.C_STAR == importName.charAt(importName.length() - 1)) {
					// Resolve import all
					final var packageName = importName.substring(0, importName.lastIndexOf(Util.C_DOT));
					final var packageFragment = this.getPackageFragment(packageName);
					if (packageFragment != null) {
						final var fullyQualifiedName = this.findTypeInPackage(name, packageFragment);
						if (fullyQualifiedName != null) {
							return fullyQualifiedName;
						}
					}

				} else {
					// Check imported types
					final var simpleName = this.getSimpleName(importName);
					if (simpleName.equals(name)) {
						return imp.getElementName();
					}
				}
			}
		}
		return null;
	}

	/**
	 * Calculates the simple type name from the fully qualified import name
	 *
	 * @param importName Fully qualified name
	 * @return simple name of the imported type
	 */
	private String getSimpleName(final String importName) {
		var simpleName = importName;
		final var index = simpleName.lastIndexOf(Util.C_DOT);
		if (index >= 0) {
			simpleName = simpleName.substring(index + 1);
		}
		return simpleName;
	}

	/**
	 * Searches the type in the package of the compilation unit
	 *
	 * @param cu
	 * @param name
	 * @return
	 * @throws JavaModelException
	 */
	private String findTypeOwnPackage(final ICompilationUnit cu, final String name) throws JavaModelException {
		if (cu != null) {
			for (final IPackageDeclaration packageDeclaration : cu.getPackageDeclarations()) {
				final var cuPackageFragment = this.getPackageFragment(packageDeclaration.getElementName());
				if (cuPackageFragment != null) {
					final var ownName = this.findTypeInPackage(name, cuPackageFragment);
					if (ownName != null) {
						return ownName;
					}
				}
			}
		}
		return null;
	}

	private String buildArray(final int arrays, final String type) {
		final var typeSignature = new StringBuilder(type);
		for (var i = 0; i < arrays; i++) {
			typeSignature.append("[]");
		}
		return typeSignature.toString();
	}

	private String findTypeInPackage(final String name, final IPackageFragment packageFragment)
			throws JavaModelException {
		for (final IJavaElement child : packageFragment.getChildren()) {
			final var primaryType = ((ITypeRoot) child).findPrimaryType();
			if (primaryType.getElementName().equals(name)) {
				return primaryType.getFullyQualifiedName();
			}
		}
		return null;
	}

	private IPackageFragment getPackageFragment(final String packageName) throws JavaModelException {
		for (final IPackageFragmentRoot root : this.project.getAllPackageFragmentRoots()) {
			for (final IJavaElement element : root.getChildren()) {
				if (element instanceof final IPackageFragment packageFragment
						&& (packageFragment.getElementName().equals(packageName))) {
					return packageFragment;

				}
			}
		}
		return null;
	}

	Map<IType, Annotations> cache = new HashMap<>();

	private Annotations getSecurityRequirements(final IType type) {
		final var entry = this.cache.get(type);
		if (entry != null) {
			return entry;
		}
		final Set<String> secrecySignatures = new HashSet<>();
		final Set<String> integritySignatures = new HashSet<>();
		final var critical = type.getAnnotation(Critical.class.getSimpleName());
		if (critical != null && critical.exists()) {
			try {
				for (final IMemberValuePair pair : critical.getMemberValuePairs()) {
					final var memberName = pair.getMemberName();
					if ("secrecy".equals(memberName)) {
						this.addToSignatures(secrecySignatures, pair);
					} else if ("integrity".equals(memberName)) {
						this.addToSignatures(integritySignatures, pair);
					}
				}
			} catch (final JavaModelException e) {
				throw new IllegalStateException(e);
			}
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

	public static Collection<IMarker> createErrorMarker(final MethodCall methodCall, final String message,
			final String... relevantMember) {
		final var callLocations = methodCall.getCallLocations();
		final Collection<IMarker> marker = new ArrayList<>(callLocations.size());
		for (final CallLocation callLocation : callLocations) {
			try {
				final var member = callLocation.getMember();
				var resource = member.getResource();
				if (resource == null) {
					resource = member.getJavaProject().getResource();
				}
				final var line = callLocation.getLineNumber();

				marker.add(SecurityMarkerUtil.createErrorMarker(resource, line, message, relevantMember));
			} catch (final CoreException e) {
				throw new IllegalStateException(e);
			}
		}
		return marker;
	}

	private final class OutgoingAccessCheck extends CallHierarchyVisitor {
		private final Collection<String> accessedSignatures;
		private final MethodWrapper root;
		private final Set<String> secrecySignatures;
		private final Set<String> integritySignatures;
		private final ICompilationUnit cu;
		private final String analyzedMemberSignature;
		private final IType type;

		private OutgoingAccessCheck(final Collection<String> accessedSignatures, final MethodWrapper root,
				final IMember caller, final Set<String> secrecySignatures, final Set<String> integritySignatures) {
			this.accessedSignatures = accessedSignatures;
			this.root = root;
			this.cu = caller.getCompilationUnit();
			this.type = caller.getDeclaringType();
			this.secrecySignatures = secrecySignatures;
			this.integritySignatures = integritySignatures;
			this.analyzedMemberSignature = SecureDependencyCheck.this.getSignature(caller);
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
			final var calledMemberSignature = SecureDependencyCheck.this.getSignature(calledMember);
			SecurityMarkerUtil.deleteOldMarkers(calledMember.getResource(), this.analyzedMemberSignature,
					SecureDependencyCheck.this.timestamp);

			final var calleeSecrecy = this.requiresSecrecy(calledMember);
			final var callerSecrecyRequirement = SecureDependencyCheck.this.getCorrespondingEntry(calledMember,
					this.secrecySignatures, this.cu);
			final var callerSecrey = callerSecrecyRequirement != null;
			if (callerSecrey) {
				this.accessedSignatures.add(callerSecrecyRequirement);
			}
			if (callerSecrey != calleeSecrecy) {
				if (callerSecrey) {
					createErrorMarker(methodWrapper.getMethodCall(),
							"Secrecy is required but not provided by the accessed member!",
							this.analyzedMemberSignature, calledMemberSignature);
					SecurityMarkerUtil.createErrorMarker(calledMember,
							"Secrecy is required for this member by \"" + this.analyzedMemberSignature + "\"",
							this.analyzedMemberSignature, calledMemberSignature);

				} else {
					createErrorMarker(methodWrapper.getMethodCall(),
							"The class \"" + this.type.getElementName() + "\" must specify secrecy for accessing \""
									+ calledMemberSignature + "\"!",
							this.analyzedMemberSignature, calledMemberSignature);
					SecurityMarkerUtil.createErrorMarker(calledMember,
							this.analyzedMemberSignature + " accesses this member without the required secrecy!",
							this.analyzedMemberSignature, calledMemberSignature);
				}
			}

			final var calleeIntegrity = this.requiresIntegrity(calledMember);
			final var callerIntegrityRequirement = SecureDependencyCheck.this.getCorrespondingEntry(calledMember,
					this.integritySignatures, this.cu);
			final var callerIntegrity = callerIntegrityRequirement != null;
			if (callerIntegrity) {
				this.accessedSignatures.add(callerIntegrityRequirement);
			}
			if (callerIntegrity != calleeIntegrity) {
				if (callerIntegrity) {
					createErrorMarker(methodWrapper.getMethodCall(),
							"Integrity is required but not provided by the accessed member!",
							this.analyzedMemberSignature, calledMemberSignature);
					SecurityMarkerUtil.createErrorMarker(calledMember,
							"Integrity is required for this member by \"" + this.analyzedMemberSignature + "\"",
							this.analyzedMemberSignature, calledMemberSignature);
				} else {
					createErrorMarker(methodWrapper.getMethodCall(),
							"The class \"" + this.type.getElementName() + "\" must specify integrity for accessing \""
									+ calledMemberSignature + "\"!",
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
						|| SecureDependencyCheck.this.getCorrespondingEntry(member,
								SecureDependencyCheck.this.getSecurityRequirements(member.getDeclaringType()).secrecy(),
								this.cu) != null;
			}
			return false;
		}

		private boolean requiresIntegrity(final IMember member) {
			if (member instanceof final IAnnotatable annotatable) {
				return annotatable.getAnnotation(Integrity.class.getSimpleName()).exists()
						|| SecureDependencyCheck.this.getCorrespondingEntry(member, SecureDependencyCheck.this
								.getSecurityRequirements(member.getDeclaringType()).integrity(), this.cu) != null;
			}
			return false;
		}
	}

	private final class IncomingAccessCheck extends CallHierarchyVisitor {

		private final IMember member;
		private final boolean secrecy;
		private final MethodWrapper root;
		private final boolean integrity;
		private final ICompilationUnit cu;
		private final String analyzedMemberSignature;

		private IncomingAccessCheck(final IMember member, final boolean secrecy, final MethodWrapper root,
				final boolean integrity) {
			this.member = member;
			this.cu = member.getCompilationUnit();
			this.secrecy = secrecy;
			this.root = root;
			this.integrity = integrity;
			this.analyzedMemberSignature = SecureDependencyCheck.this.getSignature(this.member);

		}

		@Override
		public boolean visit(final MethodWrapper methodWrapper) {
			if (this.root == methodWrapper) {
				return true;
			}
			final var caller = methodWrapper.getMember();
			final var callingMemberSignature = SecureDependencyCheck.this.getSignature(caller);
			SecurityMarkerUtil.deleteOldMarkers(caller.getResource(), this.analyzedMemberSignature,
					SecureDependencyCheck.this.timestamp);

			IType type;
			if (caller instanceof IType) {
				type = (IType) caller;
			} else {
				type = caller.getDeclaringType();
			}
			final var callerAnnotations = SecureDependencyCheck.this.getSecurityRequirements(type);

			final var callerSecrecyRequirement = SecureDependencyCheck.this.getCorrespondingEntry(this.member,
					callerAnnotations.secrecy(), this.cu);
			final var callerSecrecy = callerSecrecyRequirement != null;
			if (callerSecrecy != this.secrecy) {
				if (callerSecrecy) {
					createErrorMarker(methodWrapper.getMethodCall(),
							"Secrecy is required but not provided by the accessed member!",
							this.analyzedMemberSignature, callingMemberSignature);
					SecurityMarkerUtil.createErrorMarker(this.member,
							"Secrecy is required for this member by \"" + callingMemberSignature + "\"",
							this.analyzedMemberSignature, callingMemberSignature);
				} else {
					SecurityMarkerUtil.createErrorMarker(this.member,
							callingMemberSignature + " accesses this member without the required secrecy!",
							this.analyzedMemberSignature, callingMemberSignature);
					createErrorMarker(methodWrapper.getMethodCall(),
							"This class must specify secrecy for accessing \"" + this.analyzedMemberSignature + "\"!",
							this.analyzedMemberSignature, callingMemberSignature);

				}
			}

			final var callerIntegrityRequirement = SecureDependencyCheck.this.getCorrespondingEntry(this.member,
					callerAnnotations.integrity(), this.cu);
			final var callerIntegrity = callerIntegrityRequirement != null;
			if (callerIntegrity != this.integrity) {
				if (callerIntegrity) {
					SecurityMarkerUtil.createErrorMarker(this.member,
							"Integrity is required for this member by \"" + callingMemberSignature + "\"",
							this.analyzedMemberSignature, callingMemberSignature);
					createErrorMarker(methodWrapper.getMethodCall(),
							"Integrity is required but not provided by the accessed member!",
							this.analyzedMemberSignature, callingMemberSignature);
				} else {
					SecurityMarkerUtil.createErrorMarker(this.member,
							callingMemberSignature + " accesses this member without the required integrity!",
							this.analyzedMemberSignature, callingMemberSignature);
					createErrorMarker(methodWrapper.getMethodCall(),
							"This class must specify integrity for accessing \"" + this.analyzedMemberSignature + "\"!",
							this.analyzedMemberSignature, callingMemberSignature);

				}
			}

			return false;
		}
	}

	class Annotations {
		final Set<String> secrecySignatures;
		final Set<String> integritySignatures;
		final IType type;
		final IAnnotation annotation;

		public Annotations(final Set<String> secrecySignatures, final Set<String> integritySignatures, final IType type,
				final IAnnotation critical) {
			this.annotation = critical;
			this.type = type;
			this.secrecySignatures = secrecySignatures;
			this.integritySignatures = integritySignatures;
		}

		public Set<String> secrecy() {
			return new HashSet<>(this.secrecySignatures);
		}

		public Set<String> integrity() {
			return new HashSet<>(this.integritySignatures);
		}
	}
}
