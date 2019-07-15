package org.gravity.modisco.dataflow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
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
import org.gravity.modisco.ModiscoFactory;
import org.gravity.modisco.processing.AbstractTypedModiscoProcessor;

/**
 * A preprocessor for calculating data flow edges
 * 
 * TODO Add remark FieldProc + Methodprocessing need to be computed before this processing
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
		// TODO: Extract into own method
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
			List<FlowNode> alreadyProcessed = new ArrayList<>();
			for (FlowNode node : handler.getMemberOut()) { // TODO Compute union with memberIn or combine earlier into memberRef (Set)				
				for (FlowNode inNode : node.getInRef()) {
					if (alreadyProcessed.contains(inNode)) {
						continue;
					}
					EObject inElement = inNode.getModelElement();
					// Checking type of incoming flow's element
					if (inElement instanceof SingleVariableDeclaration) { // TODO Should only distinguish between direct (w/o access) and access-based flows
						// ParamFlow
						SingleVariableDeclaration paramSource = (SingleVariableDeclaration) inElement;
						MMethodDefinition methDefSource = (MMethodDefinition) paramSource.getMethodDeclaration();
						MEntry sigParamSource = methDefSource.getMMethodSignature().getMParameterList().getMEntrys().get(methDefSource.getParameters().indexOf(paramSource));
						MFlow paramFlow = ModiscoFactory.eINSTANCE.createMFlow();
						paramFlow.setFlowSource(sigParamSource);
						for (FlowNode outNode : node.getOutRef()) { // TODO: Behavior in this loop independent of concrete flow type? Then: Extract out of if scope
							// TODO alreadyProcessed?
							EObject outElement = outNode.getModelElement();
							// Checking type of outgoing flow's element
							if (outElement instanceof SingleVariableDeclaration) {
								SingleVariableDeclaration paramTarget = (SingleVariableDeclaration) outElement;
								MMethodDefinition methDefTarget = (MMethodDefinition) paramTarget.getMethodDeclaration();
								int indexOf = methDefTarget.getParameters().indexOf(paramTarget);
								MEntry sigParamTarget = methDefTarget.
										getMMethodSignature().getMParameterList().getMFirstEntry();
								while(indexOf-- > 0) {
									sigParamTarget = sigParamTarget.getMNext();
								}
								paramFlow.setFlowTarget(sigParamTarget);
							} else if (outElement instanceof MSingleVariableAccess) {
								MSingleVariableAccess variableAccess = (MSingleVariableAccess) outElement;
								paramFlow.setFlowTarget(variableAccess);
								paramFlow.setFlowOwner(variableAccess);
							} else if (outElement instanceof MethodInvocation) {
								// Add as FlowOwner and as FlowTarget
								// TODO Wrong. Could be handled BEFORE actual FlowTarget was set. Same below in Access-based part.
								MMethodInvocation invocation = (MMethodInvocation) outElement;
								paramFlow.setFlowOwner(invocation);
								if (paramFlow.getFlowTarget() == null) {
									paramFlow.setFlowTarget(invocation);
								}
							} else {
								MDefinition definition = (MDefinition) memberDef;
								if (outElement instanceof ReturnStatement) {
									paramFlow.setFlowTarget(definition);
									paramFlow.setFlowOwner(definition);
								}else if (outElement instanceof IfStatement
										|| outElement instanceof WhileStatement
										|| outElement instanceof ForStatement) { // Separate from ReturnStatement, as this could be handled differently in the future
									paramFlow.setFlowTarget(definition);
									paramFlow.setFlowOwner(definition);
								}
							}
							// TODO FieldAccess? Is SVD -> MSVA VDF possible?
							// TODO VarDeclFrag? Is SVD -> MSVA -> VDF even possible? VDF (always?) has own MSVA
						}
					} else { // Access-based flow
						// TODO: For all cases, add usage of alreadyProcessed for reduction of redundancy
						MFlow accessIn = null;
						MFlow accessOut = null;
						MAbstractFlowElement access = (MAbstractFlowElement) node.getModelElement();
						// Field flow for field access
						// TODO Only read access so far?
						if (inElement instanceof VariableDeclarationFragment) {
							accessIn = ModiscoFactory.eINSTANCE.createMFlow();
							accessOut = ModiscoFactory.eINSTANCE.createMFlow();
							MFieldDefinition fieldDef = (MFieldDefinition) ((VariableDeclarationFragment) inElement).getVariablesContainer();
							accessIn.setFlowSource(fieldDef);
						} else if (inElement instanceof MethodInvocation) {
							accessIn = ModiscoFactory.eINSTANCE.createMFlow();
							accessOut = ModiscoFactory.eINSTANCE.createMFlow();
							accessIn.setFlowSource((MMethodInvocation) inElement);
						} else if (inElement instanceof MSingleVariableAccess) {
							// TODO: More concrete types here?
							accessIn = ModiscoFactory.eINSTANCE.createMFlow();
							accessOut = ModiscoFactory.eINSTANCE.createMFlow();
							accessIn.setFlowSource((MSingleVariableAccess) inElement);
						} else {
							// TODO Handle
							//System.out.println(inElement.getClass().getSimpleName());
							accessIn = ModiscoFactory.eINSTANCE.createMFlow(); // TODO NOT fixed!! Why are there still actually removed elements in reduced DFG???
							accessOut = ModiscoFactory.eINSTANCE.createMFlow();
						}
						accessIn.setFlowOwner(access);
						accessIn.setFlowTarget(access);
						// Set references of accessOut
						for (FlowNode outNode : node.getOutRef()) { // TODO: Always get first (and only), only get both, when there's SVD + MethInvoc?
							EObject outElement = outNode.getModelElement();
							accessOut.setFlowSource(access);
							if (outElement instanceof ReturnStatement) {
								accessOut.setFlowOwner(memberDefTyped);
								accessOut.setFlowTarget(memberDefTyped);
							} else if (outElement instanceof VariableDeclarationFragment) {
								MFieldDefinition fieldDef = (MFieldDefinition) ((VariableDeclarationFragment) outElement).getVariablesContainer();
								accessOut.setFlowOwner(fieldDef);
								accessOut.setFlowTarget(fieldDef);
							} else {
								if (!(outElement instanceof MAbstractFlowElement)) {
									System.out.println(outElement.getClass().getSimpleName());
								}
								MAbstractFlowElement outTarget = (MAbstractFlowElement) outElement;
								accessOut.setFlowOwner(outTarget);
								accessOut.setFlowTarget(outTarget);
							} // TODO: Add separate handling for outNode types: If(While...)Statement, (Param)Flow
						}
					}
				}
				alreadyProcessed.add(node);
			}
		}
		if (GravityActivator.getDefault().isVerbose()) {
			GraphVisualizer.drawGraphs(handlers, "reducedGraphs");
		}
		sub.internalWorked(5);
		return success;
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
}
