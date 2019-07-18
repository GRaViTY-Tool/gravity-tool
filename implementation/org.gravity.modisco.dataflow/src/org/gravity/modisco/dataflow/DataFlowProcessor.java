package org.gravity.modisco.dataflow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.Expression;
import org.eclipse.gmt.modisco.java.ForStatement;
import org.eclipse.gmt.modisco.java.IfStatement;
import org.eclipse.gmt.modisco.java.MethodInvocation;
import org.eclipse.gmt.modisco.java.ReturnStatement;
import org.eclipse.gmt.modisco.java.SingleVariableDeclaration;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;
import org.eclipse.gmt.modisco.java.WhileStatement;
import org.gravity.modisco.MFlow;
import org.gravity.eclipse.GravityActivator;
import org.gravity.modisco.MAbstractFlowElement;
import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MEntry;
import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MMethodInvocation;
import org.gravity.modisco.MSingleVariableAccess;
import org.gravity.modisco.MSingleVariableDeclaration;
import org.gravity.modisco.ModiscoFactory;
import org.gravity.modisco.processing.AbstractTypedModiscoProcessor;

/**
 * A preprocessor for calculating data flow edges<br/><br/>
 * 
 * <b>IMPORTANT REMARK:</b><br/>
 * To work properly, this processor requires FieldPreprocessing and MethodPreprocessing to be executed prior to it, 
 * as it depends on the decomposition of statements with multiple declarations into one statement for each declaration.
 * 
 * @author speldszus
 *
 */
public class DataFlowProcessor extends AbstractTypedModiscoProcessor<MDefinition> {
	
	private static final Logger LOGGER = Logger.getLogger(DataFlowProcessor.class.getName());

