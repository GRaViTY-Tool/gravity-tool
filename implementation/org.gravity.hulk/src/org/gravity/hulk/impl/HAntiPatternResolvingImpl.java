/**
 */
package org.gravity.hulk.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.HAntiPatternResolving;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkPackage;

import org.gravity.hulk.detection.antipattern.HBlobDetector;

import org.gravity.hulk.detection.metrics.HAfferentCouplingCalculator;
import org.gravity.hulk.detection.metrics.HEfferentCouplingCalculator;

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
import org.moflon.core.dfs.Edge;
import org.moflon.core.dfs.Node;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HAnti Pattern Resolving</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HAntiPatternResolvingImpl extends HAntiPatternDetectionImpl implements HAntiPatternResolving {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HAntiPatternResolvingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HulkPackage.Literals.HANTI_PATTERN_RESOLVING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createResolveCalculatorDependency(DFSGraph graph) {

		Object[] result1_black = HAntiPatternResolvingImpl
				.pattern_HAntiPatternResolving_0_1_ActivityNode26_blackBBF(this, graph);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[graph] = " + graph + ".");
		}
		HBlobDetector blobDetector = (HBlobDetector) result1_black[2];
		Object[] result1_green = HAntiPatternResolvingImpl
				.pattern_HAntiPatternResolving_0_1_ActivityNode26_greenBBFFB(this, graph, blobDetector);
		HMethodToDataClassAccessCalculator m2dc = (HMethodToDataClassAccessCalculator) result1_green[2];
		//nothing Edge edge2 = (Edge) result1_green[3];

		Object[] result2_black = HAntiPatternResolvingImpl
				.pattern_HAntiPatternResolving_0_2_ActivityNode27_blackBBB(this, graph, m2dc);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[graph] = " + graph + ", " + "[m2dc] = " + m2dc + ".");
		}
		HAntiPatternResolvingImpl.pattern_HAntiPatternResolving_0_2_ActivityNode27_greenBBFFB(this, graph, m2dc);
		//nothing HInBlobAccessCalculator iba = (HInBlobAccessCalculator) result2_green[2];
		//nothing Edge edge1 = (Edge) result2_green[3];

		Object[] result3_black = HAntiPatternResolvingImpl
				.pattern_HAntiPatternResolving_0_3_ActivityNode37_blackBBBB(this, graph, blobDetector, m2dc);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[graph] = " + graph
							+ ", " + "[blobDetector] = " + blobDetector + ", " + "[m2dc] = " + m2dc + ".");
		}
		Object[] result3_green = HAntiPatternResolvingImpl
				.pattern_HAntiPatternResolving_0_3_ActivityNode37_greenBBFFBBF(this, graph, blobDetector, m2dc);
		HClusterCalculator hCluster = (HClusterCalculator) result3_green[2];
		//nothing Edge blobEdge = (Edge) result3_green[3];
		//nothing Edge m2dcEdge = (Edge) result3_green[6];

		Object[] result4_black = HAntiPatternResolvingImpl
				.pattern_HAntiPatternResolving_0_4_ActivityNode38_blackBBB(this, graph, hCluster);
		if (result4_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[graph] = " + graph + ", " + "[hCluster] = " + hCluster + ".");
		}
		HAntiPatternResolvingImpl.pattern_HAntiPatternResolving_0_4_ActivityNode38_greenBBFFB(this, graph, hCluster);
		//nothing HClusterAccessCalculator hAccess = (HClusterAccessCalculator) result4_green[2];
		//nothing Edge accessEdge = (Edge) result4_green[3];

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DFSGraph getDependencyGraph() {

		Object[] result1_bindingAndBlack = HAntiPatternResolvingImpl
				.pattern_HAntiPatternResolving_1_1_ActivityNode28_bindingAndBlackBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		DFSGraph graph = (DFSGraph) result1_bindingAndBlack[1];
		// 
		HAntiPatternResolvingImpl.pattern_HAntiPatternResolving_1_2_ActivityNode29_expressionBB(this, graph);
		// 
		HAntiPatternResolvingImpl.pattern_HAntiPatternResolving_1_3_ActivityNode34_expressionBB(this, graph);
		return HAntiPatternResolvingImpl.pattern_HAntiPatternResolving_1_4_expressionFB(graph);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createResolveAntiPatternDependency(DFSGraph graph) {

		Object[] result1_black = HAntiPatternResolvingImpl
				.pattern_HAntiPatternResolving_3_1_ActivityNode35_blackBBFFFF(this, graph);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[graph] = " + graph + ".");
		}
		HMethodToDataClassAccessCalculator m2dc = (HMethodToDataClassAccessCalculator) result1_black[2];
		HInBlobAccessCalculator iba = (HInBlobAccessCalculator) result1_black[3];
		HAfferentCouplingCalculator haff = (HAfferentCouplingCalculator) result1_black[4];
		HEfferentCouplingCalculator heff = (HEfferentCouplingCalculator) result1_black[5];
		HAntiPatternResolvingImpl.pattern_HAntiPatternResolving_3_1_ActivityNode35_greenBBFFBFBBBFF(this, graph, m2dc,
				iba, haff, heff);
		//nothing HBlobResolver blobResolver = (HBlobResolver) result1_green[2];
		//nothing Edge edgeBm2dc = (Edge) result1_green[3];
		//nothing Edge edgeIBA = (Edge) result1_green[5];
		//nothing Edge haffEdge = (Edge) result1_green[9];
		//nothing Edge heffEdge = (Edge) result1_green[10];

		Object[] result2_black = HAntiPatternResolvingImpl
				.pattern_HAntiPatternResolving_3_2_ActivityNode36_blackBBFB(this, graph, m2dc);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[graph] = " + graph + ", " + "[m2dc] = " + m2dc + ".");
		}
		HClusterAccessCalculator hCluster = (HClusterAccessCalculator) result2_black[2];
		HAntiPatternResolvingImpl.pattern_HAntiPatternResolving_3_2_ActivityNode36_greenBBBFFBF(this, graph, hCluster,
				m2dc);
		//nothing Edge clusterEdge = (Edge) result2_green[3];
		//nothing HAlternativeBlobresolver altBlobResolver = (HAlternativeBlobresolver) result2_green[4];
		//nothing Edge m2dcEdge = (Edge) result2_green[6];

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DFSGraph getSuperDependencyGraph() {
		// [user code injected with eMoflon]

		return super.getDependencyGraph();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case HulkPackage.HANTI_PATTERN_RESOLVING___CREATE_RESOLVE_CALCULATOR_DEPENDENCY__DFSGRAPH:
			createResolveCalculatorDependency((DFSGraph) arguments.get(0));
			return null;
		case HulkPackage.HANTI_PATTERN_RESOLVING___GET_DEPENDENCY_GRAPH:
			return getDependencyGraph();
		case HulkPackage.HANTI_PATTERN_RESOLVING___CREATE_RESOLVE_ANTI_PATTERN_DEPENDENCY__DFSGRAPH:
			createResolveAntiPatternDependency((DFSGraph) arguments.get(0));
			return null;
		case HulkPackage.HANTI_PATTERN_RESOLVING___GET_SUPER_DEPENDENCY_GRAPH:
			return getSuperDependencyGraph();
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HAntiPatternResolving_0_1_ActivityNode26_blackBBF(HAntiPatternResolving _this,
			DFSGraph graph) {
		for (Node tmpBlobDetector : graph.getNodes()) {
			if (tmpBlobDetector instanceof HBlobDetector) {
				HBlobDetector blobDetector = (HBlobDetector) tmpBlobDetector;
				return new Object[] { _this, graph, blobDetector };
			}
		}
		return null;
	}

	public static final Object[] pattern_HAntiPatternResolving_0_1_ActivityNode26_greenBBFFB(
			HAntiPatternResolving _this, DFSGraph graph, HBlobDetector blobDetector) {
		HMethodToDataClassAccessCalculator m2dc = CalculatorsFactory.eINSTANCE
				.createHMethodToDataClassAccessCalculator();
		Edge edge2 = DfsFactory.eINSTANCE.createEdge();
		m2dc.setGraph(graph);
		m2dc.setHAntiPatternHandling(_this);
		edge2.setGraph(graph);
		m2dc.getOutgoing().add(edge2);
		blobDetector.getIncoming().add(edge2);
		return new Object[] { _this, graph, m2dc, edge2, blobDetector };
	}

	public static final Object[] pattern_HAntiPatternResolving_0_2_ActivityNode27_blackBBB(HAntiPatternResolving _this,
			DFSGraph graph, HMethodToDataClassAccessCalculator m2dc) {
		return new Object[] { _this, graph, m2dc };
	}

	public static final Object[] pattern_HAntiPatternResolving_0_2_ActivityNode27_greenBBFFB(
			HAntiPatternResolving _this, DFSGraph graph, HMethodToDataClassAccessCalculator m2dc) {
		HInBlobAccessCalculator iba = CalculatorsFactory.eINSTANCE.createHInBlobAccessCalculator();
		Edge edge1 = DfsFactory.eINSTANCE.createEdge();
		iba.setGraph(graph);
		iba.setHAntiPatternHandling(_this);
		edge1.setGraph(graph);
		iba.getOutgoing().add(edge1);
		m2dc.getIncoming().add(edge1);
		return new Object[] { _this, graph, iba, edge1, m2dc };
	}

	public static final Object[] pattern_HAntiPatternResolving_0_3_ActivityNode37_blackBBBB(HAntiPatternResolving _this,
			DFSGraph graph, HBlobDetector blobDetector, HMethodToDataClassAccessCalculator m2dc) {
		return new Object[] { _this, graph, blobDetector, m2dc };
	}

	public static final Object[] pattern_HAntiPatternResolving_0_3_ActivityNode37_greenBBFFBBF(
			HAntiPatternResolving _this, DFSGraph graph, HBlobDetector blobDetector,
			HMethodToDataClassAccessCalculator m2dc) {
		HClusterCalculator hCluster = CalculatorsFactory.eINSTANCE.createHClusterCalculator();
		Edge blobEdge = DfsFactory.eINSTANCE.createEdge();
		Edge m2dcEdge = DfsFactory.eINSTANCE.createEdge();
		hCluster.setGraph(graph);
		hCluster.setHAntiPatternHandling(_this);
		blobEdge.setGraph(graph);
		hCluster.getOutgoing().add(blobEdge);
		blobDetector.getIncoming().add(blobEdge);
		m2dcEdge.setGraph(graph);
		hCluster.getOutgoing().add(m2dcEdge);
		m2dc.getIncoming().add(m2dcEdge);
		return new Object[] { _this, graph, hCluster, blobEdge, blobDetector, m2dc, m2dcEdge };
	}

	public static final Object[] pattern_HAntiPatternResolving_0_4_ActivityNode38_blackBBB(HAntiPatternResolving _this,
			DFSGraph graph, HClusterCalculator hCluster) {
		return new Object[] { _this, graph, hCluster };
	}

	public static final Object[] pattern_HAntiPatternResolving_0_4_ActivityNode38_greenBBFFB(
			HAntiPatternResolving _this, DFSGraph graph, HClusterCalculator hCluster) {
		HClusterAccessCalculator hAccess = CalculatorsFactory.eINSTANCE.createHClusterAccessCalculator();
		Edge accessEdge = DfsFactory.eINSTANCE.createEdge();
		hAccess.setGraph(graph);
		hAccess.setHAntiPatternHandling(_this);
		accessEdge.setGraph(graph);
		hAccess.getOutgoing().add(accessEdge);
		hCluster.getIncoming().add(accessEdge);
		return new Object[] { _this, graph, hAccess, accessEdge, hCluster };
	}

	public static final Object[] pattern_HAntiPatternResolving_1_1_ActivityNode28_bindingFB(
			HAntiPatternResolving _this) {
		DFSGraph _localVariable_0 = _this.getSuperDependencyGraph();
		DFSGraph graph = _localVariable_0;
		if (graph != null) {
			return new Object[] { graph, _this };
		}
		return null;
	}

	public static final Object[] pattern_HAntiPatternResolving_1_1_ActivityNode28_blackBB(HAntiPatternResolving _this,
			DFSGraph graph) {
		return new Object[] { _this, graph };
	}

	public static final Object[] pattern_HAntiPatternResolving_1_1_ActivityNode28_bindingAndBlackBF(
			HAntiPatternResolving _this) {
		Object[] result_pattern_HAntiPatternResolving_1_1_ActivityNode28_binding = pattern_HAntiPatternResolving_1_1_ActivityNode28_bindingFB(
				_this);
		if (result_pattern_HAntiPatternResolving_1_1_ActivityNode28_binding != null) {
			DFSGraph graph = (DFSGraph) result_pattern_HAntiPatternResolving_1_1_ActivityNode28_binding[0];

			Object[] result_pattern_HAntiPatternResolving_1_1_ActivityNode28_black = pattern_HAntiPatternResolving_1_1_ActivityNode28_blackBB(
					_this, graph);
			if (result_pattern_HAntiPatternResolving_1_1_ActivityNode28_black != null) {

				return new Object[] { _this, graph };
			}
		}
		return null;
	}

	public static final void pattern_HAntiPatternResolving_1_2_ActivityNode29_expressionBB(HAntiPatternResolving _this,
			DFSGraph graph) {
		_this.createResolveCalculatorDependency(graph);

	}

	public static final void pattern_HAntiPatternResolving_1_3_ActivityNode34_expressionBB(HAntiPatternResolving _this,
			DFSGraph graph) {
		_this.createResolveAntiPatternDependency(graph);

	}

	public static final DFSGraph pattern_HAntiPatternResolving_1_4_expressionFB(DFSGraph graph) {
		DFSGraph _result = graph;
		return _result;
	}

	public static final Object[] pattern_HAntiPatternResolving_3_1_ActivityNode35_blackBBFFFF(
			HAntiPatternResolving _this, DFSGraph graph) {
		for (Node tmpIba : graph.getNodes()) {
			if (tmpIba instanceof HInBlobAccessCalculator) {
				HInBlobAccessCalculator iba = (HInBlobAccessCalculator) tmpIba;
				for (Node tmpM2dc : graph.getNodes()) {
					if (tmpM2dc instanceof HMethodToDataClassAccessCalculator) {
						HMethodToDataClassAccessCalculator m2dc = (HMethodToDataClassAccessCalculator) tmpM2dc;
						for (Node tmpHaff : graph.getNodes()) {
							if (tmpHaff instanceof HAfferentCouplingCalculator) {
								HAfferentCouplingCalculator haff = (HAfferentCouplingCalculator) tmpHaff;
								for (Node tmpHeff : graph.getNodes()) {
									if (tmpHeff instanceof HEfferentCouplingCalculator) {
										HEfferentCouplingCalculator heff = (HEfferentCouplingCalculator) tmpHeff;
										return new Object[] { _this, graph, m2dc, iba, haff, heff };
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_HAntiPatternResolving_3_1_ActivityNode35_greenBBFFBFBBBFF(
			HAntiPatternResolving _this, DFSGraph graph, HMethodToDataClassAccessCalculator m2dc,
			HInBlobAccessCalculator iba, HAfferentCouplingCalculator haff, HEfferentCouplingCalculator heff) {
		HBlobResolver blobResolver = AntipatternFactory.eINSTANCE.createHBlobResolver();
		Edge edgeBm2dc = DfsFactory.eINSTANCE.createEdge();
		Edge edgeIBA = DfsFactory.eINSTANCE.createEdge();
		Edge haffEdge = DfsFactory.eINSTANCE.createEdge();
		Edge heffEdge = DfsFactory.eINSTANCE.createEdge();
		blobResolver.setHAntiPatternHandling(_this);
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
		return new Object[] { _this, graph, blobResolver, edgeBm2dc, m2dc, edgeIBA, iba, haff, heff, haffEdge,
				heffEdge };
	}

	public static final Object[] pattern_HAntiPatternResolving_3_2_ActivityNode36_blackBBFB(HAntiPatternResolving _this,
			DFSGraph graph, HMethodToDataClassAccessCalculator m2dc) {
		for (HDetector tmpHCluster : _this.getHDetector()) {
			if (tmpHCluster instanceof HClusterAccessCalculator) {
				HClusterAccessCalculator hCluster = (HClusterAccessCalculator) tmpHCluster;
				return new Object[] { _this, graph, hCluster, m2dc };
			}
		}
		return null;
	}

	public static final Object[] pattern_HAntiPatternResolving_3_2_ActivityNode36_greenBBBFFBF(
			HAntiPatternResolving _this, DFSGraph graph, HClusterAccessCalculator hCluster,
			HMethodToDataClassAccessCalculator m2dc) {
		Edge clusterEdge = DfsFactory.eINSTANCE.createEdge();
		HAlternativeBlobresolver altBlobResolver = AntipatternFactory.eINSTANCE.createHAlternativeBlobresolver();
		Edge m2dcEdge = DfsFactory.eINSTANCE.createEdge();
		clusterEdge.setGraph(graph);
		hCluster.getIncoming().add(clusterEdge);
		altBlobResolver.getOutgoing().add(clusterEdge);
		altBlobResolver.setHAntiPatternHandling(_this);
		altBlobResolver.setGraph(graph);
		m2dc.getIncoming().add(m2dcEdge);
		altBlobResolver.getOutgoing().add(m2dcEdge);
		m2dcEdge.setGraph(graph);
		return new Object[] { _this, graph, hCluster, clusterEdge, altBlobResolver, m2dc, m2dcEdge };
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //HAntiPatternResolvingImpl
