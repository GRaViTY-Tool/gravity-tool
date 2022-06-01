package org.gravity.typegraph.basic.tests;

import static org.junit.Assert.assertEquals;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TClass;
import org.junit.Test;

/**
 * Tests the toString method of TClasses
 *
 * @author Sven Peldszus
 *
 */
public class TClassTests {

	@Test
	public void toStringTest() {
		final var tClass = BasicFactory.eINSTANCE.createTClass();
		final var name = "Name";
		tClass.setTName(name);
		assertEquals(getExpectedSignature(tClass, name), tClass.toString());
	}

	@Test
	public void toStringNoNameTest() {
		final var tClass = BasicFactory.eINSTANCE.createTClass();
		assertEquals(getExpectedSignature(tClass, null), tClass.toString());
	}

	private static String getExpectedSignature(final TClass tClass, final String name) {
		final var builder = new StringBuilder("org.gravity.typegraph.basic.impl.TClassImpl@");
		builder.append(Integer.toHexString(tClass.hashCode()));
		builder.append(" (tLib: false, tName: ");
		builder.append(name);
		builder.append(", name: ");
		if (name != null) {
			builder.append(name);
		}
		builder.append(")");
		return builder.toString();
	}
}
