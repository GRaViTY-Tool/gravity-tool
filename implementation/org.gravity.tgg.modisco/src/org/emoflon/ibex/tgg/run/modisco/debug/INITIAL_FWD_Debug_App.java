package org.emoflon.ibex.tgg.run.modisco.debug;

import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

import org.emoflon.ibex.tgg.operational.monitoring.IVictoryDataProvider;
import org.emoflon.ibex.tgg.operational.monitoring.VictoryDataProvider;
import org.emoflon.ibex.tgg.ui.debug.core.IbexDebugUI;
import org.emoflon.ibex.tgg.ui.debug.options.IBeXOp;

import org.emoflon.ibex.tgg.run.modisco.INITIAL_FWD_App;

public class INITIAL_FWD_Debug_App extends INITIAL_FWD_App {

	public INITIAL_FWD_Debug_App() throws IOException {
		super();
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);

		logger.info("Starting INITIAL_FWD_Debug");
		long tic = System.currentTimeMillis();
		INITIAL_FWD_Debug_App init_fwd = new INITIAL_FWD_Debug_App();
		long toc = System.currentTimeMillis();
		logger.info("Completed init for INITIAL_FWD_Debug in: " + (toc - tic) + " ms");
		
		IVictoryDataProvider dataProvider = new VictoryDataProvider(init_fwd);
		IbexDebugUI ui = IbexDebugUI.create(dataProvider, IBeXOp.INITIAL_FWD);
		
		new Thread(() -> {
		
		    ui.getIbexController().register(init_fwd);
		
		    try {
				logger.info("Starting INITIAL_FWD_Debug");
				long runTic = System.currentTimeMillis();
				init_fwd.forward();
				long runToc = System.currentTimeMillis();
				logger.info("Completed INITIAL_FWD_Debug in: " + (runToc - runTic) + " ms");
		
				init_fwd.saveModels();
				init_fwd.terminate();
			} catch (IOException pIOE) {
				logger.error("INITIAL_FWD_Debug threw an IOException", pIOE);
		    }
		}, "IBeX main thread").start();
		
		ui.run();
	}
	
}
