package org.gravity.tgg.uml;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.gravity.eclipse.exceptions.ProcessingException;
import org.gravity.eclipse.util.EMFUtil;
import org.gravity.security.annotations.requirements.Critical;
import org.gravity.security.annotations.requirements.High;
import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

import carisma.profile.umlsec.SignatureHelper;
import carisma.profile.umlsec.UmlsecFactory;
import carisma.profile.umlsec.UmlsecPackage;
import carisma.profile.umlsec.critical;

/**
 * This processor converts UMLsec stereotypes into comments to be translatable
 * by the TGG
 *
 * @author speldszus
 *
 */
public class UmlSecProcessor {

	private static final Logger LOGGER = Logger.getLogger(UmlSecProcessor.class);

	private final Model model;

	private Interface iCritical;
	private Interface iHigh;
	private Interface iIntegrity;
	private Interface iSecrecy;

	private static final String ANNOTATION_CRITICAL = Critical.class.getSimpleName();
	private static final String ANNOTATION_HIGH = High.class.getSimpleName();
	private static final String ANNOTATION_INTEGRITY = Integrity.class.getSimpleName();
	private static final String ANNOTATION_SECRECY = Secrecy.class.getSimpleName();

	private static final String TAG_HIGH = UmlsecPackage.eINSTANCE.getcritical_High().getName();
	private static final String TAG_INTEGRITY = UmlsecPackage.eINSTANCE.getcritical_Integrity().getName();
	private static final String TAG_SECRECY = UmlsecPackage.eINSTANCE.getcritical_Secrecy().getName();

	public UmlSecProcessor(final Model model) {
		this.model = model;

		final String[] namespace = new String[] { "org", "gravity", "security", "annotations", "requirements" };
		final LinkedList<Model> stack = new LinkedList<>();
		stack.add(model);
		Package reqPack = null;
		while (!stack.isEmpty()) {
			final Model next = stack.pop();
			reqPack = getPackage(next, namespace);
			if (reqPack != null) {
				break;
			}
			if (next != null) {
				for (final PackageableElement element : next.getPackagedElements()) {
					if (element instanceof Model) {
						stack.add((Model) element);
					}
				}
			}
		}
		if (reqPack != null) {
			this.iCritical = (Interface) reqPack.getPackagedElement(ANNOTATION_CRITICAL);
			this.iHigh = (Interface) reqPack.getPackagedElement(ANNOTATION_HIGH);
			this.iSecrecy = (Interface) reqPack.getPackagedElement(ANNOTATION_SECRECY);
			this.iIntegrity = (Interface) reqPack.getPackagedElement(ANNOTATION_INTEGRITY);
		} else {
			throw new IllegalStateException("Couldn't find package containing UMLsec annotation types!");
		}
	}

	public boolean processFwd() throws ProcessingException {
		for (final Element e : this.model.allOwnedElements()) {
			if (e instanceof Comment) {
				final Comment comment = (Comment) e;
				final String body = comment.getBody();

				final EList<Element> annotatedElements = comment.getAnnotatedElements();
				if (annotatedElements.isEmpty()) {
					continue;
				}
				final Element element = annotatedElements.parallelStream()
						.filter(el -> el.getOwnedComments().contains(comment)).findAny()
						.orElse(annotatedElements.get(0));
				if (ANNOTATION_CRITICAL.equals(body)) {
					final critical critical = getCriticalStereotype((Classifier) element);
					if (!addValuesToCritical(comment, critical)) {
						LOGGER.error("Couldnt add comment to <<critical>>");
						return false;
					}
				} else {
					final String tag = annotationNameToTagName(body);
					if (tag == null) {
						continue;
					}

					final critical critical = getCriticalStereotype(element);
					final String signature = getSignature(element);
					if (!addValuesToCritical(critical, tag, signature)) {
						LOGGER.error("Couldn't add " + tag + " = {\"" + signature + "\"} to <<criticial>>");
						return false;
					}
				}
			}
		}
		return true;
	}

	/**
	 * Translates UMLsec stereotypes into comments
	 *
	 * @return true iff the processing was successful
	 * @throws ProcessingException
	 */
	public boolean processBwd() throws ProcessingException {
		Stream<EObject> delete = Stream.empty();

		for (final Element element : this.model.allOwnedElements()) {
			if ((element instanceof Classifier) && !(element instanceof PrimitiveType)) {
				final Classifier classifier = (Classifier) element;
				delete = Stream.concat(delete, processBwd(classifier));
			}
		}
		EMFUtil.deleteAll(delete.collect(Collectors.toSet()), this.model.eResource());
		return true;
	}

