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

public class AntipatternMarkerManager {

	private static final Logger LOGGER = Logger.getLogger(AntipatternMarkerManager.class);

	private DetectionPreprocessor preprocessor;
	private IFolder src;
	private HAntiPatternGraph apg;
	private Map<String, List<DetectionObject>> detectionObjects;

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
		detectionObjects = preprocessor.preprocessDetectionts(apg);
		for (String key : detectionObjects.keySet()) {
			if (!key.endsWith("Metric")) {
				for (DetectionObject detectionObject : detectionObjects.get(key)) {
					Map<String, String> detections = detectionObject.getDetections();
					for (String string : detections.keySet()) {
						String tempString[] = string.split(":");
						tempString[0] = tempString[0].replace(".", "/");
						tempString[0] = tempString[0].replace("$", "");
						String iClassString = tempString[0] + "/" + tempString[1] + ".java";
						file = (IFile) src.findMember(iClassString);
						try {
							if (file != null) {
								int lineNumber = AstUtil.findLineNumberOfTypeDeclaration(file, tempString[1].trim());
								IMarker[] oldMarkers = file.findMarkers(
										Activator.PLUGIN_ID + "." + detectionObject.getType() + "Marker", false,
										IResource.DEPTH_ZERO);
								for (IMarker m : oldMarkers) {
									String markedClass = (String) m
											.getAttribute("org.gravity.hulk.ui.visualization.className", "");
									if (markedClass.equals(tempString[1])) {
										m.delete();
										break;
									}
								}
								IMarker marker = file
										.createMarker(Activator.PLUGIN_ID + "." + detectionObject.getType() + "Marker");
								marker.setAttribute(IMarker.MESSAGE, detectionObject.getType() + " detected");
								marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
								marker.setAttribute("org.gravity.hulk.ui.visualization.className", tempString[1]);
								marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
							} else {
								IFolder iFolder = src.getFolder(tempString[0]);
								List<IFile> resultList = new ArrayList<IFile>();
								int lineNumber = AstUtil.findFileWithTypeDeclaration(iFolder, tempString[1].trim(),
										resultList);
								IFile file2 = resultList.get(0);
								IMarker[] oldMarkers = file2.findMarkers(
										Activator.PLUGIN_ID + "." + detectionObject.getType() + "Marker", false,
										IResource.DEPTH_ZERO);
								for (IMarker m : oldMarkers) {
									String markedClass = (String) m
											.getAttribute("org.gravity.hulk.ui.visualization.className", "");
									if (markedClass.equals(tempString[1])) {
										m.delete();
										break;
									}
								}
								IMarker marker = file
										.createMarker(Activator.PLUGIN_ID + "." + detectionObject.getType() + "Marker");
								marker.setAttribute(IMarker.MESSAGE, detectionObject.getType() + " detected");
								marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
								marker.setAttribute("org.gravity.hulk.ui.visualization.className", tempString[1]);
								marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
							}
						} catch (CoreException e) {
							LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
						}
					}
				}
			}
		}
	}

}
