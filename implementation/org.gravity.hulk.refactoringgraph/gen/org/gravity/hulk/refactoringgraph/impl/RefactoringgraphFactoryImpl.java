/**
 */
package org.gravity.hulk.refactoringgraph.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gravity.hulk.refactoringgraph.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefactoringgraphFactoryImpl extends EFactoryImpl implements RefactoringgraphFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RefactoringgraphFactory init() {
		try {
			RefactoringgraphFactory theRefactoringgraphFactory = (RefactoringgraphFactory) EPackage.Registry.INSTANCE
					.getEFactory(RefactoringgraphPackage.eNS_URI);
			if (theRefactoringgraphFactory != null) {
				return theRefactoringgraphFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RefactoringgraphFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefactoringgraphFactoryImpl() {
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
		case RefactoringgraphPackage.HMETHOD_TO_DATA_CLASS_ACCESS:
			return createHMethodToDataClassAccess();
		case RefactoringgraphPackage.HIN_BLOB_ACCESS:
			return createHInBlobAccess();
		case RefactoringgraphPackage.HBLOB_RESOLVE_ANNOTATION:
			return createHBlobResolveAnnotation();
		case RefactoringgraphPackage.HCLUSTER:
			return createHCluster();
		case RefactoringgraphPackage.HIN_BLOB_CLUSTER_ACCESS:
			return createHInBlobClusterAccess();
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
	public HMethodToDataClassAccess createHMethodToDataClassAccess() {
		HMethodToDataClassAccessImpl hMethodToDataClassAccess = new HMethodToDataClassAccessImpl();
		return hMethodToDataClassAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HInBlobAccess createHInBlobAccess() {
		HInBlobAccessImpl hInBlobAccess = new HInBlobAccessImpl();
		return hInBlobAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HBlobResolveAnnotation createHBlobResolveAnnotation() {
		HBlobResolveAnnotationImpl hBlobResolveAnnotation = new HBlobResolveAnnotationImpl();
		return hBlobResolveAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HCluster createHCluster() {
		HClusterImpl hCluster = new HClusterImpl();
		return hCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HInBlobClusterAccess createHInBlobClusterAccess() {
		HInBlobClusterAccessImpl hInBlobClusterAccess = new HInBlobClusterAccessImpl();
		return hInBlobClusterAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefactoringgraphPackage getRefactoringgraphPackage() {
		return (RefactoringgraphPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RefactoringgraphPackage getPackage() {
		return RefactoringgraphPackage.eINSTANCE;
	}

} //RefactoringgraphFactoryImpl
