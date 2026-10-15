package org.gravity.pm.multimodule.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.gravity.pm.multimodule.link.ProgramModelLink;
import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.BasicPackage;
import org.junit.Test;

public class ProgramModelLinkTest {

	@Test
	public void retainsReversibleLinkMetadata() {
		final var owner = BasicFactory.eINSTANCE.createTClass();
		final var surrogate = BasicFactory.eINSTANCE.createTClass();
		final var target = BasicFactory.eINSTANCE.createTClass();
		final var reference = BasicPackage.eINSTANCE.getTClass_ParentClasses();

		final var link = new ProgramModelLink("builder", owner, reference, 3, surrogate, target);

		assertEquals("builder", link.builderId());
		assertSame(owner, link.owner());
		assertSame(reference, link.reference());
		assertEquals(3, link.index());
		assertSame(surrogate, link.surrogate());
		assertSame(target, link.target());
	}
}
