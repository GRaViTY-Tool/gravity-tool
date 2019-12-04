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
	public static void linkClass(TypeGraph pg, TClass tClass) {
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
			List<TPackage> packages = match.getSubpackage();
			while (!packages.isEmpty()) {
				final List<TPackage> nextChild = next.getSubpackage();
				if (!nextChild.isEmpty()) {
					next = nextChild.get(0);
					boolean success = false;
					for (final TPackage p : packages) {
						if (p.getTName().compareTo(next.getTName()) == 0) {
							packages = p.getSubpackage();
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
			final EList<TPackage> nextChild = next.getSubpackage();
			if (!nextChild.isEmpty()) {
				match.getSubpackage().add(nextChild.get(0));
				setPG4Package(nextChild.get(0), pg);
			} else {
				match.getOwnedTypes().add(tClass);
				match.getClasses().add(tClass);
			}
		}

	}

	private static void setPG4Package(TPackage tPackage, TypeGraph tTypeGraph) {
		final Deque<TPackage> tPackages = new LinkedList<>();
		tPackages.add(tPackage);

		while (!tPackages.isEmpty()) {
			final TPackage p = tPackages.pop();
			p.setPg(tTypeGraph);
			p.setTypeGraph(tTypeGraph);
			tPackages.addAll(p.getSubpackage());
		}
	}

	/**
	 * Checks if the two packages are equivalent
	 *
	 * @param package1 The first package
	 * @param package2 The second package
	 * @return true, iff the packages are equivalent
	 */
	public static boolean equivalent(TPackage package1, TPackage package2) {//
		if (package1.equals(package2)) {
			return true;
		} else {
			//
			final String tName1 = package1.getTName();
			final String tName2 = package2.getTName();
			if (tName1.equals(tName2)) {
				//
				TPackage match = null;
				for (final TPackage child1 : package1.getSubpackage()) {
					if (!child1.equals(package1)) {
						match = child1;
					}
				}
				if (match != null) {
					final TPackage child1 = match;
					//
					final EList<TPackage> subPackages = package2.getSubpackage();
					if (!subPackages.isEmpty()) {
						return equivalent(child1, subPackages.get(0));
					} else {
						return false;
					}

				} else {
					for (final TPackage child2 : package2.getSubpackage()) {
						if (!child2.equals(package2)) {
							return false;
						}
					}
					return true;
				}

			} else {
				return false;
			}

		}
	}
}
