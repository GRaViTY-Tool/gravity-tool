package org.gravity.security.analysis;

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.metrics.security.SecurityFactory;
import org.gravity.hulk.antipatterngraph.metrics.security.SecurityPackage;
import org.gravity.hulk.detection.HMetricCalculator;
import org.gravity.hulk.detection.impl.HDetectorImpl;
import org.gravity.security.annotations.requirements.RequirementsPackage;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TypeGraph;

public class CriticalClassRatioCalculator extends HDetectorImpl implements HMetricCalculator {

	@Override
	public String getGuiName() {
		return "Critical Class Ratio Calulator";
	}

	@Override
	public EClass getHAnnotationType() {
		return SecurityPackage.eINSTANCE.getCriticalClassRatio();
	}

	@Override
	public boolean detect(final HAntiPatternGraph apg) {
		final var value = calculate(apg.getModel());

		final var metric = SecurityFactory.eINSTANCE.createCriticalClassRatio();
		metric.setValue(value);
		metric.setApg(apg);
		metric.setTAnnotated(apg.getModel());

		return true;
	}

	/**
	 * @param model The program model the ratio should be calculated for
	 * @return
	 */
	public static double calculate(final TypeGraph model) {
		final var classes = model.getDeclaredTClasses();
		final var critical = classes.parallelStream().filter(CriticalClassRatioCalculator::isCritical).count();
		return critical / (double) classes.size();
	}

	private static boolean isCritical(final TClass clazz) {
		// Does this class define a critical member
		for (final TMember member : clazz.getDefines()) {
			if (!member.getTAnnotation(RequirementsPackage.eINSTANCE.getTAbstractCriticalElement()).isEmpty()) {
				return true;
			}
		}

		// Is a critical member accessed from this class
		for (final TMember member : clazz.getDefines()) {
			for (final TAccess access : member.getAccessing()) {
				if (!access.getTarget().getTAnnotation(RequirementsPackage.eINSTANCE.getTAbstractCriticalElement())
						.isEmpty()) {
					return true;
				}
			}
		}

		return false;
	}
}
