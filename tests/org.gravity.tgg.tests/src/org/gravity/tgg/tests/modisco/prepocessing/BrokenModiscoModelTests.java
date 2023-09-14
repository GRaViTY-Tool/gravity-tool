package org.gravity.tgg.tests.modisco.prepocessing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.modisco.java.InterfaceDeclaration;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.UnresolvedInterfaceDeclaration;
import org.eclipse.modisco.java.UnresolvedTypeDeclaration;
import org.eclipse.modisco.java.emf.JavaFactory;
import org.gravity.modisco.MClass;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MMethodInvocation;
import org.gravity.modisco.ModiscoFactory;
import org.gravity.modisco.discovery.GravityModiscoProjectDiscoverer;
import org.junit.Test;

public class BrokenModiscoModelTests {

	@Test
	public void testClassNotInContainer()
			throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		final var model = ModiscoFactory.eINSTANCE.createMGravityModel();

		final var contained = createType("p", "Contained", model);


		final var notContained = ModiscoFactory.eINSTANCE.createMClass();
		notContained.setProxy(true);
		notContained.setName("NotContained");

		final var method = createMethodDefinition("dummy", notContained);
		method.setAbstractTypeDeclaration(contained);

		processFwd(model);

		assertTrue(model.getOrphanTypes().contains(notContained));
	}

	@Test
	public void testClassImplementsClass()
			throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		final var parentName = "ParentClass";

		final var model = ModiscoFactory.eINSTANCE.createMGravityModel();

		final var child = createType("p", "Child", model);
		
		final var parent = ModiscoFactory.eINSTANCE.createMClass();
		parent.setName(parentName);
		parent.setPackage(child.getPackage());
		
		final var cu = JavaFactory.eINSTANCE.createCompilationUnit();
		cu.getTypes().add(parent);
		parent.setOriginalCompilationUnit(cu);
		model.getCompilationUnits().add(cu);
		
		final var access = JavaFactory.eINSTANCE.createTypeAccess();
		access.setType(parent);
		child.getSuperInterfaces().add(access);
		
		processFwd(model);

		assertEquals(1, child.getSuperInterfaces().size());
		assertTrue(child.getSuperInterfaces().get(0).getType() instanceof UnresolvedInterfaceDeclaration);
	}

	@Test
	public void testClassExtendsInterface()
			throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		final var parentName = "ParentClass";

		final var model = ModiscoFactory.eINSTANCE.createMGravityModel();

		final var child = createType("p", "Child", model);
		final var parent = ModiscoFactory.eINSTANCE.createMClass();
		parent.setName(parentName);
		parent.setProxy(true);
		parent.setPackage(child.getPackage());
		final var access = JavaFactory.eINSTANCE.createTypeAccess();
		child.getSuperInterfaces().add(access);
		access.setType(parent);

		new ResourceSetImpl().createResource(URI.createURI("test.xmi")).getContents().add(model);
		processFwd(model);

		assertEquals(null, child.getSuperClass());
		assertEquals(1, child.getSuperInterfaces().size());
		assertTrue(child.getSuperInterfaces().stream().map(TypeAccess::getType)
				.filter(InterfaceDeclaration.class::isInstance).anyMatch(i -> parentName.equals(i.getName())));
	}

	@Test
	public void testUnresolvedTypeDecl()
			throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		final var name = "Type";

		final var model = ModiscoFactory.eINSTANCE.createMGravityModel();

		final var type = createType("p", name, model);

		final var unresolvedType = JavaFactory.eINSTANCE.createUnresolvedTypeDeclaration();
		unresolvedType.setProxy(true);
		unresolvedType.setName(name);
		model.getUnresolvedItems().add(unresolvedType);

		final var definition = createMethodDefinition("caller", unresolvedType);
		type.getBodyDeclarations().add(definition);

		final var expression = JavaFactory.eINSTANCE.createExpressionStatement();
		definition.getBody().getStatements().add(expression);

		final var itemAccess = JavaFactory.eINSTANCE.createUnresolvedItemAccess();
		itemAccess.setElement(unresolvedType);
		expression.setExpression(itemAccess);

		new ResourceSetImpl().createResource(URI.createURI("test.xmi")).getContents().add(model);

		processFwd(model);

		assertEquals(type, definition.getReturnType().getType());

		assertTrue(expression.getExpression() instanceof TypeAccess);
		assertEquals(type, ((TypeAccess) expression.getExpression()).getType());
	}

	@Test
	public void testFieldDefinitionNoClass() throws NoSuchMethodException, SecurityException, IllegalAccessException,
	IllegalArgumentException, InvocationTargetException {
		final var model = ModiscoFactory.eINSTANCE.createMGravityModel();

		final var invocation = createCallerStructure(model);
		final var access = ModiscoFactory.eINSTANCE.createMSingleVariableAccess();
		invocation.setExpression(access);
		final var variable = JavaFactory.eINSTANCE.createVariableDeclarationFragment();
		access.setVariable(variable);
		final var field = ModiscoFactory.eINSTANCE.createMFieldDefinition();
		variable.setName("field");
		field.getFragments().add(variable);

		final var processedModel = processFwd(model);

		assertNotNull(processedModel);

		final var createdOwner = field.getAbstractTypeDeclaration();
		assertTrue(createdOwner instanceof UnresolvedTypeDeclaration);
	}

	@Test
	public void testMethodDefinitionNoClass() throws NoSuchMethodException, SecurityException, IllegalAccessException,
	IllegalArgumentException, InvocationTargetException {
		final var model = ModiscoFactory.eINSTANCE.createMGravityModel();

		final var invocation = createCallerStructure(model);

		final var called = createMethodDefinition("called", null);
		invocation.setMethod(called);

		final var processedModel = processFwd(model);

		assertNotNull(processedModel);

		final var createdOwner = called.getAbstractTypeDeclaration();
		assertTrue(createdOwner instanceof UnresolvedTypeDeclaration);
	}

	@Test
	public void testConstructurDefinitionNoClass() throws NoSuchMethodException, SecurityException,
	IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		final var name = "Constructor";

		final var model = ModiscoFactory.eINSTANCE.createMGravityModel();

		final var invocation = createCallerStructure(model);

		final var called = ModiscoFactory.eINSTANCE.createMConstructorDefinition();
		called.setName(name);
		invocation.setMethod(called);

		final var processedModel = processFwd(model);

		assertNotNull(processedModel);

		final var createdOwner = called.getAbstractTypeDeclaration();
		assertTrue(createdOwner instanceof MClass);
		assertEquals(name, createdOwner.getName());
	}

	@Test
	public void testConstructurDefinitionRelinkToClass() throws NoSuchMethodException, SecurityException,
	IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		final var name = "Constructor";

		final var model = ModiscoFactory.eINSTANCE.createMGravityModel();

		final var invocation = createCallerStructure(model);

		final var target = ModiscoFactory.eINSTANCE.createMClass();
		target.setProxy(true);
		target.setName(name);
		model.getOwnedElements().get(0).getOwnedElements().add(target);

		final var called = ModiscoFactory.eINSTANCE.createMConstructorDefinition();
		called.setName(name);
		invocation.setMethod(called);

		final var processedModel = processFwd(model);

		assertNotNull(processedModel);

		final var createdOwner = called.getAbstractTypeDeclaration();
		assertEquals(target, createdOwner);
	}

	private MGravityModel processFwd(final MGravityModel model)
			throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		final var processing = GravityModiscoProjectDiscoverer.class.getDeclaredMethod("processFwd",
				MGravityModel.class, IFolder.class, IProgressMonitor.class);
		processing.setAccessible(true);
		return (MGravityModel) processing.invoke(null, model, null, null);
	}

	private MClass createType(final String namespace, final String name, final MGravityModel model) {
		final var pack = JavaFactory.eINSTANCE.createPackage();
		pack.setName(namespace);
		model.getOwnedElements().add(pack);

		final var type = ModiscoFactory.eINSTANCE.createMClass();
		type.setProxy(true);
		type.setName(name);
		pack.getOwnedElements().add(type);
				
		return type;
	}

	private MMethodInvocation createCallerStructure(final MGravityModel model) {
		final var type = createType("p", "Type", model);

		final var caller = createMethodDefinition("caller", null);
		type.getBodyDeclarations().add(caller);

		final var expression = JavaFactory.eINSTANCE.createExpressionStatement();
		caller.getBody().getStatements().add(expression);

		final var invocation = ModiscoFactory.eINSTANCE.createMMethodInvocation();
		expression.setExpression(invocation);
		return invocation;
	}

	private MMethodDefinition createMethodDefinition(final String name, final Type returnType) {
		final var definition = ModiscoFactory.eINSTANCE.createMMethodDefinition();
		definition.setName(name);
		final var block = JavaFactory.eINSTANCE.createBlock();
		definition.setBody(block);
		if (returnType != null) {
			final var typeAccess = JavaFactory.eINSTANCE.createTypeAccess();
			definition.setReturnType(typeAccess);
			typeAccess.setType(returnType);
		}

		return definition;
	}

}
