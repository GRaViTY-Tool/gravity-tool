package org.gravity.tgg.uml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import org.apache.log4j.BasicConfigurator;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.DifferenceState;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.EMFCompare.Builder;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.Annotation;
import org.eclipse.gmt.modisco.java.AnnotationMemberValuePair;
import org.eclipse.gmt.modisco.java.AnnotationTypeMemberDeclaration;
import org.eclipse.gmt.modisco.java.ArrayInitializer;
import org.eclipse.gmt.modisco.java.ArrayType;
import org.eclipse.gmt.modisco.java.CompilationUnit;
import org.eclipse.gmt.modisco.java.Expression;
import org.eclipse.gmt.modisco.java.ImportDeclaration;
import org.eclipse.gmt.modisco.java.NamedElement;
import org.eclipse.gmt.modisco.java.Package;
import org.eclipse.gmt.modisco.java.StringLiteral;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.TypeAccess;
import org.eclipse.gmt.modisco.java.emf.JavaFactory;
import org.eclipse.gmt.modisco.java.generation.files.GenerateJavaExtended;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.ClasspathEntry;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.uml2.uml.Model;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.discovery.GravityModiscoProjectDiscoverer;
import org.gravity.tgg.modisco.uml.UmlPackage;
import org.moflon.tgg.algorithm.configuration.PGSavingConfigurator;
import org.moflon.tgg.algorithm.datastructures.SynchronizationProtocol;
import org.moflon.tgg.algorithm.datastructures.TripleMatch;
import org.moflon.tgg.algorithm.delta.Delta;
import org.moflon.tgg.algorithm.synchronization.BackwardSynchronizer;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;
import org.moflon.tgg.language.analysis.StaticAnalysis;
import org.moflon.tgg.runtime.CorrespondenceModel;
import org.moflon.tgg.runtime.EMoflonEdge;
import org.moflon.tgg.runtime.RuntimeFactory;

public class Transformation extends SynchronizationHelper {

	private static final String PROTOCOL_XMI = "protocol.xmi";
	private static final String SRC_XMI = "src.xmi";
	private static final String TRG_XMI = "trg.xmi";
	private static final String CORR_XMI = "corr.xmi";

	private Transformation(ResourceSet rs) throws MalformedURLException, IOException {
		BasicConfigurator.configure();

		set = rs;
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());

		setCorrPackage(UmlPackage.eINSTANCE);

		try (InputStream tgg_rules = new URL("platform:/plugin/org.gravity.tgg.modisco.uml/model/Uml.sma.xmi") //$NON-NLS-1$
				.openConnection().getInputStream()) {
			Resource tggRulesResource = this.set.createResource(URI.createURI("Uml.sma.xmi")); //$NON-NLS-1$
			tggRulesResource.load(tgg_rules, Collections.EMPTY_MAP);
			setRules((StaticAnalysis) tggRulesResource.getContents().get(0));
		}

