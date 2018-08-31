package org.gravity.security.analysis.handlers;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.security.analysis.Activator;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.annotations.TAnnotationType;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TypeGraph;
import org.osgi.framework.Bundle;

public class PublicInterfacesAccessHandler extends AbstractHandler {

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
						throw new RuntimeException();
					} else if (entry instanceof IJavaProject) {
						IJavaProject iJavaProject = (IJavaProject) entry;
						process(iJavaProject, monitor);
					} else if (entry instanceof IPackageFragment) {
						throw new RuntimeException();
					} else {
						throw new RuntimeException();
					}
				}
				return Status.OK_STATUS;
			}
			


			private boolean process(IJavaProject iJavaProject, IProgressMonitor monitor) {
				IProject iProject = iJavaProject.getProject(); 
				
				GravityActivator gravityActivator = GravityActivator.getDefault();
				IPGConverter converter;
				try {
					converter = gravityActivator.getConverter(iProject);
				} catch (NoConverterRegisteredException e1) {
					return false;
				}
				
				Hashtable<String, IPath> libs = new Hashtable<>();
				
				IExtensionRegistry registry = Platform.getExtensionRegistry();
				IExtensionPoint point = registry.getExtensionPoint(Activator.EXTENSIONPOINT_REGISTER_PROJECT);
				for(IConfigurationElement element : point.getConfigurationElements()){
					try{
						String plugin_id = element.getAttribute("plugin");
						Bundle bundle = Platform.getBundle(plugin_id);
						if(bundle==null){
							continue;
						}
						File file = FileLocator.getBundleFile(bundle);
						libs.put(plugin_id, new Path(file.getAbsolutePath()));
					}
					catch(IOException e){
						e.printStackTrace();
					}
				}
								
				boolean success = converter.convertProject(iJavaProject, libs.values(), monitor);
				gravityActivator.discardConverter(iProject);
				if (!success) {
					System.out.println("No PG has been created for "+iProject.getName());
					return false;
				}
				TypeGraph pg = converter.getPG();
				
				Set<String> names = new HashSet<String>();
				try {
					for(IPackageFragment p : iJavaProject.getPackageFragments()){
						for(ICompilationUnit cu : p.getCompilationUnits()){
							for(IType t : cu.getTypes()){
								names.add(t.getFullyQualifiedName());
							}
						}
					}
				} catch (JavaModelException e) {
					e.printStackTrace();
				}
				
				return inspect(pg, names);
			}
		};
		job.setUser(true);
		job.schedule();

		return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		return true;
	}

	private boolean inspect(TypeGraph pg, Set<String> names) {
		TAbstractType high = pg.getType("org.gravity.security.annotations.requirements.High");
		if(high == null){
			System.out.println("Nothing to check!");
			return true;
		}
		Set<TAnnotationType> protectors = new HashSet<>();
		protectors.add((TAnnotationType) high);
		
		TAbstractType api = pg.getType("org.gravity.security.annotations.access.Api");
		Set<TAnnotationType> allowed = new HashSet<>();
		if(api == null){
			System.err.println("Warning no API specified");
		}
		else{
			allowed.add((TAnnotationType) api);
		}
		
		searchViolations(protectors, allowed, names);
		
		return false;
	}

	private void searchViolations(Set<TAnnotationType> protectors, Set<TAnnotationType> allowed, Set<String> names) {
		for(TAnnotationType req : protectors){
			for(TAnnotation annotation : req.getAnnotations()){
				TAnnotatable annotated = annotation.getTAnnotated();
				if (annotated instanceof TMember) {
					TMember member = (TMember) annotated;
					dfs(member, allowed, names, new HashSet<TMember>());
				}
			}
		}
	}

	private void dfs(TMember member, Set<TAnnotationType> allowed, Set<String> names, Set<TMember> visited) {
		Set<TMember> accessing = new HashSet<>();
		for(TAccess access : member.getAccessedBy()){
			TMember tSource = access.getTSource();
			if(!visited.contains(tSource)){
				accessing.add(tSource);
			}
		}
		for(TMember tSource : accessing){
			visited.add(tSource);
			if(names.contains(tSource.getDefinedBy().getFullyQualifiedName())){
				System.err.println("Access violation for \""+member.getSignatureString()+"\" at \""+tSource.getSignatureString()+"\" in class \""+tSource.getDefinedBy().getFullyQualifiedName()+"\"");
				continue;
			}
			if(tSource.getAccessedBy().size()==0){ //TODO: Replace by access modifier check
				boolean bool = false;
				for(TAnnotation annotation: tSource.getTAnnotation()){
					bool |= allowed.contains(annotation.getType());
				}
				if(!bool){
					System.out.println("Potential access violation for \""+member.getSignatureString()+"\" at \""+tSource.getSignatureString()+"\" in class \""+tSource.getDefinedBy().getFullyQualifiedName()+"\"");
				}
			}
			dfs(tSource, allowed, names, visited);
		}
	}

}
