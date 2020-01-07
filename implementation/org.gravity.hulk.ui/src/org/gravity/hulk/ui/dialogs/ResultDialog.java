package org.gravity.hulk.ui.dialogs;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.ScrollBar;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.antipatterngraph.HAnnotation;

public class ResultDialog extends Dialog {

	/**
	 * The logger of this class
	 */
	private static final Logger LOGGER = Logger.getLogger(ResultDialog.class);

	Iterable<HDetector> selection;
	Iterable<HDetector> executed;
	Shell pShell;

	private final String name;

	/**
	 * Creates a new dialog
	 *
	 * @param parentShell       The parent shell in which the dialog should be shown
	 * @param selectedDetectors All selected detectors
	 * @param executedDetectors All executed detectors
	 * @param name
	 */
	public ResultDialog(Shell parentShell, Iterable<HDetector> selectedDetectors,
			Iterable<HDetector> executedDetectors, String name) {
		super(parentShell);
		this.pShell = parentShell;
		this.selection = selectedDetectors;
		this.executed = executedDetectors;
		this.name = name;
	}

	@Override
	protected Point getInitialSize() {
		return new Point(450, 600);
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		final Composite container = (Composite) super.createDialogArea(parent);

		final CTabFolder folder = new CTabFolder(container, SWT.TOP);
		folder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		addContents(folder, this.selection);

		final Button button = new Button(container, SWT.CHECK);
		button.setText("Show all executed detectors.");
		button.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				final CTabItem selectedItem = folder.getSelection();
				final String selected = selectedItem.getText();
				for (final CTabItem item : folder.getItems()) {
					item.dispose();
				}
				if (button.getSelection()) {
					addContents(folder, ResultDialog.this.executed);
				} else {
					addContents(folder, ResultDialog.this.selection);
				}
				for (final CTabItem item : folder.getItems()) {
					if (item.getText().equals(selected)) {
						folder.setSelection(item);
						break;
					}
				}
				if (folder.getSelection() == null) {
					folder.setSelection(0);
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				if(LOGGER.isInfoEnabled()) {
					LOGGER.info("Default selected: "+e.getSource());
				}
				widgetSelected(e);
			}
		});

		final Button saveButton = new Button(container, SWT.PUSH);
		saveButton.setText("save");
		saveButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				final FileDialog fdialog = new FileDialog(ResultDialog.this.pShell, SWT.SAVE);
				fdialog.setFilterExtensions(new String[] { "*.txt", "*" });
				final String saveFile = fdialog.open();
				if (!saveFile.isEmpty()) {
					save(folder, saveFile);
				}

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);

			}
		});

		return container;
	}

	void addContents(CTabFolder folder, Iterable<HDetector> items) {
		for (final HDetector eClass : items) {
			final CTabItem tab = new CTabItem(folder, getShellStyle());
			tab.setText(eClass.eClass().getName());

			final Tree tree = new Tree(folder, SWT.V_SCROLL | SWT.H_SCROLL);
			final ScrollBar vBar = tree.getVerticalBar();
			vBar.setEnabled(true);

			if (!eClass.getHAnnotation().isEmpty()) {
				for (final HAnnotation annotation : eClass.getHAnnotation()) {
					annotation.getTreeItem(tree, SWT.NONE);
				}
			} else {
				new TreeItem(tree, SWT.NONE).setText("No " + eClass.getGuiName() + " has been found.");
			}

			folder.showItem(folder.getItems()[0]);
			tab.setControl(tree);

		}
	}

	private void save(CTabFolder folder, String filePath) {
		final List<DetectionContent> contents = new ArrayList<>();
		for (final CTabItem tabItem : folder.getItems()) {
			final DetectionContent content = new DetectionContent(tabItem.getText());
			contents.add(content);
			final Tree tree = (Tree) tabItem.getControl();
			if (tree == null) {
				continue;
			}

			for (final TreeItem treeItem : tree.getItems()) {
				content.addResult(treeItem.getText());
			}
		}

		contents.sort((o1, o2) -> o1.getDetector().compareTo(o2.getDetector()));

		final StringBuilder builder = new StringBuilder(100);
		for (final DetectionContent content : contents) {
			builder.append(content.getDetector());
			for (final String result : content.getSortedResult()) {
				builder.append(System.lineSeparator());
				builder.append(result);
			}
			builder.append(System.lineSeparator());
			builder.append("--------------------------------------------------------------------");
			builder.append(System.lineSeparator());
		}

		try (PrintWriter out = new PrintWriter(filePath)){
			out.print(builder);
		} catch (final FileNotFoundException e) {
			LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
		}

	}

	private class DetectionContent {
		private final String detector;
		private List<String> results;


		public DetectionContent(String detector) {
			this.detector = detector;
		}
		public String getDetector() {
			return this.detector;
		}

		public List<String> getSortedResult() {
			if (this.results == null) {
				this.results = new ArrayList<>();
			}
			Collections.sort(this.results);
			return this.results;
		}

		public void addResult(String result) {
			if (this.results == null) {
				this.results = new ArrayList<>();
			}
			this.results.add(result);
		}
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText(this.name);
	}
}
