package org.sidiff.difference.symmetric.execute;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.sidiff.difference.symmetric.AddObject;
import org.sidiff.difference.symmetric.AddReference;
import org.sidiff.difference.symmetric.AttributeValueChange;
import org.sidiff.difference.symmetric.Change;
import org.sidiff.difference.symmetric.RemoveObject;
import org.sidiff.difference.symmetric.RemoveReference;
import org.sidiff.difference.symmetric.SymmetricDifference;
import org.sidiff.difference.symmetric.execute.util.EcoreMergeUtil;
import org.sidiff.difference.symmetric.execute.util.SiLiftUtil;
import org.sidiff.difference.symmetric.execute.util.SiLiftUtil.DifferenceCalculationException;
import org.sidiff.difference.technical.api.settings.DifferenceSettings;
import org.sidiff.difference.technical.api.util.TechnicalDifferenceUtils;
import org.sidiff.matcher.IMatcher;
import org.sidiff.matcher.adapter.emfcompare.EMFCompareMatcherAdapter;

/**
 * Applies the difference between model A and B on model A. Thus, model A and
 * model B are equal. (The order of references are not considered yet.)
 * 
 * @author Manuel Ohrndorf
 */
public class DifferenceExecutor implements Runnable {

	/**
	 * The difference that contains the changes.
	 */
	private SymmetricDifference difference;

	/**
	 * model B -> created model A
	 */
	private Map<EObject, EObject> addedObjects = new HashMap<>();

	/**
	 * Initializes the {@link DifferenceExecutor}.
	 * 
	 * @param modelA
	 *            TechnicalDifferenceFacade
	 * @param modelB
	 *            The modified model.
	 * @param settings
	 *            Specifies the settings of the difference algorithm.
	 * 
	 * @param difference
	 *            The difference to execute.
	 *            
	 * @throws DifferenceCalculationException 
	 */
	public DifferenceExecutor(Resource modelA, Resource modelB, DifferenceSettings settings) throws DifferenceCalculationException {
		this.difference = SiLiftUtil.calculateDifference(modelA, modelB, settings);
	}

	/**
	 * Initializes the {@link DifferenceExecutor}.
	 * 
	 * @param modelA
	 *            TechnicalDifferenceFacade
	 * @param modelB
	 *            The modified model.
	 * @param matcher
	 *            The matching algorithm which compares the given models.
	 * 
	 * @param difference
	 *            The difference to execute.
	 *            
	 * @throws DifferenceCalculationException 
	 */
	public DifferenceExecutor(Resource modelA, Resource modelB, IMatcher matcher) throws DifferenceCalculationException {
		this.difference = SiLiftUtil.calculateDifference(modelA, modelB, matcher);
	}

	/**
	 * Initializes the {@link DifferenceExecutor}. The difference will be
	 * created by generic EMFCompare matching engine.
	 * 
	 * @param modelA
	 *            TechnicalDifferenceFacade
	 * @param modelB
	 *            The modified model.
	 * 
	 * @param difference
	 *            The difference to execute.
	 *            
	 * @throws DifferenceCalculationException 
	 */
	public DifferenceExecutor(Resource modelA, Resource modelB) throws DifferenceCalculationException {
		this(modelA, modelB, TechnicalDifferenceUtils.getMatcherByKey(EMFCompareMatcherAdapter.class.getName()));
	}

	/**
	 * Initializes the {@link DifferenceExecutor}.
	 * 
	 * @param difference
	 *            The difference to execute.
	 */
	public DifferenceExecutor(SymmetricDifference difference) {
		this.difference = difference;
	}

	@Override
	public void run() {
		
		// NOTE: To support "moves" we need to execute RemoveReferences before AddReferences!
		// NOTE: AddObjects before AddReferences!
		// NOTE: RemoveReferences before RemoveObjects!
		
		executeRemoveReferences();
		executeRemoveObjects();
		executeAddObjects();
		executeAddReferences();
		executeAttributeValueChange();
	}

