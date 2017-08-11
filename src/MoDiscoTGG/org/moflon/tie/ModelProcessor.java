package MoDiscoTGG.org.moflon.tie;

import java.io.File;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration;
import org.eclipse.gmt.modisco.java.AnonymousClassDeclaration;
import org.eclipse.gmt.modisco.java.Block;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.Javadoc;
import org.eclipse.gmt.modisco.java.MethodDeclaration;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.ParameterizedType;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.TypeDeclaration;
import org.eclipse.gmt.modisco.java.TypeParameter;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Package;
import org.moflon.core.utilities.eMoflonEMFUtil;
import org.moflon.tgg.language.algorithm.TempOutputContainer;

import MoDiscoTGG.MoDiscoTGGPackage;

public class ModelProcessor {

	private static NumberFormat numberFormat;

	private static void init() {
		EPackage corrPackage = MoDiscoTGGPackage.eINSTANCE;
		corrPackage.getName();
		corrPackage.eResource();
		numberFormat = NumberFormat.getInstance();
		numberFormat.setMaximumFractionDigits(3);
		numberFormat.setMinimumFractionDigits(3);
	}

	public static void main(String[] args) {
		boolean forceSrc = false;
		boolean forceTrg = false;
		boolean ignoreSrc = false;
		boolean ignoreTrg = false;
		boolean deletebody = true;
		for (String arg : args) {
			switch (arg.toLowerCase()) {
			case "ignoresrc":
				ignoreSrc = true;
				break;
			case "ignoretrg":
				ignoreTrg = true;
				break;
			case "foresrc":
				forceSrc = true;
				break;
			case "forcetrg":
				forceTrg = true;
				break;
			case "force":
				forceSrc = true;
				forceTrg = true;
				break;
			case "keepbody":
				deletebody = false;
				break;
			}
		}
		init();

		ModelProcessor mp = new ModelProcessor();

		File instanceDirectory = new File("instances");
		for (File modelFolder : instanceDirectory.listFiles()) {
			if (modelFolder.isDirectory()) {
				ResourceSet rs = eMoflonEMFUtil.createDefaultResourceSet();
				System.out.println("processing " + modelFolder.getName());
				if (!ignoreSrc
						&& (forceSrc || modelFolder.listFiles((f, n) -> n.equals("src_processed.xmi")).length < 1)) {
					File[] srcFiles = modelFolder.listFiles((f, n) -> n.equals("src.xmi"));
					if (srcFiles.length == 1) {
						try {
							System.out.println("preforming preprocessing for source model...");
							long start = System.nanoTime();
							Resource r = rs.getResource(URI.createFileURI(srcFiles[0].getAbsolutePath()), true);
							mp.performForwardPre(r.getContents().get(0), deletebody);
							System.out.println("saving processed source model...");
							r.setURI(URI.createFileURI(modelFolder.getAbsolutePath() + "/src_processed.xmi"));
							r.save(null);
							long end = System.nanoTime();
							System.out.println("source model processing completed in "
									+ numberFormat.format((end - start) / 1_000_000_000d));

						} catch (Exception e) {
							System.out.println("proprocessing for source model failed:");
							e.printStackTrace();
						}
					}
				}

				if (!ignoreTrg
						&& (forceTrg || modelFolder.listFiles((f, n) -> n.equals("trg_processed.xmi")).length < 1)) {
					File[] srcFiles = modelFolder.listFiles((f, n) -> n.equals("trg.xmi"));
					if (srcFiles.length == 1) {
						try {
							System.out.println("preforming preprocessingfor target model...");
							long start = System.nanoTime();
							Resource r = rs.getResource(URI.createFileURI(srcFiles[0].getAbsolutePath()), true);
							mp.performBackwardPre(r.getContents().get(0));
							System.out.println("saving processed target model...");
							r.setURI(URI.createFileURI(modelFolder.getAbsolutePath() + "/trg_processed.xmi"));
							r.save(null);
							long end = System.nanoTime();
							System.out.println("target model processing completed in "
									+ numberFormat.format((end - start) / 1_000_000_000d));
						} catch (Exception e) {
							System.out.println("proprocessing for target model failed:");
							e.printStackTrace();
						}
					}
				}
			}
		}
	}

	public ModelProcessor() {

	}

	public void performForwardPre(EObject src) {
		performForwardPre(src, false);
	}

