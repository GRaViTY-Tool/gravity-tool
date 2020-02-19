package org.gravity.tgg.modisco;

import java.io.IOException;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.modisco.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.runtime.democles.DemoclesTGGEngine;
import org.gravity.eclipse.GravityActivator;

public class TGGApp extends SYNC {

	/**
	 * Create a new transformation application
	 *
	 * @param project The project which should be transformed
	 *
	 * @throws IOException If one of the models cannot be loaded
	 */
	public TGGApp(final IProject project) throws IOException {
		super(new RegistrationHelper().createIbexOptions().resourceHandler(new GravityPMResourceHandler(project)));
	}

	public static class RegistrationHelper implements IRegistrationHelper {
		
		@Override
		public void registerMetamodels(ResourceSet rs, IbexExecutable executable) throws IOException {
			
		}

		@Override
		public IbexOptions createIbexOptions() {
			final IbexOptions options = new IbexOptions();
			options.project.name("Modisco"); //$NON-NLS-1$
			options.project.path(MoDiscoTGGActivator.PLUGIN_ID);
			options.debug.ibexDebug(GravityActivator.getDefault().isVerbose());
			options.csp.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
			options.blackInterpreter(new DemoclesTGGEngine());
			options.registrationHelper(this);
			return options;
		}
	}
}
