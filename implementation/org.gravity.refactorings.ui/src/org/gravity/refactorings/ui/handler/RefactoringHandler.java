package org.gravity.refactorings.ui.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TParameter;

/**
 * An abstract handler for performing refactorings on code selections
 * 
 * @author speldszus
 *
 */
public abstract class RefactoringHandler extends AbstractHandler {
	
	String getPUMMessage(TClass tParent, TMethodSignature tSignature) {
		StringBuilder builder = new StringBuilder(
				"All access dependencies have been checked successfully,\nplease check if all implementations of the method\n\n\t");
		builder.append(tSignature.getMethod().getTName());
		builder.append('(');
		TParameter param = tSignature.getParamList().getFirst();
		while (param != null) {
			builder.append(param.getType().getTName());
			param = param.getNext();
			if (param != null) {
				builder.append(", ");
			}
		}
		builder.append(")\n\n");
		builder.append("in the classes\n\n");
		for (TClass c : tParent.getChildClasses()) {
			builder.append('\t');
			builder.append(c.getFullyQualifiedName());
			builder.append('\n');
		}
		builder.append("\nhave an equivalent implementation.");
		return builder.toString();
	}

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
