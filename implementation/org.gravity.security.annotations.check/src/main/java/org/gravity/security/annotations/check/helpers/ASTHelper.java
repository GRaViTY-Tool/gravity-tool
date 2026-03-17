package org.gravity.security.annotations.check.helpers;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IImportDeclaration;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageDeclaration;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeParameter;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.eclipse.jdt.internal.compiler.util.Util;

@SuppressWarnings("restriction")
public class ASTHelper {

	private static final Logger LOGGER = Logger.getLogger(ASTHelper.class);

	private ASTHelper() {
		// This class only provides static methods
	}

	public static String getFullyQualifiedName4Text(final ICompilationUnit cu, String type) {
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
		final var resolvedType = findType(cu, plainType);
		if (resolvedType == null) {
			return buildArray(array, plainType);
		}
		return buildArray(array, resolvedType);
	}

	public static String getFullyQualifiedName4JDT(final ICompilationUnit cu, final String typeName,
			final IMember context) throws JavaModelException {
		return getFullyQualifiedName4JDT(cu, typeName, getTypeParameters(context));
	}

	public static ITypeParameter[] getTypeParameters(final IMember member) throws JavaModelException {
		final List<ITypeParameter> params = new LinkedList<>();
		if (member instanceof final IMethod method) {
			Collections.addAll(params, method.getTypeParameters());
		}
		IJavaElement parent = member.getDeclaringType();
		while (parent != null) {
			if (parent instanceof final IType type) {
				Collections.addAll(params, type.getTypeParameters());
			} else if (parent instanceof final IMethod outer) {
				Collections.addAll(params, outer.getTypeParameters());
			}
			parent = parent.getParent();
		}
		return params.toArray(new ITypeParameter[0]);
	}

	private static String getFullyQualifiedName4JDT(final ICompilationUnit cu, final String typeName,
			final ITypeParameter[] typeParameters) {
		if (typeName.length() == 1 && typeName.charAt(0) == Util.C_VOID) {
			return "void";
		}

		var arrays = 0;
		while (typeName.charAt(arrays) == Util.C_ARRAY) {
			arrays++;
		}

		var type = typeName.substring(arrays);
		if (type.charAt(0) == Util.C_TYPE_VARIABLE) {
			type = resolveTypeParameters(typeParameters, type);
		}

		final var result = switch (type) {
			case Signature.SIG_BOOLEAN -> boolean.class.toString();
			case Signature.SIG_BYTE -> byte.class.toString();
			case Signature.SIG_CHAR -> char.class.toString();
			case Signature.SIG_DOUBLE -> double.class.toString();
			case Signature.SIG_FLOAT -> float.class.toString();
			case Signature.SIG_INT -> int.class.toString();
			case Signature.SIG_LONG -> long.class.toString();
			case Signature.SIG_SHORT -> short.class.toString();
			default -> fullyQualifiedNameForNonPrimitiveType(type, typeParameters, cu);
		};
		return buildArray(arrays, result);
	}

	private static String fullyQualifiedNameForNonPrimitiveType(final String typeSignature,
			final ITypeParameter[] typeParameters, final ICompilationUnit cu) {
		var type = typeSignature;

		final var genericStart = type.indexOf(Util.C_GENERIC_START);
		final var end = genericStart == -1 ? type.indexOf(Util.C_NAME_END) : genericStart;

		final var prefix = type.charAt(0);
		return switch (prefix) {
			case Util.C_UNRESOLVED -> {
				type = type.substring(1, end);
				if (genericStart == -1) {
					final var typeParam = findTypeParameter(typeParameters, type);
					if (typeParam.isPresent()) {
						yield getFullyQualifiedName4JDT(cu, resolveTypeParameter(typeParam.get()), typeParameters);
					}
				}
				var resolvedType = findType(cu, type);
				if (resolvedType == null) {
					resolvedType = type;
					LOGGER.warn("Could not resolve the type \"" + type + "\" used in the scope of \""
							+ cu.getResource().getName() + "\", assuming \"" + resolvedType + "\".");
				}
				yield resolvedType;
			}
			case Util.C_RESOLVED -> type.substring(1, end);
			default -> {
				LOGGER.error("Unhandled JDT type prefix: " + prefix);
				throw new IllegalStateException("Unhandled return type \"" + type + "\" in " + cu.getPath());
			}
		};
	}

	private static Optional<ITypeParameter> findTypeParameter(final ITypeParameter[] typeParameters,
			final String type) {
		return Stream.of(typeParameters).filter(t -> t.getElementName().equals(type)).findAny();
	}

