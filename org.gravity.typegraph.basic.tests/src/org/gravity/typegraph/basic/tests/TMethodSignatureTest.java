/**
 */
package org.gravity.typegraph.basic.tests;

import junit.textui.TestRunner;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TMethodSignature;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TMethod Signature</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TMethodSignatureTest extends TSignatureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TMethodSignatureTest.class);
	}

	/**
	 * Constructs a new TMethod Signature test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodSignatureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this TMethod Signature test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TMethodSignature getFixture() {
		return (TMethodSignature) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BasicFactory.eINSTANCE.createTMethodSignature());
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

} //TMethodSignatureTest
