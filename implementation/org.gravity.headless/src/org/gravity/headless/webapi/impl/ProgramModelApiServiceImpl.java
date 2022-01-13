package org.gravity.headless.webapi.impl;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.text.MessageFormat;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.jar.JarInputStream;
import java.util.stream.Collectors;

import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.GravityAPI;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.eclipse.importer.DuplicateProjectNameException;
import org.gravity.eclipse.importer.ImportException;
import org.gravity.eclipse.importer.ProjectImport;
import org.gravity.eclipse.importer.gradle.GradleImport;
import org.gravity.eclipse.importer.maven.MavenImport;
import org.gravity.eclipse.io.FileUtils;
import org.gravity.eclipse.io.GitCloneException;
import org.gravity.eclipse.io.GitTools;
import org.gravity.eclipse.io.ZipUtil;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.eclipse.util.JavaProjectUtil;
import org.gravity.headless.Messages;
import org.gravity.headless.webapi.ProgramModelApi;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * GRaViTY Web API
 *
 * <p>
 * This is the web API of GRaViTY.
 *
 */
public class ProgramModelApiServiceImpl implements ProgramModelApi {

	private static final Logger LOGGER = Logger.getLogger(ProgramModelApiServiceImpl.class);

	private final File workspace = ResourcesPlugin.getWorkspace().getRoot().getLocation().toFile();

	private File cache;

	private final List<File> repositories = new LinkedList<>();
	private int maxRepositories;

	private final List<File> models = new LinkedList<>();
	private int maxModels;

	/**
	 * Get a program model
	 *
	 * Creates a program model for the given commit and repository.
	 *
	 */
	@Override
	public Response getPM4Git(final String url, final String commit) {
		final var model = getCacheFile("git", url, commit); //$NON-NLS-1$
		if (model.exists()) {
			try {
				return readModel(model);
			} catch (final IOException e) {
				// Try a new construction of a pm
			}
		}

		final var monitor = new NullProgressMonitor();
		try {
			final var root = checkout(url, commit);
			if (root == null) {
				return Response.serverError().entity(Messages.errorCloneFailed).build();
			}

			final var project = importProject(root, monitor);

			if (project == null) {
				return null;
			}
			final var pm = createModelAndSaveToCache(project, model, monitor);
			return getResponse(pm.eResource());
		} catch (final IOException e) {
			return Response.serverError().entity(e.getMessage()).build();
		}

	}

	/**
	 * Get a program model
	 *
	 * Creates a program model for the given commit and repository.
	 *
	 */
	@Override
	public Response getPM4Mvn(final String groupId, final String artifactId, final String version, final String repo) {
		if (groupId == null) {
			return Response.status(Response.Status.BAD_REQUEST).entity(Messages.errorHttpNoGroupID).build();
		}
		if (artifactId == null) {
			return Response.status(Response.Status.BAD_REQUEST).entity(Messages.errorHttpNoArtifactID).build();
		}
		if (version == null) {
			return Response.status(Response.Status.BAD_REQUEST).entity(Messages.errorHttpNoVersion).build();
		}
		final var model = getCacheFile("mvn", groupId, artifactId, version); //$NON-NLS-1$
		if (model.exists()) {
			try {
				return readModel(model);
			} catch (final IOException e) {
				// Try a new construction of a pm
			}
		}

		String domain;
		if ((repo == null) || repo.isBlank()) {
			domain = "https://repo1.maven.org/maven2"; //$NON-NLS-1$
		} else {
			domain = repo;
		}

		final var monitor = new NullProgressMonitor();
		IJavaProject project = null;
		try {
			final var name = artifactId + '-' + version;
			final var file = name + "-sources.jar"; //$NON-NLS-1$
			final var base = String.join("/", domain, groupId.replace('.', '/'), artifactId, version); //$NON-NLS-1$
			final var url = new URL(base + '/' + file);

			final var old = EclipseProjectUtil.getProjectByName(name);
			if (old.exists()) {
				old.delete(true, monitor);
			}
			final var projectFile = new File(this.workspace, name);
			if (projectFile.exists()) {
				FileUtils.recursiveDelete(projectFile);
			}
			project = JavaProjectUtil.createJavaProject(name, Collections.singleton("src"), monitor); //$NON-NLS-1$
			final var src = project.getProject().getFolder("src").getLocation().toFile(); //$NON-NLS-1$

			try (var stream = new JarInputStream(url.openStream(), true)) {
				ZipUtil.unzip(stream, src.toPath());
			}

			final var pm = createModelAndSaveToCache(project, model, monitor);
			return getResponse(pm.eResource());

		} catch (final IOException | DuplicateProjectNameException | CoreException e) {
			LOGGER.error(e);
		} finally {
			if (project != null) {
				try {
					project.getProject().delete(true, monitor);
				} catch (final CoreException e) {
					LOGGER.error(e);
				}
			}
		}
		return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(Messages.errorGravityTGG).build();
	}

	private Response readModel(final File model) throws IOException {
		try {
			return Response.ok(Files.readAllLines(model.toPath()).stream().collect(Collectors.joining())).build();
		} catch (final IOException e) {
			this.models.remove(model);
			FileUtils.recursiveDelete(model.getParentFile());
			throw e;
		}
	}

