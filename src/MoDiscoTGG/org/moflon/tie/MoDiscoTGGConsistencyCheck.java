package MoDiscoTGG.org.moflon.tie;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;

import MoDiscoTGG.MoDiscoTGGPackage;

public class MoDiscoTGGConsistencyCheck extends SynchronizationHelper {

	public MoDiscoTGGConsistencyCheck() {
		super(MoDiscoTGGPackage.eINSTANCE, ".");
	}

	public static void main(String[] args) throws IOException {
		// Set up logging
		BasicConfigurator.configure();

		String caseStudy = args[0];

		// Consistency Check
		MoDiscoTGGConsistencyCheck helper = new MoDiscoTGGConsistencyCheck();
		helper.loadSrc("instances/" + caseStudy + "/src.xmi");
		helper.loadTrg("instances/" + caseStudy + "/trg.uml");

		helper.createCorrespondences(true);

		 helper.saveSrc("instances/" + caseStudy + "/result/src.xmi");
		 helper.saveTrg("instances/" + caseStudy + "/result/trg.uml");
		 helper.saveCorr("instances/" + caseStudy + "/result/corr.xmi");
		 helper.saveConsistencyCheckProtocol("instances/" + caseStudy +
		 "/result/protocol.xmi");
		 helper.saveInconsistentSourceDelta("instances/" + caseStudy +
		 "/result/src.delta.xmi");
		 helper.saveInconsistentTargetDelta("instances/" + caseStudy +
		 "/result/trg.delta.xmi");
		

	}
}