package org.gravity.eclipse.util;

import java.io.IOException;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.ILocalVariable;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.ISourceReference;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.eclipse.jdt.core.dom.AbstractTypeDeclaration;
import org.eclipse.jdt.core.dom.ArrayType;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.ImportDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TParameter;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * This helper class provides functionalities for mapping program models to
 * Eclipse Java projects
 *
 * @author speldszus
 */
public final class JavaASTUtil {

	private static final Logger LOGGER = Logger.getLogger(JavaASTUtil.class);

	private JavaASTUtil() {
		// This class shouldn't be instantiated
	}

	/**
	 * Builds a mapping from type names to instances for a Java project
	 *
	 * @param project The Java project
	 * @return The mapping
	 * @throws JavaModelException If there is an error in accessing contents from
	 *                            the project
	 */
	public static Map<String, IType> getTypesForProject(final IJavaProject project) throws JavaModelException {
		final Map<String, IType> types = new ConcurrentHashMap<>();

		for (final IPackageFragmentRoot element : project.getPackageFragmentRoots()) {
			final Deque<IJavaElement> children = new LinkedList<>(Arrays.asList(element.getChildren()));
			while (!children.isEmpty()) {
				final var packageFragment = children.pop();
				if (packageFragment.getElementType() == IJavaElement.COMPILATION_UNIT) {
					for (final IType type : ((ICompilationUnit) packageFragment).getAllTypes()) {
						types.put(type.getFullyQualifiedName(), type);
					}
				} else if (packageFragment.getElementType() == IJavaElement.PACKAGE_FRAGMENT) {
					children.addAll(Arrays.asList(((IPackageFragment) packageFragment).getChildren()));
				}
			}
		}
		return types;
	}

	/**
	 * Searches the method definition with the given signature
	 *
	 * @param signature The signature
	 * @param type      The type containing the signature
	 * @return The method
	 * @throws JavaModelException If there is an exception in accessing content from
	 *                            the type
	 */
	public static IMethod getIMethod(final TMethodSignature signature, final IType type) throws JavaModelException {
		final var tName = signature.getMethod().getTName();
		for (final IMethod m : type.getMethods()) {
			if (m.getElementName().equals(tName) && (m.getNumberOfParameters() == signature.getParameters().size())) {
				var equal = true;
				var tParam = signature.getFirstParameter();
				for (final ILocalVariable param : m.getParameters()) {
					equal = equals(tParam, param);
					if (!equal) {
						break;
					}
					tParam = tParam.getNext();
				}
				if (equal) {
					return m;
				}
			}
		}
		return null;
	}

	/**
	 * Checks if the types of the parameters are equal
	 *
	 * @param tParam A program model parameter
	 * @param iParam A JDT parameter
	 * @return
	 */
	private static boolean equals(final TParameter tParam, final ILocalVariable iParam) {
		var iParamSignature = Signature.toString(iParam.getTypeSignature());
		final var iArray = iParamSignature.endsWith("[]");
		if (iArray) {
			iParamSignature = iParamSignature.substring(0, iParamSignature.length() - 2);
		}
		return tParam.getType().getFullyQualifiedName().endsWith(iParamSignature) && iArray
				? ((tParam.getUpperBound() > 1) || (tParam.getUpperBound() == -1))
						: tParam.getUpperBound() == 1;
	}

	/**
	 * Searches in the program model for a method
	 *
	 * @param method The method
	 * @param pm     The program model
	 * @return The method definition
	 */
	public static TMethodDefinition getTMethodDefinition(final IMethod method, final TypeGraph pm) {
		final var iType = method.getDeclaringType();
		final var tType = pm.getType(iType.getFullyQualifiedName());
		for (final TMember tMember : tType.getDefines()) {
			if (tMember instanceof TMethodDefinition) {
				final var tMethodDefinition = (TMethodDefinition) tMember;
				if (equivalent(tMethodDefinition, method)) {
					return tMethodDefinition;
				}
			}

		}
		return null;
	}

	/**
	 * A wrapper for {@link org.eclipse.jdt.core.IJavaProject# findType(String
	 * fullyQualifiedName)} using the fully qualified name of the TAbstractType as
	 * value
	 *
	 * @param type    The type which should be search
	 * @param project The Java project
	 * @return The according IType or null if not found
	 * @throws JavaModelException if this project does not exist or if an exception
	 *                            occurs while accessing its corresponding
	 *                            {@link org.eclipse.jdt.core.IJavaProject#
	 *                            findType(String fullyQualifiedName)}
	 */
	public static IType getIType(final TAbstractType type, final IJavaProject project) throws JavaModelException {
		return project.findType(type.getFullyQualifiedName());
	}

