package org.gravity.security.annotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

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
import org.gravity.security.annotations.requirements.Critical;
import org.gravity.security.annotations.requirements.High;
import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.RequirementsPackage;
import org.gravity.security.annotations.requirements.Secrecy;
import org.gravity.security.annotations.requirements.TAnnotationWithCounterMeasure;
import org.gravity.security.annotations.requirements.TCritical;
import org.gravity.tgg.modisco.pm.processing.pg.IProgramGraphProcessor;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.annotations.TAnnotationType;
import org.gravity.typegraph.basic.annotations.TAnnotationValue;
import org.gravity.typegraph.basic.annotations.TTextNode;

/**
 * A forward processor for replacing java annotations created from UMLsec
 * sterotypes with corresponding security annotations
 *
 * @author speldszus
 *
 */
public class SecurityAnnotationsProcessorFwd implements IProgramGraphProcessor {

	private ResourceSet rs;

	/**
	 * Replaces UMLsec java annotations with corresponding security annotations
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean process(final TypeGraph programModel, final IProgressMonitor monitor) {
		this.rs = programModel.eResource().getResourceSet();
		for (final TAnnotationType tAnnotationType : programModel.getTAnnotationTypes()) {
			final String tFullyQualifiedName = tAnnotationType.getFullyQualifiedName();
			final List<TAnnotation> annotations = new ArrayList<>(tAnnotationType.getAnnotations());
			if (tFullyQualifiedName.equals(Secrecy.class.getName())) {
				final Collection<TAnnotation> replacements = replaceAll(annotations,
						RequirementsPackage.eINSTANCE.getTSecrecy());
				addCounterMeasures((Collection<? extends TAnnotationWithCounterMeasure>) replacements);
			} else if (tFullyQualifiedName.equals(Integrity.class.getName())) {
				final Collection<TAnnotation> replacements = replaceAll(annotations,
						RequirementsPackage.eINSTANCE.getTIntegrity());
				addCounterMeasures((Collection<? extends TAnnotationWithCounterMeasure>) replacements);
			} else if (tFullyQualifiedName.equals(High.class.getName())) {
				final Collection<TAnnotation> replacements = replaceAll(annotations,
						RequirementsPackage.eINSTANCE.getTHigh());
				addCounterMeasures((Collection<? extends TAnnotationWithCounterMeasure>) replacements);
			} else if (tFullyQualifiedName.equals(Critical.class.getName())) {
				final Collection<TAnnotation> replacements = replaceAll(annotations,
						RequirementsPackage.eINSTANCE.getTCritical());
				addReferences((Collection<? extends TCritical>) replacements, programModel);
			} else if (tFullyQualifiedName.equals(Api.class.getName())) {
				replaceAll(annotations, AccessPackage.eINSTANCE.getTApi());
			} else if (tFullyQualifiedName.equals(Tainted.class.getName())) {
				replaceAll(annotations, AnnotationsPackage.eINSTANCE.getTTainted());
			} else if (tFullyQualifiedName.equals(CounterMeasure.class.getName())) {
				replaceAll(annotations, AnnotationsPackage.eINSTANCE.getTCounterMeasure());
			}
		}
		return true;
	}

	private void addReferences(final Collection<? extends TCritical> replacements, final TypeGraph model) {
		for (final TCritical critical : replacements) {
			critical.getSecrecy().addAll(
					getSignatures(critical, RequirementsPackage.eINSTANCE.getTCritical_Secrecy().getName(), model));
			critical.getIntegrity().addAll(
					getSignatures(critical, RequirementsPackage.eINSTANCE.getTCritical_Integrity().getName(), model));
			critical.getHigh().addAll(
					getSignatures(critical, RequirementsPackage.eINSTANCE.getTCritical_High().getName(), model));
		}
	}

	/**
	 * Searches the signatures stated under the given key in the critical annotation
	 *
	 * @param critical The critical annotation
	 * @param key      The key of a security property
	 * @param model    The model in which the signatures should be searched
	 * @return The signatures
	 */
	private Set<TSignature> getSignatures(final TCritical critical, final String key, final TypeGraph model) {
		final TAnnotationValue values = critical.getValue(key);
		if (values == null) {
			return Collections.emptySet();
		}
		return values.getTValue().parallelStream().map(signature -> {
			String string = ((TTextNode) signature).getTText();
			string = unescape(string);
			TSignature match = model.getSignature(string);
			return match;
		}).filter(Objects::nonNull).collect(Collectors.toSet());
	}

	private void addCounterMeasures(final Collection<? extends TAnnotationWithCounterMeasure> replacements) {
		for (final TAnnotationWithCounterMeasure annotation : replacements) {
			final TAnnotationValue earlyReturn = annotation.getValue("earlyReturn");
			if (earlyReturn != null) {
				final TTextNode value = (TTextNode) earlyReturn.getTValue().get(0);
				final String text = unescape(value.getTText());
				final TMember definition = ((TMember) annotation.getTAnnotated()).getDefinedBy()
						.getTDefinition(text);
				annotation.setCountermeasure((TMethodDefinition) definition);
			}
		}
	}

	/**
	 * Unescapes the text by removing trailing and leading "
	 *
	 * @param text Sompe text
	 * @return The unescaped text
	 */
	private String unescape(final String text) {
		if(text.startsWith("\"") && text.endsWith("\"")) {
			return text.substring(1, text.length() -1);
		}
		return text;
	}

	/**
	 * Replaces all annotations in the list with instances of the given eClass.
	 *
	 * @param annotations A collection of annotations
	 * @param eClass      A EClass that is a child of TAnnoation
	 * @return The collection of replacements
	 */
	private Collection<TAnnotation> replaceAll(final Collection<TAnnotation> annotations, final EClass eClass) {
		final EFactory factory = eClass.getEPackage().getEFactoryInstance();
		return annotations.stream().map(tAnnotation -> {
			if (!eClass.isInstance(tAnnotation)) {
				return replace(tAnnotation, (TAnnotation) factory.create(eClass));
			}
			return tAnnotation;
		}).collect(Collectors.toList());
	}

	/**
	 * Replaces an annotation in a the program model
	 *
	 * @param tAnnotation the current annotation
	 * @param replacement the replacement
	 * @return Returns the replacement
	 */
	private TAnnotation replace(final TAnnotation tAnnotation, final TAnnotation replacement) {
		final EList<TAnnotationValue> values = tAnnotation.getTValues();
		EcoreUtil.replace(tAnnotation, replacement);
		for (final Setting setting : EcoreUtil.UsageCrossReferencer.find(tAnnotation, this.rs)) {
			final EObject eObject = setting.getEObject();
			eObject.eSetDeliver(false);
			if (setting instanceof EList) {
				@SuppressWarnings("unchecked")
				final EList<TAnnotation> list = (EList<TAnnotation>) setting;
				final int index = list.indexOf(tAnnotation);
				list.set(index, replacement);
			} else {
				eObject.eSet(setting.getEStructuralFeature(), replacement);
			}
			eObject.eSetDeliver(true);
		}
		replacement.getTValues().addAll(values);
		return replacement;
	}

}
