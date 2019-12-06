package org.gravity.modisco.processing.fwd.dataflow;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;
import org.gravity.modisco.MDefinition;

/**
 * A statement handler for all kinds of java statements, which determines the
 * data flow between statements. The inter-statement flow is used to derive
 * inter-member flow, which is stored in the corresponding fields of each
 * handler.
 *
 * @author dmebus
 *
 */
public class MemberHandler {

	/**
	 * The accesses observed in the member corresponding to this handler.
	 */
	private final Set<FlowNode> memberRef = new HashSet<>();

	/**
	 * The statements and expressions, which have already been processed, associated
	 * with their FlowNode representations.
	 */
	private final Map<EObject, FlowNode> alreadySeen = new ConcurrentHashMap<>();

	/**
	 * The member definition corresponding to this handler.
	 */
	private final MDefinition memberDef;

	public MemberHandler(final MDefinition correspondingMember) {
		this.memberDef = correspondingMember;
	}

	public MemberHandler(final VariableDeclarationFragment correspondingMember) {
		this.memberDef = (MDefinition) correspondingMember.getVariablesContainer();
	}

	public MDefinition getMemberDef() {
		return this.memberDef;
	}

	public Set<FlowNode> getMemberRef() {
		return this.memberRef;
	}

	public boolean addMemberRef(final FlowNode member) {
		return this.memberRef.add(member);
	}

	/**
	 * Checks, if a (non-null) FlowNode has already been created for the given
	 * element and returns it. Otherwise a new FlowNode is created, inserted into
	 * alreadySeen and returned.
	 *
	 * @param element The element, for which the check is performed.
	 * @return If already present, the FlowNode for the given element. A new
	 *         FlowNode for the element otherwise.
	 */
	public FlowNode getFlowNodeOrCreate(final EObject element) {
		final FlowNode seenNode = getFlowNode(element);
		if (seenNode != null) { // making sure, that null references lead to creation of new nodes
			seenNode.setToAlreadySeen();
			return seenNode;
		}
		final FlowNode member = new FlowNode(element);
		this.alreadySeen.put(element, member);
		return member;
	}

	/**
	 * Checks, if a (non-null) FlowNode has already been created for the given
	 * element and returns it.
	 *
	 * @param element The element, for which the check is performed.
	 * @return If already present, the FlowNode for the given element or else null
	 */
	public FlowNode getFlowNode(final EObject element) {
		return this.alreadySeen.get(element);
	}

	public FlowNode removeFlowNode(final EObject key) {
		return this.alreadySeen.remove(key);
	}

	public Collection<FlowNode> getAllFlowNodes() {
		return this.alreadySeen.values();
	}

	public void propagateBackReadAccess(final Collection<EObject> seenContainers, final FlowNode currentNode) {
		for (final EObject currentObj : seenContainers) {
			final FlowNode newNode = getFlowNodeOrCreate(currentObj);
			currentNode.addOutRef(newNode);
		}
	}

	public void propagateBackWriteAccess(final Collection<EObject> seenContainers, final FlowNode currentNode) {
		for (final EObject currentObj : Collections.unmodifiableCollection(seenContainers)) {
			final FlowNode newNode = getFlowNodeOrCreate(currentObj);
			currentNode.addInRef(newNode);
		}
	}

	@Override
	public String toString() {
		return super.toString() + '(' + this.memberDef + ')';
	}
}
