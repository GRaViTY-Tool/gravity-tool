package org.gravity.security.analysis.handlers;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Level;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.eclipse.ui.exceptions.UnsupportedSelectionException;
import org.gravity.security.analysis.Activator;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.annotations.TAnnotationType;
import org.osgi.framework.Bundle;

final class CreateProgramModelJob extends Job {
	private final List<Object> selection;

	CreateProgramModelJob(String name, List<Object> selection) {
		super(name);
		this.selection = selection;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		for (final Object entry : this.selection) {
			if (monitor.isCanceled()) {
				return Status.CANCEL_STATUS;
			}
			if (entry instanceof IJavaProject) {
				final IJavaProject iJavaProject = (IJavaProject) entry;
				process(iJavaProject, monitor);
			} else {
				final UnsupportedSelectionException exception = new UnsupportedSelectionException(entry.getClass());
				PublicInterfacesAccessHandler.LOGGER.log(Level.ERROR, exception.getMessage());
				return new Status(IStatus.ERROR, Activator.PLUGIN_ID, exception.getMessage(), exception);
			}
		}
		return Status.OK_STATUS;
	}

	private boolean process(IJavaProject iJavaProject, IProgressMonitor monitor) {
		final IProject iProject = iJavaProject.getProject();

		final GravityActivator gravityActivator = GravityActivator.getDefault();
		IPGConverter converter;
		try {
			converter = gravityActivator.getConverter(iProject);
		} catch (NoConverterRegisteredException | CoreException e1) {
			PublicInterfacesAccessHandler.LOGGER.log(Level.ERROR, e1.getMessage(), e1);
			return false;
		}

		final HashMap<String, IPath> libs = new HashMap<>();

		final IExtensionRegistry registry = Platform.getExtensionRegistry();
		final IExtensionPoint point = registry.getExtensionPoint(Activator.EXTENSIONPOINT_REGISTER_PROJECT);
		for (final IConfigurationElement element : point.getConfigurationElements()) {
			try {
				final String pluginId = element.getAttribute("plugin");
				final Bundle bundle = Platform.getBundle(pluginId);
				if (bundle == null) {
					continue;
				}
				final File file = FileLocator.getBundleFile(bundle);
				libs.put(pluginId, new Path(file.getAbsolutePath()));
			} catch (final IOException e) {
				PublicInterfacesAccessHandler.LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
			}
		}

		final boolean success = converter.convertProject(iJavaProject, libs.values(), monitor);
		gravityActivator.discardConverter(iProject);
		if (!success) {
			PublicInterfacesAccessHandler.LOGGER.log(Level.ERROR, "No PG has been created for " + iProject.getName());
			return false;
		}
		final TypeGraph pg = converter.getPG();

		final Set<String> names = new HashSet<>();
		try {
			for (final IPackageFragment p : iJavaProject.getPackageFragments()) {
				for (final ICompilationUnit cu : p.getCompilationUnits()) {
					for (final IType t : cu.getTypes()) {
						names.add(t.getFullyQualifiedName());
					}
				}
			}
		} catch (final JavaModelException e) {
			PublicInterfacesAccessHandler.LOGGER.error(e);
		}

		return inspect(pg, names);
	}

	private static boolean inspect(TypeGraph pg, Set<String> names) {
		final TAbstractType high = pg.getType("org.gravity.security.annotations.requirements.High");
		if (high == null) {
			PublicInterfacesAccessHandler.LOGGER.log(Level.INFO, "Nothing to check!");
			return true;
		}
		final Set<TAnnotationType> protectors = new HashSet<>();
		protectors.add((TAnnotationType) high);

		final TAbstractType api = pg.getType("org.gravity.security.annotations.access.Api");
		final Set<TAnnotationType> allowed = new HashSet<>();
		if (api == null) {
			PublicInterfacesAccessHandler.LOGGER.warn("Warning no API specified");
		} else {
			allowed.add((TAnnotationType) api);
		}

		searchViolations(protectors, allowed, names);

		return false;
	}

	private static void searchViolations(Set<TAnnotationType> protectors, Set<TAnnotationType> allowed,
			Set<String> names) {
		for (final TAnnotationType req : protectors) {
			for (final TAnnotation annotation : req.getAnnotations()) {
				final TAnnotatable annotated = annotation.getTAnnotated();
				if (annotated instanceof TMember) {
					final TMember member = (TMember) annotated;
					PublicInterfacesAccessHandler.dfs(member, allowed, names, new HashSet<TMember>());
				}
			}
		}
	}
}