package org.gravity.modisco.processing.fwd.dataflow;

import static guru.nidi.graphviz.model.Factory.mutGraph;
import static guru.nidi.graphviz.model.Factory.mutNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.eclipse.modisco.java.Assignment;
import org.eclipse.modisco.java.ClassInstanceCreation;
import org.eclipse.modisco.java.FieldDeclaration;
import org.eclipse.modisco.java.MethodInvocation;
import org.eclipse.modisco.java.NamedElement;
import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MGravityModel;

import guru.nidi.graphviz.attribute.Color;
import guru.nidi.graphviz.attribute.Label;
import guru.nidi.graphviz.attribute.Style;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.engine.Rasterizer;
import guru.nidi.graphviz.model.MutableGraph;
import guru.nidi.graphviz.model.MutableNode;

/**
 * Functionality to draw dot graphs with intra-procedural data flow edges for
 * method/field definitions of Java programs. The drawn graphs are based on the
 * program representations created by the data flow handlers.
 *
 * @author dmebus
 * @author speldszus
 *
 */
public final class GraphVisualizer {

	private static final Logger LOGGER = Logger.getLogger(GraphVisualizer.class);

	private GraphVisualizer() {
		// This class shouldn't be instantiated
	}

	/**
	 * Draws the dot graphs for each StatementHandlerDataFlow instance in the given
	 * list. The graphs are exported as PNG image files to a folder with the given
	 * folder name (inside the project folder).
	 *
	 * @param model
	 *            The model of which graphs should be drawn
	 * @param handlers
	 *            The list of StatementHandlerDataFlow instances, for which a graph
	 *            is supposed to be drawn.
	 *
	 * @param output
	 *            The folder that should be used as the output folder. If a folder
	 *            with that name already exists, it is used.
	 */
	public static void drawGraphs(MGravityModel model, List<MemberHandler> handlers, IFolder output) {
		for (int i = 0; i < handlers.size(); i++) {
			final MemberHandler handler = handlers.get(i);
			final EObject memberDef = handler.getMemberDef();
			String className = "Unknown";
			String memberName = "Unknown";
			String memberType = "Misc";
			final EObject defContainer = memberDef.eContainer();
			if (memberDef instanceof MAbstractMethodDefinition) {
				memberName = ((NamedElement) memberDef).getName();
				memberType = "Method";
				if (defContainer instanceof AnonymousClassDeclaration) {
					className = "Anonymous-class";
				} else {
					className = ((NamedElement) defContainer).getName();
				}
			} else if (memberDef instanceof FieldDeclaration) {
				memberType = "Field";
				memberName = ((FieldDeclaration) memberDef).getFragments().get(0).getName();
				className = getName(defContainer);
			}
			final MutableGraph graph = mutGraph("graph" + i).setDirected(true);
			final HashMap<FlowNode, MutableNode> graphNodes = new HashMap<>();
			// Creating a graph node for each FlowNode
			final Collection<FlowNode> alreadySeenNodes = handler.getAllFlowNodes();
			for (final FlowNode node : alreadySeenNodes) {
				final MutableNode graphNode = getDotNode(node);
				graph.add(graphNode);
				graphNodes.put(node, graphNode);
			}
			// Set containment edges (+ links to nodes of called/accessed methods/fields)
			// for all graph nodes
			drawContainmentEdges(handler, graphNodes);
			// Set flow edges
			drawFlowEdges(graphNodes, alreadySeenNodes);
			try {
				final IFile location = output
						.getFile("Class-" + className + "-" + memberType + "-" + memberName + ".png");
				Graphviz.fromGraph(graph).width(4000).rasterize(Rasterizer.SALAMANDER)
						.toFile(location.getLocation().toFile());
			} catch (final IOException e) {
				LOGGER.error(e.getMessage(), e);
			}
		}
	}

	/**
	 * A getter for the name of the object
	 *
	 * @param eObject
	 *            An object
	 * @return The name of the object
	 */
	private static String getName(final EObject eObject) {
		if (eObject instanceof AnonymousClassDeclaration) {
			return "Anonymous-class";
		}
		return ((NamedElement) eObject).getName();
	}

	/**
	 * Draws the flow edges between the graph nodes
	 *
	 * @param graphNodes
	 *            The nodes of the graph
	 * @param alreadySeenNodes
	 */
	private static void drawFlowEdges(final Map<FlowNode, MutableNode> graphNodes,
			final Collection<FlowNode> alreadySeenNodes) {
		for (final FlowNode srcNode : alreadySeenNodes) {
			final MutableNode graphNode = graphNodes.get(srcNode);
			for (FlowNode trgNode : srcNode.getOutRef()) {
				final MutableNode outNode = graphNodes.get(trgNode);
				if (outNode != null) {
					graphNode.addLink(graphNode.linkTo(outNode).with(Style.DASHED, Label.of("flows to"), Color.BLUE));
				}
			}
		}
	}

	/**
	 * Set containment edges (+ links to nodes of called/accessed methods/fields)
	 * for all graph nodes
	 *
	 * @param handler
	 * @param graphNodes
	 *            The nodes of the graph
	 */
	private static void drawContainmentEdges(MemberHandler handler, Map<FlowNode, MutableNode> graphNodes) {
		for (final FlowNode node : new ArrayList<>(handler.getAllFlowNodes())) {
			final MutableNode target = graphNodes.get(node);
			final EObject modelElement = node.getModelElement();
			if (modelElement == null) {
				continue;
			}
			final EObject eContainer = modelElement.eContainer();
			final FlowNode flowCont = handler.getFlowNode(eContainer);
			if (flowCont == null) {
				continue;
			}
			if (modelElement instanceof MethodInvocation) {
				target.addLink(
						target.linkTo(getDotNode(handler.getFlowNode(((MethodInvocation) modelElement).getMethod()))
								.add(Style.FILLED, Color.GRAY)).with(Style.DOTTED, Label.of("calls"), Color.GRAY));
			}
			if (modelElement instanceof ClassInstanceCreation) {
				target.addLink(target
						.linkTo(getDotNode(handler.getFlowNode(((ClassInstanceCreation) modelElement).getMethod()))
								.add(Style.FILLED, Color.GRAY))
						.with(Style.DOTTED, Label.of("calls"), Color.GRAY));
			}
			final MutableNode source = graphNodes.get(flowCont);
			if (source != null) {
				source.addLink(target);
			}
		}
	}

	/**
	 * Returns a (new) dot graph node for the given FlowNode. If the node already
	 * exists, the existing one is returned (by the mutNode constructor), so
	 * duplicates are prevented.
	 *
	 * @param node
	 *            The FlowNode, for which a dot graph node is requested.
	 * @return The requested dot graph node, which corresponds to the given
	 *         FlowNode.
	 */
	private static MutableNode getDotNode(FlowNode node) {
		final EObject modelElement = node.getModelElement();
		MutableNode graphNode = null;
		if (modelElement != null) {
			final StringBuilder label = new StringBuilder(modelElement.eClass().getName());
			if (modelElement instanceof NamedElement) {
				final String name = ((NamedElement) modelElement).getName();
				if (name != null) {
					label.append(' ').append(name);
				}
			}
			if (modelElement instanceof Assignment) {
				label.append(' ').append(((Assignment) modelElement).getOperator().toString());
			}
			graphNode = mutNode(Integer.toString(modelElement.hashCode())).add(Label.of(label.toString()));
		} else {
			graphNode = mutNode(Integer.toString(node.hashCode())).add(Label.of("null"));
		}
		return graphNode;
	}
}
