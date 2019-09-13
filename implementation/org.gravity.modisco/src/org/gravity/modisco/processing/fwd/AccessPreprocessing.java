/**
 * 
 */
package org.gravity.modisco.processing.fwd;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration;
import org.eclipse.gmt.modisco.java.AbstractMethodInvocation;
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.AbstractVariablesContainer;
import org.eclipse.gmt.modisco.java.FieldDeclaration;
import org.eclipse.gmt.modisco.java.SingleVariableAccess;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.TypeAccess;
import org.eclipse.gmt.modisco.java.VariableDeclaration;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;
import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MAbstractMethodInvocation;
import org.gravity.modisco.MAccess;
import org.gravity.modisco.MClass;
import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MSingleVariableAccess;
import org.gravity.modisco.processing.AbstractTypedModiscoProcessor;

/**
 * A processor for adding accesses to members
 * 
 * @author speldszus
 *
 */
public class AccessPreprocessing extends AbstractTypedModiscoProcessor<MAccess> {

	/**
	 * The logger of this class
	 */
	private static final Logger LOGGER = Logger.getLogger(AccessPreprocessing.class);

	/*
	 * Temporal maps
	 */
	private Map<MDefinition, List<MSingleVariableAccess>> fieldAccesses;
	private Map<MDefinition, List<MAbstractMethodInvocation>> methodAccesses;
	private Map<EObject, MDefinition> cache;

	public boolean process(MGravityModel model, Collection<MAccess> elements, IProgressMonitor monitor) {
		fieldAccesses = new HashMap<>();
		methodAccesses = new HashMap<>();
		cache = new HashMap<>();
		elements.stream().forEach(access -> {
			if (access instanceof MAbstractMethodInvocation) {
				process((MAbstractMethodInvocation) access);
			} else if (access instanceof MSingleVariableAccess) {
				process((MSingleVariableAccess) access);
			} else {
				LOGGER.error("Didn't handle: " + access);
			}
		});
		fieldAccesses.entrySet().parallelStream()
				.forEach(entry -> entry.getKey().getMAbstractFieldAccess().addAll(entry.getValue()));
		methodAccesses.entrySet().parallelStream()
				.forEach(entry -> entry.getKey().getMMethodInvocations().addAll(entry.getValue()));

		for (MFieldDefinition field : model.getMFieldDefinitions()) {
			calculateTypeDependencies(field);
		}
		for (MAbstractMethodDefinition method : model.getMAbstractMethodDefinitions()) {
			calculateTypeDependencies(method);
		}

		return true;
	}

	/**
	 * Processes accesses to fields
	 * 
	 * @param access A variable access
	 */
	private void process(MSingleVariableAccess access) {
		MDefinition definition = getDefiningMember(access);
		VariableDeclaration variable = access.getVariable();
		if (variable == null || !(variable.eContainer() instanceof FieldDeclaration)) {
			return;
		}
		List<MSingleVariableAccess> content = fieldAccesses.get(definition);
		if (content == null) {
			content = new LinkedList<>();
			fieldAccesses.put(definition, content);
		}
		content.add(access);
	}

	/**
	 * Processes method calls
	 * 
	 * @param call A method call
	 */
	private void process(MAbstractMethodInvocation call) {
		MDefinition definition = getDefiningMember(call);
		List<MAbstractMethodInvocation> content = methodAccesses.get(definition);
		if (content == null) {
			content = new LinkedList<>();
			methodAccesses.put(definition, content);
		}
		content.add(call);
	}

	/**
	 * Searches the member defining this access
	 * 
	 * @param access The access
	 * @return The member or null
	 */
	private MDefinition getDefiningMember(MAccess access) {
		List<EObject> seen = new LinkedList<>();
		seen.add(access);
		EObject container = access;
		while (container != null && !(container instanceof MDefinition)) {
			container = container.eContainer();
			if (cache.containsKey(container)) {
				container = cache.get(container);
			} else {
				seen.add(container);
			}
		}
		if (container == null) {
			return null;
		}
		MDefinition definition = (MDefinition) container;
		seen.stream().forEach(object -> cache.put(object, definition));
		return definition;
	}

