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
import java.util.Collections;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.java.emf.JavaPackage;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.gervarro.democles.specification.emf.EMFDemoclesPatternMetamodelPlugin;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.modisco.ModiscoPackage;

import runtime.RuntimePackage;

public final class GravityUmlresourceHandler extends TGGResourceHandler {
	private static final Logger LOGGER = Logger.getLogger(GravityUmlresourceHandler.class);
	

	/**
	 * The name of the protocol file
	 */
	public static final String PROTOCOL_XMI = "protocol.xmi";

	/**
	 * The name of the modisco model file
	 */
	public static final String SRC_XMI = "modisco.xmi";

	/**
	 * The name of the correspondence model file
	 */
	public static final String CORR_XMI = "corr.xmi";

	/**
	 * The name of the output folder
	 */
	static final String UML = "uml";

	static final String UML_ECORE = "platform:/plugin/org.gravity.tgg.modisco.uml/model/Uml.ecore";
	static final String UML_FLATTENED_TGG_XMI = "platform:/plugin/org.gravity.tgg.modisco.uml/model/Uml_flattened.tgg.xmi";
	static final String UML_TGG_XMI = "platform:/plugin/org.gravity.tgg.modisco.uml/model/Uml.tgg.xmi";
	
	private final IJavaProject project;
	private IFolder outputFolder;

	GravityUmlresourceHandler(IJavaProject project) throws IOException, CoreException {
		this.project = project;
		this.outputFolder = getOutputFolder(project.getProject());
		if(!this.outputFolder.exists()) {
			this.outputFolder.create(true, true, new NullProgressMonitor());
		}
	}

	/**
	 * Calculates the output folder for the given project;
	 * 
	 * @param project A project
	 * @return The output folder '@throws IOException If the project isn't
	 *         accessible
	 */
	public static IFolder getOutputFolder(final IProject project) throws IOException {
		return EclipseProjectUtil.getGravityFolder(project, new NullProgressMonitor()).getFolder(UML);
	}

	@Override
	protected void createAndPrepareResourceSet() {
		if (rs == null) {
			super.createAndPrepareResourceSet();
		} else {
			rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,
					new XMIResourceFactoryImpl());
			try {
				EMFDemoclesPatternMetamodelPlugin.setWorkspaceRootDirectory(rs,
						new File(options.workspacePath()).getCanonicalPath());
			} catch (IOException e) {
				LOGGER.error(e.getLocalizedMessage(), e);
			}
		}
	}

	@Override
	public void loadModels() throws IOException {
		if (source == null) {
			this.source = rs.createResource(URI
					.createPlatformResourceURI(outputFolder.getFile(SRC_XMI).getFullPath().toFile().toString(), true));
		}
		if (target == null) {
			target = rs.createResource(URI.createPlatformResourceURI(
					project.getProject().getFile(project.getProject().getName()+"."+UML).getFullPath().toFile().toString(), true));
		}
		if (corr == null) {
			this.corr = rs.createResource(URI
					.createPlatformResourceURI(outputFolder.getFile(CORR_XMI).getFullPath().toFile().toString(), true));
		}
		if (protocol == null) {
			this.protocol = rs.createResource(URI.createPlatformResourceURI(
					outputFolder.getFile(PROTOCOL_XMI).getFullPath().toFile().toString(), true));
		}
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
		return resource;
	}

	@Override
	protected Resource loadTGGResource() throws IOException {
		RuntimePackage.eINSTANCE.eResource();
		return loadResource(UML_TGG_XMI);
	}

	@Override
	protected Resource loadFlattenedTGGResource() throws IOException {
		return loadResource(UML_FLATTENED_TGG_XMI);
	}

	/**
	 * Saves all target model
	 *
	 * @param folder  A folder in the project to which the models should be saved
	 * @param monitor A progress monitor
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	void save(final IFolder folder, final IProgressMonitor monitor) throws IOException {
		monitor.setTaskName("Save UML Model");
		IFile umlFile = folder.getProject().getFile(folder.getProject().getName() + ".uml");
		getTargetResource().setURI(URI.createPlatformResourceURI(umlFile.getFullPath().toFile().toString(), true));
		save(getTargetResource(), umlFile.getLocation().toFile().getAbsolutePath());
		save(getSourceResource(), folder.getFile(SRC_XMI).getLocation().toFile().getAbsolutePath());
		save(getCorrResource(), folder.getFile(CORR_XMI).getLocation().toFile().getAbsolutePath());
		save(getProtocolResource(), folder.getFile(PROTOCOL_XMI).getLocation().toFile().getAbsolutePath());
		try {
			folder.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
		} catch (final CoreException e) {
			LOGGER.log(Level.ERROR, e.getMessage(), e);
		}
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
	 * A getter for the folder to which results of the transformation should be written
	 * 
	 * @return the folder
	 */
	public IFolder getOutputFolder() {
		return this.outputFolder;
	}

	public IFile getCorrFile() {
		return outputFolder.getFile(CORR_XMI);
	}

	public IFile getTrgFile() {
		return outputFolder.getFile(project.getProject().getName()+"."+UML);
	}
}