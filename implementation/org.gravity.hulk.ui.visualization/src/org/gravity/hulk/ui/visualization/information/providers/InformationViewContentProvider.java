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
import org.gravity.typegraph.basic.TAbstractType;

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

	private final EnumMap<Flaws, TabItem> tabItems;

	protected abstract Browser setUpInformationBrowser(Composite informationLabelComposite);

	protected abstract Graph setUpGraph(Composite graphComposite);

	protected abstract DetectionPreprocessor setUpDetectionPreprocesser();

	public InformationViewContentProvider() {
		this.detectionPreprocesser = setUpDetectionPreprocesser();
		this.detectionObjects = this.detectionPreprocesser.preprocessDetections(null);
		this.tabItems = new EnumMap<>(Flaws.class);
		this.localScanID = "";
	}

	public boolean checkLocalState() {
		if (!globalScanID.equals(this.localScanID)) {
			this.localScanID = globalScanID;
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

		this.informationBrowser = setUpInformationBrowser(this.informationLabelComposite);

		this.graph = setUpGraph(this.graphComposite);

		refreshDetectionObjects();

		refreshGraphInformationTabFolder();

		this.graph.addSelectionListener(setUpSelectionAdapter());
	}

	public void refreshDetectionObjects() {
		this.detectionObjects = this.detectionPreprocesser.preprocessDetections(apg);
	}

	public static void setAPG(HAntiPatternGraph apg) {
		InformationViewContentProvider.apg = apg;
		globalScanID = UUID.randomUUID().toString();
	}

	public void refreshGraphInformationTabFolder() {

		this.tabItems.clear();

		if (this.graphInformationTabFolder != null) {
			this.graphInformationTabFolder.dispose();
		}

		this.graphInformationTabFolder = new TabFolder(this.graphInformationLabelComposite, SWT.BORDER);
		this.graphInformationTabFolder
		.setBackground(this.graphInformationLabelComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		this.graphInformationTabFolder.setLayout(new FillLayout());

		for (final Entry<Flaws, List<DetectionObject>> entry : this.detectionObjects.entrySet()) {
			final TabItem item = new TabItem(this.graphInformationTabFolder, SWT.V_SCROLL);
			final Flaws smell = entry.getKey();
			item.setText(smell.toString());
			this.tabItems.put(smell, item);

			final GridLayout gridLayout = new GridLayout();
			gridLayout.verticalSpacing = 2;

			final ExpandBar detectionsBar = new ExpandBar(this.graphInformationTabFolder, SWT.V_SCROLL);
			detectionsBar.setBackground(this.graphInformationLabelComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
			detectionsBar.setLayout(gridLayout);

			int detectionNumber = 0;
			for (final DetectionObject detectionObject : entry.getValue()) {

				final ExpandItem detectionIDItem = new ExpandItem(detectionsBar, SWT.NONE);
				detectionIDItem.setText("Detection ID: " + detectionNumber);

				final RowLayout detectionCompositeRowLayout = new RowLayout();
				detectionCompositeRowLayout.type = SWT.VERTICAL;
				detectionCompositeRowLayout.pack = true;

				final Composite detectionComposite = new Composite(detectionsBar, SWT.NONE);
				detectionComposite
				.setBackground(this.graphInformationLabelComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
				detectionComposite.setLayout(detectionCompositeRowLayout);

				// Detections
				final Label detectionLabel = new Label(detectionComposite, SWT.NONE);
				detectionLabel.setText("Detected in:");
				final FontDescriptor boldDescriptor = FontDescriptor.createFrom(detectionLabel.getFont()).setStyle(SWT.BOLD);
				final Font boldFont = boldDescriptor.createFont(detectionLabel.getDisplay());
				detectionLabel.setFont(boldFont);

				final Composite detectionsComposite = new Composite(detectionComposite, SWT.NONE);
				detectionsComposite
				.setBackground(this.graphInformationLabelComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
				detectionsComposite.setLayout(new FillLayout(SWT.VERTICAL));

				for (final Entry<TAbstractType, String> detectionEntry : detectionObject.getDetections().entrySet()) {
					String value;
					if (!detectionEntry.getValue().equals("-1")) {
						value = "Value: " + detectionEntry.getValue();
					} else {
						value = "Value: none";
					}
					final Link link = new Link(detectionsComposite, SWT.NONE);
					link.setText("<A>" + detectionEntry.getKey().getFullyQualifiedName() + "</A>" + "\n" + value);
					link.addListener(SWT.Selection, new DetectionLinkListener());
					link.setBackground(this.graphInformationLabelComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
				}
				// Thresholds
				final Label thresholdLabel = new Label(detectionComposite, SWT.NONE);
				thresholdLabel.setText("Thresholds:");
				final FontDescriptor thresholdBoldDescriptor = FontDescriptor.createFrom(thresholdLabel.getFont())
						.setStyle(SWT.BOLD);
				final Font thresholdBoldFont = thresholdBoldDescriptor.createFont(thresholdLabel.getDisplay());
				thresholdLabel.setFont(thresholdBoldFont);

				final Composite thresholdsComposite = new Composite(detectionComposite, SWT.NONE);
				thresholdsComposite
				.setBackground(this.graphInformationLabelComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
				thresholdsComposite.setLayout(new FillLayout(SWT.VERTICAL));

				for (final Entry<String, Number> thresholdEntry : detectionObject.getThresholds().entrySet()) {
					String value = "";
					if (!thresholdEntry.getValue().equals(-1)) {
						value = value + "\n Value: " + thresholdEntry.getValue();
					}
					final Label label = new Label(thresholdsComposite, SWT.NONE);
					label.setText(thresholdEntry.getValue() + " " + value);
					label.setBackground(this.graphInformationLabelComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
				}

				detectionIDItem.setControl(detectionComposite);
				detectionIDItem.setHeight(detectionComposite.computeSize(SWT.DEFAULT, SWT.DEFAULT).y);

				detectionNumber++;
				this.graphInformationLabelComposite.layout();
			}
			item.setControl(detectionsBar);
		}

		this.graphInformationLabelComposite.layout();

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

				final List<GraphNode> selectionList = ((Graph) event.getSource()).getSelection();
				if (selectionList.size() == 1) {
					final GraphNode node = selectionList.get(0);
					final String text = node.getText();
					if (!(text.equals("AND") || text.equals("OR") || text.equals("CALCULATE"))) {
						final Flaws flaw = Flaws.valueOf(text);
						InformationViewContentProvider.this.graphInformationTabFolder.setSelection(InformationViewContentProvider.this.tabItems.get(flaw));
					}
				}

			}
		};
		return adapter;
	}

	public Browser getInformationLabel() {
		if (this.informationBrowser == null) {
			setUpInformationViewContent();
		}
		return this.informationBrowser;
	}

	public Graph getGraph() {
		if (this.graph == null) {
			setUpInformationViewContent();
		}
		return this.graph;
	}

	public TabFolder getGraphInformationTabFolder() {
		if (this.graphInformationTabFolder == null) {
			setUpInformationViewContent();
		}
		return this.graphInformationTabFolder;
	}

	/**
	 * Create a new edge
	 *
	 * @param composite The composite containing the edge
	 * @param graph     The graph containing the edge
	 * @param src       The source node
	 * @param trg       The target node
	 * @param label     The label on the node
	 * @param color     The color of the edge
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
		final GraphNode node = new GraphNode(graph, ZestStyles.NODES_FISHEYE, label.toString());
		node.setBackgroundColor(composite.getDisplay().getSystemColor(backgroundColor));
		node.setForegroundColor(composite.getDisplay().getSystemColor(foregroundColor));
		return node;
	}
}
