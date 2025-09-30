/**
 */
package org.gravity.hulk.resolve.impl;

import org.gravity.hulk.HAntiPatternResolving;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.detection.antipattern.impl.HBlobDetector;
import org.gravity.hulk.detection.metrics.impl.HAfferentCouplingCalculator;
import org.gravity.hulk.detection.metrics.impl.HEfferentCouplingCalculator;
import org.gravity.hulk.impl.HAntiPatternDetectionImpl;
import org.gravity.hulk.resolve.antipattern.HAlternativeBlobresolver;
import org.gravity.hulk.resolve.antipattern.HBlobResolver;
import org.gravity.hulk.resolve.antipattern.impl.HAlternativeBlobresolverImpl;
import org.gravity.hulk.resolve.antipattern.impl.HBlobResolverImpl;
import org.gravity.hulk.resolve.calculators.HClusterAccessCalculator;
import org.gravity.hulk.resolve.calculators.HClusterCalculator;
import org.gravity.hulk.resolve.calculators.HInBlobAccessCalculator;
import org.gravity.hulk.resolve.calculators.HMethodToDataClassAccessCalculator;
import org.gravity.hulk.resolve.calculators.impl.HClusterAccessCalculatorImpl;
import org.gravity.hulk.resolve.calculators.impl.HClusterCalculatorImpl;
import org.gravity.hulk.resolve.calculators.impl.HInBlobAccessCalculatorImpl;
import org.gravity.hulk.resolve.calculators.impl.HMethodToDataClassAccessCalculatorImpl;
import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.Node;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HAnti
 * Pattern Resolving</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HAntiPatternResolvingImpl extends HAntiPatternDetectionImpl implements HAntiPatternResolving {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public HAntiPatternResolvingImpl() {
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void createResolveCalculatorDependency(final DFSGraph graph) {

		HBlobDetector blobDetector = null;
		for (final Node tmpBlobDetector : graph.getNodes()) {
			if (tmpBlobDetector instanceof HBlobDetector) {
				blobDetector = (HBlobDetector) tmpBlobDetector;
				break;
			}
		}
		if (blobDetector == null) {
			throw new IllegalStateException("Couldn't find blob detector.");
		}
		final var m2dc = this.createMethodToDataClassAccessCalculator(graph,
				blobDetector);

		this.createHInBlobAccessCalculator(graph, m2dc);

		final var hCluster = this.createClusterCalculator(graph, blobDetector, m2dc);

		this.createClusterAccessCalculator(graph, hCluster);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DFSGraph getDependencyGraph() {

		final var graph = this.getSuperDependencyGraph();
		if (graph == null) {
			throw new IllegalStateException("Couldn't initialize resolver dependencies.");
		}
		//
		this.createResolveCalculatorDependency(graph);
		this.createResolveAntiPatternDependency(graph);
		return graph;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void createResolveAntiPatternDependency(final DFSGraph graph) {

		HMethodToDataClassAccessCalculator m2dc = null;
		HInBlobAccessCalculator iba = null;
		HAfferentCouplingCalculator haff = null;
		HEfferentCouplingCalculator heff = null;
		HClusterAccessCalculator hCluster = null;
		for (final HDetector detector : this.getHDetector()) {
			if (detector instanceof HClusterAccessCalculator) {
				hCluster = (HClusterAccessCalculator) detector;
			} else if (detector instanceof HInBlobAccessCalculator) {
				iba = (HInBlobAccessCalculator) detector;
			} else if (detector instanceof HMethodToDataClassAccessCalculator) {
				m2dc = (HMethodToDataClassAccessCalculator) detector;
			} else if (detector instanceof HAfferentCouplingCalculator) {
				haff = (HAfferentCouplingCalculator) detector;
			} else if (detector instanceof HEfferentCouplingCalculator) {
				heff = (HEfferentCouplingCalculator) detector;
			}
		}
		if (hCluster == null || m2dc == null || iba == null || haff == null || heff == null) {
			throw new IllegalStateException("Couldn't find all required calculators.");
		}

		this.createBlobResolver(graph, m2dc, iba, haff, heff);
		this.createAlternativeBlobResolver(graph, hCluster, m2dc);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DFSGraph getSuperDependencyGraph() {
		// [user code injected with eMoflon]

		return super.getDependencyGraph();

	}

	public final HMethodToDataClassAccessCalculator createMethodToDataClassAccessCalculator(final DFSGraph graph,
			final HBlobDetector blobDetector) {
		final var m2dc = new HMethodToDataClassAccessCalculatorImpl(graph, blobDetector);
		m2dc.setHAntiPatternHandling(this);
		return m2dc;
	}

	public final HInBlobAccessCalculator createHInBlobAccessCalculator(final DFSGraph graph,
			final HMethodToDataClassAccessCalculator m2dc) {
		final var iba = new HInBlobAccessCalculatorImpl(graph, m2dc);
		iba.setHAntiPatternHandling(this);
		return iba;
	}

	public final HClusterCalculator createClusterCalculator(final DFSGraph graph, final HBlobDetector blobDetector,
			final HMethodToDataClassAccessCalculator m2dc) {
		final var hCluster = new HClusterCalculatorImpl(graph, blobDetector, m2dc);
		hCluster.setHAntiPatternHandling(this);
		return hCluster;
	}

	public final HClusterAccessCalculator createClusterAccessCalculator(final DFSGraph graph,
			final HClusterCalculator hCluster) {
		final var hAccess = new HClusterAccessCalculatorImpl(graph, hCluster);
		hCluster.setHAntiPatternHandling(this);
		return hAccess;
	}

	public final HBlobResolver createBlobResolver(final DFSGraph graph, final HMethodToDataClassAccessCalculator m2dc,
			final HInBlobAccessCalculator iba, final HAfferentCouplingCalculator haff,
			final HEfferentCouplingCalculator heff) {
		final var blobResolver = new HBlobResolverImpl(graph, m2dc, iba, haff, heff);
		blobResolver.setHAntiPatternHandling(this);
		return blobResolver;
	}

	public final HAlternativeBlobresolver createAlternativeBlobResolver(final DFSGraph graph,
			final HClusterAccessCalculator hCluster, final HMethodToDataClassAccessCalculator m2dc) {
		final var altBlobResolver = new HAlternativeBlobresolverImpl(graph, hCluster, m2dc);
		altBlobResolver.setHAntiPatternHandling(this);
		return altBlobResolver;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HAntiPatternResolvingImpl