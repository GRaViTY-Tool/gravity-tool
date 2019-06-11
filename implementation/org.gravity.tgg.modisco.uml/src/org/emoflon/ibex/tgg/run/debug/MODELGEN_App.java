package org.emoflon.ibex.tgg.run.debug;

import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.monitoring.IVictoryDataProvider;
import org.emoflon.ibex.tgg.operational.monitoring.VictoryDataProvider;
import org.emoflon.ibex.tgg.ui.debug.core.IbexDebugUI;

import language.TGG;

import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.run.uml._RegistrationHelper;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesTGGEngine;

public class MODELGEN_App extends MODELGEN {

	public MODELGEN_App() throws IOException {
		super(createIbexOptions());
		registerBlackInterpreter(new DemoclesTGGEngine());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);

		logger.info("Starting MODELGEN");
		long tic = System.currentTimeMillis();
		MODELGEN_App generator = new MODELGEN_App();
		long toc = System.currentTimeMillis();
		logger.info("Completed init for MODELGEN in: " + (toc - tic) + " ms");
		
		TGG tgg = generator.getTGG();
		MODELGENStopCriterion stop = new MODELGENStopCriterion(tgg);
		generator.setStopCriterion(stop);
		
		IVictoryDataProvider dataProvider = new VictoryDataProvider(generator);
		IbexDebugUI ui = IbexDebugUI.create(dataProvider, false);
		
		new Thread(() -> {
		
		    ui.getIbexController().register(generator);
		
		    try {
				logger.info("Starting MODELGEN");
				long runTic = System.currentTimeMillis();
				generator.run();
				long runToc = System.currentTimeMillis();
				logger.info("Completed MODELGEN in: " + (runToc - runTic) + " ms");
		
				generator.saveModels();
				generator.terminate();
		    } catch (IOException pIOE) {
				logger.error("MODELGEN threw an IOException", pIOE);
		    }
		}).start();
		
		ui.run();
	}
	
	
	@Override
	protected void registerUserMetamodels() throws IOException {
		_RegistrationHelper.registerMetamodels(rs, this);
			
		// Register correspondence metamodel last
		loadAndRegisterCorrMetamodel(options.projectPath() + "/model/" + options.projectName() + ".ecore");
	}
	
	private static IbexOptions createIbexOptions() {
		return _RegistrationHelper.createIbexOptions();
	}
}
