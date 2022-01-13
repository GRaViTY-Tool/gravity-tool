package org.gravity.pm.umlsec;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.resource.UMLResourceFactoryImpl;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.gravity.tgg.pm.uml.Feature2TMember;
import org.gravity.tgg.pm.uml.Package2TPackage;
import org.gravity.tgg.pm.uml.Type2TAbstractType;
import org.gravity.tgg.pm.uml.UmlFactory;
import org.gravity.tgg.pm.uml.UmlPackage;
import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TParameter;
import org.gravity.typegraph.basic.TypeGraph;
import org.junit.Test;
import org.moflon.tgg.runtime.CorrespondenceModel;
import org.moflon.tgg.runtime.RuntimeFactory;

import carisma.profile.umlsec.UmlsecPackage;
import carisma.profile.umlsec.critical;

public class PatternTest {
	private static final UmlFactory CORR_FACTORY = UmlFactory.eINSTANCE;
	private static final UMLFactory UML_FACTORY = UMLFactory.eINSTANCE;
	private static final BasicFactory PM_FACTORY = BasicFactory.eINSTANCE;
	private static HenshinResourceSet set;

	private TypeGraph pm;
	private Model uml;
	private CorrespondenceModel corr;
	private Profile umlsec;

	/**
	 * Generates a compliant model and tests if no violation is detected
	 * @throws IOException
	 */
	@Test
	public void testCompliantModel() throws IOException {
		generateCompliantModel();
		final var matches = new SecurityViolationPattern(this.corr).detect();
		assertTrue(matches.isEmpty());
	}

	/**
	 * Generates a violating model and tests if the violation is detected
	 * @throws IOException
	 */
	@Test
	public void testViolatingModel() throws IOException {
		generateViolatingModel();
		final var matches =  new SecurityViolationPattern(this.corr).detect();
		assertFalse(matches.isEmpty());
	}

	private void generateViolatingModel() throws IOException {
		final var id = "violating";
		createBaseModel(id);

		final var critical = this.umlsec.getOwnedStereotype("critical");

		final var root = this.uml.getNestedPackage(id);
		final var supplier = (Class) root.getOwnedType("Supplier");
		final var client = (Class) root.getOwnedType("Client");

		final var signature = SignatureHelper.getSignature(supplier.getOwnedOperations().get(0));
		final var name = supplier.getOwnedOperations().get(0).getName();

		((critical) supplier.applyStereotype(critical)).getSecrecy().add(name);
		//		((critical) client.applyStereotype(critical)).getSecrecy().add(signature);

		save();
	}
	private void generateCompliantModel() throws IOException {
		final var id = "compliant";
		createBaseModel(id);

		final var critical = this.umlsec.getOwnedStereotype("critical");

		final var root = this.uml.getNestedPackage(id);
		final var supplier = (Class) root.getOwnedType("Supplier");
		final var client = (Class) root.getOwnedType("Client");

		final var signature = SignatureHelper.getSignature(supplier.getOwnedOperations().get(0));
		final var name = supplier.getOwnedOperations().get(0).getName();

		((critical) supplier.applyStereotype(critical)).getSecrecy().add(name);
		((critical) client.applyStereotype(critical)).getSecrecy().add(name);

		save();
	}

	private void createBaseModel(final String id) {
		initResourceSet("");

		final var profileRes = set.getResource(URI.createFileURI(
				"profile/UMLsec.profile.uml"),
				true);
		EcoreUtil.resolveAll(profileRes);
		this.umlsec = (Profile) EcoreUtil.getObjectByType(profileRes.getContents(), UMLPackage.Literals.PROFILE);

		this.pm = createProgramModel(set, id);
		this.uml = createUMLModel(set, id);
		this.corr = createCorr(set, this.pm, this.uml, id);

		final var packageCorr = createPackage(this.corr, this.uml, this.pm, id);

		final var supplierCorr = createClass(this.corr, packageCorr.getSource(), packageCorr.getTarget(), "Supplier");

		final var supplierOperationCorr = createOperation(this.corr, (Class) supplierCorr.getSource(),
				supplierCorr.getTarget(), "method", null, null, Collections.emptyList(), Collections.emptyList());

		final var clientCorr = createClass(this.corr, packageCorr.getSource(), packageCorr.getTarget(), "Client");

		final var clientOperationCorr = createOperation(this.corr, (Class) clientCorr.getSource(),
				clientCorr.getTarget(), "caller", null, null, Collections.emptyList(), Collections.emptyList());

		createDependency(this.corr, clientCorr.getSource(), clientOperationCorr.getTarget(), supplierCorr.getSource(),
				supplierOperationCorr.getTarget());

		this.uml.applyProfile(this.umlsec);

	}

