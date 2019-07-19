package org.gravity.tgg.uml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmt.modisco.java.ArrayType;
import org.eclipse.gmt.modisco.java.CompilationUnit;
import org.eclipse.gmt.modisco.java.NamedElement;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;
import org.eclipse.gmt.modisco.java.generation.files.GenerateJavaExtended;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.uml2.uml.Model;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.uml.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesTGGEngine;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.exceptions.ProcessingException;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.ModiscoPackage;
import org.gravity.modisco.discovery.GravityModiscoProjectDiscoverer;
import org.gravity.modisco.util.MoDiscoUtil;
import org.gravity.security.annotations.AnnotationsActivator;

import runtime.Protocol;

/**
 * This class provides the API for transforming Java projects into UML models
 * and synchronizing changes
 * 
 * @author speldszus
 *
 */
public class Transformation extends SYNC {

	private static final Logger LOGGER = Logger.getLogger(Transformation.class);

	private static final String PROTOCOL_XMI = "protocol.xmi";
	private static final String SRC_XMI = "src.xmi";
	private static final String TRG_XMI = "trg.xmi";
	private static final String CORR_XMI = "corr.xmi";

	private static final String UML_ECORE = "platform:/plugin/org.gravity.tgg.modisco.uml/model/Uml.ecore";
	private static final String UML_FLATTENED_TGG_XMI = "platform:/plugin/org.gravity.tgg.modisco.uml/model/Uml_flattened.tgg.xmi";
	private static final String UML_TGG_XMI = "platform:/plugin/org.gravity.tgg.modisco.uml/model/Uml.tgg.xmi";

	private Transformation(ResourceSet rs) throws MalformedURLException, IOException {
		super(createIbexOptions());
		registerBlackInterpreter(new DemoclesTGGEngine());
	}

