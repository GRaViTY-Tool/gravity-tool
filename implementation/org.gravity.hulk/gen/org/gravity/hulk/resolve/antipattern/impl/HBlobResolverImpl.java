/**
 */
package org.gravity.hulk.resolve.antipattern.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
import org.gravity.hulk.refactoringgraph.refactorings.HMoveMethod;
import org.gravity.hulk.refactoringgraph.refactorings.HRefactoring;
import org.gravity.hulk.refactoringgraph.refactorings.RefactoringsFactory;

import org.gravity.hulk.resolve.antipattern.AntipatternPackage;
import org.gravity.hulk.resolve.antipattern.HBlobResolver;

import org.gravity.typegraph.basic.TClass;

import org.gravity.typegraph.basic.annotations.TAnnotatable;

import org.gravity.typegraph.basic.containers.ContainersFactory;
// <-- [user defined imports]
import org.gravity.hulk.annotations.resolve.Hulk_DontTouch;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.annotations.TAnnotationType;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.annotations.TTextAnnotation;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.containers.TMemberContainer;
import org.gravity.refactorings.configuration.impl.ExtractClassConfiguration;
import org.gravity.refactorings.configuration.impl.ExtractSuperClassConfiguration;
import org.gravity.refactorings.impl.ExtractClass;
import org.gravity.refactorings.impl.MoveMember;
import org.gravity.hulk.refactoringgraph.refactorings.HMoveMembers;
import org.eclipse.emf.ecore.util.EcoreUtil;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HBlob Resolver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.hulk.resolve.antipattern.impl.HBlobResolverImpl#getExecutedMoves <em>Executed Moves</em>}</li>
 *   <li>{@link org.gravity.hulk.resolve.antipattern.impl.HBlobResolverImpl#getOriginal_apg <em>Original apg</em>}</li>
 *   <li>{@link org.gravity.hulk.resolve.antipattern.impl.HBlobResolverImpl#getCopy_apg <em>Copy apg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HBlobResolverImpl extends HAntiPatternDetectorImpl implements HBlobResolver {
	/**
	 * The cached value of the '{@link #getExecutedMoves() <em>Executed Moves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutedMoves()
	 * @generated
	 * @ordered
	 */
	protected EList<HMoveMethod> executedMoves;

	/**
	 * The cached value of the '{@link #getOriginal_apg() <em>Original apg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginal_apg()
	 * @generated
	 * @ordered
	 */
	protected HAntiPatternGraph original_apg;

	/**
	 * The cached value of the '{@link #getCopy_apg() <em>Copy apg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopy_apg()
	 * @generated
	 * @ordered
	 */
	protected HAntiPatternGraph copyApg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HBlobResolverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AntipatternPackage.Literals.HBLOB_RESOLVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HMoveMethod> getExecutedMoves() {
		if (executedMoves == null) {
			executedMoves = new EObjectResolvingEList<HMoveMethod>(HMoveMethod.class, this,
					AntipatternPackage.HBLOB_RESOLVER__EXECUTED_MOVES);
		}
		return executedMoves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAntiPatternGraph getOriginal_apg() {
		if (original_apg != null && original_apg.eIsProxy()) {
			InternalEObject oldOriginal_apg = (InternalEObject) original_apg;
			original_apg = (HAntiPatternGraph) eResolveProxy(oldOriginal_apg);
			if (original_apg != oldOriginal_apg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AntipatternPackage.HBLOB_RESOLVER__ORIGINAL_APG, oldOriginal_apg, original_apg));
			}
		}
		return original_apg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAntiPatternGraph basicGetOriginal_apg() {
		return original_apg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginal_apg(HAntiPatternGraph newOriginal_apg) {
		HAntiPatternGraph oldOriginal_apg = original_apg;
		original_apg = newOriginal_apg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntipatternPackage.HBLOB_RESOLVER__ORIGINAL_APG,
					oldOriginal_apg, original_apg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAntiPatternGraph getCopy_apg() {
		return copyApg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopy_apg(HAntiPatternGraph newCopy_apg, NotificationChain msgs) {
		HAntiPatternGraph oldCopy_apg = copyApg;
		copyApg = newCopy_apg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AntipatternPackage.HBLOB_RESOLVER__COPY_APG, oldCopy_apg, newCopy_apg);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopy_apg(HAntiPatternGraph newCopy_apg) {
		if (newCopy_apg != copyApg) {
			NotificationChain msgs = null;
			if (copyApg != null)
				msgs = ((InternalEObject) copyApg).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AntipatternPackage.HBLOB_RESOLVER__COPY_APG, null, msgs);
			if (newCopy_apg != null)
				msgs = ((InternalEObject) newCopy_apg).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AntipatternPackage.HBLOB_RESOLVER__COPY_APG, null, msgs);
			msgs = basicSetCopy_apg(newCopy_apg, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntipatternPackage.HBLOB_RESOLVER__COPY_APG,
					newCopy_apg, newCopy_apg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean detect(HAntiPatternGraph apg) {

		Object[] result1_black = HBlobResolverImpl.pattern_HBlobResolver_0_1_ActivityNode33_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}

		Object[] result2_bindingAndBlack = HBlobResolverImpl
				.pattern_HBlobResolver_0_2_ActivityNode7_bindingAndBlackFBB(this, apg);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[apg] = " + apg + ".");
		}
		HAntiPatternGraph newApg = (HAntiPatternGraph) result2_bindingAndBlack[0];
		// ForEach 
		for (Object[] result3_black : HBlobResolverImpl.pattern_HBlobResolver_0_3_ActivityNode1_blackBFBF(newApg,
				this)) {
			HBlobAntiPattern blob = (HBlobAntiPattern) result3_black[1];
			TClass tClass = (TClass) result3_black[3];
			Object[] result3_green = HBlobResolverImpl.pattern_HBlobResolver_0_3_ActivityNode1_greenBBBFB(newApg, blob,
					this, tClass);
			HBlobResolveAnnotation annotation = (HBlobResolveAnnotation) result3_green[3];

			// 
			if (HBlobResolverImpl.pattern_HBlobResolver_0_4_ActivityNode10_expressionFBB(this, tClass)) {
				// ForEach 
				for (Object[] result5_black : HBlobResolverImpl
						.pattern_HBlobResolver_0_5_ActivityNode11_blackBF(tClass)) {
					TMember tDefinition = (TMember) result5_black[1];
					// 
					if (HBlobResolverImpl.pattern_HBlobResolver_0_6_ActivityNode12_expressionFBB(this, tDefinition)) {
						// 
						Object[] result7_black = HBlobResolverImpl
								.pattern_HBlobResolver_0_7_ActivityNode14_blackBF(tDefinition);
						if (result7_black != null) {
							HInBlobAccess iba = (HInBlobAccess) result7_black[1];

							Object[] result8_bindingAndBlack = HBlobResolverImpl
									.pattern_HBlobResolver_0_8_ActivityNode24_bindingAndBlackFB(iba);
							if (result8_bindingAndBlack == null) {
								throw new RuntimeException(
										"Pattern matching failed." + " Variables: " + "[iba] = " + iba + ".");
							}
							HRelativeValue ibaRelative = (HRelativeValue) result8_bindingAndBlack[0];
							// 
							Object[] result9_black = HBlobResolverImpl
									.pattern_HBlobResolver_0_9_ActivityNode15_blackB(ibaRelative);
							if (result9_black != null) {
							} else {
								// 
								Object[] result10_black = HBlobResolverImpl
										.pattern_HBlobResolver_0_10_ActivityNode23_blackB(ibaRelative);
								if (result10_black != null) {
								} else {
									continue;
								}

							}
							// ForEach 
							for (Object[] result12_black : HBlobResolverImpl
									.pattern_HBlobResolver_0_12_ActivityNode16_blackBF(tDefinition)) {
								HMethodToDataClassAccess m2dc = (HMethodToDataClassAccess) result12_black[1];
								// 
								Object[] result13_bindingAndBlack = HBlobResolverImpl
										.pattern_HBlobResolver_0_13_ActivityNode17_bindingAndBlackFB(m2dc);
								if (result13_bindingAndBlack != null) {
									//nothing HRelativeValue m2dcRelative = (HRelativeValue) result13_bindingAndBlack[0];

									Object[] result14_black = HBlobResolverImpl
											.pattern_HBlobResolver_0_14_ActivityNode29_blackFBB(m2dc, tDefinition);
									if (result14_black == null) {
										throw new RuntimeException("Pattern matching failed." + " Variables: "
												+ "[m2dc] = " + m2dc + ", " + "[tDefinition] = " + tDefinition + ".");
									}
									TClass tTargetClass = (TClass) result14_black[0];
									Object[] result14_green = HBlobResolverImpl
											.pattern_HBlobResolver_0_14_ActivityNode29_greenBF(tDefinition);
									TMemberContainer tContainer = (TMemberContainer) result14_green[1];

									// 
									Object[] result15_bindingAndBlack = HBlobResolverImpl
											.pattern_HBlobResolver_0_15_CreateMoves_bindingAndBlackFBBBBB(this,
													tContainer, tClass, tTargetClass, annotation);
									if (result15_bindingAndBlack != null) {
										//nothing HMoveMembers hMoves = (HMoveMembers) result15_bindingAndBlack[0];
										continue;
									} else {
									}

								} else {
								}

								Object[] result17_black = HBlobResolverImpl
										.pattern_HBlobResolver_0_17_ActivityNode26_blackBBBB(tDefinition, annotation,
												apg, iba);
								if (result17_black == null) {
									throw new RuntimeException("Pattern matching failed." + " Variables: "
											+ "[tDefinition] = " + tDefinition + ", " + "[annotation] = " + annotation
											+ ", " + "[apg] = " + apg + ", " + "[iba] = " + iba + ".");
								}
								Object[] result17_green = HBlobResolverImpl
										.pattern_HBlobResolver_0_17_ActivityNode26_greenFBBBB(tDefinition, annotation,
												apg, iba);
								HExtractClass extract = (HExtractClass) result17_green[0];

								// 
								if (HBlobResolverImpl.pattern_HBlobResolver_0_18_ActivityNode27_expressionFBB(this,
										extract)) {
								} else {

									Object[] result19_black = HBlobResolverImpl
											.pattern_HBlobResolver_0_19_ActivityNode28_blackB(extract);
									if (result19_black == null) {
										throw new RuntimeException("Pattern matching failed." + " Variables: "
												+ "[extract] = " + extract + ".");
									}
									HBlobResolverImpl.pattern_HBlobResolver_0_19_ActivityNode28_redB(extract);

									EcoreUtil.delete(extract);
									extract = null;
									;

								}

							}

						} else {
						}

					} else {
					}

				}
				// 
				Object[] result20_black = HBlobResolverImpl
						.pattern_HBlobResolver_0_20_ActivityNode21_blackBF(annotation);
				if (result20_black != null) {
					//nothing HMoveMember oneMove = (HMoveMember) result20_black[1];
				} else {

					Object[] result21_black = HBlobResolverImpl
							.pattern_HBlobResolver_0_21_ActivityNode22_blackB(annotation);
					if (result21_black == null) {
						throw new RuntimeException(
								"Pattern matching failed." + " Variables: " + "[annotation] = " + annotation + ".");
					}
					HBlobResolverImpl.pattern_HBlobResolver_0_21_ActivityNode22_redB(annotation);

					EcoreUtil.delete(annotation);
					annotation = null;
					;

				}

			} else {

				Object[] result22_black = HBlobResolverImpl
						.pattern_HBlobResolver_0_22_ActivityNode13_blackB(annotation);
				if (result22_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[annotation] = " + annotation + ".");
				}
				HBlobResolverImpl.pattern_HBlobResolver_0_22_ActivityNode13_redB(annotation);

				EcoreUtil.delete(annotation);
				annotation = null;
				;

			}

		}
		return HBlobResolverImpl.pattern_HBlobResolver_0_23_expressionF();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRefactoringPossible(HRefactoring refactoring) {
		// [user code injected with eMoflon]
		if (refactoring instanceof HMoveMethod) {
			HMoveMethod r = (HMoveMethod) refactoring;
			TClass tTargetClass = r.getTargetClass();
			TClass tSourceClass = r.getSourceClass();
			TypeGraph pg = tTargetClass.getPg();

			for (TSignature s : r.getTSignature()) {
				if (s.getSignatureString().startsWith("get") || s.getSignatureString().startsWith("set")) {
					return false;
				}
				if (!move.isApplicable(s, tTargetClass, tSourceClass)) {
					return false;
				}
			}
			return true;
		} else if (refactoring instanceof HExtractClass) {
			HExtractClass extractClass = (HExtractClass) refactoring;
			ExtractClassConfiguration config = new ExtractClassConfiguration(extractClass.getTMembers(),
					"ExtractedClass" + System.currentTimeMillis());
			ExtractClass r = new ExtractClass();
			return r.isApplicable(config);
		} else {
			System.err.println("HBlobResolverImpl: Unkown refactoring type: " + refactoring);
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMoveMembers createMove(TMemberContainer members, TClass source, TClass target,
			HBlobResolveAnnotation parent) {
		// [user code injected with eMoflon]
		Set<HMoveMember> allMoves = new HashSet<>();
		for (TMember definition : members.getTMembers()) {
			if (!definition.getSignatureString().startsWith("get")
					&& !definition.getSignatureString().startsWith("set"))
				if (move.isApplicable(definition.getSignature(), target, source)) {
					HMoveMember hMove;
					if (definition instanceof TMethodDefinition) {
						hMove = RefactoringsFactory.eINSTANCE.createHMoveMethod();
					} else if (definition instanceof TFieldDefinition) {
						hMove = RefactoringsFactory.eINSTANCE.createHMoveField();
					} else {
						System.err.println("HBlobResolver: Unknown Member Tye: " + definition);
						return null;
					}
					hMove.setApg(copyApg);
					copyApg.getHAnnotations().add(hMove);

					hMove.setTAnnotated(definition);
					definition.getTAnnotation().add(hMove);

					hMove.setSourceClass(source);
					hMove.setTargetClass(target);
					hMove.getTSignature().add(definition.getSignature());
					hMove.setChanged(false);

					for (TAnnotation tAnnotation : definition.getTAnnotation()) {
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
		RefactoringsFactory refactoringFactory = RefactoringsFactory.eINSTANCE;
		if (allMoves.size() > 0) {
			HMoveMembers hMoves = hMoves = refactoringFactory.createHMoveMembers();
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean allowedToTouch(TAnnotatable element) {
		// [user code injected with eMoflon]
		Set<TAnnotation> annotations = new HashSet<>();
		annotations.addAll(element.getTAnnotation());
		if (element instanceof TMember) {
			TMember member = (TMember) element;
			annotations.addAll(member.getDefinedBy().getTAnnotation());
		}
		for (TAnnotation annotation : annotations) {
			TAnnotationType type = annotation.getType();
			if (type != null) {
				if (type.getTName().equalsIgnoreCase(Hulk_DontTouch.class.getName())) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HAntiPatternGraph init(HAntiPatternGraph pg) {
		// [user code injected with eMoflon]
		original_apg = pg;
		copyApg = EcoreUtil.copy(pg);

		move = new MoveMember();

		return copyApg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AntipatternPackage.HBLOB_RESOLVER__COPY_APG:
			return basicSetCopy_apg(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AntipatternPackage.HBLOB_RESOLVER__EXECUTED_MOVES:
			return getExecutedMoves();
		case AntipatternPackage.HBLOB_RESOLVER__ORIGINAL_APG:
			if (resolve)
				return getOriginal_apg();
			return basicGetOriginal_apg();
		case AntipatternPackage.HBLOB_RESOLVER__COPY_APG:
			return getCopy_apg();
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AntipatternPackage.HBLOB_RESOLVER__EXECUTED_MOVES:
			return executedMoves != null && !executedMoves.isEmpty();
		case AntipatternPackage.HBLOB_RESOLVER__ORIGINAL_APG:
			return original_apg != null;
		case AntipatternPackage.HBLOB_RESOLVER__COPY_APG:
			return copyApg != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case AntipatternPackage.HBLOB_RESOLVER___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		case AntipatternPackage.HBLOB_RESOLVER___IS_REFACTORING_POSSIBLE__HREFACTORING:
			return isRefactoringPossible((HRefactoring) arguments.get(0));
		case AntipatternPackage.HBLOB_RESOLVER___CREATE_MOVE__TMEMBERCONTAINER_TCLASS_TCLASS_HBLOBRESOLVEANNOTATION:
			return createMove((TMemberContainer) arguments.get(0), (TClass) arguments.get(1), (TClass) arguments.get(2),
					(HBlobResolveAnnotation) arguments.get(3));
		case AntipatternPackage.HBLOB_RESOLVER___ALLOWED_TO_TOUCH__TANNOTATABLE:
			return allowedToTouch((TAnnotatable) arguments.get(0));
		case AntipatternPackage.HBLOB_RESOLVER___INIT__HANTIPATTERNGRAPH:
			return init((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HBlobResolver_0_1_ActivityNode33_blackB(HBlobResolver _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_HBlobResolver_0_2_ActivityNode7_bindingFBB(HBlobResolver _this,
			HAntiPatternGraph apg) {
		HAntiPatternGraph _localVariable_0 = _this.init(apg);
		HAntiPatternGraph newApg = _localVariable_0;
		if (newApg != null) {
			return new Object[] { newApg, _this, apg };
		}
		return null;
	}

	public static final Object[] pattern_HBlobResolver_0_2_ActivityNode7_blackB(HAntiPatternGraph newApg) {
		return new Object[] { newApg };
	}

	public static final Object[] pattern_HBlobResolver_0_2_ActivityNode7_bindingAndBlackFBB(HBlobResolver _this,
			HAntiPatternGraph apg) {
		Object[] result_pattern_HBlobResolver_0_2_ActivityNode7_binding = pattern_HBlobResolver_0_2_ActivityNode7_bindingFBB(
				_this, apg);
		if (result_pattern_HBlobResolver_0_2_ActivityNode7_binding != null) {
			HAntiPatternGraph newApg = (HAntiPatternGraph) result_pattern_HBlobResolver_0_2_ActivityNode7_binding[0];

			Object[] result_pattern_HBlobResolver_0_2_ActivityNode7_black = pattern_HBlobResolver_0_2_ActivityNode7_blackB(
					newApg);
			if (result_pattern_HBlobResolver_0_2_ActivityNode7_black != null) {

				return new Object[] { newApg, _this, apg };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_HBlobResolver_0_3_ActivityNode1_blackBFBF(HAntiPatternGraph newApg,
			HBlobResolver _this) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (HAnnotation tmpBlob : newApg.getHAnnotations()) {
			if (tmpBlob instanceof HBlobAntiPattern) {
				HBlobAntiPattern blob = (HBlobAntiPattern) tmpBlob;
				TAnnotatable tmpTClass = blob.getTAnnotated();
				if (tmpTClass instanceof TClass) {
					TClass tClass = (TClass) tmpTClass;
					_result.add(new Object[] { newApg, blob, _this, tClass });
				}

			}
		}
		return _result;
	}

	public static final Object[] pattern_HBlobResolver_0_3_ActivityNode1_greenBBBFB(HAntiPatternGraph newApg,
			HBlobAntiPattern blob, HBlobResolver _this, TClass tClass) {
		HBlobResolveAnnotation annotation = RefactoringgraphFactory.eINSTANCE.createHBlobResolveAnnotation();
		blob.getPartOf().add(annotation);
		_this.getHAnnotation().add(annotation);
		newApg.getHAnnotations().add(annotation);
		annotation.setHBlobAntiPattern(blob);
		annotation.setTAnnotated(tClass);
		return new Object[] { newApg, blob, _this, annotation, tClass };
	}

	public static final boolean pattern_HBlobResolver_0_4_ActivityNode10_expressionFBB(HBlobResolver _this,
			TClass tClass) {
		boolean _localVariable_0 = _this.allowedToTouch(tClass);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_HBlobResolver_0_5_ActivityNode11_blackBF(TClass tClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TMember tDefinition : tClass.getDefines()) {
			_result.add(new Object[] { tClass, tDefinition });
		}
		return _result;
	}

	public static final boolean pattern_HBlobResolver_0_6_ActivityNode12_expressionFBB(HBlobResolver _this,
			TMember tDefinition) {
		boolean _localVariable_0 = _this.allowedToTouch(tDefinition);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_HBlobResolver_0_7_ActivityNode14_blackBF(TMember tDefinition) {
		for (TAnnotation tmpIba : tDefinition.getTAnnotation()) {
			if (tmpIba instanceof HInBlobAccess) {
				HInBlobAccess iba = (HInBlobAccess) tmpIba;
				return new Object[] { tDefinition, iba };
			}
		}
		return null;
	}

	public static final Object[] pattern_HBlobResolver_0_8_ActivityNode24_bindingFB(HInBlobAccess iba) {
		HRelativeValue _localVariable_0 = iba.getRelativeAmount();
		HRelativeValue ibaRelative = _localVariable_0;
		if (ibaRelative != null) {
			return new Object[] { ibaRelative, iba };
		}
		return null;
	}

	public static final Object[] pattern_HBlobResolver_0_8_ActivityNode24_blackB(HRelativeValue ibaRelative) {
		return new Object[] { ibaRelative };
	}

	public static final Object[] pattern_HBlobResolver_0_8_ActivityNode24_bindingAndBlackFB(HInBlobAccess iba) {
		Object[] result_pattern_HBlobResolver_0_8_ActivityNode24_binding = pattern_HBlobResolver_0_8_ActivityNode24_bindingFB(
				iba);
		if (result_pattern_HBlobResolver_0_8_ActivityNode24_binding != null) {
			HRelativeValue ibaRelative = (HRelativeValue) result_pattern_HBlobResolver_0_8_ActivityNode24_binding[0];

			Object[] result_pattern_HBlobResolver_0_8_ActivityNode24_black = pattern_HBlobResolver_0_8_ActivityNode24_blackB(
					ibaRelative);
			if (result_pattern_HBlobResolver_0_8_ActivityNode24_black != null) {

				return new Object[] { ibaRelative, iba };
			}
		}
		return null;
	}

	public static final Object[] pattern_HBlobResolver_0_9_ActivityNode15_blackB(HRelativeValue ibaRelative) {
		HRelativeValueConstants ibaRelative_value = ibaRelative.getValue();
		if (ibaRelative_value.equals(HRelativeValueConstants.VERY_LOW)) {
			return new Object[] { ibaRelative };
		}

		return null;
	}

	public static final Object[] pattern_HBlobResolver_0_10_ActivityNode23_blackB(HRelativeValue ibaRelative) {
		HRelativeValueConstants ibaRelative_value = ibaRelative.getValue();
		if (ibaRelative_value.equals(HRelativeValueConstants.LOW)) {
			return new Object[] { ibaRelative };
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_HBlobResolver_0_12_ActivityNode16_blackBF(TMember tDefinition) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TAnnotation tmpM2dc : tDefinition.getTAnnotation()) {
			if (tmpM2dc instanceof HMethodToDataClassAccess) {
				HMethodToDataClassAccess m2dc = (HMethodToDataClassAccess) tmpM2dc;
				_result.add(new Object[] { tDefinition, m2dc });
			}
		}
		return _result;
	}

	public static final Object[] pattern_HBlobResolver_0_13_ActivityNode17_bindingFB(HMethodToDataClassAccess m2dc) {
		HRelativeValue _localVariable_0 = m2dc.getRelativeAmount();
		HRelativeValue m2dcRelative = _localVariable_0;
		if (m2dcRelative != null) {
			return new Object[] { m2dcRelative, m2dc };
		}
		return null;
	}

	public static final Object[] pattern_HBlobResolver_0_13_ActivityNode17_blackB(HRelativeValue m2dcRelative) {
		HRelativeValueConstants m2dcRelative_value = m2dcRelative.getValue();
		if (m2dcRelative_value.equals(HRelativeValueConstants.VERY_HIGH)) {
			return new Object[] { m2dcRelative };
		}

		return null;
	}

	public static final Object[] pattern_HBlobResolver_0_13_ActivityNode17_bindingAndBlackFB(
			HMethodToDataClassAccess m2dc) {
		Object[] result_pattern_HBlobResolver_0_13_ActivityNode17_binding = pattern_HBlobResolver_0_13_ActivityNode17_bindingFB(
				m2dc);
		if (result_pattern_HBlobResolver_0_13_ActivityNode17_binding != null) {
			HRelativeValue m2dcRelative = (HRelativeValue) result_pattern_HBlobResolver_0_13_ActivityNode17_binding[0];

			Object[] result_pattern_HBlobResolver_0_13_ActivityNode17_black = pattern_HBlobResolver_0_13_ActivityNode17_blackB(
					m2dcRelative);
			if (result_pattern_HBlobResolver_0_13_ActivityNode17_black != null) {

				return new Object[] { m2dcRelative, m2dc };
			}
		}
		return null;
	}

	public static final Object[] pattern_HBlobResolver_0_14_ActivityNode29_blackFBB(HMethodToDataClassAccess m2dc,
			TMember tDefinition) {
		TClass tTargetClass = m2dc.getHDataClass();
		if (tTargetClass != null) {
			return new Object[] { tTargetClass, m2dc, tDefinition };
		}

		return null;
	}

	public static final Object[] pattern_HBlobResolver_0_14_ActivityNode29_greenBF(TMember tDefinition) {
		TMemberContainer tContainer = ContainersFactory.eINSTANCE.createTMemberContainer();
		tContainer.getTMembers().add(tDefinition);
		return new Object[] { tDefinition, tContainer };
	}

	public static final Object[] pattern_HBlobResolver_0_15_CreateMoves_bindingFBBBBB(HBlobResolver _this,
			TMemberContainer tContainer, TClass tClass, TClass tTargetClass, HBlobResolveAnnotation annotation) {
		HMoveMembers _localVariable_0 = _this.createMove(tContainer, tClass, tTargetClass, annotation);
		HMoveMembers hMoves = _localVariable_0;
		if (hMoves != null) {
			return new Object[] { hMoves, _this, tContainer, tClass, tTargetClass, annotation };
		}
		return null;
	}

	public static final Object[] pattern_HBlobResolver_0_15_CreateMoves_blackB(HMoveMembers hMoves) {
		return new Object[] { hMoves };
	}

	public static final Object[] pattern_HBlobResolver_0_15_CreateMoves_bindingAndBlackFBBBBB(HBlobResolver _this,
			TMemberContainer tContainer, TClass tClass, TClass tTargetClass, HBlobResolveAnnotation annotation) {
		Object[] result_pattern_HBlobResolver_0_15_CreateMoves_binding = pattern_HBlobResolver_0_15_CreateMoves_bindingFBBBBB(
				_this, tContainer, tClass, tTargetClass, annotation);
		if (result_pattern_HBlobResolver_0_15_CreateMoves_binding != null) {
			HMoveMembers hMoves = (HMoveMembers) result_pattern_HBlobResolver_0_15_CreateMoves_binding[0];

			Object[] result_pattern_HBlobResolver_0_15_CreateMoves_black = pattern_HBlobResolver_0_15_CreateMoves_blackB(
					hMoves);
			if (result_pattern_HBlobResolver_0_15_CreateMoves_black != null) {

				return new Object[] { hMoves, _this, tContainer, tClass, tTargetClass, annotation };
			}
		}
		return null;
	}

	public static final Object[] pattern_HBlobResolver_0_17_ActivityNode26_blackBBBB(TMember tDefinition,
			HBlobResolveAnnotation annotation, HAntiPatternGraph apg, HInBlobAccess iba) {
		return new Object[] { tDefinition, annotation, apg, iba };
	}

	public static final Object[] pattern_HBlobResolver_0_17_ActivityNode26_greenFBBBB(TMember tDefinition,
			HBlobResolveAnnotation annotation, HAntiPatternGraph apg, HInBlobAccess iba) {
		HExtractClass extract = RefactoringsFactory.eINSTANCE.createHExtractClass();
		extract.getTMembers().add(tDefinition);
		extract.setTAnnotated(tDefinition);
		extract.getPartOf().add(annotation);
		apg.getHAnnotations().add(extract);
		extract.getPartOf().add(iba);
		annotation.getHRefactorings().add(extract);
		iba.getPartOf().add(extract);
		return new Object[] { extract, tDefinition, annotation, apg, iba };
	}

	public static final boolean pattern_HBlobResolver_0_18_ActivityNode27_expressionFBB(HBlobResolver _this,
			HExtractClass extract) {
		boolean _localVariable_0 = _this.isRefactoringPossible(extract);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_HBlobResolver_0_19_ActivityNode28_blackB(HExtractClass extract) {
		return new Object[] { extract };
	}

	public static final Object[] pattern_HBlobResolver_0_19_ActivityNode28_redB(HExtractClass extract) {
		return new Object[] { extract };
	}

	public static final Object[] pattern_HBlobResolver_0_20_ActivityNode21_blackBF(HBlobResolveAnnotation annotation) {
		for (HMoveMember oneMove : annotation.getHMoves()) {
			return new Object[] { annotation, oneMove };
		}
		return null;
	}

	public static final Object[] pattern_HBlobResolver_0_21_ActivityNode22_blackB(HBlobResolveAnnotation annotation) {
		return new Object[] { annotation };
	}

	public static final Object[] pattern_HBlobResolver_0_21_ActivityNode22_redB(HBlobResolveAnnotation annotation) {
		return new Object[] { annotation };
	}

	public static final Object[] pattern_HBlobResolver_0_22_ActivityNode13_blackB(HBlobResolveAnnotation annotation) {
		return new Object[] { annotation };
	}

	public static final Object[] pattern_HBlobResolver_0_22_ActivityNode13_redB(HBlobResolveAnnotation annotation) {
		return new Object[] { annotation };
	}

	public static final boolean pattern_HBlobResolver_0_23_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	private MoveMember move;

	@Override
	public String getGuiName() {
		return "Resolve Blob [Anti-Pattern]";
	}

	// [user code injected with eMoflon] -->
} //HBlobResolverImpl
