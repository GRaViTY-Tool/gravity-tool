package org.gravity.eclipse.io;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.ResetCommand.ResetType;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.JGitInternalException;
import org.eclipse.jgit.errors.NoWorkTreeException;
import org.eclipse.jgit.transport.SshSessionFactory;
import org.eclipse.jgit.transport.sshd.SshdSessionFactory;

/**
 * Functionalities to easily clone GIT repositories and change versions
 *
 * @author speldszus
 *
 */
public class GitTools implements Closeable {

	/**
	 * The logger of this class
	 */
	public static final Logger LOGGER = Logger.getLogger(GitTools.class);

	/**
	 * An internal instance of the JGit client
	 */
	private Git git;

	private final File repository;

	/**
	 * Creates a new client and clones the repository
	 *
	 * @param url         The url of a public GIT repository
	 * @param destination The destination to which the repository should be cloned
	 * @param replace     if existing content at the destination should be replaced
	 * @param submodules  if submodules should be cloned
	 * @throws GitCloneException If cloning the repository failed
	 */
	public GitTools(final String url, final File destination, final boolean replace, final boolean submodules)
			throws GitCloneException {
		checkSSHSessionFactory();
		var end = url.length();
		if (url.endsWith(".git")) {
			end -= 4;
		}
		final var productName = url.substring(url.lastIndexOf('/') + 1, end);
		if (!destination.exists()) {
			destination.mkdirs();
		}
		this.repository = prepareDestination(destination, productName, replace);
		try {
			this.git = Git.cloneRepository().setDirectory(getRepositoryLocation()).setURI(url)
					.setCloneSubmodules(submodules).call();
		} catch (final GitAPIException e) {
			LOGGER.error(e.getMessage(), e);
			throw new GitCloneException(e);
		}
	}

	/**
	 * Prepares the repository on the local disk for checkout
	 *
	 * @param destination The folder to which the repository should be cloned
	 * @param name        The name of the repository on the local disk
	 * @param replace     Whether an existing repository should be replaced
	 * @return The location to which a repository can be cloned
	 * @throws GitCloneException If the repository exists already but should not be
	 *                           replaced
	 */
	private static File prepareDestination(final File destination, final String name, final boolean replace)
			throws GitCloneException {
		final var repository = new File(destination, name);
		if (repository.exists()) {
			if (replace) {
				if (!FileUtils.recursiveDelete(repository)) {
					throw new GitCloneException(
							"There is already a repository with the name \"" + name + "\" which couldn't be deleted.");
				}
			} else {
				throw new GitCloneException("There is already a repository with the name \"" + name + "\".");
			}
		}
		return repository;
	}

	/**
	 * Checks if a SSH Session Factory exists and creates one otherwise
	 */
	private static void checkSSHSessionFactory() {
		final var factory = SshSessionFactory.getInstance();
		if (factory == null) {
			SshSessionFactory.setInstance(new SshdSessionFactory());
		}
	}

	/**
	 * Checks out the specified version of the repository
	 *
	 * @param id The id of the commit
	 * @return true, iff the version change was successful
	 */
	public boolean changeVersion(final String id) {
		try {
			final var ref = this.git.reset().setMode(ResetType.HARD).setRef(id).call();
			if ((ref != null)) {
				final var object = ref.getObjectId();
				return (object != null) && object.getName().startsWith(id);
			}
		} catch (NoWorkTreeException | GitAPIException | JGitInternalException e) {
			LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
		}
		return false;
	}

	@Override
	public void close() throws IOException {
		this.git.getRepository().close();
	}

	/**
	 * Gets the location of the repository
	 *
	 * @return The folder containing the repository
	 */
	public File getRepositoryLocation() {
		return this.repository;
	}
}
