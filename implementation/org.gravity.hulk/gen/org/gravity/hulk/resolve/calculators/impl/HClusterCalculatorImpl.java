/**
 */
package org.gravity.hulk.resolve.calculators.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

import org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern;

import org.gravity.hulk.resolve.calculators.CalculatorsPackage;
import org.gravity.hulk.resolve.calculators.HClusterCalculator;

import org.gravity.hulk.resolve.impl.HResolverImpl;

import org.gravity.typegraph.basic.TClass;

import org.gravity.typegraph.basic.annotations.TAnnotatable;
// <-- [user defined imports]
import org.gravity.hulk.refactoringgraph.RefactoringgraphFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import com.apporiented.algorithm.clustering.AverageLinkageStrategy;
import com.apporiented.algorithm.clustering.Cluster;
import com.apporiented.algorithm.clustering.ClusteringAlgorithm;
import com.apporiented.algorithm.clustering.CompleteLinkageStrategy;
import com.apporiented.algorithm.clustering.DefaultClusteringAlgorithm;
import com.apporiented.algorithm.clustering.SingleLinkageStrategy;
import com.apporiented.algorithm.clustering.visualization.DendrogramPanel;
import org.gravity.hulk.refactoringgraph.HCluster;
import org.gravity.hulk.refactoringgraph.HMethodToDataClassAccess;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HCluster Calculator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HClusterCalculatorImpl extends HResolverImpl implements HClusterCalculator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HClusterCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalculatorsPackage.Literals.HCLUSTER_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean detect(TClass tClass) {
		// [user code injected with eMoflon]

		final EList<TMember> defines = tClass.getDefines();
		List<TMethodDefinition> tMethods = new ArrayList<>();
		int size = 0;
		for (TMember tMember : defines) {
			if (tMember instanceof TMethodDefinition) {
				if (tMethods.add((TMethodDefinition) tMember)) {
					size++;
				}
			}
		}

		if (size <= 0) {
			//nothing to do
			return false;
		}

		if (CLUSTER == CLUSTERING.BRUTFORCE) {
			bruteforceAlgo(tClass, tMethods);
		} else if (CLUSTER == CLUSTERING.CLUSTER) {
			clusterAlgo(tClass, tMethods, size);
		} else {
			RefactoringgraphFactory factory = RefactoringgraphFactory.eINSTANCE;
			List<HCluster> clusters = new ArrayList<HCluster>();

			for (TMethodDefinition tMethod : tMethods) {
				HCluster cluster = factory.createHCluster();
				cluster.setValue(1);
				cluster.getTMembers().add(tMethod);
				tClass.getTAnnotation().add(cluster);
				clusters.add(cluster);
			}
		}
		return true;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean detect(HAntiPatternGraph apg) {

		Object[] result1_black = HClusterCalculatorImpl.pattern_HClusterCalculator_1_1_ActivityNode22_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		// ForEach 
		for (Object[] result2_black : HClusterCalculatorImpl
				.pattern_HClusterCalculator_1_2_ActivityNode23_blackBFF(apg)) {
			//nothing HBlobAntiPattern blob = (HBlobAntiPattern) result2_black[1];
			TClass tClass = (TClass) result2_black[2];
			// 
			HClusterCalculatorImpl.pattern_HClusterCalculator_1_3_ActivityNode24_expressionFBB(this, tClass);

		}
		return HClusterCalculatorImpl.pattern_HClusterCalculator_1_4_expressionF();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case CalculatorsPackage.HCLUSTER_CALCULATOR___DETECT__TCLASS:
			return detect((TClass) arguments.get(0));
		case CalculatorsPackage.HCLUSTER_CALCULATOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_HClusterCalculator_1_1_ActivityNode22_blackB(HClusterCalculator _this) {
		return new Object[] { _this };
	}

	public static final Iterable<Object[]> pattern_HClusterCalculator_1_2_ActivityNode23_blackBFF(
			HAntiPatternGraph apg) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (HAnnotation tmpBlob : apg.getHAnnotations()) {
			if (tmpBlob instanceof HBlobAntiPattern) {
				HBlobAntiPattern blob = (HBlobAntiPattern) tmpBlob;
				TAnnotatable tmpTClass = blob.getTAnnotated();
				if (tmpTClass instanceof TClass) {
					TClass tClass = (TClass) tmpTClass;
					_result.add(new Object[] { apg, blob, tClass });
				}

			}
		}
		return _result;
	}

	public static final boolean pattern_HClusterCalculator_1_3_ActivityNode24_expressionFBB(HClusterCalculator _this,
			TClass tClass) {
		boolean _localVariable_0 = _this.detect(tClass);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_HClusterCalculator_1_4_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	private static final CLUSTERING CLUSTER = CLUSTERING.NONE;

	public enum CLUSTERING {
		BRUTFORCE, CLUSTER, NONE;
	}

	@Override
	public String getGuiName() {
		return "Connected Members";
	}

	private void bruteforceAlgo(TClass tClass, List<TMethodDefinition> tMethods) {
		Hashtable<TMethodDefinition, List<TClass>> dataclasses = new Hashtable<>();
		for (TMethodDefinition tMethod : tMethods) {
			for (TAnnotation tAnnotation : tMethod.getTAnnotation()) {
				if (tAnnotation instanceof HMethodToDataClassAccess) {
					HMethodToDataClassAccess dca = (HMethodToDataClassAccess) tAnnotation;
					List<TClass> dc;
					if (dataclasses.containsKey(tMethod)) {
						dc = dataclasses.get(tMethod);
					} else {
						dc = new ArrayList<>();
						dataclasses.put(tMethod, dc);
					}
					if (!dc.contains(dca.getHDataClass())) {
						dc.add(dca.getHDataClass());
					}
				}
			}
		}

		fill(dataclasses, new Hashtable<TMethodDefinition, TClass>(), tClass);
	}

	private void fill(Hashtable<TMethodDefinition, List<TClass>> input, Hashtable<TMethodDefinition, TClass> output,
			TClass tClass) {
		Iterator<Entry<TMethodDefinition, List<TClass>>> iterator = input.entrySet().iterator();
		if (iterator.hasNext()) {
			Entry<TMethodDefinition, List<TClass>> entry = iterator.next();
			TMethodDefinition key = entry.getKey();
			List<TClass> values = input.remove(key);
			;
			for (TClass value : values) {
				List<TMethodDefinition> list;
				output.put(key, value);
				fill(input, output, tClass);
				output.remove(key);
			}
		} else {
			RefactoringgraphFactory factory = RefactoringgraphFactory.eINSTANCE;
			Hashtable<TClass, HCluster> clusters = new Hashtable<>();
			for (TMethodDefinition key : output.keySet()) {
				TClass value = output.get(key);
				HCluster hCluster;
				if (clusters.containsKey(value)) {
					hCluster = clusters.get(value);
				} else {
					hCluster = factory.createHCluster();
					tClass.getTAnnotation().add(hCluster);
					hCluster.setTAnnotated(tClass);
					clusters.put(value, hCluster);
				}
				hCluster.getTMembers().add(key);
			}
			for (TClass tData : clusters.keySet()) {
				System.out.println("Next Cluster (" + tData + "):");
				HCluster hCluster = clusters.get(tData);
				for (TMember m : hCluster.getTMembers()) {
					System.out.println(m.getSignatureString() + "->" + tData.getFullyQualifiedName());
				}
			}
			System.out.println();
		}
	}

	private void clusterAlgo(TClass tClass, List<TMethodDefinition> tMethods, int size) {
		Double treshold = Math.sqrt(size);

		String[] names = new String[size];
		double[][] distances = new double[size][size];
		for (int i = 0; i < size; i++) {
			names[i] = Integer.toString(i);
			for (int j = 0; j < size; j++) {
				distances[i][j] = 0;
			}
		}

		double max = 0;
		for (int i = 0; i < size; i++) {
			for (TAccess tAccess : tMethods.get(i).getTAccessing()) {
				int j = tMethods.indexOf(tAccess.getTTarget());
				if (j >= 0) {
					double distance = distances[i][j]++;
					if (distance > max) {
						max = distance;
					}
				}
			}
		}

		max++;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				double distance = distances[i][j];
				distances[i][j] = max - distance;
			}
		}

		ClusteringAlgorithm alg = new DefaultClusteringAlgorithm();
		Stack<Cluster> stack = new Stack<>();
		stack.add(alg.performClustering(distances, names, new CompleteLinkageStrategy()));

		RefactoringgraphFactory factory = RefactoringgraphFactory.eINSTANCE;
		List<HCluster> clusters = new ArrayList<HCluster>();

		while (!stack.isEmpty()) {
			Cluster current = stack.pop();
			stack.addAll(current.getChildren());
			if (current.getWeightValue() < 3 * treshold) {
				List<String> leafNames = new ArrayList<>();

				Stack<Cluster> collect = new Stack<Cluster>();
				collect.add(current);
				while (!collect.isEmpty()) {
					Cluster next = collect.pop();
					String name = next.getName();
					if (!name.startsWith("clstr")) {
						leafNames.add(name);
					}
					collect.addAll(next.getChildren());
				}

				HCluster cluster = factory.createHCluster();
				cluster.setValue(leafNames.size());
				for (String name : leafNames) {
					cluster.getTMembers().add(tMethods.get(Integer.parseInt(name)));
				}
				tClass.getTAnnotation().add(cluster);
				clusters.add(cluster);
			}
		}
	}

	// [user code injected with eMoflon] -->
} //HClusterCalculatorImpl
