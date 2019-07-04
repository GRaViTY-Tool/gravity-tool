package org.gravity.modisco.dataflow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration;
import org.eclipse.gmt.modisco.java.Expression;
import org.eclipse.gmt.modisco.java.FieldDeclaration;
import org.eclipse.gmt.modisco.java.SingleVariableDeclaration;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;
import org.gravity.modisco.MFlow;
import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MAccess;
import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MGravityModel;
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
			// TODO: While isNotEmpty, keep reducing
			for (FlowNode node : handler.getAlreadySeen().values()) {
				// TODO: Build reduced DFG
			}
			// Calculating out-edges sufficient, since every out-edge leads to at most one in-edge
			for (FlowNode node : handler.getMemberOut()) {
				EObject element = node.getModelElement();
				System.out.println(element.getClass().getSimpleName()); // To check, if anything is not handled yet
				MFlow accessOutgoing = ModiscoFactory.eINSTANCE.createMFieldFlow();
				MAccess access = ModiscoFactory.eINSTANCE.createMAccess();
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
					accessIncoming.setFlowOwner(access);
					accessIncoming.getFlowSources().add(memberDefTyped);
					accessIncoming.getFlowTargets().add(access);
				} else if (element instanceof AbstractMethodDeclaration) { // TODO Get param instead
					if (memberDef instanceof AbstractMethodDeclaration) {
						// TODO: ONLY direct (without access), if source is a param too
					}
					MFlow accessIncoming = ModiscoFactory.eINSTANCE.createMParamFlow();
					typedElement = (MDefinition) element;
					accessIncoming.setFlowOwner(access);
					accessIncoming.getFlowSources().add(memberDefTyped);
					accessIncoming.getFlowTargets().add(typedElement); // TODO Param
				} else {
					LOGGER.log(Level.INFO, "ERROR: Unknown element type " + element.getClass().getName() + " in DataFlowProcessor");
					return false;
				}
				accessOutgoing.setFlowOwner(typedElement);
				accessOutgoing.getFlowSources().add(access);
				accessOutgoing.getFlowTargets().add(typedElement);
			}
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
		// Drawing one graph per handler; comment out next line, if no graphs are needed
		// GraphVisualizer.drawGraphs(handlers);
		return handlers;
	}
}
