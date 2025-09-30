package org.gravity.hulk.ui.handlers.scan;

import org.gravity.hulk.impl.HAntiPatternDetectionImpl;

public class HulkScanHandler extends HulkHandler {

	@Override
	protected void setJobName() {
		this.jobName = "Anti-Pattern detection";

	}

	@Override
	protected void setSelectionDialogInput() {
		this.selectionDialogInput = this.hulk.getHDetector();
	}

	@Override
	protected void setHulk() {
		this.hulk = new HAntiPatternDetectionImpl();
	}

}
