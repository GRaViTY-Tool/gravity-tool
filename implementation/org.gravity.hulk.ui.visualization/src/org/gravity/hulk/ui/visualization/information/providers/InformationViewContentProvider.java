package org.gravity.hulk.ui.visualization.information.providers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import org.eclipse.zest.core.widgets.GraphNode;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.ui.visualization.detection.DetectionObject;
import org.gravity.hulk.ui.visualization.detection.DetectionPreprocessor;
import org.gravity.hulk.ui.visualization.listener.DetectionLinkListener;
import org.gravity.hulk.ui.visualization.util.GlobalStrings;

public abstract class InformationViewContentProvider {

	private Composite informationLabelComposite;
	private Composite graphComposite;
	private Composite graphInformationLabelComposite;
	private Browser informationBrowser;
	private Graph graph;
	private TabFolder graphInformationTabFolder;
	private Map<String, List<DetectionObject>> detectionObjects;
	protected static HAntiPatternGraph apg;
	protected static String GLOBAL_SCAN_ID = "";
	protected DetectionPreprocessor detectionPreprocesser;
	private String localScanID;

	private Map<String, TabItem> tabItems;

	protected abstract Browser setUpInformationBrowser(Composite informationLabelComposite);

	protected abstract Graph setUpGraph(Composite graphComposite);

	protected abstract DetectionPreprocessor setUpDetectionPreprocesser();

	public InformationViewContentProvider() {
		detectionPreprocesser = setUpDetectionPreprocesser();
		detectionObjects = detectionPreprocesser.preprocessDetectionts(null);
		tabItems = new HashMap<String, TabItem>();
		localScanID = "";
	}

	public boolean checkLocalState() {
		if (!GLOBAL_SCAN_ID.equals(localScanID)) {
			localScanID = GLOBAL_SCAN_ID;
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
		detectionObjects = detectionPreprocesser.preprocessDetectionts(apg);
	}

	public static void setAPG(HAntiPatternGraph apg) {
		InformationViewContentProvider.apg = apg;
		GLOBAL_SCAN_ID = UUID.randomUUID().toString();
	}

	public void refreshGraphInformationTabFolder() {

		tabItems.clear();

		if (graphInformationTabFolder != null)
			graphInformationTabFolder.dispose();

		graphInformationTabFolder = new TabFolder(graphInformationLabelComposite, SWT.BORDER);
		graphInformationTabFolder
				.setBackground(graphInformationLabelComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		graphInformationTabFolder.setLayout(new FillLayout());

		for (String smell : detectionObjects.keySet()) {
			TabItem item = new TabItem(graphInformationTabFolder, SWT.V_SCROLL);
			item.setText(smell);
			tabItems.put(smell, item);

			GridLayout gridLayout = new GridLayout();
			gridLayout.verticalSpacing = 2;

			ExpandBar detectionsBar = new ExpandBar(graphInformationTabFolder, SWT.V_SCROLL);
			detectionsBar.setBackground(graphInformationLabelComposite.getDisplay().getSystemColor(SWT.COLOR_WHITE));
			detectionsBar.setLayout(gridLayout);

			List<DetectionObject> detections = detectionObjects.get(smell);

			int detectionNumber = 0;
			for (DetectionObject detectionObject : detections) {

				ExpandItem detectionIDItem = new ExpandItem(detectionsBar, SWT.NONE);
				detectionIDItem.setText("Detection ID: " + String.valueOf(detectionNumber));

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

				Map<String, String> detectionObjectDetections = detectionObject.getDetections();
				for (String detection : detectionObjectDetections.keySet()) {
					String value = "";
					if (!detectionObjectDetections.get(detection).equals("-1"))
						value = value + "Value: " + detectionObjectDetections.get(detection);
					else
						value = value + "Value: none";
					Link link = new Link(detectionsComposite, SWT.NONE);
					link.setText("<A>" + detection + "</A>" + "\n" + value);
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

				Map<String, String> thresholds = detectionObject.getThresholds();
				for (String detection : thresholds.keySet()) {
					String value = "";
					if (!thresholds.get(detection).equals("-1"))
						value = value + "\n Value: " + thresholds.get(detection);
					Label label = new Label(thresholdsComposite, SWT.NONE);
					label.setText(detection + value);
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
					if (!(node.getText().equals(GlobalStrings.AND) || node.getText().equals(GlobalStrings.OR)
							|| node.getText().equals(GlobalStrings.CALCULATE)))
						graphInformationTabFolder.setSelection(tabItems.get(node.getText()));
				}

			}
		};
		return adapter;
	}

	public Browser getInformationLabel() {
		if (informationBrowser == null)
			setUpInformationViewContent();
		return informationBrowser;
	}

	public Graph getGraph() {
		if (graph == null)
			setUpInformationViewContent();
		return graph;
	}

	public TabFolder getGraphInformationTabFolder() {
		if (graphInformationTabFolder == null)
			setUpInformationViewContent();
		return graphInformationTabFolder;
	}
}
