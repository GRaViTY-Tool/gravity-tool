package org.gravity.modisco.processing.fwd.dataflow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
		final SubMonitor sub = SubMonitor.convert(monitor, "Create model elements for data flow", elements.size());

		sub.beginTask("Statement pre-processing", 50);
		final List<StatementHandlerDataFlow> handlers = preProcessStatements();

		sub.internalWorked(50);
		sub.beginTask("Insertion of data flow edges", 5);
		// Per handler: Reduction of intra-DFGs and then insertion of inter-procedural
		// data flows
		for (final StatementHandlerDataFlow handler : handlers) {
			// Determination of member's type
			final EObject memberDef = handler.getMemberDef();
			MDefinition memberDefTyped = null;
			if (memberDef instanceof MAbstractMethodDefinition) {
				memberDefTyped = (MDefinition) memberDef;
			} else if (memberDef instanceof VariableDeclarationFragment) {
				memberDefTyped = (MDefinition) ((VariableDeclarationFragment) memberDef).getVariablesContainer();
			} else {
				LOGGER.log(Level.INFO, "ERROR: Handler with unknown member type " + memberDef.getClass().getName()
						+ " in DataFlowProcessor");
				return false;
			}
			// Reduction of intra-DFGs
			final Map<EObject, FlowNode> reducedDFG = reduceIntraDFGFlows(handler);
			// Insertion of inter-procedural data flows

			for (final FlowNode node : handler.getMemberRef()) {
				// Removing unnecessary out edges (self-flows and flows to calls in paramFlows)
				final Set<FlowNode> outRef = buildOutRef(reducedDFG, node);
				final Set<FlowNode> inRef = buildInRef(handler, node);
				// Setting flows
				setFlows(memberDefTyped, node, outRef, inRef);
			}
		}
		if (GravityActivator.isVerbose()) {
			GraphVisualizer.drawGraphs(model, handlers, "reducedGraphs");
		}
		sub.internalWorked(5);
		return true;
	}

	/**
	 * @param definition
	 * @param node
	 * @param access
	 * @param outRef
	 * @param inRef
	 */
	private void setFlows(MDefinition definition, FlowNode node, Set<FlowNode> outRef, Set<FlowNode> inRef) {
		final MAbstractFlowElement access = (MAbstractFlowElement) node.getModelElement();
		MFlow accessOut = null;
		for (final FlowNode inNode : inRef) {
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
							LOGGER.error("A variable declaration fragment hasn't been reduced: " + variablesContainer);
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
				accessOut.setFlowTarget(definition);
			} else if (outElement instanceof VariableDeclarationFragment) {
				final AbstractVariablesContainer variablesContainer = ((VariableDeclarationFragment) outElement)
						.getVariablesContainer();
				if (variablesContainer instanceof FieldDeclaration) {
					final MFieldDefinition fieldDef = (MFieldDefinition) variablesContainer;
					accessOut.setFlowTarget(fieldDef);
				} else {
					LOGGER.error("A variable declaration fragment hasn't been reduced: " + variablesContainer);
				}
			} else if (outElement instanceof MSingleVariableDeclaration) {
				completeFlowForSigParam(outElement, node, accessOut);
			} else if (outElement instanceof IfStatement || outElement instanceof WhileStatement
					|| outElement instanceof ForStatement || outElement instanceof EnhancedForStatement
					|| outElement instanceof DoStatement || outElement instanceof SwitchStatement) {
				accessOut.setFlowTarget(definition);
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
	}

	/**
	 * A constructor invocation or method invocation with a return value should
	 * explicitly have the MethodDef/MethodSig set as incoming flow
	 *
	 * @param handler
	 * @param node
	 * @return The set of incoming flows
	 */
	private Set<FlowNode> buildInRef(StatementHandlerDataFlow handler, FlowNode node) {
		final MAbstractFlowElement access = (MAbstractFlowElement) node.getModelElement();
		final Set<FlowNode> inRef = node.getInRef();
		if (access instanceof AbstractMethodInvocation) {
			final AbstractMethodDeclaration methodDef = ((AbstractMethodInvocation) access).getMethod();
			if (methodDef instanceof MConstructorDefinition) {
				final FlowNode defNode = handler.getFlowNodeForElement(methodDef);
				inRef.add(defNode);
				defNode.addOutRef(node);
			} else {
				TypeAccess returnType = null;
				if (methodDef != null) {
					returnType = ((MethodDeclaration) methodDef).getReturnType();
					if (returnType != null) {
						if (!returnType.getType().getName().equals("void")) {
							final FlowNode sigNode = handler
									.getFlowNodeForElement(((MMethodDefinition) methodDef).getMSignature());
							inRef.add(sigNode);
							sigNode.addOutRef(node);
						}
					} else {
						if (!(methodDef instanceof UnresolvedMethodDeclaration)) { // Ignoring
							// UnresolvedMethodDeclarations for
							// now
							final FlowNode sigNode = handler
									.getFlowNodeForElement(((MMethodDefinition) methodDef).getMSignature());
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
	 * @param reducedDFG
	 * @param node
	 * @return
	 */
	private Set<FlowNode> buildOutRef(Map<EObject, FlowNode> reducedDFG, FlowNode node) {
		final Set<FlowNode> outRef = node.getOutRef();
		final int size = outRef.size();
		if (size > 1) {
			final Set<FlowNode> toRemove = new HashSet<>();
			for (final FlowNode flowNode : outRef) {
				final EObject modelElement = flowNode.getModelElement();
				if (modelElement instanceof MAbstractMethodInvocation) { // Remove flow into call, if there's
					// actually a paramFlow
					node.setFlowOwner((MAbstractMethodInvocation) modelElement);
					toRemove.add(flowNode);
					reducedDFG.get(modelElement).getInRef().remove(node);
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
	private Map<EObject, FlowNode> reduceIntraDFGFlows(StatementHandlerDataFlow handler) {
		final Map<EObject, FlowNode> reducedDFG = handler.getAlreadySeen();
		for (final FlowNode flowNode : new ArrayList<>(reducedDFG.values())) {
			final EObject node = flowNode.getModelElement();
			if (node instanceof VariableDeclarationFragment) {
				if (((VariableDeclarationFragment) node).getVariablesContainer() instanceof FieldDeclaration) {
					// Keep node
				} else {
					reduceNodeInDFG(flowNode, reducedDFG);
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
					LOGGER.error("Declared variable is null");
				} else if (variable.eContainer() instanceof VariableDeclarationStatement) {
					reduceNodeInDFG(flowNode, reducedDFG);
				}
			} else { // Everything else is reduced in the same way
				reduceNodeInDFG(flowNode, reducedDFG);
			}
		}
		return reducedDFG;
	}

	/**
	 * Removes the given node (including its flows) from reducedDFG and inserts
	 * direct flows from his inNodes to his outNodes.
	 *
	 * @param flowNode       The node's key in reducedDFG.
	 * @param reducedDFG The alreadySeen on which the reduction should be performed.
	 */
	private void reduceNodeInDFG(FlowNode flowNode, Map<EObject, FlowNode> reducedDFG) {
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
		reducedDFG.remove(flowNode.getModelElement());
	}

	/**
	 * Completes the given flow node's entries (target and owner) by obtaining the
	 * signature parameter corresponding to defParamObj (and setting it as target)
	 * and setting the flowOwner to the MMethodInvocation in which currentAccess is
	 * contained.
	 *
	 * @param defParamObj   The model object of the called method's definition.
	 * @param currentAccess The FlowNode of the currently processed access.
	 * @param flow          The flow, which is supposed to be completed.
	 */
	private void completeFlowForSigParam(EObject defParamObj, FlowNode currentAccess, MFlow flow) {
		// Set target
		final MSingleVariableDeclaration paramTarget = (MSingleVariableDeclaration) defParamObj;
		final MEntry sigParamTarget = paramTarget.getMEntry();
		flow.setFlowTarget(sigParamTarget);

		// Set owner
		final MAbstractMethodInvocation invocation = currentAccess.getFlowOwner();
		if (invocation != null) {
			flow.setFlowOwner(invocation);
		} else {
			LOGGER.log(Level.INFO,
					"AbstractMethodInvocation for argument access wasn't found. FlowOwner is set to default (flow target).");
			flow.setFlowOwner((MAbstractMethodDefinition) paramTarget.getMethodDeclaration());
		}
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
	private List<StatementHandlerDataFlow> preProcessStatements() {
		final List<StatementHandlerDataFlow> handlers = new ArrayList<>();
		for (final MAbstractMethodDefinition methodDef : this.model.getMAbstractMethodDefinitions()) {
			final StatementHandlerDataFlow methodProcessor = new StatementHandlerDataFlow(methodDef);
			methodProcessor.getFlowNodeForElement(methodDef);
			for (final SingleVariableDeclaration param : methodDef.getParameters()) {
				methodProcessor.getFlowNodeForElement(param);
			}
			methodProcessor.handle(methodDef.getBody());
			handlers.add(methodProcessor);
		}
		for (final MFieldDefinition fieldDef : this.model.getMFieldDefinitions()) {
			for (final VariableDeclarationFragment fragment : fieldDef.getFragments()) {
				final StatementHandlerDataFlow fieldProcessor = new StatementHandlerDataFlow(fragment);
				fieldProcessor.getMiscHandler().handle(fragment);
				fieldProcessor.getFlowNodeForElement(fieldDef);
				handlers.add(fieldProcessor);
			}
		}
		if (GravityActivator.isVerbose()) {
			GraphVisualizer.drawGraphs(this.model, handlers, "graphs");
		}
		return handlers;
	}

	@Override
	public Class<MDefinition> getSupportedType() {
		return MDefinition.class;
	}
}
