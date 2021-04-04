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
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.java.AbstractMethodDeclaration;
import org.eclipse.modisco.java.AbstractMethodInvocation;
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.AbstractVariablesContainer;
import org.eclipse.modisco.java.FieldDeclaration;
import org.eclipse.modisco.java.SingleVariableAccess;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.VariableDeclaration;
import org.eclipse.modisco.java.VariableDeclarationFragment;
import org.eclipse.modisco.java.emf.JavaPackage;
import org.eclipse.osgi.util.NLS;
import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MAbstractMethodInvocation;
import org.gravity.modisco.MAccess;
import org.gravity.modisco.MClass;
import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MSingleVariableAccess;
import org.gravity.modisco.Messages;
import org.gravity.modisco.processing.AbstractTypedModiscoProcessor;
import org.gravity.modisco.util.NameUtil;

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

	@Override
	public boolean process(final MGravityModel model, final Collection<MAccess> elements, final IFolder debug,
			final IProgressMonitor monitor) {
		this.fieldAccesses = new HashMap<>();
		this.methodAccesses = new HashMap<>();
		this.cache = new HashMap<>();
		elements.stream().forEach(access -> {
			if (access instanceof MAbstractMethodInvocation) {
				process((MAbstractMethodInvocation) access);
			} else if (access instanceof MSingleVariableAccess) {
				process((MSingleVariableAccess) access);
			} else {
				LOGGER.error(NLS.bind(Messages.errorUnhandled, access));
			}
		});
		this.fieldAccesses.entrySet().parallelStream()
		.forEach(entry -> entry.getKey().getMAbstractFieldAccess().addAll(entry.getValue()));
		this.methodAccesses.entrySet().parallelStream()
		.forEach(entry -> entry.getKey().getMMethodInvocations().addAll(entry.getValue()));

		for (final MFieldDefinition field : model.getMFieldDefinitions()) {
			calculateTypeDependencies(field);
		}
		for (final MAbstractMethodDefinition method : model.getMAbstractMethodDefinitions()) {
			calculateTypeDependencies(method);
		}

		return true;
	}

	/**
	 * Processes accesses to fields
	 *
	 * @param access A variable access
	 */
	private void process(final MSingleVariableAccess access) {
		final MDefinition definition = getDefiningMember(access);
		if (definition == null) {
			LOGGER.error("Cannot process access as it isn't defined in a member");
			return;
		}

		final VariableDeclaration variable = access.getVariable();
		if ((variable == null) || !(variable.eContainer() instanceof FieldDeclaration)) {
			return;
		}
		this.fieldAccesses.computeIfAbsent(definition, f -> new LinkedList<>()).add(access);
	}

	/**
	 * Processes method calls
	 *
	 * @param call A method call
	 */
	private void process(final MAbstractMethodInvocation call) {
		final MDefinition definition = getDefiningMember(call);
		if (definition == null) {
			LOGGER.error("Cannot process access as it isn't defined in a member");
			return;
		}
		this.methodAccesses.computeIfAbsent(definition, f -> new LinkedList<>()).add(call);
	}

	/**
	 * Searches the member defining this access
	 *
	 * @param access The access
	 * @return The member or null
	 */
	private MDefinition getDefiningMember(final MAccess access) {
		final List<EObject> seen = new LinkedList<>();
		seen.add(access);
		EObject container = access;
		while ((container != null) && !(container instanceof MDefinition)) {
			container = container.eContainer();
			if (this.cache.containsKey(container)) {
				container = this.cache.get(container);
			} else {
				seen.add(container);
			}
		}
		if (container == null) {
			return null;
		}
		final MDefinition definition = (MDefinition) container;
		seen.stream().forEach(object -> this.cache.put(object, definition));
		return definition;
	}

	private static void calculateTypeDependencies(final MDefinition definition) {
		final Type mType = definition.getAbstractTypeDeclaration();
		if (mType instanceof MClass) {
			final EList<Type> deps = ((MClass) mType).getDependencies();
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
	private static List<Type> calculateTypeDependenciesForFieldAccesses(final MDefinition definition) {
		final List<Type> dependencies = new LinkedList<>();
		for (final SingleVariableAccess methodInvocation : definition.getMAbstractFieldAccess()) {
			final VariableDeclaration variable = methodInvocation.getVariable();
			if (variable instanceof VariableDeclarationFragment) {
				final AbstractVariablesContainer variablesContainer = ((VariableDeclarationFragment) variable)
						.getVariablesContainer();
				if (variablesContainer instanceof FieldDeclaration) {
					final AbstractTypeDeclaration abstractTypeDeclaration = ((FieldDeclaration) variablesContainer)
							.getAbstractTypeDeclaration();
					if (abstractTypeDeclaration == null) {
						final String message = buildUnresolvedFieldAccessErrorMessage(definition, variable,
								variablesContainer);
						LOGGER.error(message);
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
	private static List<Type> calculateTypeDependenciesForCalls(final MDefinition definition) {
		final List<Type> dependencies = new LinkedList<>();
		for (final AbstractMethodInvocation methodInvocation : definition.getMMethodInvocations()) {
			final AbstractMethodDeclaration method = methodInvocation.getMethod();
			if (method != null) {
				final AbstractTypeDeclaration abstractTypeDeclaration = method.getAbstractTypeDeclaration();
				if (abstractTypeDeclaration != null) {
					dependencies.add(abstractTypeDeclaration);
				} else if (JavaPackage.eINSTANCE.getUnresolvedMethodDeclaration().isSuperTypeOf(method.eClass())) {
					if (LOGGER.isEnabledFor(Level.WARN)) {
						LOGGER.warn(NLS.bind(Messages.skippedUnresolvedMethod, method.getName()));
					}
				} else {
					LOGGER.warn(NLS.bind(Messages.skippedUnresolvedMethod, method.getName()));
				}

			} else if (LOGGER.isEnabledFor(Level.WARN)) {
				LOGGER.warn(NLS.bind(Messages.errorEmptyMethodInvoc,
						new String[] { definition.getName(), definition.getAbstractTypeDeclaration().getName() }));
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
	private static String buildUnresolvedFieldAccessErrorMessage(final MDefinition definition,
			final VariableDeclaration declaration, final AbstractVariablesContainer container) {
		final StringBuilder messageBuilder = new StringBuilder(declaration.getName());
		final TypeAccess fieldTypeAccess = container.getType();
		if (fieldTypeAccess != null) {
			messageBuilder.append(':').append(fieldTypeAccess.getType().getName());
		}
		return NLS.bind(Messages.errorAccessToUnresolvedField,
				new String[] { NameUtil.getFullyQualifiedName(definition), messageBuilder.toString() });
	}

	@Override
	public Class<MAccess> getSupportedType() {
		return MAccess.class;
	}

}
