/**
 */
package org.gravity.typegraph.basic;

import org.gravity.typegraph.basic.annotations.TAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TEnum</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTEnum()
 * @model
 * @generated
 */
public interface TEnum extends TAnnotation {

	static boolean isEnum(final TClass tClass) {
		return !tClass.getTAnnotation(BasicPackage.eINSTANCE.getTEnum()).isEmpty();
	}
} // TEnum
