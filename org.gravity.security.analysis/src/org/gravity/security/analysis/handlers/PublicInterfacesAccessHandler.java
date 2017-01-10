package org.gravity.security.analysis.handlers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IPluginPrerequisite;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.modisco.java.discoverer.AbstractDiscoverJavaModelFromProject;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TAnnotatable;
import org.gravity.typegraph.basic.TAnnotation;
import org.gravity.typegraph.basic.TAnnotationType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TypeGraph;

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
				IPGConverter converter = gravityActivator.getConverter(iProject);
				
				Set<IPath> libs = new HashSet<>();
				
				try {
					for(IClasspathEntry entry : iJavaProject.getReferencedClasspathEntries()){
						libs.add(entry.getPath());
					}
				} catch (JavaModelException e) {
					e.printStackTrace();
				}
				
				try {
					for(IJavaProject proj : AbstractDiscoverJavaModelFromProject.computeRequiredProjects(iJavaProject)){
						libs.add(proj.getProject().getLocation());
					}
				} catch (JavaModelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					if(iJavaProject.getProject().hasNature("org.eclipse.pde.PluginNature")){
						
					}
				} catch (CoreException e) {
					e.printStackTrace();
				}
				
				boolean success = converter.convertProject(iJavaProject, libs, monitor);
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
		TAbstractType api = pg.getType("org.gravity.security.annotations.access.Api");
		
		Set<TAnnotationType> protectors = new HashSet<>();
		protectors.add((TAnnotationType) high);
		
		Set<TAnnotationType> allowed = new HashSet<>();
		allowed.add((TAnnotationType) api);
		
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
