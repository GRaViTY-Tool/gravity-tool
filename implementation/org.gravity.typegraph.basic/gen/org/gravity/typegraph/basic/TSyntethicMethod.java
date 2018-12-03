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
 *   <li>{@link org.gravity.typegraph.basic.TSyntethicMethod#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTSyntethicMethod()
 * @model
 * @generated
 */
public interface TSyntethicMethod extends TMember {
	/**
	 * Returns the value of the '<em><b>Original Method Definition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TMethodDefinition#getSyntethicMethods <em>Syntethic Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Method Definition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Method Definition</em>' container reference.
	 * @see #setOriginalMethodDefinition(TMethodDefinition)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTSyntethicMethod_OriginalMethodDefinition()
	 * @see org.gravity.typegraph.basic.TMethodDefinition#getSyntethicMethods
	 * @model opposite="syntethicMethods" required="true" transient="false"
	 * @generated
	 */
	TMethodDefinition getOriginalMethodDefinition();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TSyntethicMethod#getOriginalMethodDefinition <em>Original Method Definition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Method Definition</em>' container reference.
	 * @see #getOriginalMethodDefinition()
	 * @generated
	 */
	void setOriginalMethodDefinition(TMethodDefinition value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' reference.
	 * @see #setSignature(TMethodSignature)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTSyntethicMethod_Signature()
	 * @model required="true"
	 * @generated
	 */
	TMethodSignature getSignature();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TSyntethicMethod#getSignature <em>Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(TMethodSignature value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TSyntethicMethod
