package org.moflon.tie;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.moflon.core.utilities.eMoflonEMFUtil;
import org.moflon.tgg.runtime.EMoflonEdge;
import org.moflon.tgg.runtime.PrecedenceStructure;
import org.moflon.tgg.runtime.TripleMatch;

import MoDiscoTGG.MoDiscoTGGPackage;

public class ModelsizeCalculator {

	private static long n=0,e=0;
	
	public static void main(String[] args) {
		init();

		ResourceSet rs = eMoflonEMFUtil.createDefaultResourceSet();
		Resource r = rs.getResource(eMoflonEMFUtil.createFileURI("instances/fwd.protocol.xmi", true), true);
		PrecedenceStructure protocol = (PrecedenceStructure) r.getContents().get(0);
		System.out.println("Starting count");
		long start = System.currentTimeMillis();
		long size = protocol.getTripleMatches().stream().mapToLong(ModelsizeCalculator::countSourceElements).sum();
		System.out.println("Counting completed in " + (System.currentTimeMillis() - start) / 1000d + "s");
		System.out.println("size of model: " + size);
		//debug start
		System.out.println("edges: "+e+" nodes: "+n);
		//debug end
	}

	private static long countSourceElements(TripleMatch tripleMatch) {
		Set<EObject> sourceElements = new HashSet<>(tripleMatch.getSourceElements());
		long c = tripleMatch.getCreatedElements().stream().filter(e -> ModelsizeCalculatorcontains(sourceElements, e))
				.count();
		//debug start
		List<EObject> collect = tripleMatch.getCreatedElements().stream().filter(e -> ModelsizeCalculatorcontains(sourceElements, e)).collect(Collectors.toList());
		long edges =collect.stream().filter(e->e instanceof EMoflonEdge).count();
		n+=collect.size()-edges;
		e+=edges;
		//debug end
		return c;
	}

	private static boolean ModelsizeCalculatorcontains(Set<EObject> sourceElements, EObject e) {
		if (sourceElements.contains(e))
			return true;
		if (!(e instanceof EMoflonEdge)) {
			return false;
		}
		EMoflonEdge toCheck = (EMoflonEdge) e;
		for (EObject sourceEntry : sourceElements) {
			if (!(sourceEntry instanceof EMoflonEdge)) {
				continue;
			}
			EMoflonEdge sourceEdge = (EMoflonEdge) sourceEntry;
			return sourceEdge.getName().equals(toCheck.getName()) && sourceEdge.getSrc().equals(toCheck.getSrc())
					&& sourceEdge.getTrg().equals(toCheck.getTrg());
		}

		return false;
	}

	private static void init() {
		EPackage corrPackage = MoDiscoTGGPackage.eINSTANCE;
		corrPackage.getName();
		corrPackage.eResource();
	}
	// 18692/24636 nodes/edges created for source
	// 6788/12732 nodes/edges created for target
	// 13236/26472 nodes/edges created for correspondence
}
