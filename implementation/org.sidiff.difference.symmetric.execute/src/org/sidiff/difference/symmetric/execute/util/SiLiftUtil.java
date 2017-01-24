package org.sidiff.difference.symmetric.execute.util;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.sidiff.common.emf.exceptions.InvalidModelException;
import org.sidiff.common.emf.exceptions.NoCorrespondencesException;
import org.sidiff.difference.symmetric.SymmetricDifference;
import org.sidiff.difference.technical.api.TechnicalDifferenceFacade;
import org.sidiff.difference.technical.api.settings.DifferenceSettings;
import org.sidiff.matcher.IMatcher;

public class SiLiftUtil {

	public static class DifferenceCalculationException extends Exception {
		
		private static final long serialVersionUID = 1L;

		public DifferenceCalculationException(String message) {
			super(message);
		}
	}
	
	public static SymmetricDifference calculateDifference(
			Resource modelA, Resource modelB, IMatcher matcher) 
					throws DifferenceCalculationException {
		
		DifferenceSettings settings = new DifferenceSettings();
		settings.setMergeImports(false);
		settings.setMatcher(matcher);

		try {
			return TechnicalDifferenceFacade.deriveTechnicalDifference(modelA, modelB, settings);
		} catch (InvalidModelException | NoCorrespondencesException e) {
			e.printStackTrace();
		}
		
		throw new DifferenceCalculationException("Difference could not be calculated.");
	}
	
	public static SymmetricDifference calculateDifference(
			Resource modelA, Resource modelB, DifferenceSettings settings) 
					throws DifferenceCalculationException {
		
		settings.setMergeImports(false);
		
		try {
			return TechnicalDifferenceFacade.deriveTechnicalDifference(modelA, modelB, settings);
		} catch (InvalidModelException | NoCorrespondencesException e) {
			e.printStackTrace();
		}
		
		throw new DifferenceCalculationException("Difference could not be calculated.");
	}
	
	public static void saveDifference(SymmetricDifference difference) {
		try {
			URI modelA = difference.getModelA().getURI();
			URI modelB = difference.getModelB().getURI();
			URI differenceURI = modelA.trimSegments(1).appendSegment(
					extractModelName(modelA.segment(modelA.segmentCount() - 1)) + 
					"_x_" +
					extractModelName(modelB.segment(modelA.segmentCount() - 1)))
					.appendFileExtension("symmetric");
			
			ResourceSet rss = difference.getModelA().getResourceSet();
			rss.createResource(differenceURI).getContents().add(difference);
			difference.eResource().save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Cut of the file extension.
	 * 
	 * @param filename
	 *            The file name with extension.
	 * @return The file name without extension.
	 */
	private static String extractModelName(String filename) {
		String fName = new File(filename).getName();
		return fName.substring(0, fName.lastIndexOf('.'));
	}
}
