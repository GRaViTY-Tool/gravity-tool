/**
 */
package org.gravity.typegraph.basic.tests;

import junit.textui.TestRunner;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TTextAnnotation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TText Annotation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TTextAnnotationTest extends TAnnotationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TTextAnnotationTest.class);
	}

	/**
	 * Constructs a new TText Annotation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTextAnnotationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this TText Annotation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TTextAnnotation getFixture() {
		return (TTextAnnotation) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BasicFactory.eINSTANCE.createTTextAnnotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TTextAnnotationTest
