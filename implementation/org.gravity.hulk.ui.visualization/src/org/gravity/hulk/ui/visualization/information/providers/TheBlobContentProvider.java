package org.gravity.hulk.ui.visualization.information.providers;

import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;
import org.gravity.eclipse.io.FileUtils;
import org.gravity.hulk.ui.visualization.Activator;
import org.gravity.hulk.ui.visualization.detection.DetectionPreprocessor;
import org.gravity.hulk.ui.visualization.detection.TheBlobPreprocessor;
import org.gravity.hulk.ui.visualization.util.Flaws;

public class TheBlobContentProvider extends InformationViewContentProvider {

	private static final Logger LOGGER = Logger.getLogger(TheBlobContentProvider.class);

	private String blobImage;

	public TheBlobContentProvider() {
		try {
			blobImage = FileUtils.extractToTmpFile(Activator.PLUGIN_ID, "icons", "Blob.png").toFile().getAbsolutePath();
		} catch (IOException e) {
			LOGGER.log(Level.ERROR, "Couldn't extract the blob figure to a temporary file.");
		}
	}

	@Override
	protected Browser setUpInformationBrowser(Composite informationLabelComposite) {
		Browser informationBrowser = new Browser(informationLabelComposite, SWT.BORDER);
		informationBrowser.setText("<html>" + "<style>" + "li{margin: 10px 0;}" + "</style>"
				+ "<h1 align=\"center\">The Blob</h1>" + "<h2 align=\"left\">General</h2>"
				+ "<p>The Blob AntiPattern has its name from the movie The Blob: A jellylike alien grows every time it eats something and eventually threatens to destroy the earth. "
				+ "The Blob AntiPattern can be found in programms where one class does all the processing while the other classes only store data and do no real processing themselves. "
				+ "One class has all the responsibilities which contradicts the principle of object-oriented programming. A programm with The Blob is structured more like a procedural "
				+ "design rather than an object-oriented." + "</p>" + "<center><img src=\"" + blobImage
				+ "\" alt=\"TheBlob\"></center>" + "<h2 align=\"left\">Symptoms</h2>" + "<p>" + "<ul>"
				+ "<li>Single class with a large number of attributes, operations or both </li>"
				+ "<li>A single class encapsulates a lot of unrelated attributes and operations </li>"
				+ "<li>Typical is a overall lack of cohesiveness of the attributes </li>"
				+ "<li>Single controller class with associated data-object classes" + "</ul>" + "</p>"
				+ "<h2 align=\"left\">Consequences</h2>" + "<p>" + "<ul>"
				+ "<li>An absence of object-oriented design. The single controller class often nearly encapsulates the entire functionality of "
				+ "the programm</li>"
				+ "<li>It is hard to modify the system without affecting the functionality of other encapsulated objects</li>"
				+ "<li>Modifications to other objects likely influence The Blobs software</li>"
				+ "<li>Typically too complex for reuse and testing</li>"
				+ "<li>May be expensive to load into memory</li>" + "</ul>" + "</p>" + "<h2 align=\"left\">Source</h2>"
				+ "<p><a href=\"https://sourcemaking.com/antipatterns/the-blob\">https://sourcemaking.com/antipatterns/the-blob</a></p>"
				+ "</html>");

		return informationBrowser;
	}