	/**
	 * Checks whether the type is a type parameter and returns the most general type
	 * that can be expected
	 *
	 * @param typeParameters The the relevant type parameter definitions
	 * @param type           The type to be resolved
	 * @return the resolved type signature
	 */
	private static String resolveTypeParameters(final ITypeParameter[] typeParameters, final String name) {
		final var result = findTypeParameter(typeParameters, name);
		if (result.isPresent()) {
			final var type = resolveTypeParameter(result.get());
			if (type != null) {
				return type;
			}
		}
		return name;
	}

	private static String resolveTypeParameter(final ITypeParameter param) {
		try {
			final var bounds = param.getBoundsSignatures();
			if (bounds.length > 0) {
				if (bounds.length > 1) {
					LOGGER.warn("Bounds of type parameter \"" + param.getElementName()
							+ "\" mights have been processed falsely, bounds are: "
							+ Stream.of(bounds).collect(Collectors.joining("\"", "\", \"", "\"")));
				}
				return bounds[0];
			}
			return "Qjava.lang.Object;";
		} catch (final JavaModelException e) {
			LOGGER.error(e);
			return null;
		}
	}

	private static String findType(final ICompilationUnit cu, final String name) {
		try {
			// Check if the type already has a fully qualified name
			if (name.indexOf(Util.C_DOT) > -1) {
				return name;
			}

			// Search inner types
			for (final var defined : cu.getAllTypes()) {
				if (defined.getElementName().equals(name)) {
					return defined.getFullyQualifiedName();
				}
			}

			// Search the imports for the type
			final var importedType = searchTypeInImports(cu, name);
			if (importedType != null) {
				return importedType;
			}

			// Search java.lang for the type
			final var javaType = cu.getJavaProject().findType("java.lang", name);
			if (javaType != null) {
				return javaType.getFullyQualifiedName();
			}

			// Search the own package
			final var type = findTypeOwnPackage(cu, name);
			if (type != null) {
				return type.getFullyQualifiedName();
			}

			final var qualifiedType = findQualifiedTypeName(cu, name);
			if (qualifiedType != null) {
				return qualifiedType;
			}
		} catch (final CoreException e) {
			throw new IllegalStateException(e);
		}

		return null;
	}

	/**
	 * Searches for the qualified name of a type based on its usages in a
	 * compilation unit
	 *
	 * @param cu   The compilation unit
	 * @param name The simple name of the type to be searched
	 * @return The qualified name or <code>null</code> if it could not be resolved
	 * @throws JavaModelException
	 */
	private static String findQualifiedTypeName(final ICompilationUnit cu, final String name)
			throws JavaModelException {
		for (final IType definedType : cu.getTypes()) {
			for (final IField field : definedType.getFields()) {
				final var fieldType = field.getTypeSignature();
				if (isQualifiedVersion(name, fieldType)) {
					return getFullyQualifiedName4JDT(cu, fieldType, field);
				}
			}
			for (final IMethod method : definedType.getMethods()) {
				final var qualifiedName = findQualifiedTypeName(method, name);
				if (qualifiedName != null) {
					return qualifiedName;
				}
			}
		}
		return null;
	}

	/**
	 * Searches for the qualified name of a type based on its usages in a method
	 *
	 * @param method The method
	 * @param name   The simple name of the type to be searched
	 * @return The qualified name or <code>null</code> if it could not be resolved
	 * @throws JavaModelException
	 */
	private static String findQualifiedTypeName(final IMethod method, final String name)
			throws JavaModelException {
		final var returnType = method.getReturnType();
		if (isQualifiedVersion(name, returnType)) {
			return getFullyQualifiedName4JDT(method.getCompilationUnit(), returnType, method);
		}
		for (final String parameterType : method.getParameterTypes()) {
			if (isQualifiedVersion(name, parameterType)) {
				return getFullyQualifiedName4JDT(method.getCompilationUnit(), parameterType, method);
			}
		}
		return null;
	}

