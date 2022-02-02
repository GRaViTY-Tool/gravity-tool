package org.gravity.tgg.uml;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.gravity.eclipse.util.JavaProjectUtil;

public class TransformationFactory {

	private final Map<IProject, Transformation> map;

	TransformationFactory() {
		this.map = new HashMap<>();
	}

	public Transformation getTransformation(final IProject project) throws IOException, CoreException {
		if (this.map.containsKey(project)) {
			return  this.map.get(project);
		}
		final var javaProject = JavaProjectUtil.getJavaProject(project);
		if (javaProject == null) {
			return null;
		}
		final var trafo = new Transformation(javaProject);
		registerTransformation(trafo);
		return trafo;
	}

	/**
	 * Registers a transformation at this factory
	 *
	 * @param trafo The transformation
	 */
	private void registerTransformation(final Transformation trafo) {
		final var project = trafo.getProject().getProject();
		final var existingTrafo = this.map.get(project);
		if (existingTrafo != null) {
			if (!trafo.equals(existingTrafo)) {
				throw new IllegalStateException();
			}
		} else {
			this.map.put(project, trafo);
		}
	}

	/**
	 * Drops the factory for the project
	 *
	 * @param project
	 * @return
	 */
	public boolean drop(final IProject project) {
		if (this.map.containsKey(project)) {
			final var converter = this.map.remove(project);
			return (converter != null) && converter.discard();
		}
		return false;
	}

	void shutdown() {
		final IProgressMonitor monitor = new NullProgressMonitor();
		for (final Transformation converter : this.map.values()) {
			converter.save(monitor);
			converter.discard();
		}
	}
}
