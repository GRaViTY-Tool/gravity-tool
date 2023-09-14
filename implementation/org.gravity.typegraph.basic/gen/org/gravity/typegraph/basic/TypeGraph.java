/**
 */
package org.gravity.typegraph.basic;

import org.eclipse.emf.common.util.EList;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.gravity.typegraph.basic.annotations.TAnnotationType;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.typegraph.basic.TypeGraph#getTName <em>TName</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TypeGraph#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TypeGraph#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TypeGraph#getFields <em>Fields</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TypeGraph#getClasses <em>Classes</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TypeGraph#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TypeGraph#getAnnotationTypes <em>Annotation Types</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TypeGraph#getAllTypes <em>All Types</em>}</li>
 *   <li>{@link org.gravity.typegraph.basic.TypeGraph#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @see org.gravity.typegraph.basic.BasicPackage#getTypeGraph()
 * @model
 * @generated
 */
public interface TypeGraph extends TAnnotatable {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTypeGraph_Packages()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TPackage> getPackages();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TMethod}.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TMethod#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTypeGraph_Methods()
	 * @see org.gravity.typegraph.basic.TMethod#getModel
	 * @model opposite="model" containment="true" ordered="false"
	 * @generated
	 */
	EList<TMethod> getMethods();

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TField}.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TField#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTypeGraph_Fields()
	 * @see org.gravity.typegraph.basic.TField#getModel
	 * @model opposite="model" containment="true" ordered="false"
	 * @generated
	 */
	EList<TField> getFields();

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTypeGraph_Classes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<TClass> getClasses();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTypeGraph_Interfaces()
	 * @model ordered="false"
	 * @generated
	 */
	EList<TInterface> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Annotation Types</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.annotations.TAnnotationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Types</em>' reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTypeGraph_AnnotationTypes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<TAnnotationType> getAnnotationTypes();

	/**
	 * Returns the value of the '<em><b>All Types</b></em>' reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TAbstractType}.
	 * It is bidirectional and its opposite is '{@link org.gravity.typegraph.basic.TAbstractType#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Types</em>' reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTypeGraph_AllTypes()
	 * @see org.gravity.typegraph.basic.TAbstractType#getModel
	 * @model opposite="model" derived="true" ordered="false"
	 * @generated
	 */
	EList<TAbstractType> getAllTypes();

	/**
	 * Returns the value of the '<em><b>TName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TName</em>' attribute.
	 * @see #setTName(String)
	 * @see org.gravity.typegraph.basic.BasicPackage#getTypeGraph_TName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTName();

	/**
	 * Sets the value of the '{@link org.gravity.typegraph.basic.TypeGraph#getTName <em>TName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TName</em>' attribute.
	 * @see #getTName()
	 * @generated
	 */
	void setTName(String value);

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.typegraph.basic.TModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see org.gravity.typegraph.basic.BasicPackage#getTypeGraph_Modules()
	 * @model containment="true"
	 * @generated
	 */
	EList<TModule> getModules();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<TClass> getDeclaredTClasses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String toString();
	// <-- [user code injected with eMoflon]

	public TPackage getPackage(String namespace);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model namespaceMany="true"
	 * @generated
	 */
	TPackage getPackage(EList<String> namespace);

	public TPackage getPackage(String[] namespace);

	public TClass getClass(String string);

	public TInterface getInterface(String fullyQualifiedName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TMethod getMethod(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TField getField(String fullyQualifiedName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model signatureOrdered="false"
	 * @generated
	 */
	TSignature getSignature(String signature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model signatureOrdered="false"
	 * @generated
	 */
	TFieldSignature getFieldSignature(String signature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model signatureOrdered="false"
	 * @generated
	 */
	TMethodSignature getMethodSignature(String signature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model signatureOrdered="false"
	 * @generated
	 */
	TMember getDefinition(String signature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model signatureOrdered="false"
	 * @generated
	 */
	TFieldDefinition getFieldDefinition(String signature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model signatureOrdered="false"
	 * @generated
	 */
	TMethodDefinition getMethodDefinition(String signature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TPackage createPackage(String namespace);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TClass createTClass(String namespace, String name, boolean lib, TVisibility visibility);

	public TAbstractType getType(String fullyQualifiedName);

	// [user code injected with eMoflon] -->
} // TypeGraph
