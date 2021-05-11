/**
 */
package org.gravity.hulk.resolve.calculators.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
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
import org.gravity.hulk.refactoringgraph.RefactoringgraphPackage;
import org.gravity.hulk.resolve.calculators.CalculatorsPackage;
import org.gravity.hulk.resolve.calculators.HClusterCalculator;
import org.gravity.hulk.resolve.impl.HResolverImpl;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
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

		final var defines = tClass.getDefines();
		final List<TMethodDefinition> tMethods = new ArrayList<>();
		var size = 0;
		for (final TMember tMember : defines) {
			if ((tMember instanceof TMethodDefinition) && tMethods.add((TMethodDefinition) tMember)) {
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
			final var factory = RefactoringgraphFactory.eINSTANCE;
			final List<HCluster> clusters = new ArrayList<>();

			for (final TMethodDefinition tMethod : tMethods) {
				final var cluster = factory.createHCluster();
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
				final var tClass = annotation.getTAnnotated();
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
		final var dataclasses = new HashMap<TMethodDefinition, List<TClass>>();
		for (final TMethodDefinition tMethod : tMethods) {
			for (final TAnnotation tAnnotation : tMethod.getTAnnotation()) {
				if (tAnnotation instanceof HMethodToDataClassAccess) {
					final var dca = (HMethodToDataClassAccess) tAnnotation;
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
		final var iterator = input.entrySet().iterator();
		if (iterator.hasNext()) {
			final var entry = iterator.next();
			final var key = entry.getKey();
			final var values = input.remove(key);

			for (final TClass value : values) {
				output.put(key, value);
				fill(input, output, tClass);
				output.remove(key);
			}
		} else {
			final var factory = RefactoringgraphFactory.eINSTANCE;
			final var clusters = new HashMap<TClass, HCluster>();
			for (final Entry<TMethodDefinition, TClass> entry : output.entrySet()) {
				final var key = entry.getKey();
				final var value = entry.getValue();
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
				final var tData = entry.getKey();
				LOGGER.info("Next Cluster (" + tData + "):");
				final var hCluster = entry.getValue();
				for (final TMember m : hCluster.getTMembers()) {
					LOGGER.info(m.getSignatureString() + "->" + tData.getFullyQualifiedName());
				}
			}
			LOGGER.info('\n');
		}
	}

	private void clusterAlgo(final TClass tClass, final List<TMethodDefinition> tMethods, final int size) {
		final Double treshold = Math.sqrt(size);

		final var names = new String[size];
		final var distances = new double[size][size];
		for (var i = 0; i < size; i++) {
			names[i] = Integer.toString(i);
			for (var j = 0; j < size; j++) {
				distances[i][j] = 0;
			}
		}

		var max = 0D;
		for (var i = 0; i < size; i++) {
			for (final TAccess tAccess : tMethods.get(i).getAccessing()) {
				final var j = tMethods.indexOf(tAccess.getTarget());
				if (j >= 0) {
					final var distance = distances[i][j]++;
					if (distance > max) {
						max = distance;
					}
				}
			}
		}

		max++;
		for (var i = 0; i < size; i++) {
			for (var j = 0; j < size; j++) {
				final var distance = distances[i][j];
				distances[i][j] = max - distance;
			}
		}

		final ClusteringAlgorithm alg = new DefaultClusteringAlgorithm();
		final Deque<Cluster> stack = new LinkedList<>();
		stack.add(alg.performClustering(distances, names, new CompleteLinkageStrategy()));

		final var factory = RefactoringgraphFactory.eINSTANCE;
		final List<HCluster> clusters = new ArrayList<>();

		while (!stack.isEmpty()) {
			final var current = stack.pop();
			stack.addAll(current.getChildren());
			if (current.getWeightValue() < (3 * treshold)) {
				final List<String> leafNames = new ArrayList<>();

				final Deque<Cluster> collect = new LinkedList<>();
				collect.add(current);
				while (!collect.isEmpty()) {
					final var next = collect.pop();
					final var name = next.getName();
					if (!name.startsWith("clstr")) {
						leafNames.add(name);
					}
					collect.addAll(next.getChildren());
				}

				final var cluster = factory.createHCluster();
				cluster.setValue(leafNames.size());
				for (final String name : leafNames) {
					cluster.getTMembers().add(tMethods.get(Integer.parseInt(name)));
				}
				tClass.getTAnnotation().add(cluster);
				clusters.add(cluster);
			}
		}
	}

	@Override
	public EClass getHAnnotationType() {
		return RefactoringgraphPackage.eINSTANCE.getHCluster();
	}

	// [user code injected with eMoflon] -->
} // HClusterCalculatorImpl