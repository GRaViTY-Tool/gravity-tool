package org.gravity.modisco.dataflow;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * An intermediate representation of data flow elements.
 * It captures the flow information of a single statement node.
 * 
 * @author dmebus
 *
 */
public class FlowNode {

	/**
	 * Collection of all statements from which a data flow goes <b>into</b> this statement.
	 */
	private final List<FlowNode> inRef = new ArrayList<>();
	
	/**
	 * Collection of all statements to which data flows <b>from</b> this statement.
	 */
	private final List<FlowNode> outRef = new ArrayList<>();
	
	/**
	 * The model element, which corresponds to this statement node.
	 */
	private EObject modelElement;
	
	public FlowNode(EObject correspondingElement) {
		modelElement = correspondingElement;
	}

	public List<FlowNode> getInRef() {
		return inRef;
	}
	
	public List<FlowNode> getOutRef() {
		return outRef;
	}
	
	public EObject getModelElement() {
		return modelElement;
	}
}
