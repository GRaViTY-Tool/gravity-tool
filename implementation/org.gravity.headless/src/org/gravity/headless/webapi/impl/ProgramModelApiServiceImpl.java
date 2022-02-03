package org.gravity.headless.webapi.impl;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.jar.JarInputStream;
import java.util.stream.Collectors;

import javax.ws.rs.core.Response;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggingEvent;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.GravityAPI;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.eclipse.importer.DuplicateProjectNameException;
import org.gravity.eclipse.importer.ImportException;
import org.gravity.eclipse.importer.ProjectImport;
import org.gravity.eclipse.importer.gradle.GradleImport;
import org.gravity.eclipse.importer.maven.MavenImport;
import org.gravity.eclipse.io.ExtensionFileVisitor;
import org.gravity.eclipse.io.FileUtils;
import org.gravity.eclipse.io.GitCloneException;
import org.gravity.eclipse.io.GitTools;
import org.gravity.eclipse.io.ZipUtil;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.eclipse.util.JavaProjectUtil;
import org.gravity.headless.HeadlessActivator;
import org.gravity.headless.Messages;
import org.gravity.headless.config.LoggingConfiguration;
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
	private static final String CACHE_LOCATION_MVN = "mvn";
	private static final String CACHE_LOCATION_GIT = "git";
	private static final String GRAVITY_LOCK = ".gravity.lock";
	private static final long TIMEOUT_LOCK_MS = 60L * 1000;

	private static final Logger LOGGER = Logger.getLogger(ProgramModelApiServiceImpl.class);
	private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd:HH-mm-ss");

	private final File workspace = ResourcesPlugin.getWorkspace().getRoot().getLocation().toFile();

	private File cache;
	private LoggingConfiguration log;

	private final List<File> repositories = new LinkedList<>();
	private int maxRepositories;

	private final List<File> models = new LinkedList<>();
	private int maxModels;
	private boolean save;
	private FileAppender fa;

	/**
	 * Get a program model
	 *
	 * Creates a program model for the given commit and repository.
	 */
	@Override
	public Response getPM4Git(final String url, final String commit) {
		if (url == null) {
			return Response.status(Response.Status.BAD_REQUEST).entity(Messages.errorHttpNoGitURL).build();
		}
		if (commit == null) {
			return Response.status(Response.Status.BAD_REQUEST).entity(Messages.errorHttpNoCommitID).build();
		}

		if ((this.log == null) || !this.log.loggingEnabled()) {
			return internalGetPM4Git(url, commit);
		}

		final var id = url + ':' + commit;
		final var fa = initLogging(id);

		LOGGER.info("### Request for: " + id);
		try {
			return internalGetPM4Git(url, commit);
		} finally {
			clearLogging(fa);
		}
	}

	private Response internalGetPM4Git(final String url, final String commit) {
		final var model = getCacheFile(CACHE_LOCATION_GIT, url, commit, "pm.xmi");

		final var response = readModelOrLock(model);
		if (response != null) {
			return response;
		}

		final var monitor = new NullProgressMonitor();
		IJavaProject project = null;
		try {
			final var root = checkout(url, commit);
			if (root == null) {
				return Response.serverError().entity(Messages.errorCloneFailed).build();
			}

			project = importProject(root, monitor);
			if (project == null) {
				return Response.serverError().build();
			}

			final var pm = createModelAndSaveToCache(project, model, monitor);
			return getResponse(pm.eResource());
		} catch (final IOException e) {
			exportProject(project);
			return Response.serverError().entity(e.getMessage()).build();
		} finally {
			cleanup(model, project, monitor);
		}
	}

	/**
	 * Get a program model
	 *
	 * Creates a program model for the given commit and repository.
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

		if ((this.log == null) || !this.log.loggingEnabled()) {
			return internatlGetPM4Mvn(groupId, artifactId, version, repo);
		}
		final var id = groupId + ':' + artifactId + ':' + version;

		this.fa = initLogging(id);

		LOGGER.info("### Request for: " + id);
		try {
			return internatlGetPM4Mvn(groupId, artifactId, version, repo);
		} finally {
			clearLogging(this.fa);
		}
	}

	private Response internatlGetPM4Mvn(final String groupId, final String artifactId, final String version,
			final String repo) {
		final var model = getCacheFile(CACHE_LOCATION_MVN, groupId, artifactId, version, "pm.xmi");
		final var response = readModelOrLock(model);
		if (response != null) {
			return response;
		}

		final var domain = getMvnRepoDomain(repo);

		final var monitor = new NullProgressMonitor();
		IJavaProject project = null;
		try {
			final var name = artifactId + '-' + version;
			final var file = name + "-sources.jar"; //$NON-NLS-1$
			final var base = String.join("/", domain, groupId.replace('.', '/'), artifactId, version); //$NON-NLS-1$
			final var url = new URL(base + '/' + file);

			project = forceCreateJavaProject(name, monitor);
			if (project == null) {
				return Response.serverError().build();
			}
			final var src = project.getProject().getFolder("src").getLocation().toFile(); //$NON-NLS-1$
			try (var stream = new JarInputStream(url.openStream(), true)) {
				ZipUtil.unzip(stream, src.toPath());
			}

			final var pm = createModelAndSaveToCache(project, model, monitor);
			return getResponse(pm.eResource());

		} catch (final IOException | CoreException e) {
			exportProject(project);
			return Response.serverError().entity(Messages.errorGravityTGG).build();
		} finally {
			cleanup(model, project, monitor);
		}
	}

	private void exportProject(final IJavaProject project) {
		if(this.save && (project != null) && project.exists()) {
			final var zip = new File(new File(this.fa.getFile()).getParent(), project.getProject().getName()+".zip");
			try {
				ZipUtil.zipProject(project, zip);
			} catch (final IOException e) {
				LOGGER.error(e);
			}
		}
	}

	private void clearLogging(final FileAppender appender) {
		Logger.getRootLogger().removeAppender(appender);
	}

	private FileAppender initLogging(final String id) {
		final var thread = Thread.currentThread().getId();
		final var fa = new FileAppender();
		fa.setName("FileLogger-" + id);
		fa.setFile(new File(new File(this.log.getLogDestination(), id), DATE_FORMAT.format(new Date()) + ".log").getAbsolutePath());
		fa.setLayout(new PatternLayout("%d %-5p [%c{1}] %m%n"));
		fa.setThreshold(Level.DEBUG);
		fa.addFilter(new Filter() {
			@Override
			public int decide(final LoggingEvent event) {
				if (thread == Thread.currentThread().getId()) {
					return ACCEPT;
				} else {
					return DENY;
				}
			}
		});
		fa.setAppend(true);
		fa.activateOptions();

		Logger.getRootLogger().addAppender(fa);
		return fa;
	}

	/**
	 * Creates a new Java project with the given name. Any existing project with the
	 * same name will be deleted.
	 *
	 * @param name    The name of the new Java project
	 * @param monitor A progress monitor
	 * @return The new Java project
	 * @throws CoreException If the creation of the Java project fails
	 */
	private IJavaProject forceCreateJavaProject(final String name, final NullProgressMonitor monitor)
			throws CoreException {
		IJavaProject project = null;
		final var old = EclipseProjectUtil.getProjectByName(name);
		if (old.exists()) {
			old.delete(true, monitor);
		}
		final var projectFile = new File(this.workspace, name);
		if (projectFile.exists()) {
			FileUtils.recursiveDelete(projectFile);
		}
		try {
			project = JavaProjectUtil.createJavaProject(name, Collections.singleton("src"), monitor); //$NON-NLS-1$
		} catch (final DuplicateProjectNameException e) {
			final var message = "Although project \"" + name + "\"has been deleted, it still exists in the workspace: "
					+ this.workspace.getAbsolutePath();
			LOGGER.error(message);
			throw new CoreException(new Status(IStatus.ERROR, HeadlessActivator.PLUGIN_ID, message));
		}
		return project;
	}

	/**
	 * Deletes the lock and the project from the workspace
	 *
	 * @param model   The location of the model that has been created in the cache
	 * @param project The project in the workspace
	 * @param monitor A progress monitor
	 */
	private void cleanup(final File model, final IJavaProject project, final NullProgressMonitor monitor) {
		if (project != null) {
			try {
				project.getProject().delete(true, monitor);
			} catch (final CoreException e) {
				LOGGER.error(e);
			}
		}
		try {
			deleteLock(model);
		} catch (final IOException e) {
			LOGGER.error(e.getMessage(), e);
		}
	}

	private String getMvnRepoDomain(final String repo) {
		String domain;
		if ((repo == null) || repo.isBlank()) {
			domain = "https://repo1.maven.org/maven2"; //$NON-NLS-1$
		} else {
			domain = repo;
		}
		return domain;
	}

	/**
	 * Waits id the location of the model has been locked until the lock has been
	 * removed
	 *
	 * @param model   The model to be monitored
	 * @param timeout Timeout in ms for waiting for the lock being released. Non
	 *                positive values are rated as no timeout.
	 * @throws TimeoutException If the timeout in case of a locked model exceeded
	 */
	private void waitIfLocked(final File model, final long timeout) throws TimeoutException {
		final var lock = new File(model.getParentFile(), GRAVITY_LOCK);
		final var start = System.currentTimeMillis();
		while (lock.exists() && !model.exists()) {
			if ((timeout >= 0) && ((System.currentTimeMillis() - start) > timeout)) {
				throw new TimeoutException();
			}
			try {
				Thread.sleep(500);
			} catch (final InterruptedException e) {
				LOGGER.error(e.getMessage(), e);
				Thread.currentThread().interrupt();
			}
		}
	}

	/**
	 * Deletes the lock file for the model
	 *
	 * @param model The model that had been locked
	 * @return true, iff the lock has been deleted
	 * @throws IOException If the model is file does not contain a valid path
	 */
	private boolean deleteLock(final File model) throws IOException {
		return Files.deleteIfExists(new File(model.getParentFile(), GRAVITY_LOCK).toPath());
	}

	/**
	 * Creates a lock in the model cache
	 *
	 * @param model The model to be created
	 * @return true, iff the lock has been created
	 */
	private boolean createLock(final File model) {
		final var lock = new File(model.getParentFile(), GRAVITY_LOCK);
		try {
			if (lock.getParentFile().mkdirs() && lock.createNewFile()) {
				return true;
			}
		} catch (final IOException e) {
			LOGGER.error(e.getMessage(), e);
		}
		return false;
	}

	/**
	 * Reads the model from the file system or locks the location if the model is
	 * not present
	 *
	 * @param model The model to read
	 * @return A response message if the model has been read or a timeout occurred,
	 *         otherwise <code>null</code>
	 */
	private Response readModelOrLock(final File model) {
		if (model.exists()) {
			try {
				return readModel(model);
			} catch (final IOException e) {
				// Try a new construction of a pm
			}
		}
		try {
			waitIfLocked(model, TIMEOUT_LOCK_MS);
		} catch (final TimeoutException e) {
			return Response.status(Response.Status.REQUEST_TIMEOUT).build();
		}

		if (model.exists()) {
			try {
				return readModel(model);
			} catch (final IOException e) {
				// Try a new construction of a pm
			}
		}
		createLock(model);
		return null;
	}

	/**
	 * Reads the model from the given file
	 *
	 * @param model
	 * @return
	 * @throws IOException
	 */
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
	 * Calculates a folder in the cache folder with the given segment ids
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
			pm = GravityAPI.createProgramModel(project, monitor);
		} catch (final TransformationFailedException e) {
			throw new IOException(Messages.errorPM);
		}
		final var folder = model.getParentFile();
		if (folder.exists() || folder.mkdirs()) {
			try (var out = new FileOutputStream(model)) {
				pm.eResource().save(out, Collections.emptyMap());
			} catch (final IOException e) {
				LOGGER.error(e);
				return pm;
			}
		} else {
			LOGGER.error("Cannot create cache location: " + folder);
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
	 * @param max      The allowed maximum size of the cache
	 * @throws IOException If cache space cannot be freed
	 */
	private void freeCache(final List<File> elements, final int max) throws IOException {
		if ((max > 0) && (elements.size() >= max)) {
			final var delete = elements.remove(0);
			var next = delete;
			do {
				final var parent = next.getParentFile();
				try {
					if (!Files.deleteIfExists(next.toPath())) {
						throw new IOException(Messages.errorFreeCache);
					}
				} finally {
					elements.add(0, delete);
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
	 * @throws IOException If the cache cannot be initialized
	 */
	public void setCache(final File cache) throws IOException {
		this.cache = cache;
		if (!this.cache.exists()) {
			this.cache.mkdirs();
		}
		final var visitor = new ExtensionFileVisitor("xmi");
		Files.walkFileTree(cache.toPath(), visitor);
		this.models.addAll(visitor.getFiles().stream().map(Path::toFile).collect(Collectors.toList()));
	}

	/**
	 * Enables the logging to the given folder or disables logging if
	 * <code>null</code> is given
	 *
	 * @param log The location to which log files should be written
	 * @param save Wheter failed projects should be copied to the logs
	 */
	public void setLogConfiguration(final LoggingConfiguration configuration) {
		this.log = configuration;
	}
}
