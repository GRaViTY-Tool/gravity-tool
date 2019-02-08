package org.gravity.hulk.ui.visualization.markerManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.ui.visualization.Activator;
import org.gravity.hulk.ui.visualization.detection.DetectionObject;
import org.gravity.hulk.ui.visualization.detection.DetectionPreprocessor;
import org.gravity.hulk.ui.visualization.util.AstUtil;
import org.gravity.hulk.ui.visualization.util.GlobalStrings;

public class AntipatternMarkerManager {

	private static final Logger LOGGER = Logger.getLogger(AntipatternMarkerManager.class);

	private DetectionPreprocessor preprocessor;
	private IFolder src;
	private HAntiPatternGraph apg;
	private Map<GlobalStrings, List<DetectionObject>> detectionObjects;

	public AntipatternMarkerManager(HAntiPatternGraph apg, DetectionPreprocessor preprocessor, IProject project) {
		this.preprocessor = preprocessor;
		this.apg = apg;
		src = project.getFolder("src");
	}

	public void setAPG(HAntiPatternGraph apg) {
		this.apg = apg;
	}

	public void setPreprocessor(DetectionPreprocessor preprocessor) {
		this.preprocessor = preprocessor;
	}

	public void setProject(IProject project) {
		src = project.getFolder("src");
	}

	public void setMarkers() {
		IFile file = null;
		detectionObjects = preprocessor.preprocessDetections(apg);
		for (GlobalStrings key : detectionObjects.keySet()) {
			if (!key.toString().endsWith("Metric")) {
				for (DetectionObject detectionObject : detectionObjects.get(key)) {
					Map<String, String> detections = detectionObject.getDetections();
					for (String string : detections.keySet()) {
						String tempString[] = string.split(":");
						String classFolder = tempString[0];
						classFolder = classFolder.replace(".", "/");
						classFolder = classFolder.replace("$", "");
						String className = tempString[1];
						String iClassString = classFolder + "/" + className + ".java";
						file = (IFile) src.findMember(iClassString);
						try {
							int lineNumber;
							if (file != null) {
								lineNumber = AstUtil.findLineNumberOfTypeDeclaration(file, className.trim());
							} else {
								IFolder iFolder = src.getFolder(classFolder);
								List<IFile> resultList = new ArrayList<IFile>();
								lineNumber = AstUtil.findFileWithTypeDeclaration(iFolder, className.trim(),
										resultList);
								file = resultList.get(0);
							}
							findAndDeleteOldMarkers(file, className, detectionObject);
							createMarker(file, lineNumber, className, detectionObject);
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
	 * @param file The file in which markers should be deleted
	 * @param className The class for which markers should be deleted
	 * @param detectionObject A detection object specifying the marker type which should be deleted
	 * @throws CoreException If getting or deleting markers fails
	 */
	private void findAndDeleteOldMarkers(IFile file, String className, DetectionObject detectionObject)
			throws CoreException {
		IMarker[] oldMarkers = file.findMarkers(
				Activator.PLUGIN_ID + "." + detectionObject.getType() + "Marker", false,
				IResource.DEPTH_ZERO);
		for (IMarker m : oldMarkers) {
			String markedClass = (String) m
					.getAttribute("org.gravity.hulk.ui.visualization.className", "");
			if (markedClass.equals(className)) {
				m.delete();
				break;
			}
		}
	}

	/**
	 * Creates an warning marker for the given class and detection results 
	 * 
	 * @param file The file containing the class
	 * @param lineNumber The line where the marker should be placed
	 * @param className The name of the class
	 * @param detectionObject The detection results
	 * @throws CoreException if creating the marker fails
	 */
	private void createMarker(IFile file, int lineNumber, String className, DetectionObject detectionObject)
			throws CoreException {
		IMarker marker = file
				.createMarker(Activator.PLUGIN_ID + "." + detectionObject.getType() + "Marker");
		marker.setAttribute(IMarker.MESSAGE, detectionObject.getType() + " detected");
		marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
		marker.setAttribute("org.gravity.hulk.ui.visualization.className", className);
		marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
	}

}
