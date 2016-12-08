package org.gravity.hulk.detection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import org.eclipse.emf.ecore.EClass;
import org.gravity.hulk.HAntiPatternHandling;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.Messages;
import org.moflon.core.dfs.DepthFirstSearch;
import org.moflon.core.dfs.DfsFactory;
import org.moflon.core.dfs.Node;

public class HulkDetector {
	
	private static void handleDetector(HDetector detector, Stack<HDetector> worklist, Set<HDetector> processed_detectors, HAntiPatternHandling hulk){
		

		initDFS().processNode(detector);

		Comparator<Node> comp = new Comparator<Node>() {

			@Override
			public int compare(Node arg0, Node arg1) {
				return arg0.getPostTraversal() - arg1.getPostTraversal();
			}

		};

		List<HDetector> sorted = new ArrayList<>();
		for (HDetector n : hulk.getHDetector()) {
			if (n.getPreTraversal() > 0) {
				sorted.add(n);
			}
		}
		sorted.sort(comp);

		for (HDetector n : sorted) {
			if (!processed_detectors.contains(n)) {
				if (worklist.contains(n)) {
					worklist.remove(n);
				}
				long t2 = System.currentTimeMillis();
				System.out.println(t2 + " Hulk " + n.getGuiName());
				if (n.detect(hulk.getApg())) {
					n.setPostTraversal(0);
					n.setPreTraversal(0);
					processed_detectors.add(n);
				} else {
					System.err.println(Messages.getString("detector.failed") + n); //$NON-NLS-1$
				}
				long t3 = System.currentTimeMillis();
				System.out.println(t3 + " Hulk " + n.getGuiName() + " - done " + (t3 - t2) + "ms");

			}
		}
	}
	
	
	public static boolean detectSelectedAntiPattern(Stack<HDetector> worklist, Set<HDetector> processed_detectors, HAntiPatternHandling hulk){
		
		long h0 = System.currentTimeMillis();
		System.out.println(h0 + " Hulk Anti-Pattern Detection");
		while (!worklist.isEmpty()) {
			HDetector detector = worklist.pop();
			handleDetector(detector, worklist, processed_detectors, hulk);
		}
		long h1 = System.currentTimeMillis();
		System.out.println(h1 + " Hulk Anti-Pattern Detection - done " + (h1 - h0) + "ms");

		return true;
	}

	public static boolean detectSelectedAntiPattern(Set<EClass> selection, HAntiPatternHandling hulk,
			Set<HDetector> selected_detectors, Set<HDetector> processed_detectors) {
		Stack<HDetector> worklist = new Stack<>();

		// Fill worklist
		for (HDetector detector : hulk.getHDetector()) {
			if (selection.contains(detector.eClass())) {
				selected_detectors.add(detector);
				worklist.add(detector);
			}
		}
		
		if(selected_detectors.size()!=selection.size()){
			System.err.println("Not all detecors found.");
			return false;
		}
		
		return detectSelectedAntiPattern(worklist, processed_detectors, hulk);		
	}

	private static DepthFirstSearch initDFS() {
		DepthFirstSearch dfs = DfsFactory.eINSTANCE.createDepthFirstSearch();
		DepthFirstSearch delegate = DfsFactory.eINSTANCE.createDepthFirstSearch();
		dfs.setDelegate(delegate);
		delegate.setDelegate(dfs);
		return dfs;
	}
}
