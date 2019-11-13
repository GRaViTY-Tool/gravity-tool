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
			// Reduction of intra-DFGs
			reduceIntraDFGFlows(handler);

			// Insertion of inter-procedural data flows
			for (final FlowNode node : handler.getMemberRef()) {
				// Setting flows
				createFlows(node, handler);
			}
		}
		if (GravityActivator.isVerbose()) {
			GraphVisualizer.drawGraphs(model, handlers, "reducedGraphs");
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
	private boolean createFlows(FlowNode node, StatementHandlerDataFlow handler) {
		// Removing unnecessary out edges (self-flows and flows to calls in paramFlows)
		for (final FlowNode inNode : buildInRef(handler, node)) {
			if (inNode == node) {
				continue;
			}
			if (!createInFlow(inNode, node)) {
				return false;
			}
		}
		for (final FlowNode trg : buildOutRef(node)) {
			if (trg == node) {
				continue;
			}
			if (!createOutFlow(node, trg, handler.getMemberDef())) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Creates a new incoming flow
	 *
	 * @param inNode The source of the flow
	 * @param trg    The target of the flow
	 * @return true, if the flow has been created successfully
	 */
	private boolean createInFlow(final FlowNode src, final FlowNode trg) {
		final EObject srcObject = src.getModelElement();
		if (!(srcObject instanceof SingleVariableDeclaration)) {
			// Also create incoming flow here, if it's not coming from an access (to avoid
			// redundancy)
			if (!(srcObject instanceof SingleVariableAccess || srcObject instanceof AbstractMethodInvocation)) {
				final MFlow flow = ModiscoFactory.eINSTANCE.createMFlow();
				if (srcObject instanceof VariableDeclarationFragment) {
					final AbstractVariablesContainer variablesContainer = ((VariableDeclarationFragment) srcObject)
							.getVariablesContainer();
					if (variablesContainer instanceof FieldDeclaration) {
						final MFieldDefinition fieldDef = (MFieldDefinition) variablesContainer;
						flow.setFlowSource(fieldDef.getMSignature());
					} else {
						LOGGER.error("A variable declaration fragment hasn't been reduced: " + variablesContainer);
						return false;
					}
				} else {
					flow.setFlowSource((MAbstractFlowElement) srcObject);
				}
				final MAbstractFlowElement trgObject = (MAbstractFlowElement) trg.getModelElement();
				flow.setFlowTarget(trgObject);
				flow.setFlowOwner(trgObject);
			}
		}
		return true;
	}

	/**
	 *
	 * Creates a new outgoing flow
	 *
	 * @param src        The source of the flow
	 * @param trg        The target of the flow
	 * @param definition The definition containing the reason of the flow
	 * @return true, if the flow has been created successfully
	 */
	private boolean createOutFlow(FlowNode src, FlowNode trg, MAbstractFlowElement definition) {
		final MAbstractFlowElement srcObject = (MAbstractFlowElement) src.getModelElement();
		final MFlow flow = ModiscoFactory.eINSTANCE.createMFlow();
		flow.setFlowSource(srcObject);
		flow.setFlowOwner(srcObject);

		final EObject trgObject = trg.getModelElement();
		if (trgObject instanceof ReturnStatement) {
			flow.setFlowTarget(definition);
		} else if (trgObject instanceof VariableDeclarationFragment) {
			final AbstractVariablesContainer variablesContainer = ((VariableDeclarationFragment) trgObject)
					.getVariablesContainer();
			if (variablesContainer instanceof FieldDeclaration) {
				final MFieldDefinition fieldDef = (MFieldDefinition) variablesContainer;
				flow.setFlowTarget(fieldDef);
			} else {
				LOGGER.error("A variable declaration fragment hasn't been reduced: " + variablesContainer);
				return false;
			}
		} else if (trgObject instanceof MSingleVariableDeclaration) {
			// Set target
			flow.setFlowTarget(((MSingleVariableDeclaration) trgObject).getMEntry());
			final MAbstractMethodInvocation invocation = src.getFlowOwner();
			if (invocation != null) {
				flow.setFlowOwner(invocation);
			} else {
				LOGGER.log(Level.INFO, "AbstractMethodInvocation for argument access wasn't found. "
						+ "FlowOwner is set to default (flow target).");
				flow.setFlowOwner(
						(MAbstractMethodDefinition) ((MSingleVariableDeclaration) trgObject).getMethodDeclaration());
			}
		} else if (trgObject instanceof IfStatement || trgObject instanceof WhileStatement
				|| trgObject instanceof ForStatement || trgObject instanceof EnhancedForStatement
				|| trgObject instanceof DoStatement || trgObject instanceof SwitchStatement) {
			flow.setFlowTarget(definition);
		} else if (trgObject instanceof MSingleVariableAccess) { // Omitting accesses of parameters, when the
			// target
			// is another access
			final MSingleVariableAccess mSVA = (MSingleVariableAccess) trgObject;
			final VariableDeclaration variable = mSVA.getVariable();
			if (variable instanceof MSingleVariableDeclaration) {
				flow.setFlowTarget(((MSingleVariableDeclaration) variable).getMEntry());
			} else if (variable.eContainer() instanceof MFieldDefinition && flow.getFlowSource() instanceof MEntry) {
				flow.setFlowOwner(mSVA);
				flow.setFlowTarget(mSVA);
			} else { // Basically flows into field accesses without MEntry as source
				flow.setFlowTarget((MAbstractFlowElement) trgObject);
			}
		} else {
			flow.setFlowTarget((MAbstractFlowElement) trgObject);
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
	 * @param handler
	 * @param node
	 * @return
	 */
	private Set<FlowNode> buildOutRef(FlowNode node) {
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
	private void reduceIntraDFGFlows(StatementHandlerDataFlow handler) {
		for (final FlowNode flowNode : new ArrayList<>(handler.getAlreadySeen().values())) {
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
					LOGGER.error("Declared variable is null");
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
	 * @param flowNode   The node's key in reducedDFG.
	 * @param handler The alreadySeen on which the reduction should be performed.
	 */
	private void reduceNodeInDFG(FlowNode flowNode, StatementHandlerDataFlow handler) {
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
		handler.remove(flowNode.getModelElement());
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
		final Stream<StatementHandlerDataFlow> methodProcessors = this.model.getMAbstractMethodDefinitions()
				.parallelStream().map(methodDef -> {
					final StatementHandlerDataFlow methodProcessor = new StatementHandlerDataFlow(methodDef);
					methodProcessor.getFlowNodeForElement(methodDef);
					for (final SingleVariableDeclaration param : methodDef.getParameters()) {
						methodProcessor.getFlowNodeForElement(param);
					}
					methodProcessor.handle(methodDef.getBody());
					return methodProcessor;
				});
		final Stream<StatementHandlerDataFlow> fieldProcessors = this.model.getMFieldDefinitions().parallelStream()
				.flatMap(fieldDef -> fieldDef.getFragments().parallelStream()).map(fragment -> {
					final StatementHandlerDataFlow fieldProcessor = new StatementHandlerDataFlow(fragment);
					fieldProcessor.getMiscHandler().handle(fragment);
					fieldProcessor.getFlowNodeForElement(fragment.getVariablesContainer());
					return fieldProcessor;

				});
		final List<StatementHandlerDataFlow> handlers = Stream.concat(fieldProcessors, methodProcessors)
				.collect(Collectors.toList());
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
