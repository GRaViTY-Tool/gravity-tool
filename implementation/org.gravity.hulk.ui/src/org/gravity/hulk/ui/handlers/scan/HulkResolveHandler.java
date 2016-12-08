package org.gravity.hulk.ui.handlers.scan;

import java.util.Iterator;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.swt.widgets.Display;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkFactory;
import org.gravity.hulk.antipatterngraph.AntipatterngraphFactory;
import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.detection.HulkDetector;
import org.gravity.hulk.resolve.ResolvePackage;
import org.gravity.hulk.resolve.antipattern.HBlobResolver;
import org.gravity.hulk.resolve.antipattern.impl.HBlobResolverImpl;
import org.gravity.hulk.ui.dialogs.ResolveResultDialog;
import org.gravity.typegraph.basic.TAnnotatable;
import org.gravity.typegraph.basic.TAnnotation;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TypeGraph;

public class HulkResolveHandler extends HulkHandler{

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
	
	private boolean isDetectionAnnotation(TAnnotation annot){
		return annot instanceof HAnnotation;
	}
	
	private void removeAnnotations(TAnnotatable annotatable){
		Iterator<TAnnotation> classIterator = annotatable.getTAnnotation().iterator();
		while(classIterator.hasNext()){
			if(isDetectionAnnotation(classIterator.next())){
				classIterator.remove();
			}
		}
	}
	
	private void redoJob(){
		job = null;
		
		
		selection.clear();
		for(HDetector detector: executed_detectors){
			selection.add(detector.eClass());
		}
		
		selected_detectors.clear();
		executed_detectors.clear();
		
		
		
		TypeGraph pg = hulk.getApg().getPg();
		
		//clean PG 
		for(TClass tClass: pg.getClasses()){
			removeAnnotations(tClass);
			for(TMember member: tClass.getDefines()){
				removeAnnotations(member);
			}	
		}
		
		// re-initialize Hulk
		setHulk();
		hulk.getDependencyGraph();
		HAntiPatternGraph apg = AntipatterngraphFactory.eINSTANCE.createHAntiPatternGraph();
		apg.setPg(pg);	
		hulk.setApg(apg);
		
		
		// re-calculate metrics
		HulkDetector.detectSelectedAntiPattern(selection, hulk, selected_detectors,
				executed_detectors);
		
		
		
		displayResults();
		
	}
	
	@Override
	public void displayResults() {

		// Have to leave it as instanceof right now. For further antipatterns,
		// consider implementing a more abstract HAntiPatternResolver class
		// that provides access to getBestMoves().
		for (HDetector reslv : executed_detectors) {
			if (reslv instanceof HBlobResolver) {

				HBlobResolverImpl res = (HBlobResolverImpl) reslv;

				Runnable runnable = new Runnable() {

					@Override
					public void run() {
						(new ResolveResultDialog(window.getShell(), selected_detectors, executed_detectors)).open();
					}
				};
		
				Display.getDefault().asyncExec(runnable);
			 }}
	}
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		
		
		Object returnObject =  super.execute(event);

//		IJobChangeListener listener = new JobEndedListener(){
//
//			@Override
//			public void done(IJobChangeEvent event) {
//				redoJob();	
//			}
//			
//		};
//		job.addJobChangeListener(listener);
				
		return returnObject;
		
	}

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub	
	};
	
	
}
