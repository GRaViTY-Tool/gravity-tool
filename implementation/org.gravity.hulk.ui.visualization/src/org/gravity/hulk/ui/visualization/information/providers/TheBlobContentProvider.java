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
import org.eclipse.zest.core.widgets.ZestStyles;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;
import org.gravity.eclipse.io.FileUtils;
import org.gravity.hulk.ui.visualization.Activator;
import org.gravity.hulk.ui.visualization.detection.DetectionPreprocessor;
import org.gravity.hulk.ui.visualization.detection.TheBlobPreprocessor;
import org.gravity.hulk.ui.visualization.util.GlobalStrings;

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
				+ "design rather than an object-oriented." + "</p>"
				+ "<center><img src=\""
				+ blobImage
				+ "\" alt=\"TheBlob\"></center>"
				+ "<h2 align=\"left\">Symptoms</h2>" + "<p>" + "<ul>"
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

		GraphNode theBlob = new GraphNode(graph, ZestStyles.NODES_FISHEYE, GlobalStrings.H_BLOB_ANTIPATTERN);
		theBlob.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_RED));
		theBlob.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		theBlob.setSize(-1, -1);
		

		GraphNode hGodClassAntiPattern = new GraphNode(graph, ZestStyles.NODES_FISHEYE, GlobalStrings.H_GODCLASS_ANTIPATTERN);
		hGodClassAntiPattern.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_RED));
		hGodClassAntiPattern.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		
		GraphNode hDataClassAccessor = new GraphNode(graph, ZestStyles.NODES_FISHEYE,GlobalStrings.H_DATA_CLASS_ACCESSOR);
		hDataClassAccessor.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_YELLOW));
		hDataClassAccessor.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_BLACK));
		
		
		GraphNode hControllerClassSmell = new GraphNode(graph, ZestStyles.NODES_FISHEYE, GlobalStrings.H_CONTROLLERCLASS_SMELL);
		hControllerClassSmell.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_YELLOW));
		hControllerClassSmell.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_BLACK));
		
		GraphNode hInvocationRelationMetric = new GraphNode(graph, ZestStyles.NODES_FISHEYE, GlobalStrings.H_INVOCATIONRELATION_SMELL);
		hInvocationRelationMetric.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_DARK_MAGENTA));
		hInvocationRelationMetric.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		
		GraphNode hNumberOfIncommingInvocationsMetric = new GraphNode(graph, ZestStyles.NODES_FISHEYE,
				GlobalStrings.H_NUMBER_OF_INCOMMING_INVOCATIONS_SMELL);
		hNumberOfIncommingInvocationsMetric.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_DARK_MAGENTA));
		hNumberOfIncommingInvocationsMetric.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		
		GraphNode hNumberOfOutgoingInvocationsMetric = new GraphNode(graph, ZestStyles.NODES_FISHEYE,
				GlobalStrings.H_NUMBER_OF_OUTGOING_INVOCATIONS_SMELL);
		hNumberOfOutgoingInvocationsMetric.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_DARK_MAGENTA));
		hNumberOfOutgoingInvocationsMetric.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		
		GraphNode hLargeClassLowCohesionSmell = new GraphNode(graph, ZestStyles.NODES_FISHEYE,
				GlobalStrings.H_LARGE_CLASS_LOW_COHESION_SMELL);
		hLargeClassLowCohesionSmell.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_YELLOW));
		hLargeClassLowCohesionSmell.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_BLACK));
		
		GraphNode hLowCohesionSmell = new GraphNode(graph, ZestStyles.NODES_FISHEYE, GlobalStrings.H_LOW_COHESION_SMELL);
		hLowCohesionSmell.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_YELLOW));
		hLowCohesionSmell.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_BLACK));
		
		GraphNode hLCOM5Metric = new GraphNode(graph, ZestStyles.NODES_FISHEYE, GlobalStrings.H_LCOM5_METRIC);
		hLCOM5Metric.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_DARK_MAGENTA));
		hLCOM5Metric.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		
		GraphNode hLargeClassSmell = new GraphNode(graph, ZestStyles.NODES_FISHEYE, GlobalStrings.H_LARGE_CLASS_SMELL);
		hLargeClassSmell.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_YELLOW));
		hLargeClassSmell.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_BLACK));
		
		GraphNode hNumberOfMembersMetric = new GraphNode(graph, ZestStyles.NODES_FISHEYE, GlobalStrings.H_NUMBER_OF_MEMBERS_METRIC);
		hNumberOfMembersMetric.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_DARK_MAGENTA));
		hNumberOfMembersMetric.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		
		GraphNode hDataClassSmell = new GraphNode(graph, ZestStyles.NODES_FISHEYE, GlobalStrings.H_DATA_CLASS_SMELL);
		hDataClassSmell.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_YELLOW));
		hDataClassSmell.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_BLACK));
		
		GraphNode hGetterSetterSmell = new GraphNode(graph, ZestStyles.NODES_FISHEYE, GlobalStrings.H_GETTER_SETTER_SMELLS);
		hGetterSetterSmell.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_YELLOW));
		hGetterSetterSmell.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_BLACK));
		
		GraphNode hNACCMetric = new GraphNode(graph, ZestStyles.NODES_FISHEYE, GlobalStrings.H_NACC_METRIC);
		hNACCMetric.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_DARK_MAGENTA));
		hNACCMetric.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		

		GraphNode or1 = new GraphNode(graph, ZestStyles.NODES_FISHEYE, GlobalStrings.OR);
		or1.setBackgroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_BLUE));
		or1.setForegroundColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		//TheBlobConnections
		GraphConnection connection_1 = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, theBlob,
				hGodClassAntiPattern);
		connection_1.setText("exists");
		connection_1.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_CYAN));
		GraphConnection connection_2 = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, theBlob,
				hDataClassAccessor);
		connection_2.setText(">= MEDIUM");
		connection_2.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_YELLOW));
		GraphConnection connection_3 = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, theBlob,
				hDataClassSmell);
		connection_3.setText("1...*");
		connection_3.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_CYAN));
		//GodClassConnections
		GraphConnection connection_5 = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, hGodClassAntiPattern,
				hControllerClassSmell);
		connection_5.setText("exists");
		connection_5.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_CYAN));
		GraphConnection connection_6 = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, hGodClassAntiPattern,
				hLargeClassLowCohesionSmell);
		connection_6.setText("exists");
		connection_6.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_CYAN));
		//HControllerClassSmellConnections
		GraphConnection connection_8 = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, hControllerClassSmell,
				hInvocationRelationMetric);
		connection_8.setText(">= MEDIUM");
		connection_8.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_YELLOW));
		//HInvocationRelationConnections
		GraphConnection connection_9 = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, hInvocationRelationMetric,
				hNumberOfIncommingInvocationsMetric);
		connection_9.setText("calculate");
		connection_9.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_CYAN));
		GraphConnection connection_10 = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, hInvocationRelationMetric,
				hNumberOfOutgoingInvocationsMetric);
		connection_10.setText("calculate");
		connection_10.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_CYAN));
		//HLargeClassLowCohesionConnection
		GraphConnection connection_11 = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, hLargeClassLowCohesionSmell,
				or1);
		connection_11.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_CYAN));
		GraphConnection connection_12 = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, or1,
				hLargeClassSmell);
		connection_12.setText("exists");
		connection_12.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_CYAN));
		GraphConnection connection_13 = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, or1,
				hLowCohesionSmell);
		connection_13.setText("exists");
		connection_13.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_CYAN));
		//HLargeClassConnections
		GraphConnection connection_14 = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, hLargeClassSmell,
				hNumberOfMembersMetric);
		connection_14.setText(">= HIGH");
		connection_14.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_MAGENTA));
		//HLowCohesionConnections
		GraphConnection connection_15 = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, hLowCohesionSmell,
				hLCOM5Metric);
		connection_15.setText(">= HIGH");
		connection_15.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_MAGENTA));
		//HDataClassAccessorConnections
		GraphConnection connection_16 = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, hDataClassAccessor,
				hDataClassSmell);
		connection_16.setText("1...*");
		connection_16.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_CYAN));
		//HDataClassConnections
		GraphConnection connection_17 = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, hDataClassSmell,
				hNACCMetric);
		connection_17.setText(">= HIGH");
		connection_17.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_MAGENTA));
		GraphConnection connection_18 = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, hDataClassSmell,
				hGetterSetterSmell);
		connection_18.setText("1...*");
		connection_18.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_CYAN));
		//HGetterSetterSmellConnections
		GraphConnection connection_19 = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, hGetterSetterSmell,
				hNACCMetric);
		connection_19.setText("1...*");
		connection_19.setLineColor(graphComposite.getDisplay().getSystemColor(SWT.COLOR_CYAN));
		
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
