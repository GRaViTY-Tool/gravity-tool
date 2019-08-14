package org.gravity.hulk.ui.visualization.information.providers;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;
import org.gravity.hulk.ui.visualization.detection.DetectionPreprocessor;
import org.gravity.hulk.ui.visualization.detection.SpaghettiCodePreprocessor;
import org.gravity.hulk.ui.visualization.util.Flaws;

public class SpaghettiCodeContentProvider extends InformationViewContentProvider {

	@Override
	protected Browser setUpInformationBrowser(Composite informationLabelComposite) {
		Browser informationBrowser = new Browser(informationLabelComposite, SWT.BORDER);
		informationBrowser.setText("<html>" + "<style>" + "li{margin: 10px 0;}" + "</style>"
				+ "<h1 align=\"center\">Spaghetti Code</h1>" + "<h2 align=\"left\">General</h2>"
				+ "<p>Spaghetti Code appears as a program or system that contains very little software structure. "
				+ "Coding and progressive extensions compromise the software structure to such an extent that the structure "
				+ "lacks clarity, even to the original developer, if he or she is away from the software for any length of time. "
				+ "If developed using an object-oriented language, the software may include a small number of objects that contain "
				+ "methods with very large implementations that invoke a single, multistage process flow. Furthermore, the object "
				+ "methods are invoked in a very predictable manner, and there is a negligible degree of dynamic interaction between "
				+ "the objects in the system. The system is very difficult to maintain and extend, and there is no opportunity to reuse"
				+ " the objects and modules in other similar systems.</p>" + "<h2 align=\"left\">Symptoms</h2>" + "<p>"
				+ "<ul>"
				+ "<li>After code mining, only parts of object and methods seem suitable for reuse. Mining Spaghetti Code can often be a poor return on investment; "
				+ "this should be taken into account before a decision to mine is made.</li>"
				+ "<li>Methods are very process-oriented; frequently, in fact, objects are named as processes.</li>"
				+ "<li>The flow of execution is dictated by object implementation, not by the clients of the objects.</li>"
				+ "<li>Minimal relationships exist between objects.</li>"
				+ "<li>Many object methods have no parameters, and utilize class or global variables for processing.</li>"
				+ "<li>The pattern of use of objects is very predictable.</li>" + "</ul>" + "</p>"
				+ "<h2 align=\"left\">Consequences</h2>" + "<p>" + "<ul>"
				+ "<li>Code is difficult to reuse, and when it is, it is often through cloning. In many cases, however, code is never considered for reuse.</li>"
				+ "<li>Object-oriented talent from industry is difficult to retain.</li>"
				+ "<li>Benefits of object orientation are lost; inheritance is not used to extend the system; polymorphism is not used.</li>"
				+ "<li>Follow-on maintenance efforts contribute to the problem.</li>"
				+ "<li>Software quickly reaches a point of diminishing returns; the effort involved in maintaining an existing code base is greater than the cost of developing a new solution from the ground up.</li>"
				+ "</ul>" + "</p>" + "<h2 align=\"left\">Source</h2>"
				+ "<p><a href=\"https://sourcemaking.com/antipatterns/spaghetti-code\">https://sourcemaking.com/antipatterns/spaghetti-code</a></p>"
				+ "</html>");
		return informationBrowser;
	}

	@Override
	protected Graph setUpGraph(Composite graphComposite) {
		Graph graph = new Graph(graphComposite, SWT.BORDER);

		GraphNode spaghettiCode = createNode(graphComposite, graph, Flaws.H_SPAGHETTI_CODE_ANTIPATTERN, SWT.COLOR_RED,
				SWT.COLOR_WHITE);
		GraphNode intensiveFieldUsage = createNode(graphComposite, graph, Flaws.H_INTENSIVE_FIELD_USAGE_SMELL,
				SWT.COLOR_YELLOW, SWT.COLOR_BLACK);
		GraphNode averageOverloadingInClass = createNode(graphComposite, graph, Flaws.H_AVERAGE_OVERLOADING_METRIC,
				SWT.COLOR_DARK_MAGENTA, SWT.COLOR_WHITE);
		GraphNode averageParameters = createNode(graphComposite, graph, Flaws.H_AVERAGE_PARAMETERS_METRIC,
				SWT.COLOR_DARK_MAGENTA, SWT.COLOR_WHITE);
		GraphNode numberOfChild = createNode(graphComposite, graph, Flaws.H_NUMBER_OF_CHILD_METRIC,
				SWT.COLOR_DARK_MAGENTA, SWT.COLOR_WHITE);
		GraphNode depthOfInheritance = createNode(graphComposite, graph, Flaws.H_DEPTH_OF_INHERITANCE_METRIC,
				SWT.COLOR_DARK_MAGENTA, SWT.COLOR_WHITE);
		GraphNode localAccessRelation = createNode(graphComposite, graph, Flaws.H_LOCAL_ACCESS_RELATION_METRIC,
				SWT.COLOR_DARK_MAGENTA, SWT.COLOR_WHITE);
		GraphNode localFieldAccess = createNode(graphComposite, graph, Flaws.H_LOCAL_FIELD_ACCESSES_METRIC,
				SWT.COLOR_DARK_MAGENTA, SWT.COLOR_WHITE);
		GraphNode localMethodAccess = createNode(graphComposite, graph, Flaws.H_LOCAL_METHOD_ACCESSES_METRIC,
				SWT.COLOR_DARK_MAGENTA, SWT.COLOR_WHITE);

		GraphNode or = createNode(graphComposite, graph, OR, SWT.COLOR_BLUE, SWT.COLOR_WHITE);
		// SpaghettiCodeConections
		createEdge(graphComposite, graph, spaghettiCode, intensiveFieldUsage, EXISTS, SWT.COLOR_CYAN);
		createEdge(graphComposite, graph, spaghettiCode, averageOverloadingInClass, VERY_LOW, SWT.COLOR_GREEN);
		createEdge(graphComposite, graph, spaghettiCode, averageParameters, VERY_LOW, SWT.COLOR_GREEN);
		createEdge(graphComposite, graph, spaghettiCode, or, "", SWT.COLOR_CYAN);
		createEdge(graphComposite, graph, or, depthOfInheritance, VERY_LOW, SWT.COLOR_GREEN);
		createEdge(graphComposite, graph, or, numberOfChild, VERY_LOW, SWT.COLOR_GREEN);
		// IntensiveFielsConnections
		createEdge(graphComposite, graph, intensiveFieldUsage, localAccessRelation, VERY_HIGH, SWT.COLOR_RED);
		// LocalAccessRelationConnections
		createEdge(graphComposite, graph, localAccessRelation, localFieldAccess, CALCULATE, SWT.COLOR_CYAN);
		createEdge(graphComposite, graph, localAccessRelation, localMethodAccess, CALCULATE, SWT.COLOR_CYAN);

		graph.setLayoutAlgorithm(new TreeLayoutAlgorithm(), true);

		for (int i = 0; i < graph.getConnections().size(); i++) {
			((GraphConnection) graph.getConnections().get(i)).setLineWidth(3);
			((GraphConnection) graph.getConnections().get(i)).setWeight(0);
		}

		return graph;
	}

	@Override
	protected DetectionPreprocessor setUpDetectionPreprocesser() {
		return new SpaghettiCodePreprocessor();
	}

}
