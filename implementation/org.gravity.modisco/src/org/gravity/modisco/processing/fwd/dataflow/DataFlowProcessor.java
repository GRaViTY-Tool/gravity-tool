package org.gravity.modisco.processing.fwd.dataflow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration;
import org.eclipse.gmt.modisco.java.AbstractMethodInvocation;
import org.eclipse.gmt.modisco.java.AbstractVariablesContainer;
import org.eclipse.gmt.modisco.java.DoStatement;
import org.eclipse.gmt.modisco.java.EnhancedForStatement;
import org.eclipse.gmt.modisco.java.FieldDeclaration;
import org.eclipse.gmt.modisco.java.ForStatement;
import org.eclipse.gmt.modisco.java.IfStatement;
import org.eclipse.gmt.modisco.java.MethodDeclaration;
import org.eclipse.gmt.modisco.java.ReturnStatement;
import org.eclipse.gmt.modisco.java.SingleVariableAccess;
import org.eclipse.gmt.modisco.java.SingleVariableDeclaration;
import org.eclipse.gmt.modisco.java.SwitchStatement;
import org.eclipse.gmt.modisco.java.TypeAccess;
import org.eclipse.gmt.modisco.java.UnresolvedMethodDeclaration;
import org.eclipse.gmt.modisco.java.VariableDeclaration;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;
import org.eclipse.gmt.modisco.java.VariableDeclarationStatement;
import org.eclipse.gmt.modisco.java.WhileStatement;
import org.gravity.eclipse.GravityActivator;
import org.gravity.modisco.MAbstractFlowElement;
import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MAbstractMethodInvocation;
import org.gravity.modisco.MConstructorDefinition;
import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MEntry;
import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MFlow;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MSingleVariableAccess;
import org.gravity.modisco.MSingleVariableDeclaration;
import org.gravity.modisco.ModiscoFactory;
import org.gravity.modisco.processing.AbstractTypedModiscoProcessor;
import org.gravity.modisco.processing.ProcessingMessages;

/**
 * A preprocessor for calculating data flow edges<br/>
 * <br/>
 *
 * <b>IMPORTANT REMARK:</b><br/>
 * To work properly, this processor requires FieldPreprocessing and
 * MethodPreprocessing to be executed prior to it, as it depends on the
 * decomposition of statements with multiple declarations into one statement for
 * each declaration.
 *
 * @author speldszus
 *
 */
public class DataFlowProcessor extends AbstractTypedModiscoProcessor<MDefinition> {

	private static final Logger LOGGER = Logger.getLogger(DataFlowProcessor.class.getName());
	private MGravityModel model;

	@Override
	public boolean process(MGravityModel model, Collection<MDefinition> elements, IProgressMonitor monitor) {
		this.model = model;
		final SubMonitor sub = SubMonitor.convert(monitor, ProcessingMessages.createElementForFlow, elements.size());

		sub.beginTask(ProcessingMessages.statementPreprocessing, 50);
		final List<MemberHandler> handlers = preProcessStatements();

		sub.internalWorked(50);
		sub.beginTask(ProcessingMessages.insertFlowEdges, 5);

		// Per handler: Reduction of intra-DFGs and then insertion of inter-procedural
		// data flows
		handlers.parallelStream().forEach(handler -> {
			// Reduction of intra-DFGs
			reduceIntraDFGFlows(handler);

			// Insertion of inter-procedural data flows
			for (final FlowNode node : handler.getMemberRef()) {
				// Setting flows
				setFlows(node, handler);
			}
		});
		if (GravityActivator.isVerbose()) {
			GraphVisualizer.drawGraphs(model, handlers, "reducedGraphs"); //$NON-NLS-1$
		}
		sub.internalWorked(5);
		return true;
	}

