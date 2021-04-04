package org.gravity.tgg.pm.uml;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
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

	public CorrespondenceGraphCreator(final CorrespondenceModel umlCorr, final CorrespondenceModel pmCorr) {
		final ResourceSet umlSet = umlCorr.eResource().getResourceSet();
		final ResourceSet pmSet = pmCorr.eResource().getResourceSet();
		if (umlSet != pmSet) {
			throw new IllegalArgumentException("The correspondence models are not in the same resource set!");
		}
		this.set = umlSet;

		for (final EObject entry : pmCorr.getCorrespondences()) {
			if (entry instanceof AbstractCorrespondence) {
				try {
					final AbstractCorrespondence correspondence = (AbstractCorrespondence) entry;
					this.modiscoObject2PMCorrs.computeIfAbsent(getSource(correspondence), l -> new LinkedList<>())
					.add(correspondence);
					this.pmCorr2PMObject.put(correspondence, getTarget(correspondence));
				} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException
						| InvocationTargetException | NoSuchMethodException e) {
					LOGGER.error(e.getLocalizedMessage(), e);
				}
			} else {
				LOGGER.error("Unknown entry type in UML correspondences: " + entry.getClass().getSimpleName());
			}
		}
		for (final EObject entry : umlCorr.getCorrespondences()) {
			if (entry instanceof AbstractCorrespondence) {
				try {
					final AbstractCorrespondence correspondence = (AbstractCorrespondence) entry;
					this.umlCorr2ModiscoObject.put(correspondence, getSource(correspondence));
					this.umlCorr2UMLObject.put(correspondence, getTarget(correspondence));
				} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException
						| InvocationTargetException | NoSuchMethodException e) {
					LOGGER.error(e);
				}
			} else {
				LOGGER.error("Unknown entry type in PM correspondences: " + entry.getClass().getSimpleName());
			}
		}
	}

	public CorrespondenceModel createCorrespondenceGraph(final URI uri) throws InvocationTargetException {
		final Resource resource = this.set.createResource(uri);

		final List<AbstractCorrespondence> correspondences = new LinkedList<>();
		for (final Entry<AbstractCorrespondence, EObject> entry : this.umlCorr2ModiscoObject.entrySet()) {
			final EObject umlObject = this.umlCorr2UMLObject.get(entry.getKey());
			final List<AbstractCorrespondence> pmCorrs = this.modiscoObject2PMCorrs.get(entry.getValue());
			if ((pmCorrs == null) || pmCorrs.isEmpty()) {
				LOGGER.error("No pm correspondence found for: " + umlObject);
			} else {
				for (final AbstractCorrespondence pmCorrespondence : pmCorrs) {
					final EObject pmObject = this.pmCorr2PMObject.get(pmCorrespondence);
					correspondences.addAll(createCorrespondences(umlObject, pmObject));
				}
			}
		}
		final CorrespondenceModel corr = RuntimeFactory.eINSTANCE.createCorrespondenceModel();
		corr.getCorrespondences().addAll(correspondences);
		resource.getContents().add(corr);
		return corr;
	}

	private Collection<? extends AbstractCorrespondence> createCorrespondences(final EObject umlObject, final EObject pmObject)
			throws InvocationTargetException {
		final EClass abstractCorrespondence = RuntimePackage.eINSTANCE.getAbstractCorrespondence();
		final List<AbstractCorrespondence> correspondences = new LinkedList<>();
		for (final EClassifier corrType : UmlPackage.eINSTANCE.getEClassifiers()) {
			if (corrType instanceof EClass) {
				final EClass eClass = ((EClass) corrType);
				if (abstractCorrespondence.isSuperTypeOf(eClass)
						&& isSuitableCorrespondenceType(eClass, umlObject, pmObject)) {
					final AbstractCorrespondence correspondence = (AbstractCorrespondence) UmlFactory.eINSTANCE
							.create(eClass);
					correspondence.eSet(eClass.getEStructuralFeature("source"), umlObject);
					correspondence.eSet(eClass.getEStructuralFeature("target"), pmObject);
					correspondences.add(correspondence);
				}
			}
		}
		return correspondences;
	}

	private boolean isSuitableCorrespondenceType(final EClass corrEClass, final EObject umlObject, final EObject pmObject) {
		for (final EReference reference : corrEClass.getEReferences()) {
			final String name = reference.getName();
			if ("source".equals(name)) {
				if (!reference.getEType().isInstance(umlObject)) {
					return false;
				}
			} else if ("target".equals(name) && !reference.getEType().isInstance(pmObject)) {
				return false;
			}
		}
		return true;
	}

	private static EObject getSource(final AbstractCorrespondence correspondence)
			throws IllegalAccessException, NoSuchFieldException,
			InvocationTargetException, NoSuchMethodException {
		return getSourceOrTarget(correspondence, "getSource");
	}

	private static EObject getTarget(final AbstractCorrespondence correspondence)
			throws IllegalAccessException, NoSuchFieldException,
			InvocationTargetException, NoSuchMethodException {
		return getSourceOrTarget(correspondence, "getTarget");
	}

	private static EObject getSourceOrTarget(final AbstractCorrespondence correspondence, final String side)
			throws IllegalAccessException, NoSuchFieldException,
			InvocationTargetException, NoSuchMethodException {
		return (EObject) correspondence.getClass().getDeclaredMethod(side).invoke(correspondence);
	}
}
