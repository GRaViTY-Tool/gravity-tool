/**
 */
package org.gravity.typegraph.basic.containers.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gravity.typegraph.basic.containers.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainersFactoryImpl extends EFactoryImpl implements ContainersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContainersFactory init() {
		try {
			ContainersFactory theContainersFactory = (ContainersFactory)EPackage.Registry.INSTANCE.getEFactory(ContainersPackage.eNS_URI);
			if (theContainersFactory != null) {
				return theContainersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ContainersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainersFactoryImpl() {
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
			case ContainersPackage.TTYPE_CONTAINER: return createTTypeContainer();
			case ContainersPackage.TACCESS_CONTAINER: return createTAccessContainer();
			case ContainersPackage.TMEMBER_CONTAINER: return createTMemberContainer();
			case ContainersPackage.TCLASS_CONTAINER: return createTClassContainer();
			case ContainersPackage.TFIELD_CONTAINER: return createTFieldContainer();
			case ContainersPackage.TFIELD_DEFINITION_CONTAINER: return createTFieldDefinitionContainer();
			case ContainersPackage.TFIELD_SIGNATURE_CONTAINER: return createTFieldSignatureContainer();
			case ContainersPackage.TSIGNATURE_CONTAINER: return createTSignatureContainer();
			case ContainersPackage.TMETHOD_DEFINITION_CONTAINER: return createTMethodDefinitionContainer();
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
	public TTypeContainer createTTypeContainer() {
		TTypeContainerImpl tTypeContainer = new TTypeContainerImpl();
		return tTypeContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAccessContainer createTAccessContainer() {
		TAccessContainerImpl tAccessContainer = new TAccessContainerImpl();
		return tAccessContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMemberContainer createTMemberContainer() {
		TMemberContainerImpl tMemberContainer = new TMemberContainerImpl();
		return tMemberContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TClassContainer createTClassContainer() {
		TClassContainerImpl tClassContainer = new TClassContainerImpl();
		return tClassContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFieldContainer createTFieldContainer() {
		TFieldContainerImpl tFieldContainer = new TFieldContainerImpl();
		return tFieldContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFieldDefinitionContainer createTFieldDefinitionContainer() {
		TFieldDefinitionContainerImpl tFieldDefinitionContainer = new TFieldDefinitionContainerImpl();
		return tFieldDefinitionContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFieldSignatureContainer createTFieldSignatureContainer() {
		TFieldSignatureContainerImpl tFieldSignatureContainer = new TFieldSignatureContainerImpl();
		return tFieldSignatureContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSignatureContainer createTSignatureContainer() {
		TSignatureContainerImpl tSignatureContainer = new TSignatureContainerImpl();
		return tSignatureContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMethodDefinitionContainer createTMethodDefinitionContainer() {
		TMethodDefinitionContainerImpl tMethodDefinitionContainer = new TMethodDefinitionContainerImpl();
		return tMethodDefinitionContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainersPackage getContainersPackage() {
		return (ContainersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContainersPackage getPackage() {
		return ContainersPackage.eINSTANCE;
	}

} //ContainersFactoryImpl
