package org.gravity.typegraph.basic.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;
import org.junit.Test;

public class TypeGraphPackageFactoryTests {

	@Test
	public void testSimplePackage() {
		final TypeGraph pm = BasicFactory.eINSTANCE.createTypeGraph();

		final String namespace = "package";
		final TPackage tPackage = pm.createPackage(namespace);
		assertNotNull(tPackage);
		assertEquals(namespace, tPackage.getTName());
	}

	@Test
	public void testSimpleSubPackage() {
		final TypeGraph pm = BasicFactory.eINSTANCE.createTypeGraph();

		final String subpackageName = "subpackage";
		final String parentPackageName = "package";
		final String namespace = parentPackageName+"."+subpackageName;
		final TPackage tPackage = pm.createPackage(namespace);
		assertNotNull(tPackage);
		assertEquals(subpackageName, tPackage.getTName());
		assertNotNull(tPackage.getParent());
		assertEquals(parentPackageName, tPackage.getParent().getTName());
	}
}
