package org.gravity.arte.execution;

import org.eclipse.emf.common.util.EList;
import org.gravity.arte.testdsl.arteLanguage.Java_Class;
import org.gravity.arte.testdsl.arteLanguage.Java_Field;
import org.gravity.arte.testdsl.arteLanguage.Java_Method;

public class Compare {

	public static boolean compareJavaFields(EList<Java_Field> lhs, EList<Java_Field> rhs) {
		if (lhs.size() == rhs.size()) {
			boolean compare = true;
			for (int i = 0; i < lhs.size(); i++) {
				compare &= lhs.get(i).getField_name().compareTo(rhs.get(i).getField_name()) == 0;
				compare &= compareJavaClass(lhs.get(i).getType(), rhs.get(i).getType());
			}
			return compare;
		} else {
			return false;
		}
	}

	public static boolean compareJavaClasses(EList<Java_Class> lhs, EList<Java_Class> rhs) {
		if (lhs.size() == rhs.size()) {
			boolean compare = true;
			for (int i = 0; i < lhs.size(); i++) {
				compare &= compareJavaClass(lhs.get(i), rhs.get(i));
			}
			return compare;
		} else {
			return false;
		}
	}

	public static boolean compareJavaClass(Java_Class lhs, Java_Class rhs) {
		return lhs.getClass_name().compareTo(rhs.getClass_name()) == 0
				& lhs.getPackage().compareTo(rhs.getPackage()) == 0;
	}

	public static boolean compareJavaMethods(EList<Java_Method> lhs, EList<Java_Method> rhs) {
		if (lhs.size() == rhs.size()) {
			boolean compare = true;
			for (int i = 0; i < lhs.size(); i++) {
				compare &= compareJavaMethod(lhs.get(i), rhs.get(i));
			}
			return compare;
		} else {
			return false;
		}
	}

	public static boolean compareJavaMethod(Java_Method lhs, Java_Method rhs) {
		if (0 == lhs.getName().compareTo(rhs.getName())) {
			return compareJavaClasses(lhs.getParams(), rhs.getParams());
		} else {
			return false;
		}
	}

}
