package org.gravity.security.annotations.marker;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaModelMarker;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.internal.corext.callhierarchy.CallLocation;
import org.eclipse.jdt.internal.corext.callhierarchy.MethodCall;
import org.gravity.eclipse.util.JavaASTUtil;
import org.gravity.security.annotations.ui.SecurityAnnotationsQuickFixProcessor;

@SuppressWarnings("restriction")
public class SecurityMarkerUtil {

	public static final String MARKER_SOURCE = "org.gravity.security";
	public static final String MARKER_ATTR_ANALYZED = "org.gravity.security.marker.analyzedMember";
	public static final String MARKER_ATTR_SECURITY_REQUIREMENT = "org.gravity.security.marker.secureDependencyRequirement";
	
	/** Values for Integrity and Secrecy violations in the Secure Dependency Requirement Attribute in custom IMarkers*/
	public static final String REQUIREMENT_INTEGRITY = "Integrity";
	public static final String REQUIREMENT_SECRECY = "Secrecy";
	
	/**
	 * The marker ID for the custom error IMarkers created by this class.
	 * This needs to be the same marker ID as defined in the plugin.xml
	 */
	public static final String MARKER_ID = "org.gravity.security.marker";
	public static final int MARKER_JDT_PROBLEM_ID = 6256;
	
	/**
	 * The logger of this class
	 */
	private static final Logger LOGGER = Logger.getLogger(SecurityMarkerUtil.class);

	private SecurityMarkerUtil() {
		// This class should not be instantiated
	}

	public static IMarker createErrorMarker(final IMember member, final String message,
			 final String securityRequirement, final String... relevantMember) {
		if (SecurityMarkerUtil.accessIsInQuickfixes(member, securityRequirement, relevantMember)) {
			return null;
		}
		try {
			final var resource = member.getResource();
			final var line = JavaASTUtil.getLine(member);

			return createErrorMarker(resource, line, message, securityRequirement, relevantMember);
		} catch (final CoreException e) {
			throw new IllegalStateException(e);
		}
	}

	public static IMarker createErrorMarker(final IResource resource, final int line, final String message,
			 final String securityRequirement, final String... relevantMember) throws CoreException {
		final var m = resource.createMarker(MARKER_ID);
		m.setAttribute(IMarker.LINE_NUMBER, line);
		m.setAttribute(IMarker.MESSAGE, message);
		m.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
		// attributes necessary for being a jdt core problem
		m.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
		m.setAttribute(IMarker.CHAR_START, 0); // not the actual start
		m.setAttribute(IMarker.CHAR_END, 1); // not the actual end
		m.setAttribute(IJavaModelMarker.ID, MARKER_JDT_PROBLEM_ID);
		// custom marker attributes
		m.setAttribute(IMarker.SOURCE_ID, MARKER_SOURCE);
		m.setAttribute(MARKER_ATTR_ANALYZED, String.join(";", relevantMember));
		m.setAttribute(MARKER_ATTR_SECURITY_REQUIREMENT, securityRequirement);
		return m;
	}

	public static void createWarningMarker(final IAnnotation annotation, final String message) {
		try {
			final var resource = annotation.getResource();
			final var line = JavaASTUtil.getLine(annotation);

			final var m = resource.createMarker(MARKER_ID);
			m.setAttribute(IMarker.LINE_NUMBER, line);
			m.setAttribute(IMarker.MESSAGE, message);
			m.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_NORMAL);
			m.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
			m.setAttribute(IMarker.SOURCE_ID, MARKER_SOURCE);
		} catch (final CoreException e) {
			throw new IllegalStateException(e);
		}
	}

	public static void deleteOldMarkers(final ICompilationUnit cu, final long timestamp) {
		try {
			for (final IMarker m : cu.getResource().findMarkers(MARKER_ID, true, IResource.DEPTH_INFINITE)) {
				if (m.getCreationTime() < timestamp && MARKER_SOURCE.equals(m.getAttribute(IMarker.SOURCE_ID))) {
					m.delete();
				}
			}
		} catch (final CoreException e) {
			LOGGER.error(e);
		}
	}

	public static void deleteOldMarkers(final IResource res, final String analyzedMember, final long timestamp) {
		if (res != null) {
			try {
				for (final IMarker m : res.findMarkers(MARKER_ID, true, IResource.DEPTH_INFINITE)) {
					if (m.getCreationTime() < timestamp && MARKER_SOURCE.equals(m.getAttribute(IMarker.SOURCE_ID))
							&& m.getAttribute(MARKER_ATTR_ANALYZED, "").contains(analyzedMember)) {
						m.delete();
					}
				}
			} catch (final CoreException e) {
				LOGGER.error(e);
			}
		}
	}

	public static Collection<IMarker> createErrorMarker(final MethodCall methodCall, final String message,
			final String securityRequirement, final String... relevantMember) {
		final var callLocations = methodCall.getCallLocations();
		final Collection<IMarker> marker = new ArrayList<>(callLocations.size());
		for (final CallLocation callLocation : callLocations) {
			try {
				final var member = callLocation.getMember();
				
				if (! SecurityMarkerUtil.accessIsInQuickfixes(member, securityRequirement, relevantMember)) {
					var resource = member.getResource();
					if (resource == null) {
						resource = member.getJavaProject().getResource();
					}
					final var line = callLocation.getLineNumber();
	
					marker.add(createErrorMarker(resource, line, message, securityRequirement, relevantMember));
				}
			} catch (final CoreException e) {
				throw new IllegalStateException(e);
			}
		}
		return marker;
	}
	
	/**
	 * Finds all error markers of custom type on the resource and its children
	 * 
	 * @param node The IJavaElement for which markers should be retrieved
	 * @return A Collection of the found custom IMarker types. If no Markers were found, the collection is empty
	 */
	public static Collection<IMarker>retrieveErrorMarkersOnJavaElement(IJavaElement node){
		IResource resource = node.getResource();
		IMarker[] markers = null;
		try {
			markers = resource.findMarkers(MARKER_ID, true, IResource.DEPTH_INFINITE);
		} catch (CoreException e) {
			markers = null;
		}
		if (markers != null){
			ArrayList<IMarker>markerList = new ArrayList<IMarker>(Arrays.asList(markers));
			return markerList;
		}
		else return new ArrayList<IMarker>();
	}
	
	/** Checks the quickfix file, if it exists, to see if this method call has been checked
	 *  and fulfills the secure dependency requirements.
	 *  Used to not create error markers on already quickfixed accessed properties.
	 *  Security requirement and the method signatures are given in the same order as for
	 *  error markers.
	 * 
	 * @param securityRequirement The secure dependency requirement that this access violates.
	 * @param relevantMembers The method call that an error would be created on and the method that is called.
	 * @return Boolean True if the property combination has been checked as a quickfix, and False if not.
	 */
	public static boolean accessIsInQuickfixes(IMember memberMethod, String securityRequirement, String... relevantMembers) {
		/**try {
			IFile file = SecurityAnnotationsQuickFixProcessor.get_quickfix_file(memberMethod.getDeclaringType());
			if(file != null) {
				InputStream stream = file.getContents();
				String contents = new String(stream.readAllBytes());
				stream.close();
				return contents.contains(securityRequirement + ";" + String.join(";", relevantMembers));
			}
		} catch (IOException e) {
			LOGGER.error(e);
		} catch (CoreException e) {
			LOGGER.error(e);
		}*/
		return false;
	}

}
