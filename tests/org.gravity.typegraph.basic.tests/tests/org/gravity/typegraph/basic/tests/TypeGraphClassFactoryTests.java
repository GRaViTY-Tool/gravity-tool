package org.gravity.typegraph.basic.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TVisibility;
import org.junit.Test;

public class TypeGraphClassFactoryTests {

	@Test
	public void testSimpleClass() {
		final var pm = BasicFactory.eINSTANCE.createTypeGraph();

		final var namespaceArray = Arrays.asList("a", "b", "c");
		final var namespace = "a.b.c";
		final var name = "Clazz";

		final var tClass = pm.createTClass(namespace, name, false, TVisibility.TPUBLIC);
		assertNotNull(tClass);
		assertEquals(name, tClass.getTName());
		assertTrue(pm.getClasses().contains(tClass));
		assertTrue(pm.getAllTypes().contains(tClass));

		var container = tClass.getPackage();
		for (var i = namespaceArray.size() - 1; i >= 0; i--) {
			assertNotNull(container);
			assertEquals(namespaceArray.get(i), container.getTName());
			container = container.getParent();
		}
	}

	@Test
	public void testClassWithoutPackage() {
		final var pm = BasicFactory.eINSTANCE.createTypeGraph();

		final var name = "Clazz";

		final var tClass = pm.createTClass(null, name, false, TVisibility.TPUBLIC);
		assertNotNull(tClass);
		assertEquals(name, tClass.getTName());
		assertTrue(pm.getClasses().contains(tClass));
		assertTrue(pm.getAllTypes().contains(tClass));

		final var container = tClass.getPackage();
		assertNotNull(container);
		assertEquals("(default package)", container.getTName());

	}
}
