package org.gravity.hulk.ui.handlers.scan;

import java.io.IOException;
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
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
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
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.eclipse.io.ModelSaver;
import org.gravity.eclipse.selection.SelectionHelper;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.HulkActivator;
import org.gravity.hulk.annotations.activator.AnnotationsActivator;
import org.gravity.hulk.antipatterngraph.AntipatterngraphFactory;
import org.gravity.hulk.detection.HulkDetector;
import org.gravity.hulk.impl.HAntiPatternHandling;
import org.gravity.hulk.ui.HulkUiActivator;
import org.gravity.hulk.ui.Messages;
import org.gravity.hulk.ui.dialogs.AntiPatternSelectionDialog;
import org.gravity.hulk.ui.dialogs.DetectionTreeContentProvider;
import org.gravity.hulk.ui.dialogs.DetectionTreeLabelProvider;
import org.gravity.hulk.ui.dialogs.ResultDialog;

public abstract class HulkHandler extends AbstractHandler {

	private static final Logger LOGGER = Logger.getLogger(HulkHandler.class);

	protected boolean javaAnnotationsEnabled;
	protected HAntiPatternHandling hulk;
	protected IPGConverter converter;
	protected Set<HDetector> selectedDetectors;
	protected Set<HDetector> executedDetectors;
	protected Set<Class<? extends HDetector>> selection;
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

	protected HulkHandler() {
		this.setJobName();
		this.setSelectionDialogInput();
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		return true;
	}

	private void initHulk(final IProgressMonitor monitor) {
		final var apg = AntipatterngraphFactory.eINSTANCE.createHAntiPatternGraph();
		final var pg = this.converter.getPG();
		apg.setPg(pg);

		this.hulk.setApg(apg);
		this.hulk.setProgramLocation(this.project.getProject().getLocation().toString());

		monitor.worked(1);
		monitor.setTaskName(Messages.detect);
	}

