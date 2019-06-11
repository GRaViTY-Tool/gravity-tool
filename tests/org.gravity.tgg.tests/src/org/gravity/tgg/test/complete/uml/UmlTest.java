/**
 * 
 */
package org.gravity.tgg.test.complete.uml;

import static org.junit.Assert.assertNotNull;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.gravity.tgg.test.complete.AbstractParameterizedTransformationTest;
import org.gravity.tgg.uml.Transformation;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.eclipse.util.EclipseProjectUtil;

/**
 * 
 * Tests the forward transformation from java projects into uml models
 * 
 * @author speldszus
 *
 */
public class UmlTest extends AbstractParameterizedTransformationTest {

	private static final boolean ADD_UMLSEC = false;
	private static final Logger LOGGER = Logger.getLogger(UmlTest.class);

	public UmlTest(String name, IJavaProject project) {
		super(name, project);
	}

	/**
	 * The constructor taking the collected projects
	 * 
	 * This constructor should be only called by junit!
	 * 
	 * @see org.gravity.tgg.test.complete.AbstractParameterizedTransformationTest#testForward()
	 * 
	 * @param name    The project name
	 * @param project The java project
	 * @throws IOException           If reading or writing files failed
	 * @throws CoreException
	 * @throws DiscoveryException
	 * @throws FileNotFoundException
	 */
	@Override
	public void testForward() throws FileNotFoundException, DiscoveryException, CoreException, IOException {
		String trg = createTrgName(name, UMLResource.FILE_EXTENSION);
		LOGGER.log(Level.INFO, trg);

		deleteFile(createSrcName(name, UMLResource.FILE_EXTENSION));
		deleteFile(trg);
		deleteFile(createCorrName(name, UMLResource.FILE_EXTENSION));
		deleteFile(createProtocolName(name, UMLResource.FILE_EXTENSION));

		Exception fail = null;
		NullProgressMonitor monitor = new NullProgressMonitor();
		try {
			Model model = Transformation.projectToModel(project, ADD_UMLSEC, monitor);
			assertNotNull(model);

			model.eResource().save(new FileOutputStream(trg), Collections.EMPTY_MAP);

		} catch (TransformationFailedException e) {
			LOGGER.log(Level.ERROR, e.getMessage(), e);
			fail = e;
		}

		IFile file = EclipseProjectUtil.getGravityFolder(project.getProject(), monitor)
				.getFile("org.gravity.annotations.jar");
		IClasspathEntry cpe = project.getClasspathEntryFor(file.getLocation());
		if (cpe != null) {
			IClasspathEntry[] oldCp = project.getRawClasspath();
			IClasspathEntry[] newCp = new IClasspathEntry[oldCp.length - 1];
			int i = 0;
			for (IClasspathEntry e : oldCp) {
				if (!e.getPath().equals(file.getLocation())) {
					newCp[i++] = e;
				}
			}
			project.setRawClasspath(newCp, monitor);
		}
		file.delete(true, monitor);

		if (fail != null) {
			throw new AssertionError(fail.getMessage(), fail);
		}
	}

}
