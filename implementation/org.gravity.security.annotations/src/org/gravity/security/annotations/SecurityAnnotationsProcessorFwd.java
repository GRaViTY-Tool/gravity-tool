package org.gravity.security.annotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gravity.security.annotations.access.AccessPackage;
import org.gravity.security.annotations.access.Api;
import org.gravity.security.annotations.requirements.High;
import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.RequirementsPackage;
import org.gravity.security.annotations.requirements.Secrecy;
import org.gravity.tgg.modisco.processing.pg.IProgramGraphProcessor;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.annotations.TAnnotationType;

/**
 * A forward processor for replacing java annotations created from UMLsec sterotypes with corresponding security annotations
 *
 * @author speldszus
 *
 */
public class SecurityAnnotationsProcessorFwd implements IProgramGraphProcessor {

	private ResourceSet rs;

	/**
	 * Replaces UMLsec java annotations with corresponding security annotations
	 */
	@Override
	public boolean process(TypeGraph pg, IProgressMonitor monitor) {
		this.rs = pg.eResource().getResourceSet();
		for(final TAnnotationType tAnnotationType : pg.getTAnnotationTypes()) {
			final String tFullyQualifiedName = tAnnotationType.getFullyQualifiedName();
			final List<TAnnotation> annotations = new ArrayList<>(tAnnotationType.getAnnotations());
			if(tFullyQualifiedName.equals(Secrecy.class.getName())) {
				replaceAll(annotations, RequirementsPackage.eINSTANCE.getTSecrecy());
			}
			else if(tFullyQualifiedName.equals(Integrity.class.getName())) {
				replaceAll(annotations, RequirementsPackage.eINSTANCE.getTIntegrity());
			}
			else if(tFullyQualifiedName.equals(High.class.getName())) {
				replaceAll(annotations, RequirementsPackage.eINSTANCE.getTHigh());
			}
			else if(tFullyQualifiedName.equals(Api.class.getName())) {
				replaceAll(annotations, AccessPackage.eINSTANCE.getTApi());
			}
			else if(tFullyQualifiedName.equals(Tainted.class.getName())) {
				replaceAll(annotations, AnnotationsPackage.eINSTANCE.getTTainted());
			}
			else if(tFullyQualifiedName.equals(CounterMeasure.class.getName())) {
				replaceAll(annotations, AnnotationsPackage.eINSTANCE.getTCounterMeasure());
			}
		}
		return true;
	}

	/**
	 * Replaces all annotations in the list with instances of the given eClass.
	 *
	 * @param annotations A collection of annotations
	 * @param eClass A EClass taht is a child of TAnnoation
	 */
	private void replaceAll(final Collection<TAnnotation> annotations, EClass eClass) {
		final EFactory factory = eClass.getEPackage().getEFactoryInstance();
		for(final TAnnotation tAnnotation : annotations) {
			if(!eClass.isInstance(tAnnotation)){
				replace(tAnnotation, (TAnnotation) factory.create(eClass));
			}
		}
	}

	/**
	 * Replaces an annotation in a the program model
	 *
	 * @param tAnnotation the current annotation
	 * @param replacement the replacement
	 */
	private void replace(TAnnotation tAnnotation, TAnnotation replacement) {
		EcoreUtil.replace(tAnnotation, replacement);
		for(final Setting setting : EcoreUtil.UsageCrossReferencer.find(tAnnotation, this.rs)) {
			final EObject eObject = setting.getEObject();
			eObject.eSetDeliver(false);
			if (setting instanceof EList) {
				@SuppressWarnings("unchecked")
				final EList<TAnnotation> list = (EList<TAnnotation>) setting;
				final int index = list.indexOf(tAnnotation);
				list.set(index, replacement);
			}
			else {
				eObject.eSet(setting.getEStructuralFeature(), replacement);
			}
			eObject.eSetDeliver(true);
		}
	}

}
