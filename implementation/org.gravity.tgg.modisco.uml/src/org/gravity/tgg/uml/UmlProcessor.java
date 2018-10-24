package org.gravity.tgg.uml;

import java.lang.reflect.Field;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
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

public class UmlProcessor {

	private Model model;

	private Interface iCritical, iHigh, iIntegrity, iSecrecy;
	
	public UmlProcessor(Model model) {
		this.model = model;
		
		for (Element element : model.allOwnedElements()) {
			if (element instanceof Package) {
				Package gravityPackage = (Package) element;
				if(gravityPackage.getName().equals("gravity")) {
					PackageableElement securitySubPackage = gravityPackage.getPackagedElement("security");
					if(securitySubPackage != null) {
						PackageableElement annotationsSubPackage = ((Package) securitySubPackage).getPackagedElement("annotations");
						if(annotationsSubPackage != null) {
							PackageableElement requirementsSubPackage = ((Package) annotationsSubPackage).getPackagedElement("requirements");
							if(requirementsSubPackage != null) {
								Package p = (Package) requirementsSubPackage;
								iCritical = (Interface) p.getPackagedElement(Critical.class.getSimpleName());
								iHigh = (Interface) p.getPackagedElement(High.class.getSimpleName());
								iSecrecy = (Interface) p.getPackagedElement(Secrecy.class.getSimpleName());
								iIntegrity = (Interface) p.getPackagedElement(Integrity.class.getSimpleName());
								break;
							}
						}
					}
				}
			}
		}
	}
	
