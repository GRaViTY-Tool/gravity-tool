/**
 */
package org.gravity.hulk.resolve.antipattern;

import org.eclipse.emf.common.util.EList;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.detection.HAntiPatternDetector;
import org.gravity.hulk.refactoringgraph.HBlobResolveAnnotation;
import org.gravity.hulk.refactoringgraph.refactorings.HMoveMembers;
import org.gravity.hulk.refactoringgraph.refactorings.HMoveMethod;
import org.gravity.hulk.refactoringgraph.refactorings.HRefactoring;
import org.gravity.hulk.resolve.HAntiPatternResolver;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.annotations.TAnnotatable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HBlob Resolver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gravity.hulk.resolve.antipattern.HBlobResolver#getExecutedMoves <em>Executed Moves</em>}</li>
 *   <li>{@link org.gravity.hulk.resolve.antipattern.HBlobResolver#getOriginal_apg <em>Original apg</em>}</li>
 *   <li>{@link org.gravity.hulk.resolve.antipattern.HBlobResolver#getCopy_apg <em>Copy apg</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gravity.hulk.resolve.antipattern.AntipatternPackage#getHBlobResolver()
 * @model
 * @generated
 */
public interface HBlobResolver extends HAntiPatternDetector, HAntiPatternResolver {
	/**
	 * Returns the value of the '<em><b>Executed Moves</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.hulk.refactoringgraph.refactorings.HMoveMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executed Moves</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executed Moves</em>' reference list.
	 * @see org.gravity.hulk.resolve.antipattern.AntipatternPackage#getHBlobResolver_ExecutedMoves()
	 * @model
	 * @generated
	 */
	EList<HMoveMethod> getExecutedMoves();

	/**
	 * Returns the value of the '<em><b>Original apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original apg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original apg</em>' reference.
	 * @see #setOriginal_apg(HAntiPatternGraph)
	 * @see org.gravity.hulk.resolve.antipattern.AntipatternPackage#getHBlobResolver_Original_apg()
	 * @model
	 * @generated
	 */
	HAntiPatternGraph getOriginal_apg();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.resolve.antipattern.HBlobResolver#getOriginal_apg <em>Original apg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original apg</em>' reference.
	 * @see #getOriginal_apg()
	 * @generated
	 */
	void setOriginal_apg(HAntiPatternGraph value);

	/**
	 * Returns the value of the '<em><b>Copy apg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy apg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy apg</em>' containment reference.
	 * @see #setCopy_apg(HAntiPatternGraph)
	 * @see org.gravity.hulk.resolve.antipattern.AntipatternPackage#getHBlobResolver_Copy_apg()
	 * @model containment="true"
	 * @generated
	 */
	HAntiPatternGraph getCopy_apg();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.resolve.antipattern.HBlobResolver#getCopy_apg <em>Copy apg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy apg</em>' containment reference.
	 * @see #getCopy_apg()
	 * @generated
	 */
	void setCopy_apg(HAntiPatternGraph value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	@Override
	boolean detect(HAntiPatternGraph apg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isRefactoringPossible(HRefactoring refactoring);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	HMoveMembers createMove(EList<TMember> members, TClass source, TClass target, HBlobResolveAnnotation parent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean allowedToTouch(TAnnotatable element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	HAntiPatternGraph init(HAntiPatternGraph pg);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HBlobResolver