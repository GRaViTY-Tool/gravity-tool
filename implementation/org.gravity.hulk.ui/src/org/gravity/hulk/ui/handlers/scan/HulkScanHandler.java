package org.gravity.hulk.ui.handlers.scan;

import org.gravity.hulk.HulkFactory;
import org.gravity.hulk.detection.DetectionPackage;

public class HulkScanHandler extends HulkHandler {

	
	@Override
	protected void setJobName() {
		jobName = "Anti-Pattern detection";
		
	}
	
	@Override
	protected void setSelectionDialogInput() {
		selectionDialogInput = DetectionPackage.eINSTANCE;
	}
	
	@Override
	protected void setHulk() {
		hulk = HulkFactory.eINSTANCE.createHAntiPatternDetection();
	}
	
	
}
