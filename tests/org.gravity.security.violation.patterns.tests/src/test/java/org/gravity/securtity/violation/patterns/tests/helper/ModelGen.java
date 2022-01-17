package org.gravity.securtity.violation.patterns.tests.helper;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.gravity.security.violation.patterns.SignatureHelper;
import org.gravity.tgg.pm.uml.FDependency2TAccess;
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
import org.moflon.tgg.runtime.CorrespondenceModel;
import org.moflon.tgg.runtime.RuntimeFactory;

import carisma.profile.umlsec.UMLsecActivator;
import carisma.profile.umlsec.UmlsecPackage;
import carisma.profile.umlsec.critical;

public class ModelGen {

	private static final String CLIENT_NAME = "Client";
	private static final String SUPPLIER_NAME = "Supplier";
	private static final String CRITICAL = "critical";

	private static final UmlFactory CORR_FACTORY = UmlFactory.eINSTANCE;
	private static final UMLFactory UML_FACTORY = UMLFactory.eINSTANCE;
	private static final BasicFactory PM_FACTORY = BasicFactory.eINSTANCE;

	private static HenshinResourceSet set;

	private final String output;

	public ModelGen(final String output) {
		this.output = output;
	}

	private TypeGraph pm;
	private Model uml;
	private CorrespondenceModel corr;
	private Profile umlsec;

	public CorrespondenceModel generateViolatingModel(final String id) throws IOException {
		createBaseModel(id);

		final var critical = this.umlsec.getOwnedStereotype(CRITICAL);

		final var root = this.uml.getNestedPackage(id);
		final var supplier = (Class) root.getOwnedType(SUPPLIER_NAME);

		final var signature = SignatureHelper.getSignature(supplier.getOwnedOperations().get(0));
		final var name = supplier.getOwnedOperations().get(0).getName();

		((critical) supplier.applyStereotype(critical)).getSecrecy().add(name);

		save();
		return this.corr;
	}

	public CorrespondenceModel generateCompliantModel(final String id) throws IOException {
		createBaseModel(id);

		final var critical = this.umlsec.getOwnedStereotype(CRITICAL);

		final var root = this.uml.getNestedPackage(id);
		final var supplier = (Class) root.getOwnedType(SUPPLIER_NAME);
		final var client = (Class) root.getOwnedType(CLIENT_NAME);

		final var signature = SignatureHelper.getSignature(supplier.getOwnedOperations().get(0));
		final var name = supplier.getOwnedOperations().get(0).getName();

		((critical) supplier.applyStereotype(critical)).getSecrecy().add(name);
		((critical) client.applyStereotype(critical)).getSecrecy().add(name);

		save();
		return this.corr;
	}

	private void createBaseModel(final String id) throws IOException {
		initResourceSet();

		this.umlsec = UMLsecActivator.loadUMLsecProfile(set);

		this.pm = createProgramModel(set, id);
		this.uml = createUMLModel(set, id);
		this.corr = createCorr(set, this.pm, this.uml, id);

		final var packageCorr = createPackage(this.corr, this.uml, this.pm, id);

		final var supplierCorr = createClass(this.corr, packageCorr.getSource(), packageCorr.getTarget(), SUPPLIER_NAME);

		final var supplierOperationCorr = createOperation(this.corr, supplierCorr, "method", null, Collections.emptyList());

		final var clientCorr = createClass(this.corr, packageCorr.getSource(), packageCorr.getTarget(), CLIENT_NAME);

		final var clientOperationCorr = createOperation(this.corr, clientCorr, "caller", null, Collections.emptyList());

		createDependency(this.corr, clientCorr.getSource(), clientOperationCorr.getTarget(), supplierCorr.getSource(),
				supplierOperationCorr.getTarget());

		this.uml.applyProfile(this.umlsec);

	}

	private static ResourceSet initResourceSet() {
		set = new HenshinResourceSet();
		set.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		set.getPackageRegistry().put(BasicPackage.eNS_URI, BasicPackage.eINSTANCE);
		set.getPackageRegistry().put(UmlPackage.eNS_URI, UmlPackage.eINSTANCE);
		set.getPackageRegistry().put(UmlsecPackage.eNS_URI, UmlsecPackage.eINSTANCE);

		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("uml", UMLResource.Factory.INSTANCE);
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());

		return set;
	}

	private void save() throws IOException {
		this.pm.eResource().save(Collections.emptyMap());
		this.uml.eResource().save(Collections.emptyMap());
		this.corr.eResource().save(Collections.emptyMap());
	}

	private static FDependency2TAccess createDependency(final CorrespondenceModel corr, final Type client, final TMember caller,
			final Type supplier, final TMember callee) {
		TAccess access;
		if (callee instanceof TMethodDefinition) {
			access = PM_FACTORY.createTCall();
		} else {
			access = PM_FACTORY.createTReadWrite();
		}
		access.setTarget(callee);
		access.setSource(caller);

		final var dependency = client.createDependency(supplier);

		final var correspondence = CORR_FACTORY.createFDependency2TAccess();
		correspondence.setSource(dependency);
		correspondence.setTarget(access);
		corr.getCorrespondences().add(correspondence);
		return correspondence;
	}

	/**
	 * Creates a new operation in the UML model and program model
	 *
	 * @param corr The correspondence model between the UML model and program model
	 * @param owner The owner of the new operation
	 * @param methodName The name of the new operation
	 * @param returnType The return type of the new operation
	 * @param parameterTypes The parameter types
	 * @return The correspondence of the new operation
	 */
	private static Feature2TMember createOperation(final CorrespondenceModel corr, final Type2TAbstractType owner, final String methodName, final Type2TAbstractType returnType, final List<Type2TAbstractType> parameterTypes) {

		final var umlOwner = (Class) owner.getSource();
		final var pmOwner = owner.getTarget();

		final var pm = pmOwner.getModel();
		var pmMethod = pm.getMethod(methodName);
		if (pmMethod == null) {
			pmMethod = PM_FACTORY.createTMethod();
			pmMethod.setTName(methodName);
			pm.getMethods().add(pmMethod);
		}

		Type umlReturnType = null;
		TAbstractType pmReturnType = null;
		if(returnType != null) {
			umlReturnType = returnType.getSource();
			pmReturnType = returnType.getTarget();
		}

		final List<Type> umlParameterTypes = parameterTypes.stream().map(Type2TAbstractType::getSource).collect(Collectors.toList());
		final List<TAbstractType> pmParameterTypes = parameterTypes.stream().map(Type2TAbstractType::getTarget).collect(Collectors.toList());

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

	private TypeGraph createProgramModel(final ResourceSet set, final String id) {
		final var pmResource = set.createResource(URI.createURI(this.output + id + "/pm.xmi"));
		final var pm = PM_FACTORY.createTypeGraph();
		pm.setTName(id);
		pmResource.getContents().add(pm);
		return pm;
	}

	private Model createUMLModel(final ResourceSet set, final String id) {
		final var umlResource = set.createResource(URI.createURI(this.output + id + "/model.uml"));
		final var uml = UML_FACTORY.createModel();
		uml.setName(id);
		umlResource.getContents().add(uml);
		return uml;
	}

	private CorrespondenceModel createCorr(final ResourceSet set, final TypeGraph pm, final Model uml,
			final String id) {
		final var corrResource = set.createResource(URI.createURI(this.output + id + "/corr.xmi"));
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
