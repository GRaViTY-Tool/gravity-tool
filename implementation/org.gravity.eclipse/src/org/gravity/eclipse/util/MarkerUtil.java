/**
 *
 */
package org.gravity.eclipse.util;

import java.util.Map;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TMethodDefinition;

/**
 * @author speldszus
 *
 */
public class MarkerUtil {

	private static final Logger LOGGER = Logger.getLogger(MarkerUtil.class);

	private final Map<String, IType> astTypes;

	/**
	 * Initializes the marker util for the given project
	 *
	 * @param project The project in which markers should be created
	 * @throws JavaModelException If there is an error in accessing contents from the project
	 */
	public MarkerUtil(IJavaProject project) throws JavaModelException {
		this.astTypes = JavaASTUtil.getTypesForProject(project);
	}


	/**
	 * Creates a marker on the given program model element
	 *
	 * @param element  The pm element
	 * @param kind     The marker kind
	 * @param message  The marker message
	 * @param priority The marker priority
	 * @param severity The severity of the marker
	 */
	public void createMarker(EObject element, String message, int priority, int severity) {
		createMarker(this.astTypes, element, message, priority, severity);
	}

	/**
	 * Creates a marker on the given program model element
	 *
	 * @param astTypes A mapping between names and Eclipse AST types
	 * @param element  The pm element
	 * @param kind     The marker kind
	 * @param message  The marker message
	 * @param priority The marker priority
	 * @param severity The severity of the marker
	 *
	 * @deprecated
	 */
	@Deprecated
	public static void createMarker(Map<String, IType> astTypes, EObject element, String message, int priority, int severity) {
		final IJavaElement javaElement = getJavaElement(astTypes, element);
		if (javaElement != null) {
			try {
				final int line = JavaASTUtil.getLine(javaElement);

				final IMarker marker = javaElement.getUnderlyingResource().createMarker(IMarker.PROBLEM);
				marker.setAttribute(IMarker.MESSAGE, message);
				marker.setAttribute(IMarker.PRIORITY, priority);
				marker.setAttribute(IMarker.SEVERITY, severity);
				marker.setAttribute(IMarker.LINE_NUMBER, line);
			} catch (final CoreException e) {
				LOGGER.log(Level.ERROR, e);
			}
		}
	}

	/**
	 * Get the element from the astTypes map
	 *
	 * @param astTypes A map from names to all types contained in the JDT AST
	 * @param element The program model element to look for
	 * @return The corresponding Java element
	 */
	private static IJavaElement getJavaElement(Map<String, IType> astTypes, EObject element) {
		IJavaElement javaElement = null;
		if (element instanceof TAbstractType) {
			javaElement = astTypes.get(((TAbstractType) element).getFullyQualifiedName());
		} else if (element instanceof TMethodDefinition) {
			final TMethodDefinition member = (TMethodDefinition) element;
			final String fullyQualifiedName = member.getDefinedBy().getFullyQualifiedName();
			final IType iType = astTypes.get(fullyQualifiedName);
			if(iType == null) {
				LOGGER.log(Level.WARN, "Type not found in AST: " + fullyQualifiedName);
				return null;
			}
			try {
				javaElement = JavaASTUtil.getIMethod(member.getSignature(), iType);
			} catch (final JavaModelException e) {
				LOGGER.log(Level.ERROR, e);
			}
		}
		return javaElement;
	}

	/**
	 * Deleted all markers from the given Element
	 * @param element The program model element to look for
	 */
	public void deleteMarker( EObject element) {
		deleteMarker(this.astTypes, element);
	}

	/**
	 * Deleted all markers from the given Element
	 *
	 * @param astTypes A map from names to all types contained in the JDT AST
	 * @param element The program model element to look for
	 *
	 * @deprecated
	 */
	@Deprecated
	public static void deleteMarker(Map<String, IType> astTypes, EObject element) {
		final IJavaElement javaElement = getJavaElement(astTypes, element);
		if (javaElement != null) {
			try {
				final int line = JavaASTUtil.getLine(javaElement);
				for (final IMarker marker : javaElement.getUnderlyingResource().findMarkers(IMarker.PROBLEM, true,
						IResource.DEPTH_ONE)) {
					final Object attribute = marker.getAttribute(IMarker.LINE_NUMBER);
					if (((Integer) attribute).intValue() == line) {
						marker.delete();
					}
				}
			} catch (final CoreException e) {
				LOGGER.log(Level.ERROR, e);
			}
		}
	}
}
