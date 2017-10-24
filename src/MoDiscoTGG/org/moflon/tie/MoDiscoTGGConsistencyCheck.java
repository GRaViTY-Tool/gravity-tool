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
		String path = System.getProperty("java.library.path");
		System.out.println(System.getProperty("PATH"));
		System.out.println("Java path: " + path);
		System.out.println(System.getenv());

		// Set up logging
		BasicConfigurator.configure();

		// Consistency Check
		MoDiscoTGGConsistencyCheck helper = new MoDiscoTGGConsistencyCheck();
		helper.loadSrc("instances/src_processed.xmi");
		helper.loadTrg("instances/trg_processed.xmi");

		helper.createCorrespondences(true);

		helper.saveSrc("instances/cc.src.xmi");
		helper.saveTrg("instances/cc.trg.uml");
		helper.saveCorr("instances/cc.corr.xmi");
		helper.saveConsistencyCheckProtocol("instances/cc.protocol.xmi");
		helper.saveInconsistentSourceDelta("instances/src.delta.xmi");
		helper.saveInconsistentTargetDelta("instances/result/trg.delta.xmi");

	}
}