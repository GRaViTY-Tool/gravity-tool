package org.gravity.hulk.ui.visualization.marker;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.gravity.eclipse.util.JavaASTUtil;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.ui.visualization.Activator;
import org.gravity.hulk.ui.visualization.detection.DetectionObject;
import org.gravity.hulk.ui.visualization.detection.DetectionPreprocessor;
import org.gravity.hulk.ui.visualization.util.Flaws;
import org.gravity.typegraph.basic.TAbstractType;

public class AntipatternMarkerManager {

	private static final String CLASS_NAME = "org.gravity.hulk.ui.visualization.className";

	private static final Logger LOGGER = Logger.getLogger(AntipatternMarkerManager.class);

	private DetectionPreprocessor preprocessor;
	private HAntiPatternGraph apg;

	private IJavaProject project;

	public AntipatternMarkerManager(HAntiPatternGraph apg, DetectionPreprocessor preprocessor, IJavaProject project) {
		this.preprocessor = preprocessor;
		this.apg = apg;
		this.project = project;
	}

	/**
	 * Sets the markers for the detection results
	 */
	public void setMarkers() {
		Map<Flaws, List<DetectionObject>> detectionObjects = preprocessor.preprocessDetections(apg);
		for (Entry<Flaws, List<DetectionObject>> entry : detectionObjects.entrySet()) {
			Flaws key = entry.getKey();
			if (!key.getName().endsWith("Metric")) {
				for (DetectionObject detectionObject : entry.getValue()) {
					Map<TAbstractType, String> detections = detectionObject.getDetections();
					for (TAbstractType type : detections.keySet()) {
						try {
							IType iType = JavaASTUtil.getIType(type, project);
							int lineNumber = JavaASTUtil.getLine(iType);
							String className = type.getTName();
							IResource resource = iType.getResource();
							findAndDeleteOldMarkers(resource, className, detectionObject);
							createMarker(resource, lineNumber, className, detectionObject);
						} catch (CoreException e) {
							LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
						}
					}
				}
			}
		}
	}

	/**
	 * Deletes all Hulk markers in the given file for belonging to the given class
	 * 
	 * @param file            The file in which markers should be deleted
	 * @param className       The class for which markers should be deleted
	 * @param detectionObject A detection object specifying the marker type which
	 *                        should be deleted
	 * @throws CoreException If getting or deleting markers fails
	 */
	private void findAndDeleteOldMarkers(IResource file, String className, DetectionObject detectionObject)
			throws CoreException {
		IMarker[] oldMarkers = file.findMarkers(Activator.PLUGIN_ID + "." + detectionObject.getType() + "Marker", false,
				IResource.DEPTH_ZERO);
		for (IMarker m : oldMarkers) {
			String markedClass = m.getAttribute(CLASS_NAME, "");
			if (markedClass.equals(className)) {
				m.delete();
				break;
			}
		}
	}

	/**
	 * Creates an warning marker for the given class and detection results
	 * 
	 * @param file            The file containing the class
	 * @param lineNumber      The line where the marker should be placed
	 * @param className       The name of the class
	 * @param detectionObject The detection results
	 * @throws CoreException if creating the marker fails
	 */
	private void createMarker(IResource file, int lineNumber, String className, DetectionObject detectionObject)
			throws CoreException {
		IMarker marker = file.createMarker(Activator.PLUGIN_ID + "." + detectionObject.getType().getName() + "Marker");
		marker.setAttribute(IMarker.MESSAGE, detectionObject.getType() + " detected");
		marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
		marker.setAttribute(CLASS_NAME, className);
		marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
	}

}
