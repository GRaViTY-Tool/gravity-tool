package org.gravity.hulk.ui.handlers.scan;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

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
import org.gravity.typegraph.basic.TypeGraph;
import org.moflon.core.dfs.DFSGraph;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.eclipse.io.ModelSaver;
import org.gravity.eclipse.selection.SelectionHelper;
import org.gravity.eclipse.util.EclipseProjectUtil;
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
import org.gravity.hulk.ui.dialogs.ResultDialog;
import org.gravity.hulk.ui.dialogs.DetectionTreeContentProvider;
import org.gravity.hulk.ui.dialogs.DetectionTreeLabelProvider;

public abstract class HulkHandler extends AbstractHandler {

	private static final Logger LOGGER = Logger.getLogger(HulkHandler.class.getName());

	protected boolean javaAnnotationsEnabled;
	protected HAntiPatternHandling hulk;
	protected IPGConverter converter;
	protected IProgressMonitor hHmonitor;
	protected Set<HDetector> selectedDetectors;
	protected Set<HDetector> executedDetectors;
	protected Set<EClass> selection;
	protected IJavaProject project;

	protected String JobName;
	protected Object selectionDialogInput;
	protected IWorkbenchWindow window;
	protected Job job;
	protected List<Object> workspaceSelection;
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

	public void initHulk() {
		HAntiPatternGraph apg = AntipatterngraphFactory.eINSTANCE.createHAntiPatternGraph();
		TypeGraph pg = converter.getPG();
		apg.setPg(pg);

		hulk.setApg(apg);
		hulk.setProgramlocation(project.getProject().getLocation().toString());

		Resource pmResource = pg.eResource();
		ResourceSet rs = pmResource.getResourceSet();
		Resource antiPatternResource = rs.createResource(URI.createURI("platform:/resource/" + pg.getTName() + '/' //$NON-NLS-1$
				+ GravityActivator.GRAVITY_FOLDER_NAME + '/' + HulkActivator.ANTI_PATTERN_XMI_NAME));
		antiPatternResource.getContents().add(hulk);

		hHmonitor.worked(1);
		hHmonitor.setTaskName(Messages.HulkScanHandler_10);

		DFSGraph dependencies = hulk.getDependencyGraph();

		Resource res = rs.createResource(URI.createURI("SmellDependencyGraph.xmi")); //$NON-NLS-1$
		res.getContents().add(dependencies);
	}

	public void initHulkWithStatusOutput() {
		long t1 = System.currentTimeMillis();
		LOGGER.log(Level.INFO, t1 + " Init Hulk");

		initHulk();

		long t2 = System.currentTimeMillis();
		LOGGER.log(Level.INFO, t2 + " Init Hulk - done " + (t2 - t1) + "ms");
	}

	public void syncBWD() {
		HashMap<String, String> configuration = new HashMap<String, String>();

		detector = new HulkDetector(hulk, configuration);

		if (javaAnnotationsEnabled) {
			converter.syncProjectBwd(IPGConverter -> {

				LOGGER.log(Level.INFO, System.currentTimeMillis() + " Hulk Detect AP");
				detector.detectSelectedAntiPattern(selection, selectedDetectors, executedDetectors);
				LOGGER.log(Level.INFO, System.currentTimeMillis() + " Hulk Detect AP - done");

			}, hHmonitor);
			IFolder folder = project.getProject().getFolder("src/org/gravity/hulk/annotations"); //$NON-NLS-1$
			if (folder.exists()) {
				try {
					folder.delete(true, hHmonitor);
				} catch (CoreException e) {
					LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
				}
			}
		} else {
			LOGGER.log(Level.INFO, System.currentTimeMillis() + " Hulk Detect AP");
			detector.detectSelectedAntiPattern(selection, selectedDetectors, executedDetectors);
			LOGGER.log(Level.INFO, System.currentTimeMillis() + " Hulk Detect AP - done");
		}

	}

	public IFile getAnnotationsOut(IProgressMonitor monitor) throws IOException {
		IFolder folder = EclipseProjectUtil.getGravityFolder(project.getProject(), monitor);
		IFile annotationsOut = folder.getFile(AnnotationsActivator.ANNOTATIONS_JAR);
		if (!annotationsOut.exists()) {
			try (InputStream in = new URL(AnnotationsActivator.ANNOTATIONS_JAR_PLATFORM).openConnection()
					.getInputStream()) {
				if (annotationsOut.exists()) {
					annotationsOut.setContents(in, true, true, monitor);
				} else {
					annotationsOut.create(in, true, monitor);
				}
			} catch (CoreException e) {
				LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
			} catch (MalformedURLException e) {
				LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
			} catch (IOException e) {
				LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
			}

			try {
				IClasspathEntry[] cp = project.getRawClasspath();
				IClasspathEntry[] cpNew = new IClasspathEntry[cp.length + 1];
				System.arraycopy(cp, 0, cpNew, 0, cp.length);
				cpNew[cp.length] = JavaCore.newLibraryEntry(annotationsOut.getFullPath(), null, null);
				project.setRawClasspath(cpNew, hHmonitor);
			} catch (JavaModelException e) {
				LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
			}
		}
		return annotationsOut;
	}

