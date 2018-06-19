/**
 */
package org.gravity.refactorings.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.refactorings.configuration.TRefactoringID;
import org.gravity.refactorings.configuration.impl.PullUpMethodConfiguration;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Pull Up
 * Method</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Pull_Up_MethodImpl extends RefactoringImpl {

	@Override
	public boolean isApplicable(RefactoringConfiguration configuration) {
		if (getRefactoringID() == configuration.getRefactoringID()) {
			PullUpMethodConfiguration esc = (PullUpMethodConfiguration) configuration;
			return isApplicable(esc.getSignature(), esc.getTargetClass());
		}
		return false;
	}

	@Override
	public Collection<TClass> perform(RefactoringConfiguration configuration) {
		if (getRefactoringID() == configuration.getRefactoringID()) {
			PullUpMethodConfiguration esc = (PullUpMethodConfiguration) configuration;
			return perform(esc.getSignature(), esc.getTargetClass());
		}
		return Collections.emptyList();
	}

	public Pull_Up_MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public List<TClass> perform(TMethodSignature method, TClass parent) {

		TypeGraph pg = getPg();
		List<TClass> container = new LinkedList<TClass>();

		//
		TMethodDefinition tMethodDefinition = Pull_Up_MethodImpl.selectRandomDefinitionOfChild(parent, method);
		if (tMethodDefinition != null) {
			TClass tmpChild = (TClass) tMethodDefinition.getDefinedBy();
			tmpChild.getSignature().remove(method);

			tMethodDefinition.setDefinedBy(parent);
			parent.getSignature().add(method);
			container.add(tmpChild);

			// ForEach
			for (TMethodDefinition childsDefinition : method.getDefinitions()) {
				TAbstractType tmpTChild = childsDefinition.getDefinedBy();
				if (tmpTChild instanceof TClass) {
					TClass tChild = (TClass) tmpTChild;
					if (!parent.equals(tChild) && parent.equals(tChild.getParentClass())
							&& tChild.getSignature().contains(method)) {

						container.add(tChild);

						// ForEach
						for (TClass tClass : pg.getClasses()) {
							for (TAccess tOldAccess : childsDefinition.getAccessedBy()) {
								TMember accessing = tOldAccess.getTSource();
								if (accessing != null && !accessing.equals(childsDefinition)
										&& tClass.equals(accessing.getDefinedBy())) {

									if (childsDefinition.equals(tMethodDefinition)
											|| !childsDefinition.getAccessedBy().contains(tOldAccess)) {
										throw new RuntimeException("Pattern matching failed." + " Variables: "
												+ "[tMethodDefinition] = " + tMethodDefinition + ", "
												+ "[childsDefinition] = " + childsDefinition + ", " + "[tOldAccess] = "
												+ tOldAccess + ".");
									}

									childsDefinition.getAccessedBy().remove(tOldAccess);
									tMethodDefinition.getAccessedBy().add(tOldAccess);

								}
							}
						}
						// ForEach
						for (TAccess outgoing : childsDefinition.getTAccessing()) {
							TMember target = outgoing.getTTarget();
							if (target != null && !childsDefinition.equals(target)) {
								childsDefinition.getTAccessing().remove(outgoing);
								target.getAccessedBy().remove(outgoing);

								EcoreUtil.delete(outgoing);
								outgoing = null;

							}
						}

						TAbstractType retType = childsDefinition.getReturnType();
						if (retType == null) {
							throw new RuntimeException("Pattern matching failed." + " Variables: "
									+ "[childsDefinition] = " + childsDefinition + ".");
						}
						childsDefinition.setReturnType(null);

						if (tChild.getSignature().contains(method) || tChild.equals(childsDefinition.getDefinedBy())
								|| method.getDefinitions().contains(childsDefinition)) {
							tChild.getSignature().remove(method);
							childsDefinition.setDefinedBy(null);
							method.getDefinitions().remove(childsDefinition);

							EcoreUtil.delete(childsDefinition);
							childsDefinition = null;
						} else {
							throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tChild] = "
									+ tChild + ", " + "[method] = " + method + ", " + "[childsDefinition] = "
									+ childsDefinition + ".");
						}

					}
				}
			}
			return container;
		} else {
			return container;
		}

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isApplicable(TMethodSignature tMethodSignatureToPullUp, TClass tParentClass) {
		TypeGraph pg = getPg();

		// Parent doesn't implement the signature yet
		if (!tParentClass.getSignature().contains(tMethodSignatureToPullUp)) {

			List<TMethodDefinition> tDefinitions = new LinkedList<>();
			// ForEach
			for (TClass tChild : tParentClass.getChildClasses()) {
				if (tParentClass.equals(tChild)) {
					return false;
				}
				if (tChild.getSignature().contains(tMethodSignatureToPullUp)) {
					TMethodDefinition tMethodDefinition = null;
					for (TMethodDefinition potentialDefinition : tMethodSignatureToPullUp.getDefinitions()) {
						if (tChild.equals(potentialDefinition.getDefinedBy())) {
							tMethodDefinition = potentialDefinition;
						}
					}
					if (tMethodDefinition == null) {
						return false;
					} else {
						tDefinitions.add(tMethodDefinition);
					}
				} else {
					return false;
				}

			}
			// ForEach
			for (TClass tChild : tParentClass.getChildClasses()) {
				if (tChild.isTLib()) {
					return false;
				}

			}

			List<TMember> accessedMembers = new LinkedList<>();
			// ForEach
			for (TMethodDefinition tMethodDefinition : tDefinitions) {
				TAbstractType tmpActiveClass = tMethodDefinition.getDefinedBy();
				if (tmpActiveClass instanceof TClass) {
					TClass activeClass = (TClass) tmpActiveClass;
					if (!activeClass.equals(tParentClass) && tParentClass.getChildClasses().contains(activeClass)) {

						// ForEach
						for (TClass definingClass : pg.getClasses()) {
							for (TAccess tAccess : tMethodDefinition.getTAccessing()) {
								TMember accessed = tAccess.getTTarget();
								if (accessed != null && !accessed.equals(tMethodDefinition)
										&& definingClass.equals(accessed.getDefinedBy())) {
									accessedMembers.add(accessed);
									//
									if (Search.isChild(definingClass, tParentClass)
											&& !Search.isChild(definingClass, activeClass)) {
										return false;
									}
								}
							}
						}
					}
				}
			}
			return true;
		} else {
			return false;
		}

	}

	private static final TMethodDefinition selectRandomDefinitionOfChild(TClass parent, TMethodSignature method) {
		for (TClass tmpChild : parent.getChildClasses()) {
			if (!parent.equals(tmpChild) && tmpChild.getSignature().contains(method)) {
				for (TMethodDefinition tMethodDefinition : method.getDefinitions()) {
					if (tmpChild.equals(tMethodDefinition.getDefinedBy())) {
						return tMethodDefinition;
					}
				}
			}
		}
		return null;
	}

	@Override
	public TRefactoringID getRefactoringID() {
		return TRefactoringID.TPullUpMethod;
	}
} // Pull_Up_MethodImpl