	@Override
	public boolean process(MGravityModel model, Collection<MDefinition> elements, IProgressMonitor monitor) {
		SubMonitor sub = SubMonitor.convert(monitor, "Create model elements for data flow", elements.size());
		boolean success = true;
		sub.beginTask("Statement pre-processing", 50);
		List<StatementHandlerDataFlow> handlers = preProcessStatements(model);
		if (handlers == null) {
			success = false;
		}
		sub.internalWorked(50);
		sub.beginTask("Insertion of data flow edges", 5);
		
		// Per handler: Reduction of intra-DFGs and then insertion of inter-procedural data flows 
		// TODO: Extract into own method (+ submethods)
		// TODO: Work with alreadySeen-Sets instead of handlers?
		for (StatementHandlerDataFlow handler : handlers) {
			
			// Determination of member's type
			// TODO Use below in interproc. part
			EObject memberDef = handler.getMemberDef();
			MDefinition memberDefTyped = null;
			if (memberDef instanceof MAbstractMethodDefinition) {
				memberDefTyped = (MDefinition) memberDef;
			} else if (memberDef instanceof VariableDeclarationFragment) {
				memberDefTyped = (MDefinition) memberDef.eContainer();
			} else {
				LOGGER.log(Level.INFO, "ERROR: Handler with unknown member type " + memberDef.getClass().getName() + " in DataFlowProcessor");
				return false;
			}
			
			// Reduction of intra-DFGs
			HashMap<EObject, FlowNode> reducedDFG = handler.getAlreadySeen();
			for (EObject node : new ArrayList<>(reducedDFG.keySet())) {
				if (node instanceof MAbstractMethodDefinition) {
					// Keep node (for readability of dot graphs only)
				} else if (node instanceof VariableDeclarationFragment && node.eContainer() instanceof MFieldDefinition) {
					// Keep node
				} else if (node instanceof ReturnStatement) {
					// Keep node
				} else if (node instanceof MethodInvocation) {
					// Keep node (and compute inter-edges?)
				} else if (node instanceof MSingleVariableAccess) {
					// Keep node only if its a field access (TODO Check, if true)
					// Removing unnecessary out edges
					Set<FlowNode> outRef = reducedDFG.get(node).getOutRef();
					int size = outRef.size();
					if (size > 1) {
						Set<FlowNode> toRemove = new HashSet<>();
						for (FlowNode flowNode : outRef) {
							EObject modelElement = flowNode.getModelElement();
							if (modelElement instanceof MethodInvocation || modelElement == node) {
								toRemove.add(flowNode);
								reducedDFG.get(modelElement).getInRef().remove(reducedDFG.get(node));
							}
						}
						outRef.removeAll(toRemove);
					}
				} else if (node instanceof SingleVariableDeclaration) {
					// Keep node
				} else if (node instanceof IfStatement 
						|| node instanceof WhileStatement
						|| node instanceof ForStatement) { // TODO: Add remaining types
					// Keep nodes, as a flow into them indicates, that sensitive info can leak implicitly through observation of the construct's behavior
				} else { // Everything else is reduced in the same way
					FlowNode flowNode = reducedDFG.get(node);
					Set<FlowNode> inRef = flowNode.getInRef();
					Set<FlowNode> outRef = flowNode.getOutRef();
					for (FlowNode outNode : outRef) {
						for (FlowNode inNode : inRef) {
							outNode.addInRef(inNode);
							inNode.getOutRef().remove(flowNode);
						}
						outNode.getInRef().remove(flowNode);
					}
					// Making sure, that all incoming flows into terminal node are removed
					if (outRef.isEmpty()) {
						for (FlowNode inNode : inRef) {
							inNode.getOutRef().remove(flowNode);
						}
					}
					inRef.clear();
					outRef.clear();
					reducedDFG.remove(node);
				}
			}
			
			// Insertion of inter-procedural data flows
			for (FlowNode node : handler.getMemberRef()) {				
				for (FlowNode inNode : node.getInRef()) {
					EObject inElement = inNode.getModelElement();
					// Checking, if incoming flow comes from an access (will be omitted then, to avoid redundant edges)
					// Also checks, if access has no outgoing flows; no flow edges will be inserted then
					// TODO Test!
					if (inElement instanceof MSingleVariableAccess || inElement instanceof MethodInvocation || node.getOutRef().isEmpty()) {
						continue;
					}
					// Checking, if we have a direct (parameter) flow or an indirect (access-based) flow
					if (inElement instanceof SingleVariableDeclaration) {
						// ParamFlow
						SingleVariableDeclaration paramSource = (SingleVariableDeclaration) inElement;
						MMethodDefinition methDefSource = (MMethodDefinition) paramSource.getMethodDeclaration();
						MEntry sigParamSource = methDefSource.getMMethodSignature().getMParameterList().getMEntrys().get(methDefSource.getParameters().indexOf(paramSource));
						MFlow paramFlow = ModiscoFactory.eINSTANCE.createMFlow();
						paramFlow.setFlowSource(sigParamSource);
						// Set flow target and owner
						for (FlowNode outNode : node.getOutRef()) { // TODO: Behavior in this loop independent of concrete flow type? Then: Extract out of if scope
							EObject outElement = outNode.getModelElement();
							// Checking type of outgoing flow's element
							if (outElement instanceof SingleVariableDeclaration) {
								completeFlowForSigParam(outElement, node, paramFlow);
							// TODO The following two cases could be merged together
							} else if (outElement instanceof MSingleVariableAccess) {
								MSingleVariableAccess variableAccess = (MSingleVariableAccess) outElement;
								paramFlow.setFlowTarget(variableAccess);
								paramFlow.setFlowOwner(variableAccess);
							} else if (outElement instanceof MethodInvocation) {
								// Add as FlowOwner and as FlowTarget
								MMethodInvocation invocation = (MMethodInvocation) outElement;
								paramFlow.setFlowOwner(invocation);
								paramFlow.setFlowTarget(invocation);
							} else {
								MDefinition definition = (MDefinition) memberDef;
								if (outElement instanceof ReturnStatement) {
									paramFlow.setFlowTarget(definition);
									paramFlow.setFlowOwner(definition);
								} else if (outElement instanceof IfStatement
										|| outElement instanceof WhileStatement
										|| outElement instanceof ForStatement) { // Separate from ReturnStatement, as this could be handled differently in the future
									paramFlow.setFlowTarget(definition);
									paramFlow.setFlowOwner(definition);
								} else {
									LOGGER.log(Level.INFO, "ERROR: Type of outElement (with SingleVariableDeclaration as inElement) couldn't match!");
								}
							}
						}
					} else { // Access-based flow
						MFlow accessIn = ModiscoFactory.eINSTANCE.createMFlow();
						MFlow accessOut = ModiscoFactory.eINSTANCE.createMFlow();
						MAbstractFlowElement access = (MAbstractFlowElement) node.getModelElement();
						accessIn.setFlowOwner(access);
						accessIn.setFlowTarget(access);
						accessOut.setFlowSource(access);
						// Field flow for field access
						// TODO Only read access so far?
						if (inElement instanceof VariableDeclarationFragment) {
							MFieldDefinition fieldDef = (MFieldDefinition) ((VariableDeclarationFragment) inElement).getVariablesContainer();
							accessIn.setFlowSource(fieldDef);
						// TODO Merge together the following cases
						} else if (inElement instanceof MethodInvocation) {
							accessIn.setFlowSource((MMethodInvocation) inElement);
						} else if (inElement instanceof MSingleVariableAccess) {
							accessIn.setFlowSource((MSingleVariableAccess) inElement);
						} else {
							// TODO Try this cast (+ of outElem) at the beginning; continue loop (+ log), if it fails, as the flow's invalid
							accessIn.setFlowSource((MAbstractFlowElement) inElement);
						}
						// Set references of accessOut
						for (FlowNode outNode : node.getOutRef()) {
							EObject outElement = outNode.getModelElement();
							if (outElement instanceof ReturnStatement) {
								accessOut.setFlowOwner(memberDefTyped);
								accessOut.setFlowTarget(memberDefTyped);
							} else if (outElement instanceof VariableDeclarationFragment) {
								MFieldDefinition fieldDef = (MFieldDefinition) ((VariableDeclarationFragment) outElement).getVariablesContainer();
								accessOut.setFlowOwner(fieldDef);
								accessOut.setFlowTarget(fieldDef);
							} else if (outElement instanceof MSingleVariableDeclaration) {
								completeFlowForSigParam(outElement, node, accessOut);
							} else if (outElement instanceof IfStatement
									|| outElement instanceof WhileStatement
									|| outElement instanceof ForStatement) { 
							} else {
								MAbstractFlowElement outTarget = (MAbstractFlowElement) outElement;
								accessOut.setFlowOwner(outTarget);
								accessOut.setFlowTarget(outTarget);
							}
						}
					}
				}
			}
		}
		if (GravityActivator.getDefault().isVerbose()) {
			GraphVisualizer.drawGraphs(handlers, "reducedGraphs");
		}
		sub.internalWorked(5);
		return success;
	}

