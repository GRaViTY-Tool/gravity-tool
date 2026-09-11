/**
 */
package org.gravity.hulk.detection;

import java.util.LinkedList;
import java.util.List;

import org.gravity.hulk.HDetector;
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
public abstract class AbstractClassBasedCalculator extends AbstractHDetector {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected AbstractClassBasedCalculator() {
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean detect(final HAntiPatternGraph apg) {// ForEach
		for (final TClass tClass : getClassesToVisit(apg, this)) {
			final var result = this.calculate(tClass);
			if (result != null) {
				result.setTAnnotated(tClass);
				apg.getHAnnotations().add(result);
				this.getHAnnotation().add(result);
			}
		}
		return true;
	}

	protected abstract HAnnotation calculate(TClass tClass);

	private static final Iterable<TClass> getClassesToVisit(final HAntiPatternGraph apg, final HDetector detector) {
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

} // HClassBasedCalculatorImpl
