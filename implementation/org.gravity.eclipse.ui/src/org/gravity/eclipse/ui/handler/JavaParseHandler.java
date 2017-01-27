package org.gravity.eclipse.ui.handler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.Messages;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.io.ModelSaver;
import org.gravity.typegraph.basic.TypeGraph;

public class JavaParseHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		ISelectionService service = window.getSelectionService();
		IStructuredSelection structured = (IStructuredSelection) service.getSelection();
		List<Object> selection = Arrays.asList(structured.toArray());

		Job job = new Job("Create PG") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				for (Object entry : selection) {
					if(monitor.isCanceled()){
						return Status.CANCEL_STATUS;
					}
					if (entry instanceof IResource) {
						throw new RuntimeException(Messages.JavaParseHandler_0 + entry);
					} else if (entry instanceof IJavaProject) {
						IJavaProject iJavaProject = (IJavaProject) entry;
						process(iJavaProject, monitor);
					} else if (entry instanceof IPackageFragment) {
						throw new RuntimeException(Messages.JavaParseHandler_1 + entry);
					} else {
						throw new RuntimeException(Messages.JavaParseHandler_2 + entry);
					}
				}
				return Status.OK_STATUS;
			}

			private boolean process(IJavaProject iJavaProject, IProgressMonitor monitor) {
				IProject iProject = iJavaProject.getProject();
				
				GravityActivator gravityActivator = GravityActivator.getDefault();
				IPGConverter converter = gravityActivator.getConverter(iProject);
				
				boolean success = converter.convertProject(iJavaProject, monitor);
				gravityActivator.discardConverter(iProject);
				if (!success) {
					System.err.println("No PG has been created for "+iProject.getName());
					return false;
				}
				TypeGraph pg = converter.getPG();
				IFolder folder = iProject.getFolder("gravity");
				if(!folder.exists()){
					try {
						folder.create(true, true, monitor);
					} catch (CoreException e) {
						System.err.println("Couldn't create output location: "+folder.getLocation().toString());
					}
				}
				IFile file = folder.getFile(iProject.getName()+".xmi");
				URI out = URI.createFileURI(file.getLocation().toString());
				Resource original = pg.eResource();
				original.setURI(out);
				ModelSaver.saveModel(pg, file, monitor);
				return true;
			}
		};
		job.setUser(true);
		job.schedule();

		return null;
	}

	@Override
	public boolean isEnabled() {
		GravityActivator gravity = GravityActivator.getDefault();
		return gravity.getSelectedConverterFactory().supportsFWDTrafo();
	}

	@Override
	public boolean isHandled() {
		return GravityActivator.getDefault().getSelectedConverterFactory().supportsFWDTrafo();
	}
}