package org.gravity.tgg.tests.modisco.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.EList;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.InterfaceDeclaration;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.PrimitiveTypeVoid;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.TypeParameter;
import org.eclipse.modisco.java.emf.JavaFactory;
import org.gravity.modisco.MClass;
import org.gravity.modisco.ModiscoFactory;
import org.gravity.modisco.util.MoDiscoUtil;
import org.junit.Test;

public class ModiscoUtilTests {

	@Test
	public void testGetSuperClassValid() {
		ClassDeclaration child = ModiscoFactory.eINSTANCE.createMClass();
		ClassDeclaration parent = ModiscoFactory.eINSTANCE.createMClass();
		
		makeSuperClass(child, parent);
		
		ClassDeclaration result = MoDiscoUtil.getSuperClass(child);	
		assertEquals(parent, result);
	}
	
	@Test
	public void testGetSuperClassInvalidWrongType() {
		ClassDeclaration child = ModiscoFactory.eINSTANCE.createMClass();
		InterfaceDeclaration parent = JavaFactory.eINSTANCE.createInterfaceDeclaration();
		
		TypeAccess typeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		typeAccess.setType(parent);
		child.setSuperClass(typeAccess);
		
		ClassDeclaration result = MoDiscoUtil.getSuperClass(child);	
		assertNull(result);
	}
	
	@Test
	public void testIisSuperInterfaceValid() {
		ClassDeclaration child = ModiscoFactory.eINSTANCE.createMClass();
		InterfaceDeclaration parent = JavaFactory.eINSTANCE.createInterfaceDeclaration();
		InterfaceDeclaration other = JavaFactory.eINSTANCE.createInterfaceDeclaration();
		
		TypeAccess typeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		typeAccess.setType(parent);
		child.getSuperInterfaces().add(typeAccess);
		
		child.setSuperClass(typeAccess);
		
		assertTrue(MoDiscoUtil.isSuperType(child, parent));
		assertFalse(MoDiscoUtil.isSuperType(child, other));
	}
	
	@Test
	public void testGetAllParentTypesTypeParameter() {
		ClassDeclaration child = ModiscoFactory.eINSTANCE.createMClass();
		child.setName("child");
		ClassDeclaration parent = ModiscoFactory.eINSTANCE.createMClass();
		parent.setName("parent");
		TypeParameter illegalParentType = JavaFactory.eINSTANCE.createTypeParameter();
		
		makeSuperClass(child, parent);
		makeSuperClass(parent, illegalParentType);
		
		var parents = MoDiscoUtil.getAllParentTypes(child);
		assertEquals(1, parents.size());
		assertTrue(parents.contains(parent));
	}
	
	@Test
	public void testGetAllParentInterfaces() {
		ClassDeclaration child = ModiscoFactory.eINSTANCE.createMClass();
		child.setName("child");
		
		ClassDeclaration parent = ModiscoFactory.eINSTANCE.createMClass();
		parent.setName("parent");
		makeSuperClass(child, parent);
		
		InterfaceDeclaration iface1 = JavaFactory.eINSTANCE.createInterfaceDeclaration();
		iface1.setName("Interface1");
		TypeAccess ta1 = JavaFactory.eINSTANCE.createTypeAccess();
		ta1.setType(iface1);
		child.getSuperInterfaces().add(ta1);
		
		InterfaceDeclaration iface2 = JavaFactory.eINSTANCE.createInterfaceDeclaration();
		iface2.setName("Interface2");
		TypeAccess ta2 = JavaFactory.eINSTANCE.createTypeAccess();
		ta2.setType(iface2);
		parent.getSuperInterfaces().add(ta2);
		
		InterfaceDeclaration iface3 = JavaFactory.eINSTANCE.createInterfaceDeclaration();
		TypeAccess ta3 = JavaFactory.eINSTANCE.createTypeAccess();
		iface3.setName("Interface3");
		ta3.setType(iface3);
		iface2.getSuperInterfaces().add(ta3);		
		
		var parents = MoDiscoUtil.getAllParentTypes(child);
		assertEquals(4, parents.size());
		assertTrue(parents.contains(parent));
		assertTrue(parents.contains(iface1));
		assertTrue(parents.contains(iface2));
		assertTrue(parents.contains(iface3));
	}
	
	@Test
	public void testGetAllParentTypesParameterizedType() {
		ClassDeclaration child = ModiscoFactory.eINSTANCE.createMClass();
		child.setName("child");
		ClassDeclaration parent = ModiscoFactory.eINSTANCE.createMClass();
		parent.setName("parent");
		ParameterizedType parameterized1 = JavaFactory.eINSTANCE.createParameterizedType();
		parameterized1.setName("parameterized1");
		
		makeSuperClass(child, parent);
		makeSuperClass(parent, parameterized1);
		
		TypeAccess ta = JavaFactory.eINSTANCE.createTypeAccess();
		MClass baseType = ModiscoFactory.eINSTANCE.createMClass();
		ta.setType(baseType);
		parameterized1.setType(ta);
		
		TypeAccess ta2 = JavaFactory.eINSTANCE.createTypeAccess();
		InterfaceDeclaration iface1 = JavaFactory.eINSTANCE.createInterfaceDeclaration();
		iface1.setName("Interface1");
		ta2.setType(iface1);
		child.getSuperInterfaces().add(ta2);
		
		ParameterizedType parameterized2 = JavaFactory.eINSTANCE.createParameterizedType();
		parameterized2.setName("parameterized2");
		TypeAccess ta3 = JavaFactory.eINSTANCE.createTypeAccess();
		InterfaceDeclaration iface2 = JavaFactory.eINSTANCE.createInterfaceDeclaration();
		iface1.setName("Interface2");
		ta3.setType(iface2);
		parameterized2.setType(ta3);
		TypeAccess ta4 = JavaFactory.eINSTANCE.createTypeAccess();
		ta4.setType(parameterized2);
		iface1.getSuperInterfaces().add(ta4);
		
		var parents = MoDiscoUtil.getAllParentTypes(child);
		assertEquals(4, parents.size());
		assertTrue(parents.contains(parent));
		assertTrue(parents.contains(baseType));
		assertTrue(parents.contains(iface1));
		assertTrue(parents.contains(iface2));
	}	

	@Test
	public void testIsSuperInterface() {
		InterfaceDeclaration child = JavaFactory.eINSTANCE.createInterfaceDeclaration();
		InterfaceDeclaration middle = JavaFactory.eINSTANCE.createInterfaceDeclaration();
		InterfaceDeclaration parent = JavaFactory.eINSTANCE.createInterfaceDeclaration();
		TypeAccess ta1 = JavaFactory.eINSTANCE.createTypeAccess();
		TypeAccess ta2 = JavaFactory.eINSTANCE.createTypeAccess();
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
		EList<Type> orphanTypes = model.getOrphanTypes();
		assertEquals(1,orphanTypes.size());
		assertTrue(orphanTypes.get(0) instanceof PrimitiveTypeVoid);
	}
	
	private void makeSuperClass(ClassDeclaration child, Type parent) {
		TypeAccess typeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		typeAccess.setType(parent);
		child.setSuperClass(typeAccess);
	}
}
