package org.emoflon.ibex.tgg.run.uml.debug;

import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

import org.emoflon.ibex.tgg.operational.monitoring.IVictoryDataProvider;
import org.emoflon.ibex.tgg.operational.monitoring.VictoryDataProvider;
import org.emoflon.ibex.tgg.ui.debug.core.IbexDebugUI;
import org.emoflon.ibex.tgg.ui.debug.options.IBeXOp;

import org.emoflon.ibex.tgg.run.uml.INITIAL_BWD_App;

public class INITIAL_BWD_Debug_App extends INITIAL_BWD_App {

	public INITIAL_BWD_Debug_App() throws IOException {
		super();
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);

		logger.info("Starting INITIAL_BWD_Debug");
		long tic = System.currentTimeMillis();
		INITIAL_BWD_Debug_App init_bwd = new INITIAL_BWD_Debug_App();
		long toc = System.currentTimeMillis();
		logger.info("Completed init for INITIAL_BWD_Debug in: " + (toc - tic) + " ms");
		
		IVictoryDataProvider dataProvider = new VictoryDataProvider(init_bwd);
		IbexDebugUI ui = IbexDebugUI.create(dataProvider, IBeXOp.INITIAL_BWD);
		
		new Thread(() -> {
		
		    ui.getIbexController().register(init_bwd);
		
		    try {
				logger.info("Starting INITIAL_BWD_Debug");
				long runTic = System.currentTimeMillis();
				init_bwd.backward();
				long runToc = System.currentTimeMillis();
				logger.info("Completed INITIAL_BWD_Debug in: " + (runToc - runTic) + " ms");
		
				init_bwd.saveModels();
				init_bwd.terminate();
			} catch (IOException pIOE) {
				logger.error("INITIAL_BWD_Debug threw an IOException", pIOE);
		    }
		}, "IBeX main thread").start();
		
		ui.run();
	}
	
}
