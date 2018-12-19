package org.gravity.modisco.processing.fwd;

import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gmt.modisco.java.AnonymousClassDeclaration;
import org.eclipse.gmt.modisco.java.Modifier;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.TypeAccess;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;
import org.eclipse.gmt.modisco.java.emf.JavaFactory;
import org.gravity.eclipse.exceptions.ProcessingException;
import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MFieldName;
import org.gravity.modisco.MFieldSignature;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.ModiscoFactory;
import org.gravity.modisco.processing.IMoDiscoProcessor;

public class FieldPreprocessing implements IMoDiscoProcessor {

	private static final Logger LOGGER = Logger.getLogger(FieldPreprocessing.class);

	@Override
	public boolean process(MGravityModel model, IProgressMonitor monitor) {
		if (!resolveMultipleDeclarationsInOneStatement(model)) {
			return false;
		}
		if (!createFieldNameNodes(model)) {
			return false;
		}
		return createFieldSignatureNodes(model);
	}

	/**
	 * If multiple fields are declared in one statement a separate field is created
	 * for every declaration
	 * 
	 * @param model The MoDisco model
	 * @return true, iff no error occurred
	 */
	private boolean resolveMultipleDeclarationsInOneStatement(MGravityModel model) {
		List<MFieldDefinition> newDefs = new LinkedList<>();
		for (MFieldDefinition mDefinition : model.getMFieldDefinitions()) {

			EList<VariableDeclarationFragment> fragments = mDefinition.getFragments();
			if (fragments.size() == 0) {
				LOGGER.log(Level.ERROR, "Pattern matching in node [ActivityNode37] failed." + " Variables: "
						+ "[mDefinition] = " + mDefinition + ".");
				return false;
			}
			for (VariableDeclarationFragment scndDeclFragment : getOtherFragments(mDefinition, fragments.get(0))) {
				MFieldDefinition newDef = createNewDefinitionForFragment(mDefinition, scndDeclFragment);
				newDefs.add(newDef);
			}

		}
		model.getMFieldDefinitions().addAll(newDefs);
		return true;
	}

	/**
	 * Creates a new definition for the declaration fragment
	 * 
	 * @param oldDefiniton The old definition containing multiple variable declarations
	 * @param declFragment The declaration fragment which should be relocated
	 * @return The new definiton containing the declaration fragment
	 */
	private MFieldDefinition createNewDefinitionForFragment(MFieldDefinition oldDefiniton,
			VariableDeclarationFragment declFragment) {
		declFragment.setVariablesContainer(null);

		MFieldDefinition newDef = ModiscoFactory.eINSTANCE.createMFieldDefinition();
		newDef.getFragments().add(declFragment);
		newDef.setName(oldDefiniton.getName());
		newDef.setProxy(oldDefiniton.isProxy());
		newDef.setAbstractTypeDeclaration(oldDefiniton.getAbstractTypeDeclaration());

		TypeAccess oldTypeAccess = oldDefiniton.getType();
		if (oldTypeAccess != null) {
			Type type = oldTypeAccess.getType();
			if (type != null) {
				TypeAccess newTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
				newDef.setType(newTypeAccess);
				newTypeAccess.setType(type);
			}

		} else {
			LOGGER.log(Level.WARN, "The field \"" + oldDefiniton + "\" has no type!");
		}

		Modifier modifier = oldDefiniton.getModifier();
		Modifier clonedModifier = JavaFactory.eINSTANCE.createModifier();
		newDef.setModifier(clonedModifier);
		clonedModifier.setVisibility(modifier.getVisibility());
		clonedModifier.setInheritance(modifier.getInheritance());

		AnonymousClassDeclaration anno = oldDefiniton.getAnonymousClassDeclarationOwner();
		if (anno != null) {
			anno.getBodyDeclarations().add(newDef);
		}
		return newDef;
	}

	private static Iterable<VariableDeclarationFragment> getOtherFragments(MFieldDefinition mDefinition,
			VariableDeclarationFragment fragment) {
		LinkedList<VariableDeclarationFragment> result = new LinkedList<VariableDeclarationFragment>();
		if (mDefinition.getFragments().contains(fragment)) {
			for (VariableDeclarationFragment otherFragment : mDefinition.getFragments()) {
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
	private boolean createFieldNameNodes(MGravityModel model) {

		for (MFieldDefinition mfDefinition : model.getMFieldDefinitions()) {
			EList<VariableDeclarationFragment> fragments = mfDefinition.getFragments();
			if (fragments.size() == 0) {
				LOGGER.log(Level.ERROR, "The field \"" + mfDefinition + "\" has no fragment!");
				return false;
			}
			if (fragments.size() > 1) {
				LOGGER.log(Level.ERROR, "The field \"" + mfDefinition + "\" has more than one fragment!");
				return false;
			}
			VariableDeclarationFragment declFragment = fragments.get(0);
			MFieldName mName = null;
			String declFragmentName = declFragment.getName();
			for (MFieldName m : model.getMFieldNames()) {
				String mFieldName = m.getMName();
				if (mFieldName.equals(declFragmentName)) {
					mName = m;
				}

			}
			if (mName == null) {
				mName = ModiscoFactory.eINSTANCE.createMFieldName();
				model.getMNames().add(mName);
				model.getMFieldNames().add(mName);
				mName.setMName(declFragmentName);
			}
			mName.getMFieldDefinitions().add(mfDefinition);

		}
		return true;
	}

	/**
	 * Creates the MFieldSignature nodes in the MoDisco model
	 * 
	 * @param model The MoDisco model
	 * @return true, iff no error occurred
	 */
	private boolean createFieldSignatureNodes(MGravityModel model) {
		for (MFieldName name : model.getMFieldNames()) {
			for (MFieldDefinition mfDefinition : name.getMFieldDefinitions()) {
				MFieldSignature mSig;
				try {
					mSig = getMFieldSignature(model, name, mfDefinition);
				} catch (ProcessingException e) {
					return false;
				}
				if (mSig != null) {
					mSig.getMDefinitions().add(mfDefinition);
					mSig.getMFieldDefinitions().add(mfDefinition);
				} else {
					return false;
				}
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
	private static MFieldSignature createNewSignature(MGravityModel model, MFieldName name, MFieldDefinition definition)
			throws ProcessingException {
		MFieldSignature mSig;
		mSig = ModiscoFactory.eINSTANCE.createMFieldSignature();
		mSig.setMFieldName(name);
		name.getMSignatures().add(mSig);
		model.getMFieldSignatures().add(mSig);

		TypeAccess typeAccess = definition.getType();
		if (typeAccess != null) {
			Type type = typeAccess.getType();
			mSig.setType(type);
		} else {
			String message = "The field \"" + definition + "\" has no type!";
			if (definition.isProxy()) {
				LOGGER.log(Level.WARN, message);
			} else {
				LOGGER.log(Level.ERROR, message);
				throw new ProcessingException(message);
			}
		}
		return mSig;
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
	 * @throws ProcessingException If no signature can be found or created
	 */
	private static MFieldSignature getMFieldSignature(MGravityModel model, MFieldName mName,
			MFieldDefinition mfDefinition) throws ProcessingException {
		TypeAccess mAccess = mfDefinition.getType();
		if (mAccess != null) {
			Type mType = mAccess.getType();
			if (mType != null) {
				for (MFieldSignature mSig : mName.getMFieldSignatures()) {
					if (mType.equals(mSig.getType())) {
						return mSig;
					}
				}
			}

		}

		return createNewSignature(model, mName, mfDefinition);
	}
}
