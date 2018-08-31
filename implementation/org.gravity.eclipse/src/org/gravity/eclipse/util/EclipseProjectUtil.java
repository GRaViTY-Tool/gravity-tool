package org.gravity.eclipse.util;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * This class provides frequently used functionalities when working with eclipse projects
 * 
 * @author speldszus
 *
 */
public class EclipseProjectUtil {
	
	private static final Logger LOGGER = Logger.getLogger(EclipseProjectUtil.class);

	/**
	 * Creates a copy of a eclipse project with the given name
	 * 
	 * @param project The project to copy
	 * @param nameOfCopy The name of the copy
	 * @return The copy
	 */
	public static IProject copyProject(IProject project, String nameOfCopy) {
		IProject tmp = getProjectByName(nameOfCopy);
		if (tmp != null && tmp.exists()) {
			try {
				tmp.delete(true, null);
			} catch (CoreException e) {
				LOGGER.log(Level.ERROR, e);
				return null;
			}
		}
		try {
			project.copy(new org.eclipse.core.runtime.Path(nameOfCopy), true, null); // $NON-NLS-1$
		} catch (CoreException e2) {
			e2.printStackTrace();
			return null;
		}
		return tmp;
	}

	/**
	 * Returns the eclipse project with the given name from the current workspace
	 * 
	 * @param name The given name
	 * @return The eclipse project
	 */
	public static IProject getProjectByName(String name) {
		return ResourcesPlugin.getWorkspace().getRoot().getProject(name);
	}
	
	/**
	 * Adds the given nature to an eclipse project if it hasn't this nature already
	 * 
	 * @param project The eclispe project
	 * @param nature The nature id to add
	 * @param monitor A progress monitor
	 * @throws CoreException @see org.eclipse.core.resources.IProject.setDescription(IProjectDescription description, IProgressMonitor monitor)
	 */
	public static void addNature(IProject project, String nature, IProgressMonitor monitor) throws CoreException {
		IProjectDescription description = project.getDescription();
		String[] oldNatures = description.getNatureIds();
		for(String o : oldNatures) {
			if(o.equals(nature)) {
				return;
			}
		}
		String[] newNatures = new String[oldNatures.length + 1];
		newNatures[0] = nature;
		System.arraycopy(oldNatures, 0, newNatures, 1, oldNatures.length);
		description.setNatureIds(newNatures);
		project.setDescription(description, monitor);
	}
}
