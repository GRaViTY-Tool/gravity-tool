package org.sidiff.difference.symmetric.execute.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobFunction;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.progress.UIJob;
import org.sidiff.difference.symmetric.execute.DifferenceExecutor;
import org.sidiff.difference.symmetric.execute.util.EMFHandlerUtil;
import org.sidiff.difference.symmetric.execute.util.SiLiftUtil.DifferenceCalculationException;
import org.sidiff.difference.symmetric.execute.util.UIUtil;

public class DifferenceExecutorHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		Job executeDifference = UIJob.create("Execute Symmetric Difference", new IJobFunction() {

			@Override
			public IStatus run(IProgressMonitor monitor) {
				Resource modelA = EMFHandlerUtil.getSelection(event, 0);
				Resource modelB = EMFHandlerUtil.getSelection(event, 1);
				
				if ((modelA != null) && (modelB != null)) {
					DifferenceExecutor differenceExecutor;
					
					try {
						differenceExecutor = new DifferenceExecutor(modelA, modelB);
						differenceExecutor.run();
						differenceExecutor.save();
						
						UIUtil.showMessage("Model Saved: \n\n" + modelA.getURI());
						
						return Status.OK_STATUS;
					} catch (DifferenceCalculationException e) {
						UIUtil.showMessage(e.getMessage());
						e.printStackTrace();
					}
				} else {
					UIUtil.showMessage("Please select 2 model resources!");
				}
				
				return Status.CANCEL_STATUS;
			}
		});

		executeDifference.schedule();

		return null;
	}
}
