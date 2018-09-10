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
				scndDeclFragment.setVariablesContainer(null);

				MFieldDefinition newDef = ModiscoFactory.eINSTANCE.createMFieldDefinition();
				newDef.getFragments().add(scndDeclFragment);
				newDefs.add(newDef);
				newDef.setName(mDefinition.getName());
				newDef.setProxy(mDefinition.isProxy());
				newDef.setAbstractTypeDeclaration(mDefinition.getAbstractTypeDeclaration());

				TypeAccess oldTypeAccess = mDefinition.getType();
				if (oldTypeAccess != null) {
					Type type = oldTypeAccess.getType();
					if (type != null) {
						TypeAccess newTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
						newDef.setType(newTypeAccess);
						newTypeAccess.setType(type);
					}

				} else {
					LOGGER.log(Level.WARN, "The field \"" + mDefinition + "\" has no type!");
				}

				Modifier modifier = mDefinition.getModifier();
				Modifier clonedModifier = JavaFactory.eINSTANCE.createModifier();
				newDef.setModifier(clonedModifier);
				clonedModifier.setVisibility(modifier.getVisibility());
				clonedModifier.setInheritance(modifier.getInheritance());

				AnonymousClassDeclaration anno = mDefinition.getAnonymousClassDeclarationOwner();
				if (anno != null) {
					anno.getBodyDeclarations().add(newDef);
				}
			}

		}
		model.getMFieldDefinitions().addAll(newDefs);
		return true;
	}

	private static final Iterable<VariableDeclarationFragment> getOtherFragments(MFieldDefinition mDefinition,
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
		for (MFieldName mName : model.getMFieldNames()) {
			for (MFieldDefinition mfDefinition : mName.getMFieldDefinitions()) {
				MFieldSignature mSig = getMFieldSignature(mName, mfDefinition);
				if (mSig != null) {
					mSig.getMDefinitions().add(mfDefinition);
					mSig.getMFieldDefinitions().add(mfDefinition);

				} else {
					mSig = ModiscoFactory.eINSTANCE.createMFieldSignature();
					mSig.setMFieldName(mName);
					mSig.getMDefinitions().add(mfDefinition);
					mSig.getMFieldDefinitions().add(mfDefinition);
					mName.getMSignatures().add(mSig);
					model.getMFieldSignatures().add(mSig);

					TypeAccess typeAccess = mfDefinition.getType();
					if (typeAccess != null) {
						Type type = typeAccess.getType();
						mSig.setType(type);
					} 
					else if (mfDefinition.isProxy()) {
						LOGGER.log(Level.WARN, "The field \"" + mfDefinition + "\" has no type!");
					} else {
						LOGGER.log(Level.ERROR, "The field \"" + mfDefinition + "\" has no type!");
						return false;
					}
				}
			}
		}
		return true;
	}

	private static final MFieldSignature getMFieldSignature(MFieldName mName, MFieldDefinition mfDefinition) {
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

		return null;
	}
}
