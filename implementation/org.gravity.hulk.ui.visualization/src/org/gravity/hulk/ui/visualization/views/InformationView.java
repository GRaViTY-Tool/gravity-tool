package org.gravity.hulk.ui.visualization.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.zest.core.widgets.Graph;
import org.gravity.hulk.ui.visualization.information.providers.InformationViewContentProvider;

public abstract class InformationView extends ViewPart {

	public static final String ID = "org.gravity.hulk.ui.visualization.views.InformationView";

	protected Composite parent;
	protected ScrolledComposite sc;
	protected Graph graph;
	protected Browser informationLabel;
	protected TabFolder graphInformationFolder;
	protected InformationViewContentProvider informationProvider;
	protected Composite mainComposite;
	protected Composite informationLabelComposite;
	protected Composite graphComposite;
	protected Composite graphInformationLabelComposite;

	@Override
	public void createPartControl(Composite parent) {
		this.parent = parent;
		sc = new ScrolledComposite(parent, SWT.H_SCROLL | SWT.V_SCROLL);
		mainComposite = new Composite(sc, SWT.NONE);
		mainComposite.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		sc.setContent(mainComposite);

		GridLayout gridLayout = new GridLayout(2, false);
		mainComposite.setLayout(gridLayout);

		informationLabelComposite = new Composite(mainComposite, SWT.NONE);
		graphComposite = new Composite(mainComposite, SWT.NONE);
		graphInformationLabelComposite = new Composite(mainComposite, SWT.NONE);

		informationLabelComposite.setLayout(new FillLayout());
		graphComposite.setLayout(new FillLayout());
		graphInformationLabelComposite.setLayout(new FillLayout());

		GridData informationLabelCompositeGridData = new GridData();
		informationLabelCompositeGridData.horizontalAlignment = GridData.FILL;
		informationLabelCompositeGridData.horizontalSpan = 2;
		informationLabelCompositeGridData.widthHint = 600;
		informationLabelCompositeGridData.heightHint = 300;
		informationLabelCompositeGridData.grabExcessHorizontalSpace = true;
		informationLabelCompositeGridData.grabExcessVerticalSpace = true;
		informationLabelComposite.setLayoutData(informationLabelCompositeGridData);
		informationLabelComposite.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WHITE));

		GridData graphCompositeGridData = new GridData();
		graphCompositeGridData.horizontalAlignment = GridData.FILL;
		graphCompositeGridData.heightHint = 400;
		graphCompositeGridData.widthHint = 700;
		graphCompositeGridData.grabExcessHorizontalSpace = true;
		graphCompositeGridData.grabExcessVerticalSpace = true;
		graphComposite.setLayoutData(graphCompositeGridData);
		graphComposite.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WHITE));

		GridData graphInformationLabelCompositeGridData = new GridData();
		graphInformationLabelCompositeGridData.horizontalAlignment = GridData.FILL;
		graphInformationLabelCompositeGridData.heightHint = 400;
		graphInformationLabelCompositeGridData.widthHint = 300;
		graphInformationLabelCompositeGridData.grabExcessHorizontalSpace = true;
		graphInformationLabelCompositeGridData.grabExcessVerticalSpace = true;
		graphInformationLabelComposite.setLayoutData(graphInformationLabelCompositeGridData);
		graphInformationLabelComposite.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WHITE));

		informationProvider.setComposites(informationLabelComposite, graphComposite, graphInformationLabelComposite);

		informationProvider.setUpInformationViewContent();

		informationLabel = informationProvider.getInformationLabel();
		graph = informationProvider.getGraph();
		graphInformationFolder = informationProvider.getGraphInformationTabFolder();

		sc.setExpandHorizontal(true);
		sc.setExpandVertical(true);
		sc.setMinSize(mainComposite.computeSize(SWT.DEFAULT, SWT.DEFAULT));

	}

	@Override
	public void setFocus() {
		if (informationProvider.checkLocalState()) {
			informationProvider.refreshDetectionObjects();
			informationProvider.refreshGraphInformationTabFolder();
		}

	}

}
