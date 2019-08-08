/**
 */
package org.gravity.hulk.antipatterngraph.values;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.antipatterngraph.values.ValuesFactory
 * @model kind="package"
 * @generated
 */
public interface ValuesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "values";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gravity-tool.org/typegraph/antipatterngraph#//values";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "values";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ValuesPackage eINSTANCE = org.gravity.hulk.antipatterngraph.values.impl.ValuesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.values.impl.HRelativeValueImpl <em>HRelative Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.values.impl.HRelativeValueImpl
	 * @see org.gravity.hulk.antipatterngraph.values.impl.ValuesPackageImpl#getHRelativeValue()
	 * @generated
	 */
	int HRELATIVE_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HRELATIVE_VALUE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>HRelative Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HRELATIVE_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>HRelative Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HRELATIVE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants <em>HRelative Value Constants</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants
	 * @see org.gravity.hulk.antipatterngraph.values.impl.ValuesPackageImpl#getHRelativeValueConstants()
	 * @generated
	 */
	int HRELATIVE_VALUE_CONSTANTS = 1;

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.antipatterngraph.values.HRelativeValue <em>HRelative Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HRelative Value</em>'.
	 * @see org.gravity.hulk.antipatterngraph.values.HRelativeValue
	 * @generated
	 */
	EClass getHRelativeValue();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.hulk.antipatterngraph.values.HRelativeValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gravity.hulk.antipatterngraph.values.HRelativeValue#getValue()
	 * @see #getHRelativeValue()
	 * @generated
	 */
	EAttribute getHRelativeValue_Value();

	/**
	 * Returns the meta object for enum '{@link org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants <em>HRelative Value Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>HRelative Value Constants</em>'.
	 * @see org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants
	 * @generated
	 */
	EEnum getHRelativeValueConstants();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ValuesFactory getValuesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.values.impl.HRelativeValueImpl <em>HRelative Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.values.impl.HRelativeValueImpl
		 * @see org.gravity.hulk.antipatterngraph.values.impl.ValuesPackageImpl#getHRelativeValue()
		 * @generated
		 */
		EClass HRELATIVE_VALUE = eINSTANCE.getHRelativeValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HRELATIVE_VALUE__VALUE = eINSTANCE.getHRelativeValue_Value();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants <em>HRelative Value Constants</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants
		 * @see org.gravity.hulk.antipatterngraph.values.impl.ValuesPackageImpl#getHRelativeValueConstants()
		 * @generated
		 */
		EEnum HRELATIVE_VALUE_CONSTANTS = eINSTANCE.getHRelativeValueConstants();

	}

} //ValuesPackage
