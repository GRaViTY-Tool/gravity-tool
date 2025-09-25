/**
 */
package org.gravity.hulk.detection;

import java.util.LinkedList;
import java.util.List;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.typegraph.basic.TClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HClass
 * Based Calculator</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class HClassBasedCalculatorImpl extends HDetector {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected HClassBasedCalculatorImpl() {
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean detect(final HAntiPatternGraph apg) {// ForEach
		for (final TClass tClass : getClassesToVisit(apg, this)) {
			final var metric = this.calculate(tClass);
			if (metric != null) {
				metric.setTAnnotated(tClass);
				apg.getHAnnotations().add(metric);
				this.getHAnnotation().add(metric);
			}
		}
		return true;
	}

	public abstract HAnnotation calculate(final TClass tClass);

	public static final Iterable<TClass> getClassesToVisit(final HAntiPatternGraph apg, final HDetector detector) {
		final List<TClass> result = new LinkedList<>();
		final var pm = apg.getModel();
		if (pm != null) {
			for (final TClass tClass : pm.getClasses()) {
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
