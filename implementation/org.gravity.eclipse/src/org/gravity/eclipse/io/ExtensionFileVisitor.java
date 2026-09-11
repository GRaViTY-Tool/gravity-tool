package org.gravity.eclipse.io;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;

/**
 * A visitor collecting all classes with the given file extension
 *
 * @author speldszus
 *
 */
public final class ExtensionFileVisitor extends SimpleFileVisitor<Path> implements IResourceVisitor {

	private final Collection<String> fileExtensions;
	private final List<Path> files;

	/**
	 * Creates a new file visitor collecting files with one of the given file
	 * extensions
	 *
	 * @param fileExtensions The extensions of the files
	 */
	public ExtensionFileVisitor(final Collection<String> fileExtensions) {
		this.fileExtensions = new ArrayList<>(fileExtensions.size());
		for (final String f : fileExtensions) {
			this.fileExtensions.add(this.addPrefix(f));
		}
		this.files = new LinkedList<>();
	}

	/**
	 * Creates a new file visitor collecting files with a given file extensions
	 *
	 * @param fileExtensions The extensions of the files
	 */
	public ExtensionFileVisitor(final String... fileExtensions) {
		this.fileExtensions = new ArrayList<>(fileExtensions.length);
		for (final String f : fileExtensions) {
			this.fileExtensions.add(this.addPrefix(f));
		}
		this.files = new LinkedList<>();
	}

	/**
	 * Creates a new file visitor collecting files with a given file extension
	 *
	 * @param fileExtension The extension of the files
	 */
	public ExtensionFileVisitor(final String fileExtension) {
		this.fileExtensions = Arrays.asList(this.addPrefix(fileExtension));
		this.files = new LinkedList<>();
	}

	/**
	 * Adds a dot as prefix if the extension hasn't it already
	 *
	 * @param fileExtension The file extension
	 * @return The file extension with prefix
	 */
	private String addPrefix(final String fileExtension) {
		if (fileExtension.charAt(0) == '.') {
			return fileExtension;
		}
		return "." + fileExtension;
	}

	@Override
	public FileVisitResult visitFile(final Path file, final BasicFileAttributes attrs) throws IOException {
		if (attrs.isRegularFile()) {
			this.checkAndAdd(file);
		}
		return super.visitFile(file, attrs);
	}

	@Override
	public boolean visit(final IResource resource) throws CoreException {
		if (resource.getType() == IResource.FILE) {
			final var path = resource.getLocation().toFile().toPath();
			this.checkAndAdd(path);
		}
		return true;
	}

	public void visit(final Path path) throws IOException {
		Files.walkFileTree(path, this);
	}

	/**
	 * Checks if the file has the searched extension and adds it to the list of
	 * matching files if yes.
	 *
	 * @param file The file
	 */
	private void checkAndAdd(final Path file) {
		final var name = file.toString();
		for (final String extension : this.fileExtensions) {
			if (name.endsWith(extension)) {
				this.files.add(file);
				return;
			}
		}
	}

	/**
	 * Returns the found files with the given file extension
	 *
	 * @return A collection of files
	 */
	public List<Path> getFiles() {
		return this.files;
	}
}