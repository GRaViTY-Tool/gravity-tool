/**
 */
package org.gravity.typegraph.basic.tests;

import junit.textui.TestRunner;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TClassEntity;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TClass Entity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TClassEntityTest extends TDeclaredEntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TClassEntityTest.class);
	}

	/**
	 * Constructs a new TClass Entity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TClassEntityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this TClass Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TClassEntity getFixture() {
		return (TClassEntity) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BasicFactory.eINSTANCE.createTClassEntity());
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

} //TClassEntityTest
