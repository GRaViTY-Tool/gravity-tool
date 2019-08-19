package org.gravity.hulk.ui.handlers.scan;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.widgets.Display;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkFactory;
import org.gravity.hulk.resolve.ResolvePackage;
import org.gravity.hulk.resolve.antipattern.HBlobResolver;
import org.gravity.hulk.ui.dialogs.ResultDialog;

public class HulkResolveHandler extends HulkHandler {

	@Override
	protected void setJobName() {
		JobName = "Anti-Pattern resolving";
	}

	@Override
	protected void setSelectionDialogInput() {
		selectionDialogInput = ResolvePackage.eINSTANCE;
	}

	@Override
	protected void setHulk() {
		hulk = HulkFactory.eINSTANCE.createHAntiPatternResolving();
	}

	@Override
	public void displayResults() {

		// Have to leave it as instanceof right now. For further antipatterns,
		// consider implementing a more abstract HAntiPatternResolver class
		// that provides access to getBestMoves().
		for (HDetector reslv : executedDetectors) {
			if (reslv instanceof HBlobResolver) {

				Runnable runnable = new Runnable() {

					@Override
					public void run() {
						(new ResultDialog(window.getShell(), selectedDetectors, executedDetectors,
								"Hulk Anti-pattern Elemination Results")).open();
					}
				};

				Display.getDefault().asyncExec(runnable);
			}
		}
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		Object returnObject = super.execute(event);

		// IJobChangeListener listener = new JobEndedListener(){
		//
		// @Override
		// public void done(IJobChangeEvent event) {
		// redoJob();
		// }
		//
		// };
		// job.addJobChangeListener(listener);

		return returnObject;

	}

}
