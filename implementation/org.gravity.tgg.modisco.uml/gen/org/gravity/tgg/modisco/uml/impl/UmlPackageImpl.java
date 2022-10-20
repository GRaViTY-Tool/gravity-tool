/**
 */
package org.gravity.tgg.modisco.uml.impl;

import MocaTree.MocaTreePackage;

import SDMLanguage.SDMLanguagePackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.modisco.java.emf.JavaPackage;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

import org.gravity.modisco.ModiscoPackage;

import org.gravity.tgg.modisco.uml.Rules.RulesPackage;

import org.gravity.tgg.modisco.uml.Rules.impl.RulesPackageImpl;

import org.gravity.tgg.modisco.uml.UmlFactory;
import org.gravity.tgg.modisco.uml.UmlPackage;

import org.moflon.tgg.language.LanguagePackage;

import org.moflon.tgg.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlPackageImpl extends EPackageImpl implements UmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "uml.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaModel2UMLPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass astNode2ElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeAccess2PropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterizedType2RedefinableTemplateSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeAccess2GeneralizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeAccess2TemplateBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifier2NamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeAccess2InterfaceRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaPackage2UmlPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeAccess2ParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilationUnit2ArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression2CommentEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.gravity.tgg.modisco.uml.UmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UmlPackageImpl() {
		super(eNS_URI, UmlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link UmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static UmlPackage init() {
		if (isInited)
			return (UmlPackage) EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUmlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UmlPackageImpl theUmlPackage = registeredUmlPackage instanceof UmlPackageImpl
				? (UmlPackageImpl) registeredUmlPackage
				: new UmlPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ModiscoPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		JavaPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();
		RuntimePackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();
		SDMLanguagePackage.eINSTANCE.eClass();
		MocaTreePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI);
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (registeredPackage instanceof RulesPackageImpl
				? registeredPackage
				: RulesPackage.eINSTANCE);

		// Load packages
		theUmlPackage.loadPackage();

		// Fix loaded packages
		theUmlPackage.fixPackageContents();
		theRulesPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theUmlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UmlPackage.eNS_URI, theUmlPackage);
		return theUmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaModel2UMLPackage() {
		if (javaModel2UMLPackageEClass == null) {
			javaModel2UMLPackageEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI)
					.getEClassifiers().get(0);
		}
		return javaModel2UMLPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJavaModel2UMLPackage_Source() {
		return (EReference) getJavaModel2UMLPackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJavaModel2UMLPackage_Target() {
		return (EReference) getJavaModel2UMLPackage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getASTNode2Element() {
		if (astNode2ElementEClass == null) {
			astNode2ElementEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI)
					.getEClassifiers().get(1);
		}
		return astNode2ElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getASTNode2Element_Source() {
		return (EReference) getASTNode2Element().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getASTNode2Element_Target() {
		return (EReference) getASTNode2Element().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeAccess2Property() {
		if (typeAccess2PropertyEClass == null) {
			typeAccess2PropertyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI)
					.getEClassifiers().get(2);
		}
		return typeAccess2PropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeAccess2Property_Source() {
		return (EReference) getTypeAccess2Property().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeAccess2Property_Target() {
		return (EReference) getTypeAccess2Property().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterizedType2RedefinableTemplateSignature() {
		if (parameterizedType2RedefinableTemplateSignatureEClass == null) {
			parameterizedType2RedefinableTemplateSignatureEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(UmlPackage.eNS_URI).getEClassifiers().get(3);
		}
		return parameterizedType2RedefinableTemplateSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterizedType2RedefinableTemplateSignature_Source() {
		return (EReference) getParameterizedType2RedefinableTemplateSignature().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterizedType2RedefinableTemplateSignature_Target() {
		return (EReference) getParameterizedType2RedefinableTemplateSignature().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeAccess2Generalization() {
		if (typeAccess2GeneralizationEClass == null) {
			typeAccess2GeneralizationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI)
					.getEClassifiers().get(4);
		}
		return typeAccess2GeneralizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeAccess2Generalization_Source() {
		return (EReference) getTypeAccess2Generalization().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeAccess2Generalization_Target() {
		return (EReference) getTypeAccess2Generalization().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeAccess2TemplateBinding() {
		if (typeAccess2TemplateBindingEClass == null) {
			typeAccess2TemplateBindingEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI)
					.getEClassifiers().get(5);
		}
		return typeAccess2TemplateBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeAccess2TemplateBinding_Source() {
		return (EReference) getTypeAccess2TemplateBinding().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeAccess2TemplateBinding_Target() {
		return (EReference) getTypeAccess2TemplateBinding().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModifier2NamedElement() {
		if (modifier2NamedElementEClass == null) {
			modifier2NamedElementEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI)
					.getEClassifiers().get(6);
		}
		return modifier2NamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifier2NamedElement_Source() {
		return (EReference) getModifier2NamedElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifier2NamedElement_Target() {
		return (EReference) getModifier2NamedElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeAccess2InterfaceRealization() {
		if (typeAccess2InterfaceRealizationEClass == null) {
			typeAccess2InterfaceRealizationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI)
					.getEClassifiers().get(7);
		}
		return typeAccess2InterfaceRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeAccess2InterfaceRealization_Source() {
		return (EReference) getTypeAccess2InterfaceRealization().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeAccess2InterfaceRealization_Target() {
		return (EReference) getTypeAccess2InterfaceRealization().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaPackage2UmlPackage() {
		if (javaPackage2UmlPackageEClass == null) {
			javaPackage2UmlPackageEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI)
					.getEClassifiers().get(8);
		}
		return javaPackage2UmlPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJavaPackage2UmlPackage_Source() {
		return (EReference) getJavaPackage2UmlPackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJavaPackage2UmlPackage_Target() {
		return (EReference) getJavaPackage2UmlPackage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeAccess2Parameter() {
		if (typeAccess2ParameterEClass == null) {
			typeAccess2ParameterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI)
					.getEClassifiers().get(9);
		}
		return typeAccess2ParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeAccess2Parameter_Source() {
		return (EReference) getTypeAccess2Parameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeAccess2Parameter_Target() {
		return (EReference) getTypeAccess2Parameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompilationUnit2Artifact() {
		if (compilationUnit2ArtifactEClass == null) {
			compilationUnit2ArtifactEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI)
					.getEClassifiers().get(10);
		}
		return compilationUnit2ArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompilationUnit2Artifact_Source() {
		return (EReference) getCompilationUnit2Artifact().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompilationUnit2Artifact_Target() {
		return (EReference) getCompilationUnit2Artifact().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpression2Comment() {
		if (expression2CommentEClass == null) {
			expression2CommentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI)
					.getEClassifiers().get(11);
		}
		return expression2CommentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpression2Comment_Source() {
		return (EReference) getExpression2Comment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpression2Comment_Target() {
		return (EReference) getExpression2Comment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UmlFactory getUmlFactory() {
		return (UmlFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Loads the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded)
			return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		} catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage) resource.getContents().get(0));
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed)
			return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.gravity.tgg.modisco.uml." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //UmlPackageImpl
