package org.gravity.security.annotations;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.util.EclipseProjectUtil;

/**
 * The Activator of the org.gravity.security.annotations plugin
 *
 * @author speldszus
 *
 */
public class AnnotationsActivator extends Plugin {

	/**
	 * The id of this plugin
	 */
	public static final String PLUGIN_ID = "org.gravity.security.annotations.pm";

}
