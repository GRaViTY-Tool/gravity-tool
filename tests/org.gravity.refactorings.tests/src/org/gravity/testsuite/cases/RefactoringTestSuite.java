package org.gravity.testsuite.cases;

import org.junit.runner.RunWith;
import com.googlecode.junittoolbox.ParallelSuite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * All refactoring test cases
 * 
 * @author speldszus
 *
 */
@RunWith(ParallelSuite.class)
@SuiteClasses({ RefactoringFinalProgram3Test.class, 
	RefactoringHiddenProgram1Test.class,
		RefactoringHiddenProgram2Test.class, 
		RefactoringHiddenProgram3Test.class, 
		RefactoringPaperExample01Test.class,
		RefactoringPaperExample02Test.class, 
		RefactoringPaperExample03Test.class, 
		RefactoringPaperExample04Test.class })
public class RefactoringTestSuite {

}