	private static ResourceSet initResourceSet(final String folder) {
		set = new HenshinResourceSet(folder);
		set.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		set.getPackageRegistry().put(BasicPackage.eNS_URI, BasicPackage.eINSTANCE);
		set.getPackageRegistry().put(UmlPackage.eNS_URI, UmlPackage.eINSTANCE);
		set.getPackageRegistry().put(UmlsecPackage.eNS_URI, UmlsecPackage.eINSTANCE);

		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("uml", new UMLResourceFactoryImpl());
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());

		final var umlProfile = "metamodels/UML.metamodel.uml";
		final var url = Profile.class.getClassLoader().getResource(umlProfile);
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

	private void save() throws IOException {
		this.pm.eResource().save(Collections.emptyMap());
		this.uml.eResource().save(Collections.emptyMap());
		this.corr.eResource().save(Collections.emptyMap());
	}

	private static void createDependency(final CorrespondenceModel corr, final Type client, final TMember caller,
			final Type supplier, final TMember callee) {
		TAccess access;
		if (callee instanceof TMethodDefinition) {
			access = PM_FACTORY.createTCall();
		} else {
			access = PM_FACTORY.createTReadWrite();
		}
		access.setTarget(callee);
		access.setSource(caller);

		client.createDependency(supplier);
	}

	private static Feature2TMember createOperation(final CorrespondenceModel corr, final Class umlOwner,
			final TAbstractType pmOwner, final String methodName, final Type umlReturnType,
			final TAbstractType pmReturnType, final List<Type> umlParameterTypes,
			final List<TAbstractType> pmParameterTypes) {
		final var pm = pmOwner.getModel();
		var pmMethod = pm.getMethod(methodName);
		if (pmMethod == null) {
			pmMethod = PM_FACTORY.createTMethod();
			pmMethod.setTName(methodName);
			pm.getMethods().add(pmMethod);
		}
		TMethodSignature pmSignature = null;
		for (final TMethodSignature sig : pmMethod.getSignatures()) {
			if (isEqual(sig, pmReturnType, pmParameterTypes)) {
				pmSignature = sig;
				break;
			}
		}
		if (pmSignature == null) {
			pmSignature = PM_FACTORY.createTMethodSignature();
			pmSignature.setReturnType(pmReturnType);
			TParameter prev = null;
			for (final TAbstractType type : pmParameterTypes) {
				final var param = PM_FACTORY.createTParameter();
				param.setType(type);
				pmSignature.getParameters().add(param);
				if (prev == null) {
					pmSignature.setFirstParameter(param);
				} else {
					prev.setNext(param);
					param.setPrevious(prev);
				}
				prev = param;
			}
			pmMethod.getSignatures().add(pmSignature);
		}
		final var pmDefinition = PM_FACTORY.createTMethodDefinition();
		pmSignature.getDefinitions().add(pmDefinition);
		pmOwner.getDefines().add(pmDefinition);
		pmOwner.getSignature().add(pmSignature);

		final EList<String> generatedParameterNames = new BasicEList<>(umlParameterTypes.size());
		for (var i = 0; i < umlParameterTypes.size(); i++) {
			generatedParameterNames.add("param" + i);
		}
		final var operation = umlOwner.createOwnedOperation(methodName, generatedParameterNames,
				new BasicEList<>(umlParameterTypes), umlReturnType);

		final var op2n = CORR_FACTORY.createOperation2TMethodName();
		op2n.setSource(operation);
		op2n.setTarget(pmMethod);
		corr.getCorrespondences().add(op2n);

		final var op2s = CORR_FACTORY.createOperation2TMethodSignature();
		op2s.setSource(operation);
		op2s.setTarget(pmSignature);
		corr.getCorrespondences().add(op2s);

		final var op2m = CORR_FACTORY.createOperation2TMethodDefinition();
		op2m.setSource(operation);
		op2m.setTarget(pmDefinition);
		corr.getCorrespondences().add(op2m);

		final var correspondence = CORR_FACTORY.createFeature2TMember();
		correspondence.setSource(operation);
		correspondence.setTarget(pmDefinition);
		corr.getCorrespondences().add(correspondence);

		return correspondence;
	}

