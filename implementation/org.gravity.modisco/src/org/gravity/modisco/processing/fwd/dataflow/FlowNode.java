package org.gravity.modisco.processing.fwd.dataflow;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;

/**
 * An intermediate representation of data flow elements. It captures the flow
 * information of a single statement node.
 *
 * @author dmebus
 * @author Sven Peldszus
 *
 */
public class FlowNode {

	/**
	 * Collection of all statements from which a data flow goes <b>into</b> this
	 * statement.
	 */
	private final LinkedHashSet<Flow> incomingFlows = new LinkedHashSet<>();

	/**
	 * Collection of all statements to which data flows <b>from</b> this statement.
	 */
	private final LinkedHashSet<Flow> outgoingFlows = new LinkedHashSet<>();

	/**
	 * The model element, which corresponds to this statement node.
	 */
	private final EObject modelElement;

	/**
	 * A flag to indicate, whether this FlowNode has already been processed and thus
	 * was drawn from the alreadySeen HashMap at least once.
	 */
	private boolean alreadySeen;

	public FlowNode(EObject correspondingElement) {
		this.modelElement = correspondingElement;
	}

	public void addInRef(FlowNode node) {
		new Flow(node,this);
	}

	public void addOutRef(FlowNode node) {
		new Flow(this, node);
	}

	public EObject getModelElement() {
		return this.modelElement;
	}

	public boolean alreadySeen() {
		return this.alreadySeen;
	}

	public void setToAlreadySeen() {
		this.alreadySeen = true;
	}

	/**
	 * The out refs
	 * 
	 * @return a unmodifiable copy of the out refs
	 */
	public List<FlowNode> getOutRef() {
		return outgoingFlows.stream().map(Flow::getTrg).collect(Collectors.toList());
	}

	/**
	 * The in refs
	 * 
	 * @return a unmodifiable copy of the in refs
	 */
	public List<FlowNode> getInRef() {
		return incomingFlows.stream().map(Flow::getSrc).collect(Collectors.toList());
	}

	/**
	 * Redirects the incoming flows of this node to the outgoing flows
	 * 
	 * @return This flow
	 */
//	public FlowNode reduce() {
//		for (FlowNode outNode : outgoingFlows) {
//			final LinkedHashSet<FlowNode> nodeInRef = outNode.incomingFlows;
//			nodeInRef.addAll(incomingFlows);
//			nodeInRef.remove(this);
//			nodeInRef.remove(outNode);
//		}
//		for (final FlowNode inNode : incomingFlows) {
//			final LinkedHashSet<FlowNode> nodeOutRef = inNode.outgoingFlows;
//			nodeOutRef.addAll(outgoingFlows);
//			nodeOutRef.remove(this);
//			nodeOutRef.remove(inNode);
//		}
//		incomingFlows.clear();
//		outgoingFlows.clear();
//		return this;
//	}
	
	/**
	 * Redirects the incoming flows of this node to the outgoing flows
	 * 
	 * @return This flow
	 */
	public FlowNode reduce() {		
		for(Flow in : incomingFlows) {
			FlowNode src = in.getSrc();
			for(Flow out : outgoingFlows) {
				FlowNode trg = out.getTrg();
				if(!src.equals(trg)) {
					new Flow(src, trg);
				}
			}
		}
		new ArrayList<>(incomingFlows).forEach(Flow::delete);
		new ArrayList<>(outgoingFlows).forEach(Flow::delete);
		return this;
	}

	public class Flow {
		private FlowNode src;
		private FlowNode trg;

		public Flow(FlowNode src, FlowNode trg) {
			this.src = src;
			this.trg = trg;
			src.outgoingFlows.add(this);
			trg.incomingFlows.add(this);
		}
		
		private FlowNode getSrc() {
			return src;
		}
		
		private FlowNode getTrg() {
			return trg;
		}
		
		private void delete() {
			src.outgoingFlows.remove(this);
			trg.incomingFlows.remove(this);
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Flow) {
				Flow flow = (Flow) obj;
				return src.equals(flow.src) && trg.equals(flow.trg); 
			}
			return super.equals(obj);
		}
		
		@Override
		public int hashCode() {
			return src.hashCode() & trg.hashCode();
		}
	}
}
