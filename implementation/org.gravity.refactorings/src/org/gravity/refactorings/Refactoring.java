package org.gravity.refactorings;

import java.util.Collection;

import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.refactorings.configuration.TRefactoringID;
import org.gravity.typegraph.basic.TClass;

/**
 * This interface describes every refactoring
 * 
 * @author speldszus
 *
 */
public interface Refactoring {
	
	/**
	 * This method checks if the refactoring is applicable
	 * 
	 * @param configuration The refactoring configuration
	 * @return true, if the refactoring is applicable
	 * @throws RefactoringFailedException if an unexpected error occurred while checking the applicability
	 */
	boolean isApplicable(RefactoringConfiguration configuration) throws RefactoringFailedException;
	
	/**
	 * Performs the refactoring
	 *  
	 * @param configuration The refactoring configuration
	 * @return A list of the changed classes
	 * @throws RefactoringFailedException if an unexpected error occurred while applying the refactoring
	 */
	Collection<TClass> perform(RefactoringConfiguration configuration) throws RefactoringFailedException;
	
	/**
	 * The ID of the refactoring
	 *  
	 * @return the ID
	 */
	TRefactoringID getRefactoringID();

}
