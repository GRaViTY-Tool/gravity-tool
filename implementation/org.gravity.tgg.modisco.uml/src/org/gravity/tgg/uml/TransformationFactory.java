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

	private Map<IProject, Transformation> map;

	TransformationFactory() {
		map = new HashMap<>();
	}

	public Transformation getTransformation(IProject project) throws IOException, CoreException {
		if (map.containsKey(project)) {
			return  map.get(project);
		}
		IJavaProject javaProject = JavaProjectUtil.getJavaProject(project);
		if (javaProject == null) {
			return null;
		}
		Transformation trafo = new Transformation(javaProject, null);
		registerTransformation(trafo);
		return trafo;
	}

	public Transformation getTransformation(IJavaProject javaProject, UMLResource targetResource)
			throws IOException, CoreException {
		IProject project = javaProject.getProject();
		Transformation trafo = map.get(project);
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
	private void registerTransformation(Transformation trafo) {
		IProject project = trafo.getProject().getProject();
		Transformation existingTrafo = map.get(project);
		if (existingTrafo != null) {
			if (!trafo.equals(existingTrafo)) {
				throw new IllegalStateException();
			}
		} else {
			map.put(project, trafo);
		}
	}
}
