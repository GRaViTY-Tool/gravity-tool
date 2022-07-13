package org.gravity.modisco.processing.fwd;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.UnresolvedTypeDeclaration;
import org.eclipse.modisco.java.VariableDeclarationFragment;
import org.eclipse.modisco.java.emf.JavaFactory;
import org.eclipse.osgi.util.NLS;
import org.gravity.eclipse.exceptions.ProcessingException;
import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MFieldName;
import org.gravity.modisco.MFieldSignature;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MSignature;
import org.gravity.modisco.Messages;
import org.gravity.modisco.ModiscoFactory;
import org.gravity.modisco.processing.AbstractTypedModiscoProcessor;
import org.gravity.modisco.util.MoDiscoUtil;

/**
 * Preprocessing of fields
 *
 * @author speldszus
 *
 */
public class FieldPreprocessing extends AbstractTypedModiscoProcessor<MFieldDefinition> {

	private static final Logger LOGGER = Logger.getLogger(FieldPreprocessing.class);

	private Map<String, MFieldName> names;

	@Override
	public boolean process(final MGravityModel model, final Collection<MFieldDefinition> elements, final IFolder debug,
			final IProgressMonitor monitor) {
		for(final MFieldDefinition field : elements) {
			if(field.eContainer() == null) {
				final var type = JavaFactory.eINSTANCE.createUnresolvedTypeDeclaration();
				type.getBodyDeclarations().add(field);
				model.getUnresolvedItems().add(type);
			}
		}

		this.names = new ConcurrentHashMap<>();
		Collection<MFieldDefinition> allDefinitions;
		try {
			allDefinitions = resolveMultipleDeclarationsInOneStatement(elements);
			model.getMFieldDefinitions().addAll(allDefinitions);
		} catch (final ProcessingException e) {
			LOGGER.error(e);
			return false;
		}
		if (!createFieldNameNodes(allDefinitions, model)) {
			return false;
		}
		return createFieldSignatureNodes(model);
	}

	/**
	 * If multiple fields are declared in one statement a separate field is created
	 * for every declaration
	 *
	 * @param elements The field definitions
	 * @return a collection of all field definitions
	 * @throws ProcessingException If the preprocessing failed
	 */
	private Collection<MFieldDefinition> resolveMultipleDeclarationsInOneStatement(
			final Collection<MFieldDefinition> elements) throws ProcessingException {
		final List<MFieldDefinition> allDefinitions = new LinkedList<>(elements);
		for (final MFieldDefinition mDefinition : elements) {
			final var fragments = mDefinition.getFragments();
			if (fragments.isEmpty()) {
				final var message = NLS.bind(Messages.errorFieldNoFragments, mDefinition);
				LOGGER.error(message);
				throw new ProcessingException(message);
			}
			for (final VariableDeclarationFragment scndDeclFragment : getOtherFragments(mDefinition,
					fragments.get(0))) {
				final var newDef = createNewDefinitionForFragment(mDefinition, scndDeclFragment);
				allDefinitions.add(newDef);
			}

		}
		return allDefinitions;
	}

	/**
	 * Creates a new definition for the declaration fragment
	 *
	 * @param oldDefiniton The old definition containing multiple variable
	 *                     declarations
	 * @param declFragment The declaration fragment which should be relocated
	 * @return The new definiton containing the declaration fragment
	 */
	private MFieldDefinition createNewDefinitionForFragment(final MFieldDefinition oldDefiniton,
			final VariableDeclarationFragment declFragment) {
		declFragment.setVariablesContainer(null);

		final var newDef = ModiscoFactory.eINSTANCE.createMFieldDefinition();
		newDef.getFragments().add(declFragment);
		newDef.setName(oldDefiniton.getName());
		newDef.setProxy(oldDefiniton.isProxy());
		newDef.setAbstractTypeDeclaration(oldDefiniton.getAbstractTypeDeclaration());

		final var oldTypeAccess = oldDefiniton.getType();
		if (oldTypeAccess != null) {
			final var type = oldTypeAccess.getType();
			if (type != null) {
				final var newTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
				newDef.setType(newTypeAccess);
				newTypeAccess.setType(type);
			}

		} else if (LOGGER.isEnabledFor(Level.WARN)) {
			LOGGER.warn(NLS.bind(Messages.errorFieldNoType, oldDefiniton));
		}

		final var modifier = oldDefiniton.getModifier();
		final var clonedModifier = JavaFactory.eINSTANCE.createModifier();
		newDef.setModifier(clonedModifier);
		clonedModifier.setVisibility(modifier.getVisibility());
		clonedModifier.setInheritance(modifier.getInheritance());

		final var anno = oldDefiniton.getAnonymousClassDeclarationOwner();
		if (anno != null) {
			anno.getBodyDeclarations().add(newDef);
		}
		return newDef;
	}

