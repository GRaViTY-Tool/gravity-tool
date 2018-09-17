/**
 * 
 */
package org.gravity.tgg.test.complete.uml;

import static org.junit.Assert.assertNotNull;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.gravity.tgg.test.complete.AbstractParameterizedTransformationTest;
import org.gravity.tgg.uml.Transformation;

/**
 * 
 * Tests the forward transformation from java projects into uml models
 * 
 * @author speldszus
 *
 */
public class UmlTest extends AbstractParameterizedTransformationTest {

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
	 * @throws IOException
	 * @throws CoreException
	 * @throws DiscoveryException
	 * @throws FileNotFoundException
	 */
	@Override
	public void testForward() throws FileNotFoundException, DiscoveryException, CoreException, IOException {
		String trg = createTrgName(name, UMLResource.FILE_EXTENSION);
		System.out.println(trg);
		
		deleteFile(createSrcName(name, UMLResource.FILE_EXTENSION));
		deleteFile(trg);
		deleteFile(createCorrName(name, UMLResource.FILE_EXTENSION));
		deleteFile(createProtocolName(name, UMLResource.FILE_EXTENSION));

		Model model = Transformation.projectToModel(project, new NullProgressMonitor());
		assertNotNull(model);

		model.eResource().save(new FileOutputStream(trg),
				Collections.EMPTY_MAP);

	}

}
