package org.gravity.modisco.processing.fwd.dataflow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.java.AbstractMethodDeclaration;
import org.eclipse.modisco.java.AbstractMethodInvocation;
import org.eclipse.modisco.java.AbstractVariablesContainer;
import org.eclipse.modisco.java.DoStatement;
import org.eclipse.modisco.java.EnhancedForStatement;
import org.eclipse.modisco.java.FieldDeclaration;
import org.eclipse.modisco.java.ForStatement;
import org.eclipse.modisco.java.IfStatement;
import org.eclipse.modisco.java.ReturnStatement;
import org.eclipse.modisco.java.SingleVariableAccess;
import org.eclipse.modisco.java.SingleVariableDeclaration;
import org.eclipse.modisco.java.SwitchStatement;
import org.eclipse.modisco.java.VariableDeclaration;
import org.eclipse.modisco.java.VariableDeclarationFragment;
import org.eclipse.modisco.java.WhileStatement;
import org.eclipse.osgi.util.NLS;
import org.gravity.eclipse.GravityActivator;
import org.gravity.modisco.MAbstractFlowElement;
import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MEntry;
import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MFlow;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MSingleVariableAccess;
import org.gravity.modisco.MSingleVariableDeclaration;
import org.gravity.modisco.Messages;
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
	public boolean process(final MGravityModel model, final Collection<MDefinition> elements, IFolder debug,
			final IProgressMonitor monitor) {
		this.model = model;
		final SubMonitor sub = SubMonitor.convert(monitor, Messages.infoCreateElementForFlow, elements.size());

		sub.beginTask(Messages.infoStatementPreprocessing, 50);
		final List<MemberHandler> handlers = preProcessStatements(debug);

		sub.internalWorked(50);
		sub.beginTask(Messages.infoInsertFlowEdges, 5);

		// Per handler: Reduction of intra-DFGs and then insertion of inter-procedural
		// data flows
		handlers.parallelStream().forEach(handler -> {
			// Reduction of intra-DFGs
			reduceIntraDFGFlows(handler);
			FlowNode memberDefNode = handler.getMemberDefNode();
			if (memberDefNode != null) {
				// Create internal flows
				setFlows(memberDefNode, handler);
			}
			// Insertion of inter-procedural data flows
			for (final FlowNode node : handler.getMemberRef()) {
				// Setting flows
				setFlows(node, handler);
			}
		});
		if (GravityActivator.getDefault().isVerbose() && debug != null) {
			GraphVisualizer.drawGraphs(model, handlers, debug.getFolder("reducedGraphs")); //$NON-NLS-1$
		}
		sub.internalWorked(5);
		return true;
	}

	/**
	 * Creates the flows
	 *
	 * @param node
	 *            The node for which flows should be created
	 * @param handler
	 *            The handler used to discover the node
	 * @return true, if creating the flows was successful
	 */
	private boolean setFlows(final FlowNode node, final MemberHandler handler) {
		MAbstractFlowElement flowOwner = (MAbstractFlowElement) node.getModelElement();
		if (!(flowOwner instanceof SingleVariableAccess || flowOwner instanceof AbstractMethodInvocation)) {
			return true;
		}

		final List<FlowNode> outRef = node.getOutRef();
		final List<FlowNode> inRef = node.getInRef();

		List<MAbstractFlowElement> flowSources = new ArrayList<>(inRef.size());
		List<MAbstractFlowElement> flowTargets = new ArrayList<>(outRef.size());
		for (final FlowNode inNode : inRef) {
			if (inNode == node) {
				continue;
			}
			final EObject inElement = inNode.getModelElement();
			if (inElement instanceof SingleVariableDeclaration) {
				// The source is a parameter
				
				MEntry mEntry = ((MSingleVariableDeclaration) inElement).getMEntry();
				if(mEntry == null) {
					//TODO: Check why it is null, Var in enhanced for is ok
					continue;
				}
				flowSources.add(mEntry);
				if (outRef.isEmpty()) {
					// Handling parameter flows, which end in an access (e. g. if access is in an
					// assignment to a local)
					MAbstractMethodDefinition method = (MAbstractMethodDefinition) ((MSingleVariableDeclaration) inElement)
							.getMethodDeclaration();
					flowTargets.add(method);
				}
			} else if(inElement instanceof SingleVariableAccess){
				flowSources.add((MAbstractFlowElement) ((SingleVariableAccess) inElement).getVariable().eContainer());
			} else if(inElement instanceof AbstractMethodInvocation){
				flowSources.add(((MAbstractMethodDefinition)((AbstractMethodInvocation) inElement).getMethod()).getMSignature());
			} else if (inElement instanceof VariableDeclarationFragment) {
				final AbstractVariablesContainer variablesContainer = ((VariableDeclarationFragment) inElement).getVariablesContainer();
				if (variablesContainer instanceof FieldDeclaration) {
					final MFieldDefinition fieldDef = (MFieldDefinition) variablesContainer;
					flowSources.add(fieldDef.getMSignature());
				} else {
					LOGGER.error(NLS.bind(Messages.varHasntBeenReduced, variablesContainer));
				}
			} else {
				flowSources.add((MAbstractFlowElement) inElement);
			}
		}
		for (final FlowNode outNode : outRef) {
			if (outNode == node) {
				continue;
			}
			final EObject outElement = outNode.getModelElement();
			MDefinition member = handler.getMemberDef();
			if (outElement instanceof ReturnStatement) {
				flowTargets.add(member);
			} else if (outElement instanceof VariableDeclarationFragment) {
				final AbstractVariablesContainer variablesContainer = ((VariableDeclarationFragment) outElement)
						.getVariablesContainer();
				if (variablesContainer instanceof FieldDeclaration) {
					final MFieldDefinition fieldDef = (MFieldDefinition) variablesContainer;
					flowTargets.add(fieldDef);
				} else {
					LOGGER.error(Messages.varHasntBeenReduced + variablesContainer);
				}
			} else if (outElement instanceof MSingleVariableDeclaration) {
				// Set target
				final MSingleVariableDeclaration paramTarget = (MSingleVariableDeclaration) outElement;
				final MEntry sigParamTarget = paramTarget.getMEntry();
				flowTargets.add(sigParamTarget);
			} else if (outElement instanceof IfStatement || outElement instanceof WhileStatement
					|| outElement instanceof ForStatement || outElement instanceof EnhancedForStatement
					|| outElement instanceof DoStatement || outElement instanceof SwitchStatement) {
				flowTargets.add(member);
				flowOwner = member; // TODO: Check
			} else if (outElement instanceof MSingleVariableAccess) {
				// Omitting accesses of parameters, when the target is another access
				final MSingleVariableAccess mSVA = (MSingleVariableAccess) outElement;
				final VariableDeclaration variable = mSVA.getVariable();
				if (variable instanceof MSingleVariableDeclaration) {
					flowTargets.add(((MSingleVariableDeclaration) variable).getMEntry());
				} else if (variable.eContainer() instanceof MFieldDefinition
						&& flowSources.stream().anyMatch(e -> e instanceof MEntry)) {
					flowOwner = (mSVA);
					flowTargets.add(mSVA);
				} else { // Basically flows into field accesses without MEntry as source
					flowTargets.add((MAbstractFlowElement) outElement);
				}
			} else {
				final MAbstractFlowElement outTarget = (MAbstractFlowElement) outElement;
				flowTargets.add(outTarget);
			}

		}

		if (!flowSources.isEmpty() && !flowTargets.isEmpty()) {
			MFlow flow = ModiscoFactory.eINSTANCE.createMFlow();
			flow.setFlowOwner(flowOwner);
			flow.getIncomingFlows().addAll(flowSources);
			flow.getOutgoingFlows().addAll(flowTargets);
		}
		return true;
	}

