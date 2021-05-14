package org.gravity.pm.umlsec;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.resource.UMLResourceFactoryImpl;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.gravity.security.annotations.requirements.RequirementsPackage;
import org.gravity.tgg.pm.uml.UmlPackage;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.annotations.AnnotationsPackage;

import carisma.check.staticcheck.securedependency.SecureDependencyChecks;
import carisma.core.analysis.DummyHost;
import carisma.profile.umlsec.SignatureHelper;
import carisma.profile.umlsec.UmlsecPackage;
import carisma.profile.umlsec.critical;

public class FixSecureDependency {

	public static void main(final String[] args) throws IOException {
		final ResourceSet set = initResourceSet("instances/itrust");
		final var resource = set.getResource(URI.createURI("uml/iTrust.uml"), true);
		final var result = resource.getContents().parallelStream().filter(Model.class::isInstance).findAny();
		if(result.isEmpty()) {
			throw new IllegalStateException("Couldn't load UML model");
		}
		final var uml = (Model)  result.get();
		final var umlsec = applyUMLsec(set,uml);
		final var securedependency = umlsec.getOwnedStereotype("secure dependency");
		if (uml.getStereotypeApplication(securedependency) == null) {
			uml.applyStereotype(securedependency);
		}

		final var call = umlsec.getOwnedStereotype("call");
		final var critical = umlsec.getOwnedStereotype("critical");
		uml.eAllContents().forEachRemaining(e -> {
			if (e instanceof Dependency) {
				final var dependency = (Dependency) e;
				if (dependency.getSuppliers().stream().anyMatch(s -> s.getAppliedStereotypes().contains(critical))) {
					dependency.applyStereotype(call);
				}
			}
		});

		System.out.println("####################################");
		System.out.println("####################################");
		System.out.println("###### START FIXING VIOLATIONS #####");
		System.out.println("####################################");
		System.out.println("####################################");

		var limit = 10;
		SecureDependencyChecks check = null;
		while (((check = new SecureDependencyChecks(new DummyHost(false))).checkSecureDependency(uml) != 0)
				&& (limit-- > 0)) {
			System.out.println("\nThere are " + check.getViolations().size() + " violations\n");

			check.getViolations().forEach(violation -> {
				System.out.println(violation.getDescription());
				final var violating = violation.getViolatingElement();
				if (violating instanceof Classifier) {
					final var violatingClassifier = (Classifier) violating;
					final var otherClassifier = violatingClassifier == violation.getClient() ? violation.getSupplier() : violation.getClient();
					var stereotype = (critical) violatingClassifier.getStereotypeApplication(critical);
					if (stereotype == null) {
						stereotype = (critical) violatingClassifier.applyStereotype(critical);
					}
					final var feature = stereotype.eClass().getEStructuralFeature(violation.getSecurityLevel());
					final var signatures = (Collection<String>) stereotype.eGet(feature);

					for(String signature : violation.getReleventSignatures()) {
						for(final Operation op : otherClassifier.getOperations()){
							if(SignatureHelper.getSignature(op).equals(signature)) {
								signature = SignatureHelper.getQualifiedSignature(op);
								break;
							}
						}
						signatures.add(signature);
					}
				} else if (violating instanceof Dependency) {
					final var stereotype = umlsec.getOwnedStereotype(violation.getSecurityLevel());
					violating.applyStereotype(stereotype);
				}
			});
			System.out.println("\n####################################");
			System.out.println("######### FIXED VIOLATIONS #########");
			System.out.println("####################################");
		}
		if (check.getViolations().isEmpty()) {
			System.out.println("SUCCESS!!!!!!!!!!!");
			resource.save(Collections.emptyMap());
		} else {
			System.out.println("There are still " + check.getViolations().size() + " violations :-(");
		}

	}

	public static HenshinResourceSet initResourceSet(final String folder) {
		final var set = new HenshinResourceSet(folder);
		set.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		set.getPackageRegistry().put(BasicPackage.eNS_URI, BasicPackage.eINSTANCE);
		set.getPackageRegistry().put(AnnotationsPackage.eNS_URI, AnnotationsPackage.eINSTANCE);
		set.getPackageRegistry().put(RequirementsPackage.eNS_URI, RequirementsPackage.eINSTANCE);
		set.getPackageRegistry().put(UmlPackage.eNS_URI, UmlPackage.eINSTANCE);
		set.getPackageRegistry().put(UmlsecPackage.eNS_URI, UmlsecPackage.eINSTANCE);

		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("uml", new UMLResourceFactoryImpl());
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());

		final var umlProfile = "metamodels/UML.metamodel.uml";
		final var url = Thread.currentThread().getContextClassLoader().getResource(umlProfile);
		var baseUrl = url.toString();
		baseUrl = baseUrl.substring(0, baseUrl.length() - umlProfile.length());
		final var baseUri = URI.createURI(baseUrl);
		URIConverter.URI_MAP.put(URI.createURI(UMLResource.LIBRARIES_PATHMAP),
				baseUri.appendSegment("libraries").appendSegment(""));
		URIConverter.URI_MAP.put(URI.createURI(UMLResource.METAMODELS_PATHMAP),
				baseUri.appendSegment("metamodels").appendSegment(""));
		URIConverter.URI_MAP.put(URI.createURI(UMLResource.PROFILES_PATHMAP),
				baseUri.appendSegment("profiles").appendSegment(""));
		return set;
	}

	public static Profile applyUMLsec(final ResourceSet set, final Model uml) {
		final var absolutePath = new File("profile/UMLsec.profile.uml").getAbsolutePath();
		final var profileRes = set.getResource(URI.createFileURI(absolutePath), true);
		EcoreUtil.resolveAll(profileRes);
		final var umlsec = (Profile) EcoreUtil.getObjectByType(profileRes.getContents(), UMLPackage.Literals.PROFILE);
		if (!uml.getAllAppliedProfiles().contains(umlsec)) {
			uml.applyProfile(umlsec);
		}
		return umlsec;
	}
}
