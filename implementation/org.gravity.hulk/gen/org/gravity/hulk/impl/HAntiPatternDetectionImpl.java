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
import org.gravity.hulk.detection.codesmells.HLargeClassLowCohesionDetector;
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
import org.moflon.core.dfs.Node;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HAnti Pattern Detection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HAntiPatternDetectionImpl extends HAntiPatternHandlingImpl implements HAntiPatternDetection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HAntiPatternDetectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HulkPackage.Literals.HANTI_PATTERN_DETECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createAntiPatternDependencies(DFSGraph graph) {

		Object[] result1_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_0_1_ActivityNode1_blackBBFF(graph, this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[graph] = " + graph + ", "
					+ "[this] = " + this + ".");
		}
		HGodClassDetector god = (HGodClassDetector) result1_black[2];
		HDataClassAccessorDetector dacAccessor = (HDataClassAccessorDetector) result1_black[3];
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_0_1_ActivityNode1_greenFBFBBBF(graph, this, god,
				dacAccessor);
		//nothing Edge blobReqDataClass = (Edge) result1_green[0];
		//nothing HBlobDetector tbeBlob = (HBlobDetector) result1_green[2];
		//nothing Edge blobReqDataCAccessor = (Edge) result1_green[6];

		Object[] result2_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_0_2_ActivityNode1_blackBFBFF(this, graph);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[graph] = " + graph + ".");
		}
		HLargeClassDetector largeClassDetector = (HLargeClassDetector) result2_black[1];
		HMuchOverloadingDetector overloadingDetector = (HMuchOverloadingDetector) result2_black[3];
		HIncommingInvocationCalculator niiCalculator = (HIncommingInvocationCalculator) result2_black[4];
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_0_2_ActivityNode1_greenFBFBBBFBF(this,
				largeClassDetector, graph, overloadingDetector, niiCalculator);
		//nothing Edge largeclassEdge = (Edge) result2_green[0];
		//nothing HSwissArmyKnifeDetector swa = (HSwissArmyKnifeDetector) result2_green[2];
		//nothing Edge overloadingEdge = (Edge) result2_green[6];
		//nothing Edge niiEdge = (Edge) result2_green[8];

		Object[] result3_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_0_3_ActivityNode15_blackBBFFFFFB(this, graph, largeClassDetector);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[graph] = " + graph + ", " + "[largeClassDetector] = " + largeClassDetector + ".");
		}
		HDepthOfInheritanceCalculator inh = (HDepthOfInheritanceCalculator) result3_black[2];
		HNumberOfChildCalculator child = (HNumberOfChildCalculator) result3_black[3];
		HAverageOverloadingInClassCalculator over = (HAverageOverloadingInClassCalculator) result3_black[4];
		HAverageParametersCalculator param = (HAverageParametersCalculator) result3_black[5];
		HIntenseFieldUsageDetector field = (HIntenseFieldUsageDetector) result3_black[6];
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_0_3_ActivityNode15_greenBBFBBBBBBFFFFFF(this, graph,
				inh, child, over, param, field, largeClassDetector);
		//nothing HSpaghettiCodeDetector spaghetti = (HSpaghettiCodeDetector) result3_green[2];
		//nothing Edge edgeS1 = (Edge) result3_green[9];
		//nothing Edge edgeS2 = (Edge) result3_green[10];
		//nothing Edge edgeS3 = (Edge) result3_green[11];
		//nothing Edge edgeS4 = (Edge) result3_green[12];
		//nothing Edge edgeS5 = (Edge) result3_green[13];
		//nothing Edge edgeS6 = (Edge) result3_green[14];

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createCodeSmellDependencies(DFSGraph graph) {

		Object[] result1_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_1_DependenciesofEmptyClassDetector_blackBB(graph, this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[graph] = " + graph + ", "
					+ "[this] = " + this + ".");
		}
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_1_1_DependenciesofEmptyClassDetector_greenFBB(graph,
				this);
		//nothing HEmptyClassDetector emptyClassDetector = (HEmptyClassDetector) result1_green[0];

		Object[] result2_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_2_DependenciesofGetterSetterDetector_blackBBF(graph, this);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[graph] = " + graph + ", "
					+ "[this] = " + this + ".");
		}
		HGetterSetterMethodRelationCalculator nacc = (HGetterSetterMethodRelationCalculator) result2_black[2];
		Object[] result2_green = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_2_DependenciesofGetterSetterDetector_greenFBBBF(graph, this, nacc);
		HGetterSetterDetector getterSetterDetector = (HGetterSetterDetector) result2_green[0];
		//nothing Edge edge8 = (Edge) result2_green[4];

		Object[] result3_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_3_DependenciesofDataClassDetector_blackBBB(getterSetterDetector, graph,
						this);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[getterSetterDetector] = "
					+ getterSetterDetector + ", " + "[graph] = " + graph + ", " + "[this] = " + this + ".");
		}
		Object[] result3_green = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_3_DependenciesofDataClassDetector_greenFFBBB(getterSetterDetector,
						graph, this);
		HDataClassDetector dataclassDetector = (HDataClassDetector) result3_green[0];
		//nothing Edge edge = (Edge) result3_green[1];

		Object[] result4_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_4_DependenciesofHDataClassAccessorDetector_blackBBB(this, graph,
						dataclassDetector);
		if (result4_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[graph] = " + graph + ", " + "[dataclassDetector] = " + dataclassDetector + ".");
		}
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_1_4_DependenciesofHDataClassAccessorDetector_greenBBFFB(
				this, graph, dataclassDetector);
		//nothing HDataClassAccessorDetector dca = (HDataClassAccessorDetector) result4_green[2];
		//nothing Edge edge2 = (Edge) result4_green[3];

		Object[] result5_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_5_DependenciesofLowCohesionDetector_blackBFB(graph, this);
		if (result5_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[graph] = " + graph + ", "
					+ "[this] = " + this + ".");
		}
		HLcom5Calculator lcom = (HLcom5Calculator) result5_black[1];
		Object[] result5_green = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_5_DependenciesofLowCohesionDetector_greenFBBFB(graph, lcom, this);
		//nothing Edge edge3 = (Edge) result5_green[0];
		HLowCohesionDetector low = (HLowCohesionDetector) result5_green[3];

		Object[] result6_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_6_DependenciesofLargeClassDetector_blackBFB(graph, this);
		if (result6_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[graph] = " + graph + ", "
					+ "[this] = " + this + ".");
		}
		HMemberNumberCalculator nmd = (HMemberNumberCalculator) result6_black[1];
		Object[] result6_green = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_6_DependenciesofLargeClassDetector_greenFBFBB(graph, nmd, this);
		//nothing Edge edge1 = (Edge) result6_green[0];
		HLargeClassDetector largeClassDetector = (HLargeClassDetector) result6_green[2];

		Object[] result7_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_7_DependenciesofLargeClassLowCohesionDetector_blackBBBB(graph,
						largeClassDetector, low, this);
		if (result7_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[graph] = " + graph + ", "
					+ "[largeClassDetector] = " + largeClassDetector + ", " + "[low] = " + low + ", " + "[this] = "
					+ this + ".");
		}
		Object[] result7_green = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_7_DependenciesofLargeClassLowCohesionDetector_greenFFBBFBB(graph,
						largeClassDetector, low, this);
		//nothing Edge edge4 = (Edge) result7_green[0];
		//nothing Edge edge5 = (Edge) result7_green[1];
		HLargeClassLowCohesionDetector lclc = (HLargeClassLowCohesionDetector) result7_green[4];

		Object[] result8_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_8_DependenciesofControllerClassDetector_blackFBB(graph, this);
		if (result8_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[graph] = " + graph + ", "
					+ "[this] = " + this + ".");
		}
		HInvocationRelationCalculator inc = (HInvocationRelationCalculator) result8_black[0];
		Object[] result8_green = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_8_DependenciesofControllerClassDetector_greenBFBBF(inc, graph, this);
		HContollerClassDetector controller = (HContollerClassDetector) result8_green[1];
		//nothing Edge edge9 = (Edge) result8_green[4];

		Object[] result9_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_9_DependenciesofMainClassDetector_blackBBBB(controller, graph, lclc,
						this);
		if (result9_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[controller] = " + controller
					+ ", " + "[graph] = " + graph + ", " + "[lclc] = " + lclc + ", " + "[this] = " + this + ".");
		}
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_1_9_DependenciesofMainClassDetector_greenBFFBBFB(
				controller, graph, lclc, this);
		//nothing Edge edge6 = (Edge) result9_green[1];
		//nothing Edge edge7 = (Edge) result9_green[2];
		//nothing HGodClassDetector mc = (HGodClassDetector) result9_green[5];

		Object[] result10_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_10_ActivityNode12_blackBBF(this, graph);
		if (result10_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[graph] = " + graph + ".");
		}
		HAverageParametersCalculator paramMetric = (HAverageParametersCalculator) result10_black[2];
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_1_10_ActivityNode12_greenBBFBF(this, graph,
				paramMetric);
		//nothing HManyParametersDetector param = (HManyParametersDetector) result10_green[2];
		//nothing Edge edge10 = (Edge) result10_green[4];

		Object[] result11_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_11_ActivityNode12_blackBBF(this, graph);
		if (result11_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[graph] = " + graph + ".");
		}
		HAverageOverloadingInClassCalculator overMetric = (HAverageOverloadingInClassCalculator) result11_black[2];
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_1_11_ActivityNode12_greenBBFBF(this, graph, overMetric);
		//nothing HMuchOverloadingDetector over = (HMuchOverloadingDetector) result11_green[2];
		//nothing Edge edge11 = (Edge) result11_green[4];

		Object[] result12_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_1_12_ActivityNode14_blackBBF(this, graph);
		if (result12_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[graph] = " + graph + ".");
		}
		HLocalAccessRelationCalculator local = (HLocalAccessRelationCalculator) result12_black[2];
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_1_12_ActivityNode14_greenBBFBF(this, graph, local);
		//nothing HIntenseFieldUsageDetector infuse = (HIntenseFieldUsageDetector) result12_green[2];
		//nothing Edge edge12 = (Edge) result12_green[4];

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createMetricDependencies(DFSGraph graph) {

		Object[] result1_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_1_numberOfMembersMetric_blackBB(graph, this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[graph] = " + graph + ", "
					+ "[this] = " + this + ".");
		}
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_2_1_numberOfMembersMetric_greenBFB(graph, this);
		//nothing HMemberNumberCalculator nmd = (HMemberNumberCalculator) result1_green[1];

		Object[] result2_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_2_ActivityNode2_blackBB(graph, this);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[graph] = " + graph + ", "
					+ "[this] = " + this + ".");
		}
		Object[] result2_green = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_2_ActivityNode2_greenBBF(graph, this);
		HMethodNumberCalculator methods = (HMethodNumberCalculator) result2_green[2];

		Object[] result3_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_3_ActivityNode16_blackBB(this, graph);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[graph] = " + graph + ".");
		}
		Object[] result3_green = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_3_ActivityNode16_greenBFB(this, graph);
		HFieldNumberCalculator fnc = (HFieldNumberCalculator) result3_green[1];

		Object[] result4_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_4_ActivityNode18_blackBB(this, graph);
		if (result4_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[graph] = " + graph + ".");
		}
		Object[] result4_green = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_4_ActivityNode18_greenBFB(this, graph);
		HLocalFieldUniqueAccessCalculator lfuac = (HLocalFieldUniqueAccessCalculator) result4_green[1];

		Object[] result5_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_5_ActivityNode19_blackBB(this, graph);
		if (result5_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[graph] = " + graph + ".");
		}
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_2_5_ActivityNode19_greenBFB(this, graph);
		//nothing HAfferentCouplingCalculator ac = (HAfferentCouplingCalculator) result5_green[1];

		Object[] result6_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_6_ActivityNode20_blackBB(this, graph);
		if (result6_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[graph] = " + graph + ".");
		}
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_2_6_ActivityNode20_greenBBF(this, graph);
		//nothing HEfferentCouplingCalculator ec = (HEfferentCouplingCalculator) result6_green[2];

		Object[] result7_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_7_ActivityNode21_blackBB(this, graph);
		if (result7_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[graph] = " + graph + ".");
		}
		Object[] result7_green = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_7_ActivityNode21_greenBFB(this, graph);
		HIncommingInvocationCalculator nii = (HIncommingInvocationCalculator) result7_green[1];

		Object[] result8_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_8_ActivityNode22_blackBB(this, graph);
		if (result8_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[graph] = " + graph + ".");
		}
		Object[] result8_green = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_8_ActivityNode22_greenBFB(this, graph);
		HOutgoingInvocationCalculator noi = (HOutgoingInvocationCalculator) result8_green[1];

		Object[] result9_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_9_ActivityNode23_blackBB(this, graph);
		if (result9_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[graph] = " + graph + ".");
		}
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_2_9_ActivityNode23_greenBFB(this, graph);
		//nothing HDepthOfInheritanceCalculator doicc = (HDepthOfInheritanceCalculator) result9_green[1];

		Object[] result10_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_10_ActivityNode24_blackBB(this, graph);
		if (result10_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[graph] = " + graph + ".");
		}
		Object[] result10_green = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_10_ActivityNode24_greenBFB(this, graph);
		HGetterCalculator ng = (HGetterCalculator) result10_green[1];

		Object[] result11_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_11_ActivityNode25_blackBB(this, graph);
		if (result11_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[graph] = " + graph + ".");
		}
		Object[] result11_green = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_11_ActivityNode25_greenBFB(this, graph);
		HSetterCalculator ns = (HSetterCalculator) result11_green[1];

		Object[] result12_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_12_ActivityNode10_blackBB(this, graph);
		if (result12_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[graph] = " + graph + ".");
		}
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_2_12_ActivityNode10_greenBBF(this, graph);
		//nothing HAverageParametersCalculator params = (HAverageParametersCalculator) result12_green[2];

		Object[] result13_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_13_ActivityNode11_blackBB(this, graph);
		if (result13_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[graph] = " + graph + ".");
		}
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_2_13_ActivityNode11_greenBBF(this, graph);
		//nothing HAverageOverloadingInClassCalculator over = (HAverageOverloadingInClassCalculator) result13_green[2];

		Object[] result14_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_14_ActivityNode13_blackBB(this, graph);
		if (result14_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[graph] = " + graph + ".");
		}
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_2_14_ActivityNode13_greenBFB(this, graph);
		//nothing HNumberOfChildCalculator child = (HNumberOfChildCalculator) result14_green[1];

		Object[] result15_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_15_ActivityNode13_blackBB(this, graph);
		if (result15_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[graph] = " + graph + ".");
		}
		Object[] result15_green = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_15_ActivityNode13_greenBFB(this, graph);
		HLocalMethodAccessCalculator lma = (HLocalMethodAccessCalculator) result15_green[1];

		Object[] result16_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_16_ActivityNode13_blackBB(this, graph);
		if (result16_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[graph] = " + graph + ".");
		}
		Object[] result16_green = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_16_ActivityNode13_greenBFB(this, graph);
		HLocalFieldsAccessCalculator lfa = (HLocalFieldsAccessCalculator) result16_green[1];

		Object[] result17_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_17_ActivityNode9_blackBBBB(graph, this, noi, nii);
		if (result17_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[graph] = " + graph + ", "
					+ "[this] = " + this + ", " + "[noi] = " + noi + ", " + "[nii] = " + nii + ".");
		}
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_2_17_ActivityNode9_greenBBFBBFF(graph, this, noi, nii);
		//nothing HInvocationRelationCalculator relation = (HInvocationRelationCalculator) result17_green[2];
		//nothing Edge edge3 = (Edge) result17_green[5];
		//nothing Edge edge4 = (Edge) result17_green[6];

		Object[] result18_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_18_ActivityNode8_blackBBBBB(graph, ng, ns, methods, this);
		if (result18_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[graph] = " + graph + ", " + "[ng] = " + ng + ", "
							+ "[ns] = " + ns + ", " + "[methods] = " + methods + ", " + "[this] = " + this + ".");
		}
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_2_18_ActivityNode8_greenBFBBBFFFB(graph, ng, ns,
				methods, this);
		//nothing HGetterSetterMethodRelationCalculator getterSetterRelation = (HGetterSetterMethodRelationCalculator) result18_green[1];
		//nothing Edge edge0 = (Edge) result18_green[5];
		//nothing Edge edge1 = (Edge) result18_green[6];
		//nothing Edge edge2 = (Edge) result18_green[7];

		Object[] result19_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_19_ActivityNode13_blackBBBB(this, graph, lfa, lma);
		if (result19_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[graph] = " + graph + ", " + "[lfa] = " + lfa + ", " + "[lma] = " + lma + ".");
		}
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_2_19_ActivityNode13_greenBFBBBFF(this, graph, lfa, lma);
		//nothing HLocalAccessRelationCalculator far = (HLocalAccessRelationCalculator) result19_green[1];
		//nothing Edge edge5 = (Edge) result19_green[5];
		//nothing Edge edge6 = (Edge) result19_green[6];

		Object[] result20_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_20_ActivityNode17_blackBBBBB(lfuac, this, graph, methods, fnc);
		if (result20_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[lfuac] = " + lfuac + ", "
					+ "[this] = " + this + ", " + "[graph] = " + graph + ", " + "[methods] = " + methods + ", "
					+ "[fnc] = " + fnc + ".");
		}
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_2_20_ActivityNode17_greenBBBFFFFBB(lfuac, this, graph,
				methods, fnc);
		//nothing HLcom5Calculator lcom5Custom = (HLcom5Calculator) result20_green[3];
		//nothing Edge edge7 = (Edge) result20_green[4];
		//nothing Edge edge8 = (Edge) result20_green[5];
		//nothing Edge edge9 = (Edge) result20_green[6];

		Object[] result21_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_21_ActivityNode39_blackBB(this, graph);
		if (result21_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[graph] = " + graph + ".");
		}
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_2_21_ActivityNode39_greenBBF(this, graph);
		//nothing HTotalCouplingCalculator tcoupling = (HTotalCouplingCalculator) result21_green[2];

		Object[] result22_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_22_ActivityNode40_blackBB(graph, this);
		if (result22_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[graph] = " + graph + ", "
					+ "[this] = " + this + ".");
		}
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_2_22_ActivityNode40_greenBBFFF(graph, this);
		//nothing HIGATCalculator igat = (HIGATCalculator) result22_green[2];
		//nothing HIGAMCalculator igam = (HIGAMCalculator) result22_green[3];
		//nothing Edge edge10 = (Edge) result22_green[4];

		Object[] result23_black = HAntiPatternDetectionImpl
				.pattern_HAntiPatternDetection_2_23_ActivityNode41_blackBB(this, graph);
		if (result23_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[graph] = " + graph + ".");
		}
		HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_2_23_ActivityNode41_greenBBF(this, graph);
		//nothing HTotalVisibilityCalculator hTotalMethodVisibility = (HTotalVisibilityCalculator) result23_green[2];

		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DFSGraph getDependencyGraph() {// 
		Object[] result1_black = HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_4_1_blackBFF(this);
		if (result1_black != null) {
			DFSGraph graph = (DFSGraph) result1_black[1];
			//nothing HDetector hDetector = (HDetector) result1_black[2];
			return HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_4_2_expressionFB(graph);
		} else {

			Object[] result3_black = HAntiPatternDetectionImpl
					.pattern_HAntiPatternDetection_4_3_CreateDependencyGraph_blackB(this);
			if (result3_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
			}
			Object[] result3_green = HAntiPatternDetectionImpl
					.pattern_HAntiPatternDetection_4_3_CreateDependencyGraph_greenF();
			DFSGraph graph = (DFSGraph) result3_green[0];

			// 
			HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_4_4_Callextractedmethod_expressionBB(this, graph);
			// 
			HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_4_5_Callextractedmethod_expressionBB(this, graph);
			// 
			HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_4_6_Callextractedmethod_expressionBB(this, graph);
			return HAntiPatternDetectionImpl.pattern_HAntiPatternDetection_4_7_expressionFB(graph);
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
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

	public static final Object[] pattern_HAntiPatternDetection_0_1_ActivityNode1_blackBBFF(DFSGraph graph,
			HAntiPatternDetection _this) {
		for (Node tmpDacAccessor : graph.getNodes()) {
			if (tmpDacAccessor instanceof HDataClassAccessorDetector) {
				HDataClassAccessorDetector dacAccessor = (HDataClassAccessorDetector) tmpDacAccessor;
				if (_this.equals(dacAccessor.getHAntiPatternHandling())) {
					for (HDetector tmpGod : _this.getHDetector()) {
						if (tmpGod instanceof HGodClassDetector) {
							HGodClassDetector god = (HGodClassDetector) tmpGod;
							if (graph.equals(god.getGraph())) {
								return new Object[] { graph, _this, god, dacAccessor };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_HAntiPatternDetection_0_1_ActivityNode1_greenFBFBBBF(DFSGraph graph,
			HAntiPatternDetection _this, HGodClassDetector god, HDataClassAccessorDetector dacAccessor) {
		Edge blobReqDataClass = DfsFactory.eINSTANCE.createEdge();
		HBlobDetector tbeBlob = AntipatternFactory.eINSTANCE.createHBlobDetector();
		Edge blobReqDataCAccessor = DfsFactory.eINSTANCE.createEdge();
		god.getIncoming().add(blobReqDataClass);
		blobReqDataClass.setGraph(graph);
		tbeBlob.setGraph(graph);
		tbeBlob.getOutgoing().add(blobReqDataClass);
		tbeBlob.setHAntiPatternHandling(_this);
		blobReqDataCAccessor.setGraph(graph);
		tbeBlob.getOutgoing().add(blobReqDataCAccessor);
		dacAccessor.getIncoming().add(blobReqDataCAccessor);
		return new Object[] { blobReqDataClass, graph, tbeBlob, _this, god, dacAccessor, blobReqDataCAccessor };
	}

	public static final Object[] pattern_HAntiPatternDetection_0_2_ActivityNode1_blackBFBFF(HAntiPatternDetection _this,
			DFSGraph graph) {
		for (HDetector tmpLargeClassDetector : _this.getHDetector()) {
			if (tmpLargeClassDetector instanceof HLargeClassDetector) {
				HLargeClassDetector largeClassDetector = (HLargeClassDetector) tmpLargeClassDetector;
				if (graph.equals(largeClassDetector.getGraph())) {
					for (HDetector tmpOverloadingDetector : _this.getHDetector()) {
						if (tmpOverloadingDetector instanceof HMuchOverloadingDetector) {
							HMuchOverloadingDetector overloadingDetector = (HMuchOverloadingDetector) tmpOverloadingDetector;
							if (graph.equals(overloadingDetector.getGraph())) {
								for (Node tmpNiiCalculator : graph.getNodes()) {
									if (tmpNiiCalculator instanceof HIncommingInvocationCalculator) {
										HIncommingInvocationCalculator niiCalculator = (HIncommingInvocationCalculator) tmpNiiCalculator;
										if (_this.equals(niiCalculator.getHAntiPatternHandling())) {
											return new Object[] { _this, largeClassDetector, graph, overloadingDetector,
													niiCalculator };
										}
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

	public static final Object[] pattern_HAntiPatternDetection_0_2_ActivityNode1_greenFBFBBBFBF(
			HAntiPatternDetection _this, HLargeClassDetector largeClassDetector, DFSGraph graph,
			HMuchOverloadingDetector overloadingDetector, HIncommingInvocationCalculator niiCalculator) {
		Edge largeclassEdge = DfsFactory.eINSTANCE.createEdge();
		HSwissArmyKnifeDetector swa = AntipatternFactory.eINSTANCE.createHSwissArmyKnifeDetector();
		Edge overloadingEdge = DfsFactory.eINSTANCE.createEdge();
		Edge niiEdge = DfsFactory.eINSTANCE.createEdge();
		largeClassDetector.getIncoming().add(largeclassEdge);
		largeclassEdge.setGraph(graph);
		swa.setHAntiPatternHandling(_this);
		swa.setGraph(graph);
		swa.getOutgoing().add(largeclassEdge);
		swa.getOutgoing().add(overloadingEdge);
		overloadingDetector.getIncoming().add(overloadingEdge);
		overloadingEdge.setGraph(graph);
		swa.getOutgoing().add(niiEdge);
		niiEdge.setGraph(graph);
		niiCalculator.getIncoming().add(niiEdge);
		return new Object[] { largeclassEdge, _this, swa, largeClassDetector, graph, overloadingDetector,
				overloadingEdge, niiCalculator, niiEdge };
	}

	public static final Object[] pattern_HAntiPatternDetection_0_3_ActivityNode15_blackBBFFFFFB(
			HAntiPatternDetection _this, DFSGraph graph, HLargeClassDetector largeClassDetector) {
		for (HDetector tmpInh : _this.getHDetector()) {
			if (tmpInh instanceof HDepthOfInheritanceCalculator) {
				HDepthOfInheritanceCalculator inh = (HDepthOfInheritanceCalculator) tmpInh;
				if (graph.equals(inh.getGraph())) {
					for (HDetector tmpChild : _this.getHDetector()) {
						if (tmpChild instanceof HNumberOfChildCalculator) {
							HNumberOfChildCalculator child = (HNumberOfChildCalculator) tmpChild;
							if (graph.equals(child.getGraph())) {
								for (HDetector tmpOver : _this.getHDetector()) {
									if (tmpOver instanceof HAverageOverloadingInClassCalculator) {
										HAverageOverloadingInClassCalculator over = (HAverageOverloadingInClassCalculator) tmpOver;
										if (graph.equals(over.getGraph())) {
											for (HDetector tmpParam : _this.getHDetector()) {
												if (tmpParam instanceof HAverageParametersCalculator) {
													HAverageParametersCalculator param = (HAverageParametersCalculator) tmpParam;
													if (graph.equals(param.getGraph())) {
														for (HDetector tmpField : _this.getHDetector()) {
															if (tmpField instanceof HIntenseFieldUsageDetector) {
																HIntenseFieldUsageDetector field = (HIntenseFieldUsageDetector) tmpField;
																if (graph.equals(field.getGraph())) {
																	return new Object[] { _this, graph, inh, child,
																			over, param, field, largeClassDetector };
																}
															}
														}
													}
												}
											}
										}
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

	public static final Object[] pattern_HAntiPatternDetection_0_3_ActivityNode15_greenBBFBBBBBBFFFFFF(
			HAntiPatternDetection _this, DFSGraph graph, HDepthOfInheritanceCalculator inh,
			HNumberOfChildCalculator child, HAverageOverloadingInClassCalculator over,
			HAverageParametersCalculator param, HIntenseFieldUsageDetector field,
			HLargeClassDetector largeClassDetector) {
		HSpaghettiCodeDetector spaghetti = AntipatternFactory.eINSTANCE.createHSpaghettiCodeDetector();
		Edge edgeS1 = DfsFactory.eINSTANCE.createEdge();
		Edge edgeS2 = DfsFactory.eINSTANCE.createEdge();
		Edge edgeS3 = DfsFactory.eINSTANCE.createEdge();
		Edge edgeS4 = DfsFactory.eINSTANCE.createEdge();
		Edge edgeS5 = DfsFactory.eINSTANCE.createEdge();
		Edge edgeS6 = DfsFactory.eINSTANCE.createEdge();
		spaghetti.setGraph(graph);
		spaghetti.setHAntiPatternHandling(_this);
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
		return new Object[] { _this, graph, spaghetti, inh, child, over, param, field, largeClassDetector, edgeS1,
				edgeS2, edgeS3, edgeS4, edgeS5, edgeS6 };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_1_DependenciesofEmptyClassDetector_blackBB(
			DFSGraph graph, HAntiPatternDetection _this) {
		return new Object[] { graph, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_1_DependenciesofEmptyClassDetector_greenFBB(
			DFSGraph graph, HAntiPatternDetection _this) {
		HEmptyClassDetector emptyClassDetector = CodesmellsFactory.eINSTANCE.createHEmptyClassDetector();
		emptyClassDetector.setGraph(graph);
		emptyClassDetector.setHAntiPatternHandling(_this);
		return new Object[] { emptyClassDetector, graph, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_2_DependenciesofGetterSetterDetector_blackBBF(
			DFSGraph graph, HAntiPatternDetection _this) {
		for (HDetector tmpNacc : _this.getHDetector()) {
			if (tmpNacc instanceof HGetterSetterMethodRelationCalculator) {
				HGetterSetterMethodRelationCalculator nacc = (HGetterSetterMethodRelationCalculator) tmpNacc;
				if (graph.equals(nacc.getGraph())) {
					return new Object[] { graph, _this, nacc };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_HAntiPatternDetection_1_2_DependenciesofGetterSetterDetector_greenFBBBF(
			DFSGraph graph, HAntiPatternDetection _this, HGetterSetterMethodRelationCalculator nacc) {
		HGetterSetterDetector getterSetterDetector = CodesmellsFactory.eINSTANCE.createHGetterSetterDetector();
		Edge edge8 = DfsFactory.eINSTANCE.createEdge();
		getterSetterDetector.setGraph(graph);
		getterSetterDetector.setHAntiPatternHandling(_this);
		getterSetterDetector.getOutgoing().add(edge8);
		nacc.getIncoming().add(edge8);
		edge8.setGraph(graph);
		return new Object[] { getterSetterDetector, graph, _this, nacc, edge8 };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_3_DependenciesofDataClassDetector_blackBBB(
			HGetterSetterDetector getterSetterDetector, DFSGraph graph, HAntiPatternDetection _this) {
		return new Object[] { getterSetterDetector, graph, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_3_DependenciesofDataClassDetector_greenFFBBB(
			HGetterSetterDetector getterSetterDetector, DFSGraph graph, HAntiPatternDetection _this) {
		HDataClassDetector dataclassDetector = CodesmellsFactory.eINSTANCE.createHDataClassDetector();
		Edge edge = DfsFactory.eINSTANCE.createEdge();
		dataclassDetector.setGraph(graph);
		dataclassDetector.setHAntiPatternHandling(_this);
		edge.setGraph(graph);
		dataclassDetector.getOutgoing().add(edge);
		getterSetterDetector.getIncoming().add(edge);
		return new Object[] { dataclassDetector, edge, getterSetterDetector, graph, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_4_DependenciesofHDataClassAccessorDetector_blackBBB(
			HAntiPatternDetection _this, DFSGraph graph, HDataClassDetector dataclassDetector) {
		return new Object[] { _this, graph, dataclassDetector };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_4_DependenciesofHDataClassAccessorDetector_greenBBFFB(
			HAntiPatternDetection _this, DFSGraph graph, HDataClassDetector dataclassDetector) {
		HDataClassAccessorDetector dca = CodesmellsFactory.eINSTANCE.createHDataClassAccessorDetector();
		Edge edge2 = DfsFactory.eINSTANCE.createEdge();
		dca.setHAntiPatternHandling(_this);
		dca.setGraph(graph);
		edge2.setGraph(graph);
		dca.getOutgoing().add(edge2);
		dataclassDetector.getIncoming().add(edge2);
		return new Object[] { _this, graph, dca, edge2, dataclassDetector };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_5_DependenciesofLowCohesionDetector_blackBFB(
			DFSGraph graph, HAntiPatternDetection _this) {
		for (Node tmpLcom : graph.getNodes()) {
			if (tmpLcom instanceof HLcom5Calculator) {
				HLcom5Calculator lcom = (HLcom5Calculator) tmpLcom;
				if (_this.equals(lcom.getHAntiPatternHandling())) {
					return new Object[] { graph, lcom, _this };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_HAntiPatternDetection_1_5_DependenciesofLowCohesionDetector_greenFBBFB(
			DFSGraph graph, HLcom5Calculator lcom, HAntiPatternDetection _this) {
		Edge edge3 = DfsFactory.eINSTANCE.createEdge();
		HLowCohesionDetector low = CodesmellsFactory.eINSTANCE.createHLowCohesionDetector();
		lcom.getIncoming().add(edge3);
		edge3.setGraph(graph);
		low.setGraph(graph);
		low.getOutgoing().add(edge3);
		low.setHAntiPatternHandling(_this);
		return new Object[] { edge3, graph, lcom, low, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_6_DependenciesofLargeClassDetector_blackBFB(
			DFSGraph graph, HAntiPatternDetection _this) {
		for (Node tmpNmd : graph.getNodes()) {
			if (tmpNmd instanceof HMemberNumberCalculator) {
				HMemberNumberCalculator nmd = (HMemberNumberCalculator) tmpNmd;
				if (_this.equals(nmd.getHAntiPatternHandling())) {
					return new Object[] { graph, nmd, _this };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_HAntiPatternDetection_1_6_DependenciesofLargeClassDetector_greenFBFBB(
			DFSGraph graph, HMemberNumberCalculator nmd, HAntiPatternDetection _this) {
		Edge edge1 = DfsFactory.eINSTANCE.createEdge();
		HLargeClassDetector largeClassDetector = CodesmellsFactory.eINSTANCE.createHLargeClassDetector();
		edge1.setGraph(graph);
		nmd.getIncoming().add(edge1);
		largeClassDetector.setGraph(graph);
		largeClassDetector.getOutgoing().add(edge1);
		largeClassDetector.setHAntiPatternHandling(_this);
		return new Object[] { edge1, graph, largeClassDetector, nmd, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_7_DependenciesofLargeClassLowCohesionDetector_blackBBBB(
			DFSGraph graph, HLargeClassDetector largeClassDetector, HLowCohesionDetector low,
			HAntiPatternDetection _this) {
		return new Object[] { graph, largeClassDetector, low, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_7_DependenciesofLargeClassLowCohesionDetector_greenFFBBFBB(
			DFSGraph graph, HLargeClassDetector largeClassDetector, HLowCohesionDetector low,
			HAntiPatternDetection _this) {
		Edge edge4 = DfsFactory.eINSTANCE.createEdge();
		Edge edge5 = DfsFactory.eINSTANCE.createEdge();
		HLargeClassLowCohesionDetector lclc = CodesmellsFactory.eINSTANCE.createHLargeClassLowCohesionDetector();
		largeClassDetector.getIncoming().add(edge4);
		edge4.setGraph(graph);
		low.getIncoming().add(edge5);
		edge5.setGraph(graph);
		lclc.getOutgoing().add(edge5);
		lclc.setGraph(graph);
		lclc.getOutgoing().add(edge4);
		lclc.setHAntiPatternHandling(_this);
		return new Object[] { edge4, edge5, graph, largeClassDetector, lclc, low, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_8_DependenciesofControllerClassDetector_blackFBB(
			DFSGraph graph, HAntiPatternDetection _this) {
		for (Node tmpInc : graph.getNodes()) {
			if (tmpInc instanceof HInvocationRelationCalculator) {
				HInvocationRelationCalculator inc = (HInvocationRelationCalculator) tmpInc;
				if (_this.equals(inc.getHAntiPatternHandling())) {
					return new Object[] { inc, graph, _this };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_HAntiPatternDetection_1_8_DependenciesofControllerClassDetector_greenBFBBF(
			HInvocationRelationCalculator inc, DFSGraph graph, HAntiPatternDetection _this) {
		HContollerClassDetector controller = CodesmellsFactory.eINSTANCE.createHContollerClassDetector();
		Edge edge9 = DfsFactory.eINSTANCE.createEdge();
		controller.setGraph(graph);
		controller.setHAntiPatternHandling(_this);
		controller.getOutgoing().add(edge9);
		edge9.setGraph(graph);
		inc.getIncoming().add(edge9);
		return new Object[] { inc, controller, graph, _this, edge9 };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_9_DependenciesofMainClassDetector_blackBBBB(
			HContollerClassDetector controller, DFSGraph graph, HLargeClassLowCohesionDetector lclc,
			HAntiPatternDetection _this) {
		return new Object[] { controller, graph, lclc, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_9_DependenciesofMainClassDetector_greenBFFBBFB(
			HContollerClassDetector controller, DFSGraph graph, HLargeClassLowCohesionDetector lclc,
			HAntiPatternDetection _this) {
		Edge edge6 = DfsFactory.eINSTANCE.createEdge();
		Edge edge7 = DfsFactory.eINSTANCE.createEdge();
		HGodClassDetector mc = AntipatternFactory.eINSTANCE.createHGodClassDetector();
		controller.getIncoming().add(edge6);
		edge6.setGraph(graph);
		lclc.getIncoming().add(edge7);
		edge7.setGraph(graph);
		mc.setGraph(graph);
		mc.getOutgoing().add(edge6);
		mc.getOutgoing().add(edge7);
		mc.setHAntiPatternHandling(_this);
		return new Object[] { controller, edge6, edge7, graph, lclc, mc, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_10_ActivityNode12_blackBBF(HAntiPatternDetection _this,
			DFSGraph graph) {
		for (Node tmpParamMetric : graph.getNodes()) {
			if (tmpParamMetric instanceof HAverageParametersCalculator) {
				HAverageParametersCalculator paramMetric = (HAverageParametersCalculator) tmpParamMetric;
				if (_this.equals(paramMetric.getHAntiPatternHandling())) {
					return new Object[] { _this, graph, paramMetric };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_HAntiPatternDetection_1_10_ActivityNode12_greenBBFBF(
			HAntiPatternDetection _this, DFSGraph graph, HAverageParametersCalculator paramMetric) {
		HManyParametersDetector param = CodesmellsFactory.eINSTANCE.createHManyParametersDetector();
		Edge edge10 = DfsFactory.eINSTANCE.createEdge();
		param.setHAntiPatternHandling(_this);
		param.setGraph(graph);
		param.getOutgoing().add(edge10);
		paramMetric.getIncoming().add(edge10);
		edge10.setGraph(graph);
		return new Object[] { _this, graph, param, paramMetric, edge10 };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_11_ActivityNode12_blackBBF(HAntiPatternDetection _this,
			DFSGraph graph) {
		for (Node tmpOverMetric : graph.getNodes()) {
			if (tmpOverMetric instanceof HAverageOverloadingInClassCalculator) {
				HAverageOverloadingInClassCalculator overMetric = (HAverageOverloadingInClassCalculator) tmpOverMetric;
				if (_this.equals(overMetric.getHAntiPatternHandling())) {
					return new Object[] { _this, graph, overMetric };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_HAntiPatternDetection_1_11_ActivityNode12_greenBBFBF(
			HAntiPatternDetection _this, DFSGraph graph, HAverageOverloadingInClassCalculator overMetric) {
		HMuchOverloadingDetector over = CodesmellsFactory.eINSTANCE.createHMuchOverloadingDetector();
		Edge edge11 = DfsFactory.eINSTANCE.createEdge();
		over.setHAntiPatternHandling(_this);
		over.setGraph(graph);
		over.getOutgoing().add(edge11);
		overMetric.getIncoming().add(edge11);
		edge11.setGraph(graph);
		return new Object[] { _this, graph, over, overMetric, edge11 };
	}

	public static final Object[] pattern_HAntiPatternDetection_1_12_ActivityNode14_blackBBF(HAntiPatternDetection _this,
			DFSGraph graph) {
		for (HDetector tmpLocal : _this.getHDetector()) {
			if (tmpLocal instanceof HLocalAccessRelationCalculator) {
				HLocalAccessRelationCalculator local = (HLocalAccessRelationCalculator) tmpLocal;
				if (graph.equals(local.getGraph())) {
					return new Object[] { _this, graph, local };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_HAntiPatternDetection_1_12_ActivityNode14_greenBBFBF(
			HAntiPatternDetection _this, DFSGraph graph, HLocalAccessRelationCalculator local) {
		HIntenseFieldUsageDetector infuse = CodesmellsFactory.eINSTANCE.createHIntenseFieldUsageDetector();
		Edge edge12 = DfsFactory.eINSTANCE.createEdge();
		infuse.setGraph(graph);
		infuse.setHAntiPatternHandling(_this);
		edge12.setGraph(graph);
		infuse.getOutgoing().add(edge12);
		local.getIncoming().add(edge12);
		return new Object[] { _this, graph, infuse, local, edge12 };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_1_numberOfMembersMetric_blackBB(DFSGraph graph,
			HAntiPatternDetection _this) {
		return new Object[] { graph, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_1_numberOfMembersMetric_greenBFB(DFSGraph graph,
			HAntiPatternDetection _this) {
		HMemberNumberCalculator nmd = MetricsFactory.eINSTANCE.createHMemberNumberCalculator();
		nmd.setGraph(graph);
		nmd.setHAntiPatternHandling(_this);
		return new Object[] { graph, nmd, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_2_ActivityNode2_blackBB(DFSGraph graph,
			HAntiPatternDetection _this) {
		return new Object[] { graph, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_2_ActivityNode2_greenBBF(DFSGraph graph,
			HAntiPatternDetection _this) {
		HMethodNumberCalculator methods = MetricsFactory.eINSTANCE.createHMethodNumberCalculator();
		methods.setHAntiPatternHandling(_this);
		methods.setGraph(graph);
		return new Object[] { graph, _this, methods };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_3_ActivityNode16_blackBB(HAntiPatternDetection _this,
			DFSGraph graph) {
		return new Object[] { _this, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_3_ActivityNode16_greenBFB(HAntiPatternDetection _this,
			DFSGraph graph) {
		HFieldNumberCalculator fnc = MetricsFactory.eINSTANCE.createHFieldNumberCalculator();
		fnc.setHAntiPatternHandling(_this);
		fnc.setGraph(graph);
		return new Object[] { _this, fnc, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_4_ActivityNode18_blackBB(HAntiPatternDetection _this,
			DFSGraph graph) {
		return new Object[] { _this, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_4_ActivityNode18_greenBFB(HAntiPatternDetection _this,
			DFSGraph graph) {
		HLocalFieldUniqueAccessCalculator lfuac = MetricsFactory.eINSTANCE.createHLocalFieldUniqueAccessCalculator();
		lfuac.setHAntiPatternHandling(_this);
		lfuac.setGraph(graph);
		return new Object[] { _this, lfuac, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_5_ActivityNode19_blackBB(HAntiPatternDetection _this,
			DFSGraph graph) {
		return new Object[] { _this, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_5_ActivityNode19_greenBFB(HAntiPatternDetection _this,
			DFSGraph graph) {
		HAfferentCouplingCalculator ac = MetricsFactory.eINSTANCE.createHAfferentCouplingCalculator();
		ac.setHAntiPatternHandling(_this);
		ac.setGraph(graph);
		return new Object[] { _this, ac, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_6_ActivityNode20_blackBB(HAntiPatternDetection _this,
			DFSGraph graph) {
		return new Object[] { _this, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_6_ActivityNode20_greenBBF(HAntiPatternDetection _this,
			DFSGraph graph) {
		HEfferentCouplingCalculator ec = MetricsFactory.eINSTANCE.createHEfferentCouplingCalculator();
		ec.setHAntiPatternHandling(_this);
		ec.setGraph(graph);
		return new Object[] { _this, graph, ec };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_7_ActivityNode21_blackBB(HAntiPatternDetection _this,
			DFSGraph graph) {
		return new Object[] { _this, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_7_ActivityNode21_greenBFB(HAntiPatternDetection _this,
			DFSGraph graph) {
		HIncommingInvocationCalculator nii = MetricsFactory.eINSTANCE.createHIncommingInvocationCalculator();
		nii.setHAntiPatternHandling(_this);
		nii.setGraph(graph);
		return new Object[] { _this, nii, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_8_ActivityNode22_blackBB(HAntiPatternDetection _this,
			DFSGraph graph) {
		return new Object[] { _this, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_8_ActivityNode22_greenBFB(HAntiPatternDetection _this,
			DFSGraph graph) {
		HOutgoingInvocationCalculator noi = MetricsFactory.eINSTANCE.createHOutgoingInvocationCalculator();
		noi.setHAntiPatternHandling(_this);
		noi.setGraph(graph);
		return new Object[] { _this, noi, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_9_ActivityNode23_blackBB(HAntiPatternDetection _this,
			DFSGraph graph) {
		return new Object[] { _this, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_9_ActivityNode23_greenBFB(HAntiPatternDetection _this,
			DFSGraph graph) {
		HDepthOfInheritanceCalculator doicc = MetricsFactory.eINSTANCE.createHDepthOfInheritanceCalculator();
		doicc.setHAntiPatternHandling(_this);
		doicc.setGraph(graph);
		return new Object[] { _this, doicc, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_10_ActivityNode24_blackBB(HAntiPatternDetection _this,
			DFSGraph graph) {
		return new Object[] { _this, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_10_ActivityNode24_greenBFB(HAntiPatternDetection _this,
			DFSGraph graph) {
		HGetterCalculator ng = MetricsFactory.eINSTANCE.createHGetterCalculator();
		ng.setHAntiPatternHandling(_this);
		ng.setGraph(graph);
		return new Object[] { _this, ng, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_11_ActivityNode25_blackBB(HAntiPatternDetection _this,
			DFSGraph graph) {
		return new Object[] { _this, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_11_ActivityNode25_greenBFB(HAntiPatternDetection _this,
			DFSGraph graph) {
		HSetterCalculator ns = MetricsFactory.eINSTANCE.createHSetterCalculator();
		ns.setHAntiPatternHandling(_this);
		ns.setGraph(graph);
		return new Object[] { _this, ns, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_12_ActivityNode10_blackBB(HAntiPatternDetection _this,
			DFSGraph graph) {
		return new Object[] { _this, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_12_ActivityNode10_greenBBF(HAntiPatternDetection _this,
			DFSGraph graph) {
		HAverageParametersCalculator params = MetricsFactory.eINSTANCE.createHAverageParametersCalculator();
		params.setGraph(graph);
		params.setHAntiPatternHandling(_this);
		return new Object[] { _this, graph, params };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_13_ActivityNode11_blackBB(HAntiPatternDetection _this,
			DFSGraph graph) {
		return new Object[] { _this, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_13_ActivityNode11_greenBBF(HAntiPatternDetection _this,
			DFSGraph graph) {
		HAverageOverloadingInClassCalculator over = MetricsFactory.eINSTANCE
				.createHAverageOverloadingInClassCalculator();
		over.setGraph(graph);
		over.setHAntiPatternHandling(_this);
		return new Object[] { _this, graph, over };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_14_ActivityNode13_blackBB(HAntiPatternDetection _this,
			DFSGraph graph) {
		return new Object[] { _this, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_14_ActivityNode13_greenBFB(HAntiPatternDetection _this,
			DFSGraph graph) {
		HNumberOfChildCalculator child = MetricsFactory.eINSTANCE.createHNumberOfChildCalculator();
		child.setHAntiPatternHandling(_this);
		child.setGraph(graph);
		return new Object[] { _this, child, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_15_ActivityNode13_blackBB(HAntiPatternDetection _this,
			DFSGraph graph) {
		return new Object[] { _this, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_15_ActivityNode13_greenBFB(HAntiPatternDetection _this,
			DFSGraph graph) {
		HLocalMethodAccessCalculator lma = MetricsFactory.eINSTANCE.createHLocalMethodAccessCalculator();
		lma.setHAntiPatternHandling(_this);
		lma.setGraph(graph);
		return new Object[] { _this, lma, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_16_ActivityNode13_blackBB(HAntiPatternDetection _this,
			DFSGraph graph) {
		return new Object[] { _this, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_16_ActivityNode13_greenBFB(HAntiPatternDetection _this,
			DFSGraph graph) {
		HLocalFieldsAccessCalculator lfa = MetricsFactory.eINSTANCE.createHLocalFieldsAccessCalculator();
		lfa.setHAntiPatternHandling(_this);
		lfa.setGraph(graph);
		return new Object[] { _this, lfa, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_17_ActivityNode9_blackBBBB(DFSGraph graph,
			HAntiPatternDetection _this, HOutgoingInvocationCalculator noi, HIncommingInvocationCalculator nii) {
		return new Object[] { graph, _this, noi, nii };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_17_ActivityNode9_greenBBFBBFF(DFSGraph graph,
			HAntiPatternDetection _this, HOutgoingInvocationCalculator noi, HIncommingInvocationCalculator nii) {
		HInvocationRelationCalculator relation = MetricsFactory.eINSTANCE.createHInvocationRelationCalculator();
		Edge edge3 = DfsFactory.eINSTANCE.createEdge();
		Edge edge4 = DfsFactory.eINSTANCE.createEdge();
		relation.setHAntiPatternHandling(_this);
		relation.setGraph(graph);
		relation.getOutgoing().add(edge3);
		noi.getIncoming().add(edge3);
		edge3.setGraph(graph);
		edge4.setGraph(graph);
		relation.getOutgoing().add(edge4);
		nii.getIncoming().add(edge4);
		return new Object[] { graph, _this, relation, noi, nii, edge3, edge4 };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_18_ActivityNode8_blackBBBBB(DFSGraph graph,
			HGetterCalculator ng, HSetterCalculator ns, HMethodNumberCalculator methods, HAntiPatternDetection _this) {
		return new Object[] { graph, ng, ns, methods, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_18_ActivityNode8_greenBFBBBFFFB(DFSGraph graph,
			HGetterCalculator ng, HSetterCalculator ns, HMethodNumberCalculator methods, HAntiPatternDetection _this) {
		HGetterSetterMethodRelationCalculator getterSetterRelation = MetricsFactory.eINSTANCE
				.createHGetterSetterMethodRelationCalculator();
		Edge edge0 = DfsFactory.eINSTANCE.createEdge();
		Edge edge1 = DfsFactory.eINSTANCE.createEdge();
		Edge edge2 = DfsFactory.eINSTANCE.createEdge();
		getterSetterRelation.setGraph(graph);
		getterSetterRelation.setHAntiPatternHandling(_this);
		edge0.setGraph(graph);
		getterSetterRelation.getOutgoing().add(edge0);
		ng.getIncoming().add(edge0);
		edge1.setGraph(graph);
		getterSetterRelation.getOutgoing().add(edge1);
		ns.getIncoming().add(edge1);
		edge2.setGraph(graph);
		getterSetterRelation.getOutgoing().add(edge2);
		methods.getIncoming().add(edge2);
		return new Object[] { graph, getterSetterRelation, ng, ns, methods, edge0, edge1, edge2, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_19_ActivityNode13_blackBBBB(
			HAntiPatternDetection _this, DFSGraph graph, HLocalFieldsAccessCalculator lfa,
			HLocalMethodAccessCalculator lma) {
		return new Object[] { _this, graph, lfa, lma };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_19_ActivityNode13_greenBFBBBFF(
			HAntiPatternDetection _this, DFSGraph graph, HLocalFieldsAccessCalculator lfa,
			HLocalMethodAccessCalculator lma) {
		HLocalAccessRelationCalculator far = MetricsFactory.eINSTANCE.createHLocalAccessRelationCalculator();
		Edge edge5 = DfsFactory.eINSTANCE.createEdge();
		Edge edge6 = DfsFactory.eINSTANCE.createEdge();
		far.setHAntiPatternHandling(_this);
		far.setGraph(graph);
		far.getOutgoing().add(edge5);
		lfa.getIncoming().add(edge5);
		edge5.setGraph(graph);
		far.getOutgoing().add(edge6);
		lma.getIncoming().add(edge6);
		edge6.setGraph(graph);
		return new Object[] { _this, far, graph, lfa, lma, edge5, edge6 };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_20_ActivityNode17_blackBBBBB(
			HLocalFieldUniqueAccessCalculator lfuac, HAntiPatternDetection _this, DFSGraph graph,
			HMethodNumberCalculator methods, HFieldNumberCalculator fnc) {
		return new Object[] { lfuac, _this, graph, methods, fnc };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_20_ActivityNode17_greenBBBFFFFBB(
			HLocalFieldUniqueAccessCalculator lfuac, HAntiPatternDetection _this, DFSGraph graph,
			HMethodNumberCalculator methods, HFieldNumberCalculator fnc) {
		HLcom5Calculator lcom5Custom = MetricsFactory.eINSTANCE.createHLcom5Calculator();
		Edge edge7 = DfsFactory.eINSTANCE.createEdge();
		Edge edge8 = DfsFactory.eINSTANCE.createEdge();
		Edge edge9 = DfsFactory.eINSTANCE.createEdge();
		lcom5Custom.setHAntiPatternHandling(_this);
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
		return new Object[] { lfuac, _this, graph, lcom5Custom, edge7, edge8, edge9, methods, fnc };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_21_ActivityNode39_blackBB(HAntiPatternDetection _this,
			DFSGraph graph) {
		return new Object[] { _this, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_21_ActivityNode39_greenBBF(HAntiPatternDetection _this,
			DFSGraph graph) {
		HTotalCouplingCalculator tcoupling = MetricsFactory.eINSTANCE.createHTotalCouplingCalculator();
		tcoupling.setGraph(graph);
		tcoupling.setHAntiPatternHandling(_this);
		return new Object[] { _this, graph, tcoupling };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_22_ActivityNode40_blackBB(DFSGraph graph,
			HAntiPatternDetection _this) {
		return new Object[] { graph, _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_22_ActivityNode40_greenBBFFF(DFSGraph graph,
			HAntiPatternDetection _this) {
		HIGATCalculator igat = MetricsFactory.eINSTANCE.createHIGATCalculator();
		HIGAMCalculator igam = MetricsFactory.eINSTANCE.createHIGAMCalculator();
		Edge edge10 = DfsFactory.eINSTANCE.createEdge();
		igat.setGraph(graph);
		igat.setHAntiPatternHandling(_this);
		igam.setGraph(graph);
		igam.setHAntiPatternHandling(_this);
		edge10.setGraph(graph);
		igat.getOutgoing().add(edge10);
		igam.getIncoming().add(edge10);
		return new Object[] { graph, _this, igat, igam, edge10 };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_23_ActivityNode41_blackBB(HAntiPatternDetection _this,
			DFSGraph graph) {
		return new Object[] { _this, graph };
	}

	public static final Object[] pattern_HAntiPatternDetection_2_23_ActivityNode41_greenBBF(HAntiPatternDetection _this,
			DFSGraph graph) {
		HTotalVisibilityCalculator hTotalMethodVisibility = MetricsFactory.eINSTANCE.createHTotalVisibilityCalculator();
		hTotalMethodVisibility.setGraph(graph);
		hTotalMethodVisibility.setHAntiPatternHandling(_this);
		return new Object[] { _this, graph, hTotalMethodVisibility };
	}

	public static final Object[] pattern_HAntiPatternDetection_4_1_blackBFF(HAntiPatternDetection _this) {
		for (HDetector hDetector : _this.getHDetector()) {
			DFSGraph graph = hDetector.getGraph();
			if (graph != null) {
				return new Object[] { _this, graph, hDetector };
			}

		}
		return null;
	}

	public static final DFSGraph pattern_HAntiPatternDetection_4_2_expressionFB(DFSGraph graph) {
		DFSGraph _result = graph;
		return _result;
	}

	public static final Object[] pattern_HAntiPatternDetection_4_3_CreateDependencyGraph_blackB(
			HAntiPatternDetection _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_HAntiPatternDetection_4_3_CreateDependencyGraph_greenF() {
		DFSGraph graph = DfsFactory.eINSTANCE.createDFSGraph();
		return new Object[] { graph };
	}

	public static final void pattern_HAntiPatternDetection_4_4_Callextractedmethod_expressionBB(
			HAntiPatternDetection _this, DFSGraph graph) {
		_this.createMetricDependencies(graph);

	}

	public static final void pattern_HAntiPatternDetection_4_5_Callextractedmethod_expressionBB(
			HAntiPatternDetection _this, DFSGraph graph) {
		_this.createCodeSmellDependencies(graph);

	}

	public static final void pattern_HAntiPatternDetection_4_6_Callextractedmethod_expressionBB(
			HAntiPatternDetection _this, DFSGraph graph) {
		_this.createAntiPatternDependencies(graph);

	}

	public static final DFSGraph pattern_HAntiPatternDetection_4_7_expressionFB(DFSGraph graph) {
		DFSGraph _result = graph;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //HAntiPatternDetectionImpl
