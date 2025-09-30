/**
 */
package org.gravity.hulk.impl;

import org.gravity.hulk.HAntiPatternDetection;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.detection.antipattern.impl.HBlobDetector;
import org.gravity.hulk.detection.antipattern.impl.HGodClassDetector;
import org.gravity.hulk.detection.antipattern.impl.HSpaghettiCodeDetector;
import org.gravity.hulk.detection.antipattern.impl.HSwissArmyKnifeDetector;
import org.gravity.hulk.detection.codesmells.impl.HContollerClassDetector;
import org.gravity.hulk.detection.codesmells.impl.HDataClassAccessorDetector;
import org.gravity.hulk.detection.codesmells.impl.HDataClassDetector;
import org.gravity.hulk.detection.codesmells.impl.HEmptyClassDetector;
import org.gravity.hulk.detection.codesmells.impl.HGetterSetterDetector;
import org.gravity.hulk.detection.codesmells.impl.HIntenseFieldUsageDetector;
import org.gravity.hulk.detection.codesmells.impl.HLargeClassDetector;
import org.gravity.hulk.detection.codesmells.impl.HLowCohesionDetector;
import org.gravity.hulk.detection.codesmells.impl.HManyParametersDetector;
import org.gravity.hulk.detection.codesmells.impl.HMuchOverloadingDetector;
import org.gravity.hulk.detection.metrics.impl.HAfferentCouplingCalculator;
import org.gravity.hulk.detection.metrics.impl.HAverageOverloadingInClassCalculator;
import org.gravity.hulk.detection.metrics.impl.HAverageParametersCalculator;
import org.gravity.hulk.detection.metrics.impl.HDepthOfInheritanceCalculator;
import org.gravity.hulk.detection.metrics.impl.HEfferentCouplingCalculator;
import org.gravity.hulk.detection.metrics.impl.HFieldNumberCalculator;
import org.gravity.hulk.detection.metrics.impl.HGetterCalculator;
import org.gravity.hulk.detection.metrics.impl.HGetterSetterMethodRelationCalculator;
import org.gravity.hulk.detection.metrics.impl.HIGAMCalculator;
import org.gravity.hulk.detection.metrics.impl.HIGATCalculator;
import org.gravity.hulk.detection.metrics.impl.HIncommingInvocationCalculator;
import org.gravity.hulk.detection.metrics.impl.HInvocationRelationCalculator;
import org.gravity.hulk.detection.metrics.impl.HLcom5Calculator;
import org.gravity.hulk.detection.metrics.impl.HLocalAccessRelationCalculator;
import org.gravity.hulk.detection.metrics.impl.HLocalFieldUniqueAccessCalculator;
import org.gravity.hulk.detection.metrics.impl.HLocalFieldsAccessCalculator;
import org.gravity.hulk.detection.metrics.impl.HLocalMethodAccessCalculator;
import org.gravity.hulk.detection.metrics.impl.HMemberNumberCalculator;
import org.gravity.hulk.detection.metrics.impl.HMethodNumberCalculator;
import org.gravity.hulk.detection.metrics.impl.HNumberOfChildCalculator;
import org.gravity.hulk.detection.metrics.impl.HOutgoingInvocationCalculator;
import org.gravity.hulk.detection.metrics.impl.HSetterCalculator;
import org.gravity.hulk.detection.metrics.impl.HTotalCouplingCalculator;
import org.gravity.hulk.detection.metrics.impl.HTotalVisibilityCalculator;
import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.DfsFactory;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HAnti
 * Pattern Detection</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * // [user code injected with eMoflon] -->
 * // [user code injected with eMoflon] -->
 *
 *
 * @generated
 */
