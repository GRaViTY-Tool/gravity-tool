/**
 */
package org.gravity.refactorings.impl;

import org.eclipse.emf.common.util.EList;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;
import java.util.Stack;

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
		for (TPackage p : pg.getPackages()) {
			if (p.getTName().compareTo(next.getTName()) == 0) {
				match = p;
			}
		}
		if (match == null) {
			pg.getPackages().add(next);
			setPG4Package(next, pg);
		} else {
			EList<TPackage> packages = match.getSubpackage();
			while (packages.size() > 0) {
				EList<TPackage> next_child = next.getSubpackage();
				if (next_child.size() > 0) {
					next = next_child.get(0);
					boolean success = false;
					for (TPackage p : packages) {
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
			EList<TPackage> next_child = next.getSubpackage();
			if (next_child.size() > 0) {
				match.getSubpackage().add(next_child.get(0));
				setPG4Package(next_child.get(0), pg);
			} else {
				match.getOwnedTypes().add(tClass);
				match.getClasses().add(tClass);
			}
			return;
		}

	}

	private static void setPG4Package(TPackage tPackage, TypeGraph tTypeGraph) {
		Stack<TPackage> tPackages = new Stack<TPackage>();
		tPackages.add(tPackage);

		while (!tPackages.isEmpty()) {
			TPackage p = tPackages.pop();
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
	static boolean equivalent(TPackage package1, TPackage package2) {//
		if (package1.equals(package2)) {
			return true;
		} else {
			//
			String tName1 = package1.getTName();
			String tName2 = package2.getTName();
			if (tName1.equals(tName2)) {
				//
				TPackage result3_black = null;
				for (TPackage child1 : package1.getSubpackage()) {
					if (!child1.equals(package1)) {
						result3_black = child1;
					}
				}
				if (result3_black != null) {
					TPackage child1 = result3_black;
					//
					EList<TPackage> subPackages = package2.getSubpackage();
					;
					if (subPackages.size() > 0) {
						return equivalent(child1, subPackages.get(0));
					} else {
						return false;
					}

				} else {
					for (TPackage child2 : package2.getSubpackage()) {
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