	private static Iterable<VariableDeclarationFragment> getOtherFragments(final MFieldDefinition mDefinition,
			final VariableDeclarationFragment fragment) {
		final var result = new LinkedList<VariableDeclarationFragment>();
		if (mDefinition.getFragments().contains(fragment)) {
			for (final VariableDeclarationFragment otherFragment : mDefinition.getFragments()) {
				if (!fragment.equals(otherFragment)) {
					result.add(otherFragment);
				}
			}
		}
		return result;
	}

	/**
	 * Creates a MFieldName node for every used name
	 *
	 * The method "resolveMultipleDeclarationsInOneStatement()" should be executed
	 * before this method!
	 *
	 * @param model The MoDisco model
	 * @return true, iff no error occurred
	 */
	private boolean createFieldNameNodes(final Collection<MFieldDefinition> mFieldDefinitions,
			final MGravityModel model) {
		final var success = mFieldDefinitions.stream().allMatch(mfDefinition -> {
			final var fragments = mfDefinition.getFragments();
			if (fragments.isEmpty()) {
				LOGGER.error(NLS.bind(Messages.errorFieldNoFragments, mfDefinition));
				return false;
			}
			if (fragments.size() > 1) {
				LOGGER.error(NLS.bind(Messages.warnFieldMultipleFragments, mfDefinition));
				return false;
			}
			final var declFragment = fragments.get(0);
			final var declFragmentName = declFragment.getName();
			var mName = this.names.get(declFragmentName);
			if (mName == null) {
				mName = ModiscoFactory.eINSTANCE.createMFieldName();
				mName.setMName(declFragmentName);
				this.names.put(declFragmentName, mName);
			}
			mName.getMDefinitions().add(mfDefinition);
			return true;
		});
		model.getMFieldNames().addAll(this.names.values());
		return success;
	}

	/**
	 * Creates the MFieldSignature nodes in the MoDisco model
	 *
	 * @param model The MoDisco model
	 * @return true, iff no error occurred
	 */
	private boolean createFieldSignatureNodes(final MGravityModel model) {
		for(final MFieldName name : model.getMFieldNames()){
			for (final MDefinition mfDefinition : name.getMDefinitions()) {
				final var mSig = getMFieldSignature(model, name, (MFieldDefinition) mfDefinition);
				mSig.getMDefinitions().add(mfDefinition);
			}
		}
		return true;
	}

	/**
	 * Creates a new field signature between the field name and definition
	 *
	 * @param model      The model containing all elements
	 * @param name       The field name
	 * @param definition The field definition
	 * @return a field signature
	 * @throws ProcessingException If the type of the field cannot be resolved
	 */
	private static MFieldSignature createNewSignature(final MGravityModel model, final MFieldName name,
			final MFieldDefinition definition) {
		final var mSig = ModiscoFactory.eINSTANCE.createMFieldSignature();
		name.getMSignatures().add(mSig);

		Type type;
		final var typeAccess = definition.getType();
		if (typeAccess != null) {
			type = typeAccess.getType();
		} else {
			final var message = NLS.bind(Messages.warnFieldNoTypeAssumeObject, definition);
			if (definition.isProxy()) {
				LOGGER.warn(message);
			} else {
				LOGGER.error(message);
			}
			type = fixMissingFieldType(model, definition);

		}
		mSig.setType(type);
		return mSig;
	}

	/**
	 * This method searches for a proper type of a field. In the worst case this is
	 * always "java.lang.Object".
	 *
	 * @param model      The model containing the filed
	 * @param definition The fields definition
	 * @return A suitable type for the field
	 */
	private static Type fixMissingFieldType(final MGravityModel model, final MFieldDefinition definition) {
		var typeAccess = definition.getType();
		if (typeAccess == null) {
			typeAccess = JavaFactory.eINSTANCE.createTypeAccess();
			definition.setType(typeAccess);
		} else {
			final var type = typeAccess.getType();
			if (type != null) {
				return type;
			}
		}
		final var type = MoDiscoUtil.getJavaLangObject(model);
		typeAccess.setType(type);
		return type;
	}

	/**
	 * Searches if there is already a signature for the field with the given name
	 * for the given definition
	 *
	 * @param model        The model containing all elements
	 * @param mName        The name of the field
	 * @param mfDefinition A definition of a field with this name
	 * @return A signature connecting the name and definition if existent, null
	 *         otherwise
	 */
	private static MFieldSignature getMFieldSignature(final MGravityModel model, final MFieldName mName,
			final MFieldDefinition mfDefinition) {
		final var mAccess = mfDefinition.getType();
		if (mAccess != null) {
			final var mType = mAccess.getType();
			if (mType != null) {
				for (final MSignature signature : mName.getMSignatures()) {
					final var fieldSignature = (MFieldSignature) signature;
					if (mType.equals(fieldSignature.getType())) {
						return fieldSignature;
					}
				}
			}

		}

		return createNewSignature(model, mName, mfDefinition);
	}

	@Override
	public Class<MFieldDefinition> getSupportedType() {
		return MFieldDefinition.class;
	}
}
