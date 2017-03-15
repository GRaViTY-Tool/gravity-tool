package momotFiles;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;



import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TInterface;
import org.gravity.typegraph.basic.TMember;

import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TModifier;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.BasicPackage;



public class FitnessCalculator {
	public static boolean visibilityDominates(TVisibility actualVisibility, TVisibility requiredVisibility){
		
		if(actualVisibility.ordinal() >= requiredVisibility.ordinal()){
			return true;
		}
		return false;		
	}
	
	public static double allConstraints(TypeGraph graph){
		double violations = 0;
		violations += sub1(graph);
		violations += sub2(graph);
		violations += visiblility(graph);
		return violations;
		
	}
	private static List<TMethodDefinition> getMethods(TClass tClass){
		List<TMethodDefinition> methods = new ArrayList<TMethodDefinition>();
		for(TMember member: tClass.getDefines()){
			if(member instanceof TMethodDefinition){
				methods.add((TMethodDefinition)member);
			}
		}
		return methods;
	}
	
	private static void fillParentMethods(List<TMethodDefinition> parentMethods, TClass tClass){
		
		if(tClass.getParentClass() != null){
			parentMethods.addAll(getMethods(tClass.getParentClass()));
			fillParentMethods(parentMethods, tClass.getParentClass());
		}
	}
	
	private static double compareMethods(List<TMethodDefinition> parentMethods, TClass tClass){
		double violations = 0;
		for(TMember member: tClass.getDefines()){
			if(member instanceof TMethodDefinition){
				TMethodDefinition method = (TMethodDefinition) member;
				for(TMethodDefinition parentMethod: parentMethods){
					if(parentMethod.getSignature() == method.getSignature()){
						if(!visibilityDominates(method.getTModifier().getTVisibility(), parentMethod.getTModifier().getTVisibility())){
							violations++;
						}
					}
				}
			}
		}
		return violations;
	}
	
	/*
	 * Für jede Methode a gilt:
	 * wenn von a eine andere Methode b überschrieben oder versteckt wird:
	 * sichtbarkeit von a >= sichtbarkeit von b
	 * 
	 */
	public static double sub1(TypeGraph graph){
		int violations = 0;
		for(TClass tClass: graph.getClasses()){
			List<TMethodDefinition> parentMethods = new ArrayList<TMethodDefinition>();
			fillParentMethods(parentMethods, tClass);
				violations += compareMethods(parentMethods, tClass);
		}
		return violations;
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
	
	

	/*
	 * Für jede Methode a gilt:
	 * Methoden müssen die gleiche Sichtbarkeit haben wie die Interface Methoden, von denen sie abgeleitet werden
	 * kann mit sub1 kombiniert werden indem check auf interfaces und auf superklassen
	 */
	public static double sub2(TypeGraph graph){
		int violations = 0;
		for(TClass tClass: graph.getClasses()){
			List<TMethodDefinition> methods = new ArrayList<TMethodDefinition>();
			for(TInterface tInterface: tClass.getImplements()){
				fillAllMethods(methods, tInterface);
			}
			violations += compareMethods(methods, tClass);
		}
		return violations;
	}
	
	public static double visiblility(TypeGraph graph){
		int violations = 0;
		EList<TClass> classes = graph.getClasses();
		for(TClass tClass: classes){
			if(tClass.getTName() == "T" || tClass.isTLib()){
				continue;
			}
			for(TMember member : tClass.getDefines()){
					if(member instanceof TMethodDefinition){
						TMethodDefinition method = (TMethodDefinition) member;
						for(TAccess access : method.getTAccessing()){
							
							TMember targetMember = access.getTTarget();
							
							if(targetMember != null){
								TVisibility actualVisibility = targetMember.getTModifier().getTVisibility();
								TVisibility requiredVisibility = method.getMinimumRequiredVisibility(targetMember);
								if(!visibilityDominates(actualVisibility, requiredVisibility)){
									violations++;
								}
							}
						}
					}
			}
		}
		
		return violations;
	}
	
	
	public static double calculateCoupling(TypeGraph graph){
		int invoc = 0;
		for(TClass tClass: graph.getClasses()){
			
			if(tClass.isTLib()){
				for (TMember m : tClass.getDefines()) {
					invoc += 100;
					//hard penalty on moving methods to lib classes
				}
			}
			
			if(tClass.getTName().equals("T")){
				for (TMember m : tClass.getDefines()) {
					invoc += 100;
					//hard penalty on moving methods to T classes
				}
			}
			
			for (TMember m : tClass.getDefines()) {			
				for (TAccess t : m.getTAccessing()) {
					TMember tTarget = t.getTTarget();
					
					TAbstractType definingClass = tTarget.getDefinedBy();
					if ( definingClass != null && !definingClass.equals(tClass) && !definingClass.isTLib()) {
						invoc++;
					}
				}
			}
			
			
		}
		
		
		return invoc;
	}
	
	   public static void registerPackage() {
		   		BasicPackage.eINSTANCE.eClass();
		      final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		      final Map<String, Object> m = reg.getExtensionToFactoryMap();
		      m.put("xmi", new XMIResourceFactoryImpl());
		   }
	   
	   public static TypeGraph loadModel(final String model) {
		      final ResourceSet resSet = new ResourceSetImpl();
		      final Resource resource = resSet.getResource(URI.createURI(model), true);
		      if(resource == null) {
		         System.err.println("Model can not be loaded!");
		         return null;
		      }
		      final EObject root = resource.getContents().get(0);
		      if(!(root instanceof TypeGraph)) {
		         System.err.println("Model is not a ClassModel");
		         return null;
		      }
		      return (TypeGraph) resource.getContents().get(0);
		   }
	   
	   public static void evaluateModel(final TypeGraph model) {
		      if(model == null) {
		         System.err.println("No correct model loaded... abort.");
		         return;
		      }
		   }
	   
	   public static void evaluateModel(final String model) {
		      registerPackage();
		      evaluateModel(loadModel(model));
		   }
	   
	   public static void main(final String[] args) {
		      if(args.length == 0) {
		         System.err.println("Please provide the model as parameter.");
		         System.err.println("Example: java -jar CRAIndexCalculator.jar ToEvaluate.xmi");
		         return;
		      }
		      evaluateModel(args[0]);
		   }
	   private FitnessCalculator() {}
}
