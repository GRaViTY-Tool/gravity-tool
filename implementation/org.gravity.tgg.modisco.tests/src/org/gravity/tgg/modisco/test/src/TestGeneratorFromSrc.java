package org.gravity.tgg.modisco.test.src;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.DiffBuilder;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.compare.diff.IDiffEngine;
import org.eclipse.emf.compare.diff.IDiffProcessor;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.tgg.modisco.MoDiscoTGGConverter;
import org.gravity.tgg.modisco.test.activator.MoDiscoTestActivator;
import org.gravity.tgg.modisco.test.util.TimeStampUtil;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;

public class TestGeneratorFromSrc {

	private final IJavaProject source;
	private final String name;
	private final String out;

	public TestGeneratorFromSrc(final IJavaProject src) {
		source = src;
		name = source	.getProject()
						.getName();
		out = Platform	.getBundle(MoDiscoTestActivator.PLUGIN_ID)
						.getLocation()
						.substring("platform:/base/".length());
	}

	public static Comparison runTest_ForwardTransformationFromJavaSrc(final IJavaProject src) {

		// Set up logging
		BasicConfigurator.configure();

		// Forward Transformation
		final TestGeneratorFromSrc helper = new TestGeneratorFromSrc(src);

		helper.performForward();
		return helper.compare();
	}

	public final Comparison compare() {

		System.out.println("Prepare comparison - " + TimeStampUtil.getCurrentTimeStamp());

		final URI uri1 = URI.createFileURI(createTrgName(name));
		final URI uri2 = URI.createFileURI(createExpectedName(name));

		Resource.Factory.Registry.INSTANCE	.getExtensionToFactoryMap()
											.put("xmi", new XMIResourceFactoryImpl());

		final ResourceSet resourceSet1 = loadResourceSet(uri1);
		final ResourceSet resourceSet2 = loadResourceSet(uri2);

		final IDiffProcessor diffProcessor = new DiffBuilder();
		final IDiffEngine diffEngine = new DefaultDiffEngine(diffProcessor) {
			@Override
			protected FeatureFilter createFeatureFilter() {
				return new FeatureFilter() {

					@Override
					protected boolean isIgnoredAttribute(final EAttribute attribute) {
						final boolean ignore = super.isIgnoredAttribute(attribute) || "ID".equals(attribute.getName());
						return ignore;
					}

					@Override
					public boolean checkForOrderingChanges(final EStructuralFeature feature) {
						return false;
					}

				};
			}
		};

		System.out.println("Start comparison - " + TimeStampUtil.getCurrentTimeStamp());

		final IComparisonScope scope = new DefaultComparisonScope(resourceSet1, resourceSet2, null);
		final Comparison comparison = EMFCompare.builder()
												.setDiffEngine(diffEngine)
												.build()
												.compare(scope);

		System.out.println("Finished comparison - " + TimeStampUtil.getCurrentTimeStamp());

		return comparison;
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

				//conv.setDebug(true);

				System.out.println("Start forward integration - " + TimeStampUtil.getCurrentTimeStamp());
				if (!conv.convertProject(source, new NullProgressMonitor())) {
					throw new AssertionError("Trafo failed");
				}
				System.out.println("Finished forward integration - " + TimeStampUtil.getCurrentTimeStamp());

				System.out.println("Save MoDisco Src - " + TimeStampUtil.getCurrentTimeStamp());
				((SynchronizationHelper) conv).saveSrc(createSrcName(name));

				System.out.println("Save Output Model - " + TimeStampUtil.getCurrentTimeStamp());
				((SynchronizationHelper) conv).saveTrg(createTrgName(name));

				try {
					System.out.println("Save correspondence model - " + TimeStampUtil.getCurrentTimeStamp());
					((SynchronizationHelper) conv).saveCorr(createCorrName(name));
				} catch (final Throwable t) {
					System.err.println("Failed to save correspondence model: " + t + "\nMessage: " + t.getMessage());
				}

				try {
					System.out.println("Save protocol xmi - " + TimeStampUtil.getCurrentTimeStamp());
					((SynchronizationHelper) conv).saveSynchronizationProtocol(createProtocolName(name));
				} catch (final Throwable t) {
					System.err.println("Failed to save protocol xmi: " + t + "\nMessage: " + t.getMessage());
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
