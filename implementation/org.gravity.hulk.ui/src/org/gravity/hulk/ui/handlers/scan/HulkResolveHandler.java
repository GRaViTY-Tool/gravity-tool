package org.gravity.hulk.ui.handlers.scan;

import org.eclipse.swt.widgets.Display;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.resolve.antipattern.AntiPatternResolvePackage;
import org.gravity.hulk.resolve.antipattern.impl.HBlobResolver;
import org.gravity.hulk.resolve.impl.HAntiPatternResolving;
import org.gravity.hulk.ui.dialogs.ResultDialog;

public class HulkResolveHandler extends HulkHandler {

	@Override
	protected void setJobName() {
		this.jobName = "Anti-Pattern resolving";
	}

	@Override
	protected void setSelectionDialogInput() {
		this.selectionDialogInput = AntiPatternResolvePackage.INSTANCE;
	}

	@Override
	protected void setHulk() {
		this.hulk = new HAntiPatternResolving();
	}

	@Override
	protected void displayResults() {

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
