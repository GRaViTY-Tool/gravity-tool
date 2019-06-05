package org.gravity.modisco.dataflow;

import static guru.nidi.graphviz.model.Factory.mutGraph;
import static guru.nidi.graphviz.model.Factory.mutNode;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.MethodInvocation;
import org.eclipse.gmt.modisco.java.NamedElement;

import guru.nidi.graphviz.attribute.Color;
import guru.nidi.graphviz.attribute.Label;
import guru.nidi.graphviz.attribute.RankDir;
import guru.nidi.graphviz.attribute.Style;
import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.MutableGraph;
import guru.nidi.graphviz.model.MutableNode;

public class GraphVisualizer {
	
	// TODO Counter or project name to alternate file name?
	
	public static void drawGraphs(List<StatementHandlerDataFlow> handlers) {
		int i = 0;
		for (StatementHandlerDataFlow handler : handlers) {
			MutableGraph g = mutGraph("example1").setDirected(true).graphAttrs().add(RankDir.TOP_TO_BOTTOM).graphAttrs().add("dpi", 72);
			HashMap<FlowNode, MutableNode> graphNodes = new HashMap<>();
			// Creating a graph node for each FlowNode
			Collection<FlowNode> alreadySeenNodes = handler.getAlreadySeen().values();
			for (FlowNode node : alreadySeenNodes) {
				MutableNode graphNode = getDotNode(node);
				g.add(graphNode);
				graphNodes.put(node, graphNode);
			}
			// Set containment edges (+ links to nodes of called/accessed methods/fields) for all graph nodes
			for (FlowNode node : alreadySeenNodes) {
				MutableNode graphNode = graphNodes.get(node);
				EObject eContainer = node.getModelElement().eContainer();
				FlowNode flowCont = handler.getAlreadySeen().get(eContainer);
				if(flowCont == null) {
					continue;
				}
				if (node.getModelElement() instanceof MethodInvocation) {
					graphNode.addLink(graphNode.linkTo(getDotNode(handler.getAlreadySeen().get(((MethodInvocation) node.getModelElement()).getMethod())).add(Style.FILLED, Color.AZURE)).with(Style.DASHED, Label.of("calls"), Color.BLUE));
				}
				graphNodes.get(flowCont).addLink(graphNode);
			}
			// Set flow edges
			for (FlowNode node : alreadySeenNodes) {
				MutableNode graphNode = graphNodes.get(node);
				for (FlowNode out : node.getOutRef()) {
					MutableNode outNode = graphNodes.get(out);
					graphNode.addLink(graphNode.linkTo(outNode).with(Style.DOTTED, Label.of("flows to"), Color.GRAY));
				}
			}
			try {
				Graphviz.fromGraph(g).width(10000).render(Format.PNG).toFile(new File("example" + File.separator + "ex" + i + ".png"));
				System.out.println("Created dot graph");
			} catch (IOException e) {
				e.printStackTrace();
			}
			i++;
		}
	}

	private static MutableNode getDotNode(FlowNode node) {
		EObject modelElement = node.getModelElement();
		String label = modelElement.eClass().getName();
		if (modelElement instanceof NamedElement) {
			label += " " + ((NamedElement) modelElement).getName();
		}
		MutableNode graphNode = mutNode(Integer.toString(modelElement.hashCode())).add(Label.of(label));
		return graphNode;
	}
}
