package org.gravity.tgg.uml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

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
import org.emoflon.ibex.tgg.runtime.democles.DemoclesTGGEngine;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.exceptions.ProcessingException;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.ModiscoPackage;
import org.gravity.modisco.discovery.GravityModiscoProjectDiscoverer;
import org.gravity.modisco.util.MoDiscoUtil;
import org.gravity.security.annotations.AnnotationsActivator;

import language.LanguagePackage;
import runtime.Protocol;
import runtime.RuntimePackage;

/**
 * This class provides the API for transforming Java projects into UML models
 * and synchronizing changes
 *
 * @author speldszus
 *
 */
public final class Transformation extends SYNC {

	private static final Logger LOGGER = Logger.getLogger(Transformation.class);

	private static final String PROTOCOL_XMI = "protocol.xmi";
	private static final String SRC_XMI = "src.xmi";
	private static final String TRG_XMI = "trg.xmi";
	private static final String CORR_XMI = "corr.xmi";

	private static final String UML_ECORE = "platform:/plugin/org.gravity.tgg.modisco.uml/model/Uml.ecore";
	private static final String UML_FLATTENED_TGG_XMI = "platform:/plugin/org.gravity.tgg.modisco.uml/model/Uml_flattened.tgg.xmi";
	private static final String UML_TGG_XMI = "platform:/plugin/org.gravity.tgg.modisco.uml/model/Uml.tgg.xmi";

	private Transformation() throws IOException {
		super(createIbexOptions());
		registerBlackInterpreter(new DemoclesTGGEngine());
	}

	private static IbexOptions createIbexOptions() {
		final IbexOptions options = new IbexOptions();
		options.projectName("Uml");
		options.projectPath("org.gravity.tgg.modisco.uml");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}

	@Override
	public void loadModels() throws IOException {
		this.s = createResource(this.options.projectPath() + "/instances/src.xmi");
		this.t = createResource(this.options.projectPath() + "/instances/trg.xmi");
		this.c = createResource(this.options.projectPath() + "/instances/corr.xmi");
		this.p = createResource(this.options.projectPath() + "/instances/protocol.xmi");
	}

	@Override
	protected void registerUserMetamodels() throws IOException {
		registerPackage(JavaPackage.eINSTANCE);
		registerPackage(ModiscoPackage.eINSTANCE);
		this.rs.getPackageRegistry().put("platform:/resource/org.gravity.modisco/model/Modisco.ecore",
				ModiscoPackage.eINSTANCE);
		this.rs.getResources().remove(ModiscoPackage.eINSTANCE.eResource());
		final EPackage tggPackage = loadMetaModelPackage(UML_ECORE);
		registerPackage(tggPackage);
		this.options.setCorrMetamodel(tggPackage);
	}

	private void registerPackage(final EPackage ePackage) {
		this.rs.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
		this.rs.getResources().remove(ePackage.eResource());
	}

	public EPackage loadMetaModelPackage(final String uri) throws IOException {
		final Resource tggResource = loadResource(uri);
		return (EPackage) tggResource.getContents().get(0);
	}

	@Override
	public Resource loadResource(final String uri) throws IOException {
		final Resource resource = this.rs.createResource(URI.createURI(uri));
		if (uri.charAt(0) == '/') {
			resource.load(Collections.emptyMap());
		} else {
			final InputStream stream = new URL(uri).openConnection().getInputStream();
			resource.load(stream, Collections.emptyMap());
		}
		EcoreUtil.resolveAll(resource);
		return resource;
	}

