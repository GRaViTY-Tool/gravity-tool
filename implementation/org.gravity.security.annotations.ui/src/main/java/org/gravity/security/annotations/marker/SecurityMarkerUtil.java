package org.gravity.security.annotations.marker;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.internal.corext.callhierarchy.CallLocation;
import org.eclipse.jdt.internal.corext.callhierarchy.MethodCall;
import org.gravity.eclipse.util.JavaASTUtil;
import org.gravity.security.annotations.check.data.SecurityViolation;

@SuppressWarnings("restriction")
public class SecurityMarkerUtil {

	public static final String MARKER_SOURCE = "org.gravity.security";
	public static final String MARKER_ATTR_ANALYZED = "org.gravity.security.analyzedMember";

	/**
	 * The logger of this class
	 */
	private static final Logger LOGGER = Logger.getLogger(SecurityMarkerUtil.class);

	private SecurityMarkerUtil() {
		// This class should not be instantiated
	}

	private static IMarker createErrorMarker(final IMember member, final String message,
			final Collection<String> relevantMember) {
		try {
			final var resource = member.getResource();
			final var line = JavaASTUtil.getLine(member);

			return createErrorMarker(resource, line, message, relevantMember);
		} catch (final CoreException e) {
			throw new IllegalStateException(e);
		}
	}

	private static IMarker createErrorMarker(final IResource resource, final int line, final String message,
			final Collection<String> relevantMember) throws CoreException {
		final var m = resource.createMarker(IMarker.PROBLEM);
		m.setAttribute(IMarker.LINE_NUMBER, line);
		m.setAttribute(IMarker.MESSAGE, message);
		m.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
		m.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
		m.setAttribute(IMarker.SOURCE_ID, MARKER_SOURCE);
		m.setAttribute(MARKER_ATTR_ANALYZED, String.join(";", relevantMember));
		return m;
	}

	public static void createWarningMarker(final IAnnotation annotation, final String message) {
		try {
			final var resource = annotation.getResource();
			final var line = JavaASTUtil.getLine(annotation);

			final var m = resource.createMarker(IMarker.PROBLEM);
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
			for (final IMarker m : cu.getResource().findMarkers(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE)) {
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
				for (final IMarker m : res.findMarkers(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE)) {
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
			final Collection<String> relevantMember) {
		final var callLocations = methodCall.getCallLocations();
		final Collection<IMarker> marker = new ArrayList<>(callLocations.size());
		for (final CallLocation callLocation : callLocations) {
			try {
				final var member = callLocation.getMember();
				var resource = member.getResource();
				if (resource == null) {
					resource = member.getJavaProject().getResource();
				}
				final var line = callLocation.getLineNumber();

				marker.add(createErrorMarker(resource, line, message, relevantMember));
			} catch (final CoreException e) {
				throw new IllegalStateException(e);
			}
		}
		return marker;
	}

	public static void createErrorMarker(final SecurityViolation violation) {
		final var relevantElementSignatures = violation.getRelevantElementSignatures();
		createErrorMarker(violation.source(), violation.getSourceMessage(), relevantElementSignatures);
		createErrorMarker(violation.target(), violation.getTargetMessage(), relevantElementSignatures);
	}

}
