package org.gravity.hulk.help;

import java.util.LinkedList;
import java.util.List;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TPackage;

public final class HFullyqualifiedName {

	public static String getFullyqualifiedName(TClass tClass) {
		StringBuilder builder = new StringBuilder();
		List<String> packages = new LinkedList<>();
		TPackage tPackage = tClass.getPackage();
		while (tPackage != null) {
			packages.add(0, tPackage.getTName());
			tPackage = tPackage.getParent();
		}
		for (String name : packages) {
			builder.append(name);
			if (name.length() > 0 && !name.endsWith("$") && !name.endsWith("$1")) { //$NON-NLS-1$ //$NON-NLS-2$
				builder.append('.');
			}
		}
		builder.append(tClass.getTName());
		return builder.toString();
	}
}