	@Override
	protected Resource loadTGGResource() throws IOException {
		LanguagePackage.eINSTANCE.eResource();
		RuntimePackage.eINSTANCE.eResource();
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
	public static Model projectToModel(final IJavaProject project, final boolean addUMLsec, final IProgressMonitor monitor)
			throws TransformationFailedException, IOException {

		final SubMonitor subMonitor = SubMonitor.convert(monitor, 100);

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

		final GravityModiscoProjectDiscoverer discoverer = new GravityModiscoProjectDiscoverer();

		MGravityModel mGravityModel;
		try {
			mGravityModel = discoverer.discoverMGravityModelFromProject(project, libs, subMonitor.split(25));
		} catch (OperationCanceledException | DiscoveryException e) {
			throw new TransformationFailedException(e);
		}
		mGravityModel.setName(mGravityModel.getName().replace('.', '-'));

		return modiscoToModel(mGravityModel, project, subMonitor);
	}

	public static Model modiscoToModel(final MGravityModel mGravityModel, final IJavaProject iproject, final IProgressMonitor monitor)
			throws TransformationFailedException, IOException {
		final SubMonitor subMonitor = SubMonitor.convert(monitor);

		Transformation trafo;
		try {
			trafo = new Transformation();
		} catch (final IOException e) {
			throw new TransformationFailedException(e);
		}
		trafo.getSourceResource().getContents().add(mGravityModel);

		final boolean debugging = GravityActivator.getDefault().isDebugging();
		IFolder gravityFolder = null;
		if (debugging) {
			gravityFolder = EclipseProjectUtil.getGravityFolder(iproject.getProject(), subMonitor);
			trafo.saveSrc(gravityFolder.getFile(SRC_XMI).getLocation().toFile().getAbsolutePath());
		}

		subMonitor.setTaskName("Transform MoDisco Model to UML Model");
		trafo.forward();
		trafo.terminate();

		subMonitor.setTaskName("Postprocess UML Model");
		subMonitor.setWorkRemaining(15);
		final Model model = (Model) trafo.t.getContents().get(0);
		if (model == null) {
			throw new TransformationFailedException("Reverseengineering of a UML model failed.");
		}

		try {
			new UmlSecProcessor(model).processFwd();
		} catch (final ProcessingException e) {
			throw new TransformationFailedException(e);
		}

		if (debugging) {
			trafo.save(gravityFolder, subMonitor);
		}
		trafo.terminate();

		return model;
	}

	/**
	 * Saves all target model
	 *
	 * @param folder  A folder in the project to which the models should be saved
	 * @param monitor A progress monitor
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	private void save(final IFolder folder, final IProgressMonitor monitor) throws IOException {
		monitor.setTaskName("Save UML Model");
		save(this.t, folder.getFile(TRG_XMI).getLocation().toFile().getAbsolutePath());
		save(this.t, folder.getProject().getFile(folder.getProject().getName() + ".uml").getLocation().toFile()
				.getAbsolutePath());
		save(this.c, folder.getFile(CORR_XMI).getLocation().toFile().getAbsolutePath());
		save(this.p, folder.getFile(PROTOCOL_XMI).getLocation().toFile().getAbsolutePath());
		try {
			folder.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
		} catch (final CoreException e) {
			LOGGER.log(Level.ERROR, e.getMessage(), e);
		}
	}

	/**
	 * Saves the source model
	 *
	 * @param absolutePath The location to which the model should be saved
	 * @throws IOException If the file cannot be saved
	 */
	public void saveSrc(final String absolutePath) throws IOException {
		save(this.s, absolutePath);
	}

	/**
	 * Saves the target model
	 *
	 * @param absolutePath The location to which the model should be saved
	 * @throws IOException If the file cannot be saved
	 */
	public void saveTrg(final String absolutePath) throws IOException {
		save(this.t, absolutePath);
	}

	/**
	 * Saves the resource to the location
	 *
	 * @param resource     The resource which should be saved
	 * @param absolutePath The output location
	 * @throws IOException If writing the resource failed
	 */
	private void save(final Resource resource, final String absolutePath) throws IOException {
		final Path outFile = Paths.get(absolutePath);
		final Path parentFile = outFile.getParent();
		if (!parentFile.toFile().exists()) {
			Files.createDirectories(parentFile);
		}
		try (OutputStream outputStream = Files.newOutputStream(outFile)) {
			resource.save(outputStream, Collections.emptyMap());
		}
	}

	/**
	 * Synchronizes changes from the UML model to the Java project
	 *
	 * @param project The java project
	 * @param monitor A progress monitor
	 * @throws TransformationFailedException If the transformation wasn't successful
	 * @throws IOException                   If writing files failed
	 */
	public static void umlToProject(final IJavaProject project, final IProgressMonitor monitor)
			throws TransformationFailedException, IOException {
		Transformation trafo;
		try {
			trafo = new Transformation();
		} catch (final IOException e) {
			throw new TransformationFailedException(e);
		}

		final IProject iproject = project.getProject();
		final IFolder gravityFolder = EclipseProjectUtil.getGravityFolder(iproject, monitor);
		final IFile corrFile = gravityFolder.getFile(CORR_XMI);
		if (!corrFile.exists()) {
			return;
		}

		trafo.s = trafo.loadResource(gravityFolder.getFile(SRC_XMI).getLocation().toFile().getAbsolutePath());
		trafo.t = trafo.loadResource(gravityFolder.getFile(TRG_XMI).getLocation().toFile().getAbsolutePath());
		trafo.p = trafo.loadResource(gravityFolder.getFile(PROTOCOL_XMI).getLocation().toFile().getAbsolutePath());

		final File oldTrgResource = gravityFolder.getFile(TRG_XMI).getLocation().toFile();
		final Resource r = trafo.rs.createResource(URI.createFileURI(oldTrgResource.getAbsolutePath()));
		try {
			r.load(Collections.emptyMap());
		} catch (final IOException e) {
			throw new TransformationFailedException(e);
		}

		final EObject oldModel = r.getContents().get(0);
		final EObject newModel = trafo.getTargetResource().getContents().get(0);

		try (OutputStream outputStreamOld = Files
				.newOutputStream(gravityFolder.getFile("old.xmi").getLocation().toFile().toPath());
				OutputStream outputStreamNew = Files
						.newOutputStream(gravityFolder.getFile("new.xmi").getLocation().toFile().toPath());) {
			oldModel.eResource().save(outputStreamOld, Collections.emptyMap());
			newModel.eResource().save(outputStreamNew, Collections.emptyMap());
		} catch (final IOException e) {
			throw new TransformationFailedException(e);
		}

		try {
			new UmlSecProcessor((Model) newModel).processBwd();
		} catch (final ProcessingException e) {
			throw new TransformationFailedException(e);
		}

		trafo.backward();

		trafo.saveSrc(gravityFolder.getFile(SRC_XMI).getLocation().toFile().getAbsolutePath());
		trafo.saveCorr(corrFile.getLocation().toFile().getAbsolutePath());
		trafo.saveProtocol(gravityFolder.getFile(PROTOCOL_XMI).getLocation().toFile().getAbsolutePath());

		trafo.postprocessAdditionsBwd();

		try {
			final IFolder outFile = iproject.getFolder("src");
			new GenerateJavaExtended(trafo.s.getContents().get(0), outFile.getLocation().toFile(),
					Collections.emptyList()).doGenerate(new BasicMonitor.EclipseSubProgress(monitor, 1));
		} catch (final IOException e) {
			LOGGER.log(Level.ERROR, e.getMessage(), e);
		}

		try {
			iproject.refreshLocal(IResource.DEPTH_INFINITE, monitor);
		} catch (final CoreException e) {
			LOGGER.log(Level.ERROR, e.getMessage(), e);
		}
	}

	private void saveProtocol(final String absolutePath) throws IOException {
		save(this.p, absolutePath);
	}

	private void saveCorr(final String absolutePath) throws IOException {
		save(this.c, absolutePath);
	}

	/**
	 * Postprocesses the transformation
	 */
	private void postprocessAdditionsBwd() {
		final org.eclipse.gmt.modisco.java.Model model = (org.eclipse.gmt.modisco.java.Model) getSourceResource()
				.getContents().get(0);

		final Type string = MoDiscoUtil.getOrCreateJavaLangString(model);
		ArrayType array = null;
		for (final Type orphan : model.getOrphanTypes()) {
			if (orphan instanceof ArrayType) {
				final ArrayType tmp = (ArrayType) orphan;
				if (tmp.getElementType().getType().equals(string)) {
					array = tmp;
					break;
				}
			}
		}

		final Protocol sync = (Protocol) getProtocolResource().getContents().get(0);
		final HashMap<CompilationUnit, HashSet<NamedElement>> imports = new HashMap<>();
		// for (EObject node : additions) {
		// for (TripleMatch match : sync.getCreatingMatches(node)) {
		// for (EObject eObject : match.getCreatedSrcElts().getNodes()) {
		// if (eObject instanceof Annotation) {
		// Type type = ((Annotation) eObject).getType().getType();
		// CompilationUnit cu = ((Annotation) eObject).getOriginalCompilationUnit();
		// if (cu == null) {
		// EObject current = eObject.eContainer();
		// while (!(current instanceof AbstractTypeDeclaration)) {
		// current = current.eContainer();
		// }
		// cu = ((AbstractTypeDeclaration) current).getOriginalCompilationUnit();
		// }
		// HashSet<NamedElement> importedTypes;
		// if (cu == null) {
		// continue;
		// }
		// if (imports.containsKey(cu)) {
		// importedTypes = imports.get(cu);
		// } else {
		// importedTypes = new HashSet<>();
		// for (ImportDeclaration imp : cu.getImports()) {
		// importedTypes.add(imp.getImportedElement());
		// }
		// imports.put(cu, importedTypes);
		// }
		// if (!importedTypes.contains(type)) {
		// importedTypes.add(type);
		// ImportDeclaration imp = JavaFactory.eINSTANCE.createImportDeclaration();
		// imp.setImportedElement(type);
		// cu.getImports().add(imp);
		// }
		// } else if (eObject instanceof AnnotationMemberValuePair) {
		// AnnotationMemberValuePair pair = (AnnotationMemberValuePair) eObject;
		// if (pair.getMember() == null) {
		// AnnotationTypeMemberDeclaration decl = JavaFactory.eINSTANCE
		// .createAnnotationTypeMemberDeclaration();
		// decl.setName(pair.getName());
		// pair.setMember(decl);
		// TypeAccess decl2Array = JavaFactory.eINSTANCE.createTypeAccess();
		// decl.setType(decl2Array);
		// decl2Array.setType(array);
		// }
		// Expression value = pair.getValue();
		// if (value instanceof ArrayInitializer) {
		// for (Expression entry : ((ArrayInitializer) value).getExpressions()) {
		// if (entry instanceof StringLiteral) {
		// StringLiteral stringLiteral = (StringLiteral) entry;
		// if (!stringLiteral.getEscapedValue().matches("\".*\"")) {
		// stringLiteral.setEscapedValue('\"' + stringLiteral.getEscapedValue() + '\"');
		// }
		// }
		// }
		//
		// }
		//
		// }
		// }
		// }
		// }
	}

}
