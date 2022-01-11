/**
 */
package org.gravity.typegraph.basic.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TInterface;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.TSyntethicMethod;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>TClass</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.impl.TClassImpl#getParentClasses <em>Parent Classes</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TClassImpl#getChildClasses <em>Child Classes</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.impl.TClassImpl#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TClassImpl extends TAbstractTypeImpl implements TClass {
	/**
	 * The cached value of the '{@link #getParentClasses() <em>Parent Classes</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getParentClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<TClass> parentClasses;

	/**
	 * The cached value of the '{@link #getChildClasses() <em>Child Classes</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getChildClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<TClass> childClasses;

	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected EList<TInterface> implements_;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicPackage.Literals.TCLASS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TClass> getParentClasses() {
		if (parentClasses == null) {
			parentClasses = new EObjectWithInverseResolvingEList.ManyInverse<TClass>(TClass.class, this, BasicPackage.TCLASS__PARENT_CLASSES, BasicPackage.TCLASS__CHILD_CLASSES);
		}
		return parentClasses;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TClass> getChildClasses() {
		if (childClasses == null) {
			childClasses = new EObjectWithInverseResolvingEList.ManyInverse<TClass>(TClass.class, this, BasicPackage.TCLASS__CHILD_CLASSES, BasicPackage.TCLASS__PARENT_CLASSES);
		}
		return childClasses;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TInterface> getImplements() {
		if (implements_ == null) {
			implements_ = new EObjectWithInverseResolvingEList.ManyInverse<TInterface>(TInterface.class, this, BasicPackage.TCLASS__IMPLEMENTS, BasicPackage.TINTERFACE__IMPLEMENTED_BY);
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<TMethodDefinition> getDeclaredTMethodDefinitions() {
		// [user code injected with eMoflon]
		final EList<TMethodDefinition> tMethodDefinitions = new BasicEList<>();
		for (final TMember member : getDefines()) {
			if (member instanceof TMethodDefinition) {
				tMethodDefinitions.add((TMethodDefinition) member);
			}
		}
		return tMethodDefinitions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<TMember> getAllTMembers() {
		// [user code injected with eMoflon]

		final EList<TMember> allMembers = new BasicEList<>();
		final Deque<TClass> stack = new LinkedList<>();
		stack.add(this);
		while (!stack.isEmpty()) {
			final TClass current = stack.pop();
			for (final TMember member : current.getDefines()) {
				EList<?> redefinedBy;
				if (member instanceof TMethodDefinition) {
					final TMethodDefinition method = (TMethodDefinition) member;
					redefinedBy = method.getOverriddenBy();
				} else if (member instanceof TFieldDefinition) {
					final TFieldDefinition field = (TFieldDefinition) member;
					redefinedBy = field.getHiddenBy();
				} else if (member instanceof TSyntethicMethod) {
					// Ignore synthetic methods
					continue;
				} else {
					throw new RuntimeException("Unknown TMember subtype.");
				}
				boolean contained = false;
				for (final Object o : redefinedBy) {
					contained |= allMembers.contains(o);
				}
				if (!contained) {
					allMembers.add(member);
				}
			}
			stack.addAll(current.getParentClasses());
		}
		return allMembers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<TClass> getAllChildren() {
		// [user code injected with eMoflon]
		final EList<TClass> children = new BasicEList<>();
		for (final TClass child : getChildClasses()) {
			children.add(child);
			children.addAll(child.getChildClasses());
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public boolean isSuperTypeOf(final TAbstractType tType) {
		if (equals(tType)) {
			return true;
		}
		final Set<TAbstractType> seen = new HashSet<>();
		if (tType instanceof TClass) {
			final Deque<TClass> parents = new LinkedList<>(((TClass) tType).getParentClasses());
			while (!parents.isEmpty()) {
				final TClass parent = parents.pop();
				seen.add(parent);
				if (equals(parent)) {
					return true;
				}
				for (final TClass next : parent.getParentClasses()) {
					if (!seen.contains(next)) {
						parents.add(next);
					}
				}
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public EList<TMember> getAllOutgoingAccesses(final TSignature signature) {
		// [user code injected with eMoflon]

		EList<? extends TMember> definitions = null;
		if (signature instanceof TFieldSignature) {
			final TFieldSignature tFieldSignature = (TFieldSignature) signature;
			definitions = tFieldSignature.getDefinitions();
		} else if (signature instanceof TMethodSignature) {
			final TMethodSignature tMethodSignature = (TMethodSignature) signature;
			definitions = tMethodSignature.getDefinitions();
		}

		final EList<TMember> returnList = new BasicEList<>();
		for (final TMember tDefinition : definitions) {
			if (equals(tDefinition.getDefinedBy())) {
				for (final TAccess tAccess : tDefinition.getAccessing()) {
					returnList.add(tAccess.getTarget());
				}
			}

		}
		return returnList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public boolean hasAParentThisTMember(final TMember member) {
		// [user code injected with eMoflon]
		final Deque<TClass> stack = new LinkedList<>(getParentClasses());
		while (!stack.isEmpty()) {
			final TClass parent = stack.pop();
			if ((parent != null) && !parent.equals(this)) {
				if (parent.getDefines().contains(member)) {
					return true;
				}
				stack.addAll(parent.getParentClasses());
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicPackage.TCLASS__PARENT_CLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentClasses()).basicAdd(otherEnd, msgs);
			case BasicPackage.TCLASS__CHILD_CLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildClasses()).basicAdd(otherEnd, msgs);
			case BasicPackage.TCLASS__IMPLEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImplements()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicPackage.TCLASS__PARENT_CLASSES:
				return ((InternalEList<?>)getParentClasses()).basicRemove(otherEnd, msgs);
			case BasicPackage.TCLASS__CHILD_CLASSES:
				return ((InternalEList<?>)getChildClasses()).basicRemove(otherEnd, msgs);
			case BasicPackage.TCLASS__IMPLEMENTS:
				return ((InternalEList<?>)getImplements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicPackage.TCLASS__PARENT_CLASSES:
				return getParentClasses();
			case BasicPackage.TCLASS__CHILD_CLASSES:
				return getChildClasses();
			case BasicPackage.TCLASS__IMPLEMENTS:
				return getImplements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BasicPackage.TCLASS__PARENT_CLASSES:
				getParentClasses().clear();
				getParentClasses().addAll((Collection<? extends TClass>)newValue);
				return;
			case BasicPackage.TCLASS__CHILD_CLASSES:
				getChildClasses().clear();
				getChildClasses().addAll((Collection<? extends TClass>)newValue);
				return;
			case BasicPackage.TCLASS__IMPLEMENTS:
				getImplements().clear();
				getImplements().addAll((Collection<? extends TInterface>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BasicPackage.TCLASS__PARENT_CLASSES:
				getParentClasses().clear();
				return;
			case BasicPackage.TCLASS__CHILD_CLASSES:
				getChildClasses().clear();
				return;
			case BasicPackage.TCLASS__IMPLEMENTS:
				getImplements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BasicPackage.TCLASS__PARENT_CLASSES:
				return parentClasses != null && !parentClasses.isEmpty();
			case BasicPackage.TCLASS__CHILD_CLASSES:
				return childClasses != null && !childClasses.isEmpty();
			case BasicPackage.TCLASS__IMPLEMENTS:
				return implements_ != null && !implements_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BasicPackage.TCLASS___GET_DECLARED_TMETHOD_DEFINITIONS:
				return getDeclaredTMethodDefinitions();
			case BasicPackage.TCLASS___GET_ALL_TMEMBERS:
				return getAllTMembers();
			case BasicPackage.TCLASS___GET_ALL_CHILDREN:
				return getAllChildren();
			case BasicPackage.TCLASS___GET_ALL_OUTGOING_ACCESSES__TSIGNATURE:
				return getAllOutgoingAccesses((TSignature)arguments.get(0));
			case BasicPackage.TCLASS___HAS_APARENT_THIS_TMEMBER__TMEMBER:
				return hasAParentThisTMember((TMember)arguments.get(0));
			case BasicPackage.TCLASS___TO_STRING:
				return toString();
			case BasicPackage.TCLASS___GET_PARENTS:
				return getParents();
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	@Override
	public String toString() {
		final String string = super.toString();
		return string.substring(0, string.length() - 1).concat(", name: ").concat(this.tName).concat(")");
	}

	@Override
	public EList<TClass> getParents() {
		final EList<TClass> parents = new BasicEList<>();
		final Deque<TClass> stack = new LinkedList<>(getParentClasses());
		while (!stack.isEmpty()) {
			final TClass parent = stack.pop();
			parents.add(parent);
			stack.addAll(parent.getParentClasses());
		}
		return parents;
	}

	@Override
	public boolean hasCommonSuperType(final TAbstractType tAbstractType) {
		if (!(tAbstractType instanceof TClassImpl)) {
			return false;
		}
		final TClassImpl tClass = (TClassImpl) tAbstractType;

		final List<TClass> parents = getParents();
		parents.add(this);
		final List<TClass> otherParents = tClass.getParents();
		otherParents.add(tClass);

		return (!Collections.disjoint(parents, otherParents));
	}

	// [user code injected with eMoflon] -->
} // TClassImpl
