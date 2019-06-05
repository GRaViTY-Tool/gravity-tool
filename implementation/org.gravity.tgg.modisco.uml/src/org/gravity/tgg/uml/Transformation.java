package org.gravity.tgg.uml;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import org.apache.log4j.BasicConfigurator;
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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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
import org.eclipse.gmt.modisco.java.StringLiteral;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.TypeAccess;
import org.eclipse.gmt.modisco.java.emf.JavaFactory;
import org.eclipse.gmt.modisco.java.generation.files.GenerateJavaExtended;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.uml2.uml.Model;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.exceptions.ProcessingException;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.discovery.GravityModiscoProjectDiscoverer;
import org.gravity.modisco.util.MoDiscoUtil;
import org.gravity.security.annotations.AnnotationsActivator;
import org.gravity.tgg.modisco.uml.UmlPackage;
import org.moflon.tgg.algorithm.configuration.PGSavingConfigurator;
import org.moflon.tgg.algorithm.datastructures.SynchronizationProtocol;
import org.moflon.tgg.algorithm.datastructures.TripleMatch;
import org.moflon.tgg.algorithm.synchronization.BackwardSynchronizer;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;
import org.moflon.tgg.language.analysis.StaticAnalysis;
import org.moflon.tgg.runtime.CorrespondenceModel;

/**
 * This class provides the API for transforming Java projects into UML models
 * and synchronizing changes
 * 
 * @author speldszus
 *
 */
public class Transformation extends SynchronizationHelper {

	private static final Logger LOGGER = Logger.getLogger(Transformation.class);

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
		trafo.setSrc(mGravityModel);

		boolean debugging = GravityActivator.getDefault().isDebugging();
		IFolder gravityFolder = null;
		if (debugging) {
			gravityFolder = EclipseProjectUtil.getGravityFolder(iproject, monitor);
			trafo.saveSrc(gravityFolder.getFile(SRC_XMI).getLocation().toFile().getAbsolutePath());
		}

		subMonitor.setTaskName("Transform MoDisco Model to UML Model");
		trafo.integrateForward();

		subMonitor.setTaskName("Postprocess UML Model");
		subMonitor.setWorkRemaining(15);
		Model model = (Model) trafo.getTrg();
		if (model == null) {
			throw new TransformationFailedException("Reverseengineering of a UML model failed.");
		}
		try {
			new UmlProcessor(model).processFwd();
		} catch (ProcessingException e) {
			throw new TransformationFailedException(e);
		}

		if (debugging) {
			save(gravityFolder, trafo, subMonitor);
		}

		return model;
	}

	/**
	 * Saves all target model
	 * 
	 * @param folder  A folder in the project to which the models should be saved
	 * @param trafo   The transformation of which the models should be saved
	 * @param monitor A progress monitor
	 */
	private static void save(IFolder folder, Transformation trafo, IProgressMonitor monitor) {
		monitor.setTaskName("Save UML Model");
		trafo.saveTrg(folder.getFile(TRG_XMI).getLocation().toFile().getAbsolutePath());
		trafo.saveTrg(folder.getProject().getFile(folder.getProject().getName() + ".uml").getLocation().toFile()
				.getAbsolutePath());
		trafo.saveCorr(folder.getFile(CORR_XMI).getLocation().toFile().getAbsolutePath());
		trafo.saveSynchronizationProtocol(folder.getFile(PROTOCOL_XMI).getLocation().toFile().getAbsolutePath());
		try {
			folder.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
		} catch (CoreException e) {
			LOGGER.log(Level.ERROR, e.getMessage(), e);
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

		trafo.loadCorr(corrFile.getLocation().toFile().getAbsolutePath());
		CorrespondenceModel corrModel = (CorrespondenceModel) trafo.getCorr();
		trafo.setSrc(corrModel.getSource());
		trafo.setTrg(corrModel.getTarget());
		trafo.loadSynchronizationProtocol(gravityFolder.getFile(PROTOCOL_XMI).getLocation().toFile().getAbsolutePath());

		File oldTrgResource = gravityFolder.getFile(TRG_XMI).getLocation().toFile();
		Resource r = trafo.set.createResource(URI.createFileURI(oldTrgResource.getAbsolutePath()));
		try {
			r.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			throw new TransformationFailedException(e);
		}

		EObject oldModel = r.getContents().get(0);
		EObject newModel = trafo.getTrg();

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

		trafo.delta = DeltaHelper.getDelta(oldModel, newModel);
		if (trafo.noChangesWereMade()) {
			return;
		}

		trafo.batchMode = false;
		trafo.establishTranslationProtocol();
		trafo.init();

		trafo.performSynchronization(new BackwardSynchronizer(trafo.corr, trafo.delta, trafo.protocol,
				trafo.configurator, trafo.determineLookupMethods(), trafo.tempOutputContainer));

		if (trafo.src == null) {
			trafo.src = trafo.corr.getSource();
		}

		trafo.saveSrc(gravityFolder.getFile(SRC_XMI).getLocation().toFile().getAbsolutePath());
		trafo.saveCorr(corrFile.getLocation().toFile().getAbsolutePath());
		trafo.saveSynchronizationProtocol(gravityFolder.getFile(PROTOCOL_XMI).getLocation().toFile().getAbsolutePath());

		trafo.postprocessAdditionsBwd();

		try {
			IFolder outFile = iproject.getFolder("src");
			GenerateJavaExtended generateJavaExtended = new GenerateJavaExtended(trafo.getSrc(),
					outFile.getLocation().toFile(), Collections.emptyList());
			generateJavaExtended.doGenerate(new BasicMonitor.EclipseSubProgress(monitor, 1));
		} catch (IOException e) {
			LOGGER.log(Level.ERROR, e.getMessage(), e);
		}

		try {
			iproject.refreshLocal(IResource.DEPTH_INFINITE, monitor);
		} catch (CoreException e) {
			LOGGER.log(Level.ERROR, e.getMessage(), e);
		}
	}

	/**
	 * Postprocesses the transformation
	 */
	private void postprocessAdditionsBwd() {
		org.eclipse.gmt.modisco.java.Model model = (org.eclipse.gmt.modisco.java.Model) getCorr().getSource();

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

		SynchronizationProtocol sync = getSynchronizationProtocol();
		Collection<EObject> additions = delta.getAddedNodes();
		Hashtable<CompilationUnit, HashSet<NamedElement>> imports = new Hashtable<>();
		for (EObject node : additions) {
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
	}

}