	/**
	 * Creates the flows
	 *
	 * @param node    The node for which flows should be created
	 * @param handler The handler used to discover the node
	 * @return true, if creating the flows was successful
	 */
	private boolean setFlows(FlowNode node, MemberHandler handler) {
		final MAbstractFlowElement access = (MAbstractFlowElement) node.getModelElement();
		MFlow accessOut = null;
		final Set<FlowNode> outRef = buildOutRef(node);
		for (final FlowNode inNode : buildInRef(handler, node)) {
			if (inNode == node) {
				continue;
			}
			final EObject inElement = inNode.getModelElement();
			if (inElement instanceof SingleVariableDeclaration) {
				accessOut = ModiscoFactory.eINSTANCE.createMFlow();
				accessOut.setFlowSource(((MSingleVariableDeclaration) inElement).getMEntry());
				if (outRef.isEmpty()) { // Handling parameter flows, which end in an access (e. g. if access is in an
					// assignment to a local)
					accessOut.setFlowOwner(access);
					accessOut.setFlowTarget(access);
				} else { // Set flowOwner to parameter's member, as the access will be removed in the TGG
					// transformation
					accessOut.setFlowOwner((MAbstractMethodDefinition) ((MSingleVariableDeclaration) inElement)
							.getMethodDeclaration());
				}
			} else {
				// Also create incoming flow here, if it's not coming from an access (to avoid
				// redundancy)
				if (!(inElement instanceof SingleVariableAccess || inElement instanceof AbstractMethodInvocation)) {
					final MFlow accessIn = ModiscoFactory.eINSTANCE.createMFlow();
					if (inElement instanceof VariableDeclarationFragment) {
						final AbstractVariablesContainer variablesContainer = ((VariableDeclarationFragment) inElement)
								.getVariablesContainer();
						if (variablesContainer instanceof FieldDeclaration) {
							final MFieldDefinition fieldDef = (MFieldDefinition) variablesContainer;
							accessIn.setFlowSource(fieldDef.getMSignature());
						} else {
							LOGGER.error(ProcessingMessages.varHasntBeenReduced + variablesContainer);
						}
					} else {
						accessIn.setFlowSource((MAbstractFlowElement) inElement);
					}
					accessIn.setFlowTarget(access);
					accessIn.setFlowOwner(access);
				}
			}
		}
		for (final FlowNode outNode : outRef) {
			if (outNode == node) {
				continue;
			}
			if (accessOut == null || !(accessOut.getFlowSource() instanceof MEntry)) {
				accessOut = ModiscoFactory.eINSTANCE.createMFlow();
				accessOut.setFlowSource(access);
				accessOut.setFlowOwner(access);
			}
			final EObject outElement = outNode.getModelElement();
			if (outElement instanceof ReturnStatement) {
				accessOut.setFlowTarget(handler.getMemberDef());
			} else if (outElement instanceof VariableDeclarationFragment) {
				final AbstractVariablesContainer variablesContainer = ((VariableDeclarationFragment) outElement)
						.getVariablesContainer();
				if (variablesContainer instanceof FieldDeclaration) {
					final MFieldDefinition fieldDef = (MFieldDefinition) variablesContainer;
					accessOut.setFlowTarget(fieldDef);
				} else {
					LOGGER.error(ProcessingMessages.varHasntBeenReduced + variablesContainer);
				}
			} else if (outElement instanceof MSingleVariableDeclaration) {
				// Set target
				final MSingleVariableDeclaration paramTarget = (MSingleVariableDeclaration) outElement;
				final MEntry sigParamTarget = paramTarget.getMEntry();
				accessOut.setFlowTarget(sigParamTarget);

				// Set owner
				final MAbstractMethodInvocation invocation = node.getFlowOwner();
				if (invocation != null) {
					accessOut.setFlowOwner(invocation);
				} else {
					LOGGER.log(Level.INFO,
							ProcessingMessages.setDefaultFlowTarget);
					accessOut.setFlowOwner((MAbstractMethodDefinition) paramTarget.getMethodDeclaration());
				}
			} else if (outElement instanceof IfStatement || outElement instanceof WhileStatement
					|| outElement instanceof ForStatement || outElement instanceof EnhancedForStatement
					|| outElement instanceof DoStatement || outElement instanceof SwitchStatement) {
				accessOut.setFlowTarget(handler.getMemberDef());
			} else {
				if (outElement instanceof MSingleVariableAccess) { // Omitting accesses of parameters, when the target
					// is another access
					final MSingleVariableAccess mSVA = (MSingleVariableAccess) outElement;
					final VariableDeclaration variable = mSVA.getVariable();
					if (variable instanceof MSingleVariableDeclaration) {
						accessOut.setFlowTarget(((MSingleVariableDeclaration) variable).getMEntry());
					} else if (variable.eContainer() instanceof MFieldDefinition
							&& accessOut.getFlowSource() instanceof MEntry) {
						accessOut.setFlowOwner(mSVA);
						accessOut.setFlowTarget(mSVA);
					} else { // Basically flows into field accesses without MEntry as sourceb
						accessOut.setFlowTarget((MAbstractFlowElement) outElement);
					}
				} else {
					final MAbstractFlowElement outTarget = (MAbstractFlowElement) outElement;
					accessOut.setFlowTarget(outTarget);
				}
			}
		}
		return true;
	}

