package org.gravity.eclipse.io;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.zip.ZipInputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * Helpful functionality when working with zip archives
 * 
 * @author speldszus
 *
 */
public class ZipUtil {


	/**
	 * Extracts a zip stream to the given location
	 * 
	 * @param stream The zip stream
	 * @param destination The destination
	 * @param monitor A progress monitor
	 * @return The destination
	 * @throws CoreException @see org.eclipse.core.resources.IFile.create(InputStream source, boolean force, IProgressMonitor monitor)
	 */
	public static IFile extractZipEntry(ZipInputStream stream, IFile destination, IProgressMonitor monitor)
			throws CoreException {
		destination.create(new BufferedInputStream(stream) {
			@Override
			public void close() throws IOException {
				// disable close
			}
		}, true, monitor);
		return destination;
	}
}