public class HAntiPatternDetectionImpl extends HAntiPatternHandlingImpl implements HAntiPatternDetection {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public HAntiPatternDetectionImpl() {
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
		for (final HDetector detector : this.getHDetector()) {
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
		this.createBlobDetector(graph, god, dacAccessor);
		this.createSwissArmyKnifeDetector(graph, largeClassDetector, overloadingDetector, niiCalculator);
		this.createSpaghettiCodeDetector(graph, inh, child, over, param, field, largeClassDetector);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void createCodeSmellDependencies(final DFSGraph graph) {
		this.createEmptyClassDetector(graph);

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

		final var getterSetterDetector = this.createGetterSetterDetector(graph, nacc);
		final var dataclassDetector = this.createDataClassDetector(getterSetterDetector, graph);

		this.createDataClassAccessorDetector(graph, dataclassDetector);

		final var lowCohesionDetector = this.createLowCohesionCalculator(graph, lcom);

		final var largeClassDetector = this.createLargeClassDetector(graph, nmd);

		final var controller = this.createControllerClassDetector(inc, graph);

		this.createGodClassDetector(controller, graph, largeClassDetector, lowCohesionDetector);

		this.createManyParametersDetector(graph, paramMetric);

		this.createMuchOverloadingDetector(graph, overMetric);

		this.createIntenseFieldUsageDetector(graph, local);

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void createMetricDependencies(final DFSGraph graph) {

		this.createMemberNumberCalculator(graph);

		final var methods = this.createMethodNumberCalculator(graph);

		final var fnc = this.createFieldNumberCalculator(graph);

		final var lfuac = this.createLocalFieldUniqueAccessCalculator(graph);

		this.createAfferentCouplingCalculator(graph);

		final var nii = this.createIncommingInvocationCalulator(graph);

		final var noi = this.createOutgoingInvocationCalculator(graph);

		this.createDepthOfInheritanceCalculator(graph);

		final var ng = this.createGetterCaluclator(graph);

		final var ns = this.createSetterCalculator(graph);

		this.createAverageParametersCalculator(graph);

		this.createAverageOverloadingInClassCalculator(graph);

		this.createNumberOfChildCalculator(graph);

		final var lma = this.createLocalMethodAccessDetector(graph);
		final var lfa = this.createLocalFieldAccessDetector(graph);

		this.createInvocationRelationCalculator(graph, noi, nii);

		this.createGetterSetterMethodRelationCalculator(graph, ng, ns, methods);

		this.createLocalAccessRelationCalculator(graph, lfa, lma);

		this.createLcom5Calculator(lfuac, graph, methods, fnc);

		this.createCouplingCalculator(graph);

		this.createIGAMCalculator(graph);

		this.createTotalVisibilityCalculator(graph);

		this.createEfferentCouplingCalculator(graph);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DFSGraph getDependencyGraph() {//
		var graph = this.searchForGraph();
		if (graph != null) {
			return graph;
		}

		graph = DfsFactory.eINSTANCE.createDFSGraph();

		//
		this.createMetricDependencies(graph); //
		this.createCodeSmellDependencies(graph); //
		this.createAntiPatternDependencies(graph);
		return graph;

	}

	private final HBlobDetector createBlobDetector(final DFSGraph graph, final HGodClassDetector god,
			final HDataClassAccessorDetector dacAccessor) {
		final var theBlob = new HBlobDetector(graph, god, dacAccessor);
		theBlob.setHAntiPatternHandling(this);
		return theBlob;
	}

	private final HSwissArmyKnifeDetector createSwissArmyKnifeDetector(final DFSGraph graph,
			final HLargeClassDetector largeClassDetector, final HMuchOverloadingDetector overloadingDetector,
			final HIncommingInvocationCalculator niiCalculator) {
		final var swa = new HSwissArmyKnifeDetector(graph, largeClassDetector,
				overloadingDetector, niiCalculator);
		swa.setHAntiPatternHandling(this);
		return swa;
	}

	private final HSpaghettiCodeDetector createSpaghettiCodeDetector(final DFSGraph graph,
			final HDepthOfInheritanceCalculator inh, final HNumberOfChildCalculator child,
			final HAverageOverloadingInClassCalculator over, final HAverageParametersCalculator param,
			final HIntenseFieldUsageDetector field, final HLargeClassDetector largeClassDetector) {
		final var spaghetti = new HSpaghettiCodeDetector(
				graph, inh, child, over, param, field,
				largeClassDetector);
		spaghetti.setHAntiPatternHandling(this);
		return spaghetti;
	}

	private final HEmptyClassDetector createEmptyClassDetector(final DFSGraph graph) {
		final var emptyClassDetector = new HEmptyClassDetector(graph);
		emptyClassDetector.setHAntiPatternHandling(this);
		return emptyClassDetector;
	}

	private final HGetterSetterDetector createGetterSetterDetector(final DFSGraph graph,
			final HGetterSetterMethodRelationCalculator nacc) {
		final var getterSetterDetector = new HGetterSetterDetector(graph, nacc);
		getterSetterDetector.setHAntiPatternHandling(this);
		return getterSetterDetector;
	}

	private final HDataClassDetector createDataClassDetector(final HGetterSetterDetector getterSetterDetector,
			final DFSGraph graph) {
		final var dataclassDetector = new HDataClassDetector(graph, getterSetterDetector);
		dataclassDetector.setHAntiPatternHandling(this);
		return dataclassDetector;
	}

	private final HDataClassDetector createDataClassAccessorDetector(final DFSGraph graph,
			final HDataClassDetector dataclassDetector) {
		final var dca = new HDataClassAccessorDetector(graph, dataclassDetector);
		dca.setHAntiPatternHandling(this);
		return dataclassDetector;
	}

	private final HLowCohesionDetector createLowCohesionCalculator(final DFSGraph graph, final HLcom5Calculator lcom) {
		final var low = new HLowCohesionDetector(graph, lcom);
		low.setHAntiPatternHandling(this);
		return low;
	}

	private final HLargeClassDetector createLargeClassDetector(final DFSGraph graph,
			final HMemberNumberCalculator nmd) {
		final var largeClassDetector = new HLargeClassDetector(graph, nmd);
		largeClassDetector.setHAntiPatternHandling(this);
		return largeClassDetector;
	}

	private final HContollerClassDetector createControllerClassDetector(final HInvocationRelationCalculator inc,
			final DFSGraph graph) {
		final var controller = new HContollerClassDetector(graph, inc);
		controller.setHAntiPatternHandling(this);
		return controller;
	}

	private final HGodClassDetector createGodClassDetector(final HContollerClassDetector controller,
			final DFSGraph graph, final HLargeClassDetector largeClass, final HLowCohesionDetector lowCohesion) {
		final var god = new HGodClassDetector(graph, controller, largeClass, lowCohesion);
		god.setHAntiPatternHandling(this);
		return god;
	}

	private final HManyParametersDetector createManyParametersDetector(final DFSGraph graph,
			final HAverageParametersCalculator paramMetric) {
		final var param = new HManyParametersDetector(graph, paramMetric);
		param.setHAntiPatternHandling(this);
		return param;
	}

	private final HMuchOverloadingDetector createMuchOverloadingDetector(final DFSGraph graph,
			final HAverageOverloadingInClassCalculator overMetric) {
		final var over = new HMuchOverloadingDetector(graph, overMetric);
		over.setHAntiPatternHandling(this);
		return over;
	}

	private final HIntenseFieldUsageDetector createIntenseFieldUsageDetector(final DFSGraph graph,
			final HLocalAccessRelationCalculator local) {
		final var infuse = new HIntenseFieldUsageDetector(graph, local);
		infuse.setHAntiPatternHandling(this);
		return infuse;
	}

	private final HMemberNumberCalculator createMemberNumberCalculator(final DFSGraph graph) {
		final var nmd = new HMemberNumberCalculator(graph);
		nmd.setHAntiPatternHandling(this);
		return nmd;
	}

	private final HMethodNumberCalculator createMethodNumberCalculator(final DFSGraph graph) {
		final var methods = new HMethodNumberCalculator(graph);
		methods.setHAntiPatternHandling(this);
		return methods;
	}

	private final HFieldNumberCalculator createFieldNumberCalculator(final DFSGraph graph) {
		final var fnc = new HFieldNumberCalculator(graph);
		fnc.setHAntiPatternHandling(this);
		return fnc;
	}

	private final HLocalFieldUniqueAccessCalculator createLocalFieldUniqueAccessCalculator(final DFSGraph graph) {
		final var lfuac = new HLocalFieldUniqueAccessCalculator(graph);
		lfuac.setHAntiPatternHandling(this);
		return lfuac;
	}

	private final HAfferentCouplingCalculator createAfferentCouplingCalculator(final DFSGraph graph) {
		final var ac = new HAfferentCouplingCalculator(graph);
		ac.setHAntiPatternHandling(this);
		return ac;
	}

	private final HEfferentCouplingCalculator createEfferentCouplingCalculator(final DFSGraph graph) {
		final var ec = new HEfferentCouplingCalculator(graph);
		ec.setHAntiPatternHandling(this);
		return ec;
	}

	private final HIncommingInvocationCalculator createIncommingInvocationCalulator(final DFSGraph graph) {
		final var nii = new HIncommingInvocationCalculator(graph);
		nii.setHAntiPatternHandling(this);
		return nii;
	}

	private final HOutgoingInvocationCalculator createOutgoingInvocationCalculator(final DFSGraph graph) {
		final var noi = new HOutgoingInvocationCalculator(graph);
		noi.setHAntiPatternHandling(this);
		return noi;
	}

	private final HDepthOfInheritanceCalculator createDepthOfInheritanceCalculator(final DFSGraph graph) {
		final var doicc = new HDepthOfInheritanceCalculator(graph);
		doicc.setHAntiPatternHandling(this);
		return doicc;
	}

	private final HGetterCalculator createGetterCaluclator(final DFSGraph graph) {
		final var ng = new HGetterCalculator(graph);
		ng.setHAntiPatternHandling(this);
		return ng;
	}

	private final HSetterCalculator createSetterCalculator(final DFSGraph graph) {
		final var ns = new HSetterCalculator(graph);
		ns.setHAntiPatternHandling(this);
		return ns;
	}

	private final HAverageParametersCalculator createAverageParametersCalculator(final DFSGraph graph) {
		final var params = new HAverageParametersCalculator(graph);
		params.setHAntiPatternHandling(this);
		return params;
	}

	private final HAverageOverloadingInClassCalculator createAverageOverloadingInClassCalculator(final DFSGraph graph) {
		final var over = new HAverageOverloadingInClassCalculator(graph);
		over.setHAntiPatternHandling(this);
		return over;
	}

	private final HNumberOfChildCalculator createNumberOfChildCalculator(final DFSGraph graph) {
		final var child = new HNumberOfChildCalculator(graph);
		child.setHAntiPatternHandling(this);
		return child;
	}

	private final HLocalMethodAccessCalculator createLocalMethodAccessDetector(final DFSGraph graph) {
		final var lma = new HLocalMethodAccessCalculator(graph);
		lma.setHAntiPatternHandling(this);
		return lma;
	}

	private final HLocalFieldsAccessCalculator createLocalFieldAccessDetector(final DFSGraph graph) {
		final var lfa = new HLocalFieldsAccessCalculator(graph);
		lfa.setHAntiPatternHandling(this);
		return lfa;
	}

	private final HInvocationRelationCalculator createInvocationRelationCalculator(final DFSGraph graph,
			final HOutgoingInvocationCalculator noi, final HIncommingInvocationCalculator nii) {
		final var relation = new HInvocationRelationCalculator(graph, noi, nii);
		relation.setHAntiPatternHandling(this);
		return relation;
	}

	private final HGetterSetterMethodRelationCalculator createGetterSetterMethodRelationCalculator(final DFSGraph graph,
			final HGetterCalculator ng, final HSetterCalculator ns, final HMethodNumberCalculator methods) {
		final var getterSetterRelation = new HGetterSetterMethodRelationCalculator(
				graph, ng, ns, methods);
		getterSetterRelation.setHAntiPatternHandling(this);
		return getterSetterRelation;
	}

	private final HLocalAccessRelationCalculator createLocalAccessRelationCalculator(final DFSGraph graph,
			final HLocalFieldsAccessCalculator lfa, final HLocalMethodAccessCalculator lma) {
		final var far = new HLocalAccessRelationCalculator(graph, lfa, lma);
		far.setHAntiPatternHandling(this);
		return far;
	}

	private final HLcom5Calculator createLcom5Calculator(final HLocalFieldUniqueAccessCalculator lfuac,
			final DFSGraph graph, final HMethodNumberCalculator methods, final HFieldNumberCalculator fnc) {
		final var lcom5Custom = new HLcom5Calculator(lfuac, graph, methods, fnc);
		lcom5Custom.setHAntiPatternHandling(this);
		return lcom5Custom;
	}

	private final HTotalCouplingCalculator createCouplingCalculator(final DFSGraph graph) {
		final var tcoupling = new HTotalCouplingCalculator(graph);
		tcoupling.setHAntiPatternHandling(this);
		return tcoupling;
	}

	private final HIGAMCalculator createIGAMCalculator(final DFSGraph graph) {
		final var igat = this.createIGATCalculator(graph);
		final var igam = new HIGAMCalculator(graph, igat);
		igam.setHAntiPatternHandling(this);
		return igam;
	}

	private final HIGATCalculator createIGATCalculator(final DFSGraph graph) {
		final var igat = new HIGATCalculator(graph);
		igat.setHAntiPatternHandling(this);
		return igat;
	}

	private final HTotalVisibilityCalculator createTotalVisibilityCalculator(final DFSGraph graph) {
		final var hTotalMethodVisibility = new HTotalVisibilityCalculator(graph);
		hTotalMethodVisibility.setHAntiPatternHandling(this);
		return hTotalMethodVisibility;
	}

	private final DFSGraph searchForGraph() {
		for (final HDetector hDetector : this.getHDetector()) {
			final var graph = hDetector.getGraph();
			if (graph != null) {
				return graph;
			}

		}
		return null;
	}
} // HAntiPatternDetectionImpl