//	/**
//	 * A constructor invocation or method invocation with a return value should
//	 * explicitly have the MethodDef/MethodSig set as incoming flow
//	 *
//	 * @param handler
//	 * @param node
//	 * @return The set of incoming flows
//	 */
//	private List<FlowNode> buildInRef(final MemberHandler handler, final FlowNode node) {
//		final MAbstractFlowElement access = (MAbstractFlowElement) node.getModelElement();
//		final List<FlowNode> inRef = node.getInRef();
//		if (access instanceof AbstractMethodInvocation) {
//			final AbstractMethodDeclaration methodDef = ((AbstractMethodInvocation) access).getMethod();
//			if (methodDef instanceof MConstructorDefinition) {
//				final FlowNode defNode = handler.getFlowNodeOrCreate(methodDef);
//				inRef.add(defNode);
//				defNode.addOutRef(node);
//			} else {
//				TypeAccess returnType = null;
//				if (methodDef != null) {
//					returnType = ((MethodDeclaration) methodDef).getReturnType();
//					if (returnType != null) {
//						if (!returnType.getType().getName().equals("void")) { //$NON-NLS-1$
//							final FlowNode sigNode = handler
//									.getFlowNodeOrCreate(((MMethodDefinition) methodDef).getMSignature());
//							inRef.add(sigNode);
//							sigNode.addOutRef(node);
//						}
//					} else {
//						if (!(methodDef instanceof UnresolvedMethodDeclaration)) { // Ignoring
//							// UnresolvedMethodDeclarations for
//							// now
//							final FlowNode sigNode = handler
//									.getFlowNodeOrCreate(((MMethodDefinition) methodDef).getMSignature());
//							inRef.add(sigNode);
//							sigNode.addOutRef(node);
//						}
//					}
//				}
//			}
//		}
//		return inRef;
//	}

	/**
	 * @param handler
	 * @return
	 */
	private void reduceIntraDFGFlows(final MemberHandler handler) {
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
					LOGGER.error(Messages.variableIsNull);
				} else {
					EObject eContainer = variable.eContainer();
					if (eContainer instanceof FieldDeclaration) {
						// Keep field
					} else if (eContainer instanceof AbstractMethodDeclaration) {
						// Reduce parameter access
						reduceNodeInDFG(flowNode, handler);
					} else {
						reduceNodeInDFG(flowNode, handler);
					}
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
	 * @param flowNode
	 *            The node's key in reducedDFG.
	 * @param handler
	 *            The alreadySeen on which the reduction should be performed.
	 */
	private void reduceNodeInDFG(final FlowNode flowNode, final MemberHandler handler) {
		handler.removeFlowNode(flowNode.reduce().getModelElement());
	}

	/**
	 * Pre-processes the statements of all field and method definitions to determine
	 * the data flows between statement nodes. The resulting intermediate
	 * representation of data flow is then used to derive the data flow of each
	 * field/method.
	 *
	 * @param model
	 *            The model, whose statements are processed.
	 * @param debug
	 *            The location to which debug files should be written
	 * @return A list of the statement handlers resulting from the pre-processing.
	 */
	private List<MemberHandler> preProcessStatements(IFolder debug) {
		final List<MemberHandler> handlers = new LinkedList<>();
		for (MAbstractMethodDefinition methodDef : this.model.getMAbstractMethodDefinitions()) {
			final MemberHandler methodProcessor = new MemberHandler(methodDef);
			methodProcessor.getFlowNodeOrCreate(methodDef);
			for (final SingleVariableDeclaration param : methodDef.getParameters()) {
				methodProcessor.getFlowNodeOrCreate(param);
			}
			new DataFlowVisitor(methodProcessor).handle();
			handlers.add(methodProcessor);
		}
		for (MFieldDefinition fieldDef : this.model.getMFieldDefinitions()) {
			for (VariableDeclarationFragment fragment : fieldDef.getFragments()) {
				final MemberHandler fieldProcessor = new MemberHandler(fragment);
				new DataFlowVisitor(fieldProcessor).handle();
				fieldProcessor.getFlowNodeOrCreate(fragment.getVariablesContainer());
				handlers.add(fieldProcessor);
			}
		}

		if (GravityActivator.getDefault().isVerbose() && debug != null) {
			GraphVisualizer.drawGraphs(this.model, handlers, debug.getFolder("graphs")); //$NON-NLS-1$
		}
		return handlers;
	}

	@Override
	public Class<MDefinition> getSupportedType() {
		return MDefinition.class;
	}
}
