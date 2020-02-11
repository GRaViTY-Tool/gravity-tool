/**
 */
package org.gravity.hulk.refactoringgraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern;

import org.gravity.hulk.refactoringgraph.refactorings.HMoveMember;
import org.gravity.hulk.refactoringgraph.refactorings.HRefactoring;
// <-- [user defined imports]
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.swt.widgets.TreeItem;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.hulk.antipatterngraph.impl.HAnnotationImpl;
import org.gravity.hulk.refactoringgraph.HBlobResolveAnnotation;
import org.gravity.hulk.refactoringgraph.RefactoringgraphPackage;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HBlob Resolve Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.hulk.refactoringgraph.impl.HBlobResolveAnnotationImpl#getHBlobAntiPattern <em>HBlob Anti Pattern</em>}</li>
 *   <li>{@link org.gravity.hulk.refactoringgraph.impl.HBlobResolveAnnotationImpl#getHMoves <em>HMoves</em>}</li>
 *   <li>{@link org.gravity.hulk.refactoringgraph.impl.HBlobResolveAnnotationImpl#getHRefactorings <em>HRefactorings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HBlobResolveAnnotationImpl extends HAnnotationImpl implements HBlobResolveAnnotation {
	/**
	 * The cached value of the '{@link #getHBlobAntiPattern() <em>HBlob Anti Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHBlobAntiPattern()
	 * @generated
	 * @ordered
	 */
	protected HBlobAntiPattern hBlobAntiPattern;

	/**
	 * The cached value of the '{@link #getHMoves() <em>HMoves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHMoves()
	 * @generated
	 * @ordered
	 */
	protected EList<HMoveMember> hMoves;

	/**
	 * The cached value of the '{@link #getHRefactorings() <em>HRefactorings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHRefactorings()
	 * @generated
	 * @ordered
	 */
	protected EList<HRefactoring> hRefactorings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HBlobResolveAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefactoringgraphPackage.Literals.HBLOB_RESOLVE_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HBlobAntiPattern getHBlobAntiPattern() {
		if (hBlobAntiPattern != null && hBlobAntiPattern.eIsProxy()) {
			InternalEObject oldHBlobAntiPattern = (InternalEObject) hBlobAntiPattern;
			hBlobAntiPattern = (HBlobAntiPattern) eResolveProxy(oldHBlobAntiPattern);
			if (hBlobAntiPattern != oldHBlobAntiPattern) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RefactoringgraphPackage.HBLOB_RESOLVE_ANNOTATION__HBLOB_ANTI_PATTERN, oldHBlobAntiPattern,
							hBlobAntiPattern));
			}
		}
		return hBlobAntiPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HBlobAntiPattern basicGetHBlobAntiPattern() {
		return hBlobAntiPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHBlobAntiPattern(HBlobAntiPattern newHBlobAntiPattern) {
		HBlobAntiPattern oldHBlobAntiPattern = hBlobAntiPattern;
		hBlobAntiPattern = newHBlobAntiPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RefactoringgraphPackage.HBLOB_RESOLVE_ANNOTATION__HBLOB_ANTI_PATTERN, oldHBlobAntiPattern,
					hBlobAntiPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HMoveMember> getHMoves() {
		if (hMoves == null) {
			hMoves = new EObjectResolvingEList<HMoveMember>(HMoveMember.class, this,
					RefactoringgraphPackage.HBLOB_RESOLVE_ANNOTATION__HMOVES);
		}
		return hMoves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HRefactoring> getHRefactorings() {
		if (hRefactorings == null) {
			hRefactorings = new EObjectResolvingEList<HRefactoring>(HRefactoring.class, this,
					RefactoringgraphPackage.HBLOB_RESOLVE_ANNOTATION__HREFACTORINGS);
		}
		return hRefactorings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RefactoringgraphPackage.HBLOB_RESOLVE_ANNOTATION__HBLOB_ANTI_PATTERN:
			if (resolve)
				return getHBlobAntiPattern();
			return basicGetHBlobAntiPattern();
		case RefactoringgraphPackage.HBLOB_RESOLVE_ANNOTATION__HMOVES:
			return getHMoves();
		case RefactoringgraphPackage.HBLOB_RESOLVE_ANNOTATION__HREFACTORINGS:
			return getHRefactorings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RefactoringgraphPackage.HBLOB_RESOLVE_ANNOTATION__HBLOB_ANTI_PATTERN:
			setHBlobAntiPattern((HBlobAntiPattern) newValue);
			return;
		case RefactoringgraphPackage.HBLOB_RESOLVE_ANNOTATION__HMOVES:
			getHMoves().clear();
			getHMoves().addAll((Collection<? extends HMoveMember>) newValue);
			return;
		case RefactoringgraphPackage.HBLOB_RESOLVE_ANNOTATION__HREFACTORINGS:
			getHRefactorings().clear();
			getHRefactorings().addAll((Collection<? extends HRefactoring>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RefactoringgraphPackage.HBLOB_RESOLVE_ANNOTATION__HBLOB_ANTI_PATTERN:
			setHBlobAntiPattern((HBlobAntiPattern) null);
			return;
		case RefactoringgraphPackage.HBLOB_RESOLVE_ANNOTATION__HMOVES:
			getHMoves().clear();
			return;
		case RefactoringgraphPackage.HBLOB_RESOLVE_ANNOTATION__HREFACTORINGS:
			getHRefactorings().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RefactoringgraphPackage.HBLOB_RESOLVE_ANNOTATION__HBLOB_ANTI_PATTERN:
			return hBlobAntiPattern != null;
		case RefactoringgraphPackage.HBLOB_RESOLVE_ANNOTATION__HMOVES:
			return hMoves != null && !hMoves.isEmpty();
		case RefactoringgraphPackage.HBLOB_RESOLVE_ANNOTATION__HREFACTORINGS:
			return hRefactorings != null && !hRefactorings.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	@Override
	public TreeItem createItemContents(TreeItem item, int style) {

		new TreeItem(item, style)
				.setText("blob-class: " + ((TAbstractType) hBlobAntiPattern.getTAnnotated()).getFullyQualifiedName());

		TreeItem antipattern = new TreeItem(item, style);
		antipattern.setText("anti-pattern");
		hBlobAntiPattern.createItemContents(new TreeItem(antipattern, style), style);

		if (hRefactorings == null || hRefactorings.isEmpty()) {
			item.setText("Unable to resolve the The Blob [Anti-Pattern].");
		} else {
			item.setText("Solved The Blob [Anti-Pattern] by refactoring.");

			TreeItem refactorings = new TreeItem(item, style);
			refactorings.setText("refactorings");

			List<HRefactoring> moves = new ArrayList<>(hRefactorings);
			moves.sort(new Comparator<HRefactoring>() {

				@Override
				public int compare(HRefactoring arg0, HRefactoring arg1) {
					return (int) (1000 * (arg0.getValue() - arg1.getValue()));
				}

			});

			for (HRefactoring m : moves) {
				m.createItemContents(new TreeItem(refactorings, style), style);
			}
		}

		return item;
	}

	// [user code injected with eMoflon] -->
} //HBlobResolveAnnotationImpl
