package org.gravity.tgg.uml;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.uml2.uml.resource.UMLResource;
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
		final IJavaProject javaProject = JavaProjectUtil.getJavaProject(project);
		if (javaProject == null) {
			return null;
		}
		final Transformation trafo = new Transformation(javaProject, null);
		registerTransformation(trafo);
		return trafo;
	}

	public Transformation getTransformation(final IJavaProject javaProject, final UMLResource targetResource)
			throws IOException, CoreException {
		final IProject project = javaProject.getProject();
		Transformation trafo = this.map.get(project);
		if (trafo == null) {
			trafo = new Transformation(javaProject, targetResource);
			registerTransformation(trafo);
		}
		return trafo;
	}

	/**
	 * Registers a transformation at this factory
	 *
	 * @param trafo The transformation
	 */
	private void registerTransformation(final Transformation trafo) {
		final IProject project = trafo.getProject().getProject();
		final Transformation existingTrafo = this.map.get(project);
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
	 */
	public void drop(final IProject project) {
		this.map.remove(project);
	}
}
