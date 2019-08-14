package org.gravity.eclipse.io;

import java.io.IOException;
import java.nio.file.FileVisitResult;
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
	 * Creates a new file visitor collecting files with one of the given file extensions
	 * 
	 * @param fileExtensions The extensions of the files
	 */
	public ExtensionFileVisitor(Collection<String> fileExtensions) {
		this.fileExtensions = new ArrayList<>(fileExtensions.size());
		for(String f : fileExtensions) {
			this.fileExtensions.add(addPrefix(f));
		}
		this.files = new LinkedList<Path>();
	}

	/**
	 * Creates a new file visitor collecting files with a given file extensions
	 * 
	 * @param fileExtensions The extensions of the files
	 */
	public ExtensionFileVisitor(String... fileExtensions) {
		this.fileExtensions = new ArrayList<>(fileExtensions.length);
		for(String f : fileExtensions) {
			this.fileExtensions.add(addPrefix(f));
		}
		this.files = new LinkedList<Path>();
	}
	
	/**
	 * Creates a new file visitor collecting files with a given file extension
	 * 
	 * @param fileExtension The extension of the files
	 */
	public ExtensionFileVisitor(String fileExtension) {
		this.fileExtensions = Arrays.asList(addPrefix(fileExtension));
		this.files = new LinkedList<Path>();
	}

	/**
	 * Adds a dot as prefix if the extension hasn't it already
	 * 
	 * @param fileExtension The file extension
	 * @return The file extension with prefix
	 */
	private String addPrefix(String fileExtension) {
		String tmpExtension;
		if(fileExtension.startsWith(".")) {
			tmpExtension = fileExtension;
		}
		else {
			tmpExtension = "." + fileExtension;
		}
		return tmpExtension;
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		if (attrs.isRegularFile()) {
			checkAndAdd(file);
		}
		return super.visitFile(file, attrs);
	}

	@Override
	public boolean visit(IResource resource) throws CoreException {
		if(resource.getType() == IResource.FILE) {
			Path path = resource.getLocation().toFile().toPath();
			checkAndAdd(path);
		}
		return true;
	}

	/**
	 * Checks if the file has the searched extension and adds it to the list of matching files if yes.
	 * 
	 * @param file The file
	 */
	private void checkAndAdd(Path file) {
		String name = file.toString();
		for(String extension : fileExtensions) {
			if (name.endsWith(extension)) {
				files.add(file);
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