package org.gravity.security.annotations;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gravity.security.annotations.access.AccessFactory;
import org.gravity.security.annotations.access.Api;
import org.gravity.security.annotations.access.TApi;
import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.RequirementsFactory;
import org.gravity.security.annotations.requirements.Secrecy;
import org.gravity.security.annotations.requirements.TIntegrity;
import org.gravity.security.annotations.requirements.TSecrecy;
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
		rs = pg.eResource().getResourceSet();
		for(TAnnotationType tAnnotationType : pg.getTAnnotationTypes()) {
			String tFullyQualifiedName = tAnnotationType.getFullyQualifiedName();
			List<TAnnotation> annotations = new ArrayList<>(tAnnotationType.getAnnotations());
			if(tFullyQualifiedName.equals(Secrecy.class.getName())) {
				for(TAnnotation tAnnotation : annotations) {
					if(!(tAnnotation instanceof TSecrecy)){
						replace(tAnnotation, RequirementsFactory.eINSTANCE.createTSecrecy());
					}
				}
			}
			else if(tFullyQualifiedName.equals(Integrity.class.getName())) {
				for(TAnnotation tAnnotation : annotations) {
					if(!(tAnnotation instanceof TIntegrity)){
						replace(tAnnotation, RequirementsFactory.eINSTANCE.createTIntegrity());
					}
				}
			}
			else if(tFullyQualifiedName.equals(Api.class.getName())) {
				for(TAnnotation tAnnotation : annotations) {
					if(!(tAnnotation instanceof TApi)){
						replace(tAnnotation, AccessFactory.eINSTANCE.createTApi());
					}
				}
			}
		}
		return true;
	}

	/**
	 * Replaces an annotation in a the program model
	 * 
	 * @param tAnnotation the current annotation
	 * @param replacement the replacement
	 */
	private void replace(TAnnotation tAnnotation, TAnnotation replacement) {
		EcoreUtil.replace(tAnnotation, replacement);
		for(Setting setting : EcoreUtil.UsageCrossReferencer.find(tAnnotation, rs)) {
			EObject eObject = setting.getEObject();
			eObject.eSetDeliver(false);
			if (setting instanceof EList) {
				@SuppressWarnings("unchecked") EList<TAnnotation> list = (EList<TAnnotation>) setting;
				int index = list.indexOf(tAnnotation);
				list.set(index, replacement);
			}
			else {
				eObject.eSet(setting.getEStructuralFeature(), replacement);
			}
			eObject.eSetDeliver(true);
		}
	}

}
