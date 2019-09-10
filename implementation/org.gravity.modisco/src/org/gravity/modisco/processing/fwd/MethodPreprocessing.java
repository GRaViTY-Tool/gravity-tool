package org.gravity.modisco.processing.fwd;

import java.util.Collection;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gmt.modisco.java.SingleVariableDeclaration;
import org.eclipse.gmt.modisco.java.Type;
import org.gravity.modisco.MEntry;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MMethodName;
import org.gravity.modisco.MMethodSignature;
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
public class MethodPreprocessing extends AbstractTypedModiscoProcessor<MMethodDefinition> {

	private static final Logger LOGGER = Logger.getLogger(MethodPreprocessing.class);

	@Override
	public boolean process(MGravityModel model, Collection<MMethodDefinition> elements, IProgressMonitor monitor) {
		// Make all definitions directly accessible from the model
		model.getMMethodDefinitions().addAll(elements);
		model.getMAbstractMethodDefinitions().addAll(elements);

		// Create MMethodNames for MMethodDefinitions
		for (MMethodDefinition mDef : elements) {
			createMethodName(model, mDef);
		}
		// Create MMethodSignatures for MMethodNames
		for (MMethodName mName : model.getMMethodNames()) {
			for (MMethodDefinition mDef : mName.getMMethodDefinitions()) {
				if (!createMethodSignature(model, mName, mDef)) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Creates a new method signature element between the method name and definition if there isn't already one in the model
	 * 
	 * @param model The modisco model
	 * @param name The method name
	 * @param definition The method definition
	 * @return true, if the creation was successful
	 */
	private boolean createMethodSignature(MGravityModel model, MMethodName name, MMethodDefinition definition) {
		Type mSigReturnType = MoDiscoUtil.getMostGenericReturnType(definition);
		if (mSigReturnType == null) {
			LOGGER.log(Level.ERROR, "Couldn't find most geric return type for method definition:" + definition + ".");
			return false;
		}
		for (MMethodSignature mSig : name.getMMethodSignatures()) {
			if (mSigReturnType.equals(mSig.getReturnType())) {
				if (isParamListEqual(definition, mSig)) {
					mSig.getMMethodDefinitions().add(definition);
					mSig.getMDefinitions().add(definition);
					MEntry mFirstEntry = mSig.getMFirstEntry();
					EList<SingleVariableDeclaration> defParams = definition.getParameters();
					if (mFirstEntry != null) {
						mFirstEntry.getParameters().add((MSingleVariableDeclaration) defParams.get(0));
						for (int i = 1; i < mSig.getMEntrys().size(); i++) {
							mFirstEntry.getMNext().getParameters().add((MSingleVariableDeclaration) defParams.get(i));
						}
					}
					continue;
				}

			}
		}
		MMethodSignature mOldSig = definition.getMMethodSignature();
		if (mOldSig == null) {
			MMethodSignature mNewSig = ModiscoFactory.eINSTANCE.createMMethodSignature();
			name.getMSignatures().add(mNewSig);
			mNewSig.setMMethodName(name);
			mNewSig.getMMethodDefinitions().add(definition);
			mNewSig.setModel(model);
			mNewSig.setReturnType(mSigReturnType);
			mNewSig.getMDefinitions().add(definition);

			MoDiscoUtil.fillParamList(definition, mNewSig);
		}
		return true;
	}

	/**
	 * Creates a new method name element for the method definition in the model if
	 * there isn't already one
	 * 
	 * @param model      The modisco model
	 * @param definition The method definition
	 */
	private void createMethodName(MGravityModel model, MMethodDefinition definition) {
		MMethodName mName = null;
		for (MMethodName mMethodName : model.getMMethodNames()) {
			if (mMethodName.getMName().equals(definition.getName())) {
				mName = mMethodName;
				continue;
			}
		}
		if (mName != null) {
			mName.getMMethodDefinitions().add(definition);

		} else {
			mName = ModiscoFactory.eINSTANCE.createMMethodName();
			mName.setModel(model);
			model.getMNames().add(mName);
			mName.getMMethodDefinitions().add(definition);
			mName.setMName(definition.getName());
		}
	}

	/**
	 * Checks if the parameter list of the method definition and signature are equal
	 * 
	 * @param definition The method definition
	 * @param signature  The method signature
	 * @return true, if the parameter lists are equal
	 */
	private static boolean isParamListEqual(MMethodDefinition definition, MMethodSignature signature) {
		EList<SingleVariableDeclaration> parameters1 = definition.getParameters();
		EList<MEntry> parameters2 = signature.getMEntrys();
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
	public Class<MMethodDefinition> getSupportedType() {
		return MMethodDefinition.class;
	}
}