	/**
	 * A constructor invocation or method invocation with a return value should
	 * explicitly have the MethodDef/MethodSig set as incoming flow
	 *
	 * @param handler
	 * @param node
	 * @return The set of incoming flows
	 */
	private Set<FlowNode> buildInRef(MemberHandler handler, FlowNode node) {
		final MAbstractFlowElement access = (MAbstractFlowElement) node.getModelElement();
		final Set<FlowNode> inRef = node.getInRef();
		if (access instanceof AbstractMethodInvocation) {
			final AbstractMethodDeclaration methodDef = ((AbstractMethodInvocation) access).getMethod();
			if (methodDef instanceof MConstructorDefinition) {
				final FlowNode defNode = handler.getFlowNodeOrCreate(methodDef);
				inRef.add(defNode);
				defNode.addOutRef(node);
			} else {
				TypeAccess returnType = null;
				if (methodDef != null) {
					returnType = ((MethodDeclaration) methodDef).getReturnType();
					if (returnType != null) {
						if (!returnType.getType().getName().equals("void")) { //$NON-NLS-1$
							final FlowNode sigNode = handler
									.getFlowNodeOrCreate(((MMethodDefinition) methodDef).getMSignature());
							inRef.add(sigNode);
							sigNode.addOutRef(node);
						}
					} else {
						if (!(methodDef instanceof UnresolvedMethodDeclaration)) { // Ignoring
							// UnresolvedMethodDeclarations for
							// now
							final FlowNode sigNode = handler
									.getFlowNodeOrCreate(((MMethodDefinition) methodDef).getMSignature());
							inRef.add(sigNode);
							sigNode.addOutRef(node);
						}
					}
				}
			}
		}
		return inRef;
	}

	/**
	 * @param handler
	 * @param node
	 * @return
	 */
	private Set<FlowNode> buildOutRef(FlowNode node) {
		final Set<FlowNode> outRef = node.getOutRef();
		if (outRef.size() > 1) {
			final Set<FlowNode> toRemove = new HashSet<>();
			for (final FlowNode flowNode : outRef) {
				final EObject modelElement = flowNode.getModelElement();
				if (modelElement instanceof MAbstractMethodInvocation) { // Remove flow into call, if there's
					// actually a paramFlow
					node.setFlowOwner((MAbstractMethodInvocation) modelElement);
					toRemove.add(flowNode);
					flowNode.getInRef().remove(node);
				}
			}
			outRef.removeAll(toRemove);
		}
		return outRef;
	}