	/**
	 * Process the classifier backwards
	 *
	 * @param classifier The classifier to process
	 * @return
	 * @throws ProcessingException If the processing failed
	 */
	private Stream<Comment> processBwd(final Classifier classifier) throws ProcessingException {
		final HashMap<String, Element> signatures = new HashMap<>();
		final HashMap<String, Comment> highComments = new HashMap<>();
		final HashMap<String, Comment> secrecyComments = new HashMap<>();
		final HashMap<String, Comment> integrityComments = new HashMap<>();

		final Comment criticalComment = getComments(classifier, signatures, highComments, secrecyComments,
				integrityComments);

		for (final EObject stereotype : classifier.getStereotypeApplications()) {
			if (stereotype instanceof critical) {
				final critical critical = (critical) stereotype;

				processBwd(classifier, signatures, highComments, criticalComment, critical.getHigh(), ANNOTATION_HIGH,
						TAG_HIGH);

				processBwd(classifier, signatures, secrecyComments, criticalComment, critical.getSecrecy(),
						ANNOTATION_SECRECY, TAG_SECRECY);

				processBwd(classifier, signatures, integrityComments, criticalComment, critical.getIntegrity(),
						ANNOTATION_INTEGRITY, TAG_INTEGRITY);

				// don't continue as a classifier can only have one critical stereotype
				break;
			}
		}

		// All comments which haven't been removed from this tables have been deleted on
		// the tags of the critical stereotype.

		return Stream.concat(
				Stream.concat(highComments.values().parallelStream(), secrecyComments.values().parallelStream()),
				integrityComments.values().parallelStream());
	}

	private void processBwd(final Classifier classifier, final HashMap<String, Element> signatures,
			final HashMap<String, Comment> tagComments, Comment criticalComment, final List<String> tagValues,
			final String memberAnnotationString, final String tagString) throws ProcessingException {
		if (criticalComment == null) {
			criticalComment = getComment(classifier, ANNOTATION_CRITICAL, true);
			criticalComment.getAnnotatedElements().add(this.iCritical);
		}
		final Comment tagComment = getComment(criticalComment, tagString, true);
		for (final String value : tagValues) {
			if (tagComments.remove(value) == null) {
				// if the signature hasn't already a annotation
				if (signatures.containsKey(value)) {
					// if the classifier defines a member with the signature add a comment to
					// the member
					final Element member = signatures.get(value);
					createComment(memberAnnotationString, member);
				} else {
					// if the classifier doesn't defines a member with the signature add the
					// signature to the according tag of the critical comment.
					final Comment comment = UMLFactory.eINSTANCE.createComment();
					comment.setBody(value);
					comment.getAnnotatedElements().add(tagComment);
					tagComment.getOwnedComments().add(comment);
				}
			}
		}
	}

	/**
	 * Maps the name of a annotation to the name of the according tag
	 *
	 * @param name The name of the annotation
	 * @return the name of the according tag or null it the annotation name is
	 *         unknown
	 */
	private String annotationNameToTagName(final String name) {
		String tag;
		if (ANNOTATION_HIGH.equals(name)) {
			tag = TAG_HIGH;
		} else if (ANNOTATION_INTEGRITY.equals(name)) {
			tag = TAG_INTEGRITY;
		} else if (ANNOTATION_SECRECY.equals(name)) {
			tag = TAG_SECRECY;
		} else {
			tag = null;
		}
		return tag;
	}

	/**
	 * Create a security comment on the member
	 *
	 * @param value  The value of the comment
	 * @param member The member to be annotated
	 * @throws ProcessingException If the comment contains an unknown security level
	 */
	private void createComment(final String value, final Element member) throws ProcessingException {
		final Comment comment = UMLFactory.eINSTANCE.createComment();
		comment.setBody(value);
		comment.getAnnotatedElements().add(member);
		if (High.class.getSimpleName().equals(value)) {
			comment.getAnnotatedElements().add(this.iHigh);
		} else if (Integrity.class.getSimpleName().equals(value)) {
			comment.getAnnotatedElements().add(this.iIntegrity);
		} else if (Secrecy.class.getSimpleName().equals(value)) {
			comment.getAnnotatedElements().add(this.iSecrecy);
		} else {
			throw new ProcessingException("Unknown UMLsec security level: \"" + value + "\"");
		}
		member.getOwnedComments().add(comment);
	}

	/**
	 * Search for the package with the given namespace in the model
	 *
	 * @param model     The UML model
	 * @param namespace The namespace array
	 * @return The package or null
	 */
	private static Package getPackage(final Model model, final String... namespace) {
		Package current = model;
		for (final String element : namespace) {
			final PackageableElement next = current.getPackagedElement(element);
			if ((next == null) || !next.eClass().equals(UMLPackage.eINSTANCE.getPackage())) {
				return null;
			}
			current = (Package) next;
		}
		return current;
	}

	/**
	 * Adds the values of a critical annotation to the critical stereotype
	 *
	 * @param comment The critical comment
	 * @param crit    The critical the values should be added to
	 */
	private boolean addValuesToCritical(final Comment comment, final critical crit) {
		if (!ANNOTATION_CRITICAL.equals(comment.getBody())) {
			return false;
		}
		for (final Comment tag : comment.getOwnedComments()) {
			final String tagName = tag.getBody();
			final String[] signatures = tag.getOwnedComments().parallelStream().map(Comment::getBody)
					.toArray(String[]::new);
			addValuesToCritical(crit, tagName, signatures);
		}
		return true;
	}

