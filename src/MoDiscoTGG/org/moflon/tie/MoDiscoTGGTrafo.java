package MoDiscoTGG.org.moflon.tie;

import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.Optional;
import java.util.Random;
import java.util.Set;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.java.Model;
import org.moflon.tgg.algorithm.configuration.Configurator;
import org.moflon.tgg.algorithm.configuration.RuleResult;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;

import MoDiscoTGG.MoDiscoTGGPackage;
import MoDiscoTGG.org.moflon.tie.delta.DeltaApplicator;
import MoDiscoTGG.org.moflon.tie.delta.DeltaResult;
import MoDiscoTGG.org.moflon.tie.delta.IndexedModel;

public class MoDiscoTGGTrafo extends SynchronizationHelper {
	private static final NumberFormat numberFormat;
	static {
		numberFormat = NumberFormat.getInstance();
		numberFormat.setMaximumFractionDigits(9);
		numberFormat.setMinimumFractionDigits(9);
	}

	public MoDiscoTGGTrafo() {
		super(MoDiscoTGGPackage.eINSTANCE, ".");
	}

	public static void main(String[] args) throws IOException {
		boolean forward = true;
		boolean backward = true;

		if (args.length > 0) {
			switch (args[0]) {
			case "forward":
			case "f":
				backward = false;
				break;
			case "backward":
			case "b":
				forward = false;
				break;
			}
		}
		// Set up logging
		BasicConfigurator.configure();

		MoDiscoTGGTrafo helper;
		if (forward) {
			// Forward Transformation
			helper = new MoDiscoTGGTrafo();
			// helper.setVerbose(true);
			helper.performForward("instances/src_processed.xmi");
			helper.performForwardSync(10);
		}

		if (backward) {
			// Backward Transformation
			helper = new MoDiscoTGGTrafo();
			// helper.setVerbose(true);
			helper.setConfigurator(new Configurator() {
				@Override
				public RuleResult chooseOne(Collection<RuleResult> alternatives) {
					Optional<RuleResult> modifierRule = alternatives.stream()
							.filter(rr -> rr.getRule().contains("Modifier")).findAny();
					if (modifierRule.isPresent()) {
						return modifierRule.get();
					}
					return Configurator.super.chooseOne(alternatives);
				}
			});
			helper.performBackward("instances/trg_processed.xmi");
			helper.performBackwardSync(10);
		}
	}

	DeltaResult lastDeltaResult;
	private void performBackwardSync(int size) {
		DeltaApplicator deltaApplicator = new DeltaApplicator(size);
		Set<Class<?>> backwardInterests = deltaApplicator.getBackwardInterests();
		setChangeTrg(e -> {
			lastDeltaResult = deltaApplicator.applyBackward(
					new IndexedModel<org.eclipse.uml2.uml.Model>((org.eclipse.uml2.uml.Model) e, backwardInterests.toArray(new Class[backwardInterests.size()])),
					new Random(0));
		});
		System.gc();
		long start = System.currentTimeMillis();
		integrateBackward();
		long end = System.currentTimeMillis();
		System.out.println("result\t\teMoflonOld\tsabwd\t " + numberFormat.format((end - start) / 1000000000.0)+"\t"+size);
		saveSrc("instances/srcAfterRAdd.xmi");
		saveTrg("instances/trgAfterRAdd.xmi");
		
		setChangeTrg(e->deltaApplicator.revert(lastDeltaResult));
		System.gc();
		start = System.currentTimeMillis();
		integrateBackward();
		end = System.currentTimeMillis();
		System.out.println("result\t\teMoflonOld\tsrfwd\t " + numberFormat.format((end - start) / 1000000000.0)+"\t"+size);
		saveSrc("instances/srcAfterRRemove.xmi");
		saveTrg("instances/trgAfterRRemove.xmi");
	}

	private void performForwardSync(int size) {
		DeltaApplicator deltaApplicator = new DeltaApplicator(size);
		Set<Class<?>> forwardInterests = deltaApplicator.getForwardInterests();
		setChangeSrc(e -> {
			lastDeltaResult = deltaApplicator.applyForward(
					new IndexedModel<Model>((Model) e, forwardInterests.toArray(new Class[forwardInterests.size()])),
					new Random(0));
		});
		System.gc();
		long start = System.currentTimeMillis();
		integrateForward();
		long end = System.currentTimeMillis();
		System.out.println("result\t\teMoflonOld\tsafwd\t " + numberFormat.format((end - start) / 1000000000.0)+"\t"+size);
		saveSrc("instances/srcAfterAdd.xmi");
		saveTrg("instances/trgAfterAdd.xmi");
		
		setChangeSrc(e->deltaApplicator.revert(lastDeltaResult));
		System.gc();
		start = System.currentTimeMillis();
		integrateForward();
		end = System.currentTimeMillis();
		System.out.println("result\t\teMoflonOld\tsrfwd\t " + numberFormat.format((end - start) / 1000000000.0)+"\t"+size);
		saveSrc("instances/srcAfterRemove.xmi");
		saveTrg("instances/trgAfterRemove.xmi");
	}

	public void performForward() {
		ModelProcessor mp = new ModelProcessor();
		mp.performForwardPre(src, true);

		System.out.println("performing forward transformation...");
		long start = System.nanoTime();
		integrateForward();
		long end = System.nanoTime();
		System.out.println("result\t\teMoflonOld\ttfwd\t " + numberFormat.format((end - start) / 1000000000.0));

		// System.out.println("saving results...");
		// saveSrc("instances/src_processed.xmi");
		// saveTrg("instances/fwd.trg.xmi");
		// saveCorr("instances/fwd.corr.xmi");
		// saveSynchronizationProtocol("instances/fwd.protocol.xmi");
		// Resource r = set.createResource(URI.createFileURI(new
		// File("instances/fwdTempOutput.xmi").getAbsolutePath()));
		// r.getContents().add(tempOutputContainer);
		// try {
		// r.save(null);
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

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
		ModelProcessor m = new ModelProcessor();
		m.performBackwardPre(trg);
		System.out.println("performing backward transformation...");
		long start = System.nanoTime();
		integrateBackward();
		long end = System.nanoTime();
		System.out.println("result\t\teMoflonOld\ttbwd\t " + numberFormat.format((end - start) / 1000000000.0));
		System.out.println("performing backward postprocessing...");
		m.performBackwardPost(src);

		// System.out.println("saving results");
		// saveSrc("instances/bwd.trg.xmi");
		// saveCorr("instances/bwd.corr.xmi");
		// saveSynchronizationProtocol("instances/bwd.protocol.xmi");
		//
		// Resource r = set.createResource(URI.createFileURI(new
		// File("instances/bwdTempOutput.xmi").getAbsolutePath()));
		// r.getContents().add(tempOutputContainer);
		// try {
		// r.save(null);
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

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
			System.err.println("Unable to load " + target + ", " + iae.getMessage());
			return;
		}
	}
}