	public boolean processFwd() throws ProcessingException {
		for (Element e : model.allOwnedElements()) {
			if (e instanceof Comment) {
				Comment comment = (Comment) e;
				String body = comment.getBody();

				EList<Element> annotatedElements = comment.getAnnotatedElements();
				Element element = annotatedElements.get(0);
				critical critical = null;
				for (EObject eObject : element.getStereotypeApplications()) {
					if (eObject instanceof critical) {
						critical = (critical) eObject;
					}
				}
				if (Critical.class.getSimpleName().equals(body)) {
					critical = getCriticalStereotype(element);
					for (Comment tag : comment.getOwnedComments()) {
						try {
							Field field = critical.getClass().getDeclaredField(tag.getBody());
							field.setAccessible(true);
							@SuppressWarnings("unchecked")
							EList<String> values = (EList<String>) field.get(critical);
							if(values == null) {
								values = new BasicEList<String>();
								field.set(critical, values);
							}
							for (Comment value : tag.getOwnedComments()) {
								values.add(value.getBody());
							}
						} catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException
								| SecurityException e1) {
							e1.printStackTrace();
						}
					}
				} else {
					String tag;
					if (High.class.getSimpleName().equals(body)) {
						tag = UmlsecPackage.eINSTANCE.getcritical_High().getName();
					} else if (Integrity.class.getSimpleName().equals(body)) {
						tag = UmlsecPackage.eINSTANCE.getcritical_Integrity().getName();
					} else if (Secrecy.class.getSimpleName().equals(body)) {
						tag = UmlsecPackage.eINSTANCE.getcritical_Secrecy().getName();
					} else {
						continue;
					}

					if (critical == null) {
						Classifier classifier;
						if (element instanceof Classifier) {
							classifier = (Classifier) element;				
						}
						else if (element instanceof Operation || element instanceof Property) {
							classifier = (Classifier) element.getOwner();
						}
						else {
							throw new ProcessingException(element);
						}
						critical = getCriticalStereotype(classifier);
					}
					try {
						Field field = critical.getClass().getDeclaredField(tag);
						field.setAccessible(true);
						@SuppressWarnings("unchecked")
						EList<String> values = (EList<String>) field.get(critical);
						if(values == null) {
							values = new BasicEList<String>();
							field.set(critical, values);
						}
						values.add(getSignature(element));
					} catch (NoSuchFieldException | SecurityException | IllegalArgumentException
							| IllegalAccessException e1) {
						e1.printStackTrace();
					}
				}
			}
		}
		return true;
	}

	public boolean processBwd() throws ProcessingException {
		List<EObject> delete = new LinkedList<>();

		for (Element element : model.allOwnedElements()) {
			if (element instanceof Classifier && !(element instanceof PrimitiveType)) {
				Classifier classifier = (Classifier) element;

				Hashtable<String, Element> signatures = new Hashtable<>();
				Hashtable<String, Comment> highComments = new Hashtable<>();
				Hashtable<String, Comment> secrecyComments = new Hashtable<>();
				Hashtable<String, Comment> integrityComments = new Hashtable<>();

				Comment criticalComment = getComments(classifier, signatures, highComments, secrecyComments,
						integrityComments);

				for (EObject stereotype : classifier.getStereotypeApplications()) {
					if (stereotype instanceof critical) {
						critical critical = (critical) stereotype;

						EList<String> highValues = critical.getHigh();
						String highTagString = UmlsecPackage.eINSTANCE.getcritical_High().getName();
						String highMemberAnnotationString = High.class.getSimpleName();
						processBwd(classifier, signatures, highComments, criticalComment, highValues,
								highMemberAnnotationString, highTagString, iHigh);

						EList<String> secrecyValues = critical.getSecrecy();
						String secrecyTagString = UmlsecPackage.eINSTANCE.getcritical_Secrecy().getName();
						String secrecyMemberAnnotationString = Secrecy.class.getSimpleName();
						processBwd(classifier, signatures, secrecyComments, criticalComment, secrecyValues,
								secrecyMemberAnnotationString, secrecyTagString, iSecrecy);

						EList<String> integrityValues = critical.getIntegrity();
						String integrityTagString = UmlsecPackage.eINSTANCE.getcritical_Integrity().getName();
						String integrityMemberAnnotationString = High.class.getSimpleName();
						processBwd(classifier, signatures, integrityComments, criticalComment, integrityValues,
								integrityMemberAnnotationString, integrityTagString, iIntegrity);
						
						// don't continue as a classifier can only have one critical stereotype
						break;
					}
				}

				// All comments which haven't been removed from this tables have been deleted on
				// the tags of the critical stereotype.
				delete.addAll(highComments.values());
				delete.addAll(secrecyComments.values());
				delete.addAll(integrityComments.values());
			}
		}
		EMFUtil.deleteAll(delete, model.eResource());
		return true;
	}

	private void processBwd(Classifier classifier, Hashtable<String, Element> signatures,
			Hashtable<String, Comment> tagComments, Comment criticalComment, List<String> tagValues,
			String memberAnnotationString, String tagString, Interface iface) throws ProcessingException {

		Comment tagComment = null;
		for (String value : tagValues) {
			if (tagComments.remove(value) == null) {
				// if the signature hasn't already a annotation
				if (signatures.containsKey(value)) {
					// if the classifier defines a member with the signature add a comment to
					// the member
					Element member = signatures.get(value);
					Comment comment = UMLFactory.eINSTANCE.createComment();
					comment.setBody(memberAnnotationString);
					comment.getAnnotatedElements().add(member);
					if (High.class.getSimpleName().equals(memberAnnotationString)) {
						comment.getAnnotatedElements().add(iHigh);
					} else if (Integrity.class.getSimpleName().equals(memberAnnotationString)) {
						comment.getAnnotatedElements().add(iIntegrity);
					} else if (Secrecy.class.getSimpleName().equals(memberAnnotationString)) {
						comment.getAnnotatedElements().add(iSecrecy);
					} else {
						throw new ProcessingException("Unknown UMLsec security level: \""+memberAnnotationString+"\"");
					}
					member.getOwnedComments().add(comment);
				} else {
					// if the classifier doesn't defines a member with the signature add the
					// signature to the high tag of the critical comment.
					if (tagComment == null) {
						if (criticalComment == null) {
							criticalComment = getComment(classifier, Critical.class.getSimpleName());
							criticalComment.getAnnotatedElements().add(iCritical);
						}
						tagComment = getComment(criticalComment, tagString);
					}
					Comment comment = UMLFactory.eINSTANCE.createComment();
					comment.setBody(value);
					comment.getAnnotatedElements().add(tagComment);
					tagComment.getOwnedComments().add(comment);
				}
			}
		}
	}

	private static Comment getComments(Classifier classifier, Hashtable<String, Element> signatures,
			Hashtable<String, Comment> highComments, Hashtable<String, Comment> secrecyComments,
			Hashtable<String, Comment> integrityComments) {
		Comment criticalComment = null;
		for (Comment comment : classifier.getOwnedComments()) {
			if (Critical.class.getSimpleName().equals(comment.getBody())) {
				criticalComment = comment;
				for (Comment tag : criticalComment.getOwnedComments()) {
					Hashtable<String, Comment> addto;
					if (UmlsecPackage.eINSTANCE.getcritical_High().getName().equals(tag.getBody())) {
						addto = highComments;
					} else if (UmlsecPackage.eINSTANCE.getcritical_Integrity().getName().equals(tag.getBody())) {
						addto = integrityComments;
					} else if (UmlsecPackage.eINSTANCE.getcritical_Secrecy().getName().equals(tag.getBody())) {
						addto = secrecyComments;
					} else {
						continue;
					}
					for (Comment value : tag.getOwnedComments()) {
						addto.put(value.getBody(), value);
					}
				}
				break;
			}
		}

		for (Operation operation : classifier.getOperations()) {
			String signature = SignatureHelper.getSignature(operation);
			signatures.put(signature, operation);
			for (Comment comment : operation.getOwnedComments()) {
				String body = comment.getBody();
				if (High.class.getSimpleName().equals(body)) {
					highComments.put(signature, comment);
				} else if (Integrity.class.getSimpleName().equals(body)) {
					integrityComments.put(signature, comment);
				} else if (Secrecy.class.getSimpleName().equals(body)) {
					secrecyComments.put(signature, comment);
				} else {
					continue;
				}
			}
		}

		for (Property property : classifier.getAttributes()) {
			String signature = SignatureHelper.getSignature(property);
			signatures.put(signature, property);
			for (Comment comment : property.getOwnedComments()) {
				String body = comment.getBody();
				if (High.class.getSimpleName().equals(body)) {
					highComments.put(signature, comment);
				} else if (Integrity.class.getSimpleName().equals(body)) {
					integrityComments.put(signature, comment);
				} else if (Secrecy.class.getSimpleName().equals(body)) {
					secrecyComments.put(signature, comment);
				} else {
					continue;
				}
			}
		}
		return criticalComment;
	}

	private static Comment getComment(Element element, String body) {
		Comment newComment = null;
		for (Comment comment : element.getOwnedComments()) {
			if (body.equals(comment.getBody())) {
				newComment = comment;
				break;
			}
		}
		if(newComment == null) {
			newComment = UMLFactory.eINSTANCE.createComment();
			newComment.setBody(body);
			newComment.getAnnotatedElements().add(element);
			element.getOwnedComments().add(newComment);
		}
		return newComment;
	}

	private static critical getCriticalStereotype(Element element) {
		for(EObject eObject : element.getStereotypeApplications()) {
			if (eObject instanceof critical) {
				return (critical) eObject;
			}
		}
		critical critical = UmlsecFactory.eINSTANCE.createcritical();
		critical.setBase_Classifier((Classifier) element);
		element.eResource().getContents().add(critical);
		return critical;
	}

	private static String getSignature(Element element) {
		if (element instanceof Operation) {
			return SignatureHelper.getSignature((Operation) element);
		} else if (element instanceof Property) {
			return SignatureHelper.getSignature((Property) element);
		} else {
			throw new UnsupportedOperationException();
		}
	}
}
