package org.gravity.hulk.ui.handlers.scan;

import org.gravity.hulk.detection.HulkDetectionPackage;
import org.gravity.hulk.impl.HAntiPatternDetection;

public class HulkScanHandler extends HulkHandler {

	@Override
	protected void setJobName() {
		this.jobName = "Anti-Pattern detection";

	}

	@Override
	protected void setSelectionDialogInput() {
		this.selectionDialogInput = HulkDetectionPackage.INSTANCE;
	}

	@Override
	protected void setHulk() {
		this.hulk = new HAntiPatternDetection();
	}

}
