/**
 * 
 */
package org.gravity.tgg.uml;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.DifferenceState;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.compare.EMFCompare.Builder;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.moflon.tgg.algorithm.delta.Delta;
import org.moflon.tgg.runtime.EMoflonEdge;
import org.moflon.tgg.runtime.RuntimeFactory;

/**
 * @author speldszus
 * 
 * This class provided the functionality to calculate a eMoflon delta between two EMF models
 *
 */
public class DeltaHelper {
	
	/**
	 * Calculates an eMoflon delta
	 * 
	 * @param oldModel The model before changes
	 * @param newModel The model after changes
	 * @return the delta
	 */
	public static Delta getDelta(EObject oldModel, EObject newModel) {
		IComparisonScope scope = new DefaultComparisonScope(newModel, oldModel, null);
		Builder builder = EMFCompare.builder();
		EMFCompare build = builder.build();
		Comparison comparison = build.compare(scope);

		Delta delta = new Delta();
		EList<Diff> differences = comparison.getDifferences();
		if (differences.size() > 0) {
			for (Diff diff : differences) {
				DifferenceKind kind = diff.getKind();
				switch (kind) {
				case ADD:
					if (diff instanceof ReferenceChange) {
						addToAdd(delta, (ReferenceChange) diff);
					} else {
						throw new UnsupportedOperationException();
					}
					break;
				case CHANGE:
					if (diff instanceof ReferenceChange) {
						ReferenceChange refChange = (ReferenceChange) diff;
						if (refChange.getState() == DifferenceState.UNRESOLVED) {
							// Ignore
						} else {
							throw new UnsupportedOperationException();
						}
					} else {
						throw new UnsupportedOperationException();
					}
					break;
				case DELETE:
					if (diff instanceof ReferenceChange) {
						addToDelete(delta, (ReferenceChange) diff);
					} else {
						throw new UnsupportedOperationException();
					}
					break;
				case MOVE:
					throw new UnsupportedOperationException();
				default:
					throw new UnsupportedOperationException();
				}
			}
		}
		return delta;
	}

	private static void addToDelete(Delta delta, ReferenceChange refChange) {
		if (refChange.getReference().isContainment()) {
			delta.deleteNode(refChange.getValue());
		}
		delta.deleteEdge(getChangedEMoflonEdge(refChange));
	}

	private static void addToAdd(Delta delta, ReferenceChange refChange) {
		if (refChange.getReference().isContainment()) {
			delta.addNode(refChange.getValue());
		}
		delta.addEdge(getChangedEMoflonEdge(refChange));
	}

	private static EMoflonEdge getChangedEMoflonEdge(ReferenceChange refChange) {
		EObject value = refChange.getValue();
		EReference reference = refChange.getReference();
		EMoflonEdge edge = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		edge.setName(refChange.getReference().getName());
		edge.setTrg(value);
		if (reference.isContainment()) {
			edge.setSrc(value.eContainer());
		} else {
			ResourceSet resourceSet = refChange.getValue().eResource().getResourceSet();
			ECrossReferenceAdapter adapter = ECrossReferenceAdapter.getCrossReferenceAdapter(resourceSet);
			if (adapter == null) {
				adapter = new ECrossReferenceAdapter();
				resourceSet.eAdapters().add(adapter);
			}
			for (Setting setting : adapter.getInverseReferences(value)) {
				if (setting.getEStructuralFeature().equals(reference)) {
					edge.setSrc(setting.getEObject());
				}
			}
		}
		return edge;
	}

}
