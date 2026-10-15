package org.gravity.pm.multimodule.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.gravity.pm.multimodule.project.ProjectDependency;
import org.gravity.pm.multimodule.project.ProjectSystem;
import org.junit.Test;

public class ProjectSystemTest {

	@Test
	public void copiesProjectAndDependencyCollections() {
		final var projects = new ArrayList<IProject>();
		final var dependencies = new ArrayList<ProjectDependency>();
		final var system = new ProjectSystem(null, projects, dependencies);

		projects.add(null);
		dependencies.add(new ProjectDependency(null, null));

		assertEquals(List.of(), system.projects());
		assertEquals(List.of(), system.dependencies());
		assertNotSame(projects, system.projects());
		assertNotSame(dependencies, system.dependencies());
	}

	@Test
	public void rejectsNullCollections() {
		assertThrows(NullPointerException.class, () -> new ProjectSystem(null, null, List.of()));
		assertThrows(NullPointerException.class, () -> new ProjectSystem(null, List.of(), null));
	}

	@Test
	public void dependencyRetainsSourceAndTarget() {
		final var dependency = new ProjectDependency(null, null);
		assertEquals(null, dependency.source());
		assertEquals(null, dependency.target());
	}
}
