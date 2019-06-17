package org.gravity.modisco.processing.fwd;

import java.util.Collection;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration;
import org.eclipse.gmt.modisco.java.AbstractMethodInvocation;
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.AbstractVariablesContainer;
import org.eclipse.gmt.modisco.java.Block;
import org.eclipse.gmt.modisco.java.FieldDeclaration;
import org.eclipse.gmt.modisco.java.SingleVariableAccess;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.TypeAccess;
import org.eclipse.gmt.modisco.java.VariableDeclaration;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;
import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MClass;
import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MName;
import org.gravity.modisco.MSignature;
import org.gravity.modisco.processing.IMoDiscoProcessor;

/**
 * This class contains preprocessings which haven't been extracted to separate preprocessors yet
 * 
 * @author speldszus
 *
 */
public class GravityMoDiscoPreprocessing implements IMoDiscoProcessor {

	private static final Logger LOGGER = Logger.getLogger(GravityMoDiscoPreprocessing.class);

	@Override
	public boolean process(MGravityModel model, IProgressMonitor monitor) {
		if (!preprocessAccesses(model) || !preprocessImplementedSignatures(model)) {
			return false;
		}
		if (monitor.isCanceled()) {
			return false;
		}
		return true;
	}

	/**
	 * Adds implementedBy edge from Classes to Signatures if the classes contain
	 * according definitions
	 * 
	 * @param model The model which should be preprocessed
	 */
	private static boolean preprocessImplementedSignatures(MGravityModel model) {
		Hashtable<MSignature, Collection<AbstractTypeDeclaration>> mapping = new Hashtable<>();
		for (MName mName : model.getMNames()) {
			for (MSignature mSignature : mName.getMSignatures()) {
				List<AbstractTypeDeclaration> implementingTypes = new LinkedList<>();
				for (MDefinition mDefinition : mSignature.getMDefinitions()) {
					AbstractTypeDeclaration mType = mDefinition.getAbstractTypeDeclaration();
					if (mType != null) {
						implementingTypes.add(mType);
					} else {
						EObject eContainer = mDefinition.eContainer();
						if (JavaPackage.eINSTANCE.getAnonymousClassDeclaration().isSuperTypeOf(eContainer.eClass())) {
							// Ignore this case
						} else {
							LOGGER.log(Level.ERROR, "Couldn't preprocess implemented siganture: " + mSignature);
							return false;
						}
					}
				}
				mapping.put(mSignature, implementingTypes);
			}
		}
		for (Entry<MSignature, Collection<AbstractTypeDeclaration>> entry : mapping.entrySet()) {
			entry.getKey().getImplementedBy().addAll(entry.getValue());
		}
		return true;
	}

	private static boolean preprocessAccesses(MGravityModel model) {
		for (MAbstractMethodDefinition def : model.getMAbstractMethodDefinitions()) {
			Block block = def.getBody();
			if (!StatementHandler.handle(block, def)) {
				LOGGER.log(Level.ERROR,
						"Couldn't handle method statement \"" + block + "\" at preprocessing of accesses.");
				return false;
			}
			calculateTypeDependencies(def);
		}
		for (MFieldDefinition def : model.getMFieldDefinitions()) {
			for (VariableDeclarationFragment fragment : def.getFragments()) {
				if (!MiscHandler.handle(fragment, def)) { // TODO: Add access types here
					LOGGER.log(Level.ERROR,
							"Couldn't handle field statement \"" + fragment + "\" at preprocessing of accesses.");
					return false;
				}
			}
			calculateTypeDependencies(def);
		}
		return true;
	}

	private static void calculateTypeDependencies(MDefinition def) {
		Type mType = def.getAbstractTypeDeclaration();
		if (mType instanceof MClass) {
			EList<Type> deps = ((MClass) mType).getDependencies();
			for (AbstractMethodInvocation methodInvocation : def.getMMethodInvocations()) {
				AbstractMethodDeclaration method = methodInvocation.getMethod();
				if (method == null) {
					LOGGER.log(Level.WARN, "Empty method invocation in method \"" + def.getName() + "\" of type \""
							+ mType.getName() + "\".");
					continue;
				}
				AbstractTypeDeclaration abstractTypeDeclaration = method.getAbstractTypeDeclaration();
				if (abstractTypeDeclaration == null) {
					if (JavaPackage.eINSTANCE.getUnresolvedMethodDeclaration().isSuperTypeOf(method.eClass())) {
						LOGGER.log(Level.WARN, "Skipped unresolved method: " + method.getName());
					} else {
						LOGGER.log(Level.ERROR, "Skipped unresolved method: " + method.getName());
					}
					continue;
				}
				deps.add(abstractTypeDeclaration);
			}
			for (SingleVariableAccess methodInvocation : def.getMAbstractFieldAccess()) {
				VariableDeclaration variable = methodInvocation.getVariable();
				if (variable instanceof VariableDeclarationFragment) {
					AbstractVariablesContainer variablesContainer = ((VariableDeclarationFragment) variable)
							.getVariablesContainer();
					if (variablesContainer instanceof FieldDeclaration) {
						final AbstractTypeDeclaration abstractTypeDeclaration = ((FieldDeclaration) variablesContainer)
								.getAbstractTypeDeclaration();
						if (abstractTypeDeclaration == null) {
							String message = buildUnresolvedFieldAccessErrorMessage(def, variable, variablesContainer);
							LOGGER.log(Level.ERROR, message);
						} else {
							deps.add(abstractTypeDeclaration);
						}
					}
				}
			}
		}
	}

	/**
	 * Builds an error message for an access to an unresolved field
	 * 
	 * @param definition The definition of the accessing member
	 * @param declaration The declaration of the unresolved field
	 * @param container The container of the unresolved field
	 * @return An error message
	 */
	private static String buildUnresolvedFieldAccessErrorMessage(MDefinition definition, VariableDeclaration declaration,
			AbstractVariablesContainer container) {
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
		String message = messageBuilder.toString();
		return message;
	}
}
