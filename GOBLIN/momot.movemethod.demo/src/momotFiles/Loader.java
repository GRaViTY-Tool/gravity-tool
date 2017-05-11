package momotFiles;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.TypeGraph;

import ConstraintCalculators.SubTypesConstraintCalculator;

public class Loader {

	
	public static TypeGraph load(String file){
		BasicPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Get the resource
        Resource resource = resSet.getResource(URI.createURI("input/"+file+".xmi"), true);
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
       	return (TypeGraph) resource.getContents().get(0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TypeGraph pg = load("sub1_Test_withoutViolation");
		
		
		double violations = SubTypesConstraintCalculator.sub1(pg).size();
		
		TMethodDefinition method = pg.getMethods().get(0).getSignatures().get(0).getDefinitions().get(0);
		TFieldDefinition field = pg.getFields().get(0).getSignatures().get(0).getDefinitions().get(0);
		
		TVisibility vis = method.getMinimumRequiredVisibility(field);
		
		int i =0;
		

	}

}
