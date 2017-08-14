package org.gravity.refactorings;

import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.gravity.arte.testdsl.arteLanguage.Java_Class;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TParameter;
import org.gravity.typegraph.basic.TParameterList;

public class Support {
	public static boolean compareParamList(EList<Java_Class> dsl_params, TParameterList pg_params) {
		if (pg_params.getEntries().size() != dsl_params.size()) {
			return false;
		}
		TParameter pg_param = pg_params.getFirst();
		for (int j = 0; j < dsl_params.size(); j++) {
			if (pg_param == null) {
				return false;
			}
			TAbstractType type = pg_param.getType();
			if (type != null) {
				if (!compareTAbstractType(type, dsl_params.get(j))) {
					return false;
				}
			} else {
				System.out.println("ERROR: Parameter of method in PG is null");
				return false;
			}
			pg_param = pg_param.getNext();
		}
		if (pg_param != null) {
			return false;
		}
		return true;
	}

	private static boolean compareTAbstractType(TAbstractType pg_p, Java_Class dsl_p) {
		if (pg_p == null) {
			return false;
		}
		String pg_p_trimmed = pg_p.getTName();
		if (pg_p_trimmed.endsWith(".java")) { //$NON-NLS-1$
			pg_p_trimmed = pg_p_trimmed.substring(0, pg_p_trimmed.length() - 5);
		}
		if (pg_p_trimmed.toLowerCase().endsWith(dsl_p.getClass_name().toLowerCase())) {
			String dsl_package_string = dsl_p.getPackage();
			String[] dsl_namespaces;
			if (dsl_package_string != null) {
				dsl_namespaces = dsl_package_string.split(Pattern.quote(".")); //$NON-NLS-1$
			} else {
				dsl_namespaces = new String[0];
			}
			TPackage pg_package = pg_p.getPackage();

			if (pg_package != null) {
				return compareNamespace(dsl_namespaces, pg_package);
			}
			String[] pg_namespaces = pg_p_trimmed.split("\\."); //$NON-NLS-1$
			if (pg_namespaces.length - 1 == dsl_namespaces.length) {
				boolean equal = true;
				for (int i = 0; i < dsl_namespaces.length; i++) {
					equal &= dsl_namespaces[i].compareTo(pg_namespaces[i]) == 0;
				}
				return equal;
			}
		}
		return false;
	}

	private static boolean compareNamespace(String[] dsl_namespaces, TPackage leaf_package) {
		int k = dsl_namespaces.length;
		while (leaf_package != null && k > 0) {
			String tName = leaf_package.getTName();
			String dslName = dsl_namespaces[--k];
			if (tName.compareTo(dslName) != 0) {
				return false;
			}
			leaf_package = leaf_package.getParent();
		}

		return (k == 0);
	}
}
