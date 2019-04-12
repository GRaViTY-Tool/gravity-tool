package org.gravity.modisco.dataflow;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gmt.modisco.java.AbstractMethodInvocation;
import org.eclipse.gmt.modisco.java.SingleVariableAccess;
import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MethodInvocationStaticType;
import org.gravity.modisco.processing.IMoDiscoProcessor;

/**
 * A preprocessor for calculating data flow edges
 * 
 * @author speldszus
 *
 */
public class DataFlowProcessor implements IMoDiscoProcessor {

	@Override
	public boolean process(MGravityModel model, IProgressMonitor monitor) {
		// TODO: Implement the preprocessing
		return false;
	}
	
	/**
	 * Identifies the accesses in each field definition to create data flow edges from the field to the accessed members.
	 * 
	 * @param model The MoDisco model, whose field definitions will be processed.
	 * @return A boolean, which indicates, if the creation of all data flow edges was successful.
	 */
	private boolean processMFieldDefinitions(MGravityModel model) {
		boolean success = true;
		for (MFieldDefinition field : model.getMFieldDefinitions()) {
			EList<SingleVariableAccess> fieldAccesses = field.getMAbstractFieldAccess();
			EList<AbstractMethodInvocation> methodInvocations = field.getAbstractMethodInvocations();
			EList<MethodInvocationStaticType> staticInvocations = field.getInvocationStaticTypes();
			if (!fieldAccesses.isEmpty()) success &= createDataFlowEdges(fieldAccesses, field);
			//if (!methodInvocations.isEmpty()) success &= createDataFlowEdges(methodInvocations, field);
			//if (!staticInvocations.isEmpty()) success &= createDataFlowEdges(staticInvocations, field);
		}
		return success;
	}
	
	/**
	 * Identifies the accesses in each method definition to create data flow edges from the method to the accessed members.
	 * 
	 * @param model The MoDisco model, whose method definitions will be processed.
	 * @return A boolean, which indicates, if the creation of all data flow edges was successful.
	 */
	private boolean processMMethodDefinitions(MGravityModel model) {
		boolean success = true;
		for (MMethodDefinition method : model.getMMethodDefinitions()) {
			EList<SingleVariableAccess> fieldAccesses = method.getMAbstractFieldAccess();
			EList<AbstractMethodInvocation> methodInvocations = method.getAbstractMethodInvocations();
			EList<MethodInvocationStaticType> staticInvocations = method.getInvocationStaticTypes();
			//if (!fieldAccesses.isEmpty()) success &= createDataFlowEdges(fieldAccesses, method);
			// TODO: Insert remaining calls
		}
		return success;
	}

	// TODO: Overload this method to support all kinds of accesses
	/**
	 * Creates data flow edges between all elements from the given element list and the given field.
	 * 
	 * @param elementList A list of model elements.
	 * @param field The field, to which the data flow edges will be connected.
	 * @return A boolean, which indicates, if the creation of all edges was successful.
	 */
	private boolean createDataFlowEdges(EList<SingleVariableAccess> elementList, MFieldDefinition field) {
		for (SingleVariableAccess sva : elementList) {
			// TODO: Insert edge between accessed and accessing member
			//sva.getVariable().getDataFlowEdges().add ...
		}
		return false;
	}
}
