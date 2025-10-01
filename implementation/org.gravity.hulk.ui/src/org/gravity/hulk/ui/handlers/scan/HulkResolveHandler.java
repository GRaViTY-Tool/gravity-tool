package org.gravity.hulk.ui.handlers.scan;

import org.eclipse.swt.widgets.Display;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.resolve.antipattern.HBlobResolver;
import org.gravity.hulk.resolve.impl.HAntiPatternResolvingImpl;
import org.gravity.hulk.ui.dialogs.ResultDialog;

public class HulkResolveHandler extends HulkHandler {

	@Override
	protected void setJobName() {
		this.jobName = "Anti-Pattern resolving";
	}

	@Override
	protected void setSelectionDialogInput() {
		this.selectionDialogInput = this.hulk.getHDetector();
	}

	@Override
	protected void setHulk() {
		this.hulk = new HAntiPatternResolvingImpl();
	}

	@Override
	public void displayResults() {

		// Have to leave it as instanceof right now. For further antipatterns,
		// consider implementing a more abstract HAntiPatternResolver class
		// that provides access to getBestMoves().
		for (final HDetector reslv : this.executedDetectors) {
			if (reslv instanceof HBlobResolver) {

				final Runnable runnable = () -> new ResultDialog(this.window.getShell(), this.selectedDetectors,
						this.executedDetectors,
						"Hulk Anti-pattern Elemination Results").open();
				Display.getDefault().asyncExec(runnable);
			}
		}
	}
}