	public IPath copyAnnotationsJar() throws IOException {
		IFile annotations = getAnnotationsOut(hHmonitor);
		return annotations.getFullPath();
	}

	public AntiPatternSelectionDialog createDialog(String title, String message) throws ExecutionException {

		final AntiPatternSelectionDialog dialog = new AntiPatternSelectionDialog(window.getShell(),
				new DetectionTreeLabelProvider(), new DetectionTreeContentProvider(), SWT.None);

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
				LOGGER.info("Default selected: " + e.getSource());
			}
		});
		return dialog;
	}

	public void initializeSelection(AntiPatternSelectionDialog dialog) {
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

	public void displayResults() {
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				(new ResultDialog(window.getShell(), selectedDetectors, executedDetectors, "Hulk Detection Results"))
						.open();
			}
		};

		Display.getDefault().asyncExec(runnable);
	}

	/**
	 * Initializes a scan.
	 * 
	 * First calls a selection dialog for selecting the anti-patterns to scan for
	 * Then runs the scan and calls the abstract setHulk method implemented by
	 * subclasses, such as HulkResolveHandler and HulkScanHandler. If this returns
	 * true, then runJOb() is executed next
	 * 
	 * @param event
	 * @return
	 * @throws ExecutionException
	 */
	public boolean initialize(ExecutionEvent event) throws ExecutionException {
		LOGGER.log(Level.INFO, Messages.HulkScanHandler_0);

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
			selectedDetectors = new HashSet<>();
			executedDetectors = new HashSet<>();

			ISelectionService service = window.getSelectionService();
			IStructuredSelection structured = (IStructuredSelection) service.getSelection();
			firstSelectionElement = structured.getFirstElement();
			workspaceSelection = Arrays.asList(structured.toArray());
			return true;
		}
		return false;
	}

	public void runJob() {

		job = new Job(JobName) { // $NON-NLS-1$

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				hHmonitor = monitor;
				monitor.beginTask(Messages.HulkScanHandler_9, 3);

				Set<IJavaProject> projects = SelectionHelper.getJavaProjects(workspaceSelection);
				ArrayList<String> fails = new ArrayList<>();
				for (IJavaProject javaProject : projects) {
					project = javaProject;
					long t0 = System.currentTimeMillis();
					LOGGER.log(Level.INFO, t0 + " Hulk Anti-Pattern Detection");

					Set<IPath> libs = new HashSet<>();
					if (javaAnnotationsEnabled) {
						IPath annotations;
						try {
							annotations = copyAnnotationsJar();
							libs.add(annotations);
						} catch (IOException e) {
							LOGGER.warn("Couldn't copy annotations to project! Disabled generation Java annotations.");
							javaAnnotationsEnabled = false;
						}
					}

					try {
						converter = GravityActivator.getDefault().getNewConverter(project.getProject());
					} catch (NoConverterRegisteredException e) {
						return new Status(Status.ERROR, HulkUiActivator.PLUGIN_ID,
								"Please install a converter and restart the task.");
					} catch (CoreException e) {
						return new Status(Status.ERROR, HulkUiActivator.PLUGIN_ID,
								"The converter extensionpoint cannot be accessed, pleade contact the GRaViTY developers.");
					}

					boolean success = converter.convertProject(project, libs, monitor);
					if (!success || converter.getPG() == null) {
						LOGGER.log(Level.ERROR, "Creating PG from project failed: " + project.getProject().getName());
						fails.add(javaProject.getProject().getName());
						continue;
					}

					initHulkWithStatusOutput();

					long t3 = System.currentTimeMillis();
					LOGGER.log(Level.INFO, t3 + " Sync Bwd");

					syncBWD();

					IFolder hulkFolder;
					try {
						hulkFolder = EclipseProjectUtil.getGravityFolder(project.getProject(), monitor);
					} catch (IOException e) {
						return new Status(IStatus.WARNING, HulkUiActivator.PLUGIN_ID, Messages.SaveAPsFailed);
					}
					IFile apgXmi = hulkFolder.getFile(HulkActivator.ANTI_PATTERN_XMI_NAME);
					IFile pmXmi = hulkFolder.getFile(project.getProject().getName() + ".xmi");
					if (!ModelSaver.saveModel(hulk.getApg(), apgXmi, monitor)
							|| !ModelSaver.saveModel(hulk.getApg().getPg(), pmXmi, monitor)) {
						return new Status(IStatus.WARNING, HulkUiActivator.PLUGIN_ID, Messages.SaveAPsFailed);
					}

					long t4 = System.currentTimeMillis();
					LOGGER.log(Level.INFO, t4 + " Sync Bwd - Done " + (t4 - t3) + "ms");
					LOGGER.log(Level.INFO, t4 + " Hulk Anti-Pattern Detection - Done " + (t4 - t0) + "ms");

					displayResults();

					monitor.worked(1);
				}

				return fails.size() == 0 ? Status.OK_STATUS
						: new Status(IStatus.ERROR, HulkActivator.PLUGIN_ID,
								"Anti-pattern detection failed for the following projects: " + fails.toString());
			}

		};
		job.setUser(true);
		job.schedule();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		if (initialize(event)) {

			runJob();

		} else {
			LOGGER.log(Level.INFO, Messages.HulkScanHandler_8);
		}
		return null;
	}

}
