package org.gravity.tgg.tests.modisco.prepocessing;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.eclipse.modisco.java.emf.JavaFactory;
import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodSignature;
import org.gravity.modisco.MSingleVariableDeclaration;
import org.gravity.modisco.ModiscoFactory;
import org.gravity.modisco.processing.fwd.MethodPreprocessing;
import org.junit.Test;

public class SignaturePreprocessingTest {

	private final MGravityModel model;
	private final Collection<MAbstractMethodDefinition> definitions;
	private final HashMap<Integer, List<MSingleVariableDeclaration>> expectedParameters;

	public SignaturePreprocessingTest() {
		this.definitions = new ArrayList<>(2);
		this.model = ModiscoFactory.eINSTANCE.createMGravityModel();

		final var returntype = JavaFactory.eINSTANCE.createPrimitiveTypeVoid();
		this.model.getOrphanTypes().add(returntype);

		final var paramtype = JavaFactory.eINSTANCE.createPrimitiveTypeBoolean();
		this.model.getOrphanTypes().add(paramtype);

		final var namespace = JavaFactory.eINSTANCE.createPackage();
		this.model.getOwnedElements().add(namespace);

		this.expectedParameters = new HashMap<>(2);
		for (var j = 0; j < 2; j++) {
			final var type = ModiscoFactory.eINSTANCE.createMClass();
			namespace.getOwnedElements().add(type);
			final var method = ModiscoFactory.eINSTANCE.createMMethodDefinition();
			method.setName("method");
			method.setAbstractTypeDeclaration(type);
			final var access = JavaFactory.eINSTANCE.createTypeAccess();
			access.setType(returntype);
			method.setReturnType(access);
			type.getBodyDeclarations().add(method);

			for (var i = 0; i < 2; i++) {
				final var variable = ModiscoFactory.eINSTANCE.createMSingleVariableDeclaration();
				final var accessVarType = JavaFactory.eINSTANCE.createTypeAccess();
				variable.setType(accessVarType);
				accessVarType.setType(paramtype);
				method.getParameters().add(variable);
				this.expectedParameters.computeIfAbsent(i, k -> new ArrayList<>(2)).add(variable);
			}
			this.definitions.add(method);
		}
	}

	@Test
	public void testParametersOfMultipleDefinitions() {
		final var preprocessor = new MethodPreprocessing();
		final var sucess = preprocessor.process(this.model, this.definitions, null, null);
		assertTrue(sucess);

		final var names = this.model.getMMethodNames();
		assertEquals(1, names.size());
		final var name = names.get(0);
		assertEquals("method", name.getMName());

		final var signatures = name.getMSignatures();
		assertEquals(1, signatures.size());
		final var signature = (MMethodSignature) signatures.get(0);

		assertArrayEquals(this.definitions.toArray(), signature.getMDefinitions().toArray());
		final var entries = signature.getMEntrys();
		var i = 0;
		var current = signature.getMFirstEntry();
		while (current != null) {
			assertTrue(entries.contains(current));
			final var instances = current.getAllParameterInstances();
			final var expect = this.expectedParameters.get(i);
			assertTrue(expect.size() == instances.size() && expect.containsAll(instances)
					&& instances.containsAll(expect));
			i++;
			current = current.getMNext();
		}

	}
}
