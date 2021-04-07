/**
 */
package org.gravity.hulk.resolve.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.gravity.hulk.HAntiPatternHandling;
import org.gravity.hulk.resolve.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResolveFactoryImpl extends EFactoryImpl implements ResolveFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResolveFactory init() {
		try {
			ResolveFactory theResolveFactory = (ResolveFactory) EPackage.Registry.INSTANCE
					.getEFactory(ResolvePackage.eNS_URI);
			if (theResolveFactory != null) {
				return theResolveFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResolveFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolveFactoryImpl() {
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
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolvePackage getResolvePackage() {
		return (ResolvePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ResolvePackage getPackage() {
		return ResolvePackage.eINSTANCE;
	}

	@Override
	public HAntiPatternHandling createHAntiPatternResolving() {
		return new HAntiPatternResolvingImpl();
	}

} //ResolveFactoryImpl