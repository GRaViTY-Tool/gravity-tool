package org.gravity.tgg.tests;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.internal.resources.ResourceException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.importer.DuplicateProjectNameException;
import org.gravity.eclipse.util.JavaProjectUtil;

@SuppressWarnings("restriction")
public class MoDiscoTestActivator extends Plugin {

	public static final String PLUGIN_ID = "org.gravity.tgg.tests";

	/**
	 * Generates a simple Java project with only one class
	 * (<code>dummy.Clazz</code>)
	 *
	 * @param name The name of the project
	 *
	 * @return the generated Java project
	 *
	 * @throws CoreException                 If the creation fails
	 * @throws DuplicateProjectNameException If the project already exists
	 */
	public static IJavaProject generateSimpleProject(final String name) throws CoreException, DuplicateProjectNameException {
		final var project = JavaProjectUtil.createJavaProject(name, Collections.singleton("src"), null);

		final var srcDummy = project.getProject().getFolder("src").getFolder("dummy");
		srcDummy.create(true, true, null);

		final var clazzFile = srcDummy.getFile("Clazz.java");
		final var content = "package dummy;\n" + "public class Clazz {\n" + "}";
		try (var stream = new ByteArrayInputStream(content.getBytes())) {
			clazzFile.create(stream, true, null);
		} catch (final IOException e) {
			project.getProject().delete(true, null);
			throw new ResourceException(IStatus.ERROR, clazzFile.getFullPath(), e.getMessage(), e);
		}
		return project;
	}
}
