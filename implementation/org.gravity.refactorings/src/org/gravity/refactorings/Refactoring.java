package org.gravity.refactorings;

import java.util.Collection;

import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.refactorings.configuration.TRefactoringID;
import org.gravity.typegraph.basic.TClass;

public interface Refactoring {
	
	boolean isApplicable(RefactoringConfiguration configuration);
	
	Collection<TClass> perform(RefactoringConfiguration configuration);
	
	TRefactoringID getRefactoringID();

}
