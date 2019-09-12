/**
 */
package org.gravity.typegraph.basic;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TSyntethic Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.TSyntethicMethod#getOriginalMethodDefinition <em>Original Method Definition</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTSyntethicMethod()
 * @model
 * @generated
 */
public interface TSyntethicMethod extends TMember {
	/**
	 * Returns the value of the '<em><b>Original Method Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TMethodDefinition#getSyntethicMethods <em>Syntethic Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Method Definition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Method Definition</em>' reference.
	 * @see #setOriginalMethodDefinition(TMethodDefinition)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTSyntethicMethod_OriginalMethodDefinition()
	 * @see org.gravity.typegraph.basic.TMethodDefinition#getSyntethicMethods
	 * @model opposite="syntethicMethods" required="true"
	 * @generated
	 */
	TMethodDefinition getOriginalMethodDefinition();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TSyntethicMethod#getOriginalMethodDefinition <em>Original Method Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Method Definition</em>' reference.
	 * @see #getOriginalMethodDefinition()
	 * @generated
	 */
	void setOriginalMethodDefinition(TMethodDefinition value);

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	TMethodSignature getSignature();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TSyntethicMethod
