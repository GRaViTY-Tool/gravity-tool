package org.gravity.hulk.ui.visualization.information.providers;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.ZestStyles;
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
				+ " the objects and modules in other similar systems.</p>" 
				+ "<h2 align=\"left\">Symptoms</h2>" + "<p>" + "<ul>"
				+ "<li>After code mining, only parts of object and methods seem suitable for reuse. Mining Spaghetti Code can often be a poor return on investment; "
				+ "this should be taken into account before a decision to mine is made.</li>"
				+ "<li>Methods are very process-oriented; frequently, in fact, objects are named as processes.</li>"
				+ "<li>The flow of execution is dictated by object implementation, not by the clients of the objects.</li>"
				+ "<li>Minimal relationships exist between objects.</li>"
				+ "<li>Many object methods have no parameters, and utilize class or global variables for processing.</li>"
				+ "<li>The pattern of use of objects is very predictable.</li>" 
				+ "</ul>" + "</p>"
				+ "<h2 align=\"left\">Consequences</h2>" + "<p>" + "<ul>"
				+ "<li>Code is difficult to reuse, and when it is, it is often through cloning. In many cases, however, code is never considered for reuse.</li>"
				+ "<li>Object-oriented talent from industry is difficult to retain.</li>"
				+ "<li>Benefits of object orientation are lost; inheritance is not used to extend the system; polymorphism is not used.</li>"
				+ "<li>Follow-on maintenance efforts contribute to the problem.</li>"
				+ "<li>Software quickly reaches a point of diminishing returns; the effort involved in maintaining an existing code base is greater than the cost of developing a new solution from the ground up.</li>" 
				+ "</ul>" + "</p>"
				+ "<h2 align=\"left\">Source</h2>"
				+ "<p><a href=\"https://sourcemaking.com/antipatterns/spaghetti-code\">https://sourcemaking.com/antipatterns/spaghetti-code</a></p>"
				+ "</html>");
		return informationBrowser;
	}

	@Override
	protected Graph setUpGraph(Composite graphComposite) {
		Graph graph = new Graph(graphComposite, SWT.BORDER);
		
		GraphNode spaghettiCode = new GraphNode(graph, ZestStyles.NODES_FISHEYE,
				Flaws.H_SPAGHETTI_CODE_ANTIPATTERN);
		spaghettiCode.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_RED));
		spaghettiCode.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		
		GraphNode intensiveFieldUsage = new GraphNode(graph, ZestStyles.NODES_FISHEYE,
				Flaws.H_INTENSIVE_FIELD_USAGE_SMELL);
		intensiveFieldUsage.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_YELLOW));
		intensiveFieldUsage.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_BLACK));
		
		GraphNode averageOverloadingInClass = new GraphNode(graph, ZestStyles.NODES_FISHEYE,
				Flaws.H_AVERAGE_OVERLOADING_METRIC);
		averageOverloadingInClass.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_DARK_MAGENTA));
		averageOverloadingInClass.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		
		GraphNode averageParameters = new GraphNode(graph, ZestStyles.NODES_FISHEYE,
				Flaws.H_AVERAGE_PARAMETERS_METRIC);
		averageParameters.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_DARK_MAGENTA));
		averageParameters.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		
		GraphNode numberOfChild = new GraphNode(graph, ZestStyles.NODES_FISHEYE,
				Flaws.H_NUMBER_OF_CHILD_METRIC);
		numberOfChild.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_DARK_MAGENTA));
		numberOfChild.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		
		GraphNode depthOfInheritance = new GraphNode(graph, ZestStyles.NODES_FISHEYE,
				Flaws.H_DEPTH_OF_INHERITANCE_METRIC);
		depthOfInheritance.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_DARK_MAGENTA));
		depthOfInheritance.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		
		GraphNode localAccessRelation = new GraphNode(graph, ZestStyles.NODES_FISHEYE,
				Flaws.H_LOCAL_ACCESS_RELATION_METRIC);
		localAccessRelation.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_DARK_MAGENTA));
		localAccessRelation.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		
		GraphNode localFieldAccess = new GraphNode(graph, ZestStyles.NODES_FISHEYE,
				Flaws.H_LOCAL_FIELD_ACCESSES_METRIC);
		localFieldAccess.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_DARK_MAGENTA));
		localFieldAccess.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		
		GraphNode localMethodAccess = new GraphNode(graph, ZestStyles.NODES_FISHEYE,
				Flaws.H_LOCAL_METHOD_ACCESSES_METRIC);
		localMethodAccess.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_DARK_MAGENTA));
		localMethodAccess.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		
		GraphNode or = new GraphNode(graph, ZestStyles.NODES_FISHEYE, "OR");
		or.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_BLUE));
		or.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		//SpaghettiCodeConections
		GraphConnection connection_1 = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, spaghettiCode,
				intensiveFieldUsage);
		connection_1.setText("exists");
		connection_1.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_CYAN));
		GraphConnection connection_2 = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, spaghettiCode, averageOverloadingInClass);
		connection_2.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_CYAN));
		connection_2.setText("<=VERY_LOW");
		connection_2.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_GREEN));
		GraphConnection connection_3 = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, spaghettiCode, averageParameters);
		connection_3.setText("<=VERY_LOW");
		connection_3.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_GREEN));
		GraphConnection connection_4 = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, spaghettiCode, or);
		connection_4.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_CYAN));
		GraphConnection connection_5 = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, or, depthOfInheritance);
		connection_5.setText("<=VERY_LOW");
		connection_5.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_GREEN));
		GraphConnection connection_6 = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, or, numberOfChild);
		connection_6.setText("<=VERY_LOW");
		connection_6.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_GREEN));
		//IntensiveFielsConnections
		GraphConnection connection_7 = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, intensiveFieldUsage, localAccessRelation);
		connection_7.setText(">=VERY_HIGH");
		connection_7.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_RED));
		//LocalAccessRelationConnections
		GraphConnection connection_8 = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, localAccessRelation, localFieldAccess);
		connection_8.setText("calculate");
		connection_8.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_CYAN));
		GraphConnection connection_9 = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, localAccessRelation, localMethodAccess);
		connection_9.setText("calculate");
		connection_9.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_CYAN));
		
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
