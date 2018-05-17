/**
 */
package org.gravity.refactorings.impl;

import java.lang.Iterable;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.refactorings.configuration.TRefactoringID;
import org.gravity.refactorings.configuration.impl.ExtractSuperClassConfiguration;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TSignature;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Extract
 * Superclass</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.gravity.refactorings.impl.Extract_SuperclassImpl#getCreate_Superclass
 * <em>Create Superclass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Extract_SuperclassImpl extends RefactoringImpl {

	@Override
	public boolean isApplicable(RefactoringConfiguration configuration) {
		if (getRefactoringID() == configuration.getRefactoringID()) {
			ExtractSuperClassConfiguration esc = (ExtractSuperClassConfiguration) configuration;
			return isApplicable(esc.getChildren(), esc.getNewParent(), esc.getSignatures());
		}
		return false;
	}

	@Override
	public Collection<TClass> perform(RefactoringConfiguration configuration) {
		if (getRefactoringID() == configuration.getRefactoringID()) {
			ExtractSuperClassConfiguration esc = (ExtractSuperClassConfiguration) configuration;
			return perform(esc.getChildren(), esc.getNewParent(), esc.getSignatures());
		}
		return Collections.emptyList();
	}
	
	public List<TClass> perform(List<TClass> children, TClass new_parent, List<TSignature> signatures) {

		Create_SuperclassImpl csc = new Create_SuperclassImpl();
		HelpersImpl helpers = new HelpersImpl();
		setHelpersImpl(helpers);
		
		List<TClass> csc_result = csc.perform(children, new_parent);
		// ForEach
		for (Object[] result4_black : Extract_SuperclassImpl
				.pattern_Extract_Superclass_0_4_ActivityNode197_blackBF(signatures)) {
			TSignature tSignature = (TSignature) result4_black[1];

			Object[] result5_bindingAndBlack = Extract_SuperclassImpl
					.pattern_Extract_Superclass_0_5_ActivityNode198_bindingAndBlackFBBB(helpers, children, tSignature);
			if (result5_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[helpers] = " + helpers + ", "
						+ "[children] = " + children + ", " + "[tSignature] = " + tSignature + ".");
			}
			TMember bestDefinition = (TMember) result5_bindingAndBlack[0];
			//
			Object[] result6_black = Extract_SuperclassImpl
					.pattern_Extract_Superclass_0_6_ActivityNode218_blackBFB(bestDefinition, tSignature);
			if (result6_black != null) {
				TClass tOwnerClass = (TClass) result6_black[1];

				Object[] result7_black = Extract_SuperclassImpl.pattern_Extract_Superclass_0_7_ActivityNode219_blackBBB(
						tOwnerClass, bestDefinition, tSignature);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tOwnerClass] = "
							+ tOwnerClass + ", " + "[bestDefinition] = " + bestDefinition + ", " + "[tSignature] = "
							+ tSignature + ".");
				}
				Extract_SuperclassImpl.pattern_Extract_Superclass_0_7_ActivityNode219_redBBB(tOwnerClass,
						bestDefinition, tSignature);

			} else {
			}

			Object[] result8_black = Extract_SuperclassImpl
					.pattern_Extract_Superclass_0_8_ActivityNode215_blackBBB(new_parent, bestDefinition, tSignature);
			if (result8_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[new_parent] = " + new_parent
						+ ", " + "[bestDefinition] = " + bestDefinition + ", " + "[tSignature] = " + tSignature + ".");
			}
			Extract_SuperclassImpl.pattern_Extract_Superclass_0_8_ActivityNode215_greenBBB(new_parent, bestDefinition,
					tSignature);

			// ForEach
			for (Object[] result9_black : Extract_SuperclassImpl
					.pattern_Extract_Superclass_0_9_ActivityNode199_blackBBF(children, tSignature)) {
				TClass child = (TClass) result9_black[2];
				//
				Extract_SuperclassImpl.pattern_Extract_Superclass_0_10_ActivityNode200_expressionFBBBB(helpers, child,
						new_parent, tSignature);

			}

		}
		return Extract_SuperclassImpl.pattern_Extract_Superclass_0_11_expressionFB(csc_result);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isApplicable(List<TClass> children, TClass new_parent, List<TSignature> signatures) {

		Create_SuperclassImpl csc = new Create_SuperclassImpl();

		if (csc.isApplicable(children, new_parent)) {
			// ForEach
			for (Object[] result4_black : Extract_SuperclassImpl
					.pattern_Extract_Superclass_1_4_ActivityNode96_blackFBFB(children, signatures)) {
				TClass child = (TClass) result4_black[0];
				TSignature tSignature = (TSignature) result4_black[2];
				//
				Object[] result5_black = Extract_SuperclassImpl
						.pattern_Extract_Superclass_1_5_ActivityNode169_blackBB(child, tSignature);
				if (result5_black != null) {

					List<TMember> allOutgoingAccesses = Search.getAllOutgoingAccesses(tSignature, child);
					//
					Object[] result7_black = Extract_SuperclassImpl
							.pattern_Extract_Superclass_1_7_ActivityNode157_blackBBFB(allOutgoingAccesses, child,
									signatures);
					if (result7_black != null) {
						// nothing TFieldDefinition tChildFieldDefinition = (TFieldDefinition)
						// result7_black[2];
						return Extract_SuperclassImpl.pattern_Extract_Superclass_1_8_expressionF();
					} else {
						//
						Object[] result9_black = Extract_SuperclassImpl
								.pattern_Extract_Superclass_1_9_ActivityNode158_blackBBFB(child, allOutgoingAccesses,
										signatures);
						if (result9_black != null) {
							// nothing TMethodDefinition tChildmethodDefinition = (TMethodDefinition)
							// result9_black[2];
							return Extract_SuperclassImpl.pattern_Extract_Superclass_1_10_expressionF();
						} else {
						}

					}

				} else {
					return Extract_SuperclassImpl.pattern_Extract_Superclass_1_11_expressionF();
				}

			}
			return Extract_SuperclassImpl.pattern_Extract_Superclass_1_12_expressionF();
		} else {
			return Extract_SuperclassImpl.pattern_Extract_Superclass_1_13_expressionF();
		}

	}

	public static final Object[] pattern_Extract_Superclass_0_3_ActivityNode99_blackB(List<TClass> csc_result) {
		return new Object[] { csc_result };
	}

	public static final Iterable<Object[]> pattern_Extract_Superclass_0_4_ActivityNode197_blackBF(
			List<TSignature> signatures) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TSignature tSignature : signatures) {
			_result.add(new Object[] { signatures, tSignature });
		}
		return _result;
	}

	public static final Object[] pattern_Extract_Superclass_0_5_ActivityNode198_bindingFBBB(HelpersImpl helpers,
			List<TClass> children, TSignature tSignature) {
		TMember _localVariable_0 = helpers.esc_Helper_GetBestTMember(children, tSignature);
		TMember bestDefinition = _localVariable_0;
		if (bestDefinition != null) {
			return new Object[] { bestDefinition, helpers, children, tSignature };
		}
		return null;
	}

	public static final Object[] pattern_Extract_Superclass_0_5_ActivityNode198_blackB(TMember bestDefinition) {
		return new Object[] { bestDefinition };
	}

	public static final Object[] pattern_Extract_Superclass_0_5_ActivityNode198_bindingAndBlackFBBB(HelpersImpl helpers,
			List<TClass> children, TSignature tSignature) {
		Object[] result_pattern_Extract_Superclass_0_5_ActivityNode198_binding = pattern_Extract_Superclass_0_5_ActivityNode198_bindingFBBB(
				helpers, children, tSignature);
		if (result_pattern_Extract_Superclass_0_5_ActivityNode198_binding != null) {
			TMember bestDefinition = (TMember) result_pattern_Extract_Superclass_0_5_ActivityNode198_binding[0];

			Object[] result_pattern_Extract_Superclass_0_5_ActivityNode198_black = pattern_Extract_Superclass_0_5_ActivityNode198_blackB(
					bestDefinition);
			if (result_pattern_Extract_Superclass_0_5_ActivityNode198_black != null) {

				return new Object[] { bestDefinition, helpers, children, tSignature };
			}
		}
		return null;
	}

	public static final Object[] pattern_Extract_Superclass_0_6_ActivityNode218_blackBFB(TMember bestDefinition,
			TSignature tSignature) {
		TAbstractType tmpTOwnerClass = bestDefinition.getDefinedBy();
		if (tmpTOwnerClass instanceof TClass) {
			TClass tOwnerClass = (TClass) tmpTOwnerClass;
			if (tOwnerClass.getSignature().contains(tSignature)) {
				return new Object[] { bestDefinition, tOwnerClass, tSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_Extract_Superclass_0_7_ActivityNode219_blackBBB(TClass tOwnerClass,
			TMember bestDefinition, TSignature tSignature) {
		if (tOwnerClass.getSignature().contains(tSignature)) {
			if (tOwnerClass.equals(bestDefinition.getDefinedBy())) {
				return new Object[] { tOwnerClass, bestDefinition, tSignature };
			}
		}
		return null;
	}

	public static final Object[] pattern_Extract_Superclass_0_7_ActivityNode219_redBBB(TClass tOwnerClass,
			TMember bestDefinition, TSignature tSignature) {
		tOwnerClass.getSignature().remove(tSignature);
		bestDefinition.setDefinedBy(null);
		return new Object[] { tOwnerClass, bestDefinition, tSignature };
	}

	public static final Object[] pattern_Extract_Superclass_0_8_ActivityNode215_blackBBB(TClass new_parent,
			TMember bestDefinition, TSignature tSignature) {
		return new Object[] { new_parent, bestDefinition, tSignature };
	}

	public static final Object[] pattern_Extract_Superclass_0_8_ActivityNode215_greenBBB(TClass new_parent,
			TMember bestDefinition, TSignature tSignature) {
		new_parent.getSignature().add(tSignature);
		bestDefinition.setDefinedBy(new_parent);
		return new Object[] { new_parent, bestDefinition, tSignature };
	}

	public static final Iterable<Object[]> pattern_Extract_Superclass_0_9_ActivityNode199_blackBBF(
			List<TClass> children, TSignature tSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TClass child : children) {
			if (child.getSignature().contains(tSignature)) {
				_result.add(new Object[] { children, tSignature, child });
			}
		}
		return _result;
	}

	public static final boolean pattern_Extract_Superclass_0_10_ActivityNode200_expressionFBBBB(HelpersImpl helpers,
			TClass child, TClass new_parent, TSignature tSignature) {
		boolean _localVariable_0 = helpers.esc_Helper_MountAccesses(child, new_parent, tSignature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final List<TClass> pattern_Extract_Superclass_0_11_expressionFB(List<TClass> csc_result) {
		List<TClass> _result = csc_result;
		return _result;
	}

	public static final Iterable<Object[]> pattern_Extract_Superclass_1_4_ActivityNode96_blackFBFB(
			List<TClass> children, List<TSignature> signatures) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TClass child : children) {
			for (TSignature tSignature : signatures) {
				_result.add(new Object[] { child, children, tSignature, signatures });
			}
		}
		return _result;
	}

	public static final Object[] pattern_Extract_Superclass_1_5_ActivityNode169_blackBB(TClass child,
			TSignature tSignature) {
		if (child.getSignature().contains(tSignature)) {
			return new Object[] { child, tSignature };
		}
		return null;
	}

	public static final Object[] pattern_Extract_Superclass_1_7_ActivityNode157_black_nac_0BB(
			TFieldDefinition tChildFieldDefinition, List<TSignature> signatures) {
		TFieldSignature tFieldSignatureFromContainer = tChildFieldDefinition.getSignature();
		if (tFieldSignatureFromContainer != null) {
			if (signatures.contains(tFieldSignatureFromContainer)) {
				return new Object[] { tChildFieldDefinition, signatures };
			}
		}

		return null;
	}

	public static final Object[] pattern_Extract_Superclass_1_7_ActivityNode157_blackBBFB(
			List<TMember> allOutgoingAccesses, TClass child, List<TSignature> signatures) {
		for (TMember tmpTChildFieldDefinition : allOutgoingAccesses) {
			if (tmpTChildFieldDefinition instanceof TFieldDefinition) {
				TFieldDefinition tChildFieldDefinition = (TFieldDefinition) tmpTChildFieldDefinition;
				if (child.equals(tChildFieldDefinition.getDefinedBy())) {
					if (pattern_Extract_Superclass_1_7_ActivityNode157_black_nac_0BB(tChildFieldDefinition,
							signatures) == null) {
						return new Object[] { allOutgoingAccesses, child, tChildFieldDefinition, signatures };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_Extract_Superclass_1_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_Extract_Superclass_1_9_ActivityNode158_black_nac_0BB(
			TMethodDefinition tChildmethodDefinition, List<TSignature> signatures) {
		TMethodSignature tMethodSignatureFromContainer = tChildmethodDefinition.getSignature();
		if (tMethodSignatureFromContainer != null) {
			if (signatures.contains(tMethodSignatureFromContainer)) {
				return new Object[] { tChildmethodDefinition, signatures };
			}
		}

		return null;
	}

	public static final Object[] pattern_Extract_Superclass_1_9_ActivityNode158_blackBBFB(TClass child,
			List<TMember> allOutgoingAccesses, List<TSignature> signatures) {
		for (TMember tmpTChildmethodDefinition : child.getDefines()) {
			if (tmpTChildmethodDefinition instanceof TMethodDefinition) {
				TMethodDefinition tChildmethodDefinition = (TMethodDefinition) tmpTChildmethodDefinition;
				if (allOutgoingAccesses.contains(tChildmethodDefinition)) {
					if (pattern_Extract_Superclass_1_9_ActivityNode158_black_nac_0BB(tChildmethodDefinition,
							signatures) == null) {
						return new Object[] { child, allOutgoingAccesses, tChildmethodDefinition, signatures };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_Extract_Superclass_1_10_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final boolean pattern_Extract_Superclass_1_11_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final boolean pattern_Extract_Superclass_1_12_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Extract_Superclass_1_13_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Iterable<Object[]> pattern_Extract_Superclass_2_5_ActivityNode172_blackBF(
			List<TSignature> signatureList) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TSignature tSignature : signatureList) {
			_result.add(new Object[] { signatureList, tSignature });
		}
		return _result;
	}

	public static final List<TClass> pattern_Extract_Superclass_2_6_expressionFB(List<TClass> returnList) {
		List<TClass> _result = returnList;
		return _result;
	}

	@Override
	public TRefactoringID getRefactoringID() {
		return TRefactoringID.TExtractClass;
	}
}