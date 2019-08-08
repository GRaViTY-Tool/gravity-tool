/**
 */
package org.gravity.hulk.antipatterngraph;

import org.eclipse.emf.common.util.EList;

import org.gravity.typegraph.basic.annotations.TAnnotation;
// <-- [user defined imports]
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HAnnotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.hulk.antipatterngraph.HAnnotation#getApg <em>Apg</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.HAnnotation#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.gravity.hulk.antipatterngraph.HAnnotation#isChanged <em>Changed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.hulk.antipatterngraph.AntipatterngraphPackage#getHAnnotation()
 * @model abstract="true"
 * @generated
 */
public interface HAnnotation extends TAnnotation {
	/**
	 * Returns the value of the '<em><b>Apg</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.hulk.antipatterngraph.HAntiPatternGraph#getHAnnotations <em>HAnnotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apg</em>' reference.
	 * @see #setApg(HAntiPatternGraph)
	 * @see org.gravity.hulk.antipatterngraph.AntipatterngraphPackage#getHAnnotation_Apg()
	 * @see org.gravity.hulk.antipatterngraph.HAntiPatternGraph#getHAnnotations
	 * @model opposite="hAnnotations" required="true"
	 * @generated
	 */
	HAntiPatternGraph getApg();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.antipatterngraph.HAnnotation#getApg <em>Apg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apg</em>' reference.
	 * @see #getApg()
	 * @generated
	 */
	void setApg(HAntiPatternGraph value);

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.hulk.antipatterngraph.HAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' reference list.
	 * @see org.gravity.hulk.antipatterngraph.AntipatterngraphPackage#getHAnnotation_PartOf()
	 * @model
	 * @generated
	 */
	EList<HAnnotation> getPartOf();

	/**
	 * Returns the value of the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changed</em>' attribute.
	 * @see #setChanged(boolean)
	 * @see org.gravity.hulk.antipatterngraph.AntipatterngraphPackage#getHAnnotation_Changed()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isChanged();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.antipatterngraph.HAnnotation#isChanged <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changed</em>' attribute.
	 * @see #isChanged()
	 * @generated
	 */
	void setChanged(boolean value);
	// <-- [user code injected with eMoflon]

	TreeItem createItemContents(TreeItem item, int style);

	TreeItem getTreeItem(Tree tree, int style);

	TreeItem getTreeItem(TreeItem tree, int style);

	// [user code injected with eMoflon] -->
} // HAnnotation