		configurator = new PGSavingConfigurator(this, "pg.xmi");
		changeSrc = (root -> {
		});
		changeTrg = (root -> {
		});
	}

	/**
	 * Translates the given java project into an UML model
	 *  
	 * @param project The java project
	 * @param addUMLsec Iff the UMLsec annotations should be added to the java project
	 * @param monitor A progress monitor
	 * @return The UML model
	 * @throws DiscoveryException
	 * @throws CoreException
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static Model projectToModel(IJavaProject project, boolean addUMLsec, IProgressMonitor monitor)
			throws DiscoveryException, CoreException, FileNotFoundException, IOException {

		SubMonitor subMonitor = SubMonitor.convert(monitor, 100);
		
		IProject iproject = project.getProject();
		IFolder gravityFolder = iproject.getFolder(".gravity");
		if (!gravityFolder.exists()) {
			gravityFolder.create(true, true, monitor);
		}

		Collection<IPath> libs;
		if (!addUMLsec) {
			libs = new ArrayList<>();
		} else {
			subMonitor.setTaskName("Prepare Java Project");

			IClasspathEntry relativeLibraryEntry = null;
			IFile annotationsFile = gravityFolder.getFile("org.gravity.annotations.jar");
			if (!annotationsFile.exists()) {
				try (InputStream annotations = new URL(
						"platform:/plugin/org.gravity.security.annotations/org.gravity.annotations.jar") //$NON-NLS-1$
								.openConnection().getInputStream()) {
					annotationsFile.create(annotations, true, monitor);
				}
				relativeLibraryEntry = addLibToClasspath(project, annotationsFile);

			} else {
				for (IClasspathEntry entry : project.getRawClasspath()) {
					if (entry.getPath().makeAbsolute().equals(annotationsFile.getLocation())) {
						relativeLibraryEntry = entry;
					}
				}
				if (relativeLibraryEntry == null) {
					relativeLibraryEntry = addLibToClasspath(project, annotationsFile);
				}
			}
			libs = Arrays.asList(relativeLibraryEntry.getPath());
			
			subMonitor.setWorkRemaining(95);
		}
		subMonitor.setTaskName("Discover MoDiscoModel");

		GravityModiscoProjectDiscoverer discoverer = new GravityModiscoProjectDiscoverer();
		MGravityModel mGravityModel = discoverer.discoverMGravityModelFromProject(project, libs, subMonitor.split(25));
		Transformation trafo = new Transformation(discoverer.getResourceSet());

		trafo.setSrc(mGravityModel);
		trafo.saveSrc(gravityFolder.getFile(SRC_XMI).getLocation().toFile().getAbsolutePath());

		subMonitor.setTaskName("Transform MoDisco Model to UML Model");
		trafo.integrateForward();

		subMonitor.setTaskName("Postprocess UML Model");
		subMonitor.setWorkRemaining(15);
		Model model = (Model) trafo.getTrg();
		if (model == null) {
			throw new RuntimeException("Reverseengineering of a UML model failed.");
		}
		new UmlProcessor(model).processFwd();

		subMonitor.setTaskName("Save UML Model");
		subMonitor.setWorkRemaining(10);
		trafo.saveTrg(gravityFolder.getFile(TRG_XMI).getLocation().toFile().getAbsolutePath());
		trafo.saveTrg(iproject.getFile(iproject.getName() + ".uml").getLocation().toFile().getAbsolutePath());
		trafo.saveCorr(gravityFolder.getFile(CORR_XMI).getLocation().toFile().getAbsolutePath());
		trafo.saveSynchronizationProtocol(gravityFolder.getFile(PROTOCOL_XMI).getLocation().toFile().getAbsolutePath());

		iproject.refreshLocal(IResource.DEPTH_INFINITE, monitor);

		return model;
	}

	public static void umlToProject(IJavaProject project, IProgressMonitor monitor)
			throws FileNotFoundException, IOException, CoreException {
		Transformation trafo = new Transformation(new ResourceSetImpl());

		IProject iproject = project.getProject();
		IFolder gravityFolder = iproject.getFolder(".gravity");
		if (!gravityFolder.exists()) {
			return;
		}
		IFile corrFile = gravityFolder.getFile(CORR_XMI);
		if (!corrFile.exists()) {
			return;
		}

		// trafo.loadSrc(gravityFolder.getFile(SRC_XMI).getLocation().toFile().getAbsolutePath());
		// trafo.loadTrg(iproject.getFile(iproject.getName() +
		// ".uml").getLocation().toFile().getAbsolutePath());
		trafo.loadCorr(corrFile.getLocation().toFile().getAbsolutePath());
		CorrespondenceModel corrModel = (CorrespondenceModel) trafo.getCorr();
		trafo.setSrc(corrModel.getSource());
		trafo.setTrg(corrModel.getTarget());
		trafo.loadSynchronizationProtocol(gravityFolder.getFile(PROTOCOL_XMI).getLocation().toFile().getAbsolutePath());

		File oldTrgResource = gravityFolder.getFile(TRG_XMI).getLocation().toFile();
		Resource r = trafo.set.createResource(URI.createFileURI(oldTrgResource.getAbsolutePath()));
		r.load(Collections.EMPTY_MAP);

		EObject oldModel = r.getContents().get(0);
		EObject newModel = trafo.getTrg();

		oldModel.eResource().save(new FileOutputStream(gravityFolder.getFile("old.xmi").getLocation().toFile()),
				Collections.EMPTY_MAP);
		newModel.eResource().save(new FileOutputStream(gravityFolder.getFile("new.xmi").getLocation().toFile()),
				Collections.EMPTY_MAP);

		new UmlProcessor((Model) newModel).processBwd();

		trafo.delta = getDelta(oldModel, newModel);
		if (trafo.noChangesWereMade()) {
			return;
		}

		trafo.batchMode = false;
		trafo.establishTranslationProtocol();
		trafo.init();

		trafo.performSynchronization(new BackwardSynchronizer(trafo.corr, trafo.delta, trafo.protocol,
				trafo.configurator, trafo.determineLookupMethods(), trafo.tempOutputContainer));

		if (trafo.src == null)
			trafo.src = trafo.corr.getSource();

		trafo.saveSrc(gravityFolder.getFile(SRC_XMI).getLocation().toFile().getAbsolutePath());
		trafo.saveCorr(corrFile.getLocation().toFile().getAbsolutePath());
		trafo.saveSynchronizationProtocol(gravityFolder.getFile(PROTOCOL_XMI).getLocation().toFile().getAbsolutePath());

		org.eclipse.gmt.modisco.java.Model model = (org.eclipse.gmt.modisco.java.Model) trafo.getCorr().getSource();

		Package javaPackage = null;
		for (Package p : model.getOwnedElements()) {
			if ("java".contentEquals(p.getName())) {
				javaPackage = p;
				break;
			}
		}
		if (javaPackage == null) {
			javaPackage = JavaFactory.eINSTANCE.createPackage();
			javaPackage.setName("java");
			model.getOwnedElements().add(javaPackage);
		}
		Package langPackage = null;
		for (Package p : javaPackage.getOwnedPackages()) {
			if ("lang".equals(p.getName())) {
				langPackage = p;
			}
		}
		if (langPackage == null) {
			langPackage = JavaFactory.eINSTANCE.createPackage();
			langPackage.setName("lang");
			javaPackage.getOwnedPackages().add(langPackage);
		}
		AbstractTypeDeclaration string = null;
		for (AbstractTypeDeclaration stringType : langPackage.getOwnedElements()) {
			if ("String".equals(stringType.getName())) {
				string = stringType;
			}
		}
		if (string == null) {
			string = JavaFactory.eINSTANCE.createClassDeclaration();
			string.setName("String");
			langPackage.getOwnedElements().add(string);
		}

		ArrayType array = null;
		for (Type orphan : model.getOrphanTypes()) {
			if (orphan instanceof ArrayType) {
				ArrayType tmp = (ArrayType) orphan;
				if (tmp.getElementType().getType().equals(string)) {
					array = tmp;
					break;
				}
			}
		}

		Hashtable<CompilationUnit, HashSet<NamedElement>> imports = new Hashtable<>();
		SynchronizationProtocol sync = trafo.getSynchronizationProtocol();
		for (EObject node : trafo.delta.getAddedNodes()) {
			for (TripleMatch match : sync.getCreatingMatches(node)) {
				for (EObject eObject : match.getCreatedSrcElts().getNodes()) {
					if (eObject instanceof Annotation) {
						Type type = ((Annotation) eObject).getType().getType();
						CompilationUnit cu = ((Annotation) eObject).getOriginalCompilationUnit();
						if (cu == null) {
							EObject current = eObject.eContainer();
							while (!(current instanceof AbstractTypeDeclaration)) {
								current = current.eContainer();
							}
							cu = ((AbstractTypeDeclaration) current).getOriginalCompilationUnit();
						}
						HashSet<NamedElement> importedTypes;
						if (cu == null) {
							continue;
						}
						if (imports.containsKey(cu)) {
							importedTypes = imports.get(cu);
						} else {
							importedTypes = new HashSet<>();
							for (ImportDeclaration imp : cu.getImports()) {
								importedTypes.add(imp.getImportedElement());
							}
							imports.put(cu, importedTypes);
						}
						if (!importedTypes.contains(type)) {
							importedTypes.add(type);
							ImportDeclaration imp = JavaFactory.eINSTANCE.createImportDeclaration();
							imp.setImportedElement(type);
							cu.getImports().add(imp);
						}
					} else if (eObject instanceof AnnotationMemberValuePair) {
						AnnotationMemberValuePair pair = (AnnotationMemberValuePair) eObject;
						if (pair.getMember() == null) {
							AnnotationTypeMemberDeclaration decl = JavaFactory.eINSTANCE
									.createAnnotationTypeMemberDeclaration();
							decl.setName(pair.getName());
							pair.setMember(decl);
							TypeAccess decl2Array = JavaFactory.eINSTANCE.createTypeAccess();
							decl.setType(decl2Array);
							decl2Array.setType(array);
						}
						Expression value = pair.getValue();
						if (value instanceof ArrayInitializer) {
							for (Expression entry : ((ArrayInitializer) value).getExpressions()) {
								if (entry instanceof StringLiteral) {
									StringLiteral stringLiteral = (StringLiteral) entry;
									if (!stringLiteral.getEscapedValue().matches("\".*\"")) {
										stringLiteral.setEscapedValue('\"' + stringLiteral.getEscapedValue() + '\"');
									}
								}
							}

						}

					}
				}
			}
		}

		try {
			IFolder out_file = iproject.getFolder("src");
			new GenerateJavaExtended(trafo.getSrc(), out_file.getLocation().toFile(), Collections.emptyList())
					.doGenerate(new BasicMonitor.EclipseSubProgress(monitor, 1));
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		iproject.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}

	private static IClasspathEntry addLibToClasspath(IJavaProject project, IFile annotationsFile)
			throws JavaModelException {
		IClasspathEntry relativeLibraryEntry;
		relativeLibraryEntry = createClassPathEntry(annotationsFile);
		IClasspathEntry[] oldEntries = project.getRawClasspath();
		IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + 1];
		System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
		newEntries[oldEntries.length] = relativeLibraryEntry;
		project.setRawClasspath(newEntries, null);
		return relativeLibraryEntry;
	}

	/**
	 * Creates a class path entry for the given file
	 * 
	 * @param file The file
	 * @return The class path entry
	 */
	private static ClasspathEntry createClassPathEntry(IFile file) {
		return new org.eclipse.jdt.internal.core.ClasspathEntry(IPackageFragmentRoot.K_BINARY,
				IClasspathEntry.CPE_LIBRARY, file.getLocation(), ClasspathEntry.INCLUDE_ALL, // inclusion
																										// patterns
				ClasspathEntry.EXCLUDE_NONE, // exclusion patterns
				null, null, null, // specific output folder
				false, // exported
				ClasspathEntry.NO_ACCESS_RULES, false, // no access rules to combine
				ClasspathEntry.NO_EXTRA_ATTRIBUTES);
	}

	private static Delta getDelta(EObject oldModel, EObject newModel) {
		IComparisonScope scope = new DefaultComparisonScope(newModel, oldModel, null);
		Builder builder = EMFCompare.builder();
		EMFCompare build = builder.build();
		Comparison comparison = build.compare(scope);

		Delta delta = new Delta();
		EList<Diff> differences = comparison.getDifferences();
		if (differences.size() > 0) {
			for (Diff diff : differences) {
				DifferenceKind kind = diff.getKind();
				switch (kind) {
				case ADD:
					if (diff instanceof ReferenceChange) {
						ReferenceChange refChange = (ReferenceChange) diff;

						if (refChange.getReference().isContainment()) {
							delta.addNode(refChange.getValue());
						}
						delta.addEdge(getChangedEMoflonEdge(refChange));
					} else {
						throw new UnsupportedOperationException();
					}
					break;
				case CHANGE:
					if (diff instanceof ReferenceChange) {
						ReferenceChange refChange = (ReferenceChange) diff;
						if (diff.getState() == DifferenceState.UNRESOLVED) {
							// Ignore
						} else {
							throw new UnsupportedOperationException();
						}
					} else {
						throw new UnsupportedOperationException();
					}
					// break;
				case DELETE:
					if (diff instanceof ReferenceChange) {
						ReferenceChange refChange = (ReferenceChange) diff;

						if (refChange.getReference().isContainment()) {
							delta.deleteNode(refChange.getValue());
						}
						delta.deleteEdge(getChangedEMoflonEdge(refChange));
					} else {
						throw new UnsupportedOperationException();
					}
					break;
				case MOVE:
					throw new UnsupportedOperationException();
					// break;
				default:
					throw new UnsupportedOperationException();
					// break;
				}
			}
		}
		return delta;
	}

	private static EMoflonEdge getChangedEMoflonEdge(ReferenceChange refChange) {
		EObject value = refChange.getValue();
		EReference reference = refChange.getReference();
		EMoflonEdge edge = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		edge.setName(refChange.getReference().getName());
		edge.setTrg(value);
		if (reference.isContainment()) {
			edge.setSrc(value.eContainer());
		} else {
			ResourceSet resourceSet = refChange.getValue().eResource().getResourceSet();
			ECrossReferenceAdapter adapter = ECrossReferenceAdapter.getCrossReferenceAdapter(resourceSet);
			if (adapter == null) {
				resourceSet.eAdapters().add(new ECrossReferenceAdapter());
			}
			for (Setting setting : adapter.getInverseReferences(value)) {
				if (setting.getEStructuralFeature().equals(reference)) {
					edge.setSrc(setting.getEObject());
				}
			}
		}
		return edge;
	}

}