	private static boolean isQualifiedVersion(final String nonQualified, final String potentiallyQualified) {
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
	 * @param cu   The compilation unit
	 * @param name The name of the name of the imported type
	 * @return
	 * @throws JavaModelException
	 */
	private static String searchTypeInImports(final ICompilationUnit cu, final String name) throws JavaModelException {
		if (cu != null) {
			for (final IImportDeclaration importDecl : cu.getImports()) {

				if (importDecl.isOnDemand()) {
					// Resolve import all
					final var importName = importDecl.getElementName();
					final var packageName = importName.substring(0, importName.lastIndexOf(Util.C_DOT));
					final var importedType = findType(cu, name, packageName);
					if (importedType != null) {
						return importedType.getFullyQualifiedName();
					}
				} else {
					final var importedType = searchImportedTypeForExplicitImport(cu, importDecl, name);
					if (importedType != null) {
						return importedType;
					}
				}
			}
		}
		return null;
	}

	private static String searchImportedTypeForExplicitImport(final ICompilationUnit cu,
			final IImportDeclaration importDecl, final String type) throws JavaModelException {
		var importName = importDecl.getElementName();
		final var simpleName = getSimpleName(importName);
		if (simpleName.equals(type)) {
			return importName;
		}

		// Check imported types
		String memberName = null;
		if (Flags.isStatic(importDecl.getFlags())) {
			final var index = importName.lastIndexOf(Util.C_DOT);
			memberName = importName.substring(index + 1);
			importName = importName.substring(0, index);
		}

		var importedType = searchImportedType(cu, importName, simpleName);
		if (importedType != null) {
			// Check if the member represents an inner type
			importedType = optionallyReplaceWithInnerType(importedType, memberName);
			if (importedType.getElementName().equals(type)) {
				return importedType.getFullyQualifiedName();
			}
		}
		return null;
	}

	private static IType searchImportedType(final ICompilationUnit cu, final String importName, final String simpleName)
			throws JavaModelException {
		// Search using JDT
		var importedType = cu.getJavaProject().findType(importName);
		if (importedType == null) {
			// Try manual search in packages
			final var packageName = importName.substring(0, importName.lastIndexOf(Util.C_DOT));
			importedType = findType(cu, simpleName, packageName);

		}
		return importedType;
	}

	private static IType optionallyReplaceWithInnerType(final IType type, final String memberName)
			throws JavaModelException {
		if (memberName != null) {
			for (final var inner : type.getTypes()) {
				if (inner.getElementName().equals(memberName)) {
					return inner;
				}
			}
		}
		return type;
	}

	private static IType findType(final ICompilationUnit cu, final String simpleName, final String packageName)
			throws JavaModelException {
		final var type = cu.getJavaProject().findType(packageName, simpleName);
		if (type != null) {
			return type;
		}
		final var packageFragment = getPackageFragment(cu.getJavaProject(), packageName);
		if (packageFragment != null) {
			return findTypeInPackage(simpleName, packageFragment);
		}
		return null;
	}

	/**
	 * Calculates the simple type name from the fully qualified import name
	 *
	 * @param importName Fully qualified name
	 * @return simple name of the imported type
	 */
	private static String getSimpleName(final String importName) {
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
	 * @return the type object
	 * @throws JavaModelException
	 */
	private static IType findTypeOwnPackage(final ICompilationUnit cu, final String name) throws JavaModelException {
		if (cu != null) {
			for (final IPackageDeclaration packageDeclaration : cu.getPackageDeclarations()) {
				final var packageName = packageDeclaration.getElementName();
				final var type = findType(cu, name, packageName);
				if (type != null) {
					return type;
				}
			}
		}
		return null;
	}

	private static String buildArray(final int arrays, final String type) {
		final var typeSignature = new StringBuilder(type);
		for (var i = 0; i < arrays; i++) {
			typeSignature.append("[]");
		}
		return typeSignature.toString();
	}

	private static IType findTypeInPackage(final String name, final IPackageFragment packageFragment)
			throws JavaModelException {
		for (final var cu : packageFragment.getCompilationUnits()) {
			for (final var type : cu.getTypes()) {
				if (type.getElementName().equals(name)) {
					return type;
				}
			}
		}
		for (final var cf : packageFragment.getOrdinaryClassFiles()) {
			final var type = cf.getType();
			if (type.getElementName().equals(name)) {
				return type;
			}
		}
		return null;
	}

	private static IPackageFragment getPackageFragment(final IJavaProject project, final String packageName)
			throws JavaModelException {
		for (final IPackageFragmentRoot root : project.getAllPackageFragmentRoots()) {
			for (final IJavaElement element : root.getChildren()) {
				if (element instanceof final IPackageFragment packageFragment
						&& packageFragment.getElementName().equals(packageName)) {
					return packageFragment;
				}
			}
		}
		return null;
	}
}
