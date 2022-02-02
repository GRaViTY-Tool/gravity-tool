package org.gravity.eclipse.util;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.gravity.eclipse.GravityActivator;

/**
 * A visitor for visiting all Java files and checking if their time stamp is older than the given one.
 *
 * @author speldszus
 *
 */
public class UptodateVisitor implements IResourceVisitor {

	private static final Logger LOGGER = Logger.getLogger(UptodateVisitor.class);

	/**
	 * Checks if the time stamp of the file is not older than the time stamp of all
	 * Java files
	 *
	 * @param file The file
	 * @return true, if the file is up to date
	 */
	public static boolean isUptoDate(final IFile file) {
		final var timestamp = file.getLocalTimeStamp();
		final var visitor = new UptodateVisitor(timestamp);
		try {
			file.getProject().accept(visitor);
		} catch (final CoreException e) {
			LOGGER.error(e);
			return false;
		}
		return visitor.isUptoDate();
	}

	private final long timestamp;
	private boolean upToDate = true;

	/**
	 * Creates a new visitor
	 *
	 * @param timestamp The time stamp to check against
	 */
	private UptodateVisitor(final long timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public boolean visit(final IResource resource) throws CoreException {
		if (!this.upToDate) {
			return false;
		}
		if (resource.getType() != IResource.FILE) {
			return true;
		}
		if(GravityActivator.FILE_EXTENSION_JAVA.equals(((IFile) resource).getFileExtension())) {
			final var fileTimestamp = resource.getLocalTimeStamp();
			if(this.timestamp < fileTimestamp) {
				this.upToDate = false;
			}
		}
		return true;
	}
	/**
	 * The result of the check
	 *
	 * @return true, if no Java file is newer than the time stamp
	 */
	public boolean isUptoDate() {
		return this.upToDate;
	}
}

