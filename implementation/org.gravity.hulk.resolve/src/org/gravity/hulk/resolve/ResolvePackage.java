/**
 */
package org.gravity.hulk.resolve;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.gravity.hulk.HulkPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.resolve.ResolveFactory
 * @model kind="package"
 * @generated
 */
public interface ResolvePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resolve";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/org.gravity.hulk/model/Hulk.ecore#//resolve";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "resolve";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResolvePackage eINSTANCE = org.gravity.hulk.resolve.impl.ResolvePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.hulk.resolve.impl.HResolverImpl <em>HResolver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.resolve.impl.HResolverImpl
	 * @see org.gravity.hulk.resolve.impl.ResolvePackageImpl#getHResolver()
	 * @generated
	 */
	int HRESOLVER = 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HRESOLVER__INCOMING = HulkPackage.HDETECTOR__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HRESOLVER__GRAPH = HulkPackage.HDETECTOR__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HRESOLVER__ORIGIN = HulkPackage.HDETECTOR__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HRESOLVER__OUTGOING = HulkPackage.HDETECTOR__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HRESOLVER__POST_TRAVERSAL = HulkPackage.HDETECTOR__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HRESOLVER__PRE_TRAVERSAL = HulkPackage.HDETECTOR__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HRESOLVER__HANNOTATION = HulkPackage.HDETECTOR__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HRESOLVER__HANTI_PATTERN_HANDLING = HulkPackage.HDETECTOR__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HResolver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HRESOLVER_FEATURE_COUNT = HulkPackage.HDETECTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HRESOLVER___DETECT__HANTIPATTERNGRAPH = HulkPackage.HDETECTOR___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The number of operations of the '<em>HResolver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HRESOLVER_OPERATION_COUNT = HulkPackage.HDETECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.hulk.resolve.impl.HAntiPatternResolverImpl <em>HAnti Pattern Resolver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.resolve.impl.HAntiPatternResolverImpl
	 * @see org.gravity.hulk.resolve.impl.ResolvePackageImpl#getHAntiPatternResolver()
	 * @generated
	 */
	int HANTI_PATTERN_RESOLVER = 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_RESOLVER__INCOMING = HRESOLVER__INCOMING;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_RESOLVER__GRAPH = HRESOLVER__GRAPH;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_RESOLVER__ORIGIN = HRESOLVER__ORIGIN;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_RESOLVER__OUTGOING = HRESOLVER__OUTGOING;

	/**
	 * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_RESOLVER__POST_TRAVERSAL = HRESOLVER__POST_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_RESOLVER__PRE_TRAVERSAL = HRESOLVER__PRE_TRAVERSAL;

	/**
	 * The feature id for the '<em><b>HAnnotation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_RESOLVER__HANNOTATION = HRESOLVER__HANNOTATION;

	/**
	 * The feature id for the '<em><b>HAnti Pattern Handling</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_RESOLVER__HANTI_PATTERN_HANDLING = HRESOLVER__HANTI_PATTERN_HANDLING;

	/**
	 * The number of structural features of the '<em>HAnti Pattern Resolver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_RESOLVER_FEATURE_COUNT = HRESOLVER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Detect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_RESOLVER___DETECT__HANTIPATTERNGRAPH = HRESOLVER___DETECT__HANTIPATTERNGRAPH;

	/**
	 * The number of operations of the '<em>HAnti Pattern Resolver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANTI_PATTERN_RESOLVER_OPERATION_COUNT = HRESOLVER_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.resolve.HAntiPatternResolver <em>HAnti Pattern Resolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HAnti Pattern Resolver</em>'.
	 * @see org.gravity.hulk.resolve.HAntiPatternResolver
	 * @generated
	 */
	EClass getHAntiPatternResolver();

	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.resolve.HResolver <em>HResolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HResolver</em>'.
	 * @see org.gravity.hulk.resolve.HResolver
	 * @generated
	 */
	EClass getHResolver();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResolveFactory getResolveFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.gravity.hulk.resolve.impl.HAntiPatternResolverImpl <em>HAnti Pattern Resolver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.resolve.impl.HAntiPatternResolverImpl
		 * @see org.gravity.hulk.resolve.impl.ResolvePackageImpl#getHAntiPatternResolver()
		 * @generated
		 */
		EClass HANTI_PATTERN_RESOLVER = eINSTANCE.getHAntiPatternResolver();

		/**
		 * The meta object literal for the '{@link org.gravity.hulk.resolve.impl.HResolverImpl <em>HResolver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.resolve.impl.HResolverImpl
		 * @see org.gravity.hulk.resolve.impl.ResolvePackageImpl#getHResolver()
		 * @generated
		 */
		EClass HRESOLVER = eINSTANCE.getHResolver();

	}

} //ResolvePackage