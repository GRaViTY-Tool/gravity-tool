package org.gravity.hulk.detection.helpers;

import org.apache.log4j.Logger;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.impl.TMethodDefinitionImpl;

public class GetterSetterHelper {

	private static final Logger LOGGER = Logger.getLogger(GetterSetterHelper.class);

	private GetterSetterHelper() {
		throw new IllegalStateException("Utility class");
	}

	public static double countMethodsStartingWithName(final TClass tClass, final String name) {
		if ((tClass == null) || tClass.isTLib()) {
			return 0;
		}

		var i = 0;
		for (final TMember member : tClass.getDefines()) {
			if (member instanceof final TMethodDefinitionImpl definition) {
				final var sig = definition.getSignature();
				if (sig == null) {
					LOGGER.warn("Method within Class " + tClass.getTName() + " does not have a signature");
					continue;
				}
				final var method = sig.getMethod();
				if (method == null) {
					LOGGER.warn(
							"MethodSignature of a Method in Class " + tClass.getTName() + " does not have a TMethod");
					continue;
				}
				if (method.getTName().toLowerCase().startsWith(name)) {
					i++;
				}
			}
		}
		for (final TClass parent : tClass.getParentClasses()) {
			i += countMethodsStartingWithName(parent, name);
		}

		return i;
	}

}
