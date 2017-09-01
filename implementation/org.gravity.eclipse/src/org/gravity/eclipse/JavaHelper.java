package org.gravity.eclipse;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Stack;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;

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

}
