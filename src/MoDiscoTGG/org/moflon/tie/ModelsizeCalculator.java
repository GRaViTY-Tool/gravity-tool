package MoDiscoTGG.org.moflon.tie;

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

	private static long n = 0, e = 0;

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
	}

	private static long countSourceElements(TripleMatch tripleMatch) {
		Set<EObject> sourceElements = new HashSet<>(tripleMatch.getSourceElements());
		return tripleMatch.getCreatedElements().stream()
				.map(element -> element instanceof EMoflonEdge ? ((EMoflonEdge) element).getSrc() : element)
				.filter(sourceElements::contains).count();
	}

	private static void init() {
		EPackage corrPackage = MoDiscoTGGPackage.eINSTANCE;
		corrPackage.getName();
		corrPackage.eResource();
	}
}
