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
import org.eclipse.core.resources.IResource;
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
import org.gravity.eclipse.util.JavaASTUtil;
import org.gravity.security.annotations.requirements.Critical;
import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

@SuppressWarnings("restriction")
public class SecureDependencyCheck extends CompilationParticipant {

	private static final String MARKER_SOURCE = "org.gravity.security";
	private static final String MARKER_ATTR_ANALYZED = "org.gravity.security.analyzedMember";
	private static final Logger LOGGER = Logger.getLogger(SecureDependencyCheck.class);

	private IJavaProject project;

	@Override
	public boolean isAnnotationProcessor() {
		return true;
	}

	@Override
	public boolean isActive(IJavaProject project) {
		return true;
	}

	@Override
	public void processAnnotations(BuildContext[] files) {
		cache = new HashMap<>();
		for (BuildContext context : files) {
			if (context instanceof CompilationParticipantResult result
					&& (result.hasAnnotations(Secrecy.class.getName())
							|| result.hasAnnotations(Integrity.class.getName())
							|| result.hasAnnotations(Critical.class.getName()))) {

				final ICompilationUnit cu = (ICompilationUnit) JavaCore.create(result.getFile());
				project = cu.getJavaProject();

				deleteOldMarkers(cu);

				Set<String> secrecySignatures = new HashSet<>();
				Set<String> integritySignatures = new HashSet<>();

				Set<IMember> secrecyMembers = new HashSet<>();
				Set<IMember> integrityMembers = new HashSet<>();

				Collection<String> accessedSignatures = new HashSet<>();
				Set<IMember> members = collectAllMembers(cu, secrecySignatures, integritySignatures, secrecyMembers,
						integrityMembers);
				for (IMember member : members) {
					accessedSignatures.addAll(checkOutgoingAccesses(secrecySignatures, integritySignatures, member));
					checkIncomingAccesses(member, secrecyMembers.contains(member), integrityMembers.contains(member));
				}

				checkForUnusedRequirements(cu, secrecySignatures, integritySignatures, accessedSignatures);
			}
		}
	}

	private void checkForUnusedRequirements(final ICompilationUnit cu, Set<String> secrecySignatures,
			Set<String> integritySignatures, Collection<String> accessedSignatures) {
		if (!secrecySignatures.isEmpty() || !integritySignatures.isEmpty()) {
			try {
				Collection<Annotations> annotations = new LinkedList<>();
				for (IType type : cu.getAllTypes()) {
					annotations.add(getSecurityRequirements(type));
				}

				for (String signature : secrecySignatures) {
					if (!accessedSignatures.contains(signature)) {
						annotations.forEach(a -> {
							if (a.secrecy().contains(signature)) {
								createWarningMarker(a.annotation, "There is a secrecy requirement for \"" + signature
										+ "\" but the signature is neither defined nor accessed!");
							}
						});
					}
				}
				for (String signature : integritySignatures) {
					if (!accessedSignatures.contains(signature)) {
						annotations.forEach(a -> {
							if (a.integrity().contains(signature)) {
								createWarningMarker(a.annotation, "There is a integrity requirement for \"" + signature
										+ "\" but the signature is neither defined nor accessed!");
							}
						});
					}
				}
			} catch (JavaModelException e) {
				LOGGER.error(e);
			}
		}
	}

	private void deleteOldMarkers(final ICompilationUnit cu) {
		try {
			for (IMarker m : cu.getResource().findMarkers(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE)) {
				if (MARKER_SOURCE.equals(m.getAttribute(IMarker.SOURCE_ID))) {
					m.delete();
				}
			}
		} catch (CoreException e) {
			LOGGER.error(e);
		}
	}

	private void deleteOldMarkers(final IResource res, String analyzedMember) {
		if (res != null)
			try {
				for (IMarker m : res.findMarkers(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE)) {
					if (MARKER_SOURCE.equals(m.getAttribute(IMarker.SOURCE_ID))
							&& m.getAttribute(MARKER_ATTR_ANALYZED, "").contains(analyzedMember)) {
						m.delete();
					}
				}
			} catch (CoreException e) {
				LOGGER.error(e);
			}
	}

