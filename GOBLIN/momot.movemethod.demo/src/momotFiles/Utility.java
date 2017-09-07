package momotFiles;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.gravity.hulk.HAntiPatternDetection;
import org.gravity.hulk.HAntiPatternHandling;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TInterface;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.annotations.TAnnotationType;



public abstract class Utility {
	
	
	public static boolean isDefinedClass(TAbstractType tClass){
		if(tClass.getTName().equalsIgnoreCase("T")){
			return false;
		}
		if(tClass.getTName().equalsIgnoreCase("Anonymous")){
			return false;
		}
		if(tClass.isTLib()){
			return false;
		}	
		return true;
	}
	
	public static List<TClass> getDefinedClasses(TypeGraph pg){
		ArrayList<TClass> classes = new ArrayList<TClass>();
		for(TClass tClass: pg.getClasses()){
			if(isDefinedClass(tClass)){
				classes.add(tClass);
			}			
		}
		return classes;
	}
	
	public static boolean isSubClass(TClass subClass, TClass superClass){
		TClass parentClass = subClass.getParentClass();
		while(parentClass != null){
			if(parentClass == superClass){
				return true;
			}
			parentClass = parentClass.getParentClass();
		}
		return false;
	}
	
	public static List<TMethodDefinition> getMethodDefinitions(TClass tClass){
		ArrayList<TMethodDefinition> methods = new ArrayList<TMethodDefinition>();
		for(TMember member: tClass.getDefines()){
			if(member instanceof TMethodDefinition){
				methods.add((TMethodDefinition)member);
			}
		}
		return methods;
	}
	
	public static boolean visibilityDominates(TVisibility actualVisibility, TVisibility requiredVisibility){
		
		if(actualVisibility.ordinal() >= requiredVisibility.ordinal()){
			return true;
		}
		return false;		
	}
	
	public static TypeGraph getPG(EGraph graph){
		TypeGraph pg = null;
		EObject root = graph.getRoots().get(0);
		if( root instanceof TypeGraph){
			pg = (TypeGraph) root;
		}
		
		if( root instanceof HAntiPatternGraph){
			pg = ((HAntiPatternGraph) root).getPg();
		}
		
		if( root instanceof HAntiPatternHandling){
			pg = ((HAntiPatternDetection) root).getApg().getPg();
		}
		return pg;
	}
	
	public static boolean isSecurityAnnotation(TAnnotation annotation){
		TAnnotationType type = annotation.getType();
		if(type == null){
			return false;
		}
		if(annotation.getType().getTName().equals("High")){
			return true;
		}
		if(annotation.getType().getTName().equals("Critical")){
			return true;
		}		
		if(annotation.getType().getTName().equals("Secrecy")){
			return true;
		}
		if(annotation.getType().getTName().equals("Integrity")){
			return true;
		}
		
		return false;
		
	}
	
	
	public static EList<TClass> getAllChildren(TClass sourceClass) {
		
		EList<TClass> childList = new BasicEList<TClass>();
		
		for (TClass child : sourceClass.getChildClasses()) {
			childList.add(child);
			childList.addAll(getAllChildren(child));
		}
		
		return childList;
		
	}
	
	 static void fillParentMethods(List<TMethodDefinition> parentMethods, TClass tClass){
			
		if(tClass.getParentClass() != null){
			for(TMember member: tClass.getParentClass().getDefines()){
				if(member instanceof TMethodDefinition){
					parentMethods.add((TMethodDefinition)member);
				}
			}
			fillParentMethods(parentMethods, tClass.getParentClass());
		}
	}
	
	public static List<TMethodDefinition> getAllParentsMethods(TClass childClass){
		List<TMethodDefinition> parentMethods = new ArrayList<TMethodDefinition>();
		fillParentMethods(parentMethods, childClass);
		return parentMethods;
	}
	
	private static void fillAllMethods(List<TMethodDefinition> methods, TInterface tInterface){
		for(TMember sig: tInterface.getDefines()){
			if(sig instanceof TMethodDefinition){
				methods.add((TMethodDefinition)sig);
			}
		}
		for(TInterface parentInterface: tInterface.getParentInterfaces()){
			fillAllMethods(methods, parentInterface);
		}
	}
	
	public static List<TMethodDefinition> getImplementedInterfaceMethods(TClass tClass){
		List<TMethodDefinition> methods = new ArrayList<TMethodDefinition>();
		for(TInterface tInterface: tClass.getImplements()){
			fillAllMethods(methods, tInterface);
		}
		return methods;
	}

}
