/**
 */
package org.gravity.refactorings.util;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * This class provides functionalities to add classes to an existing program
 * model
 *
 * @author speldszus
 *
 */
public class PGAdditionHelper {

	/**
	 * Adds a class and its package structure to a program model
	 *
	 * @param pg The program model
	 * @param tClass The new class
	 */
	public static void linkClass(final TypeGraph pg, final TClass tClass) {
		TPackage next = tClass.getBasePackage();
		TPackage match = null;
		for (final TPackage p : pg.getPackages()) {
			if (p.getTName().compareTo(next.getTName()) == 0) {
				match = p;
			}
		}
		if (match == null) {
			pg.getPackages().add(next);
			setPG4Package(next, pg);
		} else {
			List<TPackage> packages = match.getSubpackages();
			while (!packages.isEmpty()) {
				final List<TPackage> nextChild = next.getSubpackages();
				if (!nextChild.isEmpty()) {
					next = nextChild.get(0);
					boolean success = false;
					for (final TPackage p : packages) {
						if (p.getTName().compareTo(next.getTName()) == 0) {
							packages = p.getSubpackages();
							match = p;
							success = true;
							break;
						}
					}
					if (!success) {
						break;
					}
				} else {
					match.getOwnedTypes().add(tClass);
					match.getClasses().add(tClass);
					return;
				}
			}
			final EList<TPackage> nextChild = next.getSubpackages();
			if (!nextChild.isEmpty()) {
				match.getSubpackages().add(nextChild.get(0));
				setPG4Package(nextChild.get(0), pg);
			} else {
				match.getOwnedTypes().add(tClass);
				match.getClasses().add(tClass);
			}
		}

	}

	private static void setPG4Package(final TPackage tPackage, final TypeGraph tTypeGraph) {
		final Deque<TPackage> tPackages = new LinkedList<>();
		tPackages.add(tPackage);

		while (!tPackages.isEmpty()) {
			final TPackage p = tPackages.pop();
			p.setModel(tTypeGraph);
			tTypeGraph.getPackages().add(p);
			tPackages.addAll(p.getSubpackages());
		}
	}
}