	private Set<IMember> collectAllMembers(final ICompilationUnit cu, Set<String> secrecySignatures,
			Set<String> integritySignatures, Set<IMember> secrecyMembers, Set<IMember> integrityMembers) {
		Set<IMember> members = new HashSet<>();
		try {
			for (IType type : cu.getAllTypes()) {
				members.addAll(collectAllMembers(type, secrecySignatures, integritySignatures, secrecyMembers,
						integrityMembers));
			}
		} catch (JavaModelException e) {
			throw new IllegalStateException(e);
		}
		return members;
	}

	private Collection<IMember> collectAllMembers(IType type, Set<String> secrecySignatures,
			Set<String> integritySignatures, Set<IMember> secrecyMembers, Set<IMember> integrityMembers)
			throws JavaModelException {
		final var annotations = getSecurityRequirements(type);
		secrecySignatures.addAll(annotations.secrecy());
		integritySignatures.addAll(annotations.integrity());

		IMethod[] methods = type.getMethods();
		IField[] fields = type.getFields();
		Collection<IMember> members = new ArrayList<>(methods.length + fields.length);
		for (IMethod method : methods) {
			members.add(method);

			if (removeMember(method, secrecySignatures)
					|| method.getAnnotation(Secrecy.class.getSimpleName()).exists()) {
				secrecyMembers.add(method);
			}

			if (removeMember(method, integritySignatures)
					|| method.getAnnotation(Integrity.class.getSimpleName()).exists()) {
				integrityMembers.add(method);
			}
		}
		for (IField field : fields) {
			members.add(field);

			if (removeMember(field, secrecySignatures) || field.getAnnotation(Secrecy.class.getSimpleName()).exists()) {
				secrecyMembers.add(field);
			}
			if (removeMember(field, integritySignatures)
					|| field.getAnnotation(Integrity.class.getSimpleName()).exists()) {
				integrityMembers.add(field);
			}
		}
		return members;
	}

	private void checkIncomingAccesses(IMember member, boolean secrecy, boolean integrity) {
		for (MethodWrapper root : CallHierarchy.getDefault().getCallerRoots(new IMember[] { member })) {
			root.accept(new CallHierarchyVisitor() {

				@Override
				public boolean visit(MethodWrapper methodWrapper) {
					if (root == methodWrapper) {
						return true;
					}
					IMember caller = methodWrapper.getMember();
					String callingMemberSignature = getSignature(caller);
					String analyzedMemberSignature = getSignature(member);
					deleteOldMarkers(caller.getResource(), analyzedMemberSignature);

					Annotations annotations = getSecurityRequirements(caller.getDeclaringType());

					String callerSecrecyRequirement = getCorrespondingEntry(member, annotations.secrecy());
					boolean callerSecrecy = callerSecrecyRequirement != null;
					if (callerSecrecy != secrecy) {
						if (callerSecrecy) {
							createErrorMarker(methodWrapper.getMethodCall(),
									"Secrecy is required but not provided by the accessed member!",
									analyzedMemberSignature, callingMemberSignature);
							createErrorMarker(member,
									"Secrecy is required for this member by \"" + callingMemberSignature + "\"",
									analyzedMemberSignature, callingMemberSignature);
						} else {
							createErrorMarker(member,
									callingMemberSignature + " accesses this member without the required secrecy!",
									analyzedMemberSignature, callingMemberSignature);
							createErrorMarker(
									methodWrapper.getMethodCall(), "This class must specify secrecy for accessing \""
											+ analyzedMemberSignature + "\"!",
									analyzedMemberSignature, callingMemberSignature);

						}
					}

					String callerIntegrityRequirement = getCorrespondingEntry(member, annotations.integrity());
					boolean callerIntegrity = callerIntegrityRequirement != null;
					if (callerIntegrity != integrity) {
						if (callerIntegrity) {
							createErrorMarker(member,
									"Integrity is required for this member by \"" + callingMemberSignature + "\"",
									analyzedMemberSignature, callingMemberSignature);
							createErrorMarker(methodWrapper.getMethodCall(),
									"Integrity is required but not provided by the accessed member!",
									analyzedMemberSignature, callingMemberSignature);
						} else {
							createErrorMarker(member,
									callingMemberSignature + " accesses this member without the required integrity!",
									analyzedMemberSignature, callingMemberSignature);
							createErrorMarker(
									methodWrapper.getMethodCall(), "This class must specify integrity for accessing \""
											+ analyzedMemberSignature + "\"!",
									analyzedMemberSignature, callingMemberSignature);

						}
					}

					return false;
				}
			}, new NullProgressMonitor());
		}
	}

