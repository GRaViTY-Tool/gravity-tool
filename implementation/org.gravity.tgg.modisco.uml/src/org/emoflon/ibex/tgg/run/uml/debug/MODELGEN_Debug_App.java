package org.emoflon.ibex.tgg.run.uml.debug;

import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

import org.emoflon.ibex.tgg.operational.monitoring.IVictoryDataProvider;
import org.emoflon.ibex.tgg.operational.monitoring.VictoryDataProvider;
import org.emoflon.ibex.tgg.ui.debug.core.IbexDebugUI;
import org.emoflon.ibex.tgg.ui.debug.options.IBeXOp;

import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.run.uml.MODELGEN_App;

public class MODELGEN_Debug_App extends MODELGEN_App {

	public MODELGEN_Debug_App() throws IOException {
		super();
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);

		logger.info("Starting MODELGEN_Debug");
		long tic = System.currentTimeMillis();
		MODELGEN_Debug_App generator = new MODELGEN_Debug_App();
		long toc = System.currentTimeMillis();
		logger.info("Completed init for MODELGEN_Debug in: " + (toc - tic) + " ms");
		
		MODELGENStopCriterion stop = new MODELGENStopCriterion(generator.getTGG());
		generator.setStopCriterion(stop);
		
		IVictoryDataProvider dataProvider = new VictoryDataProvider(generator);
		IbexDebugUI ui = IbexDebugUI.create(dataProvider, IBeXOp.MODELGEN);
		
		new Thread(() -> {
		
		    ui.getIbexController().register(generator);
		
		    try {
				logger.info("Starting MODELGEN_Debug");
				long runTic = System.currentTimeMillis();
				generator.run();
				long runToc = System.currentTimeMillis();
				logger.info("Completed MODELGEN_Debug in: " + (runToc - runTic) + " ms");
		
				generator.saveModels();
				generator.terminate();
		    } catch (IOException pIOE) {
				logger.error("MODELGEN_Debug threw an IOException", pIOE);
		    }
		}, "IBeX main thread").start();
		
		ui.run();
	}
	
}
