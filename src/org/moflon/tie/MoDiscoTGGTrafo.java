package org.moflon.tie;

import java.io.IOException;
import java.util.Collection;

import org.apache.log4j.BasicConfigurator;
import org.moflon.tgg.algorithm.configuration.Configurator;
import org.moflon.tgg.algorithm.configuration.RuleResult;
import org.moflon.tgg.algorithm.datastructures.PrecedenceInputGraph;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;

import org.eclipse.emf.ecore.EObject;
import MoDiscoTGG.MoDiscoTGGPackage;


public class MoDiscoTGGTrafo extends SynchronizationHelper{

   public MoDiscoTGGTrafo()
   {
      super(MoDiscoTGGPackage.eINSTANCE, ".");
   }

	public static void main(String[] args) throws IOException {
		// Set up logging
        BasicConfigurator.configure();

		// Forward Transformation
        MoDiscoTGGTrafo helper = new MoDiscoTGGTrafo();
//		helper.performForward("instances/simple/fwd.src.xmi");
		
		// Backward Transformation
		helper = new MoDiscoTGGTrafo();
		helper.performBackward("instances/simple/simple.uml");
	}

	public void performForward() {
		integrateForward();

		saveTrg("instances/simple/fwd.trg.xmi");
		saveCorr("instances/simple/fwd.corr.xmi");
		saveSynchronizationProtocol("instances/simple/fwd.protocol.xmi");

		System.out.println("Completed forward transformation!");
	}

	public void performForward(EObject srcModel) {
		setSrc(srcModel);
		performForward();
	}

	public void performForward(String source) {
		try {
			loadSrc(source);
			performForward();
		} catch (IllegalArgumentException iae) {
			System.err.println("Unable to load " + source + ", "
					+ iae.getMessage());
			return;
		}
	}

	public void performBackward() {
		integrateBackward();

		saveSrc("instances/simple/bwd.trg.xmi");
		saveCorr("instances/simple/bwd.corr.xmi");
		saveSynchronizationProtocol("instances/simple/bwd.protocol.xmi");

		System.out.println("Completed backward transformation!");
	}

	public void performBackward(EObject targetModel) {
		setTrg(targetModel);
		performBackward();
	}

	public void performBackward(String target) {
		try {
			loadTrg(target);
			performBackward();
		} catch (IllegalArgumentException iae) {
			System.err.println("Unable to load " + target + ", "
					+ iae.getMessage());
			return;
		}
	}
}