package org.gravity.hulk.ui.visualization.information.providers;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;
import org.gravity.hulk.ui.visualization.detection.DetectionPreprocessor;
import org.gravity.hulk.ui.visualization.detection.SwissArmyKnifePreprocessor;
import org.gravity.hulk.ui.visualization.util.Flaws;

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

		GraphNode swissArmyKnife = createNode(graphComposite, graph, Flaws.H_SWISS_ARMY_KNIFE_ANTIPATTERN,
				SWT.COLOR_RED, SWT.COLOR_WHITE);
		GraphNode largeClass = createNode(graphComposite, graph, Flaws.H_LARGE_CLASS_SMELL, SWT.COLOR_YELLOW,
				SWT.COLOR_BLACK);
		GraphNode muchOverloadingSmell = createNode(graphComposite, graph, Flaws.H_MUCH_OVERLOADING_SMELL,
				SWT.COLOR_YELLOW, SWT.COLOR_BLACK);
		GraphNode numberOfIncommingInvocations = createNode(graphComposite, graph,
				Flaws.H_NUMBER_OF_INCOMMING_INVOCATIONS_METRIC, SWT.COLOR_MAGENTA, SWT.COLOR_WHITE);
		GraphNode numberOfMembers = createNode(graphComposite, graph, Flaws.H_NUMBER_OF_MEMBERS_METRIC,
				SWT.COLOR_MAGENTA, SWT.COLOR_WHITE);
		GraphNode averageOverloadingInClassMetric = createNode(graphComposite, graph,
				Flaws.H_AVERAGE_OVERLOADING_METRIC, SWT.COLOR_MAGENTA, SWT.COLOR_WHITE);

		createEdge(graphComposite, graph, swissArmyKnife, largeClass, EXISTS, SWT.COLOR_CYAN);
		createEdge(graphComposite, graph, swissArmyKnife, muchOverloadingSmell, EXISTS, SWT.COLOR_CYAN);
		createEdge(graphComposite, graph, swissArmyKnife, numberOfIncommingInvocations, VERY_HIGH, SWT.COLOR_RED);
		createEdge(graphComposite, graph, largeClass, numberOfMembers, HIGH, SWT.COLOR_MAGENTA);
		createEdge(graphComposite, graph, muchOverloadingSmell, averageOverloadingInClassMetric, HIGH,
				SWT.COLOR_MAGENTA);

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
