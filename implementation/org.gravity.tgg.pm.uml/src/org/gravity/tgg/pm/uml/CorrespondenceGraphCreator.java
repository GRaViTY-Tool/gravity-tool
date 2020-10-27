package org.gravity.tgg.pm.uml;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gravity.modisco.ModiscoPackage;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.annotations.AnnotationsPackage;
import org.moflon.tgg.runtime.AbstractCorrespondence;
import org.moflon.tgg.runtime.CorrespondenceModel;
import org.moflon.tgg.runtime.RuntimeFactory;
import org.moflon.tgg.runtime.RuntimePackage;

public class CorrespondenceGraphCreator {

	private static final Logger LOGGER = Logger.getLogger(CorrespondenceGraphCreator.class);

	private final Map<AbstractCorrespondence, EObject> umlCorr2ModiscoObject = new HashMap<>();
	private final Map<AbstractCorrespondence, EObject> umlCorr2UMLObject = new HashMap<>();
	private final Map<AbstractCorrespondence, EObject> pmCorr2PMObject = new HashMap<>();
	private final Map<EObject, List<AbstractCorrespondence>> modiscoObject2PMCorrs = new HashMap<>();

	private final ResourceSet set;

	public CorrespondenceGraphCreator(CorrespondenceModel umlCorr, CorrespondenceModel pmCorr) {
		ResourceSet umlSet = umlCorr.eResource().getResourceSet();
		ResourceSet pmSet = pmCorr.eResource().getResourceSet();
		if (umlSet != pmSet) {
			throw new IllegalArgumentException("The correspondence models are not in the same resource set!");
		}
		set = umlSet;

		for (EObject entry : pmCorr.getCorrespondences()) {
			if (entry instanceof AbstractCorrespondence) {
				try {
					AbstractCorrespondence correspondence = (AbstractCorrespondence) entry;
					modiscoObject2PMCorrs.computeIfAbsent(getSource(correspondence), l -> new LinkedList<>())
							.add(correspondence);
					pmCorr2PMObject.put(correspondence, getTarget(correspondence));
				} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException
						| InvocationTargetException | NoSuchMethodException e) {
					LOGGER.error(e.getLocalizedMessage(), e);
				}
			} else {
				LOGGER.error("Unknown entry type in UML correspondences: " + entry.getClass().getSimpleName());
			}
		}
		for (EObject entry : umlCorr.getCorrespondences()) {
			if (entry instanceof AbstractCorrespondence) {
				try {
					AbstractCorrespondence correspondence = (AbstractCorrespondence) entry;
					umlCorr2ModiscoObject.put(correspondence, getSource(correspondence));
					umlCorr2UMLObject.put(correspondence, getTarget(correspondence));
				} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException
						| InvocationTargetException | NoSuchMethodException e) {
					LOGGER.error(e);
				}
			} else {
				LOGGER.error("Unknown entry type in PM correspondences: " + entry.getClass().getSimpleName());
			}
		}
	}

	public CorrespondenceModel createCorrespondenceGraph(URI uri) throws InvocationTargetException {
		Resource resource = set.createResource(uri);

		List<AbstractCorrespondence> correspondences = new LinkedList<>();
		for (Entry<AbstractCorrespondence, EObject> entry : umlCorr2ModiscoObject.entrySet()) {
			EObject umlObject = umlCorr2UMLObject.get(entry.getKey());
			List<AbstractCorrespondence> pmCorrs = modiscoObject2PMCorrs.get(entry.getValue());
			if (pmCorrs == null || pmCorrs.isEmpty()) {
				LOGGER.error("No pm correspondence found for: " + umlObject);
			} else {
				for (AbstractCorrespondence pmCorrespondence : pmCorrs) {
					EObject pmObject = pmCorr2PMObject.get(pmCorrespondence);
					correspondences.addAll(createCorrespondences(umlObject, pmObject));
				}
			}
		}
		CorrespondenceModel corr = RuntimeFactory.eINSTANCE.createCorrespondenceModel();
		corr.getCorrespondences().addAll(correspondences);
		resource.getContents().add(corr);
		return corr;
	}

	private Collection<? extends AbstractCorrespondence> createCorrespondences(EObject umlObject, EObject pmObject)
			throws InvocationTargetException {
		EClass abstractCorrespondence = RuntimePackage.eINSTANCE.getAbstractCorrespondence();
		List<AbstractCorrespondence> correspondences = new LinkedList<>();
		for (EClassifier corrType : UmlPackage.eINSTANCE.getEClassifiers()) {
			if (corrType instanceof EClass) {
				EClass eClass = ((EClass) corrType);
				if (abstractCorrespondence.isSuperTypeOf(eClass)
						&& isSuitableCorrespondenceType(eClass, umlObject, pmObject)) {
					AbstractCorrespondence correspondence = (AbstractCorrespondence) UmlFactory.eINSTANCE
							.create(eClass);
					for (EOperation operation : eClass.getEOperations()) {
						String name = operation.getName();
						if ("setSource".equals(name)) {
							correspondence.eInvoke(operation,
									new BasicEList.UnmodifiableEList<>(1, new EObject[] { umlObject }));
						} else if ("setTarget".equals(name)) {
							correspondence.eInvoke(operation,
									new BasicEList.UnmodifiableEList<>(1, new EObject[] { pmObject }));
						}
					}
					correspondences.add(correspondence);
				}
			}
		}
		return correspondences;
	}

	private boolean isSuitableCorrespondenceType(EClass corrEClass, EObject umlObject, EObject pmObject) {
		for (EReference reference : corrEClass.getEReferences()) {
			String name = reference.getName();
			if ("source".equals(name)) {
				if (!reference.getEType().isInstance(umlObject)) {
					return false;
				}
			} else if ("target".equals(name)) {
				if (!reference.getEType().isInstance(pmObject)) {
					return false;
				}
			}
		}
		return true;
	}

	private static EObject getSource(AbstractCorrespondence correspondence)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException,
			InvocationTargetException, NoSuchMethodException {
		return getSourceOrTarget(correspondence, "getSource");
	}

	private static EObject getTarget(AbstractCorrespondence correspondence)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException,
			InvocationTargetException, NoSuchMethodException {
		return getSourceOrTarget(correspondence, "getTarget");
	}

	private static EObject getSourceOrTarget(AbstractCorrespondence correspondence, String side)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException,
			InvocationTargetException, NoSuchMethodException {
		return (EObject) correspondence.getClass().getDeclaredMethod(side).invoke(correspondence);
	}
}
