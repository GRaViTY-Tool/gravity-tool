package org.gravity.pm.multimodule.tests;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.gravity.eclipse.programmodel.IProgramModelBuilder;
import org.gravity.eclipse.programmodel.ProgramModelBuildException;
import org.gravity.pm.multimodule.project.ProgramModelSystemBuilder;
import org.gravity.pm.multimodule.project.ProjectSystem;
import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TypeGraph;
import org.junit.Test;

public class ProgramModelSystemBuilderTest {
    @Test
    public void buildsOneIndependentModelPerSupportedModule() throws Exception {
        final IProject root = ResourcesPlugin.getWorkspace().getRoot().getProject("reactor");
        final IProject a = ResourcesPlugin.getWorkspace().getRoot().getProject("module-a");
        final IProject b = ResourcesPlugin.getWorkspace().getRoot().getProject("module-b");
        final AtomicInteger calls = new AtomicInteger();
        final IProgramModelBuilder backend = new IProgramModelBuilder() {
            @Override public String id() { return "test"; }
            @Override public boolean supports(IProject project) { return !project.equals(root); }
            @Override public TypeGraph build(IProject project, IProgressMonitor monitor) {
                calls.incrementAndGet();
                return BasicFactory.eINSTANCE.createTypeGraph();
            }
        };
        final var models = new ProgramModelSystemBuilder(backend)
                .build(new ProjectSystem(root, List.of(root, a, b), List.of()), new NullProgressMonitor());
        assertEquals(2, calls.get());
        assertEquals(2, models.size());
        assertNotSame(models.get(a), models.get(b));
        assertFalse(models.containsKey(root));
    }

    @Test
    public void rejectsMissingModel() {
        final IProject root = ResourcesPlugin.getWorkspace().getRoot().getProject("missing-model");
        final IProgramModelBuilder backend = new IProgramModelBuilder() {
            @Override public String id() { return "test"; }
            @Override public boolean supports(IProject project) { return true; }
            @Override public TypeGraph build(IProject project, IProgressMonitor monitor) { return null; }
        };
        assertThrows(ProgramModelBuildException.class, () ->
                new ProgramModelSystemBuilder(backend)
                        .build(new ProjectSystem(root, List.of(root), List.of()), new NullProgressMonitor()));
    }

    @Test
    public void rejectsCancellationBeforeBuilding() {
        final IProject root = ResourcesPlugin.getWorkspace().getRoot().getProject("cancelled-model");
        final var monitor = new NullProgressMonitor();
        monitor.setCanceled(true);
        final IProgramModelBuilder backend = new IProgramModelBuilder() {
            @Override public String id() { return "test"; }
            @Override public boolean supports(IProject project) { return true; }
            @Override public TypeGraph build(IProject project, IProgressMonitor ignored) {
                fail("Cancelled build must not invoke backend");
                return null;
            }
        };
        assertThrows(ProgramModelBuildException.class, () ->
                new ProgramModelSystemBuilder(backend)
                        .build(new ProjectSystem(root, List.of(root), List.of()), monitor));
    }
}
