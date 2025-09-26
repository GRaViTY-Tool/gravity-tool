/**
 */
package org.gravity.hulk.resolve.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.HAntiPatternResolving;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkPackage;
import org.gravity.hulk.detection.antipattern.HBlobDetector;
import org.gravity.hulk.detection.metrics.HAfferentCouplingCalculator;
import org.gravity.hulk.detection.metrics.HEfferentCouplingCalculator;
import org.gravity.hulk.impl.HAntiPatternDetectionImpl;
import org.gravity.hulk.resolve.antipattern.AntipatternFactory;
import org.gravity.hulk.resolve.antipattern.HAlternativeBlobresolver;
import org.gravity.hulk.resolve.antipattern.HBlobResolver;
import org.gravity.hulk.resolve.calculators.CalculatorsFactory;
import org.gravity.hulk.resolve.calculators.HClusterAccessCalculator;
import org.gravity.hulk.resolve.calculators.HClusterCalculator;
import org.gravity.hulk.resolve.calculators.HInBlobAccessCalculator;
import org.gravity.hulk.resolve.calculators.HMethodToDataClassAccessCalculator;
import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.DfsFactory;
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
	protected HAntiPatternResolvingImpl() {
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HulkPackage.Literals.HANTI_PATTERN_RESOLVING;
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

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HulkPackage.HANTI_PATTERN_RESOLVING___CREATE_RESOLVE_CALCULATOR_DEPENDENCY__DFSGRAPH:
				this.createResolveCalculatorDependency((DFSGraph) arguments.get(0));
				return null;
			case HulkPackage.HANTI_PATTERN_RESOLVING___GET_DEPENDENCY_GRAPH:
				return this.getDependencyGraph();
			case HulkPackage.HANTI_PATTERN_RESOLVING___CREATE_RESOLVE_ANTI_PATTERN_DEPENDENCY__DFSGRAPH:
				this.createResolveAntiPatternDependency((DFSGraph) arguments.get(0));
				return null;
			case HulkPackage.HANTI_PATTERN_RESOLVING___GET_SUPER_DEPENDENCY_GRAPH:
				return this.getSuperDependencyGraph();
		}
		return super.eInvoke(operationID, arguments);
	}

	public final HMethodToDataClassAccessCalculator createMethodToDataClassAccessCalculator(final DFSGraph graph,
			final HBlobDetector blobDetector) {
		final var m2dc = CalculatorsFactory.eINSTANCE
				.createHMethodToDataClassAccessCalculator();
		final var edge2 = DfsFactory.eINSTANCE.createEdge();
		m2dc.setGraph(graph);
		m2dc.setHAntiPatternHandling(this);
		edge2.setGraph(graph);
		m2dc.getOutgoing().add(edge2);
		blobDetector.getIncoming().add(edge2);
		return m2dc;
	}

	public final HInBlobAccessCalculator createHInBlobAccessCalculator(final DFSGraph graph,
			final HMethodToDataClassAccessCalculator m2dc) {
		final var iba = CalculatorsFactory.eINSTANCE.createHInBlobAccessCalculator();
		final var edge1 = DfsFactory.eINSTANCE.createEdge();
		iba.setGraph(graph);
		iba.setHAntiPatternHandling(this);
		edge1.setGraph(graph);
		iba.getOutgoing().add(edge1);
		m2dc.getIncoming().add(edge1);
		return iba;
	}

	public final HClusterCalculator createClusterCalculator(final DFSGraph graph, final HBlobDetector blobDetector,
			final HMethodToDataClassAccessCalculator m2dc) {
		final var hCluster = CalculatorsFactory.eINSTANCE.createHClusterCalculator();
		final var blobEdge = DfsFactory.eINSTANCE.createEdge();
		final var m2dcEdge = DfsFactory.eINSTANCE.createEdge();
		hCluster.setGraph(graph);
		hCluster.setHAntiPatternHandling(this);
		blobEdge.setGraph(graph);
		hCluster.getOutgoing().add(blobEdge);
		blobDetector.getIncoming().add(blobEdge);
		m2dcEdge.setGraph(graph);
		hCluster.getOutgoing().add(m2dcEdge);
		m2dc.getIncoming().add(m2dcEdge);
		return hCluster;
	}

	public final HClusterAccessCalculator createClusterAccessCalculator(final DFSGraph graph,
			final HClusterCalculator hCluster) {
		final var hAccess = CalculatorsFactory.eINSTANCE.createHClusterAccessCalculator();
		final var accessEdge = DfsFactory.eINSTANCE.createEdge();
		hAccess.setGraph(graph);
		hAccess.setHAntiPatternHandling(this);
		accessEdge.setGraph(graph);
		hAccess.getOutgoing().add(accessEdge);
		hCluster.getIncoming().add(accessEdge);
		return hAccess;
	}

	public final HBlobResolver createBlobResolver(final DFSGraph graph, final HMethodToDataClassAccessCalculator m2dc,
			final HInBlobAccessCalculator iba, final HAfferentCouplingCalculator haff,
			final HEfferentCouplingCalculator heff) {
		final var blobResolver = AntipatternFactory.eINSTANCE.createHBlobResolver();
		final var edgeBm2dc = DfsFactory.eINSTANCE.createEdge();
		final var edgeIBA = DfsFactory.eINSTANCE.createEdge();
		final var haffEdge = DfsFactory.eINSTANCE.createEdge();
		final var heffEdge = DfsFactory.eINSTANCE.createEdge();
		blobResolver.setHAntiPatternHandling(this);
		blobResolver.setGraph(graph);
		edgeBm2dc.setGraph(graph);
		blobResolver.getOutgoing().add(edgeBm2dc);
		m2dc.getIncoming().add(edgeBm2dc);
		edgeIBA.setGraph(graph);
		iba.getIncoming().add(edgeIBA);
		blobResolver.getOutgoing().add(edgeIBA);
		haff.getIncoming().add(haffEdge);
		blobResolver.getOutgoing().add(haffEdge);
		haffEdge.setGraph(graph);
		heff.getIncoming().add(heffEdge);
		blobResolver.getOutgoing().add(heffEdge);
		heffEdge.setGraph(graph);
		return blobResolver;
	}

	public final HAlternativeBlobresolver createAlternativeBlobResolver(final DFSGraph graph,
			final HClusterAccessCalculator hCluster, final HMethodToDataClassAccessCalculator m2dc) {
		final var clusterEdge = DfsFactory.eINSTANCE.createEdge();
		final var altBlobResolver = AntipatternFactory.eINSTANCE.createHAlternativeBlobresolver();
		final var m2dcEdge = DfsFactory.eINSTANCE.createEdge();
		clusterEdge.setGraph(graph);
		hCluster.getIncoming().add(clusterEdge);
		altBlobResolver.getOutgoing().add(clusterEdge);
		altBlobResolver.setHAntiPatternHandling(this);
		altBlobResolver.setGraph(graph);
		m2dc.getIncoming().add(m2dcEdge);
		altBlobResolver.getOutgoing().add(m2dcEdge);
		m2dcEdge.setGraph(graph);
		return altBlobResolver;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HAntiPatternResolvingImpl