	private static void calculateTypeDependencies(MDefinition definition) {
		Type mType = definition.getAbstractTypeDeclaration();
		if (mType instanceof MClass) {
			EList<Type> deps = ((MClass) mType).getDependencies();
			deps.addAll(calculateTypeDependenciesForCalls(definition));
			deps.addAll(calculateTypeDependenciesForFieldAccesses(definition));
		}
	}

	/**
	 * Calculates the dependencies to other types caused by field accesses in the
	 * given definition
	 * 
	 * @param definition A definition
	 * @return The dependencies
	 */
	private static List<Type> calculateTypeDependenciesForFieldAccesses(MDefinition definition) {
		List<Type> dependencies = new LinkedList<>();
		for (SingleVariableAccess methodInvocation : definition.getMAbstractFieldAccess()) {
			VariableDeclaration variable = methodInvocation.getVariable();
			if (variable instanceof VariableDeclarationFragment) {
				AbstractVariablesContainer variablesContainer = ((VariableDeclarationFragment) variable)
						.getVariablesContainer();
				if (variablesContainer instanceof FieldDeclaration) {
					final AbstractTypeDeclaration abstractTypeDeclaration = ((FieldDeclaration) variablesContainer)
							.getAbstractTypeDeclaration();
					if (abstractTypeDeclaration == null) {
						String message = buildUnresolvedFieldAccessErrorMessage(definition, variable,
								variablesContainer);
						LOGGER.log(Level.ERROR, message);
					} else {
						dependencies.add(abstractTypeDeclaration);
					}
				}
			}
		}
		return dependencies;
	}

	/**
	 * Calculates the dependencies to other types caused by method calls in the
	 * given definition
	 * 
	 * @param definition A definition
	 * @return The dependencies
	 */
	private static List<Type> calculateTypeDependenciesForCalls(MDefinition definition) {
		List<Type> dependencies = new LinkedList<>();
		for (AbstractMethodInvocation methodInvocation : definition.getMMethodInvocations()) {
			AbstractMethodDeclaration method = methodInvocation.getMethod();
			if (method == null) {
				LOGGER.log(Level.WARN, "Empty method invocation in method \"" + definition.getName() + "\" of type \""
						+ definition.getAbstractTypeDeclaration().getName() + "\".");
			} else {
				AbstractTypeDeclaration abstractTypeDeclaration = method.getAbstractTypeDeclaration();
				if (abstractTypeDeclaration != null) {
					dependencies.add(abstractTypeDeclaration);
				} else if (JavaPackage.eINSTANCE.getUnresolvedMethodDeclaration().isSuperTypeOf(method.eClass())) {
					LOGGER.log(Level.WARN, "Skipped unresolved method: " + method.getName());
				} else {
					LOGGER.log(Level.ERROR, "Skipped unresolved method: " + method.getName());
				}
			}

		}
		return dependencies;
	}

	/**
	 * Builds an error message for an access to an unresolved field
	 * 
	 * @param definition  The definition of the accessing member
	 * @param declaration The declaration of the unresolved field
	 * @param container   The container of the unresolved field
	 * @return An error message
	 */
	private static String buildUnresolvedFieldAccessErrorMessage(MDefinition definition,
			VariableDeclaration declaration, AbstractVariablesContainer container) {
		StringBuilder messageBuilder = new StringBuilder("Access from \"");
		messageBuilder.append(definition.getAbstractTypeDeclaration().getName());
		messageBuilder.append('.');
		messageBuilder.append(definition.getName());
		messageBuilder.append("\" to unresolved field: ");
		messageBuilder.append(declaration.getName());

		TypeAccess fieldTypeAccess = container.getType();
		if (fieldTypeAccess != null) {
			messageBuilder.append(':');
			messageBuilder.append(fieldTypeAccess.getType().getName());
		}
		return messageBuilder.toString();
	}

	@Override
	public Class<MAccess> getSupportedType() {
		return MAccess.class;
	}

}
