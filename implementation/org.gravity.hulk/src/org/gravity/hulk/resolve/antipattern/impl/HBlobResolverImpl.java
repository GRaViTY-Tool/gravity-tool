/**
 */
package org.gravity.hulk.resolve.antipattern.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
// [user defined imports] -->
// <-- [user defined imports]
import org.gravity.hulk.annotations.resolve.Hulk_DontTouch;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern;
import org.gravity.hulk.antipatterngraph.values.HRelativeValue;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;
import org.gravity.hulk.detection.impl.HAntiPatternDetectorImpl;
import org.gravity.hulk.refactoringgraph.HBlobResolveAnnotation;
import org.gravity.hulk.refactoringgraph.HInBlobAccess;
import org.gravity.hulk.refactoringgraph.HMethodToDataClassAccess;
import org.gravity.hulk.refactoringgraph.RefactoringgraphFactory;
import org.gravity.hulk.refactoringgraph.refactorings.HExtractClass;
import org.gravity.hulk.refactoringgraph.refactorings.HMoveMember;
import org.gravity.hulk.refactoringgraph.refactorings.HMoveMembers;
import org.gravity.hulk.refactoringgraph.refactorings.HMoveMethod;
import org.gravity.hulk.refactoringgraph.refactorings.HRefactoring;
import org.gravity.hulk.refactoringgraph.refactorings.RefactoringsFactory;
import org.gravity.hulk.resolve.antipattern.AntipatternPackage;
import org.gravity.hulk.resolve.antipattern.HBlobResolver;
import org.gravity.refactorings.configuration.impl.ExtractClassConfiguration;
import org.gravity.refactorings.impl.ExtractClass;
import org.gravity.refactorings.impl.MoveMember;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.annotations.TAnnotationType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HBlob
 * Resolver</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.gravity.hulk.resolve.antipattern.impl.HBlobResolverImpl#getExecutedMoves
 * <em>Executed Moves</em>}</li>
 * <li>{@link org.gravity.hulk.resolve.antipattern.impl.HBlobResolverImpl#getOriginal_apg
 * <em>Original apg</em>}</li>
 * <li>{@link org.gravity.hulk.resolve.antipattern.impl.HBlobResolverImpl#getCopy_apg
 * <em>Copy apg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HBlobResolverImpl extends HAntiPatternDetectorImpl implements HBlobResolver {

	/**
	 * The logger of this class
	 */
	private static final Logger LOGGER = Logger.getLogger(HBlobResolverImpl.class);

	/**
	 * The cached value of the '{@link #getExecutedMoves() <em>Executed Moves</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getExecutedMoves()
	 * @generated
	 * @ordered
	 */
	protected EList<HMoveMethod> executedMoves;

	/**
	 * The cached value of the '{@link #getOriginal_apg() <em>Original apg</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getOriginal_apg()
	 * @generated
	 * @ordered
	 */
	protected HAntiPatternGraph original_apg;

	/**
	 * The cached value of the '{@link #getCopy_apg() <em>Copy apg</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getCopy_apg()
	 * @generated
	 * @ordered
	 */
	protected HAntiPatternGraph copyApg;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected HBlobResolverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AntipatternPackage.Literals.HBLOB_RESOLVER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<HMoveMethod> getExecutedMoves() {
		if (this.executedMoves == null) {
			this.executedMoves = new EObjectResolvingEList<>(HMoveMethod.class, this,
					AntipatternPackage.HBLOB_RESOLVER__EXECUTED_MOVES);
		}
		return this.executedMoves;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HAntiPatternGraph getOriginal_apg() {
		if (this.original_apg != null && this.original_apg.eIsProxy()) {
			final InternalEObject oldOriginal_apg = (InternalEObject) this.original_apg;
			this.original_apg = (HAntiPatternGraph) eResolveProxy(oldOriginal_apg);
			if (this.original_apg != oldOriginal_apg) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AntipatternPackage.HBLOB_RESOLVER__ORIGINAL_APG, oldOriginal_apg, this.original_apg));
				}
			}
		}
		return this.original_apg;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public HAntiPatternGraph basicGetOriginal_apg() {
		return this.original_apg;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setOriginal_apg(final HAntiPatternGraph newOriginal_apg) {
		final HAntiPatternGraph oldOriginal_apg = this.original_apg;
		this.original_apg = newOriginal_apg;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, AntipatternPackage.HBLOB_RESOLVER__ORIGINAL_APG,
					oldOriginal_apg, this.original_apg));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HAntiPatternGraph getCopy_apg() {
		return this.copyApg;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetCopy_apg(final HAntiPatternGraph newCopy_apg, NotificationChain msgs) {
		final HAntiPatternGraph oldCopy_apg = this.copyApg;
		this.copyApg = newCopy_apg;
		if (eNotificationRequired()) {
			final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AntipatternPackage.HBLOB_RESOLVER__COPY_APG, oldCopy_apg, newCopy_apg);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setCopy_apg(final HAntiPatternGraph newCopy_apg) {
		if (newCopy_apg != this.copyApg) {
			NotificationChain msgs = null;
			if (this.copyApg != null) {
				msgs = ((InternalEObject) this.copyApg).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AntipatternPackage.HBLOB_RESOLVER__COPY_APG, null, msgs);
			}
			if (newCopy_apg != null) {
				msgs = ((InternalEObject) newCopy_apg).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AntipatternPackage.HBLOB_RESOLVER__COPY_APG, null, msgs);
			}
			msgs = basicSetCopy_apg(newCopy_apg, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, AntipatternPackage.HBLOB_RESOLVER__COPY_APG,
					newCopy_apg, newCopy_apg));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean detect(final HAntiPatternGraph apg) {
		final HAntiPatternGraph newApg = init(apg);
		if (newApg == null) {
			throw new IllegalStateException("Couldn't initialize APG.");
		}
		// ForEach
		for (final HBlobAntiPattern blob : pattern_HBlobResolver_0_3_ActivityNode1_blackBFBF(newApg)) {
			final TClass tClass = (TClass) blob.getTAnnotated();
			final HBlobResolveAnnotation annotation = getResolveBlobAnnotation(newApg, blob, tClass);

			//
			if (allowedToTouch(tClass)) {
				resolve(apg, tClass, annotation);
			} else {
				EcoreUtil.delete(annotation);
			}

		}
		return true;
	}

	/**
	 * Resolves the blob in the class
	 *
	 * @param apg
	 * @param tClass
	 * @param annotation
	 */
	private void resolve(final HAntiPatternGraph apg, final TClass tClass, final HBlobResolveAnnotation annotation) {
		for (final TMember tDefinition : tClass.getDefines()) {
			if (allowedToTouch(tDefinition)) {
				//
				final HInBlobAccess iba = HBlobResolverImpl.searchInBlobAccess(tDefinition);
				if (iba != null) {

					final HRelativeValue ibaRelative = iba.getRelativeAmount();
					if (!ibaRelative.getValue().equals(HRelativeValueConstants.VERY_LOW)
							&& !ibaRelative.getValue().equals(HRelativeValueConstants.LOW)) {
						continue;

					}
					// ForEach
					for (final TAnnotation tmpM2dc : tDefinition.getTAnnotation()) {
						if (tmpM2dc instanceof HMethodToDataClassAccess) {
							final HMethodToDataClassAccess m2dc = (HMethodToDataClassAccess) tmpM2dc;
							//
							final HRelativeValue m2dcRelative = m2dc.getRelativeAmount();
							if (m2dcRelative != null
									&& m2dcRelative.getValue().equals(HRelativeValueConstants.VERY_HIGH)) {

								final TClass tTargetClass = m2dc.getHDataClass();
								final EList<TMember> tContainer = new BasicEList<>();
								tContainer.add(tDefinition);

								//
								final HMoveMembers hMoves = createMove(tContainer, tClass, tTargetClass, annotation);
								if (hMoves != null) {
									continue;
								}

							}

							final HExtractClass extract = createExtractClassAnnotation(tDefinition, annotation, apg,
									iba);

							//
							if (!isRefactoringPossible(extract)) {
								EcoreUtil.delete(extract);
							}

						}
					}
				}

			}

		}
		if (annotation.getHMoves().isEmpty()) {
			// We found no solution
			EcoreUtil.delete(annotation);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isRefactoringPossible(final HRefactoring refactoring) {
		// [user code injected with eMoflon]
		if (refactoring instanceof HMoveMethod) {
			final HMoveMethod r = (HMoveMethod) refactoring;
			final TClass tTargetClass = r.getTargetClass();
			final TClass tSourceClass = r.getSourceClass();

			for (final TSignature s : r.getTSignature()) {
				if (s.getSignatureString().startsWith("get") || s.getSignatureString().startsWith("set")) {
					return false;
				}
				if (!this.move.isApplicable(s, tTargetClass, tSourceClass)) {
					return false;
				}
			}
			return true;
		} else if (refactoring instanceof HExtractClass) {
			final HExtractClass extractClass = (HExtractClass) refactoring;
			final ExtractClassConfiguration config = new ExtractClassConfiguration(extractClass.getTMembers(),
					"ExtractedClass" + System.currentTimeMillis());
			final ExtractClass r = new ExtractClass();
			return r.isApplicable(config);
		} else {
			LOGGER.error("HBlobResolverImpl: Unkown refactoring type: " + refactoring);
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HMoveMembers createMove(final EList<TMember> members, final TClass source, final TClass target,
			final HBlobResolveAnnotation parent) {
		// [user code injected with eMoflon]
		final Set<HMoveMember> allMoves = new HashSet<>();
		for (final TMember definition : members) {
			if (!definition.getSignatureString().startsWith("get")
					&& !definition.getSignatureString().startsWith("set")) {
				if (this.move.isApplicable(definition.getSignature(), target, source)) {
					HMoveMember hMove;
					if (definition instanceof TMethodDefinition) {
						hMove = RefactoringsFactory.eINSTANCE.createHMoveMethod();
					} else if (definition instanceof TFieldDefinition) {
						hMove = RefactoringsFactory.eINSTANCE.createHMoveField();
					} else {
						LOGGER.error("HBlobResolver: Unknown Member Tye: " + definition);
						return null;
					}
					hMove.setApg(this.copyApg);
					this.copyApg.getHAnnotations().add(hMove);

					hMove.setTAnnotated(definition);
					definition.getTAnnotation().add(hMove);

					hMove.setSourceClass(source);
					hMove.setTargetClass(target);
					hMove.getTSignature().add(definition.getSignature());
					hMove.setChanged(false);

					for (final TAnnotation tAnnotation : definition.getTAnnotation()) {
						if (tAnnotation instanceof HInBlobAccess) {
							hMove.setIba((HInBlobAccess) tAnnotation);
						} else if (tAnnotation instanceof HMethodToDataClassAccess) {
							hMove.setM2dc((HMethodToDataClassAccess) tAnnotation);
						}
					}
					allMoves.add(hMove);

				} else {
					return null;
				}
			}
		}
		final RefactoringsFactory refactoringFactory = RefactoringsFactory.eINSTANCE;
		if (!allMoves.isEmpty()) {
			final HMoveMembers hMoves = refactoringFactory.createHMoveMembers();
			hMoves.getHMoveMembers().addAll(allMoves);
			hMoves.setSourceClass(source);
			hMoves.setTargetClass(target);
			source.getTAnnotation().add(hMoves);
			parent.getHRefactorings().add(hMoves);
			return hMoves;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean allowedToTouch(final TAnnotatable element) {
		// [user code injected with eMoflon]
		final Set<TAnnotation> annotations = new HashSet<>();
		annotations.addAll(element.getTAnnotation());
		if (element instanceof TMember) {
			final TMember member = (TMember) element;
			annotations.addAll(member.getDefinedBy().getTAnnotation());
		}
		for (final TAnnotation annotation : annotations) {
			final TAnnotationType type = annotation.getType();
			if (type != null) {
				if (type.getTName().equalsIgnoreCase(Hulk_DontTouch.class.getName())) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HAntiPatternGraph init(final HAntiPatternGraph pg) {
		// [user code injected with eMoflon]
		this.original_apg = pg;
		this.copyApg = EcoreUtil.copy(pg);

		this.move = new MoveMember();

		return this.copyApg;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
			final NotificationChain msgs) {
		switch (featureID) {
		case AntipatternPackage.HBLOB_RESOLVER__COPY_APG:
			return basicSetCopy_apg(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
		case AntipatternPackage.HBLOB_RESOLVER__EXECUTED_MOVES:
			return getExecutedMoves();
		case AntipatternPackage.HBLOB_RESOLVER__ORIGINAL_APG:
			if (resolve) {
				return getOriginal_apg();
			}
			return basicGetOriginal_apg();
		case AntipatternPackage.HBLOB_RESOLVER__COPY_APG:
			return getCopy_apg();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
		case AntipatternPackage.HBLOB_RESOLVER__EXECUTED_MOVES:
			getExecutedMoves().clear();
			getExecutedMoves().addAll((Collection<? extends HMoveMethod>) newValue);
			return;
		case AntipatternPackage.HBLOB_RESOLVER__ORIGINAL_APG:
			setOriginal_apg((HAntiPatternGraph) newValue);
			return;
		case AntipatternPackage.HBLOB_RESOLVER__COPY_APG:
			setCopy_apg((HAntiPatternGraph) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(final int featureID) {
		switch (featureID) {
		case AntipatternPackage.HBLOB_RESOLVER__EXECUTED_MOVES:
			getExecutedMoves().clear();
			return;
		case AntipatternPackage.HBLOB_RESOLVER__ORIGINAL_APG:
			setOriginal_apg((HAntiPatternGraph) null);
			return;
		case AntipatternPackage.HBLOB_RESOLVER__COPY_APG:
			setCopy_apg((HAntiPatternGraph) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(final int featureID) {
		switch (featureID) {
		case AntipatternPackage.HBLOB_RESOLVER__EXECUTED_MOVES:
			return this.executedMoves != null && !this.executedMoves.isEmpty();
		case AntipatternPackage.HBLOB_RESOLVER__ORIGINAL_APG:
			return this.original_apg != null;
		case AntipatternPackage.HBLOB_RESOLVER__COPY_APG:
			return this.copyApg != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case AntipatternPackage.HBLOB_RESOLVER___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		case AntipatternPackage.HBLOB_RESOLVER___IS_REFACTORING_POSSIBLE__HREFACTORING:
			return isRefactoringPossible((HRefactoring) arguments.get(0));
		case AntipatternPackage.HBLOB_RESOLVER___CREATE_MOVE__TMEMBERCONTAINER_TCLASS_TCLASS_HBLOBRESOLVEANNOTATION:
			return createMove((EList<TMember>) arguments.get(0), (TClass) arguments.get(1), (TClass) arguments.get(2),
					(HBlobResolveAnnotation) arguments.get(3));
		case AntipatternPackage.HBLOB_RESOLVER___ALLOWED_TO_TOUCH__TANNOTATABLE:
			return allowedToTouch((TAnnotatable) arguments.get(0));
		case AntipatternPackage.HBLOB_RESOLVER___INIT__HANTIPATTERNGRAPH:
			return init((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public final Iterable<HBlobAntiPattern> pattern_HBlobResolver_0_3_ActivityNode1_blackBFBF(
			final HAntiPatternGraph newApg) {
		final LinkedList<HBlobAntiPattern> result = new LinkedList<>();
		for (final HAnnotation tmpBlob : newApg.getHAnnotations()) {
			if (tmpBlob instanceof HBlobAntiPattern) {
				final HBlobAntiPattern blob = (HBlobAntiPattern) tmpBlob;
				final TAnnotatable tmpTClass = blob.getTAnnotated();
				if (tmpTClass instanceof TClass) {
					result.add(blob);
				}

			}
		}
		return result;
	}

	public final HBlobResolveAnnotation getResolveBlobAnnotation(final HAntiPatternGraph newApg,
			final HBlobAntiPattern blob, final TClass tClass) {
		final HBlobResolveAnnotation annotation = RefactoringgraphFactory.eINSTANCE.createHBlobResolveAnnotation();
		blob.getPartOf().add(annotation);
		this.getHAnnotation().add(annotation);
		newApg.getHAnnotations().add(annotation);
		annotation.setHBlobAntiPattern(blob);
		annotation.setTAnnotated(tClass);
		return annotation;
	}

	public static final HInBlobAccess searchInBlobAccess(final TMember tDefinition) {
		for (final TAnnotation tmpIba : tDefinition.getTAnnotation()) {
			if (tmpIba instanceof HInBlobAccess) {
				return (HInBlobAccess) tmpIba;
			}
		}
		return null;
	}

	private final HExtractClass createExtractClassAnnotation(final TMember tDefinition,
			final HBlobResolveAnnotation annotation, final HAntiPatternGraph apg, final HInBlobAccess iba) {
		final HExtractClass extract = RefactoringsFactory.eINSTANCE.createHExtractClass();
		extract.getTMembers().add(tDefinition);
		extract.setTAnnotated(tDefinition);
		extract.getPartOf().add(annotation);
		apg.getHAnnotations().add(extract);
		extract.getPartOf().add(iba);
		annotation.getHRefactorings().add(extract);
		iba.getPartOf().add(extract);
		return extract;
	}

	// <-- [user code injected with eMoflon]

	private MoveMember move;

	@Override
	public String getGuiName() {
		return "Resolve Blob [Anti-Pattern]";
	}

	// [user code injected with eMoflon] -->
} // HBlobResolverImpl
