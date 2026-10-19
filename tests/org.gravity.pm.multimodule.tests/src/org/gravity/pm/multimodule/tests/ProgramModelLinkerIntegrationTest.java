package org.gravity.pm.multimodule.tests;

import static org.junit.Assert.*;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.gravity.pm.multimodule.link.ProgramModelLinker;
import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TClass;
import org.junit.Test;

public class ProgramModelLinkerIntegrationTest {
    @Test
    public void linksAcrossResourcesPersistsAndRestoresSurrogate() throws Exception {
        var set = new ResourceSetImpl();
        set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
        var first = set.createResource(URI.createURI("memory:/module-a.xmi"));
        var second = set.createResource(URI.createURI("memory:/module-b.xmi"));
        TClass owner = BasicFactory.eINSTANCE.createTClass();
        TClass surrogate = BasicFactory.eINSTANCE.createTClass();
        TClass actual = BasicFactory.eINSTANCE.createTClass();
        first.getContents().add(owner);
        first.getContents().add(surrogate);
        second.getContents().add(actual);
        owner.getParentClasses().add(surrogate);

        var linker = new ProgramModelLinker();
        linker.link("tgg", owner, BasicPackage.eINSTANCE.getTClass_ParentClasses(), surrogate, actual);
        assertSame(actual, owner.getParentClasses().get(0));
        assertEquals(1, linker.links().size());

        var bytesA = new java.io.ByteArrayOutputStream();
        var bytesB = new java.io.ByteArrayOutputStream();
        first.save(bytesA, Map.of());
        second.save(bytesB, Map.of());
        var reloaded = new ResourceSetImpl();
        reloaded.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
        var loadedB = reloaded.createResource(second.getURI());
        loadedB.load(new java.io.ByteArrayInputStream(bytesB.toByteArray()), Map.of());
        var loadedA = reloaded.createResource(first.getURI());
        loadedA.load(new java.io.ByteArrayInputStream(bytesA.toByteArray()), Map.of());
        TClass restored = (TClass) loadedA.getContents().get(0);
        assertSame(loadedB.getContents().get(0), restored.getParentClasses().get(0));

        linker.unlink();
        assertSame(surrogate, owner.getParentClasses().get(0));
    }

    @Test
    public void unlinkDoesNotOverwriteUserChanges() {
        TClass owner = BasicFactory.eINSTANCE.createTClass();
        TClass surrogate = BasicFactory.eINSTANCE.createTClass();
        TClass actual = BasicFactory.eINSTANCE.createTClass();
        TClass edited = BasicFactory.eINSTANCE.createTClass();
        owner.getParentClasses().add(surrogate);
        var linker = new ProgramModelLinker();
        linker.link("tgg", owner, BasicPackage.eINSTANCE.getTClass_ParentClasses(), surrogate, actual);
        owner.getParentClasses().set(0, edited);
        linker.unlink();
        assertSame(edited, owner.getParentClasses().get(0));
    }

    @Test
    public void refusesContainmentAndMissingSurrogate() {
        TClass owner = BasicFactory.eINSTANCE.createTClass();
        TClass surrogate = BasicFactory.eINSTANCE.createTClass();
        TClass actual = BasicFactory.eINSTANCE.createTClass();
        var linker = new ProgramModelLinker();
        assertThrows(IllegalArgumentException.class, () ->
            linker.link("tgg", owner, BasicPackage.eINSTANCE.getTClass_ParentClasses(), surrogate, actual));
    }

    @Test
    public void uniqueParentReferenceDoesNotCreateDuplicateLinks() {
        TClass owner = BasicFactory.eINSTANCE.createTClass();
        TClass surrogate = BasicFactory.eINSTANCE.createTClass();
        TClass actual = BasicFactory.eINSTANCE.createTClass();
        owner.getParentClasses().add(surrogate);
        owner.getParentClasses().add(surrogate);
        assertEquals("EMF parent classes are unique", 1, owner.getParentClasses().size());

        var linker = new ProgramModelLinker();
        linker.link("tgg", owner, BasicPackage.eINSTANCE.getTClass_ParentClasses(), surrogate, actual);
        assertSame(actual, owner.getParentClasses().get(0));
        assertEquals(1, linker.links().size());
        linker.unlink();
        assertSame(surrogate, owner.getParentClasses().get(0));
    }

    @Test
    public void refusesIncompatibleReferenceTarget() {
        TClass owner = BasicFactory.eINSTANCE.createTClass();
        TClass surrogate = BasicFactory.eINSTANCE.createTClass();
        owner.getParentClasses().add(surrogate);
        var linker = new ProgramModelLinker();
        assertThrows(IllegalArgumentException.class, () ->
                linker.link("tgg", owner, BasicPackage.eINSTANCE.getTClass_ParentClasses(),
                        surrogate, BasicFactory.eINSTANCE.createTMethod()));
        assertSame(surrogate, owner.getParentClasses().get(0));
    }

    @Test
    public void linksReferencesAcrossContainedModelElements() {
        var root = BasicFactory.eINSTANCE.createTypeGraph();
        TClass owner = BasicFactory.eINSTANCE.createTClass();
        TClass surrogate = BasicFactory.eINSTANCE.createTClass();
        TClass actual = BasicFactory.eINSTANCE.createTClass();
        var dependency = BasicFactory.eINSTANCE.createTypeGraph();
        // Classes are contained through modules; TypeGraph.classes is only an index.
        var module = BasicFactory.eINSTANCE.createTModule();
        root.getModules().add(module);
        module.getContains().add(owner);
        module.getContains().add(surrogate);
        var dependencyModule = BasicFactory.eINSTANCE.createTModule();
        dependency.getModules().add(dependencyModule);
        dependencyModule.getContains().add(actual);
        assertSame(root, owner.eContainer().eContainer());
        owner.getParentClasses().add(surrogate);
        var linker = new ProgramModelLinker();
        assertEquals(1, linker.linkAll("tgg", root, surrogate, actual));
        assertSame(actual, owner.getParentClasses().get(0));
        linker.unlink();
        assertSame(surrogate, owner.getParentClasses().get(0));
    }
}
