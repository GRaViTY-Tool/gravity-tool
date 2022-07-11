package org.gravity.eclipse.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.gravity.eclipse.io.FileUtils;
import org.gravity.eclipse.io.GitCloneException;
import org.gravity.eclipse.io.GitTools;
import org.junit.Test;

public class GitTest {

	private static final String REPO = "https://github.com/GRaViTY-Tool/sample-maven-project.git";
	private static final String COMMIT1 = "100f5c6509d4087a0719f9b8c7a9d7e184db8a8a";

	@Test
	public void cloneRepositoryAndCheckoutCommit() throws GitCloneException, IOException {
		try(final var git = new GitTools(REPO, FileUtils.createTempDirectory("git-test").toFile(), true, true)){
			assertTrue(git.getRepositoryLocation().listFiles().length > 0);
			assertTrue(git.changeVersion(COMMIT1));
			assertEquals(4, git.getRepositoryLocation().listFiles().length);
		}
	}
	@Test
	public void cloneRepositoryAndCheckoutInvalidCommit() throws GitCloneException, IOException {
		try(final var git = new GitTools(REPO, FileUtils.createTempDirectory("git-test").toFile(), true, true)){
			assertTrue(git.getRepositoryLocation().listFiles().length > 0);
			assertFalse(git.changeVersion("ABCD"));
		}
	}

	@Test
	public void cloneRepositoryAndOverwrite() throws GitCloneException, IOException {
		final var destination = FileUtils.createTempDirectory("git-test").toFile();
		try(final var git = new GitTools(REPO, destination, true, true)){
			assertTrue(git.getRepositoryLocation().listFiles().length > 0);
		}
		try(final var git = new GitTools(REPO, destination, true, true)){
			assertTrue(git.getRepositoryLocation().listFiles().length > 0);
		}
	}

	@Test(expected = GitCloneException.class)
	public void cloneNonExistentRepository() throws GitCloneException, IOException {
		final var destination = FileUtils.createTempDirectory("git-test").toFile();
		try(final var git = new GitTools("git@dummy.abcd/repo.git", destination, true, true)){
			// This shouldn't work
		}
	}
}