	/**
	 * @param handler
	 * @return
	 */
	private void reduceIntraDFGFlows(MemberHandler handler) {
		for (final FlowNode flowNode : new ArrayList<>(handler.getAllFlowNodes())) {
			final EObject node = flowNode.getModelElement();
			if (node instanceof VariableDeclarationFragment) {
				if (((VariableDeclarationFragment) node).getVariablesContainer() instanceof FieldDeclaration) {
					// Keep node
				} else {
					reduceNodeInDFG(flowNode, handler);
				}
			} else if (node instanceof MAbstractMethodDefinition || node instanceof ReturnStatement
					|| node instanceof AbstractMethodInvocation || node instanceof SingleVariableDeclaration) {
				// Keep node
			} else if (node instanceof IfStatement || node instanceof WhileStatement || node instanceof ForStatement
					|| node instanceof EnhancedForStatement || node instanceof DoStatement
					|| node instanceof SwitchStatement) {
				// Keep nodes, as a flow into them indicates, that sensitive info can leak
				// implicitly through observation of the construct's behavior
			} else if (node instanceof SingleVariableAccess) {
				// Keep variable access node only if its a field access
				final VariableDeclaration variable = ((SingleVariableAccess) node).getVariable();
				if (variable == null) {
					LOGGER.error(ProcessingMessages.variableIsNull);
				} else if (variable.eContainer() instanceof VariableDeclarationStatement) {
					reduceNodeInDFG(flowNode, handler);
				}
			} else { // Everything else is reduced in the same way
				reduceNodeInDFG(flowNode, handler);
			}
		}
	}

	/**
	 * Removes the given node (including its flows) from reducedDFG and inserts
	 * direct flows from his inNodes to his outNodes.
	 *
	 * @param flowNode The node's key in reducedDFG.
	 * @param handler  The alreadySeen on which the reduction should be performed.
	 */
	private void reduceNodeInDFG(FlowNode flowNode, MemberHandler handler) {
		final Set<FlowNode> inRef = flowNode.getInRef();
		final Set<FlowNode> outRef = flowNode.getOutRef();
		for (final FlowNode outNode : outRef) {
			final Set<FlowNode> nodeInRef = outNode.getInRef();
			nodeInRef.addAll(inRef);
			nodeInRef.remove(flowNode);
			nodeInRef.remove(outNode);
		}
		for (final FlowNode inNode : inRef) {
			final Set<FlowNode> nodeOutRef = inNode.getOutRef();
			nodeOutRef.addAll(outRef);
			nodeOutRef.remove(flowNode);
			nodeOutRef.remove(inNode);
		}
		inRef.clear();
		outRef.clear();
		handler.removeFlowNode(flowNode.getModelElement());
	}

	/**
	 * Pre-processes the statements of all field and method definitions to determine
	 * the data flows between statement nodes. The resulting intermediate
	 * representation of data flow is then used to derive the data flow of each
	 * field/method.
	 *
	 * @param model The model, whose statements are processed.
	 * @return A list of the statement handlers resulting from the pre-processing.
	 */
	private List<MemberHandler> preProcessStatements() {
		final Stream<MemberHandler> methodProcessors = this.model.getMAbstractMethodDefinitions().parallelStream()
				.map(methodDef -> {
					final MemberHandler methodProcessor = new MemberHandler(methodDef);
					methodProcessor.getFlowNodeOrCreate(methodDef);
					for (final SingleVariableDeclaration param : methodDef.getParameters()) {
						methodProcessor.getFlowNodeOrCreate(param);
					}
					methodProcessor.handle();
					return methodProcessor;
				});
		final Stream<MemberHandler> fieldProcessors = this.model.getMFieldDefinitions().parallelStream()
				.flatMap(fieldDef -> fieldDef.getFragments().parallelStream()).map(fragment -> {
					final MemberHandler fieldProcessor = new MemberHandler(fragment);
					fieldProcessor.handle();
					fieldProcessor.getFlowNodeOrCreate(fragment.getVariablesContainer());
					return fieldProcessor;

				});

		final List<MemberHandler> handlers = Stream.concat(fieldProcessors, methodProcessors)
				.collect(Collectors.toList());
		if (GravityActivator.isVerbose()) {
			GraphVisualizer.drawGraphs(this.model, handlers, "graphs"); //$NON-NLS-1$
		}
		return handlers;
	}

	@Override
	public Class<MDefinition> getSupportedType() {
		return MDefinition.class;
	}
}
