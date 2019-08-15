package org.gravity.hulk.ui.visualization.information.providers;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.ZestStyles;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.ui.visualization.detection.DetectionObject;
import org.gravity.hulk.ui.visualization.detection.DetectionPreprocessor;
import org.gravity.hulk.ui.visualization.listener.DetectionLinkListener;
import org.gravity.hulk.ui.visualization.util.Flaws;

public abstract class InformationViewContentProvider {

	static final String VERY_HIGH = ">=VERY_HIGH";
	static final String HIGH = ">= HIGH";
	static final String MEDIUM = ">= MEDIUM";
	static final String LOW = "<= LOW";
	static final String VERY_LOW = "<= LOW";
	static final String CALCULATE = "calculate";
	static final String AT_LEAST_ONE = "1...*";
	static final String OR = "OR";
	static final String EXISTS = "exists";

	private Composite informationLabelComposite;
	private Composite graphComposite;
	private Composite graphInformationLabelComposite;
	private Browser informationBrowser;
	private Graph graph;
	private TabFolder graphInformationTabFolder;
	private Map<Flaws, List<DetectionObject>> detectionObjects;
	protected static HAntiPatternGraph apg;
	protected static String globalScanID = "";
	protected DetectionPreprocessor detectionPreprocesser;
	private String localScanID;

	private EnumMap<Flaws, TabItem> tabItems;

	protected abstract Browser setUpInformationBrowser(Composite informationLabelComposite);

	protected abstract Graph setUpGraph(Composite graphComposite);

	protected abstract DetectionPreprocessor setUpDetectionPreprocesser();

	public InformationViewContentProvider() {
		detectionPreprocesser = setUpDetectionPreprocesser();
		detectionObjects = detectionPreprocesser.preprocessDetections(null);
		tabItems = new EnumMap<Flaws, TabItem>(Flaws.class);
		localScanID = "";
	}

	public boolean checkLocalState() {
		if (!globalScanID.equals(localScanID)) {
			localScanID = globalScanID;
			return true;
		}
		return false;
	}

	public void setComposites(Composite informationLabelComposite, Composite graphComposite,
			Composite graphInformationLabelComposite) {
		this.informationLabelComposite = informationLabelComposite;
		this.graphComposite = graphComposite;
		this.graphInformationLabelComposite = graphInformationLabelComposite;
	}

	public void setUpInformationViewContent() {

		informationBrowser = setUpInformationBrowser(informationLabelComposite);

		graph = setUpGraph(graphComposite);

		refreshDetectionObjects();

		refreshGraphInformationTabFolder();

		graph.addSelectionListener(setUpSelectionAdapter());
	}

	public void refreshDetectionObjects() {
		detectionObjects = detectionPreprocesser.preprocessDetections(apg);
	}

	public static void setAPG(HAntiPatternGraph apg) {
		InformationViewContentProvider.apg = apg;
		globalScanID = UUID.randomUUID().toString();
	}