	private static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectName("Uml");
		options.projectPath("org.gravity.tgg.modisco.uml");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}


	@Override
	public void loadModels() throws IOException {
		s = createResource(options.projectPath() + "/instances/src.xmi");
		t = createResource(options.projectPath() + "/instances/trg.xmi");
		c = createResource(options.projectPath() + "/instances/corr.xmi");
		p = createResource(options.projectPath() + "/instances/protocol.xmi");
	}
	
	@Override
	protected void registerUserMetamodels() throws IOException {
		registerPackage(JavaPackage.eINSTANCE);
		registerPackage(ModiscoPackage.eINSTANCE);
		rs.getPackageRegistry().put("platform:/resource/org.gravity.modisco/model/Modisco.ecore", ModiscoPackage.eINSTANCE);
		rs.getResources().remove(ModiscoPackage.eINSTANCE.eResource());
		EPackage tggPackage = loadMetaModelPackage(UML_ECORE);
		registerPackage(tggPackage);
		options.setCorrMetamodel(tggPackage);
	}
	
	private void registerPackage(EPackage ePackage) {
		rs.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
		rs.getResources().remove(ePackage.eResource());
	}
	
	public EPackage loadMetaModelPackage(String uri) throws IOException, MalformedURLException {
		Resource tggResource = loadResource(uri);
		EPackage tggPackage = (EPackage) tggResource.getContents().get(0);
		return tggPackage;
	}

	@Override
	public Resource loadResource(String uri) throws IOException, MalformedURLException {
		Resource resource = rs.createResource(URI.createURI(uri));
		InputStream tggRulesStream = new URL(uri)
				.openConnection().getInputStream();
		resource.load(tggRulesStream,Collections.emptyMap());
		EcoreUtil.resolveAll(resource);
		return resource;
	}
	
	@Override
	protected Resource loadTGGResource() throws IOException {
		return loadResource(UML_TGG_XMI);
	}
	
	@Override
	protected Resource loadFlattenedTGGResource() throws IOException {
		return loadResource(UML_FLATTENED_TGG_XMI);
	}

	
	/**
	 * Translates the given java project into an UML model
	 * 
	 * @param project   The java project
	 * @param addUMLsec Iff the UMLsec annotations should be added to the java
	 *                  project
	 * @param monitor   A progress monitor
	 * @return The UML model
	 * @throws TransformationFailedException If the UML model couldn't be created
	 *                                       due to a transformation error
	 * @throws IOException                   If writing files failed
	 */
	public static Model projectToModel(IJavaProject project, boolean addUMLsec, IProgressMonitor monitor)
			throws TransformationFailedException, IOException {

		SubMonitor subMonitor = SubMonitor.convert(monitor, 100);

		IProject iproject = project.getProject();

		Collection<IPath> libs;
		if (!addUMLsec) {
			libs = new ArrayList<>();
		} else {
			try {
				libs = AnnotationsActivator.applyUMLsecLib(project, subMonitor);
			} catch (CoreException | IOException e) {
				throw new TransformationFailedException(e);
			}
		}
		subMonitor.setWorkRemaining(95);
		subMonitor.setTaskName("Discover MoDiscoModel");

		GravityModiscoProjectDiscoverer discoverer = new GravityModiscoProjectDiscoverer();

		MGravityModel mGravityModel;
		try {
			mGravityModel = discoverer.discoverMGravityModelFromProject(project, libs, subMonitor.split(25));
		} catch (OperationCanceledException | DiscoveryException e) {
			throw new TransformationFailedException(e);
		}
		mGravityModel.setName(mGravityModel.getName().replace('.', '-'));

		Transformation trafo;
		try {
			trafo = new Transformation(discoverer.getResourceSet());
		} catch (IOException e) {
			throw new TransformationFailedException(e);
		}
		trafo.getSourceResource().getContents().add(mGravityModel);

		boolean debugging = GravityActivator.getDefault().isDebugging();
		IFolder gravityFolder = null;
		if (debugging) {
			gravityFolder = EclipseProjectUtil.getGravityFolder(iproject, monitor);
			trafo.saveSrc(gravityFolder.getFile(SRC_XMI).getLocation().toFile().getAbsolutePath());
		}

		subMonitor.setTaskName("Transform MoDisco Model to UML Model");
		trafo.forward();

		subMonitor.setTaskName("Postprocess UML Model");
		subMonitor.setWorkRemaining(15);
		Model model = (Model) trafo.t.getContents().get(0);
		if (model == null) {
			throw new TransformationFailedException("Reverseengineering of a UML model failed.");
		}
		try {
			new UmlProcessor(model).processFwd();
		} catch (ProcessingException e) {
			throw new TransformationFailedException(e);
		}

		if (debugging) {
			trafo.save(gravityFolder, subMonitor);
		}

		return model;
	}

	/**
	 * Saves all target model
	 * 
	 * @param folder  A folder in the project to which the models should be saved
	 * @param trafo   The transformation of which the models should be saved
	 * @param monitor A progress monitor
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	private void save(IFolder folder, IProgressMonitor monitor) throws IOException {
		monitor.setTaskName("Save UML Model");
		save(t, folder.getFile(TRG_XMI).getLocation().toFile().getAbsolutePath());
		save(t, folder.getProject().getFile(folder.getProject().getName() + ".uml").getLocation().toFile()
				.getAbsolutePath());
		save(c, folder.getFile(CORR_XMI).getLocation().toFile().getAbsolutePath());
		save(p, folder.getFile(PROTOCOL_XMI).getLocation().toFile().getAbsolutePath());
		try {
			folder.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
		} catch (CoreException e) {
			LOGGER.log(Level.ERROR, e.getMessage(), e);
		}
	}

	/**
	 * Saves the source model
	 * 
	 * @param absolutePath The location to which the model should be saved
	 * @throws IOException If the file cannot be saved
	 */
	public void saveSrc(String absolutePath) throws IOException {
		save(s, absolutePath);
	}
	
	/**
	 * Saves the target model
	 * 
	 * @param absolutePath The location to which the model should be saved
	 * @throws IOException If the file cannot be saved
	 */
	public void saveTrg(String absolutePath) throws IOException {
		save(t, absolutePath);
	}

	/**
	 * Saves the resource to the location
	 * 
	 * @param resource The resource which should be saved
	 * @param absolutePath The output location
	 * @throws IOException If writing the resource failed
	 */
	private void save(Resource resource, String absolutePath) throws IOException {
		File outFile = new File(absolutePath);
		File parentFile = outFile.getParentFile();
		if(!parentFile.exists()) {
			parentFile.mkdirs();
		}
		resource.save(new FileOutputStream(outFile), Collections.emptyMap());
	}

	/**
	 * Synchronizes changes from the UML model to the Java project
	 * 
	 * @param project The java project
	 * @param monitor A progress monitor
	 * @throws TransformationFailedException If the transformation wasn't successful
	 * @throws IOException                   If writing files failed
	 */
	public static void umlToProject(IJavaProject project, IProgressMonitor monitor)
			throws TransformationFailedException, IOException {
		Transformation trafo;
		try {
			trafo = new Transformation(new ResourceSetImpl());
		} catch (IOException e) {
			throw new TransformationFailedException(e);
		}

		IProject iproject = project.getProject();
		IFolder gravityFolder = EclipseProjectUtil.getGravityFolder(iproject, monitor);
		IFile corrFile = gravityFolder.getFile(CORR_XMI);
		if (!corrFile.exists()) {
			return;
		}

		trafo.s = trafo.loadResource(gravityFolder.getFile(SRC_XMI).getLocation().toFile().getAbsolutePath());
		trafo.t = trafo.loadResource(gravityFolder.getFile(TRG_XMI).getLocation().toFile().getAbsolutePath());
		trafo.p = trafo.loadResource(gravityFolder.getFile(PROTOCOL_XMI).getLocation().toFile().getAbsolutePath());

		File oldTrgResource = gravityFolder.getFile(TRG_XMI).getLocation().toFile();
		Resource r = trafo.rs.createResource(URI.createFileURI(oldTrgResource.getAbsolutePath()));
		try {
			r.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			throw new TransformationFailedException(e);
		}

		EObject oldModel = r.getContents().get(0);
		EObject newModel = trafo.getTargetResource().getContents().get(0);

		try {
			oldModel.eResource().save(new FileOutputStream(gravityFolder.getFile("old.xmi").getLocation().toFile()),
					Collections.EMPTY_MAP);
			newModel.eResource().save(new FileOutputStream(gravityFolder.getFile("new.xmi").getLocation().toFile()),
					Collections.EMPTY_MAP);
		} catch (IOException e) {
			throw new TransformationFailedException(e);
		}

		try {
			new UmlProcessor((Model) newModel).processBwd();
		} catch (ProcessingException e) {
			throw new TransformationFailedException(e);
		}

		trafo.backward();

		trafo.saveSrc(gravityFolder.getFile(SRC_XMI).getLocation().toFile().getAbsolutePath());
		trafo.saveCorr(corrFile.getLocation().toFile().getAbsolutePath());
		trafo.saveProtocol(gravityFolder.getFile(PROTOCOL_XMI).getLocation().toFile().getAbsolutePath());

		trafo.postprocessAdditionsBwd();

		try {
			IFolder outFile = iproject.getFolder("src");
			new GenerateJavaExtended(trafo.s.getContents().get(0), outFile.getLocation().toFile(), Collections.emptyList())
					.doGenerate(new BasicMonitor.EclipseSubProgress(monitor, 1));
		} catch (IOException e) {
			LOGGER.log(Level.ERROR, e.getMessage(), e);
		}

		try {
			iproject.refreshLocal(IResource.DEPTH_INFINITE, monitor);
		} catch (CoreException e) {
			LOGGER.log(Level.ERROR, e.getMessage(), e);
		}
	}

	private void saveProtocol(String absolutePath) throws IOException {
		save(p, absolutePath);
	}

	private void saveCorr(String absolutePath) throws IOException {
		save(c, absolutePath);
	}

	/**
	 * Postprocesses the transformation
	 */
	private void postprocessAdditionsBwd() {
		org.eclipse.gmt.modisco.java.Model model = (org.eclipse.gmt.modisco.java.Model) getSourceResource().getContents().get(0);

		Type string = MoDiscoUtil.getOrCreateJavaLangString(model);
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

		Protocol sync = (Protocol) getProtocolResource().getContents().get(0);
		HashMap<CompilationUnit, HashSet<NamedElement>> imports = new HashMap<>();
//		for (EObject node : additions) {
//			for (TripleMatch match : sync.getCreatingMatches(node)) {
//				for (EObject eObject : match.getCreatedSrcElts().getNodes()) {
//					if (eObject instanceof Annotation) {
//						Type type = ((Annotation) eObject).getType().getType();
//						CompilationUnit cu = ((Annotation) eObject).getOriginalCompilationUnit();
//						if (cu == null) {
//							EObject current = eObject.eContainer();
//							while (!(current instanceof AbstractTypeDeclaration)) {
//								current = current.eContainer();
//							}
//							cu = ((AbstractTypeDeclaration) current).getOriginalCompilationUnit();
//						}
//						HashSet<NamedElement> importedTypes;
//						if (cu == null) {
//							continue;
//						}
//						if (imports.containsKey(cu)) {
//							importedTypes = imports.get(cu);
//						} else {
//							importedTypes = new HashSet<>();
//							for (ImportDeclaration imp : cu.getImports()) {
//								importedTypes.add(imp.getImportedElement());
//							}
//							imports.put(cu, importedTypes);
//						}
//						if (!importedTypes.contains(type)) {
//							importedTypes.add(type);
//							ImportDeclaration imp = JavaFactory.eINSTANCE.createImportDeclaration();
//							imp.setImportedElement(type);
//							cu.getImports().add(imp);
//						}
//					} else if (eObject instanceof AnnotationMemberValuePair) {
//						AnnotationMemberValuePair pair = (AnnotationMemberValuePair) eObject;
//						if (pair.getMember() == null) {
//							AnnotationTypeMemberDeclaration decl = JavaFactory.eINSTANCE
//									.createAnnotationTypeMemberDeclaration();
//							decl.setName(pair.getName());
//							pair.setMember(decl);
//							TypeAccess decl2Array = JavaFactory.eINSTANCE.createTypeAccess();
//							decl.setType(decl2Array);
//							decl2Array.setType(array);
//						}
//						Expression value = pair.getValue();
//						if (value instanceof ArrayInitializer) {
//							for (Expression entry : ((ArrayInitializer) value).getExpressions()) {
//								if (entry instanceof StringLiteral) {
//									StringLiteral stringLiteral = (StringLiteral) entry;
//									if (!stringLiteral.getEscapedValue().matches("\".*\"")) {
//										stringLiteral.setEscapedValue('\"' + stringLiteral.getEscapedValue() + '\"');
//									}
//								}
//							}
//
//						}
//
//					}
//				}
//			}
//		}
	}

}