	private void syncBWD(final IProgressMonitor monitor) {
		final var configuration = new HashMap<String, String>();

		this.detector = new HulkDetector(this.hulk, configuration);

		if (this.javaAnnotationsEnabled) {
			this.converter.syncProjectBwd(consumer -> {

				LOGGER.log(Level.INFO, System.currentTimeMillis() + " Hulk Detect AP");
				this.detector.detectSelectedAntiPattern(this.selection, this.selectedDetectors, this.executedDetectors);
				LOGGER.log(Level.INFO, System.currentTimeMillis() + " Hulk Detect AP - done");

			}, monitor);
			final var folder = this.project.getProject().getFolder("src/org/gravity/hulk/annotations"); //$NON-NLS-1$
			if (folder.exists()) {
				try {
					folder.delete(true, monitor);
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

	private IPath getAnnotationsOut(final IProgressMonitor monitor) throws IOException {
		final var folder = EclipseProjectUtil.getGravityFolder(this.project.getProject(), monitor);
		final var annotationsOut = folder.getFile(AnnotationsActivator.ANNOTATIONS_JAR);
		if (!annotationsOut.exists()) {
			try (var in = new URL(AnnotationsActivator.ANNOTATIONS_JAR_PLATFORM).openConnection()
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
				final var cp = this.project.getRawClasspath();
				final var cpNew = new IClasspathEntry[cp.length + 1];
				System.arraycopy(cp, 0, cpNew, 0, cp.length);
				cpNew[cp.length] = JavaCore.newLibraryEntry(annotationsOut.getFullPath(), null, null);
				this.project.setRawClasspath(cpNew, monitor);
			} catch (final JavaModelException e) {
				LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
			}
		}
		return annotationsOut.getFullPath();
	}

	private AntiPatternSelectionDialog createDialog(final String title, final String message) {

		final var dialog = new AntiPatternSelectionDialog(this.window.getShell(),
				new DetectionTreeLabelProvider(), new DetectionTreeContentProvider(), SWT.None);

		dialog.setTitle(title);
		dialog.setMessage(message);
		dialog.setContainerMode(true);
		dialog.setInput(this.selectionDialogInput);
		dialog.addJavaAnnotationsSelectedListener(new SelectionListener() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				final var button = (Button) e.widget;
				HulkHandler.this.javaAnnotationsEnabled = button.getSelection();
			}

			@Override
			public void widgetDefaultSelected(final SelectionEvent e) {
				LOGGER.info("Default selected: " + e.getSource());
			}
		});
		return dialog;
	}

	private void initializeSelection(final AntiPatternSelectionDialog dialog) {
		this.selection = new HashSet<>();
		for (final Object selected : dialog.getResult()) {
			if (selected instanceof final Class<?> eClass && HDetector.class.isAssignableFrom(eClass)) {
				this.selection.add(eClass.asSubclass(HDetector.class));
			}
		}
	}

	protected void displayResults() {
		final var dialog = new ResultDialog(HulkHandler.this.window.getShell(),
				HulkHandler.this.selectedDetectors, HulkHandler.this.executedDetectors, "Hulk Detection Results");
		Display.getDefault().asyncExec(dialog::open);
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
	private boolean initialize(final ExecutionEvent event) throws ExecutionException {
		LOGGER.log(Level.INFO, Messages.scan);

		this.window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		// Open the Anti-Pattern Selection dialog
		final var dialog = this.createDialog(Messages.apSelection, Messages.select);
		dialog.open();

		if (dialog.getReturnCode() == Window.CANCEL) {
			return false;
		}

		this.initializeSelection(dialog);

		if (!this.selection.isEmpty()) {

			// Start Hulk, details implemented by subclasses
			this.setHulk();
			this.selectedDetectors = new HashSet<>();
			this.executedDetectors = new HashSet<>();

			final var service = this.window.getSelectionService();
			final var structured = (IStructuredSelection) service.getSelection();
			this.firstSelectionElement = structured.getFirstElement();
			this.workspaceSelection = Arrays.asList(structured.toArray());
			return true;
		}
		return false;
	}

	private void runJob() {
		this.job = new HulkJob(this.jobName, this);
		this.job.setUser(true);
		this.job.schedule();
	}

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		if (this.initialize(event)) {
			this.runJob();
		} else {
			LOGGER.log(Level.INFO, Messages.nothingSelected);
		}
		return null;
	}

	private static final class HulkJob extends Job {

		private final HulkHandler handler;

		private HulkJob(final String name, final HulkHandler handler) {
			super(name);
			this.handler = handler;
		}

		@Override
		protected IStatus run(final IProgressMonitor monitor) {
			monitor.beginTask(Messages.hulkAPDetection, 3);

			final var projects = SelectionHelper.getJavaProjects(this.handler.workspaceSelection);
			final var fails = new ArrayList<String>();
			for (final IJavaProject javaProject : projects) {
				this.handler.project = javaProject;
				final var t0 = System.currentTimeMillis();
				LOGGER.log(Level.INFO, t0 + " Hulk Anti-Pattern Detection");

				final var libs = this.initLibs(monitor);

				try {
					this.handler.converter = GravityActivator.getDefault()
							.getNewConverter(this.handler.project.getProject());
				} catch (final NoConverterRegisteredException e) {
					return new Status(IStatus.ERROR, HulkUiActivator.PLUGIN_ID,
							"Please install a converter and restart the task.");
				} catch (final CoreException e) {
					return new Status(IStatus.ERROR, HulkUiActivator.PLUGIN_ID,
							"The converter extensionpoint cannot be accessed, pleade contact the GRaViTY developers.");
				}

				final var success = this.handler.converter.convertProject(libs, monitor);
				if (!success || (this.handler.converter.getPG() == null)) {
					LOGGER.log(Level.ERROR,
							"Creating PG from project failed: " + this.handler.project.getProject().getName());
					fails.add(javaProject.getProject().getName());
					continue;
				}

				this.handler.initHulk(monitor);

				final var t3 = System.currentTimeMillis();
				LOGGER.log(Level.INFO, t3 + " Sync Bwd");

				this.handler.syncBWD(monitor);

				IFolder hulkFolder;
				try {
					hulkFolder = EclipseProjectUtil.getGravityFolder(this.handler.project.getProject(),
							monitor);
				} catch (final IOException e) {
					return new Status(IStatus.WARNING, HulkUiActivator.PLUGIN_ID, Messages.saveAPsFailed);
				}
				final var apgXmi = hulkFolder.getFile(HulkActivator.ANTI_PATTERN_XMI_NAME);
				final var pmXmi = hulkFolder.getFile(this.handler.project.getProject().getName() + ".xmi");
				if (!ModelSaver.saveModel(this.handler.hulk.getApg(), apgXmi)
						|| !ModelSaver.saveModel(this.handler.hulk.getApg().getModel(), pmXmi)) {
					return new Status(IStatus.WARNING, HulkUiActivator.PLUGIN_ID, Messages.saveAPsFailed);
				}

				final var t4 = System.currentTimeMillis();
				LOGGER.log(Level.INFO, t4 + " Sync Bwd - Done " + (t4 - t3) + "ms");
				LOGGER.log(Level.INFO, t4 + " Hulk Anti-Pattern Detection - Done " + (t4 - t0) + "ms");

				this.handler.displayResults();

				monitor.worked(1);
			}

			return fails.isEmpty() ? Status.OK_STATUS
					: new Status(IStatus.ERROR, HulkActivator.PLUGIN_ID,
							"Anti-pattern detection failed for the following projects: " + fails.toString());
		}

		private Set<IPath> initLibs(final IProgressMonitor monitor) {
			final Set<IPath> libs = new HashSet<>();
			if (this.handler.javaAnnotationsEnabled) {
				IPath annotations;
				try {
					annotations = this.handler.getAnnotationsOut(monitor);
					libs.add(annotations);
				} catch (final IOException e) {
					LOGGER.warn("Couldn't copy annotations to project! Disabled generation Java annotations.");
					this.handler.javaAnnotationsEnabled = false;
				}
			}
			return libs;
		}
	}

}