	private static boolean isEqual(final TMethodSignature signature, final TAbstractType returnType,
			final List<TAbstractType> parameterTypes) {
		if ((signature.getReturnType() == returnType) && (signature.getParameters().size() == parameterTypes.size())) {
			var next = signature.getFirstParameter();
			for (final TAbstractType type : parameterTypes) {
				if (!type.equals(next.getType())) {
					return false;
				}
				next = next.getNext();
			}
			return true;
		}
		return false;
	}

	private static Type2TAbstractType createClass(final CorrespondenceModel corr, final Package uml, final TPackage pm,
			final String classname) {
		final var pmClass = PM_FACTORY.createTClass();
		pmClass.setTName(classname);
		pm.getClasses().add(pmClass);
		pm.getOwnedTypes().add(pmClass);
		pm.getModel().getClasses().add(pmClass);
		pm.getModel().getOwnedTypes().add(pmClass);

		final var umlClass = uml.createOwnedClass(classname, false);

		final var correspondence = CORR_FACTORY.createType2TAbstractType();
		correspondence.setSource(umlClass);
		correspondence.setTarget(pmClass);

		corr.getCorrespondences().add(correspondence);
		return correspondence;
	}

	private static Package2TPackage createPackage(final CorrespondenceModel corr, final Model uml, final TypeGraph pm,
			final String packagename) {
		final var pmPackage = PM_FACTORY.createTPackage();
		pmPackage.setTName(packagename);
		pmPackage.setModel(pm);
		pm.getPackages().add(pmPackage);

		final var umlPackage = uml.createNestedPackage(packagename);

		final var correspondence = CORR_FACTORY.createPackage2TPackage();
		correspondence.setSource(umlPackage);
		correspondence.setTarget(pmPackage);

		corr.getCorrespondences().add(correspondence);
		return correspondence;
	}

	private static TypeGraph createProgramModel(final ResourceSet set, final String id) {
		final var pmResource = set.createResource(URI.createURI("instances/" + id + "/pm.xmi"));
		final var pm = PM_FACTORY.createTypeGraph();
		pm.setTName(id);
		pmResource.getContents().add(pm);
		return pm;
	}

	private static Model createUMLModel(final ResourceSet set, final String id) {
		final var umlResource = set.createResource(URI.createURI("instances/" + id + "/model.uml"));
		final var uml = UML_FACTORY.createModel();
		uml.setName(id);
		umlResource.getContents().add(uml);
		return uml;
	}

	private static CorrespondenceModel createCorr(final ResourceSet set, final TypeGraph pm, final Model uml,
			final String id) {
		final var corrResource = set.createResource(URI.createURI("instances/" + id + "/corr.xmi"));
		final var corr = RuntimeFactory.eINSTANCE.createCorrespondenceModel();
		corr.setSource(uml);
		corr.setTarget(pm);
		corrResource.getContents().add(corr);

		final var m2pm = CORR_FACTORY.createModel2TypeGraph();
		m2pm.setSource(uml);
		m2pm.setTarget(pm);
		corr.getCorrespondences().add(m2pm);
		return corr;
	}
}
