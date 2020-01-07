/**
 */
package org.gravity.hulk.resolve.calculators.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.antipatterngraph.antipattern.HBlobAntiPattern;
import org.gravity.hulk.refactoringgraph.HCluster;
import org.gravity.hulk.refactoringgraph.HMethodToDataClassAccess;
// [user defined imports] -->
// <-- [user defined imports]
import org.gravity.hulk.refactoringgraph.RefactoringgraphFactory;
import org.gravity.hulk.resolve.calculators.CalculatorsPackage;
import org.gravity.hulk.resolve.calculators.HClusterCalculator;
import org.gravity.hulk.resolve.impl.HResolverImpl;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.gravity.typegraph.basic.annotations.TAnnotation;

import com.apporiented.algorithm.clustering.Cluster;
import com.apporiented.algorithm.clustering.ClusteringAlgorithm;
import com.apporiented.algorithm.clustering.CompleteLinkageStrategy;
import com.apporiented.algorithm.clustering.DefaultClusteringAlgorithm;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>HCluster Calculator</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HClusterCalculatorImpl extends HResolverImpl implements HClusterCalculator {

	private static final Logger LOGGER = Logger.getLogger(HClusterCalculatorImpl.class);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected HClusterCalculatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalculatorsPackage.Literals.HCLUSTER_CALCULATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean detect(final TClass tClass) {
		// [user code injected with eMoflon]

		final EList<TMember> defines = tClass.getDefines();
		final List<TMethodDefinition> tMethods = new ArrayList<>();
		int size = 0;
		for (final TMember tMember : defines) {
			if (tMember instanceof TMethodDefinition && tMethods.add((TMethodDefinition) tMember)) {
				size++;
			}

		}

		if (size <= 0) {
			// nothing to do
			return false;
		}

		if (CLUSTER == CLUSTERING.BRUTFORCE) {
			bruteforceAlgo(tClass, tMethods);
		} else if (CLUSTER == CLUSTERING.CLUSTER) {
			clusterAlgo(tClass, tMethods, size);
		} else {
			final RefactoringgraphFactory factory = RefactoringgraphFactory.eINSTANCE;
			final List<HCluster> clusters = new ArrayList<>();

			for (final TMethodDefinition tMethod : tMethods) {
				final HCluster cluster = factory.createHCluster();
				cluster.setValue(1);
				cluster.getTMembers().add(tMethod);
				tClass.getTAnnotation().add(cluster);
				clusters.add(cluster);
			}
		}
		return true;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean detect(final HAntiPatternGraph apg) {
		for (final HAnnotation annotation : apg.getHAnnotations()) {
			if (annotation instanceof HBlobAntiPattern) {
				final TAnnotatable tClass = annotation.getTAnnotated();
				if (tClass instanceof TClass) {
					detect((TClass) tClass);
				}
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case CalculatorsPackage.HCLUSTER_CALCULATOR___DETECT__TCLASS:
			return detect((TClass) arguments.get(0));
		case CalculatorsPackage.HCLUSTER_CALCULATOR___DETECT__HANTIPATTERNGRAPH:
			return detect((HAntiPatternGraph) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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

	private void bruteforceAlgo(final TClass tClass, final List<TMethodDefinition> tMethods) {
		final HashMap<TMethodDefinition, List<TClass>> dataclasses = new HashMap<>();
		for (final TMethodDefinition tMethod : tMethods) {
			for (final TAnnotation tAnnotation : tMethod.getTAnnotation()) {
				if (tAnnotation instanceof HMethodToDataClassAccess) {
					final HMethodToDataClassAccess dca = (HMethodToDataClassAccess) tAnnotation;
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

		fill(dataclasses, new HashMap<TMethodDefinition, TClass>(), tClass);
	}

	private void fill(final HashMap<TMethodDefinition, List<TClass>> input,
			final HashMap<TMethodDefinition, TClass> output, final TClass tClass) {
		final Iterator<Entry<TMethodDefinition, List<TClass>>> iterator = input.entrySet().iterator();
		if (iterator.hasNext()) {
			final Entry<TMethodDefinition, List<TClass>> entry = iterator.next();
			final TMethodDefinition key = entry.getKey();
			final List<TClass> values = input.remove(key);

			for (final TClass value : values) {
				output.put(key, value);
				fill(input, output, tClass);
				output.remove(key);
			}
		} else {
			final RefactoringgraphFactory factory = RefactoringgraphFactory.eINSTANCE;
			final HashMap<TClass, HCluster> clusters = new HashMap<>();
			for (final Entry<TMethodDefinition, TClass> entry : output.entrySet()) {
				final TMethodDefinition key = entry.getKey();
				final TClass value = entry.getValue();
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
			for (final Entry<TClass, HCluster> entry : clusters.entrySet()) {
				final TClass tData = entry.getKey();
				LOGGER.info("Next Cluster (" + tData + "):");
				final HCluster hCluster = entry.getValue();
				for (final TMember m : hCluster.getTMembers()) {
					LOGGER.info(m.getSignatureString() + "->" + tData.getFullyQualifiedName());
				}
			}
			LOGGER.info('\n');
		}
	}

	private void clusterAlgo(final TClass tClass, final List<TMethodDefinition> tMethods, final int size) {
		final Double treshold = Math.sqrt(size);

		final String[] names = new String[size];
		final double[][] distances = new double[size][size];
		for (int i = 0; i < size; i++) {
			names[i] = Integer.toString(i);
			for (int j = 0; j < size; j++) {
				distances[i][j] = 0;
			}
		}

		double max = 0;
		for (int i = 0; i < size; i++) {
			for (final TAccess tAccess : tMethods.get(i).getTAccessing()) {
				final int j = tMethods.indexOf(tAccess.getTTarget());
				if (j >= 0) {
					final double distance = distances[i][j]++;
					if (distance > max) {
						max = distance;
					}
				}
			}
		}

		max++;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				final double distance = distances[i][j];
				distances[i][j] = max - distance;
			}
		}

		final ClusteringAlgorithm alg = new DefaultClusteringAlgorithm();
		final Deque<Cluster> stack = new LinkedList<>();
		stack.add(alg.performClustering(distances, names, new CompleteLinkageStrategy()));

		final RefactoringgraphFactory factory = RefactoringgraphFactory.eINSTANCE;
		final List<HCluster> clusters = new ArrayList<>();

		while (!stack.isEmpty()) {
			final Cluster current = stack.pop();
			stack.addAll(current.getChildren());
			if (current.getWeightValue() < 3 * treshold) {
				final List<String> leafNames = new ArrayList<>();

				final Deque<Cluster> collect = new LinkedList<>();
				collect.add(current);
				while (!collect.isEmpty()) {
					final Cluster next = collect.pop();
					final String name = next.getName();
					if (!name.startsWith("clstr")) {
						leafNames.add(name);
					}
					collect.addAll(next.getChildren());
				}

				final HCluster cluster = factory.createHCluster();
				cluster.setValue(leafNames.size());
				for (final String name : leafNames) {
					cluster.getTMembers().add(tMethods.get(Integer.parseInt(name)));
				}
				tClass.getTAnnotation().add(cluster);
				clusters.add(cluster);
			}
		}
	}

	// [user code injected with eMoflon] -->
} // HClusterCalculatorImpl
