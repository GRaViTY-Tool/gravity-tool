/**
 */
package org.gravity.refactorings.impl;

import java.lang.Iterable;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TField;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.TypeGraph;
import java.util.Stack;


//TODO: Add to typegraph
public class Search {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static boolean equivalent(TPackage package2, TPackage package1) {//
		if (package1.equals(package2)) {
			return true;
		}
		else {
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
					EList<TPackage> subPackages = package2.getSubpackage();;
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

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static TPackage getBasePackage(TClass tClass) {

		TPackage tPackage = tClass.getPackage();
		if (tPackage != null) {
			return getBasePackage(tPackage);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static TPackage getBasePackage(TPackage tPackage) {

		TPackage parent = tPackage.getParent();
		if (parent != null && !parent.equals(tPackage)) {
			return getBasePackage(parent);
		} else {
			return tPackage;
		}

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static boolean isChild(TClass child, TClass parent) {

		if (!child.equals(parent) && parent.equals(child.getParentClass())) {
			return true;
		}
		for (TClass new_parent : parent.getChildClasses()) {
			if (!new_parent.equals(parent) && isChild(child, new_parent)) {
				return true;
			}
		}
		return false;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void linkClass(TypeGraph pg, TClass tClass) {
		TPackage next = getBasePackage(tClass.getPackage());
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

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static boolean hasField(TClass tclass, TField field) {// ForEach
		for (TFieldSignature fs : field.getSignatures()) {
			if (tclass.equals(fs.getType())) {
				return true;
			}

		}
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static List<TMember> getAllOutgoingAccesses(TSignature tSignature, TClass tClass) {

		if (tSignature == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[tSignature] = " + tSignature + ".");
		}
		List<TMember> returnList = new LinkedList<TMember>();
		//
		if (tSignature instanceof TFieldSignature) {
			TFieldSignature tFieldSignature = (TFieldSignature) tSignature;
			// ForEach
			for (Object[] result4_black : Search.pattern_Search_7_4_ActivityNode153_blackBFFB(tFieldSignature,
					tClass)) {
				// nothing TFieldDefinition tFieldDefinition = (TFieldDefinition)
				// result4_black[1];
				TAccess tAccess = (TAccess) result4_black[2];
				// ForEach
				for (Object[] result5_black : Search.pattern_Search_7_5_ActivityNode154_blackFBB(returnList,
						tAccess)) {
					TFieldDefinition accessedFieldDefinition = (TFieldDefinition) result5_black[0];
					returnList.add(accessedFieldDefinition);

				}
				// ForEach
				for (Object[] result6_black : Search.pattern_Search_7_6_ActivityNode155_blackBFB(tAccess,
						returnList)) {
					TMethodDefinition accessedMethodDefinition = (TMethodDefinition) result6_black[1];
					returnList.add(accessedMethodDefinition);
				}

			}

		} else if (tSignature instanceof TMethodSignature) {
			TMethodSignature tMethodSignature = (TMethodSignature) tSignature;
			// ForEach
			for (Object[] result8_black : Search.pattern_Search_7_8_ActivityNode164a_blackBFFB(tMethodSignature,
					tClass)) {
				// nothing TMethodDefinition tMethodDefinition = (TMethodDefinition)
				// result8_black[1];
				TAccess tAccess = (TAccess) result8_black[2];
				// ForEach
				for (Object[] result9_black : Search.pattern_Search_7_9_ActivityNode165_blackBFB(returnList,
						tAccess)) {
					TFieldDefinition accessedFieldDefinition = (TFieldDefinition) result9_black[1];
					returnList.add(accessedFieldDefinition);
				}
				// ForEach
				for (Object[] result10_black : Search.pattern_Search_7_10_ActivityNode166_blackBFB(tAccess,
						returnList)) {
					TMethodDefinition accessedMethodDefinition = (TMethodDefinition) result10_black[1];
					returnList.add(accessedMethodDefinition);
				}

			}

		} else {
		}
		return returnList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static TMember getDefinition(TClass tClass, TSignature signature) {

		if (signature == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[signature] = " + signature + ".");
		}

		//
		TFieldDefinition tFieldDefinition = getTFieldDefinition(signature, tClass);
		if (tFieldDefinition != null) {
			return tFieldDefinition;
		} else {
			//
			return getTMethodDefinition(signature, tClass);
		}

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static boolean hasTMember(TClass tClass, TMember tMember) {
		return tClass.equals(tMember.getDefinedBy());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static boolean hasParentTMember(TClass tClass, TMember tMember) {

		TClass parent = tClass.getParentClass();
		if (parent != null && !parent.equals(tClass)) {
			if (hasTMember(parent, tMember)) {
				return true;
			}
			return hasParentTMember(parent, tMember);
		}
		return false;

	}

	public static final Iterable<Object[]> pattern_Search_7_4_ActivityNode153_blackBFFB(TFieldSignature tFieldSignature,
			TClass tClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TFieldDefinition tFieldDefinition : tFieldSignature.getDefinitions()) {
			if (tClass.equals(tFieldDefinition.getDefinedBy())) {
				for (TAccess tAccess : tFieldDefinition.getTAccessing()) {
					_result.add(new Object[] { tFieldSignature, tFieldDefinition, tAccess, tClass });
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Search_7_5_ActivityNode154_blackFBB(List<TMember> returnList,
			TAccess tAccess) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		TMember tmpAccessedFieldDefinition = tAccess.getTTarget();
		if (tmpAccessedFieldDefinition instanceof TFieldDefinition) {
			TFieldDefinition accessedFieldDefinition = (TFieldDefinition) tmpAccessedFieldDefinition;
			_result.add(new Object[] { accessedFieldDefinition, returnList, tAccess });
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_Search_7_6_ActivityNode155_blackBFB(TAccess tAccess,
			List<TMember> returnList) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		TMember tmpAccessedMethodDefinition = tAccess.getTTarget();
		if (tmpAccessedMethodDefinition instanceof TMethodDefinition) {
			TMethodDefinition accessedMethodDefinition = (TMethodDefinition) tmpAccessedMethodDefinition;
			_result.add(new Object[] { tAccess, accessedMethodDefinition, returnList });
		}

		return _result;
	}

	public static final Object[] pattern_Search_7_7_ActivityNode156_blackBF(List<TSignature> listOfSignatures) {
		for (TSignature tmpTMethodSignature : listOfSignatures) {
			if (tmpTMethodSignature instanceof TMethodSignature) {
				TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
				return new Object[] { listOfSignatures, tMethodSignature };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Search_7_8_ActivityNode164a_blackBFFB(
			TMethodSignature tMethodSignature, TClass tClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TMethodDefinition tMethodDefinition : tMethodSignature.getDefinitions()) {
			if (tClass.equals(tMethodDefinition.getDefinedBy())) {
				for (TAccess tAccess : tMethodDefinition.getTAccessing()) {
					_result.add(new Object[] { tMethodSignature, tMethodDefinition, tAccess, tClass });
				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Search_7_9_ActivityNode165_blackBFB(List<TMember> returnList,
			TAccess tAccess) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		TMember tmpAccessedFieldDefinition = tAccess.getTTarget();
		if (tmpAccessedFieldDefinition instanceof TFieldDefinition) {
			TFieldDefinition accessedFieldDefinition = (TFieldDefinition) tmpAccessedFieldDefinition;
			_result.add(new Object[] { returnList, accessedFieldDefinition, tAccess });
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_Search_7_10_ActivityNode166_blackBFB(TAccess tAccess,
			List<TMember> returnList) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		TMember tmpAccessedMethodDefinition = tAccess.getTTarget();
		if (tmpAccessedMethodDefinition instanceof TMethodDefinition) {
			TMethodDefinition accessedMethodDefinition = (TMethodDefinition) tmpAccessedMethodDefinition;
			_result.add(new Object[] { tAccess, accessedMethodDefinition, returnList });
		}

		return _result;
	}

	public static final TFieldDefinition getTFieldDefinition(TSignature tSignature, TClass tClass) {
		if (tSignature instanceof TFieldSignature) {
			TFieldSignature tFieldSignature = (TFieldSignature) tSignature;
			if (tClass.getSignature().contains(tFieldSignature)) {
				for (TMember tmpTFieldDefinition : tClass.getDefines()) {
					if (tmpTFieldDefinition instanceof TFieldDefinition) {
						TFieldDefinition tFieldDefinition = (TFieldDefinition) tmpTFieldDefinition;
						if (tFieldSignature.getDefinitions().contains(tFieldDefinition)) {
							return tFieldDefinition;
						}
					}
				}
			}
		}
		return null;
	}

	public static final TMethodDefinition getTMethodDefinition(TSignature tmpTMethodSignature, TClass tClass) {
		if (tmpTMethodSignature instanceof TMethodSignature) {
			TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
			if (tClass.getSignature().contains(tMethodSignature)) {
				for (TMember tmpTMethodDefinition : tClass.getDefines()) {
					if (tmpTMethodDefinition instanceof TMethodDefinition) {
						TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
						if (tMethodSignature.getDefinitions().contains(tMethodDefinition)) {
							return tMethodDefinition;
						}
					}
				}
			}
		}
		return null;
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
}
