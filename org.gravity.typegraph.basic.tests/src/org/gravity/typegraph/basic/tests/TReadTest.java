/**
 */
package org.gravity.typegraph.basic.tests;

import junit.textui.TestRunner;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TRead;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TRead</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TReadTest extends TAccessTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TReadTest.class);
	}

	/**
	 * Constructs a new TRead test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TReadTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this TRead test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TRead getFixture() {
		return (TRead) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BasicFactory.eINSTANCE.createTRead());
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

} //TReadTest
