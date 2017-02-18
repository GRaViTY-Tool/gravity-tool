/**
 */
package org.gravity.typegraph.basic.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>basic</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new BasicTests("basic Tests");
		suite.addTestSuite(TClassTest.class);
		suite.addTestSuite(TFieldDefinitionTest.class);
		suite.addTestSuite(TFieldSignatureTest.class);
		suite.addTestSuite(TMethodDefinitionTest.class);
		suite.addTestSuite(TMethodSignatureTest.class);
		suite.addTestSuite(TInterfaceTest.class);
		suite.addTestSuite(TAnnotationTypeTest.class);
		suite.addTestSuite(TConstructorSignatureTest.class);
		suite.addTestSuite(TConstructorDefinitionTest.class);
		suite.addTestSuite(TClassEntityTest.class);
		suite.addTestSuite(TFieldEntityTest.class);
		suite.addTestSuite(TMethodEntityTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicTests(String name) {
		super(name);
	}

} //BasicTests
