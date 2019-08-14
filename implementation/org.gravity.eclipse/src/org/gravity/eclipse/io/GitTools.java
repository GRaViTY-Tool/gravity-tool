package org.gravity.eclipse.io;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.errors.NoWorkTreeException;

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

	/**
	 * Creates a new client and clones the repository
	 * 
	 * @param url The url of a public GIT repository
	 * @param destination The destination to which the repository should be cloned
	 * @throws GitCloneException If cloning the repository failed
	 */
	public GitTools(String url, File destination)
			throws GitCloneException {
		this(url, destination, false, true);
	}

	/**
	 * Creates a new client and clones the repository
	 * 
	 * @param url The url of a public GIT repository
	 * @param destination The destination to which the repository should be cloned
	 * @param replace if existing content at the destination should be replaced
	 * @param submodules if submodules should be cloned
	 * @throws GitCloneException If cloning the repository failed
	 */
	public GitTools(String url, File destination, boolean replace, boolean submodules) throws GitCloneException {
		if (!destination.exists()) {
			destination.mkdirs();
		}
		String productName = url.substring(url.lastIndexOf('/') + 1, url.length() - 4);
		File repository = new File(destination, productName);
		if (repository.exists()) {
			if (replace) {
				if (!FileUtils.recursiveDelete(repository)) {
					throw new GitCloneException("There is already a repository with the name \"" + productName
							+ "\" which couldn't be deleted.");
				}
			} else {
				throw new GitCloneException("There is already a repository with the name \"" + productName + "\".");
			}
		}
		try {
			git = Git.cloneRepository()
					.setDirectory(repository)
					.setURI(url)
					.setCloneSubmodules(submodules)
					.call();
		} catch (GitAPIException e) {
			LOGGER.error(e.getMessage(), e);
			throw new GitCloneException(e);
		}
	}

	/**
	 * Checks out the specified version of the repository
	 * 
	 * @param id The id of the repository
	 * @return true, iff the version change was successful
	 */
	public boolean changeVersion(String id) {
		try {
			git.clean().setForce(true).setCleanDirectories(true).call();
			git.revert().call();
			git.checkout().setCreateBranch(false).setName(id).call();
		} catch (NoWorkTreeException | GitAPIException e) {
			LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
			return false;
		}
		return true;
	}

	@Override
	public void close() throws IOException {
		git.getRepository().close();
	}
}
