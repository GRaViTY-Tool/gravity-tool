/**
 */
package org.gravity.hulk.detection.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.gravity.hulk.detection.DetectionPackage;
import org.gravity.hulk.detection.HClassBasedCalculator;

import org.gravity.hulk.impl.HDetectorImpl;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HClass
 * Based Calculator</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class HClassBasedCalculatorImpl extends HDetectorImpl implements HClassBasedCalculator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected HClassBasedCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DetectionPackage.Literals.HCLASS_BASED_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean detect(HAntiPatternGraph pg) {// ForEach
		for (TClass tClass : getClassesToVisit(pg, this)) {
			HAnnotation metric = calculate(tClass);
			if (metric != null) {
				metric.setTAnnotated(tClass);
				pg.getHAnnotations().add(metric);
				getHAnnotation().add(metric);

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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case DetectionPackage.HCLASS_BASED_CALCULATOR___CALCULATE__TCLASS:
			return calculate((TClass) arguments.get(0));
		case DetectionPackage.HCLASS_BASED_CALCULATOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Iterable<TClass> getClassesToVisit(HAntiPatternGraph apg, HDetector detector) {
		List<TClass> result = new LinkedList<>();
		TypeGraph pm = apg.getModel();
		if (pm != null) {
			for (TClass tClass : pm.getClasses()) {
				if (!tClass.isTLib() && !"Anonymous".equals(tClass.getTName()) && !"T".equals(tClass.getTName())
						&& !detector.hasAlreadyBeenAnnotated(tClass)) {
					result.add(tClass);

				}
			}
		}
		return result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HClassBasedCalculatorImpl
