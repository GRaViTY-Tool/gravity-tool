/**
 */
package org.gravity.typegraph.basic.tests;

import junit.textui.TestRunner;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TWrite;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TWrite</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TWriteTest extends TAccessTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TWriteTest.class);
	}

	/**
	 * Constructs a new TWrite test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TWriteTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this TWrite test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TWrite getFixture() {
		return (TWrite) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BasicFactory.eINSTANCE.createTWrite());
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

} //TWriteTest