	/**
	 * Searches for the pm type corresponding to a type declaration
	 *
	 * @param type The type declaration
	 * @param pm   The program model in which should be searched
	 * @return the type from the pm
	 */
	public static TAbstractType getType(final AbstractTypeDeclaration type, final TypeGraph pm) {
		final var name = type.getName();
		final var fullyQualifiedName = name.getFullyQualifiedName();
		if (name.isQualifiedName()) {
			return pm.getType(fullyQualifiedName);
		}

		final var parent = type.getParent();
		if (parent instanceof CompilationUnit) {
			final var childcu = (CompilationUnit) parent;

			final var expectedPackage = childcu.getPackage();
			if (expectedPackage == null) {
				return pm.getType(fullyQualifiedName);
			}
			final var tPackage = pm.getPackage(expectedPackage.getName().getFullyQualifiedName());
			if (tPackage == null) {
				throw new IllegalStateException("The program model doesn't contain the expected package structure");
			}
			return tPackage.getOwnedTypes().parallelStream()
					.filter(tType -> fullyQualifiedName.equals(tType.getTName())).findAny().orElse(null);
		} else if (parent instanceof TypeDeclaration) {
			final var tParent = getType((TypeDeclaration) parent, pm);
			for (final TAbstractType inner : tParent.getInnerTypes()) {
				if (inner.getTName().equals(name.getFullyQualifiedName())) {
					return inner;
				}
			}
		}
		return null;
	}

	/**
	 * Searches for the pm type corresponding to a type
	 *
	 * @param type A type
	 * @param pm   The program model in which should be searched
	 * @return the type from the pm
	 */
	public static TAbstractType getType(final Type type, final TypeGraph pm) {
		if (type.isPrimitiveType()) {
			return pm.getType(type.toString());
		}
		final var fullyQualifiedName = getName(type);
		if (fullyQualifiedName.indexOf('.') >= 0) {
			return pm.getType(fullyQualifiedName);
		}
		final var root = type.getRoot();
		if (root instanceof CompilationUnit) {
			final var cu = (CompilationUnit) root;

			// Search in imports
			final var importedType = searchTypeInImports(pm, cu, fullyQualifiedName);
			if (importedType != null) {
				return importedType;
			}

			// Search in same package as cu
			final var packageType = searchTypeInCUsPackage(pm, cu, fullyQualifiedName);
			if (packageType != null) {
				return packageType;
			}

			// Search for java default types
			final var standardType = searchTypeInJavaStandardPackages(pm, fullyQualifiedName);
			if (standardType != null) {
				return standardType;
			}

			final var nestedType = searchForNestedTypes(pm, cu, fullyQualifiedName);
			if (nestedType != null) {
				return nestedType;
			}
		} else {
			LOGGER.error("Root of a SimpleType \"" + fullyQualifiedName + "\"is not a CompilationUnit but: " + root);
		}
		return pm.getType(fullyQualifiedName);
	}

	/**
	 * Searches the type given by a fully qualified name in the compilation units
	 * nested types and returns the corresponding program model type
	 *
	 * @param pm                 The program model
	 * @param cu                 The compilation unit
	 * @param fullyQualifiedName The types fully qualified name
	 * @return the type from the program model or <code>null</code> if no type has
	 *         been found
	 */
	private static TAbstractType searchForNestedTypes(final TypeGraph pm, final CompilationUnit cu,
			final String fullyQualifiedName) {
		for (final Object outer : cu.types()) {
			if (outer instanceof TypeDeclaration) {
				for (final TypeDeclaration inner : ((TypeDeclaration) outer).getTypes()) {
					if (inner.getName().getFullyQualifiedName().equals(fullyQualifiedName)) {
						return pm.getType(cu.getPackage().getName().getFullyQualifiedName() + '.'
								+ ((TypeDeclaration) outer).getName().getFullyQualifiedName() + '$'
								+ fullyQualifiedName);
					}
				}
			}
		}
		return null;
	}

	/**
	 * Searches the type specified by fully qualified name in the Java standard
	 * packages
	 *
	 * @param pm                 The program model
	 * @param fullyQualifiedName The types fully qualified name
	 * @return the type from the program model or <code>null</code> if no type has
	 *         been found
	 */
	private static TAbstractType searchTypeInJavaStandardPackages(final TypeGraph pm, final String fullyQualifiedName) {
		for (final String packageName : new String[] { "java.lang", "java.util" }) {
			final var cuPackage = pm.getPackage(packageName);
			if (cuPackage != null) {
				final var result = cuPackage.getOwnedTypes().parallelStream()
						.filter(pmType -> pmType.getTName().equals(fullyQualifiedName)).findAny();
				if (result.isPresent()) {
					return result.get();
				}
			}
		}
		return null;
	}

