package org.gravity.modisco.dataflow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration;
import org.eclipse.gmt.modisco.java.AbstractMethodInvocation;
import org.eclipse.gmt.modisco.java.Expression;
import org.eclipse.gmt.modisco.java.FieldDeclaration;
import org.eclipse.gmt.modisco.java.SingleVariableAccess;
import org.eclipse.gmt.modisco.java.SingleVariableDeclaration;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;
import org.gravity.modisco.MFlow;
import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MAccess;
import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MethodInvocationStaticType;
import org.gravity.modisco.ModiscoFactory;
import org.gravity.modisco.processing.AbstractTypedModiscoProcessor;

/**
 * A preprocessor for calculating data flow edges
 * 
 * @author speldszus
 *
 */
public class DataFlowProcessor extends AbstractTypedModiscoProcessor<MDefinition> {

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
		for (StatementHandlerDataFlow handler : handlers) {
			EObject memberDef = handler.getMemberDef();
			MDefinition memberDefTyped = null;
			if (memberDef instanceof MAbstractMethodDefinition) {
				memberDefTyped = (MDefinition) memberDef;
			} else if (memberDef instanceof VariableDeclarationFragment) {
				memberDefTyped = (MDefinition) memberDef.eContainer();
			} else {
				// TODO: Error handling
			}
			// TODO: While isNotEmpty, keep reducing
			for (FlowNode node : handler.getAlreadySeen().values()) {
				// TODO: Build reduced DFG
			}
			for (FlowNode node : handler.getMemberIn()) {
				// TODO: Incoming edges
				EObject element = node.getModelElement();
				if (element instanceof FieldDeclaration) {
					// TODO: Insert edge from element's fieldDef to this def
					MFlow flow = ModiscoFactory.eINSTANCE.createMFieldFlow();
					flow.setFlowOwner(memberDefTyped);
					flow.getFlowSources().add((MDefinition) element);
				} else if (element instanceof MFieldDefinition) {
					MFlow flow = ModiscoFactory.eINSTANCE.createMFieldFlow();
					flow.setFlowOwner(memberDefTyped);
					flow.getFlowSources().add((MDefinition) element);
				} else if (element instanceof AbstractMethodDeclaration) {
					MFlow accessIncoming = ModiscoFactory.eINSTANCE.createMReturnFlow();
					MFlow accessOutgoing = ModiscoFactory.eINSTANCE.createMReturnFlow();
					MAccess access = ModiscoFactory.eINSTANCE.createMAccess();
					accessIncoming.setFlowOwner(access);
					accessIncoming.getFlowSources().add((MDefinition) element);
					accessIncoming.getFlowTargets().add(access);
					accessOutgoing.setFlowOwner(memberDefTyped);
					accessOutgoing.getFlowSources().add(access);
					accessOutgoing.getFlowTargets().add(memberDefTyped);
				}
			}
			// TODO: Create edges based on already created handler-level references
			for (FlowNode node : handler.getMemberOut()) {
				// TODO: Outgoing edges
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
		GraphVisualizer.drawGraphs(handlers); // Drawing one graph per handler; comment out, if no graphs are needed
		return handlers;
	}

	
	/**
	 * Creates data flow edges between all elements from the given element list and the given definition.
	 * @param <T>
	 * 
	 * @param elementList A list of model elements.
	 * @param field The definition, to which the data flow edges will be connected.
	 * @return A boolean, which indicates, if the creation of all edges was successful.
	 */
	/* Naive approach; probably not going to be used anymore
	private boolean createDataFlowEdgesForSVA(EList<SingleVariableAccess> elementList, MDefinition definition) {
		for (SingleVariableAccess accessed : elementList) {
			// TODO: Insert edge between accessed and accessing member
			// readAccess ? fieldFlow : checkFieldDef()
		}
		return false;
	}
	
	private boolean createDataFlowEdgesForAMI(EList<AbstractMethodInvocation> elementList, MDefinition definition) {
		for (AbstractMethodInvocation accessed : elementList) {
			if (accessed.getMethod().getClass() != null) {
				MFlow f = ModiscoFactory.eINSTANCE.createMFlow();
				//f.getReturnFlow().add(definition);
			}
		}
		return false;
	}
	
	private boolean createDataFlowEdgesForMIST(EList<MethodInvocationStaticType> elementList, MDefinition definition) {
		for (MethodInvocationStaticType accessed : elementList) {
			if (accessed.getMethodInvoc().getMethod().getClass() != null) {
				MFlow f = ModiscoFactory.eINSTANCE.createMFlow();
				//f.getReturnFlow().add(definition);
			}
		}
		return false;
	}
	*/
}