	public void performForwardPre(EObject src, boolean deleteBody) {
		List<org.eclipse.gmt.modisco.java.Package> packages = new ArrayList<>();
		List<EObject> deletes = new ArrayList<>();
		List<EObject> optionalDeletes = new ArrayList<>();

		TreeIterator<Object> allProperContents = EcoreUtil.getAllProperContents(src, true);
		while (allProperContents.hasNext()) {
			Object next = allProperContents.next();
			if (next instanceof org.eclipse.gmt.modisco.java.Package) {
				packages.add((org.eclipse.gmt.modisco.java.Package) next);
			} else if (next instanceof AnonymousClassDeclaration) {
				deletes.add((AnonymousClassDeclaration) next);
			} else if (next instanceof Block) {
//				if (((Block) next).eContainer() instanceof AbstractMethodDeclaration)
					optionalDeletes.add((Block) next);
			} else if (next instanceof Javadoc) {
				optionalDeletes.add((Javadoc) next);
			} else if (next instanceof TypeParameter) {
				deletes.add((TypeParameter) next);
			}
		}
		deletes.forEach(e -> EcoreUtil.delete(e, true));
		packages.forEach(this::removeNestedParameterizedTypes);
		if (deleteBody) {
			optionalDeletes.forEach(e -> EcoreUtil.delete(e, true));
		}
	}

	public void performBackwardPre(EObject trg) {
		List<Package> packages = new ArrayList<>();
		List<Class> anonymousClasses = new ArrayList<>();

		TreeIterator<Object> allProperContents = EcoreUtil.getAllProperContents(trg, true);
		while (allProperContents.hasNext()) {
			Object next = allProperContents.next();
			if (next instanceof Package) {
				packages.add((Package) next);
			} else if (next instanceof Class && "Anonymous type".equals(((Class) next).getName())) {
				anonymousClasses.add((Class) next);
			}
		}
		anonymousClasses.forEach(e -> EcoreUtil.delete(e, true));
		packages.forEach(this::removeNestedParameterizedElements);
	}

	public void performBackwardPost(EObject src) {
		if (src == null)
			return;
		TreeIterator<Object> allProperContents = EcoreUtil.getAllProperContents(src, true);
		Model m = null;
		if (src instanceof Model) {
			m = (Model) src;
		} else if (src instanceof TempOutputContainer) {
			m = ((Model) ((TempOutputContainer) src).getPotentialRoots().stream().filter(e -> e instanceof Model)
					.findAny().get());
		}
		if (m == null)
			return;
		List<Type> parameterizedTypes = new ArrayList<>();
		while (allProperContents.hasNext()) {
			Object next = allProperContents.next();
			if (next instanceof ParameterizedType) {
				parameterizedTypes.add((Type) next);
			}
		}
		m.getOrphanTypes().addAll(parameterizedTypes);
		if (src instanceof TempOutputContainer) {
			if (((TempOutputContainer) src).getPotentialRoots().size() == 1) {
				src = ((TempOutputContainer) src).getPotentialRoots().get(0);
			}
		}
	}

	private void removeNestedParameterizedTypes(org.eclipse.gmt.modisco.java.Package p) {
		p.getOwnedElements().stream().flatMap(e -> findNestedParameterizedTypes(e, 2))
				.forEach(c -> EcoreUtil.delete(c, true));
	}

	private Stream<BodyDeclaration> findNestedParameterizedTypes(BodyDeclaration t, int i) {
		if (i <= 0 && t instanceof ParameterizedType) {
			return Stream.of(t);
		}

		if (t instanceof TypeDeclaration) {
			return ((TypeDeclaration) t).getBodyDeclarations().stream()
					.flatMap(c -> findNestedParameterizedTypes(c, i - 1));
		}
		return null;
	}

	private void removeNestedParameterizedElements(Package p) {
		p.allOwnedElements().stream().flatMap(e -> findNestedParameterizedElements(e, 2))
				.forEach(c -> EcoreUtil.delete(c, true));
	}

	private Stream<Element> findNestedParameterizedElements(Element e, int i) {
		if (i <= 0) {
			if (e instanceof Classifier && ((Classifier) e).getOwnedTemplateSignature() != null) {
				return Stream.of(e);
			}
		}
		if (e instanceof Class) {
			return ((Class) e).getNestedClassifiers().stream().flatMap(c -> findNestedParameterizedElements(c, i - 1));
		}
		if (e instanceof Interface) {
			return ((Interface) e).getNestedClassifiers().stream()
					.flatMap(c -> findNestedParameterizedElements(c, i - 1));
		}
		return null;
	}
}
