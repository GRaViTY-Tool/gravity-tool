package org.gravity.tgg.tests.modisco.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.PrimitiveTypeVoid;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.emf.JavaFactory;
import org.gravity.modisco.ModiscoFactory;
import org.gravity.modisco.util.MoDiscoUtil;
import org.junit.Test;

public class ModiscoUtilTests {

	@Test
	public void testGetSuperClassValid() {
		final var child = ModiscoFactory.eINSTANCE.createMClass();
		final var parent = ModiscoFactory.eINSTANCE.createMClass();

		this.makeSuperClass(child, parent);

		final var result = MoDiscoUtil.getSuperClass(child);
		assertEquals(parent, result);
	}

	@Test
	public void testGetSuperClassInvalidWrongType() {
		final var child = ModiscoFactory.eINSTANCE.createMClass();
		final var parent = JavaFactory.eINSTANCE.createInterfaceDeclaration();

		final var typeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		typeAccess.setType(parent);
		child.setSuperClass(typeAccess);

		final var result = MoDiscoUtil.getSuperClass(child);
		assertNull(result);
	}

	@Test
	public void testIisSuperInterfaceValid() {
		final var child = ModiscoFactory.eINSTANCE.createMClass();
		final var parent = JavaFactory.eINSTANCE.createInterfaceDeclaration();
		final var other = JavaFactory.eINSTANCE.createInterfaceDeclaration();

		final var typeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		typeAccess.setType(parent);
		child.getSuperInterfaces().add(typeAccess);

		child.setSuperClass(typeAccess);

		assertTrue(MoDiscoUtil.isSuperType(child, parent));
		assertFalse(MoDiscoUtil.isSuperType(child, other));
	}

	@Test
	public void testGetAllParentTypesTypeParameter() {
		final var child = ModiscoFactory.eINSTANCE.createMClass();
		final var parent = ModiscoFactory.eINSTANCE.createMClass();
		final var illegalParentType = JavaFactory.eINSTANCE.createTypeParameter();

		this.makeSuperClass(child, parent);
		this.makeSuperClass(parent, illegalParentType);

		final var parents = MoDiscoUtil.getAllParentTypes(child);
		assertEquals(1, parents.size());
		assertTrue(parents.contains(parent));
	}

	@Test
	public void testGetAllParentInterfaces() {
		final var child = ModiscoFactory.eINSTANCE.createMClass();
		final var parent = ModiscoFactory.eINSTANCE.createMClass();
		this.makeSuperClass(child, parent);

		final var iface1 = JavaFactory.eINSTANCE.createInterfaceDeclaration();
		final var ta1 = JavaFactory.eINSTANCE.createTypeAccess();
		ta1.setType(iface1);
		child.getSuperInterfaces().add(ta1);

		final var iface2 = JavaFactory.eINSTANCE.createInterfaceDeclaration();
		final var ta2 = JavaFactory.eINSTANCE.createTypeAccess();
		ta2.setType(iface2);
		parent.getSuperInterfaces().add(ta2);

		final var iface3 = JavaFactory.eINSTANCE.createInterfaceDeclaration();
		final var ta3 = JavaFactory.eINSTANCE.createTypeAccess();
		ta3.setType(iface3);
		iface2.getSuperInterfaces().add(ta3);

		final var parents = MoDiscoUtil.getAllParentTypes(child);
		assertEquals(4, parents.size());
		assertTrue(parents.contains(parent));
		assertTrue(parents.contains(iface1));
		assertTrue(parents.contains(iface2));
		assertTrue(parents.contains(iface3));
	}

	@Test
	public void testGetAllParentTypesParameterizedType() {
		final var child = ModiscoFactory.eINSTANCE.createMClass();
		final var parent = ModiscoFactory.eINSTANCE.createMClass();
		final var parameterized1 = JavaFactory.eINSTANCE.createParameterizedType();

		this.makeSuperClass(child, parent);
		this.makeSuperClass(parent, parameterized1);

		final var ta = JavaFactory.eINSTANCE.createTypeAccess();
		final var baseType = ModiscoFactory.eINSTANCE.createMClass();
		ta.setType(baseType);
		parameterized1.setType(ta);

		final var ta2 = JavaFactory.eINSTANCE.createTypeAccess();
		final var iface1 = JavaFactory.eINSTANCE.createInterfaceDeclaration();
		ta2.setType(iface1);
		child.getSuperInterfaces().add(ta2);

		final var parameterized2 = JavaFactory.eINSTANCE.createParameterizedType();
		final var ta3 = JavaFactory.eINSTANCE.createTypeAccess();
		final var iface2 = JavaFactory.eINSTANCE.createInterfaceDeclaration();
		ta3.setType(iface2);
		parameterized2.setType(ta3);
		final var ta4 = JavaFactory.eINSTANCE.createTypeAccess();
		ta4.setType(parameterized2);
		iface1.getSuperInterfaces().add(ta4);

		final var parents = MoDiscoUtil.getAllParentTypes(child);
		assertEquals(4, parents.size());
		assertTrue(parents.contains(parent));
		assertTrue(parents.contains(baseType));
		assertTrue(parents.contains(iface1));
		assertTrue(parents.contains(iface2));
	}

	@Test
	public void testGetAllParentsUnresolvedType() {
		final var unresolved = JavaFactory.eINSTANCE.createUnresolvedClassDeclaration();
		final var ta = JavaFactory.eINSTANCE.createTypeAccess();
		final var type = ModiscoFactory.eINSTANCE.createMClass();
		ta.setType(type);
		unresolved.setSuperClass(ta);
		final var result = MoDiscoUtil.getAllParentTypes(unresolved);
		assertEquals(1, result.size());
		assertTrue(result.contains(type));

		final var empty = MoDiscoUtil.getAllParentTypes(JavaFactory.eINSTANCE.createUnresolvedClassDeclaration());
		assertTrue(empty.isEmpty());
	}

	@Test
	public void testIsSuperInterface() {
		final var child = JavaFactory.eINSTANCE.createInterfaceDeclaration();
		final var middle = JavaFactory.eINSTANCE.createInterfaceDeclaration();
		final var parent = JavaFactory.eINSTANCE.createInterfaceDeclaration();
		final var ta1 = JavaFactory.eINSTANCE.createTypeAccess();
		final var ta2 = JavaFactory.eINSTANCE.createTypeAccess();
		ta2.setType(parent);
		middle.getSuperInterfaces().add(ta2);
		ta1.setType(middle);
		child.getSuperInterfaces().add(ta1);

		assertTrue(MoDiscoUtil.isSuperInterface(child, parent));
		assertTrue(MoDiscoUtil.isSuperInterface(child, middle));
		assertFalse(MoDiscoUtil.isSuperInterface(parent, child));
	}

	@Test
	public void testGetVoid() {
		final var model = ModiscoFactory.eINSTANCE.createMGravityModel();

		final var v = MoDiscoUtil.getVoid(model);
		assertNotNull(v);
		final var orphanTypes = model.getOrphanTypes();
		assertEquals(1, orphanTypes.size());
		assertTrue(orphanTypes.get(0) instanceof PrimitiveTypeVoid);
	}

	private void makeSuperClass(final ClassDeclaration child, final Type parent) {
		final var typeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		typeAccess.setType(parent);
		child.setSuperClass(typeAccess);
	}
}
