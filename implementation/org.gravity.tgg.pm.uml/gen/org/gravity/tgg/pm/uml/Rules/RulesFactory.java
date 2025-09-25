/**
 */
package org.gravity.tgg.pm.uml.Rules;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.tgg.pm.uml.Rules.RulesPackage
 * @generated
 */
public interface RulesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesFactory eINSTANCE = org.gravity.tgg.pm.uml.Rules.impl.RulesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model2 Type Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model2 Type Graph</em>'.
	 * @generated
	 */
	Model2TypeGraph createModel2TypeGraph();

	/**
	 * Returns a new object of class '<em>Model Nested2 Type Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Nested2 Type Graph</em>'.
	 * @generated
	 */
	ModelNested2TypeGraph createModelNested2TypeGraph();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RulesPackage getRulesPackage();

} //RulesFactory
