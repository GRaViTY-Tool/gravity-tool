package org.gravity.pm.multimodule.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.gravity.pm.multimodule.project.MavenProjectSystemProvider;
import org.junit.Test;

/**
 * Ensures that an ordinary Eclipse project is not silently interpreted as a
 * Maven reactor. Actual m2e reactor imports need a separate integration fixture.
 */
public class MavenProjectSystemProviderTest {

    @Test
    public void refusesWorkspaceProjectWithoutM2eImport() throws Exception {
        final IProject project = ResourcesPlugin.getWorkspace().getRoot()
                .getProject("MavenProviderNonMavenFixture");
        final var monitor = new NullProgressMonitor();
        if (project.exists()) {
            project.delete(true, monitor);
        }
        project.create(monitor);
        project.open(monitor);
        try {
            final var provider = new MavenProjectSystemProvider();
            assertFalse("Unimported Eclipse project must not be treated as a Maven reactor",
                    provider.supports(project));
            assertThrows(IllegalArgumentException.class, () -> provider.resolve(project, monitor));
        } finally {
            project.delete(true, monitor);
        }
    }
}
