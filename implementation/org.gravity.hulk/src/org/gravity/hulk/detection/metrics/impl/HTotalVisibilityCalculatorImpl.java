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
import org.gravity.typegraph.basic.TMember;

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
	private static final EClass METRIC_TYPE = org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE.getHTotalVisibilityMetric();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HTotalVisibilityCalculatorImpl() {
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
	@Override
	public boolean detect(final HAntiPatternGraph apg) {
		// [user code injected with eMoflon]
		var totalValue = 0;
		final var pg = apg.getModel();
		for (final TClass tClass : pg.getClasses()) {
			if (!tClass.isTLib()) {
				var value = 0;
				for (final TMember tMember : tClass.getDefines()) {
					final var tModifier = tMember.getTModifier();
					if (tModifier == null) {
						//System.err.println("The member \"" + tMember.getSignatureString() + "\" in the  class \""
						//		+ tClass.getFullyQualifiedName() + "\" has no modifier.");
					} else {
						final var tVisibility = tModifier.getTVisibility();
						if (tVisibility != null) {
							switch (tVisibility) {
							case TPUBLIC:
								value += this.publicValue;
								break;
							case TPROTECTED:
								value += this.protectedValue;
								break;
							case TPACKAGE:
								value += this.packageValue;
								break;
							case TPRIVATE:
								value += this.privateValue;
								break;
							}
						}
					}
				}
				totalValue += value;
				addMetric(tClass, METRIC_TYPE, value);
			}
		}
		addMetric(pg, METRIC_TYPE, totalValue);
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MetricsPackage.HTOTAL_VISIBILITY_CALCULATOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	//TODO: make values changeable
	private final int privateValue = 0; //SearchParameters.privateValue;
	private final int packageValue = 1; //SearchParameters.packageValue;
	private final int protectedValue = 2; //SearchParameters.protectedValue;
	private final int publicValue = 3; //SearchParameters.publicValue;

	@Override
	public String getGuiName() {
		return "TotalMethodVisibility";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.metrics.MetricsPackage.eINSTANCE.getHTotalVisibilityMetric();
	}

	// [user code injected with eMoflon] -->
} //HTotalVisibilityCalculatorImpl
