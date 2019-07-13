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
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration;
import org.eclipse.gmt.modisco.java.Assignment;
import org.eclipse.gmt.modisco.java.Block;
import org.eclipse.gmt.modisco.java.Expression;
import org.eclipse.gmt.modisco.java.FieldAccess;
import org.eclipse.gmt.modisco.java.FieldDeclaration;
import org.eclipse.gmt.modisco.java.ForStatement;
import org.eclipse.gmt.modisco.java.IfStatement;
import org.eclipse.gmt.modisco.java.InfixExpression;
import org.eclipse.gmt.modisco.java.MethodInvocation;
import org.eclipse.gmt.modisco.java.NumberLiteral;
import org.eclipse.gmt.modisco.java.ReturnStatement;
import org.eclipse.gmt.modisco.java.SingleVariableDeclaration;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;
import org.eclipse.gmt.modisco.java.WhileStatement;
import org.gravity.modisco.MFlow;
import org.gravity.eclipse.GravityActivator;
import org.gravity.modisco.MAbstractFlowElement;
import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MAccess;
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
 * A preprocessor for calculating data flow edges
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
		List<StatementHandlerDataFlow> reducedHandlers = new ArrayList<>();
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
			StatementHandlerDataFlow reducedHandler = new StatementHandlerDataFlow(memberDefTyped);
			HashMap<EObject, FlowNode> reducedDFG = (HashMap<EObject, FlowNode>) handler.getAlreadySeen().clone(); // TODO: Shallow copy ok here?
			for (EObject node : handler.getAlreadySeen().keySet()) {
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
				} else if (node instanceof FieldAccess) {
					// Keep node
				} else if (node instanceof IfStatement 
						|| node instanceof WhileStatement
						|| node instanceof ForStatement) { // TODO: Add remaining types
					// Keep nodes, as a flow into them indicates, that sensitive info can leak implicitly through observation of the construct's behavior
				}
				else if (node instanceof NumberLiteral) { // Irrelevant flows
					reducedDFG.remove(node);
				} else { // Everything else is reduced in the same way
					Set<FlowNode> inRef = reducedDFG.get(node).getInRef();
					for (FlowNode outNode : reducedDFG.get(node).getOutRef()) {
						for (FlowNode inNode : inRef) {
							outNode.addInRef(inNode);
						}
					}
					reducedDFG.remove(node);
				}
			}
			reducedHandler.setAlreadySeen(reducedDFG);
			reducedHandlers.add(reducedHandler);
			
			// Insertion of inter-procedural data flows
			List<FlowNode> alreadyProcessed = new ArrayList<>();
			for (FlowNode node : handler.getMemberOut()) { // TODO Compute union with memberIn or combine earlier into memberRef (Set)
				if (reducedHandler.getAlreadySeen().containsKey((node.getModelElement()))) {
					FlowNode newNode = reducedHandler.getAlreadySeen().get(node.getModelElement());
				}
				
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
						MFlow paramFlow = ModiscoFactory.eINSTANCE.createMParamFlow();
						paramFlow.getFlowSources().add(sigParamSource);
						for (FlowNode outNode : node.getOutRef()) { // TODO: Behavior in this loop independent of concrete flow type? Then: Extract out of if scope
							// TODO alreadyProcessed?
							EObject outElement = outNode.getModelElement();
							// Checking type of outgoing flow's element
							if (outElement instanceof SingleVariableDeclaration) {
								SingleVariableDeclaration paramTarget = (SingleVariableDeclaration) outElement;
								MMethodDefinition methDefTarget = (MMethodDefinition) paramTarget.getMethodDeclaration();
								MEntry sigParamTarget = methDefTarget.getMMethodSignature().getMParameterList().getMEntrys().get(methDefTarget.getParameters().indexOf(paramTarget));
								paramFlow.getFlowTargets().add(sigParamTarget);
							} else if (outElement instanceof MSingleVariableAccess) {
								MSingleVariableAccess variableAccess = (MSingleVariableAccess) outElement;
								paramFlow.getFlowTargets().add(variableAccess);
								paramFlow.setFlowOwner(variableAccess);
							} else if (outElement instanceof MethodInvocation) {
								// Add as FlowOwner and as FlowTarget
								// TODO Wrong. Could be handled BEFORE actual FlowTarget was set. Same below in Access-based part.
								MMethodInvocation invocation = (MMethodInvocation) outElement;
								paramFlow.setFlowOwner(invocation);
								if (paramFlow.getFlowTargets().isEmpty()) {
									paramFlow.getFlowTargets().add(invocation);
								}
							} else {
								MDefinition definition = (MDefinition) memberDef;
								if (outElement instanceof ReturnStatement) {
									paramFlow.getFlowTargets().add(definition);
									paramFlow.setFlowOwner(definition);
								}else if (outElement instanceof IfStatement
										|| outElement instanceof WhileStatement
										|| outElement instanceof ForStatement) { // Separate from ReturnStatement, as this could be handled differently in the future
									paramFlow.getFlowTargets().add(definition);
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
							accessIn = ModiscoFactory.eINSTANCE.createMReturnFlow();
							accessOut = ModiscoFactory.eINSTANCE.createMFieldFlow();
							MFieldDefinition fieldDef = (MFieldDefinition) ((VariableDeclarationFragment) inElement).getVariablesContainer();
							accessIn.getFlowSources().add(fieldDef);
						} else if (inElement instanceof MethodInvocation) {
							accessIn = ModiscoFactory.eINSTANCE.createMReturnFlow();
							accessOut = ModiscoFactory.eINSTANCE.createMReturnFlow();
							accessIn.getFlowSources().add((MMethodInvocation) inElement);
						} else if (inElement instanceof MSingleVariableAccess) {
							// TODO: More concrete types here?
							accessIn = ModiscoFactory.eINSTANCE.createMFlow();
							accessOut = ModiscoFactory.eINSTANCE.createMFlow();
							accessIn.getFlowSources().add((MSingleVariableAccess) inElement);
						} else if (inElement instanceof FieldAccess) {
							// TODO Handle
						} else {
							// TODO Handle
							//System.out.println(inElement.getClass().getSimpleName());
							accessIn = ModiscoFactory.eINSTANCE.createMFlow(); // TODO NOT fixed!! Why are there still actually removed elements in reduced DFG???
							accessOut = ModiscoFactory.eINSTANCE.createMFlow();
						}
						accessIn.setFlowOwner(access);
						accessIn.getFlowTargets().add(access);
						// Set references of accessOut
						for (FlowNode outNode : node.getOutRef()) { // TODO: Always get first (and only), only get both, when there's SVD + MethInvoc?
							EObject outElement = outNode.getModelElement();
							accessOut.getFlowSources().add(access);
							if (outElement instanceof ReturnStatement) {
								accessOut.setFlowOwner(memberDefTyped);
								accessOut.getFlowTargets().add(memberDefTyped);
							} else if (outElement instanceof VariableDeclarationFragment) {
								MFieldDefinition fieldDef = (MFieldDefinition) ((VariableDeclarationFragment) outElement).getVariablesContainer();
								accessOut.setFlowOwner(fieldDef);
								accessOut.getFlowTargets().add(fieldDef);
							} else {
								if (!(outElement instanceof MAbstractFlowElement)) {
									System.out.println(outElement.getClass().getSimpleName());
								}
								MAbstractFlowElement outTarget = (MAbstractFlowElement) outElement;
								accessOut.setFlowOwner(outTarget);
								accessOut.getFlowTargets().add(outTarget);
							} // TODO: Add separate handling for outNode types: If(While...)Statement, (Param)Flow
						}
					}
				}
				alreadyProcessed.add(node);
			}
			/*for (FlowNode node : handler.getMemberOut()) {
				EObject element = node.getModelElement();
				MFlow accessOutgoing = ModiscoFactory.eINSTANCE.createMFieldFlow();
//				MAccess access = ModiscoFactory.eINSTANCE.createMAccess();
				MDefinition typedElement = null;
				// Checking the type of the given flow target
				if (element instanceof FieldDeclaration || element instanceof MFieldDefinition) {
					// TODO: FieldDecl not a MDefinition
					typedElement = (MDefinition) element;
					MFlow accessIncoming = null;
					if (memberDef instanceof AbstractMethodDeclaration) {
						accessIncoming = ModiscoFactory.eINSTANCE.createMParamFlow();
					} else if (memberDef instanceof VariableDeclarationFragment) {
						accessIncoming = ModiscoFactory.eINSTANCE.createMFieldFlow();
					} else {
						LOGGER.log(Level.INFO, "ERROR: Unknown member type " + memberDef.getClass().getName() + " in DataFlowProcessor");
						return false;
					}
//					accessIncoming.setFlowOwner(access);
					accessIncoming.getFlowSources().add(memberDefTyped);
//					accessIncoming.getFlowTargets().add(access);
				} else if (element instanceof AbstractMethodDeclaration) { // TODO Get param instead
					if (memberDef instanceof AbstractMethodDeclaration) {
						// TODO: ONLY direct (without access), if source is a param too
					}
					MFlow accessIncoming = ModiscoFactory.eINSTANCE.createMParamFlow();
					typedElement = (MDefinition) element;
//					accessIncoming.setFlowOwner(access);
					accessIncoming.getFlowSources().add(memberDefTyped);
					accessIncoming.getFlowTargets().add(typedElement); // TODO Param
				} else {
					LOGGER.log(Level.INFO, "ERROR: Unknown element type " + element.getClass().getName() + " in DataFlowProcessor");
					return false;
				}
				accessOutgoing.setFlowOwner(typedElement);
//				accessOutgoing.getFlowSources().add(access);
				accessOutgoing.getFlowTargets().add(typedElement);
			}*/
		}
		if (GravityActivator.getDefault().isVerbose()) {
			GraphVisualizer.drawGraphs(reducedHandlers, "reducedGraphs");
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
