package org.gravity.hulk.ui.handlers.scan;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
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
import org.gravity.hulk.ui.dialogs.DetectionTreeContentProvider;
import org.gravity.hulk.ui.dialogs.DetectionTreeLabelProvider;
import org.gravity.hulk.ui.dialogs.ResultDialog;
import org.gravity.typegraph.basic.TypeGraph;
import org.moflon.core.dfs.DFSGraph;

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

	protected String jobName;
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
		final HAntiPatternGraph apg = AntipatterngraphFactory.eINSTANCE.createHAntiPatternGraph();
		final TypeGraph pg = this.converter.getPG();
		apg.setPg(pg);

		this.hulk.setApg(apg);
		this.hulk.setProgramlocation(this.project.getProject().getLocation().toString());

		final Resource pmResource = pg.eResource();
		final ResourceSet rs = pmResource.getResourceSet();
		final Resource antiPatternResource = rs.createResource(URI.createURI("platform:/resource/" + pg.getTName() + '/' //$NON-NLS-1$
				+ GravityActivator.GRAVITY_FOLDER_NAME + '/' + HulkActivator.ANTI_PATTERN_XMI_NAME));
		antiPatternResource.getContents().add(this.hulk);

		this.hHmonitor.worked(1);
		this.hHmonitor.setTaskName(Messages.detect);

		final DFSGraph dependencies = this.hulk.getDependencyGraph();

		final Resource res = rs.createResource(URI.createURI("SmellDependencyGraph.xmi")); //$NON-NLS-1$
		res.getContents().add(dependencies);
	}

	public void syncBWD() {
		final HashMap<String, String> configuration = new HashMap<>();

		this.detector = new HulkDetector(this.hulk, configuration);

		if (this.javaAnnotationsEnabled) {
			this.converter.syncProjectBwd(consumer -> {

				LOGGER.log(Level.INFO, System.currentTimeMillis() + " Hulk Detect AP");
				this.detector.detectSelectedAntiPattern(this.selection, this.selectedDetectors, this.executedDetectors);
				LOGGER.log(Level.INFO, System.currentTimeMillis() + " Hulk Detect AP - done");

			}, this.hHmonitor);
			final IFolder folder = this.project.getProject().getFolder("src/org/gravity/hulk/annotations"); //$NON-NLS-1$
			if (folder.exists()) {
				try {
					folder.delete(true, this.hHmonitor);
				} catch (final CoreException e) {
					LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
				}
			}
		} else {
			LOGGER.log(Level.INFO, System.currentTimeMillis() + " Hulk Detect AP");
			this.detector.detectSelectedAntiPattern(this.selection, this.selectedDetectors, this.executedDetectors);
			LOGGER.log(Level.INFO, System.currentTimeMillis() + " Hulk Detect AP - done");
		}

	}

	public IFile getAnnotationsOut(IProgressMonitor monitor) throws IOException {
		final IFolder folder = EclipseProjectUtil.getGravityFolder(this.project.getProject(), monitor);
		final IFile annotationsOut = folder.getFile(AnnotationsActivator.ANNOTATIONS_JAR);
		if (!annotationsOut.exists()) {
			try (InputStream in = new URL(AnnotationsActivator.ANNOTATIONS_JAR_PLATFORM).openConnection()
					.getInputStream()) {
				if (annotationsOut.exists()) {
					annotationsOut.setContents(in, true, true, monitor);
				} else {
					annotationsOut.create(in, true, monitor);
				}
			} catch (final CoreException | IOException e) {
				LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
			}

			try {
				final IClasspathEntry[] cp = this.project.getRawClasspath();
				final IClasspathEntry[] cpNew = new IClasspathEntry[cp.length + 1];
				System.arraycopy(cp, 0, cpNew, 0, cp.length);
				cpNew[cp.length] = JavaCore.newLibraryEntry(annotationsOut.getFullPath(), null, null);
				this.project.setRawClasspath(cpNew, this.hHmonitor);
			} catch (final JavaModelException e) {
				LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
			}
		}
		return annotationsOut;
	}

	public IPath copyAnnotationsJar() throws IOException {
		final IFile annotations = getAnnotationsOut(this.hHmonitor);
		return annotations.getFullPath();
	}

	public AntiPatternSelectionDialog createDialog(String title, String message) {

		final AntiPatternSelectionDialog dialog = new AntiPatternSelectionDialog(this.window.getShell(),
				new DetectionTreeLabelProvider(), new DetectionTreeContentProvider(), SWT.None);

		dialog.setTitle(title);
		dialog.setMessage(message);
		dialog.setContainerMode(true);
		dialog.setInput(this.selectionDialogInput);
		dialog.addJavaAnnotationsSelectedListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				final Button button = (Button) e.widget;
				HulkHandler.this.javaAnnotationsEnabled = button.getSelection();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				LOGGER.info("Default selected: " + e.getSource());
			}
		});
		return dialog;
	}

	public void initializeSelection(AntiPatternSelectionDialog dialog) {
		this.selection = new HashSet<>();
		for (final Object selected : dialog.getResult()) {
			if (selected instanceof EClass) {
				final EClass eClass = (EClass) selected;
				final Class<?> instanceClass = eClass.getInstanceClass();
				if (HDetector.class.isAssignableFrom(instanceClass)) {
					this.selection.add(eClass);
				}
			}
		}
	}

	public void displayResults() {
		final Runnable runnable = () -> (new ResultDialog(HulkHandler.this.window.getShell(), HulkHandler.this.selectedDetectors, HulkHandler.this.executedDetectors, "Hulk Detection Results"))
				.open();

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
		LOGGER.log(Level.INFO, Messages.scan);

		this.window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		// Open the Anti-Pattern Selection dialog
		final AntiPatternSelectionDialog dialog = createDialog(Messages.apSelection, Messages.select);
		dialog.open();

		if (dialog.getReturnCode() == Window.CANCEL) {
			return false;
		}

		initializeSelection(dialog);

		if (!this.selection.isEmpty()) {

			// Start Hulk, details implemented by subclasses
			setHulk();
			this.selectedDetectors = new HashSet<>();
			this.executedDetectors = new HashSet<>();

			final ISelectionService service = this.window.getSelectionService();
			final IStructuredSelection structured = (IStructuredSelection) service.getSelection();
			this.firstSelectionElement = structured.getFirstElement();
			this.workspaceSelection = Arrays.asList(structured.toArray());
			return true;
		}
		return false;
	}

	public void runJob() {

		this.job = new Job(this.jobName) { // $NON-NLS-1$

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				HulkHandler.this.hHmonitor = monitor;
				monitor.beginTask(Messages.hulkAPDetection, 3);

				final Set<IJavaProject> projects = SelectionHelper.getJavaProjects(HulkHandler.this.workspaceSelection);
				final ArrayList<String> fails = new ArrayList<>();
				for (final IJavaProject javaProject : projects) {
					HulkHandler.this.project = javaProject;
					final long t0 = System.currentTimeMillis();
					LOGGER.log(Level.INFO, t0 + " Hulk Anti-Pattern Detection");

					final Set<IPath> libs = new HashSet<>();
					if (HulkHandler.this.javaAnnotationsEnabled) {
						IPath annotations;
						try {
							annotations = copyAnnotationsJar();
							libs.add(annotations);
						} catch (final IOException e) {
							LOGGER.warn("Couldn't copy annotations to project! Disabled generation Java annotations.");
							HulkHandler.this.javaAnnotationsEnabled = false;
						}
					}

					try {
						HulkHandler.this.converter = GravityActivator.getDefault().getNewConverter(HulkHandler.this.project.getProject());
					} catch (final NoConverterRegisteredException e) {
						return new Status(IStatus.ERROR, HulkUiActivator.PLUGIN_ID,
								"Please install a converter and restart the task.");
					} catch (final CoreException e) {
						return new Status(IStatus.ERROR, HulkUiActivator.PLUGIN_ID,
								"The converter extensionpoint cannot be accessed, pleade contact the GRaViTY developers.");
					}

					final boolean success = HulkHandler.this.converter.convertProject(HulkHandler.this.project, libs, monitor);
					if (!success || HulkHandler.this.converter.getPG() == null) {
						LOGGER.log(Level.ERROR, "Creating PG from project failed: " + HulkHandler.this.project.getProject().getName());
						fails.add(javaProject.getProject().getName());
						continue;
					}

					initHulk();

					final long t3 = System.currentTimeMillis();
					LOGGER.log(Level.INFO, t3 + " Sync Bwd");

					syncBWD();

					IFolder hulkFolder;
					try {
						hulkFolder = EclipseProjectUtil.getGravityFolder(HulkHandler.this.project.getProject(), monitor);
					} catch (final IOException e) {
						return new Status(IStatus.WARNING, HulkUiActivator.PLUGIN_ID, Messages.saveAPsFailed);
					}
					final IFile apgXmi = hulkFolder.getFile(HulkActivator.ANTI_PATTERN_XMI_NAME);
					final IFile pmXmi = hulkFolder.getFile(HulkHandler.this.project.getProject().getName() + ".xmi");
					if (!ModelSaver.saveModel(HulkHandler.this.hulk.getApg(), apgXmi, monitor)
							|| !ModelSaver.saveModel(HulkHandler.this.hulk.getApg().getPg(), pmXmi, monitor)) {
						return new Status(IStatus.WARNING, HulkUiActivator.PLUGIN_ID, Messages.saveAPsFailed);
					}

					final long t4 = System.currentTimeMillis();
					LOGGER.log(Level.INFO, t4 + " Sync Bwd - Done " + (t4 - t3) + "ms");
					LOGGER.log(Level.INFO, t4 + " Hulk Anti-Pattern Detection - Done " + (t4 - t0) + "ms");

					displayResults();

					monitor.worked(1);
				}

				return fails.isEmpty() ? Status.OK_STATUS
						: new Status(IStatus.ERROR, HulkActivator.PLUGIN_ID,
								"Anti-pattern detection failed for the following projects: " + fails.toString());
			}

		};
		this.job.setUser(true);
		this.job.schedule();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		if (initialize(event)) {

			runJob();

		} else {
			LOGGER.log(Level.INFO, Messages.nothingSelected);
		}
		return null;
	}

}
