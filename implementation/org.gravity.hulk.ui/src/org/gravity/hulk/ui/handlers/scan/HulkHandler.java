package org.gravity.hulk.ui.handlers.scan;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.io.ModelSaver;
import org.gravity.eclipse.selection.SelectionHelper;
import org.gravity.hulk.HAntiPatternHandling;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkActivator;
import org.gravity.hulk.annotations.activator.AnnotationsActivator;
import org.gravity.hulk.antipatterngraph.AntipatterngraphFactory;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.detection.HulkDetector;
import org.gravity.hulk.ui.HulkUiActivator;
import org.gravity.hulk.ui.Messages;
import org.gravity.hulk.ui.dialogs.AntiPatternSelectionDialog;
import org.gravity.hulk.ui.dialogs.DetectionResultDialog;
import org.gravity.hulk.ui.dialogs.DetectionTreeContentProvider;
import org.gravity.hulk.ui.dialogs.DetectionTreeLabelProvider;
import org.moflon.core.dfs.DFSGraph;

public abstract class HulkHandler extends AbstractHandler {

	protected boolean javaAnnotationsEnabled;
	protected HAntiPatternHandling hulk;
	protected IPGConverter converter;
	protected IProgressMonitor hHmonitor;
	protected Set<HDetector> selected_detectors;
	protected Set<HDetector> executed_detectors;
	protected Set<EClass> selection;
	protected IJavaProject project;
	
	protected String JobName;
	protected Object selectionDialogInput;
	protected IWorkbenchWindow window;
	protected Job job;
	protected List<Object> workspace_selection;
	protected Object firstSelectionElement;
	protected HulkDetector detector;
	
	protected abstract void setJobName();
	protected abstract void setSelectionDialogInput();
	
	protected abstract void setHulk();
	
