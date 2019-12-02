package org.gravity.modisco.processing.fwd;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gmt.modisco.java.SingleVariableDeclaration;
import org.eclipse.gmt.modisco.java.Type;
import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MConstructorDefinition;
import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MEntry;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodName;
import org.gravity.modisco.MMethodSignature;
import org.gravity.modisco.MSignature;
import org.gravity.modisco.MSingleVariableDeclaration;
import org.gravity.modisco.ModiscoFactory;
import org.gravity.modisco.processing.AbstractTypedModiscoProcessor;
import org.gravity.modisco.util.MoDiscoUtil;

/**
 * Preprocessing of methods
 *
 * @author speldszus
 *
 */
public class MethodPreprocessing extends AbstractTypedModiscoProcessor<MAbstractMethodDefinition> {

	private static final Logger LOGGER = Logger.getLogger(MethodPreprocessing.class);

	@Override
	public boolean process(MGravityModel model, Collection<MAbstractMethodDefinition> elements,
			IProgressMonitor monitor) {
		// Make all definitions directly accessible from the model
		model.getMAbstractMethodDefinitions().addAll(elements);

		// Create MMethodNames for MMethodDefinitions
		for (final MAbstractMethodDefinition mDef : elements) {
			createMethodName(model, mDef);
		}
		// Create MMethodSignatures for MMethodNames
		for (final MMethodName mName : model.getMMethodNames()) {
			for (final MDefinition mDef : mName.getMDefinitions()) {
				if (!createMethodSignature(model, mName, (MAbstractMethodDefinition) mDef)) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Creates a new method signature element between the method name and definition
	 * if there isn't already one in the model
	 *
	 * @param model      The modisco model
	 * @param name       The method name
	 * @param definition The method definition
	 * @return true, if the creation was successful
	 */
	private boolean createMethodSignature(MGravityModel model, MMethodName name, MAbstractMethodDefinition definition) {
		final Type mSigReturnType = MoDiscoUtil.getMostGenericReturnType(definition, model);
		if (mSigReturnType == null) {
			LOGGER.error("Couldn't find most geric return type for method definition:" + definition + ".");
			return false;
		}
		MMethodSignature existingSignature = getExistingSignature(name, definition, mSigReturnType);
		if (existingSignature == null) {
			existingSignature = ModiscoFactory.eINSTANCE.createMMethodSignature();
			name.getMSignatures().add(existingSignature);
			existingSignature.setReturnType(mSigReturnType);
			MoDiscoUtil.fillParamList(definition, existingSignature);
		} else {
			final EList<SingleVariableDeclaration> defParams = definition.getParameters();
			final MEntry mFirstEntry = existingSignature.getMFirstEntry();
			if (mFirstEntry != null) {
				mFirstEntry.getParameters().add((MSingleVariableDeclaration) defParams.get(0));
				for (int i = 1; i < existingSignature.getMEntrys().size(); i++) {
					mFirstEntry.getMNext().getParameters().add((MSingleVariableDeclaration) defParams.get(i));
				}
			}
		}
		existingSignature.getMDefinitions().add(definition);
		return true;
	}

	/**
	 * Searches if there is already a signature for the name corresponding to the
	 * given definition
	 *
	 * @param name       The name object of the method
	 * @param definition The method definition
	 * @param returnType The most generic return type
	 * @return The signature or null
	 */
	private MMethodSignature getExistingSignature(MMethodName name, MAbstractMethodDefinition definition,
			Type returnType) {
		for (final MSignature signature : name.getMSignatures()) {
			final MMethodSignature methodSignature = (MMethodSignature) signature;
			if (returnType.equals(methodSignature.getReturnType()) && isParamListEqual(definition, methodSignature)) {
				return methodSignature;
			}
		}
		return null;
	}

	/**
	 * Creates a new method name element for the method definition in the model if
	 * there isn't already one
	 *
	 * @param model      The modisco model
	 * @param definition The method definition
	 */
	private void createMethodName(MGravityModel model, MAbstractMethodDefinition definition) {
		String name;
		if (definition instanceof MConstructorDefinition && definition.getAnonymousClassDeclarationOwner() != null) {
			name = definition.getAnonymousClassDeclarationOwner().getClassInstanceCreation().getType().getType()
					.getName();
		} else {
			name = definition.getName();
		}
		MMethodName mName = getMethodName(model, name);
		if (mName == null) {
			mName = ModiscoFactory.eINSTANCE.createMMethodName();
			model.getMMethodNames().add(mName);
			mName.setMName(name);
		}
		mName.getMDefinitions().add(definition);
	}

	/**
	 * Searches the model for a method with the given name
	 *
	 * @param model The model
	 * @param name  The name
	 * @return the found element or null
	 */
	private MMethodName getMethodName(MGravityModel model, String name) {
		return model.getMMethodNames().parallelStream().filter(element -> element.getMName().equals(name)).findAny()
				.orElse(null);
	}

	/**
	 * Checks if the parameter list of the method definition and signature are equal
	 *
	 * @param definition The method definition
	 * @param signature  The method signature
	 * @return true, if the parameter lists are equal
	 */
	private static boolean isParamListEqual(MAbstractMethodDefinition definition, MMethodSignature signature) {
		final EList<SingleVariableDeclaration> parameters1 = definition.getParameters();
		final EList<MEntry> parameters2 = signature.getMEntrys();
		if (parameters1.size() == parameters2.size()) {
			for (int i = 0; i < parameters1.size(); i++) {
				if (!parameters1.get(i).getType().getType().equals(parameters2.get(i).getType())) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	@Override
	public Class<MAbstractMethodDefinition> getSupportedType() {
		return MAbstractMethodDefinition.class;
	}
}
