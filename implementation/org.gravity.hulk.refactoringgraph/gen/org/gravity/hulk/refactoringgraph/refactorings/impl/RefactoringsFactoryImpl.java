/**
 */
package org.gravity.hulk.refactoringgraph.refactorings.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gravity.hulk.refactoringgraph.refactorings.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefactoringsFactoryImpl extends EFactoryImpl implements RefactoringsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RefactoringsFactory init() {
		try {
			RefactoringsFactory theRefactoringsFactory = (RefactoringsFactory) EPackage.Registry.INSTANCE
					.getEFactory(RefactoringsPackage.eNS_URI);
			if (theRefactoringsFactory != null) {
				return theRefactoringsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RefactoringsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefactoringsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RefactoringsPackage.HMOVE_METHOD:
			return createHMoveMethod();
		case RefactoringsPackage.HEXTRACT_CLASS:
			return createHExtractClass();
		case RefactoringsPackage.HMOVE_FIELD:
			return createHMoveField();
		case RefactoringsPackage.HMOVE_MEMBERS:
			return createHMoveMembers();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HMoveMethod createHMoveMethod() {
		HMoveMethodImpl hMoveMethod = new HMoveMethodImpl();
		return hMoveMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HExtractClass createHExtractClass() {
		HExtractClassImpl hExtractClass = new HExtractClassImpl();
		return hExtractClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HMoveField createHMoveField() {
		HMoveFieldImpl hMoveField = new HMoveFieldImpl();
		return hMoveField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HMoveMembers createHMoveMembers() {
		HMoveMembersImpl hMoveMembers = new HMoveMembersImpl();
		return hMoveMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefactoringsPackage getRefactoringsPackage() {
		return (RefactoringsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RefactoringsPackage getPackage() {
		return RefactoringsPackage.eINSTANCE;
	}

} //RefactoringsFactoryImpl
