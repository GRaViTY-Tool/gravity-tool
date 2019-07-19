package org.gravity.eclipse.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Deque;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.ILocalVariable;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
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
import org.gravity.typegraph.basic.TParameterList;
import org.gravity.typegraph.basic.TypeGraph;

/** 
 * This helper class provides functionalities for mapping program models to Eclipse Java projects 
 * 
 * @author speldszus
 */
public class JavaASTUtil {
 
	/**
	 * Builds a mapping from type names to instances for a Java project
	 * 
	 * @param project The Java project
	 * @return The mapping
	 * @throws JavaModelException If there is an error in accessing contents from the project
	 */
	public static HashMap<String, IType> getTypesForProject(IJavaProject project) throws JavaModelException {
		HashMap<String, IType> types = new HashMap<>();

		for (IPackageFragmentRoot element : project.getPackageFragmentRoots()) {
			Deque<IJavaElement> children = new LinkedList<IJavaElement>();
			children.addAll(Arrays.asList(element.getChildren()));
			while (!children.isEmpty()) {
				IJavaElement packageFragment = children.pop();
				if (packageFragment.getElementType() == IJavaElement.COMPILATION_UNIT) {
					for (IType type : ((ICompilationUnit) packageFragment).getAllTypes()) {
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
	 * @param type The type containing the signature
	 * @return The method
	 * @throws JavaModelException If there is an exception in accessing content from the type
	 */
	public static IMethod getIMethod(TMethodSignature signature, IType type) throws JavaModelException {
		TParameterList tParamList = signature.getParamList();
		String tName = signature.getMethod().getTName();
		for (IMethod m : type.getMethods()) {
			if (m.getElementName().equals(tName)) {
				if (m.getNumberOfParameters() == tParamList.getEntries().size()) {
					boolean equal = true;
					TParameter tParam = tParamList.getFirst();
					for (ILocalVariable param : m.getParameters()) {
						if (!(equal = tParam.getType().getFullyQualifiedName()
								.endsWith(Signature.toString(param.getTypeSignature())))) {
							break;
						}
						tParam = tParam.getNext();
					}
					if (equal) {
						return m;
					}
				}
			}
		}
		return null;
	}

	/**
	 * Searches in the program model for a method
	 * 
	 * @param method The method
	 * @param pm The program model
	 * @return The method definition
	 */
	public static TMethodDefinition getTMethodDefinition(IMethod method, TypeGraph pm) {
		IType iType = method.getDeclaringType();
		TAbstractType tType = pm.getType(iType.getFullyQualifiedName());
		for (TMember tMember : tType.getDefines()) {
			if (tMember instanceof TMethodDefinition) {
				TMethodDefinition tMethodDefinition = (TMethodDefinition) tMember;
				if(equivalent(tMethodDefinition, method)) {
					return tMethodDefinition;
				}
			}

		}
		return null;
	}
	
	/**
	 * Searches for the TClass corresponding to a type declaration
	 * 
	 * @param type The type declaration
	 * @param pg The program model in which should be searched
	 * @return the tClass
	 */
	public static TClass getTClass(TypeDeclaration type, TypeGraph pg) {
		TClass tChild = null;

		ASTNode tmpASTNode2 = type.getParent();
		if (tmpASTNode2 instanceof CompilationUnit) {
			CompilationUnit childcu = (CompilationUnit) tmpASTNode2;

			PackageDeclaration childPackage = childcu.getPackage();

			String[] names = childPackage.getName().getFullyQualifiedName().split("\\."); //$NON-NLS-1$
			EList<TPackage> packages = pg.getPackages();
			TPackage next = null;
			for (String name : names) {
				for (TPackage p : packages) {
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

			for (TClass c : next.getClasses()) {
				if (c.getTName().equals(type.getName().toString())) {
					tChild = c;
					break;
				}
			}
		}
		return tChild;
	}

	/**
	 * Searches for the method definition in the program model corresponding to the method declarations signature
	 * 
	 * @param method The method declaration
	 * @param pm The program model
	 * @return The found definition or null
	 */
	public static TMethodDefinition getTMethodDefinition(MethodDeclaration method, TypeGraph pm) {
		TClass type = getTClass((TypeDeclaration) method.getParent(), pm);
		if(type == null) {
			return null;
		}
		TMethodSignature signature = getTMethodSignature(method, pm);
		if(signature == null) {
			return null;
		}
		return (TMethodDefinition) type.getTDefinition(signature);
	}
	
	/**
	 * Searches for the signature in the program model corresponding to the method declarations signature
	 * 
	 * @param method The method declaration
	 * @param pg The program model
	 * @return The found signature or null
	 */
	public static TMethodSignature getTMethodSignature(MethodDeclaration method, TypeGraph pg) {
		TMethod tMethod = null;
		for (TMethod m : pg.getMethods()) {
			if (m.getTName().equals(method.getName().toString())) {
				tMethod = m;
				break;
			}
		}

		if (tMethod == null) {
			return null;
		}

		for (TMethodSignature signature : tMethod.getSignatures()) {
			if (method.parameters().size() != signature.getParamList().getEntries().size()) {
				continue;
			}
			boolean success = hasSameSignature(method, signature);
			if (success) {
				return signature;
			}
		}

		return null;
	}

	/**
	 * Checks if the signature is equivalent to the method declarations signature
	 * 
	 * @param method A method declaration
	 * @param signature A method signature
	 * @return true, if the signatures are equal
	 */
	private static boolean hasSameSignature(MethodDeclaration method, TMethodSignature signature) {
		TParameter tParam = signature.getParamList().getFirst();
		for (Object p : method.parameters()) {
			if (p instanceof SingleVariableDeclaration) {
				SingleVariableDeclaration var = (SingleVariableDeclaration) p;
				Type vt = var.getType();
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
		TMethodSignature tMethodSignature = tMethod.getSignature();
		TMethod tMethodName = tMethodSignature.getMethod();

		String tName = tMethodName.getTName();
		if (iMethod.getElementName().equals(tName)) {

			TParameterList tParamList = tMethodSignature.getParamList();
			if (iMethod.getNumberOfParameters() == tParamList.getEntries().size()) {
				boolean equal = true;
				TParameter tParam = tParamList.getFirst();
				ILocalVariable[] parameters;
				try {
					parameters = iMethod.getParameters();
				} catch (JavaModelException e) {
					return false;
				}
				for (ILocalVariable param : parameters) {
					String iParamSignature = Signature.toString(param.getTypeSignature());
					iParamSignature = iParamSignature.replaceAll("<.*>|\\[\\w*\\]", "");
					if (!(equal = tParam.getType().getFullyQualifiedName().endsWith(iParamSignature))) {
						break;
					}
					tParam = tParam.getNext();
				}
				if (equal) {
					return true;
				}
			}
		}
		return false;
	}

}