	private Collection<String> checkOutgoingAccesses(Set<String> secrecySignatures, Set<String> integritySignatures,
			IMember caller) {
		Collection<String> accessedSignatures = new HashSet<>();
		for (MethodWrapper root : CallHierarchy.getDefault().getCalleeRoots(new IMember[] { caller })) {
			// Check outgoing calls
			root.accept(new CallHierarchyVisitor() {
				public boolean visit(MethodWrapper methodWrapper) {
					if (root == methodWrapper) {
						return true;
					}
					IMember calledMember = methodWrapper.getMember();
					if (calledMember instanceof IType) {
						return false;
					}
					String calledMemberSignature = getSignature(calledMember);
					String analyzedMemberSignature = getSignature(caller);
					deleteOldMarkers(calledMember.getResource(), analyzedMemberSignature);

					boolean calleeSecrecy = requiresSecrecy(calledMember);
					String callerSecrecyRequirement = getCorrespondingEntry(calledMember, secrecySignatures);
					boolean callerSecrey = callerSecrecyRequirement != null;
					if (callerSecrey) {
						accessedSignatures.add(callerSecrecyRequirement);
					}
					if (callerSecrey != calleeSecrecy) {
						if (callerSecrey) {
							createErrorMarker(methodWrapper.getMethodCall(),
									"Secrecy is required but not provided by the accessed member!",
									analyzedMemberSignature, calledMemberSignature);
							createErrorMarker(calledMember,
									"Secrecy is required for this member by \"" + analyzedMemberSignature + "\"",
									analyzedMemberSignature, calledMemberSignature);

						} else {
							createErrorMarker(methodWrapper.getMethodCall(),
									"This class must specify secrecy for accessing \"" + calledMemberSignature + "\"!",
									analyzedMemberSignature, calledMemberSignature);
							createErrorMarker(calledMember,
									analyzedMemberSignature + " accesses this member without the required secrecy!",
									analyzedMemberSignature, calledMemberSignature);
						}
					}

					boolean calleeIntegrity = requiresIntegrity(calledMember);
					String callerIntegrityRequirement = getCorrespondingEntry(calledMember, integritySignatures);
					boolean callerIntegrity = callerIntegrityRequirement != null;
					if (callerIntegrity) {
						accessedSignatures.add(callerIntegrityRequirement);
					}
					if (callerIntegrity != calleeIntegrity) {
						if (callerIntegrity) {
							createErrorMarker(methodWrapper.getMethodCall(),
									"Integrity is required but not provided by the accessed member!",
									analyzedMemberSignature, calledMemberSignature);
							createErrorMarker(calledMember,
									"Integrity is required for this member by \"" + analyzedMemberSignature + "\"",
									analyzedMemberSignature, calledMemberSignature);
						} else {
							createErrorMarker(
									methodWrapper.getMethodCall(), "This class must specify integrity for accessing \""
											+ calledMemberSignature + "\"!",
									analyzedMemberSignature, calledMemberSignature);
							createErrorMarker(calledMember,
									analyzedMemberSignature + " accesses this member without the required integrity!",
									analyzedMemberSignature, calledMemberSignature);

						}
					}

					// Do not continue tree traversal
					return false;
				}

			}, new NullProgressMonitor());
		}
		return accessedSignatures;
	}

