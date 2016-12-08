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
import org.gravity.hulk.ui.visualization.detection.SwissArmyKnifePreprocessor;
import org.gravity.hulk.ui.visualization.util.GlobalStrings;

public class SwissArmyKnifeContentProvider extends InformationViewContentProvider {

	@Override
	protected Browser setUpInformationBrowser(Composite informationLabelComposite) {
		Browser informationBrowser = new Browser(informationLabelComposite, SWT.BORDER);
		informationBrowser.setText("<html>" + "<style>" + "li{margin: 10px 0;}" + "</style>"
				+ "<h1 align=\"center\">Swiss Army Knife</h1>" + "<h2 align=\"left\">General</h2>"
				+ "<p>A Swiss Army Knife, also known as Kitchen Sink, is an excessively complex class interface. The designer attempts to provide for "
				+ "all possible uses of the class. "
				+ "In the attempt, he or she adds a large number of interface signatures in a futile attempt to meet all possible needs."
				+ "</p>" + "<h2 align=\"left\">Symptoms</h2>" + "<p>" + "<ul>"
				+ "<li>Very complex class interface with dozens to thousands method signatures</li>"
				+ "<li>Lack of focus in the interface</li>"
				+ "<li>No clear abstraction or purpose for the interface</li>" + "</ul>" + "</p>"
				+ "<h2 align=\"left\">Consequences</h2>" + "<p>" + "<ul>"
				+ "<li>Force of managing complexity is ignored</li>" + "<li>Interface is difficult to understand</li>"
				+ "<li>Intended use of the interface is obscured</li>"
				+ "<li>Interface is hard to debug and to maintain</li>" + "</ul>" + "</p>"
				+ "<h2 align=\"left\">Source</h2>"
				+ "<p><a href=\"https://sourcemaking.com/antipatterns/swiss-army-knife\">https://sourcemaking.com/antipatterns/swiss-army-knife</a></p>"
				+ "</html>");

		return informationBrowser;
	}

	@Override
	protected Graph setUpGraph(Composite graphComposite) {
		Graph graph = new Graph(graphComposite, SWT.BORDER);

		GraphNode swissArmyKnife = new GraphNode(graph, ZestStyles.NODES_FISHEYE,
				GlobalStrings.H_SWISS_ARMY_KNIFE_ANTIPATTERN);
		swissArmyKnife.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_RED));
		swissArmyKnife.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		
		GraphNode largeClass = new GraphNode(graph, ZestStyles.NODES_FISHEYE, GlobalStrings.H_LARGE_CLASS_SMELL);
		largeClass.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_YELLOW));
		largeClass.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_BLACK));
		
		GraphNode muchOverloadingSmell = new GraphNode(graph, ZestStyles.NODES_FISHEYE,
				GlobalStrings.H_MUCH_OVERLOADING_SMELL);
		muchOverloadingSmell.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_YELLOW));
		muchOverloadingSmell.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_BLACK));
		
		GraphNode numberOfIncommingInvocations = new GraphNode(graph, ZestStyles.NODES_FISHEYE,
				GlobalStrings.H_NUMBER_OF_INCOMMING_INVOCATIONS_SMELL);
		numberOfIncommingInvocations.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_MAGENTA));
		numberOfIncommingInvocations.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		
		GraphNode numberOfMembers = new GraphNode(graph, ZestStyles.NODES_FISHEYE,
				GlobalStrings.H_NUMBER_OF_MEMBERS_METRIC);
		numberOfMembers.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_MAGENTA));
		numberOfMembers.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		
		GraphNode averageOverloadingInClassMetric = new GraphNode(graph, ZestStyles.NODES_FISHEYE,
				GlobalStrings.H_AVERAGE_OVERLOADING_METRIC);
		averageOverloadingInClassMetric.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_MAGENTA));
		averageOverloadingInClassMetric.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));

		GraphConnection connection_1 = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, swissArmyKnife,
				largeClass);
		connection_1.setText("exists");
		connection_1.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_CYAN));
		GraphConnection connection_2 = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, swissArmyKnife,
				muchOverloadingSmell);
		connection_2.setText("exists");
		connection_2.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_CYAN));
		GraphConnection connection_3 = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, swissArmyKnife,
				numberOfIncommingInvocations);
		connection_3.setText(">= VERY_HIGH");
		connection_3.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_RED));
		GraphConnection connection_4 = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, largeClass,
				numberOfMembers);
		connection_4.setText(">= HIGH");
		connection_4.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_MAGENTA));
		GraphConnection connection_5 = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, muchOverloadingSmell,
				averageOverloadingInClassMetric);
		connection_5.setText(">= HIGH");
		connection_5.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_MAGENTA));
		
		graph.setLayoutAlgorithm(new TreeLayoutAlgorithm(), true);

		for (int i = 0; i < graph.getConnections().size(); i++) {
			((GraphConnection) graph.getConnections().get(i)).setLineWidth(3);
			((GraphConnection) graph.getConnections().get(i)).setWeight(0);
		}

		return graph;
	}

	@Override
	protected DetectionPreprocessor setUpDetectionPreprocesser() {
		return new SwissArmyKnifePreprocessor();
	}

}
