package org.gravity.eclipse.ui.exceptions;

/**
 * This exception should be thrown if an object of an unsupported type has been selected.
 * 
 * @author speldszus
 *
 */
public class UnsupportedSelectionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7607056559516364611L;
	
	
	private final Class<?> selection;

	/**
	 * Created a new exception with the unsupported type
	 * 
	 * @param selection The unsupported type
	 */
	public UnsupportedSelectionException(Class<?> selection) {
		super("The selection of objects of type \""+selection.getName()+"\" is not supported");
		this.selection = selection;
	}

	/**
	 * A getter for the unsupported type
	 * 
	 * @return the unsupported type
	 */
	public Class<?> getSelection() {
		return selection;
	}

}
