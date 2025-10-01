/**
 */
package org.gravity.hulk.detection.impl;

import java.util.ArrayList;
// <-- [user defined imports]
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gravity.hulk.HAntiPatternHandling;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HMetric;
import org.gravity.hulk.antipatterngraph.values.HRelativeValueConstants;
import org.gravity.hulk.detection.HulkDetector;
// [user defined imports] -->
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.moflon.core.dfs.impl.NodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HDetector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.gravity.hulk.detection.impl.HDetectorImpl#getHAnnotation
 * <em>HAnnotation</em>}</li>
 * <li>{@link org.gravity.hulk.detection.impl.HDetectorImpl#getHAntiPatternHandling
 * <em>HAnti Pattern Handling</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class HDetectorImpl extends NodeImpl implements HDetector {

	private static final Logger LOGGER = Logger.getLogger(HDetectorImpl.class);

	/**
	 * The cached value of the '{@link #getHAnnotation() <em>HAnnotation</em>}'
	 * reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getHAnnotation()
	 * @generated
	 * @ordered
	 */
	protected List<HAnnotation> hAnnotation;

	/**
	 * The cached value of the '{@link #getHAntiPatternHandling() <em>HAnti Pattern
	 * Handling</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getHAntiPatternHandling()
	 * @generated
	 * @ordered
	 */
	protected HAntiPatternHandling hAntiPatternHandling;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected HDetectorImpl() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public List<HAnnotation> getHAnnotation() {
		if (this.hAnnotation == null) {
			this.hAnnotation = new ArrayList<>();
		}
		return this.hAnnotation;
	}

	@Override
	public final boolean hasAlreadyBeenAnnotated(final TClass tClass) {
		for (final TAnnotation tmpExisting : tClass.getTAnnotation()) {
			if (tmpExisting instanceof final HAnnotation existing
					&& this.getHAnnotation().contains(existing)) {
				return true;
			}

		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HAntiPatternHandling getHAntiPatternHandling() {
		return this.hAntiPatternHandling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setHAntiPatternHandling(final HAntiPatternHandling newHAntiPatternHandling) {
		this.hAntiPatternHandling = newHAntiPatternHandling;
		this.hAntiPatternHandling.getHDetector().add(this);
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

	protected <T extends TAnnotation> T get(final List<TAnnotation> annotations, final Class<T> type) {
		for (final var ann : annotations) {
			if (type.isInstance(ann)) {
				return type.cast(ann);
			}
		}
		return null;
	}

	// [user code injected with eMoflon] -->
} // HDetectorImpl