	/**
	 * Searches the type given by a fully qualified name in the compilation units
	 * package and returns the corresponding program model type
	 *
	 * @param pm                 The program model
	 * @param cu                 The compilation unit
	 * @param fullyQualifiedName The types fully qualified name
	 * @return the type from the program model or <code>null</code> if no type has
	 *         been found
	 */
	private static TAbstractType searchTypeInCUsPackage(final TypeGraph pm, final CompilationUnit cu,
			final String fullyQualifiedName) {
		final var cuPackageDecl = cu.getPackage();
		if (cuPackageDecl != null) {
			final var cuPackage = pm.getPackage(cuPackageDecl.getName().getFullyQualifiedName());
			if (cuPackage != null) {
				final var result = cuPackage.getOwnedTypes().parallelStream()
						.filter(pmType -> pmType.getTName().equals(fullyQualifiedName)).findAny();
				if (result.isPresent()) {
					return result.get();
				}
			}
		}
		return null;
	}

	/**
	 * Searches the type given by a fully qualified name in the compilation units
	 * imports and returns the corresponding program model type
	 *
	 * @param pm                 The program model
	 * @param cu                 The compilation unit
	 * @param fullyQualifiedName The types fully qualified name
	 * @return the type from the program model or <code>null</code> if no type has
	 *         been found
	 */
	private static TAbstractType searchTypeInImports(final TypeGraph pm, final CompilationUnit cu,
			final String fullyQualifiedName) {
		for (final Object entry : cu.imports()) {
			final var imp = (ImportDeclaration) entry;
			final var importedPackage = imp.getName().getFullyQualifiedName();

			if (imp.isOnDemand()) {
				final var tAbstractType = pm.getType(importedPackage + '.' + fullyQualifiedName);
				if (tAbstractType != null) {
					return tAbstractType;
				}
			} else {
				final var name = importedPackage.substring(importedPackage.lastIndexOf('.') + 1);
				if (name.equals(fullyQualifiedName)) {
					return pm.getType(importedPackage);
				}
			}
		}
		return null;
	}

	/**
	 * Gets the name object for the given type
	 *
	 * @param type A type
	 * @return The name object
	 */
	private static String getName(final Type type) {
		if (type.isSimpleType()) {
			return ((SimpleType) type).getName().getFullyQualifiedName();
		} else if (type.isArrayType()) {
			return getName(((ArrayType) type).getElementType());

		} else if (type.isParameterizedType()) {
			return getName(((ParameterizedType) type).getType());
		} else if (type.isPrimitiveType()) {
			return ((PrimitiveType) type).toString();
		}
		throw new IllegalStateException("Type is not covered: " + type);
	}

	/**
	 * Searches for the field definition in the program model corresponding to the
	 * field declarations signature
	 *
	 * @param method The field declaration
	 * @param pm     The program model
	 * @return The found definition or null
	 */
	public static TFieldDefinition getTFieldDefinition(final FieldDeclaration field, final TypeGraph pm) {
		final var type = getType((AbstractTypeDeclaration) field.getParent(), pm);
		if (type == null) {
			return null;
		}
		final var signature = getTFieldSignature(field, pm);
		if (signature == null) {
			return null;
		}
		return (TFieldDefinition) type.getTDefinition(signature);
	}

	/**
	 * Searches for a signature in the program model corresponding to the field
	 * declaration. If multiple variables are declared in the field any of these
	 * present in the pm will be returned.
	 *
	 * @param field The field declaration
	 * @param pm    The program model
	 * @return The found signature or null
	 */
	public static TFieldSignature getTFieldSignature(final FieldDeclaration field, final TypeGraph pm) {
		final var type = getType(field.getType(), pm);
		if (type == null) {
			return null;
		}
		for (final Object fragment : field.fragments()) {
			final var fieldName = pm.getField(((VariableDeclarationFragment) fragment).getName().getIdentifier());
			if (fieldName != null) {
				for (final TFieldSignature signature : fieldName.getSignatures()) {
					if (type.equals(signature.getType())) {
						return signature;
					}
				}
			}
		}
		return null;
	}

	/**
	 * Searches for the method definition in the program model corresponding to the
	 * method declarations signature
	 *
	 * @param method The method declaration
	 * @param pm     The program model
	 * @return The found definition or null
	 */
	public static TMethodDefinition getTMethodDefinition(final MethodDeclaration method, final TypeGraph pm) {
		final var type = getType((AbstractTypeDeclaration) method.getParent(), pm);
		if (type == null) {
			return null;
		}
		final var signature = getTMethodSignature(method, pm);
		if (signature == null) {
			return null;
		}
		return (TMethodDefinition) type.getTDefinition(signature);
	}

