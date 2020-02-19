/**
 */
package org.gravity.typegraph.basic;

import org.gravity.typegraph.basic.annotations.TAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TConstructor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTConstructor()
 * @model
 * @generated
 */
public interface TConstructor extends TAnnotation {
	
	public static boolean isConstructor(TMember method) {
		return !method.getTAnnotation(BasicPackage.eINSTANCE.getTConstructor()).isEmpty();
	}
} // TConstructor