	/**
	 * Completes the given flow node's entries (target and owner) 
	 * by obtaining the signature parameter corresponding to defParamObj (and setting it as target) 
	 * and setting the flowOwner to the MMethodInvocation in which currentAccess is contained.
	 * 
	 * @param defParamObj The model object of the called method's definition.
	 * @param currentAccess The FlowNode of the currently processed access.
	 * @param flow The flow, which is supposed to be completed.
	 */
	private void completeFlowForSigParam(EObject defParamObj, FlowNode currentAccess, MFlow flow) {
		MSingleVariableDeclaration paramTarget = (MSingleVariableDeclaration) defParamObj;
		MMethodDefinition methDefTarget = (MMethodDefinition) paramTarget.getMethodDeclaration();
		int indexOf = methDefTarget.getParameters().indexOf(paramTarget);
		// TODO Adjust?
		MEntry sigParamTarget = methDefTarget.getMMethodSignature().getMParameterList().getMFirstEntry();
		while (indexOf-- > 0) {
			sigParamTarget = sigParamTarget.getMNext();
		}
		flow.setFlowTarget(sigParamTarget);
		// TODO Check, if this is a proper solution
		try {
			flow.setFlowOwner(getMMethodInvocationForArgumentAccess(currentAccess.getModelElement()));
		} catch (ClassCastException e) {
			LOGGER.log(Level.INFO, "MethodInvocation for argument access wasn't found. FlowOwner is set to default (target signature).");
			flow.setFlowOwner(sigParamTarget);
		}
	}

	@Override
	public Class<MDefinition> getSupportedType() {
		return MDefinition.class;
	}
	
	/**
	 * Pre-processes the statements of all field and method definitions to determine the data flows between statement nodes.
	 * The resulting intermediate representation of data flow is then used to derive the data flow of each field/method.
	 * 
	 * @param model The model, whose statements are processed.
	 * @return A list of the statement handlers resulting from the pre-processing.
	 */
	private List<StatementHandlerDataFlow> preProcessStatements(MGravityModel model) {
		if (model == null) {
			return null;
		}
		List<StatementHandlerDataFlow> handlers = new ArrayList<>();
		for (MAbstractMethodDefinition methodDef : model.getMAbstractMethodDefinitions()) {
			StatementHandlerDataFlow methodProcessor = new StatementHandlerDataFlow(methodDef);
			methodProcessor.getFlowNodeForElement(methodDef);
			for (SingleVariableDeclaration param : methodDef.getParameters()) {
				methodProcessor.getFlowNodeForElement(param);
			}
			methodProcessor.handle(methodDef.getBody());
			handlers.add(methodProcessor);
		}
		for (MFieldDefinition fieldDef : model.getMFieldDefinitions()) {
			for (VariableDeclarationFragment fragment : fieldDef.getFragments()) {
				StatementHandlerDataFlow fieldProcessor = new StatementHandlerDataFlow(fragment);
				Expression initializer = fragment.getInitializer();
				fieldProcessor.getFlowNodeForElement(fragment);
				fieldProcessor.getFlowNodeForElement(fieldDef);
				fieldProcessor.getExpressionHandler().handle(initializer);
				handlers.add(fieldProcessor);
			}
		}
		if(GravityActivator.getDefault().isVerbose()) {
			GraphVisualizer.drawGraphs(handlers, "graphs");
		}
		return handlers;
	}
	
	/**
	 * Returns the MMethodInvocation for a given argument access. E. g. returns invocation of method m for the access of argument a in m(a).
	 * <br/><br/>
	 * Throws a ClassCastException when called on anything else than an argument access. 
	 * 
	 * @param accessObject The model object of the argument access.
	 * @return The MMethodInvocation, which contains the given argument access.
	 */
	private MMethodInvocation getMMethodInvocationForArgumentAccess(EObject accessObject) throws ClassCastException {
		EObject container = accessObject.eContainer();
		while (!(container instanceof MethodInvocation ) && container != null) {
			container = container.eContainer();
		}
		return (MMethodInvocation) container;
	}
}
