package org.gravity.modisco.dataflow;

import static guru.nidi.graphviz.model.Factory.mutGraph;
import static guru.nidi.graphviz.model.Factory.mutNode;

import java.io.File;
import java.io.IOException;
import java.util.List;

import guru.nidi.graphviz.attribute.RankDir;
import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.MutableGraph;
import guru.nidi.graphviz.model.MutableNode;

public class GraphVisualizer {
	
	// TODO Counter or project name to alternate file name?
	
	// TODO Add HashMap for simpler management of graph nodes?
	
	public static void drawGraphs(List<StatementHandlerDataFlow> handlers) {
		int i = 0;
		for (StatementHandlerDataFlow handler : handlers) {
			MutableGraph g = mutGraph("example1").setDirected(true).graphAttrs().add(RankDir.TOP_TO_BOTTOM).graphAttrs().add("dpi", 72);
			for (FlowNode node : handler.getAlreadySeen().values()) {
				MutableNode graphNode = mutNode(node.getModelElement().toString());
				g.add(graphNode);
				// TODO Optimize/fix
				for (FlowNode out : node.getOutRef()) {
					System.out.println(node.getOutRef().toString());
					if (!g.nodes().contains(out)) {
						graphNode.addLink(mutNode(out.getModelElement().toString()));
					}
				}
				for (FlowNode in : node.getInRef()) {
					System.out.println(node.getInRef().toString());
					if (!g.nodes().contains(in)) {
						mutNode(in.getModelElement().toString()).addLink(graphNode);
					}
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
}
