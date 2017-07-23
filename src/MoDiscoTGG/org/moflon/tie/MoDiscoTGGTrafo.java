package MoDiscoTGG.org.moflon.tie;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.Optional;

import org.apache.log4j.BasicConfigurator;
import org.moflon.tgg.algorithm.configuration.Configurator;
import org.moflon.tgg.algorithm.configuration.RuleResult;
import org.moflon.tgg.algorithm.datastructures.PrecedenceInputGraph;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.ParameterizedType;

import MoDiscoTGG.MoDiscoTGGPackage;

public class MoDiscoTGGTrafo extends SynchronizationHelper {
	private static final NumberFormat numberFormat;
	static {
		numberFormat = NumberFormat.getInstance();
		numberFormat.setMaximumFractionDigits(3);
		numberFormat.setMinimumFractionDigits(3);
	}

	public MoDiscoTGGTrafo() {
		super(MoDiscoTGGPackage.eINSTANCE, ".");
	}

	public static void main(String[] args) throws IOException {
		// Set up logging
		BasicConfigurator.configure();

		MoDiscoTGGTrafo helper;

		// Forward Transformation
		helper = new MoDiscoTGGTrafo();
//		helper.setVerbose(true);
		long start = System.nanoTime();
		helper.performForward("instances/src.xmi");
		long end = System.nanoTime();
		System.out.println("fwd took " + numberFormat.format((end - start) / 1000000000.0));

		// Backward Transformation
		helper = new MoDiscoTGGTrafo();
//		helper.setVerbose(true);
		helper.setConfigurator(new Configurator() {
			@Override
			public RuleResult chooseOne(Collection<RuleResult> alternatives) {
				Optional<RuleResult> modifierRule = alternatives.stream().filter(rr->rr.getRule().contains("Modifier")).findAny();
				if (modifierRule.isPresent()){
					return modifierRule.get();
				}
				return Configurator.super.chooseOne(alternatives);
			}
		});
		start = System.nanoTime();
		helper.performBackward("instances/trg.xmi");
		end = System.nanoTime();
		System.out.println("bwd took " + numberFormat.format((end - start) / 1000000000.0));
	}

	public void performForward() {
		integrateForward();

		saveTrg("instances/fwd.trg.xmi");
		saveCorr("instances/fwd.corr.xmi");
		saveSynchronizationProtocol("instances/fwd.protocol.xmi");

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
			System.err.println("Unable to load " + source + ", " + iae.getMessage());
			return;
		}
	}

	public void performBackward() {
		integrateBackward();

		performBackwardPost();
		
		saveSrc("instances/bwd.trg.xmi");
		saveCorr("instances/bwd.corr.xmi");
		saveSynchronizationProtocol("instances/bwd.protocol.xmi");

		System.out.println("Completed backward transformation!");
	}

	private void performBackwardPost() {
		if (src==null)
			return;
		TreeIterator<Object> allProperContents = EcoreUtil.getAllProperContents(src, true);
		while(allProperContents.hasNext()) {
			Object next = allProperContents.next();
			if (next instanceof ParameterizedType) {
				((Model)src).getOrphanTypes().add((ParameterizedType)next);
			}
		}
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
			System.err.println("Unable to load " + target + ", " + iae.getMessage());
			return;
		}
	}
}