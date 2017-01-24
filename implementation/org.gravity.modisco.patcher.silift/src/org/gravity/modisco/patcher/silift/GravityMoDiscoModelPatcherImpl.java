package org.gravity.modisco.patcher.silift;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.java.Model;
import org.gravity.modisco.GravityMoDiscoModelPatcher;
import org.gravity.modisco.MGravityModel;
import org.sidiff.difference.symmetric.execute.DifferenceExecutor;
import org.sidiff.difference.symmetric.execute.util.SiLiftUtil.DifferenceCalculationException;

public class GravityMoDiscoModelPatcherImpl implements GravityMoDiscoModelPatcher {

	public GravityMoDiscoModelPatcherImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(MGravityModel modisco1, MGravityModel modisco2) {
		update(modisco1.eResource(), modisco2.eResource());
	}

	@Override
	public void update(Model modisco1, Model modisco2) {
		update(modisco1.eResource(), modisco2.eResource());
	}

	private void update(Resource modelA, Resource modelB) {
		DifferenceExecutor differenceExecutor = null;
		try {
			differenceExecutor = new DifferenceExecutor(modelA, modelB);
			differenceExecutor.run();
			//differenceExecutor.save();

		} catch (DifferenceCalculationException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getDescription() {
		return "Utilzes the EMF Compare engine to collect matches";
	}

	@Override
	public String getName() {
		return "SiLift EMF Compare Patcher";
	}
}
