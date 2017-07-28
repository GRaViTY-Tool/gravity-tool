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
		System.out.println("performing forward preprocessing...");
		performForwardPre();
		System.out.println("performing forward transformation...");
		integrateForward();

		System.out.println("saving results...");
		saveSrc("instances/fwd_processed.xmi");
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
	
	private void performForwardPre() {
		List<org.eclipse.gmt.modisco.java.Package> packages = new ArrayList<>();
		List<ArrayType> arrayTypes = new ArrayList<>();
		List<AnonymousClassDeclaration> anonymousClassDeclarations = new ArrayList<>();
		
		TreeIterator<Object> allProperContents = EcoreUtil.getAllProperContents(src, true);
		while(allProperContents.hasNext()) {
			Object next = allProperContents.next();
			if (next instanceof org.eclipse.gmt.modisco.java.Package) {
				packages.add((org.eclipse.gmt.modisco.java.Package) next);
			} else if (next instanceof ArrayType) {
				arrayTypes.add((ArrayType) next);
			} else if (next instanceof AnonymousClassDeclaration) {
				anonymousClassDeclarations.add((AnonymousClassDeclaration) next);
			}
		}
		anonymousClassDeclarations.forEach(e->EcoreUtil.delete(e, true));
		arrayTypes.forEach(e->EcoreUtil.delete(e, true));
		packages.forEach(this::removeNestedParameterizedTypes);
	}

	private void removeNestedParameterizedTypes(org.eclipse.gmt.modisco.java.Package p) {
		p.getOwnedElements().stream().flatMap(e->findNestedParameterizedTypes(e,2)).forEach(c->EcoreUtil.delete(c, true));
	}
	

	private Stream<BodyDeclaration> findNestedParameterizedTypes(BodyDeclaration t, int i) {
		if (i<=0 && t instanceof ParameterizedType) {
			return Stream.of(t);
		}
		
		if (t instanceof TypeDeclaration) {
			return ((TypeDeclaration)t).getBodyDeclarations().stream().flatMap(c->findNestedParameterizedTypes(c, i-1));
		}
		return null;
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
		System.out.println("performing backward preprocessing...");
		performBackwardPre();
		System.out.println("performing backward transformation...");
		integrateBackward();
		System.out.println("performing backward postprocessing...");
		performBackwardPost();
		
		System.out.println("saving results");
		saveTrg("instances/bwd_processed.xmi");
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

	private void performBackwardPre() {
		List<Package> packages = new ArrayList<>();
		List<Class> anonymousClasses = new ArrayList<>();
		
		System.out.println("searching...");
		TreeIterator<Object> allProperContents = EcoreUtil.getAllProperContents(trg, true);
		while(allProperContents.hasNext()) {
			Object next = allProperContents.next();
			if (next instanceof Package) {
				packages.add((Package) next);
			} else if (next instanceof Class && "Anonymous type".equals(((Class) next).getName())) {
				anonymousClasses.add((Class) next);
			}
		}
		System.out.println("deleting");
		System.out.println(anonymousClasses.size());
		anonymousClasses.forEach(e->EcoreUtil.delete(e, true));
		packages.forEach(this::removeNestedParameterizedElements);
	}

	private void removeNestedParameterizedElements(Package p) {
		p.allOwnedElements().stream().flatMap(e->findNestedParameterizedElements(e,2)).forEach(c->EcoreUtil.delete(c, true));
	}
	

	private Stream<Element> findNestedParameterizedElements(Element e, int i) {
		if (i<=0) {
			if (e instanceof Classifier && ((Classifier)e).getOwnedTemplateSignature()!=null) {
				return Stream.of(e);
			}
		}
		if (e instanceof Class) {
			return ((Class)e).getNestedClassifiers().stream().flatMap(c->findNestedParameterizedElements(c, i-1));
		}
		if (e instanceof Interface) {
			return ((Interface)e).getNestedClassifiers().stream().flatMap(c->findNestedParameterizedElements(c, i-1));
		}
		return null;
	}

	private void performBackwardPost() {
		if (src==null)
			return;
		TreeIterator<Object> allProperContents = EcoreUtil.getAllProperContents(src, true);
		Model m = null;
		if (src instanceof Model) {
			m = (Model) src;
		} else if (src instanceof TempOutputContainer) {
			m = ((Model)((TempOutputContainer)src).getPotentialRoots().stream().filter(e->e instanceof Model).findAny().get());
		}
		if (m==null)
			return;
		List<Type> parameterizedTypes = new ArrayList<>();
		while(allProperContents.hasNext()) {
			Object next = allProperContents.next();
			if (next instanceof ParameterizedType) {
				parameterizedTypes.add((Type) next);
			}
		}
		m.getOrphanTypes().addAll(parameterizedTypes);
		if (src instanceof TempOutputContainer) {
			if (((TempOutputContainer) src).getPotentialRoots().size()==1) {
				src = ((TempOutputContainer) src).getPotentialRoots().get(0);
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