/**
 */
package org.gravity.hulk.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.HAntiPatternDetection;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkPackage;
import org.gravity.hulk.detection.antipattern.AntipatternFactory;
import org.gravity.hulk.detection.antipattern.HBlobDetector;
import org.gravity.hulk.detection.antipattern.HGodClassDetector;
import org.gravity.hulk.detection.antipattern.HSpaghettiCodeDetector;
import org.gravity.hulk.detection.antipattern.HSwissArmyKnifeDetector;
import org.gravity.hulk.detection.codesmells.CodesmellsFactory;
import org.gravity.hulk.detection.codesmells.HContollerClassDetector;
import org.gravity.hulk.detection.codesmells.HDataClassAccessorDetector;
import org.gravity.hulk.detection.codesmells.HDataClassDetector;
import org.gravity.hulk.detection.codesmells.HEmptyClassDetector;
import org.gravity.hulk.detection.codesmells.HGetterSetterDetector;
import org.gravity.hulk.detection.codesmells.HIntenseFieldUsageDetector;
import org.gravity.hulk.detection.codesmells.HLargeClassDetector;
import org.gravity.hulk.detection.codesmells.HLowCohesionDetector;
import org.gravity.hulk.detection.codesmells.HManyParametersDetector;
import org.gravity.hulk.detection.codesmells.HMuchOverloadingDetector;
import org.gravity.hulk.detection.metrics.HAfferentCouplingCalculator;
import org.gravity.hulk.detection.metrics.HAverageOverloadingInClassCalculator;
import org.gravity.hulk.detection.metrics.HAverageParametersCalculator;
import org.gravity.hulk.detection.metrics.HDepthOfInheritanceCalculator;
import org.gravity.hulk.detection.metrics.HEfferentCouplingCalculator;
import org.gravity.hulk.detection.metrics.HFieldNumberCalculator;
import org.gravity.hulk.detection.metrics.HGetterCalculator;
import org.gravity.hulk.detection.metrics.HGetterSetterMethodRelationCalculator;
import org.gravity.hulk.detection.metrics.HIGAMCalculator;
import org.gravity.hulk.detection.metrics.HIGATCalculator;
import org.gravity.hulk.detection.metrics.HIncommingInvocationCalculator;
import org.gravity.hulk.detection.metrics.HInvocationRelationCalculator;
import org.gravity.hulk.detection.metrics.HLcom5Calculator;
import org.gravity.hulk.detection.metrics.HLocalAccessRelationCalculator;
import org.gravity.hulk.detection.metrics.HLocalFieldUniqueAccessCalculator;
import org.gravity.hulk.detection.metrics.HLocalFieldsAccessCalculator;
import org.gravity.hulk.detection.metrics.HLocalMethodAccessCalculator;
import org.gravity.hulk.detection.metrics.HMemberNumberCalculator;
import org.gravity.hulk.detection.metrics.HMethodNumberCalculator;
import org.gravity.hulk.detection.metrics.HNumberOfChildCalculator;
import org.gravity.hulk.detection.metrics.HOutgoingInvocationCalculator;
import org.gravity.hulk.detection.metrics.HSetterCalculator;
import org.gravity.hulk.detection.metrics.HTotalCouplingCalculator;
import org.gravity.hulk.detection.metrics.HTotalVisibilityCalculator;
import org.gravity.hulk.detection.metrics.MetricsFactory;
import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.DfsFactory;
import org.moflon.core.dfs.Edge;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HAnti
 * Pattern Detection</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HAntiPatternDetectionImpl extends HAntiPatternHandlingImpl implements HAntiPatternDetection {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected HAntiPatternDetectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HulkPackage.Literals.HANTI_PATTERN_DETECTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void createAntiPatternDependencies(final DFSGraph graph) {

		HGodClassDetector god = null;
		HDataClassAccessorDetector dacAccessor = null;
		HLargeClassDetector largeClassDetector = null;
		HMuchOverloadingDetector overloadingDetector = null;
		HIncommingInvocationCalculator niiCalculator = null;
		HDepthOfInheritanceCalculator inh = null;
		HNumberOfChildCalculator child = null;
		HAverageOverloadingInClassCalculator over = null;
		HAverageParametersCalculator param = null;
		HIntenseFieldUsageDetector field = null;
		for (final HDetector detector : getHDetector()) {
			if (detector instanceof HDataClassAccessorDetector) {
				dacAccessor = (HDataClassAccessorDetector) detector;
			} else if (detector instanceof HGodClassDetector) {
				god = (HGodClassDetector) detector;
			} else if (detector instanceof HLargeClassDetector) {
				largeClassDetector = (HLargeClassDetector) detector;
			} else if (detector instanceof HMuchOverloadingDetector) {
				overloadingDetector = (HMuchOverloadingDetector) detector;
			} else if (detector instanceof HIncommingInvocationCalculator) {
				niiCalculator = (HIncommingInvocationCalculator) detector;
			} else if (detector instanceof HDepthOfInheritanceCalculator) {
				inh = (HDepthOfInheritanceCalculator) detector;
			} else if (detector instanceof HNumberOfChildCalculator) {
				child = (HNumberOfChildCalculator) detector;
			} else if (detector instanceof HAverageOverloadingInClassCalculator) {
				over = (HAverageOverloadingInClassCalculator) detector;
			} else if (detector instanceof HAverageParametersCalculator) {
				param = (HAverageParametersCalculator) detector;
			} else if (detector instanceof HIntenseFieldUsageDetector) {
				field = (HIntenseFieldUsageDetector) detector;
			}
		}
		if (god == null || dacAccessor == null || largeClassDetector == null || overloadingDetector == null
				|| niiCalculator == null || inh == null || child == null || over == null || param == null
				|| field == null) {
			throw new IllegalStateException("Didn't find all necessary detectors!");
		}
		createBlobDetector(graph, god, dacAccessor);
		createSwissArmyKnifeDetector(graph, largeClassDetector, overloadingDetector, niiCalculator);
		createSpaghettiCodeDetector(graph, inh, child, over, param, field, largeClassDetector);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void createCodeSmellDependencies(final DFSGraph graph) {
		createEmptyClassDetector(graph);

		HGetterSetterMethodRelationCalculator nacc = null;
		HLcom5Calculator lcom = null;
		HMemberNumberCalculator nmd = null;
		HInvocationRelationCalculator inc = null;
		HAverageParametersCalculator paramMetric = null;
		HAverageOverloadingInClassCalculator overMetric = null;
		HLocalAccessRelationCalculator local = null;
		for (final HDetector detector : this.getHDetector()) {
			if (detector instanceof HGetterSetterMethodRelationCalculator) {
				nacc = (HGetterSetterMethodRelationCalculator) detector;
			} else if (detector instanceof HLcom5Calculator) {
				lcom = (HLcom5Calculator) detector;
			} else if (detector instanceof HMemberNumberCalculator) {
				nmd = (HMemberNumberCalculator) detector;
			} else if (detector instanceof HInvocationRelationCalculator) {
				inc = (HInvocationRelationCalculator) detector;
			} else if (detector instanceof HAverageParametersCalculator) {
				paramMetric = (HAverageParametersCalculator) detector;
			} else if (detector instanceof HAverageOverloadingInClassCalculator) {
				overMetric = (HAverageOverloadingInClassCalculator) detector;
			} else if (detector instanceof HLocalAccessRelationCalculator) {
				local = (HLocalAccessRelationCalculator) detector;
			}
		}
		if (nacc == null || lcom == null || nmd == null || inc == null || paramMetric == null || overMetric == null
				|| local == null) {
			throw new IllegalStateException();
		}

		final HGetterSetterDetector getterSetterDetector = createGetterSetterDetector(graph, nacc);
		final HDataClassDetector dataclassDetector = createDataClassDetector(getterSetterDetector, graph);

		createDataClassAccessorDetector(graph, dataclassDetector);

		final HLowCohesionDetector lowCohesionDetector = createLowCohesionCalculator(graph, lcom);

		final HLargeClassDetector largeClassDetector = createLargeClassDetector(graph, nmd);

		final HContollerClassDetector controller = createControllerClassDetector(inc, graph);

		createGodClassDetector(controller, graph, largeClassDetector, lowCohesionDetector);

		createManyParametersDetector(graph, paramMetric);

		createMuchOverloadingDetector(graph, overMetric);

		createIntenseFieldUsageDetector(graph, local);

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void createMetricDependencies(final DFSGraph graph) {

		createMemberNumberCalculator(graph);

		final HMethodNumberCalculator methods = createMethodNumberCalculator(graph);

		final HFieldNumberCalculator fnc = createFieldNumberCalculator(graph);

		final HLocalFieldUniqueAccessCalculator lfuac = createLocalFieldUniqueAccessCalculator(graph);

		createAfferentCouplingCalculator(graph);

		final HIncommingInvocationCalculator nii = createIncommingInvocationCalulator(graph);

		final HOutgoingInvocationCalculator noi = createOutgoingInvocationCalculator(graph);

		createDepthOfInheritanceCalculator(graph);

		final HGetterCalculator ng = createGetterCaluclator(graph);

		final HSetterCalculator ns = createSetterCalculator(graph);

		createAverageParametersCalculator(graph);

		createAverageOverloadingInClassCalculator(graph);

		createNumberOfChildCalculator(graph);

		final HLocalMethodAccessCalculator lma = createLocalMethodAccessDetector(graph);
		final HLocalFieldsAccessCalculator lfa = createLocalFieldAccessDetector(graph);

		createInvocationRelationCalculator(graph, noi, nii);

		createGetterSetterMethodRelationCalculator(graph, ng, ns, methods);

		createLocalAccessRelationCalculator(graph, lfa, lma);

		createLcom5Calculator(lfuac, graph, methods, fnc);

		createCouplingCalculator(graph);

		createIGAMCalculator(graph);

		createTotalVisibilityCalculator(graph);

		createEfferentCouplingCalculator(graph);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DFSGraph getDependencyGraph() {//
		DFSGraph graph = searchForGraph();
		if (graph != null) {
			return graph;
		}

		graph = DfsFactory.eINSTANCE.createDFSGraph();

		//
		createMetricDependencies(graph); //
		createCodeSmellDependencies(graph); //
		createAntiPatternDependencies(graph);
		return graph;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case HulkPackage.HANTI_PATTERN_DETECTION___CREATE_ANTI_PATTERN_DEPENDENCIES__DFSGRAPH:
			createAntiPatternDependencies((DFSGraph) arguments.get(0));
			return null;
		case HulkPackage.HANTI_PATTERN_DETECTION___CREATE_CODE_SMELL_DEPENDENCIES__DFSGRAPH:
			createCodeSmellDependencies((DFSGraph) arguments.get(0));
			return null;
		case HulkPackage.HANTI_PATTERN_DETECTION___CREATE_METRIC_DEPENDENCIES__DFSGRAPH:
			createMetricDependencies((DFSGraph) arguments.get(0));
			return null;
		case HulkPackage.HANTI_PATTERN_DETECTION___GET_DEPENDENCY_GRAPH:
			return getDependencyGraph();
		}
		return super.eInvoke(operationID, arguments);
	}

	private final HBlobDetector createBlobDetector(final DFSGraph graph, final HGodClassDetector god,
			final HDataClassAccessorDetector dacAccessor) {
		final Edge blobReqDataClass = DfsFactory.eINSTANCE.createEdge();
		final HBlobDetector tbeBlob = AntipatternFactory.eINSTANCE.createHBlobDetector();
		final Edge blobReqDataCAccessor = DfsFactory.eINSTANCE.createEdge();
		god.getIncoming().add(blobReqDataClass);
		blobReqDataClass.setGraph(graph);
		tbeBlob.setGraph(graph);
		tbeBlob.getOutgoing().add(blobReqDataClass);
		tbeBlob.setHAntiPatternHandling(this);
		blobReqDataCAccessor.setGraph(graph);
		tbeBlob.getOutgoing().add(blobReqDataCAccessor);
		dacAccessor.getIncoming().add(blobReqDataCAccessor);
		return tbeBlob;
	}

	private final HSwissArmyKnifeDetector createSwissArmyKnifeDetector(final DFSGraph graph,
			final HLargeClassDetector largeClassDetector, final HMuchOverloadingDetector overloadingDetector,
			final HIncommingInvocationCalculator niiCalculator) {
		final Edge largeclassEdge = DfsFactory.eINSTANCE.createEdge();
		final HSwissArmyKnifeDetector swa = AntipatternFactory.eINSTANCE.createHSwissArmyKnifeDetector();
		final Edge overloadingEdge = DfsFactory.eINSTANCE.createEdge();
		final Edge niiEdge = DfsFactory.eINSTANCE.createEdge();
		largeClassDetector.getIncoming().add(largeclassEdge);
		largeclassEdge.setGraph(graph);
		swa.setHAntiPatternHandling(this);
		swa.setGraph(graph);
		swa.getOutgoing().add(largeclassEdge);
		swa.getOutgoing().add(overloadingEdge);
		overloadingDetector.getIncoming().add(overloadingEdge);
		overloadingEdge.setGraph(graph);
		swa.getOutgoing().add(niiEdge);
		niiEdge.setGraph(graph);
		niiCalculator.getIncoming().add(niiEdge);
		return swa;
	}

	private final HSpaghettiCodeDetector createSpaghettiCodeDetector(final DFSGraph graph,
			final HDepthOfInheritanceCalculator inh, final HNumberOfChildCalculator child,
			final HAverageOverloadingInClassCalculator over, final HAverageParametersCalculator param,
			final HIntenseFieldUsageDetector field, final HLargeClassDetector largeClassDetector) {
		final HSpaghettiCodeDetector spaghetti = AntipatternFactory.eINSTANCE.createHSpaghettiCodeDetector();
		final Edge edgeS1 = DfsFactory.eINSTANCE.createEdge();
		final Edge edgeS2 = DfsFactory.eINSTANCE.createEdge();
		final Edge edgeS3 = DfsFactory.eINSTANCE.createEdge();
		final Edge edgeS4 = DfsFactory.eINSTANCE.createEdge();
		final Edge edgeS5 = DfsFactory.eINSTANCE.createEdge();
		final Edge edgeS6 = DfsFactory.eINSTANCE.createEdge();
		spaghetti.setGraph(graph);
		spaghetti.setHAntiPatternHandling(this);
		spaghetti.getOutgoing().add(edgeS1);
		edgeS1.setGraph(graph);
		largeClassDetector.getIncoming().add(edgeS1);
		spaghetti.getOutgoing().add(edgeS2);
		edgeS2.setGraph(graph);
		child.getIncoming().add(edgeS2);
		spaghetti.getOutgoing().add(edgeS3);
		edgeS3.setGraph(graph);
		inh.getIncoming().add(edgeS3);
		spaghetti.getOutgoing().add(edgeS4);
		edgeS4.setGraph(graph);
		over.getIncoming().add(edgeS4);
		spaghetti.getOutgoing().add(edgeS5);
		edgeS5.setGraph(graph);
		param.getIncoming().add(edgeS5);
		spaghetti.getOutgoing().add(edgeS6);
		edgeS6.setGraph(graph);
		field.getIncoming().add(edgeS6);
		return spaghetti;
	}

	private final HEmptyClassDetector createEmptyClassDetector(final DFSGraph graph) {
		final HEmptyClassDetector emptyClassDetector = CodesmellsFactory.eINSTANCE.createHEmptyClassDetector();
		emptyClassDetector.setGraph(graph);
		emptyClassDetector.setHAntiPatternHandling(this);
		return emptyClassDetector;
	}

	private final HGetterSetterDetector createGetterSetterDetector(final DFSGraph graph,
			final HGetterSetterMethodRelationCalculator nacc) {
		final HGetterSetterDetector getterSetterDetector = CodesmellsFactory.eINSTANCE.createHGetterSetterDetector();
		final Edge edge8 = DfsFactory.eINSTANCE.createEdge();
		getterSetterDetector.setGraph(graph);
		getterSetterDetector.setHAntiPatternHandling(this);
		getterSetterDetector.getOutgoing().add(edge8);
		nacc.getIncoming().add(edge8);
		edge8.setGraph(graph);
		return getterSetterDetector;
	}

	private final HDataClassDetector createDataClassDetector(final HGetterSetterDetector getterSetterDetector,
			final DFSGraph graph) {
		final HDataClassDetector dataclassDetector = CodesmellsFactory.eINSTANCE.createHDataClassDetector();
		final Edge edge = DfsFactory.eINSTANCE.createEdge();
		dataclassDetector.setGraph(graph);
		dataclassDetector.setHAntiPatternHandling(this);
		edge.setGraph(graph);
		dataclassDetector.getOutgoing().add(edge);
		getterSetterDetector.getIncoming().add(edge);
		return dataclassDetector;
	}

	private final HDataClassDetector createDataClassAccessorDetector(final DFSGraph graph,
			final HDataClassDetector dataclassDetector) {
		final HDataClassAccessorDetector dca = CodesmellsFactory.eINSTANCE.createHDataClassAccessorDetector();
		final Edge edge2 = DfsFactory.eINSTANCE.createEdge();
		dca.setHAntiPatternHandling(this);
		dca.setGraph(graph);
		edge2.setGraph(graph);
		dca.getOutgoing().add(edge2);
		dataclassDetector.getIncoming().add(edge2);
		return dataclassDetector;
	}

	private final HLowCohesionDetector createLowCohesionCalculator(final DFSGraph graph, final HLcom5Calculator lcom) {
		final Edge edge3 = DfsFactory.eINSTANCE.createEdge();
		final HLowCohesionDetector low = CodesmellsFactory.eINSTANCE.createHLowCohesionDetector();
		lcom.getIncoming().add(edge3);
		edge3.setGraph(graph);
		low.setGraph(graph);
		low.getOutgoing().add(edge3);
		low.setHAntiPatternHandling(this);
		return low;
	}

	private final HLargeClassDetector createLargeClassDetector(final DFSGraph graph,
			final HMemberNumberCalculator nmd) {
		final Edge edge1 = DfsFactory.eINSTANCE.createEdge();
		final HLargeClassDetector largeClassDetector = CodesmellsFactory.eINSTANCE.createHLargeClassDetector();
		edge1.setGraph(graph);
		nmd.getIncoming().add(edge1);
		largeClassDetector.setGraph(graph);
		largeClassDetector.getOutgoing().add(edge1);
		largeClassDetector.setHAntiPatternHandling(this);
		return largeClassDetector;
	}

	private final HContollerClassDetector createControllerClassDetector(final HInvocationRelationCalculator inc,
			final DFSGraph graph) {
		final HContollerClassDetector controller = CodesmellsFactory.eINSTANCE.createHContollerClassDetector();
		final Edge edge9 = DfsFactory.eINSTANCE.createEdge();
		controller.setGraph(graph);
		controller.setHAntiPatternHandling(this);
		controller.getOutgoing().add(edge9);
		edge9.setGraph(graph);
		inc.getIncoming().add(edge9);
		return controller;
	}

	private final HGodClassDetector createGodClassDetector(final HContollerClassDetector controller,
			final DFSGraph graph, final HLargeClassDetector largeClass, final HLowCohesionDetector lowCohesion) {
		final Edge edge6 = DfsFactory.eINSTANCE.createEdge();
		final Edge edge7 = DfsFactory.eINSTANCE.createEdge();
		final Edge edge8 = DfsFactory.eINSTANCE.createEdge();
		final HGodClassDetector god = AntipatternFactory.eINSTANCE.createHGodClassDetector();
		controller.getIncoming().add(edge6);
		edge6.setGraph(graph);
		largeClass.getIncoming().add(edge7);
		edge7.setGraph(graph);
		lowCohesion.getIncoming().add(edge8);
		edge8.setGraph(graph);
		god.setGraph(graph);
		god.getOutgoing().add(edge6);
		god.getOutgoing().add(edge7);
		god.getOutgoing().add(edge8);
		god.setHAntiPatternHandling(this);
		return god;
	}

	private final HManyParametersDetector createManyParametersDetector(final DFSGraph graph,
			final HAverageParametersCalculator paramMetric) {
		final HManyParametersDetector param = CodesmellsFactory.eINSTANCE.createHManyParametersDetector();
		final Edge edge10 = DfsFactory.eINSTANCE.createEdge();
		param.setHAntiPatternHandling(this);
		param.setGraph(graph);
		param.getOutgoing().add(edge10);
		paramMetric.getIncoming().add(edge10);
		edge10.setGraph(graph);
		return param;
	}

	private final HMuchOverloadingDetector createMuchOverloadingDetector(final DFSGraph graph,
			final HAverageOverloadingInClassCalculator overMetric) {
		final HMuchOverloadingDetector over = CodesmellsFactory.eINSTANCE.createHMuchOverloadingDetector();
		final Edge edge11 = DfsFactory.eINSTANCE.createEdge();
		over.setHAntiPatternHandling(this);
		over.setGraph(graph);
		over.getOutgoing().add(edge11);
		overMetric.getIncoming().add(edge11);
		edge11.setGraph(graph);
		return over;
	}

	private final HIntenseFieldUsageDetector createIntenseFieldUsageDetector(final DFSGraph graph,
			final HLocalAccessRelationCalculator local) {
		final HIntenseFieldUsageDetector infuse = CodesmellsFactory.eINSTANCE.createHIntenseFieldUsageDetector();
		final Edge edge12 = DfsFactory.eINSTANCE.createEdge();
		infuse.setGraph(graph);
		infuse.setHAntiPatternHandling(this);
		edge12.setGraph(graph);
		infuse.getOutgoing().add(edge12);
		local.getIncoming().add(edge12);
		return infuse;
	}

	private final HMemberNumberCalculator createMemberNumberCalculator(final DFSGraph graph) {
		final HMemberNumberCalculator nmd = MetricsFactory.eINSTANCE.createHMemberNumberCalculator();
		nmd.setGraph(graph);
		nmd.setHAntiPatternHandling(this);
		return nmd;
	}

	private final HMethodNumberCalculator createMethodNumberCalculator(final DFSGraph graph) {
		final HMethodNumberCalculator methods = MetricsFactory.eINSTANCE.createHMethodNumberCalculator();
		methods.setHAntiPatternHandling(this);
		methods.setGraph(graph);
		return methods;
	}

	private final HFieldNumberCalculator createFieldNumberCalculator(final DFSGraph graph) {
		final HFieldNumberCalculator fnc = MetricsFactory.eINSTANCE.createHFieldNumberCalculator();
		fnc.setHAntiPatternHandling(this);
		fnc.setGraph(graph);
		return fnc;
	}

	private final HLocalFieldUniqueAccessCalculator createLocalFieldUniqueAccessCalculator(final DFSGraph graph) {
		final HLocalFieldUniqueAccessCalculator lfuac = MetricsFactory.eINSTANCE
				.createHLocalFieldUniqueAccessCalculator();
		lfuac.setHAntiPatternHandling(this);
		lfuac.setGraph(graph);
		return lfuac;
	}

	private final HAfferentCouplingCalculator createAfferentCouplingCalculator(final DFSGraph graph) {
		final HAfferentCouplingCalculator ac = MetricsFactory.eINSTANCE.createHAfferentCouplingCalculator();
		ac.setHAntiPatternHandling(this);
		ac.setGraph(graph);
		return ac;
	}

	private final HEfferentCouplingCalculator createEfferentCouplingCalculator(final DFSGraph graph) {
		final HEfferentCouplingCalculator ec = MetricsFactory.eINSTANCE.createHEfferentCouplingCalculator();
		ec.setHAntiPatternHandling(this);
		ec.setGraph(graph);
		return ec;
	}

	private final HIncommingInvocationCalculator createIncommingInvocationCalulator(final DFSGraph graph) {
		final HIncommingInvocationCalculator nii = MetricsFactory.eINSTANCE.createHIncommingInvocationCalculator();
		nii.setHAntiPatternHandling(this);
		nii.setGraph(graph);
		return nii;
	}

	private final HOutgoingInvocationCalculator createOutgoingInvocationCalculator(final DFSGraph graph) {
		final HOutgoingInvocationCalculator noi = MetricsFactory.eINSTANCE.createHOutgoingInvocationCalculator();
		noi.setHAntiPatternHandling(this);
		noi.setGraph(graph);
		return noi;
	}

	private final HDepthOfInheritanceCalculator createDepthOfInheritanceCalculator(final DFSGraph graph) {
		final HDepthOfInheritanceCalculator doicc = MetricsFactory.eINSTANCE.createHDepthOfInheritanceCalculator();
		doicc.setHAntiPatternHandling(this);
		doicc.setGraph(graph);
		return doicc;
	}

	private final HGetterCalculator createGetterCaluclator(final DFSGraph graph) {
		final HGetterCalculator ng = MetricsFactory.eINSTANCE.createHGetterCalculator();
		ng.setHAntiPatternHandling(this);
		ng.setGraph(graph);
		return ng;
	}

	private final HSetterCalculator createSetterCalculator(final DFSGraph graph) {
		final HSetterCalculator ns = MetricsFactory.eINSTANCE.createHSetterCalculator();
		ns.setHAntiPatternHandling(this);
		ns.setGraph(graph);
		return ns;
	}

	private final HAverageParametersCalculator createAverageParametersCalculator(final DFSGraph graph) {
		final HAverageParametersCalculator params = MetricsFactory.eINSTANCE.createHAverageParametersCalculator();
		params.setGraph(graph);
		params.setHAntiPatternHandling(this);
		return params;
	}

	private final HAverageOverloadingInClassCalculator createAverageOverloadingInClassCalculator(final DFSGraph graph) {
		final HAverageOverloadingInClassCalculator over = MetricsFactory.eINSTANCE
				.createHAverageOverloadingInClassCalculator();
		over.setGraph(graph);
		over.setHAntiPatternHandling(this);
		return over;
	}

	private final HNumberOfChildCalculator createNumberOfChildCalculator(final DFSGraph graph) {
		final HNumberOfChildCalculator child = MetricsFactory.eINSTANCE.createHNumberOfChildCalculator();
		child.setHAntiPatternHandling(this);
		child.setGraph(graph);
		return child;
	}

	private final HLocalMethodAccessCalculator createLocalMethodAccessDetector(final DFSGraph graph) {
		final HLocalMethodAccessCalculator lma = MetricsFactory.eINSTANCE.createHLocalMethodAccessCalculator();
		lma.setHAntiPatternHandling(this);
		lma.setGraph(graph);
		return lma;
	}

	private final HLocalFieldsAccessCalculator createLocalFieldAccessDetector(final DFSGraph graph) {
		final HLocalFieldsAccessCalculator lfa = MetricsFactory.eINSTANCE.createHLocalFieldsAccessCalculator();
		lfa.setHAntiPatternHandling(this);
		lfa.setGraph(graph);
		return lfa;
	}

	private final HInvocationRelationCalculator createInvocationRelationCalculator(final DFSGraph graph,
			final HOutgoingInvocationCalculator noi, final HIncommingInvocationCalculator nii) {
		final HInvocationRelationCalculator relation = MetricsFactory.eINSTANCE.createHInvocationRelationCalculator();
		final Edge edge3 = DfsFactory.eINSTANCE.createEdge();
		final Edge edge4 = DfsFactory.eINSTANCE.createEdge();
		relation.setHAntiPatternHandling(this);
		relation.setGraph(graph);
		relation.getOutgoing().add(edge3);
		noi.getIncoming().add(edge3);
		edge3.setGraph(graph);
		edge4.setGraph(graph);
		relation.getOutgoing().add(edge4);
		nii.getIncoming().add(edge4);
		return relation;
	}

	private final HGetterSetterMethodRelationCalculator createGetterSetterMethodRelationCalculator(final DFSGraph graph,
			final HGetterCalculator ng, final HSetterCalculator ns, final HMethodNumberCalculator methods) {
		final HGetterSetterMethodRelationCalculator getterSetterRelation = MetricsFactory.eINSTANCE
				.createHGetterSetterMethodRelationCalculator();
		final Edge edge0 = DfsFactory.eINSTANCE.createEdge();
		final Edge edge1 = DfsFactory.eINSTANCE.createEdge();
		final Edge edge2 = DfsFactory.eINSTANCE.createEdge();
		getterSetterRelation.setGraph(graph);
		getterSetterRelation.setHAntiPatternHandling(this);
		edge0.setGraph(graph);
		getterSetterRelation.getOutgoing().add(edge0);
		ng.getIncoming().add(edge0);
		edge1.setGraph(graph);
		getterSetterRelation.getOutgoing().add(edge1);
		ns.getIncoming().add(edge1);
		edge2.setGraph(graph);
		getterSetterRelation.getOutgoing().add(edge2);
		methods.getIncoming().add(edge2);
		return getterSetterRelation;
	}

	private final HLocalAccessRelationCalculator createLocalAccessRelationCalculator(final DFSGraph graph,
			final HLocalFieldsAccessCalculator lfa, final HLocalMethodAccessCalculator lma) {
		final HLocalAccessRelationCalculator far = MetricsFactory.eINSTANCE.createHLocalAccessRelationCalculator();
		final Edge edge5 = DfsFactory.eINSTANCE.createEdge();
		final Edge edge6 = DfsFactory.eINSTANCE.createEdge();
		far.setHAntiPatternHandling(this);
		far.setGraph(graph);
		far.getOutgoing().add(edge5);
		lfa.getIncoming().add(edge5);
		edge5.setGraph(graph);
		far.getOutgoing().add(edge6);
		lma.getIncoming().add(edge6);
		edge6.setGraph(graph);
		return far;
	}

	private final HLcom5Calculator createLcom5Calculator(final HLocalFieldUniqueAccessCalculator lfuac,
			final DFSGraph graph, final HMethodNumberCalculator methods, final HFieldNumberCalculator fnc) {
		final HLcom5Calculator lcom5Custom = MetricsFactory.eINSTANCE.createHLcom5Calculator();
		final Edge edge7 = DfsFactory.eINSTANCE.createEdge();
		final Edge edge8 = DfsFactory.eINSTANCE.createEdge();
		final Edge edge9 = DfsFactory.eINSTANCE.createEdge();
		lcom5Custom.setHAntiPatternHandling(this);
		lcom5Custom.setGraph(graph);
		lcom5Custom.getOutgoing().add(edge7);
		lfuac.getIncoming().add(edge7);
		edge7.setGraph(graph);
		lcom5Custom.getOutgoing().add(edge8);
		edge8.setGraph(graph);
		methods.getIncoming().add(edge8);
		lcom5Custom.getOutgoing().add(edge9);
		edge9.setGraph(graph);
		fnc.getIncoming().add(edge9);
		return lcom5Custom;
	}

	private final HTotalCouplingCalculator createCouplingCalculator(final DFSGraph graph) {
		final HTotalCouplingCalculator tcoupling = MetricsFactory.eINSTANCE.createHTotalCouplingCalculator();
		tcoupling.setGraph(graph);
		tcoupling.setHAntiPatternHandling(this);
		return tcoupling;
	}

	private final HIGAMCalculator createIGAMCalculator(final DFSGraph graph) {
		final HIGAMCalculator igam = MetricsFactory.eINSTANCE.createHIGAMCalculator();
		final Edge edge = DfsFactory.eINSTANCE.createEdge();
		final HIGATCalculator igat = createIGATCalculator(graph);
		igam.setGraph(graph);
		igam.setHAntiPatternHandling(this);
		edge.setGraph(graph);
		igat.getOutgoing().add(edge);
		igam.getIncoming().add(edge);
		return igam;
	}

	private final HIGATCalculator createIGATCalculator(final DFSGraph graph) {
		final HIGATCalculator igat = MetricsFactory.eINSTANCE.createHIGATCalculator();
		igat.setGraph(graph);
		igat.setHAntiPatternHandling(this);
		return igat;
	}

	private final HTotalVisibilityCalculator createTotalVisibilityCalculator(final DFSGraph graph) {
		final HTotalVisibilityCalculator hTotalMethodVisibility = MetricsFactory.eINSTANCE
				.createHTotalVisibilityCalculator();
		hTotalMethodVisibility.setGraph(graph);
		hTotalMethodVisibility.setHAntiPatternHandling(this);
		return hTotalMethodVisibility;
	}

	private final DFSGraph searchForGraph() {
		for (final HDetector hDetector : this.getHDetector()) {
			final DFSGraph graph = hDetector.getGraph();
			if (graph != null) {
				return graph;
			}

		}
		return null;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HAntiPatternDetectionImpl