	/**
	 * Saves model A.
	 */
	public void save() {
		try {
			difference.getModelA().save(Collections.emptyMap());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param feature
	 *            A meta-model feature.
	 * @return <code>true</code> if the feature should be processed;
	 *         <code>false</code> otherwise.
	 */
	protected boolean isConsideredFeature(EClass type, EStructuralFeature feature) {
		return feature.isChangeable() 
				&& !feature.isDerived() 
				&& !feature.isTransient()
				&& type.getEAllStructuralFeatures().contains(feature);
	}

	/**
	 * Creates all AddObjects in model A.
	 */
	private void executeAddObjects() {

		for (Change change : difference.getChanges()) {
			if (change instanceof AddObject) {
				EObject objB = ((AddObject) change).getObj();
				EObject objA = EcoreMergeUtil.copyWithoutReferences(objB);
				addedObjects.put(objB, objA);
			}
		}
	}

	/**
	 * Creates all AddReferences in model A.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void executeAddReferences() {

		for (Change change : difference.getChanges()) {
			if (change instanceof AddReference) {
				EReference typeB = (EReference) ((AddReference) change).getType();
				EObject srcB = ((AddReference) change).getSrc();
				EObject tgtB = ((AddReference) change).getTgt();

				if (isConsideredFeature(srcB.eClass(), typeB)) {
					EObject srcA = getCorrespondingObjectInA(srcB);
					EObject tgtA = getCorrespondingObjectInA(tgtB);

					// TODO: Support reference ordering!
					// ((List) srcB.eGet(typeB)).indexOf(tgtB);
					
					// FIXedME[WORKAROUND]: Wrong containment references on e.g. EDataType/EGenericType!?
					//
					// => disabled merge imports
					//
					// e.g.: /org.sidiff.difference.ecore.testmodels/examples/extractClass
					// getCorrespondingObjectInA(tgtB) => null
					// getCorrespondingObjectInA((EObject) srcB.eGet(typeB)) => tgtA
					//
//					if (!typeB.isMany() && (tgtA == null)) {
//						tgtA = getCorrespondingObjectInA((EObject) srcB.eGet(typeB));
//					}
					
					if (typeB.isMany()) {
						List referencesA = (List) srcA.eGet(typeB);
						referencesA.add(tgtA);
					} else {
						srcA.eSet(typeB, tgtA);
					}
				}
			}
		}
		
//		for (Entry<EObject, EObject> addedObject : addedObjects.entrySet())  {
//			EObject objA = addedObject.getValue();
//			EObject objB = addedObject.getKey();
//			
//			EStructuralFeature containment = objB.eContainmentFeature();
//			EStructuralFeature containing = objB.eContainingFeature();
//			
//			EObject containerA = getCorrespondingObjectInA((EObject) objB.eContainer());
//			
//			if (isConsideredFeature(objA.eClass(), containing))	{
//				objA.eSet(containing, containerA);
//			}
//			
//			if (isConsideredFeature(containerA.eClass(), containment)) {
//				if (containment.isMany()) {
//					((List) containerA.eGet(containment)).add(objA);
//				} else {
//					containerA.eSet(containment, objA);
//				}
//			}
//		}
	}

	/**
	 * Removes all RemoveObjects from model A.
	 */
	private void executeRemoveObjects() {

		// Remove Object from resource
		for (Change change : difference.getChanges()) {
			if (change instanceof RemoveObject) {
				EObject objA = ((RemoveObject) change).getObj();
				EcoreUtil.remove(objA);
			}
		}
	}

	/**
	 * Removes all RemoveReferences in model A.
	 */
	@SuppressWarnings({ "rawtypes" })
	private void executeRemoveReferences() {

		// Remove references (including matched containments)
		for (Change change : difference.getChanges()) {
			if (change instanceof RemoveReference) {
				EReference typeA = (EReference) ((RemoveReference) change).getType();
				EObject srcA = ((RemoveReference) change).getSrc();
				EObject tgtA = ((RemoveReference) change).getTgt();

				if (isConsideredFeature(srcA.eClass(), typeA)) {
					if (typeA.isMany()) {
						List referencesA = (List) srcA.eGet(typeA);
						referencesA.remove(tgtA);
					} else {
						srcA.eSet(typeA, null);
					}
				}
			}
		}
	}

	/**
	 * Copy's all attribute value change attributes from model B to model A.
	 */
	private void executeAttributeValueChange() {

		for (Change change : difference.getChanges()) {
			if (change instanceof AttributeValueChange) {
				EObject objA = ((AttributeValueChange) change).getObjA();
				EObject objB = ((AttributeValueChange) change).getObjB();

				EAttribute type = ((AttributeValueChange) change).getType();

				EcoreMergeUtil.copyAttribute(type, objB, objA);
			}
		}
	}

	/**
	 * @return The difference between model A and model B.
	 */
	public SymmetricDifference getDifference() {
		return difference;
	}

	/**
	 * @param objB
	 *            An Object of model B.
	 * @return The corresponding object in Model A.
	 */
	public EObject getCorrespondingObjectInA(EObject objB) {

		// New object in A?
		EObject objA = addedObjects.get(objB);

		if (objA != null) {
			return objA;
		}

		// Corresponds in the difference?
		objA = difference.getCorrespondingObjectInA(objB);

		if (objA != null) {
			return objA;
		}

		// Imported resource, e.g. library model?
		if ((objB.eResource() != null) && (objB.eResource() != difference.getModelB())) {
			return objB;
		}

		return null;
	}

	/**
	 * @param objA
	 *            An Object of model A.
	 * @return The corresponding object in Model B.
	 */
	public EObject getCorrespondingObjectInB(EObject objA) {

		// Corresponds in the difference?
		EObject objB = difference.getCorrespondingObjectInB(objA);

		if (objB != null) {
			return objB;
		}

		// Imported resource, e.g. library model?
		if (objA.eResource() != difference.getModelA()) {
			return objA;
		}

		return null;
	}
}
