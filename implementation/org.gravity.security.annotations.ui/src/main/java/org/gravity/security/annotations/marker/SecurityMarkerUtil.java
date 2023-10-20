package org.gravity.security.annotations.marker;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IMember;
import org.gravity.eclipse.util.JavaASTUtil;

public class SecurityMarkerUtil {
	
	private static final String MARKER_SOURCE = "org.gravity.security";
	private static final String MARKER_ATTR_ANALYZED = "org.gravity.security.analyzedMember";
	
	/**
	 * The logger of this class
	 */
	private static final Logger LOGGER = Logger.getLogger(SecurityMarkerUtil.class);
	
	private SecurityMarkerUtil() {
		// This class should not be instantiated
	}


	public static IMarker createErrorMarker(IMember member, String message, String... relevantMember) {
		try {
			IResource resource = member.getResource();
			int line = JavaASTUtil.getLine(member);

			return createErrorMarker(resource, line, message, relevantMember);
		} catch (CoreException e) {
			throw new IllegalStateException(e);
		}
	}

	public static IMarker createErrorMarker(IResource resource, int line, String message, String... relevantMember)
			throws CoreException {
		IMarker m = resource.createMarker(IMarker.PROBLEM);
		m.setAttribute(IMarker.LINE_NUMBER, line);
		m.setAttribute(IMarker.MESSAGE, message);
		m.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
		m.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
		m.setAttribute(IMarker.SOURCE_ID, MARKER_SOURCE);
		m.setAttribute(MARKER_ATTR_ANALYZED, String.join(";", relevantMember));
		return m;
	}

	public static void createWarningMarker(IAnnotation annotation, String message) {
		try {
			IResource resource = annotation.getResource();
			int line = JavaASTUtil.getLine(annotation);

			IMarker m = resource.createMarker(IMarker.PROBLEM);
			m.setAttribute(IMarker.LINE_NUMBER, line);
			m.setAttribute(IMarker.MESSAGE, message);
			m.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_NORMAL);
			m.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
			m.setAttribute(IMarker.SOURCE_ID, MARKER_SOURCE);
		} catch (CoreException e) {
			throw new IllegalStateException(e);
		}
	}
	
	public static void deleteOldMarkers(final ICompilationUnit cu) {
		try {
			for (IMarker m : cu.getResource().findMarkers(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE)) {
				if (MARKER_SOURCE.equals(m.getAttribute(IMarker.SOURCE_ID))) {
					m.delete();
				}
			}
		} catch (CoreException e) {
			LOGGER.error(e);
		}
	}

	public static void deleteOldMarkers(final IResource res, String analyzedMember) {
		if (res != null)
			try {
				for (IMarker m : res.findMarkers(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE)) {
					if (MARKER_SOURCE.equals(m.getAttribute(IMarker.SOURCE_ID))
							&& m.getAttribute(MARKER_ATTR_ANALYZED, "").contains(analyzedMember)) {
						m.delete();
					}
				}
			} catch (CoreException e) {
				LOGGER.error(e);
			}
	}

	
}
