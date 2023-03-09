package org.gravity.eclipse.tests;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.gravity.eclipse.util.EMFUtil;
import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.TypeGraph;
import org.junit.Test;

public class EMFUtilTests {

	@Test
	public void testCloneModel() throws IOException {
		final var pmName = "PMName";
		final var packageName = "dummy.package";
		final var className = "Class";

		final var origin = new ResourceSetImpl().createResource(URI.createFileURI("model.xmi"));

		final var pm = BasicFactory.eINSTANCE.createTypeGraph();
		pm.setTName(pmName);
		origin.getContents().add(pm);

		pm.createTClass(packageName, className, false, TVisibility.TPRIVATE);

		final var clone = EMFUtil.cloneResourceIntoNewResourceSet(origin);
		final var clonedPM = ((TypeGraph) clone.getContents().get(0)).getTName();

		assertEquals(pmName, clonedPM);

		final var clonedClass = pm.getClasses().get(0);
		assertEquals(packageName + '.' + className, clonedClass.getFullyQualifiedName());
	}
}