	/**
	 * Adds the signatures to the critical stereotype
	 *
	 * @param crit       The critical the values should be added to
	 * @param tag        The tag of the security property
	 * @param signatures The signatures
	 */
	private boolean addValuesToCritical(final critical crit, final String tag, final String... signatures) {
		final EStructuralFeature feature = crit.eClass().getEStructuralFeature(tag);
		if (feature == null) {
			LOGGER.error("Unknown <<critical>> tag: " + tag);
			return false;
		}
		if (feature.getUpperBound() == 1) {
			LOGGER.error("The <<critical>> tag \"" + tag + "\" is not a collection!");
			return false;
		}
		@SuppressWarnings("unchecked")
		final Collection<Object> values = (Collection<Object>) crit.eGet(feature);
		Collections.addAll(values, signatures);
		return true;
	}

	private static Comment getComments(final Classifier classifier, final HashMap<String, Element> signatures,
			final HashMap<String, Comment> highComments, final HashMap<String, Comment> secrecyComments,
			final HashMap<String, Comment> integrityComments) {

		for (final Operation operation : classifier.getOperations()) {
			getComments(signatures, highComments, secrecyComments, integrityComments, operation);
		}

		for (final Property property : classifier.getAttributes()) {
			getComments(signatures, highComments, secrecyComments, integrityComments, property);
		}

		final Comment criticalComment = getComment(classifier, ANNOTATION_CRITICAL, false);
		if (criticalComment == null) {
			return null;
		}

		for (final Comment tag : criticalComment.getOwnedComments()) {
			HashMap<String, Comment> addto;
			if (TAG_HIGH.equals(tag.getBody())) {
				addto = highComments;
			} else if (TAG_INTEGRITY.equals(tag.getBody())) {
				addto = integrityComments;
			} else if (TAG_SECRECY.equals(tag.getBody())) {
				addto = secrecyComments;
			} else {
				continue;
			}
			for (final Comment value : tag.getOwnedComments()) {
				addto.put(value.getBody(), value);
			}
		}
		return criticalComment;
	}

	private static void getComments(final HashMap<String, Element> signatures,
			final HashMap<String, Comment> highComments, final HashMap<String, Comment> secrecyComments,
			final HashMap<String, Comment> integrityComments, final Element operation) {
		final String signature = getSignature(operation);
		signatures.put(signature, operation);
		for (final Comment comment : operation.getOwnedComments()) {
			final String body = comment.getBody();
			if (High.class.getSimpleName().equals(body)) {
				highComments.put(signature, comment);
			} else if (Integrity.class.getSimpleName().equals(body)) {
				integrityComments.put(signature, comment);
			} else if (Secrecy.class.getSimpleName().equals(body)) {
				secrecyComments.put(signature, comment);
			}
		}
	}

	private static Comment getComment(final Element element, final String body, final boolean create) {
		Comment newComment = null;
		for (final Comment comment : element.getOwnedComments()) {
			if (body.equals(comment.getBody())) {
				newComment = comment;
				break;
			}
		}
		if ((newComment == null) && create) {
			newComment = UMLFactory.eINSTANCE.createComment();
			newComment.setBody(body);
			newComment.getAnnotatedElements().add(element);
			element.getOwnedComments().add(newComment);
		}
		return newComment;
	}

	/**
	 * Get the critical stereotype of the classifier the element is belonging to or
	 * create one if there is none
	 *
	 * @param element The element
	 * @return The stereotype
	 * @throws If there is an unsupported element
	 */
	private static critical getCriticalStereotype(final Element element) throws ProcessingException {
		Classifier classifier;
		if (element instanceof Classifier) {
			classifier = (Classifier) element;
		} else if ((element instanceof Operation) || (element instanceof Property)) {
			classifier = (Classifier) element.getOwner();
		} else {
			throw new ProcessingException(element);
		}
		return getCriticalStereotype(classifier);
	}

	/**
	 * Get the critical stereotype of the classifier or create one if there is none
	 *
	 * @param classifier The classifier
	 * @return The stereotype
	 */
	private static critical getCriticalStereotype(final Classifier classifier) {
		for (final EObject eObject : classifier.getStereotypeApplications()) {
			if (eObject instanceof critical) {
				return (critical) eObject;
			}
		}
		final critical critical = UmlsecFactory.eINSTANCE.createcritical();
		critical.setBase_Classifier(classifier);
		classifier.eResource().getContents().add(critical);
		return critical;
	}

	private static String getSignature(final Element element) {
		if (element instanceof Operation) {
			return SignatureHelper.getSignature((Operation) element);
		} else if (element instanceof Property) {
			return SignatureHelper.getSignature((Property) element);
		} else {
			throw new UnsupportedOperationException();
		}
	}
}
