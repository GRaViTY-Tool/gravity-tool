package org.gravity.eclipse.io;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Collection;
import java.util.LinkedList;

/**
 * A visitor collecting all classes with the given file extension
 * 
 * @author speldszus
 *
 */
public final class ExtensionFileVisitor extends SimpleFileVisitor<Path> {
	
	private final String fileExtension;
	private final Collection<Path> files;
	
	/**
	 * Creates a new file visitor collecting files with a given file extension
	 * 
	 * @param fielExtension The extension of the files
	 */
	public ExtensionFileVisitor(String fielExtension) {
		this.fileExtension = fielExtension;
		this.files = new LinkedList<Path>();
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		if (attrs.isRegularFile() && file.getFileName().toString().endsWith(fileExtension)) {
			files.add(file);
		}
		return super.visitFile(file, attrs);
	}
	
	/**
	 * Returns the found files with the given file extension 
	 * 
	 * @return A collection of files
	 */
	public Collection<Path> getFiles(){
		return this.files;
	}
}