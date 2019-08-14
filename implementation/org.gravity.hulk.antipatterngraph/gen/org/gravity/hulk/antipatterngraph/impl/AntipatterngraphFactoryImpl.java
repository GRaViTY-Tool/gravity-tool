/**
 */
package org.gravity.hulk.antipatterngraph.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gravity.hulk.antipatterngraph.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AntipatterngraphFactoryImpl extends EFactoryImpl implements AntipatterngraphFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AntipatterngraphFactory init() {
		try {
			AntipatterngraphFactory theAntipatterngraphFactory = (AntipatterngraphFactory) EPackage.Registry.INSTANCE
					.getEFactory(AntipatterngraphPackage.eNS_URI);
			if (theAntipatterngraphFactory != null) {
				return theAntipatterngraphFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AntipatterngraphFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AntipatterngraphFactoryImpl() {
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
		case AntipatterngraphPackage.HANTI_PATTERN_GRAPH:
			return createHAntiPatternGraph();
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
	public HAntiPatternGraph createHAntiPatternGraph() {
		HAntiPatternGraphImpl hAntiPatternGraph = new HAntiPatternGraphImpl();
		return hAntiPatternGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AntipatterngraphPackage getAntipatterngraphPackage() {
		return (AntipatterngraphPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AntipatterngraphPackage getPackage() {
		return AntipatterngraphPackage.eINSTANCE;
	}

} //AntipatterngraphFactoryImpl
