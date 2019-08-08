package org.gravity.tgg.test.complete.pm;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.io.FileUtils;
import org.gravity.tgg.modisco.MoDiscoTGGConverter;
import org.gravity.tgg.test.complete.AbstractParameterizedTransformationTest;
import org.gravity.tgg.test.util.TimeStampUtil;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * 
 * Tests the forward transformation from java projects into program models
 * 
 * @author speldszus
 *
 */
public class ProgramModelTest extends AbstractParameterizedTransformationTest {

	private static final String XMI = "xmi";

	private static final Logger LOGGER = Logger.getLogger(ProgramModelTest.class);

	private static final boolean DEBUG = true;

	/**
	 * The constructor invoking the given super constructor
	 * 
	 * This constructor should be only called by junit!
	 * 
	 * @see org.gravity.tgg.test.complete.AbstractParameterizedTransformationTest#testForward()
	 * 
	 * @param name    The project name
	 * @param project The java project
	 */
	public ProgramModelTest(String name, IJavaProject project) {
		super(name, project);
	}

	@Override
	public final void testForward() {
		try {
			FileUtils.recursiveDelete(createSrcName(name, XMI));
			FileUtils.recursiveDelete(createTrgFile(name, XMI));
			FileUtils.recursiveDelete(createCorrName(name, XMI));
			FileUtils.recursiveDelete(createProtocolName(name, XMI));
		} catch (final IllegalArgumentException iae) {
			throw new AssertionError(String.format("Unable to load '%s': %s", project, iae.getMessage()));
		}

		IPGConverter conv = null;
		try {
			conv = new MoDiscoTGGConverter();
			conv.setDebug(DEBUG);
		} catch (final IOException e) {
			throw new AssertionError(String.format("Unable to initialize TGG: ", e.getMessage()));
		} 
		
		LOGGER.log(Level.INFO, "Start forward integration - " + TimeStampUtil.getCurrentTimeStamp());
		if (!conv.convertProject(project, new NullProgressMonitor())) {
			throw new AssertionError("Trafo failed");
		}
		LOGGER.log(Level.INFO, "Finished forward integration - " + TimeStampUtil.getCurrentTimeStamp());

		TypeGraph pg = conv.getPG();
		assertNotNull(pg);
		conv.discard();
	}
}
