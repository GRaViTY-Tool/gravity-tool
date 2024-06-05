package org.gravity.modisco.processing.fwd;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.modisco.java.ConstructorDeclaration;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.emf.JavaFactory;
import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MConstructorDefinition;
import org.gravity.modisco.MDefinition;
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

	@Override
	public boolean process(final MGravityModel model, final Collection<MAbstractMethodDefinition> elements,
			final IFolder debug, final IProgressMonitor monitor) {
		final var types = MoDiscoUtil.getAllTypes(model);
		for (final MAbstractMethodDefinition def : elements) {
			if (def.eContainer() == null) {
				final var name = def.getName();
				if (def instanceof ConstructorDeclaration) {
					final var result = types.parallelStream().filter(t -> t.getName().equals(name)).findAny();
					if (result.isPresent()) {
						result.get().getBodyDeclarations().add(def);
					} else {
						final var type = ModiscoFactory.eINSTANCE.createMClass();
						type.setName(name);
						type.getBodyDeclarations().add(def);
						types.add(type);
						model.getOrphanTypes().add(type);
					}
				} else {
					final var type = JavaFactory.eINSTANCE.createUnresolvedTypeDeclaration();
					type.getBodyDeclarations().add(def);
					model.getUnresolvedItems().add(type);
				}
			}
		}

		// Make all definitions directly accessible from the model
		model.getMAbstractMethodDefinitions().addAll(elements);

		// Create MMethodNames for MMethodDefinitions
		model.getMMethodNames().addAll(this.createMethodNames(elements));

		// Create MMethodSignatures for MMethodNames
		return model.getMMethodNames().stream().allMatch(this::createMethodSignatures);
	}

	/**
	 * Creates a new method name elements for the method definitions in the model
	 *
	 * @param definition The method definition
	 * @return
	 */
	private Collection<MMethodName> createMethodNames(final Collection<MAbstractMethodDefinition> definitions) {
		final Map<String, MMethodName> names = new HashMap<>();
		for (final MAbstractMethodDefinition definition : definitions) {
			String name;
			if ((definition instanceof MConstructorDefinition)
					&& (definition.getAnonymousClassDeclarationOwner() != null)) {
				name = definition.getAnonymousClassDeclarationOwner().getClassInstanceCreation().getType().getType()
						.getName();
			} else {
				name = definition.getName();
			}
			final var mName = names.computeIfAbsent(name, n -> {
				final var result = ModiscoFactory.eINSTANCE.createMMethodName();
				result.setMName(n);
				return result;
			});
			mName.getMDefinitions().add(definition);
		}
		return names.values();
	}

	/**
	 * Creates the method signature for the given method name
	 *
	 * @param name A method name
	 * @return true, iff the signatures have been created successfully
	 */
	private boolean createMethodSignatures(final MMethodName name) {
		for (final MDefinition mDef : name.getMDefinitions()) {
			if (!createMethodSignature(name, (MAbstractMethodDefinition) mDef)) {
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
	static boolean createMethodSignature(final MMethodName name, final MAbstractMethodDefinition definition) {
		final var mSigReturnType = MoDiscoUtil.getMostGenericReturnType(definition);
		if (mSigReturnType == null) {
			LOGGER.error("Couldn't find most geric return type for method definition:" + definition + ".");
			return false;
		}
		var signature = getExistingSignature(name, definition, mSigReturnType);
		if (signature == null) {
			signature = ModiscoFactory.eINSTANCE.createMMethodSignature();
			name.getMSignatures().add(signature);
			signature.setReturnType(mSigReturnType);
			MoDiscoUtil.fillParamList(definition, signature);
		} else {
			final var defParams = definition.getParameters();
			final var sigParams = signature.getMEntrys();
			if (defParams.size() != sigParams.size()) {
				LOGGER.error("Signature's parameter number do not match definitions paramter number.");
				return false;
			}
			var entry = signature.getMFirstEntry();
			for (final var param : defParams) {
				entry.getAllParameterInstances().add((MSingleVariableDeclaration) param);
				entry = entry.getMNext();
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
	private static MMethodSignature getExistingSignature(final MMethodName name,
			final MAbstractMethodDefinition definition, final Type returnType) {
		for (final MSignature signature : name.getMSignatures()) {
			final var methodSignature = (MMethodSignature) signature;
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
		final var parameters1 = definition.getParameters();
		final var parameters2 = signature.getMEntrys();
		if (parameters1.size() == parameters2.size()) {
			for (var i = 0; i < parameters1.size(); i++) {
				final var type = parameters1.get(i).getType().getType();
				if ((type != null) && !type.equals(parameters2.get(i).getType())) {
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
