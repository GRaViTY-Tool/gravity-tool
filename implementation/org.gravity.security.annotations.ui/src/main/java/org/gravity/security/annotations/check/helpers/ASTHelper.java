package org.gravity.security.annotations.check.helpers;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IImportDeclaration;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageDeclaration;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeParameter;
import org.eclipse.jdt.core.ITypeRoot;
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

	public static String getFullyQualifiedName4JDT(final ICompilationUnit cu, final String typeName) {
		return getFullyQualifiedName4JDT(cu, typeName, new ITypeParameter[0]);
	}

	public static String getFullyQualifiedName4JDT(final ICompilationUnit cu, final String typeName,
			final ITypeParameter[] typeParameters) {
		if (typeName.length() == 1 && typeName.charAt(0) == Util.C_VOID) {
			return "void";
		}

		var arrays = 0;
		while (typeName.charAt(arrays) == Util.C_ARRAY) {
			arrays++;
		}

		final var type = resolveTypeParameters(typeParameters, typeName.substring(arrays));

		final var result = switch (type) {
		case Signature.SIG_VOID -> void.class.toString();
		case Signature.SIG_BOOLEAN -> boolean.class.toString();
		case Signature.SIG_BYTE -> byte.class.toString();
		case Signature.SIG_CHAR -> char.class.toString();
		case Signature.SIG_DOUBLE -> double.class.toString();
		case Signature.SIG_FLOAT -> float.class.toString();
		case Signature.SIG_INT -> int.class.toString();
		case Signature.SIG_LONG -> long.class.toString();
		case Signature.SIG_SHORT -> short.class.toString();
		default -> fullyQualifiedNameForNonPrimitiveType(type, cu);
		};
		return buildArray(arrays, result);
	}

	private static String fullyQualifiedNameForNonPrimitiveType(final String type, final ICompilationUnit cu) {
		final var genericStart = type.indexOf(Util.C_GENERIC_START);
		final var end = genericStart == -1 ? type.indexOf(Util.C_NAME_END) : genericStart;
		final var prefix = type.charAt(0);
		return switch (prefix) {
		case Util.C_UNRESOLVED -> {
			var resolvedType = findType(cu, type.substring(1, end));
			if (resolvedType == null) {
				resolvedType = type.substring(1, type.indexOf(';'));
				LOGGER.warn("Could not resolve type \"" + type + "\" in JDT, assuming \"" + resolvedType + ".\"");
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

	/**
	 * Checks whether the type is a type parameter and returns the most general type
	 * that can be expected
	 *
	 * @param typeParameters The the relevant type parameter definitions
	 * @param type           The type to be resolved
	 * @return the resolved type signature
	 */
	private static String resolveTypeParameters(final ITypeParameter[] typeParameters, final String type) {
		if (type.charAt(0) == Util.C_TYPE_VARIABLE) {
			final var name = type.substring(1, type.lastIndexOf(';'));
			final var result = Stream.of(typeParameters).filter(t -> t.getElementName().equals(name)).findAny();
			if (result.isPresent()) {
				final var param = result.get();
				try {
					final var bounds = param.getBoundsSignatures();
					if (bounds.length > 0) {
						if (bounds.length > 1) {
							LOGGER.warn("Bounds of type parameter \"" + type
									+ "\" mights have been processed falsely, bounds are: "
									+ Stream.of(bounds).collect(Collectors.joining("\"", "\", \"", "\"")));
						}
						return bounds[0];
					}
					LOGGER.error("The bounds for the type parameter \"" + type
							+ "\" have the size 0. Defined type parameters are: " + Stream.of(typeParameters)
									.map(ITypeParameter::toString).collect(Collectors.joining("\"", "\", \"", "\"")));
				} catch (final JavaModelException e) {
					LOGGER.error(e);
				}
			}
			return "Qjava.lang.Object;";
		}
		return type;
	}

	private static String findType(final ICompilationUnit cu, final String name) {
		try {
			// Check if the type already has a fully qualified name
			if (name.indexOf(Util.C_DOT) > -1) {
				return name;
			}

			// Search the imports for the type
			final var importedType = searchTypeInImports(cu, name);
			if (importedType != null) {
				return importedType;
			}

			// Search java.lang for the type
			final var packageFragment = getPackageFragment(cu.getJavaProject(), "java.lang");
			if (packageFragment != null) {
				final var fullyQualifiedName = findTypeInPackage(name, packageFragment);
				if (fullyQualifiedName != null) {
					return fullyQualifiedName;
				}
			}

			// Search the own package
			final var type = findTypeOwnPackage(cu, name);
			if (type != null) {
				return type;
			}

			final var qualifiedType = findQualifiedTypeUsage(cu, name);
			if (qualifiedType != null) {
				return qualifiedType;
			}
		} catch (final CoreException e) {
			throw new IllegalStateException(e);
		}

		return null;
	}

	private static String findQualifiedTypeUsage(final ICompilationUnit cu, final String name)
			throws JavaModelException {
		for (final IType definedType : cu.getTypes()) {
			for (final IField field : definedType.getFields()) {
				final var fieldType = field.getTypeSignature();
				if (isQualifiedVersion(name, fieldType)) {
					return getFullyQualifiedName4JDT(cu, fieldType);
				}
			}
			for (final IMethod method : definedType.getMethods()) {
				final var returnType = method.getReturnType();
				if (isQualifiedVersion(name, returnType)) {
					return getFullyQualifiedName4JDT(cu, returnType);
				}
				for (final String parameterType : method.getParameterTypes()) {
					if (isQualifiedVersion(name, parameterType)) {
						return getFullyQualifiedName4JDT(cu, parameterType);
					}
				}
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
	 * @param cu
	 * @param name
	 * @return
	 * @throws JavaModelException
	 */
	private static String searchTypeInImports(final ICompilationUnit cu, final String name) throws JavaModelException {
		if (cu != null) {
			for (final IImportDeclaration imp : cu.getImports()) {
				final var importName = imp.getElementName();

				if (Util.C_STAR == importName.charAt(importName.length() - 1)) {
					// Resolve import all
					final var packageName = importName.substring(0, importName.lastIndexOf(Util.C_DOT));
					final var packageFragment = getPackageFragment(cu.getJavaProject(), packageName);
					if (packageFragment != null) {
						final var fullyQualifiedName = findTypeInPackage(name, packageFragment);
						if (fullyQualifiedName != null) {
							return fullyQualifiedName;
						}
					}

				} else {
					// Check imported types
					final var simpleName = getSimpleName(importName);
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
	 * @return
	 * @throws JavaModelException
	 */
	private static String findTypeOwnPackage(final ICompilationUnit cu, final String name) throws JavaModelException {
		if (cu != null) {
			for (final IPackageDeclaration packageDeclaration : cu.getPackageDeclarations()) {
				final var cuPackageFragment = getPackageFragment(cu.getJavaProject(),
						packageDeclaration.getElementName());
				if (cuPackageFragment != null) {
					final var ownName = findTypeInPackage(name, cuPackageFragment);
					if (ownName != null) {
						return ownName;
					}
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

	private static String findTypeInPackage(final String name, final IPackageFragment packageFragment)
			throws JavaModelException {
		for (final IJavaElement child : packageFragment.getChildren()) {
			final var primaryType = ((ITypeRoot) child).findPrimaryType();
			if (primaryType.getElementName().equals(name)) {
				return primaryType.getFullyQualifiedName();
			}
		}
		return null;
	}

	private static IPackageFragment getPackageFragment(final IJavaProject project, final String packageName)
			throws JavaModelException {
		for (final IPackageFragmentRoot root : project.getAllPackageFragmentRoots()) {
			for (final IJavaElement element : root.getChildren()) {
				if (element instanceof final IPackageFragment packageFragment
						&& (packageFragment.getElementName().equals(packageName))) {
					return packageFragment;

				}
			}
		}
		return null;
	}
}
