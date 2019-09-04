/**
 */
package org.gravity.hulk.detection.metrics.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.gravity.hulk.detection.impl.HMetricCalculatorImpl;

import org.gravity.hulk.detection.metrics.HTotalVisibilityCalculator;
import org.gravity.hulk.detection.metrics.MetricsPackage;
// <-- [user defined imports]
import org.gravity.typegraph.basic.TClass;
import org.gravity.hulk.antipatterngraph.metrics.HTotalVisibilityMetric;
import org.gravity.hulk.antipatterngraph.metrics.MetricsFactory;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TModifier;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.TypeGraph;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HTotal Visibility Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HTotalVisibilityCalculatorImpl extends HMetricCalculatorImpl implements HTotalVisibilityCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HTotalVisibilityCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.HTOTAL_VISIBILITY_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean detect(HAntiPatternGraph apg) {
		// [user code injected with eMoflon]
		int totalValue = 0;
		TypeGraph pg = apg.getPg();
		for (TClass tClass : pg.getClasses()) {
			if (!tClass.isTLib()) {
				int value = 0;
				for (TMember tMember : tClass.getDefines()) {
					TModifier tModifier = tMember.getTModifier();
					if (tModifier == null) {
						//System.err.println("The member \"" + tMember.getSignatureString() + "\" in the  class \""
						//		+ tClass.getFullyQualifiedName() + "\" has no modifier.");
					} else {
						TVisibility tVisibility = tModifier.getTVisibility();
						if (tVisibility != null) {
							switch (tVisibility) {
							case TPUBLIC:
								value += publicValue;
								break;
							case TPROTECTED:
								value += protectedValue;
								break;
							case TPACKAGE:
								value += packageValue;
								break;
							case TPRIVATE:
								value += privateValue;
								break;
							}
						}
					}
				}
				totalValue += value;
				HTotalVisibilityMetric metric = MetricsFactory.eINSTANCE.createHTotalVisibilityMetric();
				metric.setValue(value);
				metric.setTAnnotated(tClass);
				getHAnnotation().add(metric);
			}
		}
		HTotalVisibilityMetric metric = MetricsFactory.eINSTANCE.createHTotalVisibilityMetric();
		metric.setTAnnotated(pg);
		metric.setValue(totalValue);
		getHAnnotation().add(metric);

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HTOTAL_VISIBILITY_CALCULATOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	//TODO: make values changeable
	private int privateValue = 0; //SearchParameters.privateValue;
	private int packageValue = 1; //SearchParameters.packageValue;
	private int protectedValue = 2; //SearchParameters.protectedValue;
	private int publicValue = 3; //SearchParameters.publicValue;

	@Override
	public String getGuiName() {
		return "TotalMethodVisibility";
	}

	// [user code injected with eMoflon] -->
} //HTotalVisibilityCalculatorImpl
