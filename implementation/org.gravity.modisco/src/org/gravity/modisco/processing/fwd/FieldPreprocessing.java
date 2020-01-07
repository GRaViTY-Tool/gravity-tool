package org.gravity.modisco.processing.fwd;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.eclipse.modisco.java.Modifier;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;
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
	public boolean process(final MGravityModel model, final Collection<MFieldDefinition> elements,
			final IProgressMonitor monitor) {
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
			final EList<VariableDeclarationFragment> fragments = mDefinition.getFragments();
			if (fragments.isEmpty()) {
				final String message = NLS.bind(Messages.errorFieldNoFragments, mDefinition);
				LOGGER.error(message);
				throw new ProcessingException(message);
			}
			for (final VariableDeclarationFragment scndDeclFragment : getOtherFragments(mDefinition,
					fragments.get(0))) {
				final MFieldDefinition newDef = createNewDefinitionForFragment(mDefinition, scndDeclFragment);
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

		final MFieldDefinition newDef = ModiscoFactory.eINSTANCE.createMFieldDefinition();
		newDef.getFragments().add(declFragment);
		newDef.setName(oldDefiniton.getName());
		newDef.setProxy(oldDefiniton.isProxy());
		newDef.setAbstractTypeDeclaration(oldDefiniton.getAbstractTypeDeclaration());

		final TypeAccess oldTypeAccess = oldDefiniton.getType();
		if (oldTypeAccess != null) {
			final Type type = oldTypeAccess.getType();
			if (type != null) {
				final TypeAccess newTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
				newDef.setType(newTypeAccess);
				newTypeAccess.setType(type);
			}

		} else if (LOGGER.isEnabledFor(Level.WARN)) {
			LOGGER.warn(NLS.bind(Messages.errorFieldNoType, oldDefiniton));
		}

		final Modifier modifier = oldDefiniton.getModifier();
		final Modifier clonedModifier = JavaFactory.eINSTANCE.createModifier();
		newDef.setModifier(clonedModifier);
		clonedModifier.setVisibility(modifier.getVisibility());
		clonedModifier.setInheritance(modifier.getInheritance());

		final AnonymousClassDeclaration anno = oldDefiniton.getAnonymousClassDeclarationOwner();
		if (anno != null) {
			anno.getBodyDeclarations().add(newDef);
		}
		return newDef;
	}

	private static Iterable<VariableDeclarationFragment> getOtherFragments(final MFieldDefinition mDefinition,
			final VariableDeclarationFragment fragment) {
		final LinkedList<VariableDeclarationFragment> result = new LinkedList<>();
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
		final boolean success = mFieldDefinitions.stream().allMatch(mfDefinition -> {
			final EList<VariableDeclarationFragment> fragments = mfDefinition.getFragments();
			if (fragments.isEmpty()) {
				LOGGER.error(NLS.bind(Messages.errorFieldNoFragments, mfDefinition));
				return false;
			}
			if (fragments.size() > 1) {
				LOGGER.error(NLS.bind(Messages.warnFieldMultipleFragments, mfDefinition));
				return false;
			}
			final VariableDeclarationFragment declFragment = fragments.get(0);
			final String declFragmentName = declFragment.getName();
			MFieldName mName = this.names.get(declFragmentName);
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
		model.getMFieldNames().parallelStream().forEach(name -> {
			for (final MDefinition mfDefinition : name.getMDefinitions()) {
				final MFieldSignature mSig = getMFieldSignature(model, name, (MFieldDefinition) mfDefinition);
				mSig.getMDefinitions().add(mfDefinition);
			}
		});
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
		final MFieldSignature mSig = ModiscoFactory.eINSTANCE.createMFieldSignature();
		name.getMSignatures().add(mSig);

		Type type;
		final TypeAccess typeAccess = definition.getType();
		if (typeAccess != null) {
			type = typeAccess.getType();
		} else {
			final String message = NLS.bind(Messages.warnFieldNoTypeAssumeObject, definition);
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
		TypeAccess typeAccess = definition.getType();
		if (typeAccess == null) {
			typeAccess = JavaFactory.eINSTANCE.createTypeAccess();
			definition.setType(typeAccess);
		} else {
			final Type type = typeAccess.getType();
			if (type != null) {
				return type;
			}
		}
		final Type type = MoDiscoUtil.getJavaLangObject(model);
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
		final TypeAccess mAccess = mfDefinition.getType();
		if (mAccess != null) {
			final Type mType = mAccess.getType();
			if (mType != null) {
				for (final MSignature signature : mName.getMSignatures()) {
					final MFieldSignature fieldSignature = (MFieldSignature) signature;
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
