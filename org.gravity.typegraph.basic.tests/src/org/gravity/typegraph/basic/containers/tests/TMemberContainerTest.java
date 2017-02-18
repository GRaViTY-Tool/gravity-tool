/**
 */
package org.gravity.typegraph.basic.containers.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.gravity.typegraph.basic.containers.ContainersFactory;
import org.gravity.typegraph.basic.containers.TMemberContainer;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TMember Container</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TMemberContainerTest extends TestCase {

	/**
	 * The fixture for this TMember Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMemberContainer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TMemberContainerTest.class);
	}

	/**
	 * Constructs a new TMember Container test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMemberContainerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this TMember Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TMemberContainer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this TMember Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMemberContainer getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ContainersFactory.eINSTANCE.createTMemberContainer());
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

} //TMemberContainerTest
