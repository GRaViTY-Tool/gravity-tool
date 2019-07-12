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
import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MAccess;
import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MEntry;
import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodDefinition;
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
		// TODO: Extract into own method
		// TODO: Work with alreadySeen-Sets instead of handlers?
		List<StatementHandlerDataFlow> reducedHandlers = new ArrayList<>();
		for (StatementHandlerDataFlow handler : handlers) {
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
			// Calculating out-edges sufficient, since every out-edge leads to at most one in-edge
			List<FlowNode> alreadyProcessed = new ArrayList<>();
			for (FlowNode node : handler.getMemberOut()) {
				EObject element = node.getModelElement();
				if (element instanceof MSingleVariableAccess) {
					MSingleVariableAccess access = (MSingleVariableAccess) element;
					for (FlowNode inNode : node.getInRef()) {
						if (alreadyProcessed.contains(inNode)) {
							continue;
						}
						EObject inElement = inNode.getModelElement();
						if (inElement instanceof SingleVariableDeclaration) {
							// TODO ParamFlow
							SingleVariableDeclaration parameter = (SingleVariableDeclaration) inElement;
							MMethodDefinition methDef = (MMethodDefinition) parameter.getMethodDeclaration();
							MEntry sigParam = methDef.getMMethodSignature().getMParameterList().getMEntrys().get(methDef.getParameters().indexOf(parameter));
							MFlow paramFlow = ModiscoFactory.eINSTANCE.createMParamFlow();
							paramFlow.getFlowSources().add(sigParam); // TODO Correct use of param of sig?
						} else if (inElement instanceof VariableDeclarationFragment) {
							// TODO ReturnFlow from field
						}
					}
				} else if (element instanceof MethodInvocation) {
					// TODO Handle
				} else if (element instanceof FieldAccess) {
					// TODO Handle
				} else {
					// TODO Handle
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
