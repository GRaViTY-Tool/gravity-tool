package momotFiles;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TInterface;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TModifier;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.impl.TMethodDefinitionImpl;
import org.gravity.hulk.HAntiPatternDetection;
import org.gravity.hulk.HAntiPatternHandling;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.typegraph.basic.BasicPackage;



public abstract class Utility {
	
	
	public static List<TClass> getDefinedClasses(TypeGraph pg){
		ArrayList<TClass> classes = new ArrayList<TClass>();
		for(TClass tClass: pg.getClasses()){
			if(tClass.getTName().equalsIgnoreCase("T")){
				continue;
			}
			if(tClass.getTName().equalsIgnoreCase("Anonymous")){
				continue;
			}
			if(tClass.isTLib()){
				continue;
			}		
			classes.add(tClass);
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
	
	
	

}