	public void refreshGraphInformationTabFolder() {

		tabItems.clear();

		if (graphInformationTabFolder != null) {
			graphInformationTabFolder.dispose();
		}

		graphInformationTabFolder = new TabFolder(graphInformationLabelComposite, SWT.BORDER);
		graphInformationTabFolder
				.setBackground(graphInformationLabelComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		graphInformationTabFolder.setLayout(new FillLayout());

		for (Entry<Flaws, List<DetectionObject>> entry : detectionObjects.entrySet()) {
			TabItem item = new TabItem(graphInformationTabFolder, SWT.V_SCROLL);
			Flaws smell = entry.getKey();
			item.setText(smell.toString());
			tabItems.put(smell, item);

			GridLayout gridLayout = new GridLayout();
			gridLayout.verticalSpacing = 2;

			ExpandBar detectionsBar = new ExpandBar(graphInformationTabFolder, SWT.V_SCROLL);
			detectionsBar.setBackground(graphInformationLabelComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
			detectionsBar.setLayout(gridLayout);

			int detectionNumber = 0;
			for (DetectionObject detectionObject : entry.getValue()) {

				ExpandItem detectionIDItem = new ExpandItem(detectionsBar, SWT.NONE);
				detectionIDItem.setText("Detection ID: " + detectionNumber);

				RowLayout detectionCompositeRowLayout = new RowLayout();
				detectionCompositeRowLayout.type = SWT.VERTICAL;
				detectionCompositeRowLayout.pack = true;

				Composite detectionComposite = new Composite(detectionsBar, SWT.NONE);
				detectionComposite
						.setBackground(graphInformationLabelComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
				detectionComposite.setLayout(detectionCompositeRowLayout);

				// Detections
				Label detectionLabel = new Label(detectionComposite, SWT.NONE);
				detectionLabel.setText("Detected in:");
				FontDescriptor boldDescriptor = FontDescriptor.createFrom(detectionLabel.getFont()).setStyle(SWT.BOLD);
				Font boldFont = boldDescriptor.createFont(detectionLabel.getDisplay());
				detectionLabel.setFont(boldFont);

				Composite detectionsComposite = new Composite(detectionComposite, SWT.NONE);
				detectionsComposite
						.setBackground(graphInformationLabelComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
				detectionsComposite.setLayout(new FillLayout(SWT.VERTICAL));

				for (Entry<String, String> detectionEntry : detectionObject.getDetections().entrySet()) {
					String value;
					if (!detectionEntry.getValue().equals("-1")) {
						value = "Value: " + detectionEntry.getValue();
					} else {
						value = "Value: none";
					}
					Link link = new Link(detectionsComposite, SWT.NONE);
					link.setText("<A>" + detectionEntry.getKey() + "</A>" + "\n" + value);
					link.addListener(SWT.Selection, new DetectionLinkListener());
					link.setBackground(graphInformationLabelComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
				}
				// Thresholds
				Label thresholdLabel = new Label(detectionComposite, SWT.NONE);
				thresholdLabel.setText("Thresholds:");
				FontDescriptor thresholdBoldDescriptor = FontDescriptor.createFrom(thresholdLabel.getFont())
						.setStyle(SWT.BOLD);
				Font thresholdBoldFont = thresholdBoldDescriptor.createFont(thresholdLabel.getDisplay());
				thresholdLabel.setFont(thresholdBoldFont);

				Composite thresholdsComposite = new Composite(detectionComposite, SWT.NONE);
				thresholdsComposite
						.setBackground(graphInformationLabelComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
				thresholdsComposite.setLayout(new FillLayout(SWT.VERTICAL));

				for (Entry<String, Number> thresholdEntry : detectionObject.getThresholds().entrySet()) {
					String value = "";
					if (!thresholdEntry.getValue().equals(-1)) {
						value = value + "\n Value: " + thresholdEntry.getValue();
					}
					Label label = new Label(thresholdsComposite, SWT.NONE);
					label.setText(thresholdEntry.getValue() + " " + value);
					label.setBackground(graphInformationLabelComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
				}

				detectionIDItem.setControl(detectionComposite);
				detectionIDItem.setHeight(detectionComposite.computeSize(SWT.DEFAULT, SWT.DEFAULT).y);

				detectionNumber++;
				graphInformationLabelComposite.layout();
			}
			item.setControl(detectionsBar);
		}

		graphInformationLabelComposite.layout();

	}

	private SelectionAdapter setUpSelectionAdapter() {

		SelectionAdapter adapter;

		adapter = new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {

				if (checkLocalState()) {
					refreshDetectionObjects();
					refreshGraphInformationTabFolder();
				}

				List<GraphNode> selectionList = ((Graph) event.getSource()).getSelection();
				if (selectionList.size() == 1) {
					GraphNode node = selectionList.get(0);
					String text = node.getText();
					if (!(text.equals("AND") || text.equals("OR") || text.equals("CALCULATE"))) {
						Flaws flaw = Flaws.valueOf(text);
						graphInformationTabFolder.setSelection(tabItems.get(flaw));
					}
				}

			}
		};
		return adapter;
	}

	public Browser getInformationLabel() {
		if (informationBrowser == null) {
			setUpInformationViewContent();
		}
		return informationBrowser;
	}

	public Graph getGraph() {
		if (graph == null) {
			setUpInformationViewContent();
		}
		return graph;
	}

	public TabFolder getGraphInformationTabFolder() {
		if (graphInformationTabFolder == null) {
			setUpInformationViewContent();
		}
		return graphInformationTabFolder;
	}

	/**
	 * Create a new edge
	 * 
	 * @param composite       The composite containing the edge
	 * @param graph           The graph containing the edge
	 * @param src             The source node
	 * @param trg             The target node
	 * @param label           The label on the node
	 * @param backgroundColor The background color of the edge
	 * @param foregroundColor The foreground color of the edge
	 * @return The new edge
	 */
	GraphConnection createEdge(Composite composite, Graph graph, GraphNode src, GraphNode trg, String label,
			int color) {
		GraphConnection edge;
		edge = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, src, trg);
		edge.setText(label);
		edge.setLineColor(composite.getDisplay().getSystemColor(color));
		return edge;
	}

	/**
	 * Create a new node
	 * 
	 * @param composite       The composite containing the node
	 * @param graph           The graph containing the node
	 * @param label           The label on the node
	 * @param backgroundColor The background color of the node
	 * @param foregroundColor The foreground color of the node
	 * @return The new node
	 */
	GraphNode createNode(Composite composite, Graph graph, Object label, int backgroundColor, int foregroundColor) {
		GraphNode node = new GraphNode(graph, ZestStyles.NODES_FISHEYE, label);
		node.setBackgroundColor(composite.getDisplay().getSystemColor(backgroundColor));
		node.setForegroundColor(composite.getDisplay().getSystemColor(foregroundColor));
		return node;
	}
}