	/**
	 * Calculates a file in the cache folder with the given segment ids
	 *
	 * @param ids The ids of the segments
	 * @return A file in the cache
	 */
	private File getCacheFile(final String... ids) {
		var model = this.cache;
		for (final String id : ids) {
			model = new File(model, id);
		}
		return model;
	}

	/**
	 * Creates a response that contains the contents of the EMF resource
	 *
	 * @param resource A EMF resource
	 * @return a response message
	 */
	private Response getResponse(final Resource resource) {
		try (var stream = new ByteArrayOutputStream()) {
			resource.save(stream, null);
			return Response.ok(stream.toString()).build();
		} catch (final IOException e) {
			return Response.serverError().entity(Messages.errorPMSerialize).build();
		}
	}

	/**
	 * @param project The java project for that a model should be created
	 * @param model   The file to which the model should be written
	 * @param monitor A progress monitor
	 * @throws IOException If sending an error message failed
	 */
	private TypeGraph createModelAndSaveToCache(final IJavaProject project, final File model,
			final NullProgressMonitor monitor) throws IOException {
		freeCache(this.models, this.maxModels);
		TypeGraph pm;
		try {
			pm = GravityAPI.createProgramModel(project, true, monitor);
		} catch (final TransformationFailedException e) {
			throw new IOException(Messages.errorPM);
		}
		if (model.getParentFile().mkdirs()) {
			try (var out = new FileOutputStream(model)) {
				pm.eResource().save(out, Collections.emptyMap());
			} catch (final IOException e) {
				LOGGER.error(e);
				return pm;
			}
		}
		this.models.add(model);
		return pm;
	}

	/**
	 * Imports the project from the given location into the workspace if the build
	 * system is supported
	 *
	 * @param location The location of the project root
	 * @param monitor  A progress monitor
	 * @return The imported Eclipse Java project
	 * @throws IOException If the import failed
	 */
	private IJavaProject importProject(final File location, final NullProgressMonitor monitor) throws IOException {
		IJavaProject project;
		try {
			ProjectImport importer;
			if (new File(location, "pom.xml").exists()) { //$NON-NLS-1$
				importer = new MavenImport(location, true);
			} else if (new File(location, "build.gradle").exists()) { //$NON-NLS-1$
				importer = new GradleImport(location, true);
			} else {
				throw new IOException(Messages.errorNoSupportetBuildSystem);
			}
			project = importer.importProject(monitor);
		} catch (final ImportException e) {
			throw new IOException(Messages.errorImportFailed);
		}
		return project;
	}

	/**
	 * Clones a git repository and checks out a specific commit
	 *
	 * @param exchange The http exchange for sending error messages
	 * @param url      The url of the repository
	 * @param commit   The commit ID to checkout
	 * @return The location to which the repository has been cloned
	 * @throws IOException If no error response could be sent
	 */
	private File checkout(final String url, final String commit) throws IOException {
		freeCache(this.repositories, this.maxRepositories);
		try (var git = new GitTools(url, this.workspace, true, true)) {
			if (!git.changeVersion(commit)) {
				throw new IOException(MessageFormat.format(Messages.errorCannotCheckoutCommit, commit));
			}
			final var location = git.getRepositoryLocation();
			this.repositories.add(location);
			return location;
		} catch (final GitCloneException e) {
			throw new IOException(Messages.errorClone);
		}
	}

	/**
	 * Deletes elements in the cache exceeding the given maximum
	 *
	 * @param elements The elements currently contained in the cache
	 * @param max The allowed maximum size of the cache
	 * @throws IOException If cache space cannot be freed
	 */
	private void freeCache(final List<File> elements, final int max) throws IOException {
		if ((max > 0) && (elements.size() >= max)) {
			final var delete = elements.remove(0);
			var next = delete;
			do {
				final var parent = next.getParentFile();
				if (!next.delete()) {
					throw new IOException(Messages.errorFreeCache);
				}
				next = parent;
			} while ((!next.equals(this.cache)) && (next.list().length == 0));
		}
	}

	/**
	 * Sets the maximum number of models that should be cached.
	 *
	 * @param maxModels The maximum number of models
	 * @throws IOException If the cache cannot be reduced to the given maximum
	 */
	public void setMaxModels(final int maxModels) throws IOException {
		this.maxModels = maxModels;
		freeCache(this.models, this.maxModels);
	}

	/**
	 * Sets the maximum number of repositories that should be cached
	 *
	 * @param maxRepositories The maximum number of repositories
	 * @throws IOException If the cache cannot be reduced to the given maximum
	 */
	public void setMaxRepositories(final int maxRepositories) throws IOException {
		this.maxRepositories = maxRepositories;
		freeCache(this.repositories, this.maxRepositories);
	}

	/**
	 * Sets the cache to the given location. If a location was set before, the
	 * cached models will not be moved to the new location and the old cache will
	 * not be deleted.
	 *
	 * @param cache The cache location
	 */
	public void setCache(final File cache) {
		this.cache = cache;
	}
}