	@Override
	protected Graph setUpGraph(Composite graphComposite) {
		Graph graph = new Graph(graphComposite, SWT.BORDER);

		GraphNode theBlob = createNode(graphComposite, graph, Flaws.H_BLOB_ANTIPATTERN, SWT.COLOR_RED, SWT.COLOR_WHITE);
		theBlob.setSize(-1, -1);

		GraphNode hGodClassAntiPattern = createNode(graphComposite, graph, Flaws.H_GODCLASS_ANTIPATTERN, SWT.COLOR_RED,
				SWT.COLOR_WHITE);
		GraphNode hDataClassAccessor = createNode(graphComposite, graph, Flaws.H_DATA_CLASS_ACCESSOR, SWT.COLOR_YELLOW,
				SWT.COLOR_BLACK);
		GraphNode hControllerClassSmell = createNode(graphComposite, graph, Flaws.H_CONTROLLERCLASS_SMELL,
				SWT.COLOR_YELLOW, SWT.COLOR_BLACK);
		GraphNode hInvocationRelationMetric = createNode(graphComposite, graph, Flaws.H_INVOCATIONRELATION_METRIC,
				SWT.COLOR_DARK_MAGENTA, SWT.COLOR_WHITE);
		GraphNode hNumberOfIncommingInvocationsMetric = createNode(graphComposite, graph,
				Flaws.H_NUMBER_OF_INCOMMING_INVOCATIONS_METRIC, SWT.COLOR_DARK_MAGENTA, SWT.COLOR_WHITE);
		GraphNode hNumberOfOutgoingInvocationsMetric = createNode(graphComposite, graph,
				Flaws.H_NUMBER_OF_OUTGOING_INVOCATIONS_METRIC, SWT.COLOR_DARK_MAGENTA, SWT.COLOR_WHITE);
		GraphNode hLargeClassLowCohesionSmell = createNode(graphComposite, graph,
				Flaws.H_LARGE_CLASS_LOW_COHESION_SMELL, SWT.COLOR_YELLOW, SWT.COLOR_BLACK);
		GraphNode hLowCohesionSmell = createNode(graphComposite, graph, Flaws.H_LOW_COHESION_SMELL, SWT.COLOR_YELLOW,
				SWT.COLOR_BLACK);
		GraphNode hLCOM5Metric = createNode(graphComposite, graph, Flaws.H_LCOM5_METRIC, SWT.COLOR_DARK_MAGENTA,
				SWT.COLOR_WHITE);
		GraphNode hLargeClassSmell = createNode(graphComposite, graph, Flaws.H_LARGE_CLASS_SMELL, SWT.COLOR_YELLOW,
				SWT.COLOR_BLACK);
		GraphNode hNumberOfMembersMetric = createNode(graphComposite, graph, Flaws.H_NUMBER_OF_MEMBERS_METRIC,
				SWT.COLOR_DARK_MAGENTA, SWT.COLOR_WHITE);
		GraphNode hDataClassSmell = createNode(graphComposite, graph, Flaws.H_DATA_CLASS_SMELL, SWT.COLOR_YELLOW,
				SWT.COLOR_BLACK);
		GraphNode hGetterSetterSmell = createNode(graphComposite, graph, Flaws.H_GETTER_SETTER_SMELLS, SWT.COLOR_YELLOW,
				SWT.COLOR_BLACK);
		GraphNode hNACCMetric = createNode(graphComposite, graph, Flaws.H_NACC_METRIC, SWT.COLOR_DARK_MAGENTA,
				SWT.COLOR_WHITE);
		GraphNode or1 = createNode(graphComposite, graph, OR, SWT.COLOR_BLUE, SWT.COLOR_WHITE);

		// TheBlobConnections
		createEdge(graphComposite, graph, theBlob, hGodClassAntiPattern, EXISTS, SWT.COLOR_CYAN);
		createEdge(graphComposite, graph, theBlob, hDataClassAccessor, MEDIUM, SWT.COLOR_YELLOW);
		createEdge(graphComposite, graph, theBlob, hDataClassSmell, AT_LEAST_ONE, SWT.COLOR_CYAN);
		// GodClassConnections
		createEdge(graphComposite, graph, hGodClassAntiPattern, hControllerClassSmell, EXISTS, SWT.COLOR_CYAN);
		createEdge(graphComposite, graph, hGodClassAntiPattern, hLargeClassLowCohesionSmell, EXISTS, SWT.COLOR_CYAN);
		// HControllerClassSmellConnections
		createEdge(graphComposite, graph, hControllerClassSmell, hInvocationRelationMetric, MEDIUM, SWT.COLOR_YELLOW);
		// HInvocationRelationConnections
		createEdge(graphComposite, graph, hInvocationRelationMetric, hNumberOfIncommingInvocationsMetric, CALCULATE,
				SWT.COLOR_CYAN);
		createEdge(graphComposite, graph, hInvocationRelationMetric, hNumberOfOutgoingInvocationsMetric, CALCULATE,
				SWT.COLOR_CYAN);
		// HLargeClassLowCohesionConnection
		createEdge(graphComposite, graph, hLargeClassLowCohesionSmell, or1, "", SWT.COLOR_CYAN);
		createEdge(graphComposite, graph, or1, hLargeClassSmell, EXISTS, SWT.COLOR_CYAN);
		createEdge(graphComposite, graph, or1, hLowCohesionSmell, EXISTS, SWT.COLOR_CYAN);
		// HLargeClassConnections
		createEdge(graphComposite, graph, hLargeClassSmell, hNumberOfMembersMetric, HIGH, SWT.COLOR_MAGENTA);
		// HLowCohesionConnections
		createEdge(graphComposite, graph, hLowCohesionSmell, hLCOM5Metric, HIGH, SWT.COLOR_MAGENTA);
		// HDataClassAccessorConnections
		createEdge(graphComposite, graph, hDataClassAccessor, hDataClassSmell, AT_LEAST_ONE, SWT.COLOR_CYAN);
		// HDataClassConnections
		createEdge(graphComposite, graph, hDataClassSmell, hNACCMetric, HIGH, SWT.COLOR_MAGENTA);
		createEdge(graphComposite, graph, hDataClassSmell, hGetterSetterSmell, AT_LEAST_ONE, SWT.COLOR_CYAN);
		// HGetterSetterSmellConnections
		createEdge(graphComposite, graph, hGetterSetterSmell, hNACCMetric, AT_LEAST_ONE, SWT.COLOR_CYAN);

		graph.setLayoutAlgorithm(new TreeLayoutAlgorithm(), true);

		for (int i = 0; i < graph.getConnections().size(); i++) {
			((GraphConnection) graph.getConnections().get(i)).setLineWidth(3);
			((GraphConnection) graph.getConnections().get(i)).setWeight(0);
		}

		return graph;
	}

	@Override
	protected DetectionPreprocessor setUpDetectionPreprocesser() {
		return new TheBlobPreprocessor();
	}

}
