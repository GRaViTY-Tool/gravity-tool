package org.gravity.eclipse.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
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
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.PackageDeclaration;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
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
public class JavaASTUtil {

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
		final Map<String, IType> types = new HashMap<>();

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
	 * Searches for the TClass corresponding to a type declaration
	 *
	 * @param type The type declaration
	 * @param pg   The program model in which should be searched
	 * @return the tClass
	 */
	public static TClass getTClass(TypeDeclaration type, TypeGraph pg) {
		TClass tChild = null;

		final ASTNode tmpASTNode2 = type.getParent();
		if (tmpASTNode2 instanceof CompilationUnit) {
			final CompilationUnit childcu = (CompilationUnit) tmpASTNode2;

			final PackageDeclaration childPackage = childcu.getPackage();

			final String[] names = childPackage.getName().getFullyQualifiedName().split("\\."); //$NON-NLS-1$
			EList<TPackage> packages = pg.getPackages();
			TPackage next = null;
			for (final String name : names) {
				for (final TPackage p : packages) {
					if (p.getTName().equals(name)) {
						next = p;
						break;
					}
				}
				if (next == null) {
					break;
				} else {
					packages = next.getSubpackage();
				}
			}
			if (next == null) {
				throw new IllegalStateException("The program model doesn't contain the expected package structure");
			}

			for (final TClass c : next.getClasses()) {
				if (c.getTName().equals(type.getName().toString())) {
					tChild = c;
					break;
				}
			}
		}
		return tChild;
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
		final TClass type = getTClass((TypeDeclaration) method.getParent(), pm);
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
	 * @param pg     The program model
	 * @return The found signature or null
	 */
	public static TMethodSignature getTMethodSignature(MethodDeclaration method, TypeGraph pg) {
		TMethod tMethod = null;
		for (final TMethod m : pg.getMethods()) {
			if (m.getTName().equals(method.getName().toString())) {
				tMethod = m;
				break;
			}
		}

		if (tMethod == null) {
			return null;
		}

		for (final TMethodSignature signature : tMethod.getSignatures()) {
			if (method.parameters().size() != signature.getParameters().size()) {
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
		if (underlyingResource.getFileExtension().equals("java")) {
			try (InputStream stream = ((IFile) underlyingResource).getContents()) {
				char ch;
				int count = ((ISourceReference) javaElement).getSourceRange().getOffset();
				while ((ch = (char) stream.read()) != -1 && count-- > 0) {
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
				if (vt.toString().equals(tParam.getType().getTName())) {
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
