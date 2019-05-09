package org.gravity.modisco.dataflow;

import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;

public class FlowNode {

	private HashMap<FlowNode, String> inRef = new HashMap<FlowNode, String>();
	private HashMap<FlowNode, String> outRef = new HashMap<FlowNode, String>();
	
	private LinkedList<FlowNode> def = new LinkedList<FlowNode>();
	
	/**
	 * The corresponding model element.
	 */
	private EObject modelElement;
	
	public FlowNode(EObject correspondingElement) {
		modelElement = correspondingElement;
	}

	public HashMap<FlowNode, String> getInRef() {
		return inRef;
	}
	
	public HashMap<FlowNode, String> getOutRef() {
		return outRef;
	}
	
	public LinkedList<FlowNode> getDef() {
		return def;
	}
	
	public EObject getModelElement() {
		return modelElement;
	}
}
