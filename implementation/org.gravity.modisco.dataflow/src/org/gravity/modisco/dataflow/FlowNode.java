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
	
	/**
	 * A flag to indicate, whether this FlowNode has already been processed and thus was drawn from the alreadySeen HashMap at least once.
	 */
	private boolean fromAlreadySeen;
	
	public FlowNode(EObject correspondingElement) {
		modelElement = correspondingElement;
	}

	public List<FlowNode> getInRef() {
		return inRef;
	}
	
	public List<FlowNode> getOutRef() {
		return outRef;
	}
	
	public void addInRef(FlowNode node) {
		inRef.add(node);
		node.getOutRef().add(this);
	}
	
	public void addOutRef(FlowNode node) {
		outRef.add(node);
		node.getInRef().add(this);
	}
	
	public EObject getModelElement() {
		return modelElement;
	}
	
	public boolean isFromAlreadySeen() {
		return fromAlreadySeen;
	}
	
	public void setFromAlreadySeen() {
		fromAlreadySeen = true;
	}
}
