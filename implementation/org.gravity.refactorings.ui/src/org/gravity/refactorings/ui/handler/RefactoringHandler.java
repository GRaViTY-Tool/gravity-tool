package org.gravity.refactorings.ui.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.PackageDeclaration;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TParameter;
import org.gravity.typegraph.basic.TypeGraph;

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

	/**
	 * Searches for the TClass corresponding to a type declaration
	 * 
	 * @param type The type declaration
	 * @param pg The program model in which should be searched
	 * @return the tClass
	 */
	static TClass getTClass(TypeDeclaration type, TypeGraph pg) {
		TClass tChild = null;

		ASTNode tmpASTNode2 = type.getParent();
		if (tmpASTNode2 instanceof CompilationUnit) {
			CompilationUnit childcu = (CompilationUnit) tmpASTNode2;

			PackageDeclaration childPackage = childcu.getPackage();

			String[] names = childPackage.getName().getFullyQualifiedName().split("\\."); //$NON-NLS-1$
			EList<TPackage> packages = pg.getPackages();
			TPackage next = null;
			for (int i = 0; i < names.length; i++) {
				next = null;
				for (TPackage p : packages) {
					if (p.getTName().equals(names[i])) {
						next = p;
						break;
					}
				}
				if (next == null) {
					throw new IllegalStateException("The program model doesn't contain the expected package structure");
				} else {
					packages = next.getSubpackage();
				}
			}

			for (TClass c : next.getClasses()) {
				if (c.getTName().equals(type.getName().toString())) {
					tChild = c;
					break;
				}
			}
		}
		return tChild;
	}

	TMethodSignature getMethodSignature(TypeGraph pg, MethodDeclaration method) {
		TMethod tMethod = null;
		for (TMethod m : pg.getMethods()) {
			if (m.getTName().equals(method.getName().toString())) {
				tMethod = m;
				break;
			}
		}

		if (tMethod == null) {
			return null;
		}

		for (TMethodSignature s : tMethod.getSignatures()) {
			if (method.parameters().size() != s.getParamList().getEntries().size()) {
				continue;
			}
			boolean success = true;
			TParameter tParam = s.getParamList().getFirst();
			for (Object p : method.parameters()) {
				if (p instanceof SingleVariableDeclaration) {
					SingleVariableDeclaration var = (SingleVariableDeclaration) p;
					Type vt = var.getType();
					if (vt.toString().equals(tParam.getType().getTName())) {
						tParam = tParam.getNext();
					} else {
						success = false;
						break;
					}
				}
			}
			if (success) {
				return s;
			}
		}

		return null;
	}

	protected static CompilationUnit parse(ICompilationUnit icu) {
		final ASTParser parser = ASTParser.newParser(AST.JLS10);
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
