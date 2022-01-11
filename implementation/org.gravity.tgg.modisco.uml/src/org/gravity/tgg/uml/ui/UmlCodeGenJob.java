package org.gravity.tgg.uml.ui;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.gravity.eclipse.util.EMFUtil;
import org.gravity.eclipse.util.JavaProjectUtil;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.codegen.GravityModiscoCodeGenerator;
import org.gravity.tgg.uml.GravityUmlActivator;
import org.gravity.tgg.uml.Transformation;
import org.gravity.tgg.uml.TransformationFactory;

/**
 * An implementation of java.lang.Job for creating a PG from a selection in an
 * eclipse workspace
 *
 * @author speldszus
 *
 */
final class UmlCodeGenJob extends Job {

	private final List<?> selection;

	/**
	 * Creates a new job for generating code from UML models from a project
	 * selection
	 *
	 * @param selection The selection from the workspace
	 */
	UmlCodeGenJob(final List<?> selection) {
		super("UML Code Gen");
		this.selection = selection;
	}

	@Override
	protected IStatus run(final IProgressMonitor monitor) {
		final Set<?> umlFiles = this.selection.parallelStream().filter(object -> (object instanceof IFile))
				.filter(file -> "uml".equalsIgnoreCase(((IFile) file).getFileExtension())).collect(Collectors.toSet());
		if (umlFiles.size() != 1) {
			return new Status(IStatus.ERROR, GravityUmlActivator.PLUGIN_ID, "Please select exactly one UML file!");
		}
		final IFile umlFile = (IFile) umlFiles.iterator().next();
		final IProject project = umlFile.getProject();
		IJavaProject javaProject;
		try {
			javaProject = JavaProjectUtil.convertToJavaProject(Collections.singleton("src"), project, monitor);
			final TransformationFactory transformationFactory = GravityUmlActivator.getTransformationFactory();
			final Transformation transformation = transformationFactory.getTransformation(javaProject.getProject());
			final ResourceSet set = transformation.getResourceSet();
			set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION,
					UMLResource.Factory.INSTANCE);
			final URI uri = EMFUtil.getPlatformResourceURI(umlFile);
			final Resource targetResource = set.getResource(uri, true);
			final EList<EObject> contents = targetResource.getContents();
			final Set<EObject> roots = contents.parallelStream().filter(eObject -> (eObject instanceof Model))
					.collect(Collectors.toSet());
			if (roots.size() != 1) {
				return new Status(IStatus.ERROR, GravityUmlActivator.PLUGIN_ID, "Couldn't find root model!");
			}
			Model root = (Model) roots.iterator().next();
			final String name = root.getName();
			if (!"root model".equals(name)) {
				if (!project.getName().equals(name)) {
					root.setName(project.getName());
				}
				if (root.getPackagedElement("Common Java datatypes") == null) {
					root.createNestedPackage("Common Java datatypes");
				}
				if (root.getPackagedElement("externals") == null) {
					root.createNestedPackage("externals", UMLPackage.eINSTANCE.getModel());
				}
				if (root.getPackagedElement("source references") == null) {
					root.createNestedPackage("source references", UMLPackage.eINSTANCE.getModel());
				}

				final Model model = UMLFactory.eINSTANCE.createModel();
				model.setName("root model");
				model.getNestedPackages().add(root);

				contents.remove(root);
				contents.add(model);
				root = model;
			}
			addTypesToDefaultPackage(project, root);

			transformation.setTrg(root);
			transformation.integrateBackward();
			final EObject src = transformation.getSrc();
			if (src instanceof Model) {
				final MGravityModel modisco = (MGravityModel) src;

				GravityModiscoCodeGenerator.generateCode(project, modisco,null, monitor);

				transformation.integrateForward();

				try (FileOutputStream outputStream = new FileOutputStream(umlFile.getLocation().toFile())) {
					targetResource.save(outputStream, Collections.emptyMap());
				}
			}
			else {
				return new Status(IStatus.ERROR, GravityUmlActivator.PLUGIN_ID,"TGG Failed");
			}
		} catch (IOException | CoreException e) {
			return new Status(IStatus.ERROR, GravityUmlActivator.PLUGIN_ID, e.getLocalizedMessage(), e);
		}
		return Status.OK_STATUS;
	}

	/**
	 * Adds types that are not in a package to the default package
	 *
	 * @param project The project the elements should be added to
	 * @param root    The root UML model
	 */
	private void addTypesToDefaultPackage(final IProject project, final Model root) {
		final Model projectModel = (Model) root.getOwnedMember(project.getName());
		final Collection<Classifier> typesInDefaultPackage = new LinkedList<>();
		for (final Element element : projectModel.getOwnedElements()) {
			if ((element instanceof Class) || (element instanceof Interface) || (element instanceof Enumeration)) {
				final Classifier classifier = (Classifier) element;
				if ((classifier.getPackage() == null) || projectModel.equals(classifier.getPackage())) {
					typesInDefaultPackage.add(classifier);
				}
			}
		}
		if (!typesInDefaultPackage.isEmpty()) {
			Package defaultPackage = (Package) projectModel.getOwnedMember("(default package)");
			if (defaultPackage == null) {
				defaultPackage = UMLFactory.eINSTANCE.createPackage();
				defaultPackage.setName("(default package)");
				defaultPackage.setNestingPackage(projectModel);
			}
			defaultPackage.getPackagedElements().addAll(typesInDefaultPackage);
		}
	}

}