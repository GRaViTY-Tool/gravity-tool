package org.gravity.tgg.test.complete.pm;

import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.tgg.modisco.MoDiscoTGGConverter;
import org.gravity.tgg.test.complete.AbstractParameterizedTransformationTest;
import org.gravity.tgg.test.util.TimeStampUtil;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;

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
			deleteFile(createSrcName(name, XMI));
			deleteFile(createTrgName(name, XMI));
			deleteFile(createCorrName(name, XMI));
			deleteFile(createProtocolName(name, XMI));

			try {
				final IPGConverter conv = new MoDiscoTGGConverter();

				conv.setDebug(DEBUG);

				LOGGER.log(Level.INFO, "Start forward integration - " + TimeStampUtil.getCurrentTimeStamp());
				if (!conv.convertProject(project, new NullProgressMonitor())) {
					throw new AssertionError("Trafo failed");
				}
				LOGGER.log(Level.INFO, "Finished forward integration - " + TimeStampUtil.getCurrentTimeStamp());

				if (DEBUG) {
					LOGGER.log(Level.INFO, "Save MoDisco Src - " + TimeStampUtil.getCurrentTimeStamp());
					((SynchronizationHelper) conv).saveSrc(createSrcName(name, XMI));

					LOGGER.log(Level.INFO, "Save Output Model - " + TimeStampUtil.getCurrentTimeStamp());
					((SynchronizationHelper) conv).saveTrg(createTrgName(name, XMI));

					try {
						LOGGER.log(Level.INFO, "Save correspondence model - " + TimeStampUtil.getCurrentTimeStamp());
						((SynchronizationHelper) conv).saveCorr(createCorrName(name, XMI));
					} catch (final Throwable t) {
						LOGGER.log(Level.ERROR, "Failed to save correspondence model: " + t + "\nMessage: " + t.getMessage(), t);
					}

					try {
						LOGGER.log(Level.INFO, "Save protocol xmi - " + TimeStampUtil.getCurrentTimeStamp());
						((SynchronizationHelper) conv).saveSynchronizationProtocol(createProtocolName(name, XMI));
					} catch (final Throwable t) {
						LOGGER.log(Level.ERROR, "Failed to save protocol xmi: " + t + "\nMessage: " + t.getMessage());
					}
				}
			} catch (final MalformedURLException e) {
				throw new AssertionError(String.format("Unable to load '%s': %s", project, e.getMessage()));
			} catch (final IOException e) {
				throw new AssertionError(String.format("Unable to load '%s': %s", project, e.getMessage()));
			}

		} catch (final IllegalArgumentException iae) {
			throw new AssertionError(String.format("Unable to load '%s': %s", project, iae.getMessage()));
		}
	}
}
