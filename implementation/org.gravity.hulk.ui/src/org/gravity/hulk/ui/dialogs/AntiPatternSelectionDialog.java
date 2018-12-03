package org.gravity.hulk.ui.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.CheckedTreeSelectionDialog;

/**
 * The dialog for selecting anti-patterns for detection
 * 
 * @author speldszus
 *
 */
public class AntiPatternSelectionDialog extends CheckedTreeSelectionDialog {


	private List<SelectionListener> listener = new ArrayList<>();

	/**
	 * Creates a new instance of this dialog
	 *  
	 * @param parent The parent shell
	 * @param labelProvider A label provider
	 * @param contentProvider A content provider
	 * @param style The SWT style
	 */
	public AntiPatternSelectionDialog(Shell parent, ILabelProvider labelProvider, ITreeContentProvider contentProvider,
			int style) {
		super(parent, labelProvider, contentProvider, style);
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite createDialogArea = (Composite) super.createDialogArea(parent);
	        
		Button generateJavaAnnotationsButton = new Button(createDialogArea, SWT.CHECK);
		generateJavaAnnotationsButton.setText("Generate Java Annotations");
		for(SelectionListener l : listener){
			generateJavaAnnotationsButton.addSelectionListener(l);
		}
	
		return createDialogArea;
	}
	
	/**
	 * Adds a selection listener to the list of listeners 
	 * 
	 * @param listener The listener
	 */
	public void addJavaAnnotationsSelectedListener(SelectionListener listener){
		this.listener.add(listener);
	}
}