	private boolean removeMember(IMember member, Collection<String> signatures) {
		String remove = getCorrespondingEntry(member, signatures);
		if (remove != null) {
			return signatures.remove(remove);
		}
		return false;
	}

	private String getSignature(IMember member) {
		var cu = member.getCompilationUnit();
		if (member instanceof IMethod method) {
			String suffix;
			try {
				String returnType = getFullyQualifiedName4JDT(cu, method.getReturnType());
				suffix = "):" + returnType.substring(returnType.lastIndexOf('.') + 1);
			} catch (JavaModelException e) {
				LOGGER.error(e);
				suffix = ")";
			}
			return Stream.of(method.getParameterTypes()).map(p -> {
				String fqn = getFullyQualifiedName4JDT(cu, p);
				return fqn.substring(fqn.lastIndexOf('.') + 1);
			}).collect(Collectors.joining(",",
					member.getDeclaringType().getElementName() + '.' + method.getElementName() + '(', suffix));
		} else if (member instanceof IField field) {
			StringBuilder signature = new StringBuilder(member.getDeclaringType().getElementName());
			signature.append('.');
			signature.append(field.getElementName());
			try {
				String type = getFullyQualifiedName4JDT(cu, field.getTypeSignature());
				signature.append(':');
				signature.append(type.substring(type.lastIndexOf(':') + 1));
			} catch (CoreException e) {
				LOGGER.error(e);
			}
			return signature.toString();
		}
		return null;
	}

