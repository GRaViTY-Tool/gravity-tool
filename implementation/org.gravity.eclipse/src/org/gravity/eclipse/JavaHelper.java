package org.gravity.eclipse;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Stack;

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
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TConstructorDefinition;
import org.gravity.typegraph.basic.TConstructorName;
import org.gravity.typegraph.basic.TConstructorSignature;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TParameter;
import org.gravity.typegraph.basic.TParameterList;
import org.gravity.typegraph.basic.TypeGraph;

public class JavaHelper {

	public static Hashtable<String, IType> getTypesForProject(IJavaProject project) throws JavaModelException {
		Hashtable<String, IType> types = new Hashtable<>();

		for (IPackageFragmentRoot element : project.getPackageFragmentRoots()) {
			Stack<IJavaElement> children = new Stack<IJavaElement>();
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

	public static IMethod getIMethod(TMethodSignature tMethod, IType src) throws JavaModelException {
		TParameterList tParamList = tMethod.getParamList();
		String tName = tMethod.getMethod().getTName();
		for (IMethod m : src.getMethods()) {
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

	public static TMethodDefinition getTMethodDefinition(IMethod iMethod, TypeGraph pg) {
		IType iType = iMethod.getDeclaringType();
		TAbstractType tType = pg.getType(iType.getFullyQualifiedName());
		for (TMember tMember : tType.getDefines()) {
			if (tMember instanceof TMethodDefinition) {
				TMethodDefinition tMethodDefinition = (TMethodDefinition) tMember;
				TMethodSignature tMethodSignature = tMethodDefinition.getSignature();
				TMethod tMethodName = tMethodSignature.getMethod();

				String tName = tMethodName.getTName();
				if (iMethod.getElementName().equals(tName)) {

					TParameterList tParamList = tMethodSignature.getParamList();
					if (iMethod.getNumberOfParameters() == tParamList.getEntries().size()) {
						boolean equal = true;
						TParameter tParam = tParamList.getFirst();
						try {
							for (ILocalVariable param : iMethod.getParameters()) {
								String iParamSignature = Signature.toString(param.getTypeSignature());
								iParamSignature = iParamSignature.replaceAll("<.*>|\\[\\w*\\]", "");
								if (!(equal = tParam.getType().getFullyQualifiedName().endsWith(iParamSignature))) {
									break;
								}
								tParam = tParam.getNext();
							}
						} catch (JavaModelException | IllegalArgumentException e) {
						}
						if (equal) {
							return tMethodDefinition;
						}
					}
				}
			}

		}
		return null;
	}

}
