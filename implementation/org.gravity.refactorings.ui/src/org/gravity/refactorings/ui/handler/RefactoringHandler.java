package org.gravity.refactorings.ui.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;

/**
 * An abstract handler for performing refactorings on code selections
 * 
 * @author speldszus
 *
 */
public abstract class RefactoringHandler extends AbstractHandler {
	
	protected static CompilationUnit parse(ICompilationUnit icu) {
		final ASTParser parser = ASTParser.newParser(AST.JLS11);
		parser.setKind(ASTParser.K_COMPILATION_UNIT);
		parser.setSource(icu);
		return (CompilationUnit) parser.createAST(null);
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		return true;
	}

}