	public HulkHandler() {
		setJobName();
		setSelectionDialogInput();
	}	
	
	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		return true;
	}
	
	public void InitHulk(){
		HAntiPatternGraph apg = AntipatterngraphFactory.eINSTANCE.createHAntiPatternGraph();
		apg.setPg(converter.getPG());
	
		hulk.setApg(apg);
		hulk.setProgramlocation(project.getProject().getLocation().toString());
	
		ResourceSet rs = converter.getResourceSet();
		rs.createResource(URI.createURI("Hulk.xmi")).getContents().add(hulk); //$NON-NLS-1$
	
		hHmonitor.worked(1);
		hHmonitor.setTaskName(Messages.HulkScanHandler_10);
	
		DFSGraph dependencies = hulk.getDependencyGraph();
	
		Resource res = rs.createResource(URI.createURI("SmellDependencyGraph.xmi")); //$NON-NLS-1$
		res.getContents().add(dependencies);
	}
	
	
	public void InitHulkWithStatusOutput(){
		long t1 = System.currentTimeMillis();
		System.out.println(t1 + " Init Hulk");
		
		InitHulk();
		
		long t2 = System.currentTimeMillis();
		System.out.println(t2 + " Init Hulk - done " + (t2 - t1) + "ms");
	}
	
	
	
	public void SyncBWD(){
		Hashtable<String, String> configuration = new Hashtable<String, String>();
		
		detector = new HulkDetector(hulk, configuration);
		
		if(javaAnnotationsEnabled){
			converter.syncProjectBwd(IPGConverter -> {

				System.out.println(System.currentTimeMillis() + " Hulk Detect AP");
				detector.detectSelectedAntiPattern(selection, selected_detectors,
						executed_detectors);
				System.out.println(System.currentTimeMillis() + " Hulk Detect AP - done");

			}, hHmonitor);
			IFolder folder = project.getProject().getFolder("src/org/gravity/hulk/annotations"); //$NON-NLS-1$
			if (folder.exists()) {
				try {
					folder.delete(true, hHmonitor);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		else{
			System.out.println(System.currentTimeMillis() + " Hulk Detect AP");
			detector.detectSelectedAntiPattern(selection, selected_detectors,
					executed_detectors);
			System.out.println(System.currentTimeMillis() + " Hulk Detect AP - done");
		}
		
		
	}
	
	public IFolder getHulkFolder(){
		IFolder hulk = project.getProject().getFolder(HulkActivator.HULK_FOLDER_NAME);
		if (!hulk.exists()) {
			try {
				hulk.create(true, true, hHmonitor);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		return hulk;
	}

	
	public void TryCloseStream(Closeable stream){
		if (stream != null) {
			try {
				stream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public IFile getAnnotations_out(IProgressMonitor monitor){
		IFolder folder = getHulkFolder();
		IFile annotations_out = folder.getFile(AnnotationsActivator.ANNOTATIONS_JAR);
		if (!annotations_out.exists()) {
			InputStream in = null;
			try {
				in = new URL(AnnotationsActivator.ANNOTATIONS_JAR_PLATFORM).openConnection().getInputStream();
				if(annotations_out.exists()){
					annotations_out.setContents(in, true, true, monitor);
				}
				else{
					annotations_out.create(in, true, monitor);
				}
			}catch (CoreException e) {
				e.printStackTrace();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				TryCloseStream(in);
			}
			
			try {
				IClasspathEntry[] cp = project.getRawClasspath();
				IClasspathEntry[] cp_new = new IClasspathEntry[cp.length + 1];
				System.arraycopy(cp, 0, cp_new, 0, cp.length);
				cp_new[cp.length] = JavaCore.newLibraryEntry(annotations_out.getFullPath(), null, null);
				project.setRawClasspath(cp_new, hHmonitor);
			} catch (JavaModelException e) {
				e.printStackTrace();
			}
		}
		return 	annotations_out;
		}
	
	
	
	public IPath copyAnnotationsJar() {
		IFile annotations_out = getAnnotations_out(hHmonitor);
		return annotations_out.getFullPath();
	}
	
	
	public AntiPatternSelectionDialog createDialog(String title, String message) throws ExecutionException{
		
		final AntiPatternSelectionDialog dialog = new AntiPatternSelectionDialog(window.getShell(), new DetectionTreeLabelProvider(), new DetectionTreeContentProvider(), SWT.None);

		dialog.setTitle(title);
		dialog.setMessage(message);
		dialog.setContainerMode(true);
		dialog.setInput(selectionDialogInput);
		dialog.addJavaAnnotationsSelectedListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				Button button = (Button) e.widget;		
				javaAnnotationsEnabled = button.getSelection();
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
			}
		});
		return dialog;
	}
	
	
	
	public void initializeSelection(AntiPatternSelectionDialog dialog){
		selection = new HashSet<>();
		for (Object selected : dialog.getResult()) {
			if (selected instanceof EClass) {
				EClass e_class = (EClass) selected;
				Class<?> instance_class = e_class.getInstanceClass();
				if (HDetector.class.isAssignableFrom(instance_class)) {
					selection.add(e_class);
				}
			}
		}
	}
	
	public void displayResults(){
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				(new DetectionResultDialog(window.getShell(), selected_detectors, executed_detectors))
						.open();
			}
		};
		
		Display.getDefault().asyncExec(runnable);
	}
	
	
	
	/**
	 * Initializes a scan.
	 * 
	 * First calls a selection dialog for selecting the anti-patterns to scan for
	 * Then runs the scan and calls the abstract setHulk method implemented by subclasses, 
	 * such as HulkResolveHandler and HulkScanHandler. If this returns true, then runJOb() is executed next
	 * 
	 * @param event
	 * @return
	 * @throws ExecutionException
	 */
	public boolean initialize(ExecutionEvent event) throws ExecutionException{
		System.out.println(Messages.HulkScanHandler_0);
		
		window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		
		// Open the Anti-Pattern Selection dialog
		AntiPatternSelectionDialog dialog = createDialog(Messages.HulkScanHandler_1, Messages.HulkScanHandler_2);
		dialog.open();
		
		if (dialog.getReturnCode() == Window.CANCEL) {
			return false;
		}

		initializeSelection(dialog);
		
		

		if (selection.size() > 0) {

			// Start Hulk, details implemented by subclasses
			setHulk();
			selected_detectors = new HashSet<>();
			executed_detectors = new HashSet<>();

			ISelectionService service = window.getSelectionService();
			IStructuredSelection structured = (IStructuredSelection) service.getSelection();
			firstSelectionElement = structured.getFirstElement();
			workspace_selection = Arrays.asList(structured.toArray());
			return true;
		}
		return false;
	}
	
	public void runJob(){

		job = new Job(JobName) { //$NON-NLS-1$

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				hHmonitor = monitor;
				monitor.beginTask(Messages.HulkScanHandler_9, 3);

				Set<IJavaProject> projects = SelectionHelper.getJavaProjects(workspace_selection);
				ArrayList<String> fails = new ArrayList<>();
				for (IJavaProject javaProject : projects) {
					project = javaProject;
					long t0 = System.currentTimeMillis();
					System.out.println(t0 + " Hulk Anti-Pattern Detection");
					
					IFolder hulk_folder = project.getProject().getFolder(HulkActivator.HULK_FOLDER_NAME);

					Set<IPath> libs = new HashSet<>();
					if(javaAnnotationsEnabled){
						IPath annotations = copyAnnotationsJar();
						libs.add(annotations);
					}

					converter = GravityActivator.getDefault().getNewConverter(project.getProject());

					boolean success = converter.convertProject(project, libs, monitor);
					if (!success || converter.getPG() == null) {
						System.err.println("Creating PG from project failed: " + project.getProject().getName());
						fails.add(javaProject.getProject().getName());
						continue;
					}

					
					InitHulkWithStatusOutput();
					

					long t3 = System.currentTimeMillis();
					System.out.println(t3 + " Sync Bwd");
					
					SyncBWD();
					
					
					IFile apg_xmi = hulk_folder.getFile(HulkActivator.ANTI_PATTERN_PG_XMI_NAME);
					if(!ModelSaver.saveModel(hulk.getApg(), apg_xmi, monitor)){
						return new Status(IStatus.WARNING, HulkUiActivator.PLUGIN_ID, Messages.HulkScanHandler_7);
					}
					
					long t4 = System.currentTimeMillis();
					System.out.println(t4 + " Sync Bwd - Done " + (t4 - t3) + "ms");
					System.out.println(t4 + " Hulk Anti-Pattern Detection - Done " + (t4 - t0) + "ms");
					
					
					displayResults();
					
					monitor.worked(1);
				}

				return fails.size()==0 ? Status.OK_STATUS : new Status(IStatus.ERROR, HulkActivator.PLUGIN_ID, "Anti-pattern detection failed for the following projects: "+fails.toString());
			}

			
		};
		job.setUser(true);
		job.schedule();
	}
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		if(initialize(event)){
		
			runJob();

		} else {
			System.out.println(Messages.HulkScanHandler_8);
		}
		return null;
	}

	
	
}
