/**
 */
package org.gravity.hulk.detection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gravity.hulk.HAntiPatternHandling;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;
import org.gravity.hulk.dfs.Node;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.gravity.typegraph.basic.annotations.TAnnotation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HDetector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.HDetectorImpl.gravity.hulk.detection.HDetector#getHAnnotation
 * <em>HAnnotation</em>}</li>
 * <li>{@link org.HDetectorImpl.gravity.hulk.detection.HDetector#getHAntiPatternHandling
 * <em>HAnti Pattern Handling</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class HDetectorImpl extends Node implements HDetector {

	private static final Logger LOGGER = Logger.getLogger(HDetectorImpl.class);

	protected List<HAnnotation> hAnnotation;

	protected HAntiPatternHandling hAntiPatternHandling;

	@Override
	public List<HAnnotation> getHAnnotation() {
		if (this.hAnnotation == null) {
			this.hAnnotation = new LinkedList<>();
		}
		return this.hAnnotation;
	}

	@Override
	public final boolean hasAlreadyBeenAnnotated(final TClass tClass) {
		for (final TAnnotation tmpExisting : tClass.getTAnnotation()) {
			if (tmpExisting instanceof final HAnnotation existing) {
				if (this.getHAnnotation().contains(existing)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public HAntiPatternHandling getHAntiPatternHandling() {
		return this.hAntiPatternHandling;
	}

	@Override
	public void setHAntiPatternHandling(final HAntiPatternHandling newHAntiPatternHandling) {
		this.hAntiPatternHandling = newHAntiPatternHandling;
	}

	protected double calculateRelativeThreshold(final HRelativeValueConstants level,
			final Class<? extends HMetric> clazz) {
		final var annotations = this.getHAntiPatternHandling().getApg().getHAnnotations();

		final List<Double> keys = new LinkedList<>();
		for (final HAnnotation a : annotations) {
			if (clazz.isAssignableFrom(a.getClass())) {
				final var key = ((HMetric) a).getValue();
				keys.add(key);
			}
		}
		final var size = keys.size();
		if (keys.isEmpty()) {
			final var value = HulkDetector.getDefaultThresholds().get(clazz.getName());
			if ((value == null) || value.isBlank()) {
				LOGGER.error("No default value for: " + clazz.getName());
				return Double.NaN;
			}
			return Double.parseDouble(value);
		}

		Collections.sort(keys);

		return switch (level) {
			case VERY_LOW -> keys.get((size * 1) / 6);
			case LOW -> keys.get((size * 2) / 6);
			case MEDIUM -> keys.get((size * 3) / 6);
			case HIGH -> keys.get((size * 4) / 6);
			case VERY_HIGH -> keys.get((size * 5) / 6);
		};
	}

	public void removeAnnotations(final TAnnotatable annotated) {
		final var annotations = annotated.getTAnnotation();
		final List<TAnnotation> delete = new LinkedList<>();
		for (var i = annotations.size() - 1; i >= 0; i--) {
			if (this.getHAnnotationType().isInstance(annotations.get(i))) {
				delete.add(annotations.remove(i));
			}
		}
		EcoreUtil.deleteAll(delete, true);
	}

	@Override
	public abstract EClass getHAnnotationType();

	@Override
	public abstract boolean detect(HAntiPatternGraph apg);

	@Override
	public abstract String getGuiName();

} // HDetectorImpl