	private String getCorrespondingEntry(IMember member, Collection<String> signatures) {
		String name = member.getElementName();
		switch (member.getElementType()) {
		case IJavaElement.METHOD:
			IMethod method = (IMethod) member;

			for (String signature : signatures) {
				try {
					if (isInExpectedType(signature, member) && isMethodWithName(name, signature)
							&& compareReturnType(method, signature) && compareParameters(method, signature)) {
						return signature;
					}
				} catch (JavaModelException e) {
					e.printStackTrace();
				}
			}
			break;
		case IJavaElement.FIELD:
			IField field = (IField) member;

			for (String signature : signatures) {
				if (isInExpectedType(signature, member) && isFieldWithName(name, signature)
						&& compareFieldType(field, signature)) {
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

	private boolean isInExpectedType(String signature, IMember member) {
		int method = signature.indexOf('(');
		if (method == -1) {
			method = signature.length();
		}
		int dot = signature.substring(0, method).lastIndexOf('.');
		if (dot >= 0) {
			String signatureType = getFullyQualifiedName4Text(member.getCompilationUnit(), signature.substring(0, dot));
			String memberType = member.getDeclaringType().getFullyQualifiedName();
			if (!signatureType.equals(memberType)) {
				return false;
			}
		}
		return true;
	}

	private boolean isFieldWithName(String name, String signature) {
		boolean notMethod = signature.indexOf('(') == -1;
		return notMethod && signature.substring(0, signature.indexOf(':')).endsWith(name);
	}

	private boolean compareFieldType(IField field, String signature) {
		try {
			String signatureType = getFullyQualifiedName4Text(field.getCompilationUnit(),
					signature.substring(signature.indexOf(':') + 1));
			String fieldType = getFullyQualifiedName4JDT(field.getCompilationUnit(), field.getTypeSignature());
			return signatureType.equals(fieldType);
		} catch (JavaModelException e) {
			throw new IllegalStateException(e);
		}
	}

	private boolean isMethodWithName(String name, String signature) {
		int open = signature.indexOf('(');
		return open > 0 && signature.substring(0, open).trim().endsWith(name);
	}

	private boolean compareParameters(IMethod method, String signature) {
		int end = signature.indexOf(')');
		int start = signature.indexOf('(') + 1;
		if (start == end) {
			return true;
		}
		String[] signaturePlainParameters = signature.substring(start, end).split(",");
		String[] methodPlainParameters = method.getParameterTypes();
		if (signaturePlainParameters.length == methodPlainParameters.length) {
			List<String> signatureParameters = Stream.of(signaturePlainParameters).map(String::trim)
					.map(p -> getFullyQualifiedName4Text(method.getCompilationUnit(), p)).toList();
			List<String> methodParameters = Stream.of(methodPlainParameters)
					.map(p -> getFullyQualifiedName4JDT(method.getCompilationUnit(), p)).toList();
			if (equals(signatureParameters, methodParameters)) {
				return true;
			}
		}
		return false;
	}

	private boolean compareReturnType(IMethod method, String signature) throws JavaModelException {
		String signatureReturnType;
		int colon = signature.indexOf(':');
		ICompilationUnit cu = method.getCompilationUnit();
		if (colon >= 0) {
			signatureReturnType = signature.substring(colon + 1).trim();
			if ("void".equalsIgnoreCase(signatureReturnType)) {
				signatureReturnType = "void";
			} else {
				signatureReturnType = getFullyQualifiedName4Text(cu, signatureReturnType);
			}
		} else {
			signatureReturnType = "void";
		}
		String methodReturnType = getFullyQualifiedName4JDT(cu, method.getReturnType());
		return methodReturnType.equals(signatureReturnType);
	}

	private boolean equals(List<String> signatureParameters, List<String> methodParameters) {
		for (int i = 0; i < signatureParameters.size(); i++) {
			if (!methodParameters.get(i).equals(signatureParameters.get(i))) {
				return false;
			}
		}
		return true;
	}

	private String getFullyQualifiedName4Text(ICompilationUnit cu, String type) {
		type = type.replace(" ", "");
		int genericStart = type.indexOf('<');
		if (genericStart >= 0) {
			type = type.substring(0, genericStart);
		}
		int array = 0;
		int arrayStart = type.indexOf('[');
		if (arrayStart >= 0) {
			for (; arrayStart < type.length(); arrayStart++) {
				if ('[' == type.charAt(arrayStart)) {
					array++;
				}
			}
		}

		String resolvedType = findType(cu, type);
		if (resolvedType == null) {
			return buildArray(array, type);
		}
		return buildArray(array, resolvedType);
	}

	private String getFullyQualifiedName4JDT(ICompilationUnit cu, String typeName) {
		int arrays = 0;
		while (typeName.charAt(arrays) == Util.C_ARRAY) {
			arrays++;
		}

		String type = typeName.substring(arrays);

		switch (type) {
		case Signature.SIG_VOID:
			return buildArray(arrays, void.class.toString());
		case Signature.SIG_BOOLEAN:
			return buildArray(arrays, boolean.class.toString());
		case Signature.SIG_BYTE:
			return buildArray(arrays, byte.class.toString());
		case Signature.SIG_CHAR:
			return buildArray(arrays, char.class.toString());
		case Signature.SIG_DOUBLE:
			return buildArray(arrays, double.class.toString());
		case Signature.SIG_FLOAT:
			return buildArray(arrays, float.class.toString());
		case Signature.SIG_INT:
			return buildArray(arrays, int.class.toString());
		case Signature.SIG_LONG:
			return buildArray(arrays, long.class.toString());
		case Signature.SIG_SHORT:
			return buildArray(arrays, short.class.toString());
		default:
			int genericStart = type.indexOf(Util.C_GENERIC_START);
			int end = genericStart == -1 ? type.indexOf(Util.C_NAME_END) : genericStart;
			switch (type.charAt(0)) {
			case Util.C_UNRESOLVED:
				String resolvedType = findType(cu, type.substring(1, end));
				if (resolvedType == null) {
					LOGGER.error("Could not resolve type in JDT: " + typeName);
					resolvedType = type.substring(1, type.indexOf(';'));
				}
				return buildArray(arrays, resolvedType);
			case Util.C_RESOLVED:
				return buildArray(arrays, type.substring(1, end));
			case Util.C_TYPE_VARIABLE:
				return buildArray(arrays, type.substring(1, end));
			}
		}
		throw new IllegalStateException("Unhandled return type \"" + type + "\" in " + cu.getPath());
	}

	private String findType(ICompilationUnit cu, String name) {
		try {
			// Check if the type already has a fully qualified name
			if (name.indexOf(Util.C_DOT) > -1) {
				return name;
			}

			// Search the imports for the type
			if (cu != null)
				for (IImportDeclaration imp : cu.getImports()) {
					String importName = imp.getElementName();

					if (Util.C_STAR == importName.charAt(importName.length() - 1)) {
						// Resolve import all
						String packageName = importName.substring(0, importName.lastIndexOf(Util.C_DOT));
						IPackageFragment packageFragment = getPackageFragment(packageName);
						if (packageFragment != null) {
							String fullyQualifiedName = findTypeInPackage(name, packageFragment);
							if (fullyQualifiedName != null) {
								return fullyQualifiedName;
							}
						}

					} else {
						// Check imported types
						String simpleName = importName;
						int index = simpleName.lastIndexOf(Util.C_DOT);
						if (index >= 0) {
							simpleName = simpleName.substring(index + 1);
						}
						if (simpleName.equals(name)) {
							return imp.getElementName();
						}
					}
				}

			// Search java.lang for the type
			IPackageFragment packageFragment = getPackageFragment("java.lang");
			String fullyQualifiedName = findTypeInPackage(name, packageFragment);
			if (fullyQualifiedName != null) {
				return fullyQualifiedName;
			}

			// Search the own package
			if (cu != null)
				for (IPackageDeclaration packageDeclaration : cu.getPackageDeclarations()) {
					IPackageFragment cuPackageFragment = getPackageFragment(packageDeclaration.getElementName());
					String ownName = findTypeInPackage(name, cuPackageFragment);
					if (ownName != null) {
						return ownName;
					}
				}
		} catch (CoreException e) {
			throw new IllegalStateException(e);
		}

		return null;
	}

	private String buildArray(int arrays, String type) {
		StringBuilder typeSignature = new StringBuilder(type);
		for (int i = 0; i < arrays; i++) {
			typeSignature.append("[]");
		}
		return typeSignature.toString();
	}

	private String findTypeInPackage(String name, IPackageFragment packageFragment) throws JavaModelException {
		for (IJavaElement child : packageFragment.getChildren()) {
			IType primaryType = ((ITypeRoot) child).findPrimaryType();
			if (primaryType.getElementName().equals(name)) {
				return primaryType.getFullyQualifiedName();
			}
		}
		return null;
	}

	private IPackageFragment getPackageFragment(String packageName) throws JavaModelException {
		for (IPackageFragmentRoot root : project.getAllPackageFragmentRoots()) {
			for (IJavaElement element : root.getChildren()) {
				if (element instanceof IPackageFragment packageFragment
						&& (packageFragment.getElementName().equals(packageName))) {
					return packageFragment;

				}
			}
		}
		return null;
	}

	Map<IType, Annotations> cache = new HashMap<>();

	private Annotations getSecurityRequirements(IType type) {
		Annotations entry = cache.get(type);
		if (entry != null) {
			return entry;
		}
		Set<String> secrecySignatures = new HashSet<>();
		Set<String> integritySignatures = new HashSet<>();
		final var critical = type.getAnnotation(Critical.class.getSimpleName());
		if (critical != null && critical.exists()) {
			try {
				for (IMemberValuePair pair : critical.getMemberValuePairs()) {
					switch (pair.getMemberName()) {
					case "secrecy":
						Object secrecyValue = pair.getValue();
						if (secrecyValue instanceof String string) {
							secrecySignatures.add(string);
						} else {
							for (Object secrecy : (Object[]) secrecyValue) {
								secrecySignatures.add((String) secrecy);
							}
						}
						break;
					case "integrity":
						Object integrityValue = pair.getValue();
						if (integrityValue instanceof String string) {
							integritySignatures.add(string);
						} else {
							for (Object integrity : (Object[]) integrityValue) {
								integritySignatures.add((String) integrity);
							}
						}
						break;
					}
				}
			} catch (JavaModelException e) {
				throw new IllegalStateException(e);
			}
		}
		Annotations annotations = new Annotations(secrecySignatures, integritySignatures, type, critical);
		cache.put(type, annotations);
		return annotations;

	}

	private boolean requiresSecrecy(IMember member) {
		if (member instanceof IAnnotatable annotatable) {
			if (member instanceof IType) {
				return false;
			}
			return annotatable.getAnnotation(Secrecy.class.getSimpleName()).exists() || getCorrespondingEntry(member,
					getSecurityRequirements(member.getDeclaringType()).secrecy()) != null;
		}
		return false;
	}

	private boolean requiresIntegrity(IMember member) {
		if (member instanceof IAnnotatable annotatable) {
			return annotatable.getAnnotation(Integrity.class.getSimpleName()).exists() || getCorrespondingEntry(member,
					getSecurityRequirements(member.getDeclaringType()).integrity()) != null;
		}
		return false;
	}

	private Collection<IMarker> createErrorMarker(MethodCall methodCall, String message, String... relevantMember) {
		Collection<CallLocation> callLocations = methodCall.getCallLocations();
		Collection<IMarker> marker = new ArrayList<>(callLocations.size());
		for (CallLocation callLocation : callLocations) {
			try {
				IResource resource = callLocation.getMember().getResource();
				int line = callLocation.getLineNumber();

				marker.add(createErrorMarker(resource, line, message, relevantMember));
			} catch (CoreException e) {
				throw new IllegalStateException(e);
			}
		}
		return marker;
	}

	private IMarker createErrorMarker(IMember member, String message, String... relevantMember) {
		try {
			IResource resource = member.getResource();
			int line = JavaASTUtil.getLine(member);

			return createErrorMarker(resource, line, message, relevantMember);
		} catch (CoreException e) {
			throw new IllegalStateException(e);
		}
	}

	private IMarker createErrorMarker(IResource resource, int line, String message, String... relevantMember)
			throws CoreException {
		IMarker m = resource.createMarker(IMarker.PROBLEM);
		m.setAttribute(IMarker.LINE_NUMBER, line);
		m.setAttribute(IMarker.MESSAGE, message);
		m.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
		m.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
		m.setAttribute(IMarker.SOURCE_ID, MARKER_SOURCE);
		m.setAttribute(MARKER_ATTR_ANALYZED, String.join(";", relevantMember));
		return m;
	}

	private void createWarningMarker(IAnnotation annotation, String message) {
		try {
			IResource resource = annotation.getResource();
			int line = JavaASTUtil.getLine(annotation);

			IMarker m = resource.createMarker(IMarker.PROBLEM);
			m.setAttribute(IMarker.LINE_NUMBER, line);
			m.setAttribute(IMarker.MESSAGE, message);
			m.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_NORMAL);
			m.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
			m.setAttribute(IMarker.SOURCE_ID, MARKER_SOURCE);
		} catch (CoreException e) {
			throw new IllegalStateException(e);
		}
	}

	class Annotations {
		final Set<String> secrecySignatures;
		final Set<String> integritySignatures;
		final IType type;
		final IAnnotation annotation;

		public Annotations(Set<String> secrecySignatures, Set<String> integritySignatures, IType type,
				IAnnotation critical) {
			this.annotation = critical;
			this.type = type;
			this.secrecySignatures = secrecySignatures;
			this.integritySignatures = integritySignatures;
		}

		public Set<String> secrecy() {
			return new HashSet<>(secrecySignatures);
		}

		public Set<String> integrity() {
			return new HashSet<>(integritySignatures);
		}
	}
}
