package org.gravity.modisco.processing.fwd;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;
import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MName;
import org.gravity.modisco.MSignature;
import org.gravity.modisco.processing.IMoDiscoProcessor;

/**
 * This class contains the preprocessings of implemented signatures
 * 
 * @author speldszus
 *
 */
public class ImplementedSignaturesPreprocessing implements IMoDiscoProcessor {

	/**
	 * The logger of this class
	 */
	private static final Logger LOGGER = Logger.getLogger(ImplementedSignaturesPreprocessing.class);

	/**
	 * Adds implementedBy edge from Classes to Signatures if the classes contain
	 * according definitions
	 * 
	 * @param model The model which should be preprocessed
	 * @param monitor A progress monitor
	 */
	
	@Override
	public boolean process(MGravityModel model, IProgressMonitor monitor) {
		HashMap<MSignature, Collection<AbstractTypeDeclaration>> mapping = new HashMap<>();
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
		if (monitor.isCanceled()) {
			return false;
		}
		return true;
	}
}
