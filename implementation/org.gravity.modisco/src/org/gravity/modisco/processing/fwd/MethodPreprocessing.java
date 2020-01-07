package org.gravity.modisco.processing.fwd;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.modisco.java.SingleVariableDeclaration;
import org.eclipse.modisco.java.Type;
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
 * Preprocessing of methods for creating the name -> signature -> definition
 * structure
 *
 * @author speldszus
 *
 */
public class MethodPreprocessing extends AbstractTypedModiscoProcessor<MAbstractMethodDefinition> {

	private static final Logger LOGGER = Logger.getLogger(MethodPreprocessing.class);

	private Map<String, MMethodName> names;

	@Override
	public boolean process(final MGravityModel model, final Collection<MAbstractMethodDefinition> elements,
			final IProgressMonitor monitor) {
		// Make all definitions directly accessible from the model
		model.getMAbstractMethodDefinitions().addAll(elements);

		// Create MMethodNames for MMethodDefinitions
		this.names = new ConcurrentHashMap<>();
		model.getMMethodNames().addAll(createMethodNames(elements));

		// Create MMethodSignatures for MMethodNames
		return model.getMMethodNames().stream().allMatch(mName -> createMethodSignatures(mName, model));
	}

	/**
	 * Creates a new method name elements for the method definitions in the model
	 *
	 * @param definition The method definition
	 * @return
	 */
	private Collection<MMethodName> createMethodNames(final Collection<MAbstractMethodDefinition> definitions) {
		definitions.stream().forEach(definition -> {
			String name;
			if (definition instanceof MConstructorDefinition
					&& definition.getAnonymousClassDeclarationOwner() != null) {
				name = definition.getAnonymousClassDeclarationOwner().getClassInstanceCreation().getType().getType()
						.getName();
			} else {
				name = definition.getName();
			}
			MMethodName mName = this.names.get(name);
			if (mName == null) {
				mName = ModiscoFactory.eINSTANCE.createMMethodName();
				mName.setMName(name);
				this.names.put(name, mName);
			}
			mName.getMDefinitions().add(definition);
		});
		return this.names.values();
	}

	/**
	 * Creates the method signature for the given method name
	 *
	 * @param name  A method name
	 * @param model The model containing the name and according definitions
	 * @return true, iff the signatures have been created successfully
	 */
	private boolean createMethodSignatures(final MMethodName name, final MGravityModel model) {
		for (final MDefinition mDef : name.getMDefinitions()) {
			if (!createMethodSignature(model, name, (MAbstractMethodDefinition) mDef)) {
				return false;
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
	private boolean createMethodSignature(final MGravityModel model, final MMethodName name,
			final MAbstractMethodDefinition definition) {
		final Type mSigReturnType = MoDiscoUtil.getMostGenericReturnType(definition, model);
		if (mSigReturnType == null) {
			LOGGER.error("Couldn't find most geric return type for method definition:" + definition + ".");
			return false;
		}
		MMethodSignature signature = getExistingSignature(name, definition, mSigReturnType);
		if (signature == null) {
			signature = ModiscoFactory.eINSTANCE.createMMethodSignature();
			name.getMSignatures().add(signature);
			signature.setReturnType(mSigReturnType);
			MoDiscoUtil.fillParamList(definition, signature);
		} else {
			final EList<SingleVariableDeclaration> defParams = definition.getParameters();
			final MEntry mFirstEntry = signature.getMFirstEntry();
			if (mFirstEntry != null) {
				mFirstEntry.getParameters().add((MSingleVariableDeclaration) defParams.get(0));
				for (int i = 1; i < signature.getMEntrys().size(); i++) {
					mFirstEntry.getMNext().getParameters().add((MSingleVariableDeclaration) defParams.get(i));
				}
			}
		}
		definition.setMSignature(signature);
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
	private MMethodSignature getExistingSignature(final MMethodName name, final MAbstractMethodDefinition definition,
			final Type returnType) {
		for (final MSignature signature : name.getMSignatures()) {
			final MMethodSignature methodSignature = (MMethodSignature) signature;
			if (returnType.equals(methodSignature.getReturnType()) && isParamListEqual(definition, methodSignature)) {
				return methodSignature;
			}
		}
		return null;
	}

	/**
	 * Checks if the parameter list of the method definition and signature are equal
	 *
	 * @param definition The method definition
	 * @param signature  The method signature
	 * @return true, if the parameter lists are equal
	 */
	private static boolean isParamListEqual(final MAbstractMethodDefinition definition,
			final MMethodSignature signature) {
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
