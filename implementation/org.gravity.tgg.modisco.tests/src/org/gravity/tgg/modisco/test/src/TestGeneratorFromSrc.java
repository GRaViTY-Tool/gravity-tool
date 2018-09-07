package org.gravity.tgg.modisco.test.src;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.tgg.modisco.MoDiscoTGGConverter;
import org.gravity.tgg.modisco.test.activator.MoDiscoTestActivator;
import org.gravity.tgg.modisco.test.util.TimeStampUtil;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;

public class TestGeneratorFromSrc {

	private static final Logger LOGGER = Logger.getLogger(TestGeneratorFromSrc.class.getName() );

	private static final boolean DEBUG = true;

	private final IJavaProject source;
	private final String name;
	private final String out;

	public TestGeneratorFromSrc(final IJavaProject src) {
		source = src;
		name = source.getProject().getName();
		out = Platform.getBundle(MoDiscoTestActivator.PLUGIN_ID).getLocation().substring("platform:/base/".length());
	}

	public static boolean runTest_ForwardTransformationFromJavaSrc(final IJavaProject src) {
		// Set up logging
		BasicConfigurator.configure();

		// Forward Transformation
		final TestGeneratorFromSrc helper = new TestGeneratorFromSrc(src);

		helper.performForward();
		return true;
	}

	public final ResourceSet loadResourceSet(final URI uri) {
		final ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResource(uri, true);
		return resourceSet;
	}

	private void performForward() {
		try {
			deleteFile(createSrcName(name));
			deleteFile(createTrgName(name));
			deleteFile(createCorrName(name));
			deleteFile(createProtocolName(name));

			try {
				final IPGConverter conv = new MoDiscoTGGConverter();

				conv.setDebug(DEBUG);

				LOGGER.log( Level.INFO, "Start forward integration - " + TimeStampUtil.getCurrentTimeStamp());
				if (!conv.convertProject(source, new NullProgressMonitor())) {
					throw new AssertionError("Trafo failed");
				}
				LOGGER.log( Level.INFO, "Finished forward integration - " + TimeStampUtil.getCurrentTimeStamp());

				if (DEBUG) {
					LOGGER.log( Level.INFO, "Save MoDisco Src - " + TimeStampUtil.getCurrentTimeStamp());
					((SynchronizationHelper) conv).saveSrc(createSrcName(name));

					LOGGER.log( Level.INFO, "Save Output Model - " + TimeStampUtil.getCurrentTimeStamp());
					((SynchronizationHelper) conv).saveTrg(createTrgName(name));

					try {
						LOGGER.log( Level.INFO, "Save correspondence model - " + TimeStampUtil.getCurrentTimeStamp());
						((SynchronizationHelper) conv).saveCorr(createCorrName(name));
					} catch (final Throwable t) {
						System.err
								.println("Failed to save correspondence model: " + t + "\nMessage: " + t.getMessage());
					}

					try {
						LOGGER.log( Level.INFO, "Save protocol xmi - " + TimeStampUtil.getCurrentTimeStamp());
						((SynchronizationHelper) conv).saveSynchronizationProtocol(createProtocolName(name));
					} catch (final Throwable t) {
						LOGGER.log(Level.ERROR, "Failed to save protocol xmi: " + t + "\nMessage: " + t.getMessage());
					}
				}
			} catch (final MalformedURLException e) {
				throw new AssertionError(String.format("Unable to load '%s': %s", source, e.getMessage()));
			} catch (final IOException e) {
				throw new AssertionError(String.format("Unable to load '%s': %s", source, e.getMessage()));
			}

		} catch (final IllegalArgumentException iae) {
			throw new AssertionError(String.format("Unable to load '%s': %s", source, iae.getMessage()));
		}
	}

	private void deleteFile(final String filepath) {
		final URI uri = URI.createFileURI(filepath);
		final File file = new File(uri.toFileString());
		if (file.exists()) {
			file.delete();
		}
	}

	private String createSrcName(final String src) {
		return String.format("%s/Testcases/CreatedOutput/%s.src.xmi", out, src);
	}

	private String createTrgName(final String src) {
		return String.format("%s/Testcases/CreatedOutput/%s.trg.xmi", out, src);
	}

	private String createCorrName(final String src) {
		return String.format("%s/Testcases/CreatedOutput/%s.corr.xmi", out, src);
	}

	private String createProtocolName(final String src) {
		return String.format("%s/Testcases/CreatedOutput/%s.protocol.xmi", out, src);
	}

	private String createExpectedName(final String src) {
		return String.format("%s/Testcases/ExpectedResults/%s.xmi", out, src);
	}

}
