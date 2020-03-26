package org.gravity.eclipse.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ICompilationUnit;
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
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ArrayType;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ImportDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TPackage;
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
	public static Map<String, IType> getTypesForProject(IJavaProject project) throws JavaModelException {
		final Map<String, IType> types = new ConcurrentHashMap<>();

		for (final IPackageFragmentRoot element : project.getPackageFragmentRoots()) {
			final Deque<IJavaElement> children = new LinkedList<>();
			children.addAll(Arrays.asList(element.getChildren()));
			while (!children.isEmpty()) {
				final IJavaElement packageFragment = children.pop();
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
	public static IMethod getIMethod(TMethodSignature signature, IType type) throws JavaModelException {
		final String tName = signature.getMethod().getTName();
		for (final IMethod m : type.getMethods()) {
			if (m.getElementName().equals(tName) && m.getNumberOfParameters() == signature.getParameters().size()) {
				boolean equal = true;
				TParameter tParam = signature.getFirstParameter();
				for (final ILocalVariable param : m.getParameters()) {
					equal = tParam.getType().getFullyQualifiedName()
							.endsWith(Signature.toString(param.getTypeSignature()));
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
	 * Searches in the program model for a method
	 *
	 * @param method The method
	 * @param pm     The program model
	 * @return The method definition
	 */
	public static TMethodDefinition getTMethodDefinition(IMethod method, TypeGraph pm) {
		final IType iType = method.getDeclaringType();
		final TAbstractType tType = pm.getType(iType.getFullyQualifiedName());
		for (final TMember tMember : tType.getDefines()) {
			if (tMember instanceof TMethodDefinition) {
				final TMethodDefinition tMethodDefinition = (TMethodDefinition) tMember;
				if (equivalent(tMethodDefinition, method)) {
					return tMethodDefinition;
				}
			}

		}
		return null;
	}

	/**
	 * A wrapper for
	 * {@link org.eclipse.jdt.core.IJavaProject# findType(String fullyQualifiedName)}
	 * using the fully qualified name of the TAbstractType as value
	 *
	 * @param type    The type which should be search
	 * @param project The Java project
	 * @return The according IType or null if not found
	 * @throws JavaModelException if this project does not exist or if an exception
	 *                            occurs while accessing its corresponding
	 *                            {@link org.eclipse.jdt.core.IJavaProject# findType(String fullyQualifiedName)}
	 */
	public static IType getIType(TAbstractType type, IJavaProject project) throws JavaModelException {
		return project.findType(type.getFullyQualifiedName());
	}

	/**
	 * Searches for the pm type corresponding to a type declaration
	 *
	 * @param type The type declaration
	 * @param pm   The program model in which should be searched
	 * @return the type from the pm
	 */
	public static TAbstractType getType(TypeDeclaration type, TypeGraph pm) {
		SimpleName name = type.getName();
		String fullyQualifiedName = name.getFullyQualifiedName();
		if (name.isQualifiedName()) {
			return pm.getType(fullyQualifiedName);
		}

		final ASTNode parent = type.getParent();
		if (parent instanceof CompilationUnit) {
			final CompilationUnit childcu = (CompilationUnit) parent;

			TPackage tPackage = pm.getPackage(childcu.getPackage().getName().getFullyQualifiedName());
			if (tPackage == null) {
				throw new IllegalStateException("The program model doesn't contain the expected package structure");
			}
			return tPackage.getOwnedTypes().parallelStream()
					.filter(tType -> fullyQualifiedName.equals(tType.getTName())).findAny().orElse(null);
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
	public static TAbstractType getType(Type type, TypeGraph pm) {
		if (type.isPrimitiveType()) {
			return pm.getType(type.toString());
		}
		String fullyQualifiedName = getName(type);
		if (fullyQualifiedName.indexOf('.') > 0) {
			return pm.getType(fullyQualifiedName);
		}
		ASTNode root = type.getRoot();
		if (root instanceof CompilationUnit) {
			CompilationUnit cu = (CompilationUnit) root;
			for (Object entry : cu.imports()) {
				ImportDeclaration imp = (ImportDeclaration) entry;
				String importedPackage = imp.getName().getFullyQualifiedName();

				if (imp.isOnDemand()) {
					TAbstractType tAbstractType = pm.getType(importedPackage + '.' + fullyQualifiedName);
					if (tAbstractType != null) {
						return tAbstractType;
					}
				} else {
					String name = importedPackage.substring(importedPackage.lastIndexOf('.') + 1);
					if (name.equals(fullyQualifiedName)) {
						return pm.getType(importedPackage);
					}
				}
			}
			TPackage cuPackage = pm.getPackage(cu.getPackage().getName().getFullyQualifiedName());
			if (cuPackage != null) {
				Optional<TAbstractType> result = cuPackage.getOwnedTypes().parallelStream()
						.filter(pmType -> pmType.getTName().equals(fullyQualifiedName)).findAny();
				if (result.isPresent()) {
					return result.get();
				}
			}

			LOGGER.error("Couldn't find SimpleType: " + fullyQualifiedName);
		} else {
			LOGGER.error("Root of a SimpleType \"" + fullyQualifiedName + "\"is not a CompilationUnit but: " + root);
		}
		return pm.getType(fullyQualifiedName);
	}

	/**
	 * Gets the name object for the given type
	 * 
	 * @param type A type
	 * @return The name object
	 */
	private static String getName(Type type) {
		if (type.isSimpleType()) {
			return ((SimpleType) type).getName().getFullyQualifiedName();
		} else if (type.isArrayType()) {
			return getName(((ArrayType) type).getElementType());

		} else if (type.isParameterizedType()) {
			return getName(((ParameterizedType) type).getType());
		} else if (type.isPrimitiveType()) {
			return ((PrimitiveType) type).toString();
		}
		LOGGER.error("Type is not covered: " + type);
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
	public static TMethodDefinition getTMethodDefinition(MethodDeclaration method, TypeGraph pm) {
		final TAbstractType type = getType((TypeDeclaration) method.getParent(), pm);
		if (type == null) {
			return null;
		}
		final TMethodSignature signature = getTMethodSignature(method, pm);
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
	public static TMethodSignature getTMethodSignature(MethodDeclaration method, TypeGraph pm) {
		String methodName = method.getName().toString();
		TMethod tMethod = pm.getMethod(methodName);
		if (tMethod == null) {
			return null;
		}

		for (final TMethodSignature signature : tMethod.getSignatures()) {
			Type returnType = method.getReturnType2();
			TAbstractType tExpectedReturnType = getType(returnType, pm);
			if (
			// Return type have to be the same type
			!signature.getReturnType().equals(tExpectedReturnType)
					// Both have to be either arrays or not arrays
					|| signature.isArray() != returnType.isArrayType()
					// The parameter lists have to have the same size
					|| method.parameters().size() != signature.getParameters().size()) {
				continue;
			}

			final boolean success = hasSameSignature(method, signature);
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
	public static int getLine(IJavaElement javaElement) throws CoreException {
		final IResource underlyingResource = javaElement.getUnderlyingResource();
		int line = 1;
		if ("java".equals(underlyingResource.getFileExtension())) {
			try (InputStream stream = ((IFile) underlyingResource).getContents()) {
				int ch;
				int count = ((ISourceReference) javaElement).getSourceRange().getOffset();
				while ((ch = stream.read()) != -1 && count-- > 0) {
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
	private static boolean hasSameSignature(MethodDeclaration method, TMethodSignature signature) {
		TParameter tParam = signature.getFirstParameter();
		for (final Object p : method.parameters()) {
			if (p instanceof SingleVariableDeclaration) {
				final SingleVariableDeclaration var = (SingleVariableDeclaration) p;
				final Type vt = var.getType();
				final String name = getName(vt);
				if (tParam.getType().getFullyQualifiedName().endsWith(name)
						&& vt.isArrayType() == tParam.isArray()) {
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
	private static boolean equivalent(TMethodDefinition tMethod, IMethod iMethod) {
		final TMethodSignature tMethodSignature = tMethod.getSignature();
		final TMethod tMethodName = tMethodSignature.getMethod();

		final String tName = tMethodName.getTName();
		if (iMethod.getElementName().equals(tName)
				&& iMethod.getNumberOfParameters() == tMethodSignature.getParameters().size()) {
			boolean equal = true;
			TParameter tParam = tMethodSignature.getFirstParameter();
			ILocalVariable[] parameters;
			try {
				parameters = iMethod.getParameters();
			} catch (final JavaModelException e) {
				return false;
			}
			for (final ILocalVariable param : parameters) {
				String iParamSignature = Signature.toString(param.getTypeSignature());
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

}
