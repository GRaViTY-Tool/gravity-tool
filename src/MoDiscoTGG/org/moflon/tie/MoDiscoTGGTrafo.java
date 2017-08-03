package MoDiscoTGG.org.moflon.tie;

import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import org.apache.log4j.BasicConfigurator;
import org.moflon.core.utilities.eMoflonEMFUtil;
import org.moflon.tgg.algorithm.configuration.Configurator;
import org.moflon.tgg.algorithm.configuration.RuleResult;
import org.moflon.tgg.algorithm.datastructures.PrecedenceInputGraph;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;
import org.moflon.tgg.language.algorithm.TempOutputContainer;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmt.modisco.java.AnonymousClassDeclaration;
import org.eclipse.gmt.modisco.java.ArrayType;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.ParameterizedType;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.TypeDeclaration;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Package;

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
		helper.performForward("instances/src_processed.xmi");
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
		helper.performBackward("instances/trg_processed.xmi");
		end = System.nanoTime();
		System.out.println("bwd took " + numberFormat.format((end - start) / 1000000000.0));
	}

	public void performForward() {
		ModelProcessor mp = new ModelProcessor();
		mp.performForwardPre(src);
		
		System.out.println("performing forward transformation...");
		integrateForward();

		System.out.println("saving results...");
		saveTrg("instances/fwd.trg.xmi");
		saveCorr("instances/fwd.corr.xmi");
		saveSynchronizationProtocol("instances/fwd.protocol.xmi");
		Resource r  = set.createResource(URI.createFileURI(new File("instances/fwdTempOutput.xmi").getAbsolutePath()));
		r.getContents().add(tempOutputContainer);
		try {
			r.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
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
		System.out.println("performing backward transformation...");
		integrateBackward();
		System.out.println("performing backward postprocessing...");
		m.performBackwardPost(src);
		
		System.out.println("saving results");
		saveSrc("instances/bwd.trg.xmi");
		saveCorr("instances/bwd.corr.xmi");
		saveSynchronizationProtocol("instances/bwd.protocol.xmi");
		
		Resource r  = set.createResource(URI.createFileURI(new File("instances/bwdTempOutput.xmi").getAbsolutePath()));
		r.getContents().add(tempOutputContainer);
		try {
			r.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
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