	/**
	 * Searches for the signature in the program model corresponding to the method
	 * declarations signature
	 *
	 * @param method The method declaration
	 * @param pm     The program model
	 * @return The found signature or null
	 */
	public static TMethodSignature getTMethodSignature(final MethodDeclaration method, final TypeGraph pm) {
		final var methodName = method.getName().toString();
		final var tMethod = pm.getMethod(methodName);
		if (tMethod == null) {
			return null;
		}

		TAbstractType tExpectedReturnType;
		if (method.isConstructor()) {
			tExpectedReturnType = getType((TypeDeclaration) method.getParent(), pm);
		} else {
			tExpectedReturnType = getType(method.getReturnType2(), pm);
		}

		for (final TMethodSignature signature : tMethod.getSignatures()) {
			if (
					// Return type have to be the same type
					!signature.getReturnType().equals(tExpectedReturnType)
					// Both have to be either arrays or not arrays
					|| (!method.isConstructor() && ((signature.isArray() != method.getReturnType2().isArrayType())
							// The parameter lists have to have the same size
							|| (method.parameters().size() != signature.getParameters().size())))) {
				continue;
			}

			final var success = hasSameSignature(method, signature);
			if (success) {
				return signature;
			}
		}

		return null;
	}

	/**
	 * Get the source code line of the given element
	 *
	 * @param javaElement The element to look for
	 * @return The source code line
	 * @throws CoreException
	 */
	public static int getLine(final IJavaElement javaElement) throws CoreException {
		final var underlyingResource = javaElement.getUnderlyingResource();
		var line = 1;
		if ("java".equals(underlyingResource.getFileExtension())) {
			try (var stream = ((IFile) underlyingResource).getContents()) {
				int ch;
				var count = ((ISourceReference) javaElement).getSourceRange().getOffset();
				while (((ch = stream.read()) != -1) && (count-- > 0)) {
					if (ch == '\n') {
						line++;
					}
				}
			} catch (final IOException e) {
				LOGGER.log(Level.ERROR, e);
				return -1;
			}
		}
		return line;
	}

	/**
	 * Checks if the signature is equivalent to the method declarations signature
	 *
	 * @param method    A method declaration
	 * @param signature A method signature
	 * @return true, if the signatures are equal
	 */
	private static boolean hasSameSignature(final MethodDeclaration method, final TMethodSignature signature) {
		var tParam = signature.getFirstParameter();
		if (signature.getParameters().size() != method.parameters().size()) {
			return false;
		}
		for (final Object p : method.parameters()) {
			if (p instanceof SingleVariableDeclaration) {
				final var variableType = ((SingleVariableDeclaration) p).getType();
				final var name = getName(variableType);
				if (tParam.getType().getFullyQualifiedName().endsWith(name)
						&& (variableType.isArrayType() == tParam.isArray())) {
					tParam = tParam.getNext();
				} else {
					return false;
				}
			}
		}
		return true;

	}

	/**
	 * Checks if the two methods are equivalent
	 *
	 * @param tMethod A method from a program model
	 * @param iMethod A method from a Eclipse Java project
	 * @return true, if the methods are equivalent
	 */
	private static boolean equivalent(final TMethodDefinition tMethod, final IMethod iMethod) {
		final var tMethodSignature = tMethod.getSignature();
		final var tMethodName = tMethodSignature.getMethod();

		final var tName = tMethodName.getTName();
		if (iMethod.getElementName().equals(tName)
				&& (iMethod.getNumberOfParameters() == tMethodSignature.getParameters().size())) {
			var equal = true;
			var tParam = tMethodSignature.getFirstParameter();
			ILocalVariable[] parameters;
			try {
				parameters = iMethod.getParameters();
			} catch (final JavaModelException e) {
				return false;
			}
			for (final ILocalVariable param : parameters) {
				var iParamSignature = Signature.toString(param.getTypeSignature());
				iParamSignature = iParamSignature.replaceAll("<.*>|\\[\\w*\\]", "");
				equal = tParam.getType().getFullyQualifiedName().endsWith(iParamSignature);
				if (!equal) {
					break;
				}
				tParam = tParam.getNext();
			}
			if (equal) {
				return true;
			}
		}
		return false;
	}

	public static IField getIField(final TFieldSignature signature, final IType type) throws JavaModelException {
		final var iField = type.getField(signature.getField().getTName());
		iField.getTypeSignature();
		return iField;
	}

}
