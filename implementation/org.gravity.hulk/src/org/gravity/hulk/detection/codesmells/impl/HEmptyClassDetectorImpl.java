/**
 */
package org.gravity.hulk.detection.codesmells.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.codesmells.CodesmellsFactory;
import org.gravity.hulk.detection.codesmells.CodesmellsPackage;
import org.gravity.hulk.detection.codesmells.HEmptyClassDetector;
import org.gravity.hulk.detection.impl.HClassBasedCalculatorImpl;
import org.gravity.typegraph.basic.TClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HEmpty Class Detector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HEmptyClassDetectorImpl extends HClassBasedCalculatorImpl implements HEmptyClassDetector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HEmptyClassDetectorImpl() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodesmellsPackage.Literals.HEMPTY_CLASS_DETECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HAnnotation calculate(final TClass tClass) {//
		removeAnnotations(tClass);

		if (!tClass.isTLib()&& tClass.getDefines().isEmpty()) {
			final var smell = CodesmellsFactory.eINSTANCE.createHEmptyClassSmell();
			smell.setTAnnotated(tClass);
			getHAnnotation().add(smell);
			return smell;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		if (operationID == CodesmellsPackage.HEMPTY_CLASS_DETECTOR___CALCULATE__TCLASS) {
			return calculate((TClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	// <-- [user code injected with eMoflon]

	@Override
	public String getGuiName() {
		return "Empty Class Smell";
	}

	@Override
	public EClass getHAnnotationType() {
		return org.gravity.hulk.antipatterngraph.codesmells.CodesmellsPackage.eINSTANCE.getHEmptyClassSmell();
	}

	// [user code injected with eMoflon] -->
} //HEmptyClassDetectorImpl
