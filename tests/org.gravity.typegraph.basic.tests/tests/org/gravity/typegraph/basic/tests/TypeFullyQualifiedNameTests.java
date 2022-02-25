/**
 *
 */
package org.gravity.typegraph.basic.tests;

import static org.junit.Assert.assertEquals;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TVisibility;
import org.junit.Test;

/**
 * @author speldszus
 *
 */
public class TypeFullyQualifiedNameTests {

	/**
	 * Test method for
	 * {@link org.gravity.typegraph.basic.impl.TAbstractTypeImpl#getFullyQualifiedName()}.
	 */
	@Test
	public void testGetFullyQualifiedName() {
		final var namespace = "a.b.c";
		final var name = "Clazz1";

		final var pm = BasicFactory.eINSTANCE.createTypeGraph();

		final var c = pm.createTClass(namespace, name, false, TVisibility.TPUBLIC);

		assertEquals(namespace + '.' + name, c.getFullyQualifiedName());
	}

	/**
	 * Test method for
	 * {@link org.gravity.typegraph.basic.impl.TAbstractTypeImpl#getFullyQualifiedName()}.
	 */
	@Test
	public void testGetFullyQualifiedNameNoPackage() {
		final var name = "Clazz2";

		final var pm = BasicFactory.eINSTANCE.createTypeGraph();
		final var c = BasicFactory.eINSTANCE.createTClass();
		c.setTName(name);
		pm.getClasses().add(c);
		pm.getOwnedTypes().add(c);

		assertEquals(name, c.getFullyQualifiedName());
	}

	/**
	 * Test method for
	 * {@link org.gravity.typegraph.basic.impl.TAbstractTypeImpl#getFullyQualifiedName()}.
	 */
	@Test
	public void testGetFullyQualifiedNameDefaultPackage() {
		final var namespace = "(default package)";
		final var name = "Clazz3";

		final var pm = BasicFactory.eINSTANCE.createTypeGraph();

		final var c = pm.createTClass(namespace, name, false, TVisibility.TPUBLIC);

		assertEquals(name, c.getFullyQualifiedName());
	}

}
