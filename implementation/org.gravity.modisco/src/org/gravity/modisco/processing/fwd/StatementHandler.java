package org.gravity.modisco.processing.fwd;

import org.eclipse.gmt.modisco.java.AssertStatement;
import org.eclipse.gmt.modisco.java.Block;
import org.eclipse.gmt.modisco.java.BreakStatement;
import org.eclipse.gmt.modisco.java.CatchClause;
import org.eclipse.gmt.modisco.java.ConstructorInvocation;
import org.eclipse.gmt.modisco.java.ContinueStatement;
import org.eclipse.gmt.modisco.java.DoStatement;
import org.eclipse.gmt.modisco.java.EmptyStatement;
import org.eclipse.gmt.modisco.java.EnhancedForStatement;
import org.eclipse.gmt.modisco.java.Expression;
import org.eclipse.gmt.modisco.java.ExpressionStatement;
import org.eclipse.gmt.modisco.java.ForStatement;
import org.eclipse.gmt.modisco.java.IfStatement;
import org.eclipse.gmt.modisco.java.LabeledStatement;
import org.eclipse.gmt.modisco.java.ReturnStatement;
import org.eclipse.gmt.modisco.java.Statement;
import org.eclipse.gmt.modisco.java.SuperConstructorInvocation;
import org.eclipse.gmt.modisco.java.SwitchCase;
import org.eclipse.gmt.modisco.java.SwitchStatement;
import org.eclipse.gmt.modisco.java.SynchronizedStatement;
import org.eclipse.gmt.modisco.java.ThrowStatement;
import org.eclipse.gmt.modisco.java.TryStatement;
import org.eclipse.gmt.modisco.java.TypeDeclarationStatement;
import org.eclipse.gmt.modisco.java.UnresolvedLabeledStatement;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;
import org.eclipse.gmt.modisco.java.VariableDeclarationStatement;
import org.eclipse.gmt.modisco.java.WhileStatement;
import org.gravity.modisco.MDefinition;

public class StatementHandler {
	
	private StatementHandler() {
		// This class shouldn't be instantiated
	}

	public static boolean handle(Statement statement, MDefinition member) {
		if (statement == null) {
			return true; // assume nothing to do is success
		}
		if (statement instanceof AssertStatement) {
			AssertStatement assertStatement = (AssertStatement) statement;
			return handle(assertStatement, member);
		} else if (statement instanceof Block) {
			Block block = (Block) statement;
			return handle(block, member);
		} else if (statement instanceof BreakStatement) {
			BreakStatement breakStatement = (BreakStatement) statement;
			return handle(breakStatement, member);
		} else if (statement instanceof CatchClause) {
			CatchClause catchClause = (CatchClause) statement;
			return handle(catchClause, member);
		} else if (statement instanceof ConstructorInvocation) {
			ConstructorInvocation constructorInvocation = (ConstructorInvocation) statement;
			return handle(constructorInvocation, member);
		} else if (statement instanceof ContinueStatement) {
			ContinueStatement continueStatement = (ContinueStatement) statement;
			return handle(continueStatement, member);
		} else if (statement instanceof DoStatement) {
			DoStatement doStatement = (DoStatement) statement;
			return handle(doStatement, member);
		} else if (statement instanceof EmptyStatement) {
			// Nothing to do here
			return true;
		} else if (statement instanceof EnhancedForStatement) {
			EnhancedForStatement enhancedForStetement = (EnhancedForStatement) statement;
			return handle(enhancedForStetement, member);
		} else if (statement instanceof ExpressionStatement) {
			ExpressionStatement expressionStatement = (ExpressionStatement) statement;
			return handle(expressionStatement, member);
		} else if (statement instanceof ForStatement) {
			ForStatement forStatement = (ForStatement) statement;
			return handle(forStatement, member);
		} else if (statement instanceof IfStatement) {
			IfStatement ifStatement = (IfStatement) statement;
			return handle(ifStatement, member);
		} else if (statement instanceof LabeledStatement) {
			LabeledStatement labeledStatement = (LabeledStatement) statement;
			return handle(labeledStatement, member);
		} else if (statement instanceof ReturnStatement) {
			ReturnStatement returnStatement = (ReturnStatement) statement;
			return handle(returnStatement, member);
		} else if (statement instanceof SuperConstructorInvocation) {
			SuperConstructorInvocation superConstructorInvocation = (SuperConstructorInvocation) statement;
			return handle(superConstructorInvocation, member);
		} else if (statement instanceof SwitchCase) {
			SwitchCase switchCase = (SwitchCase) statement;
			return handle(switchCase, member);
		} else if (statement instanceof SwitchStatement) {
			SwitchStatement switchStatement = (SwitchStatement) statement;
			return handle(switchStatement, member);
		} else if (statement instanceof SynchronizedStatement) {
			SynchronizedStatement synchronizedStatement = (SynchronizedStatement) statement;
			return handle(synchronizedStatement, member);
		} else if (statement instanceof ThrowStatement) {
			ThrowStatement throwStatement = (ThrowStatement) statement;
			return handle(throwStatement, member);
		} else if (statement instanceof TryStatement) {
			TryStatement tryStatement = (TryStatement) statement;
			return handle(tryStatement, member);
		} else if (statement instanceof TypeDeclarationStatement) {
			// Nothing to do here
			return true;
		} else if (statement instanceof UnresolvedLabeledStatement) {
			UnresolvedLabeledStatement unresolvedLabeledStatement = (UnresolvedLabeledStatement) statement;
			return handle(unresolvedLabeledStatement, member);
		} else if (statement instanceof VariableDeclarationStatement) {
			VariableDeclarationStatement variableDeclarationStatement = (VariableDeclarationStatement) statement;
			return handle(variableDeclarationStatement, member);
		} else if (statement instanceof WhileStatement) {
			WhileStatement whileStatement = (WhileStatement) statement;
			return handle(whileStatement, member);
		} else {
			return false;
		}
	}

	private static boolean handle(WhileStatement whileStatement, MDefinition member) {
		if (whileStatement == null) {
			return true; // assume nothing to do is success
		}
		if (!handle(whileStatement.getBody(), member)) {
			return false;
		}
		return ExpressionHandler.handle(whileStatement.getExpression(), member);
	}

	private static boolean handle(VariableDeclarationStatement variableDeclarationStatement, MDefinition member) {
		if (variableDeclarationStatement == null) {
			return true; // assume nothing to do is success
		}
		for (VariableDeclarationFragment fragment : variableDeclarationStatement.getFragments()) {
			if (!ExpressionHandler.handle(fragment.getInitializer(), member)) {
				return false;
			}
		}
		return true;
	}

	private static boolean handle(TryStatement tryStatement, MDefinition member) {
		if (tryStatement == null) {
			return true; // assume nothing to do is success
		}
		if (!handle(tryStatement.getBody(), member)) {
			return false;
		}
		if (!handle(tryStatement.getFinally(), member)) {
			return false;
		}
		for (CatchClause clause : tryStatement.getCatchClauses()) {
			if (!handle(clause, member)) {
				return false;
			}
		}
		return true;
	}

	private static boolean handle(ThrowStatement throwStatement, MDefinition member) {
		if (throwStatement == null) {
			return true; // assume nothing to do is success
		}
		return ExpressionHandler.handle(throwStatement.getExpression(), member);
	}

	private static boolean handle(SynchronizedStatement synchronizedStatement, MDefinition member) {
		if (synchronizedStatement == null) {
			return true; // assume nothing to do is success
		}
		if (!handle(synchronizedStatement.getBody(), member)) {
			return false;
		}
		return ExpressionHandler.handle(synchronizedStatement.getExpression(), member);
	}

	private static boolean handle(SwitchStatement switchStatement, MDefinition member) {
		if (switchStatement == null) {
			return true; // assume nothing to do is success
		}
		for (Statement statement : switchStatement.getStatements()) {
			if (!handle(statement, member)) {
				return false;
			}
		}
		return ExpressionHandler.handle(switchStatement.getExpression(), member);
	}

	private static boolean handle(SwitchCase switchCase, MDefinition member) {
		if (switchCase == null) {
			return true; // assume nothing to do is success
		}
		return ExpressionHandler.handle(switchCase.getExpression(), member);
	}

	private static boolean handle(SuperConstructorInvocation superConstructorInvocation, MDefinition member) {
		if (superConstructorInvocation == null) {
			return true; // assume nothing to do is success
		}
		if (!ExpressionHandler.handle(superConstructorInvocation.getExpression(), member)) {
			return false;
		}
		for (Expression expression : superConstructorInvocation.getArguments()) {
			if (!ExpressionHandler.handle(expression, member)) {
				return false;
			}
		}
		return true;
	}

	private static boolean handle(ReturnStatement returnStatement, MDefinition member) {
		if (returnStatement == null) {
			return true; // assume nothing to do is success
		}
		return ExpressionHandler.handle(returnStatement.getExpression(), member);
	}

	private static boolean handle(LabeledStatement labeledStatement, MDefinition member) {
		if (labeledStatement == null) {
			return true; // assume nothing to do is success
		}
		return handle(labeledStatement.getBody(), member);
	}

	private static boolean handle(IfStatement ifStatement, MDefinition member) {
		if (ifStatement == null) {
			return true; // assume nothing to do is success
		}
		if (!handle(ifStatement.getElseStatement(), member)) {
			return false;
		}
		if (!handle(ifStatement.getThenStatement(), member)) {
			return false;
		}
		return ExpressionHandler.handle(ifStatement.getExpression(), member);
	}

	private static boolean handle(ForStatement forStatement, MDefinition member) {
		if (forStatement == null) {
			return true; // assume nothing to do is success
		}
		if (!handle(forStatement.getBody(), member)) {
			return false;
		}
		if (!ExpressionHandler.handle(forStatement.getExpression(), member)) {
			return false;
		}
		for (Expression expression : forStatement.getInitializers()) {
			if (!ExpressionHandler.handle(expression, member)) {
				return false;
			}
		}
		for (Expression expression : forStatement.getUpdaters()) {
			if (!ExpressionHandler.handle(expression, member)) {
				return false;
			}
		}
		return true;
	}

	private static boolean handle(ExpressionStatement expressionStatement, MDefinition member) {
		if (expressionStatement == null) {
			return true; // assume nothing to do is success
		}
		return ExpressionHandler.handle(expressionStatement.getExpression(), member);
	}

	private static boolean handle(EnhancedForStatement enhancedForStetement, MDefinition member) {
		if (enhancedForStetement == null) {
			return true; // assume nothing to do is success
		}
		if (!handle(enhancedForStetement.getBody(), member)) {
			return false;
		}
		return ExpressionHandler.handle(enhancedForStetement.getExpression(), member);
	}

	private static boolean handle(DoStatement doStatement, MDefinition member) {
		if (doStatement == null) {
			return true; // assume nothing to do is success
		}
		if (!handle(doStatement.getBody(), member)) {
			return false;
		}
		return ExpressionHandler.handle(doStatement.getExpression(), member);
	}

	private static boolean handle(ContinueStatement continueStatement, MDefinition member) {
		if (continueStatement == null) {
			return true; // assume nothing to do is success
		}
		return handle(continueStatement.getLabel(), member);
	}

	private static boolean handle(ConstructorInvocation constructorInvocation, MDefinition member) {
		if (constructorInvocation == null) {
			return true; // assume nothing to do is success
		}
		for (Expression argument : constructorInvocation.getArguments()) {
			if (!ExpressionHandler.handle(argument, member)) {
				return false;
			}
		}
		if(member.getMMethodInvocations().contains(constructorInvocation)){
			return true;
		}
		return member.getMMethodInvocations().add(constructorInvocation);
	}

	private static boolean handle(BreakStatement breakStatement, MDefinition member) {
		if (breakStatement == null) {
			return true; // assume nothing to do is success
		}
		return handle(breakStatement.getLabel(), member);
	}

	private static boolean handle(CatchClause catchClause, MDefinition member) {
		if (catchClause == null) {
			return true; // assume nothing to do is success
		}
		if (!handle(catchClause.getBody(), member)) {
			return false;
		}
		return ExpressionHandler.handle(catchClause.getException().getInitializer(), member);
	}

	private static boolean handle(AssertStatement assertStatement, MDefinition member) {
		if (assertStatement == null) {
			return true; // assume nothing to do is success
		}
		if (!ExpressionHandler.handle(assertStatement.getExpression(), member)) {
			return false;
		}
		return ExpressionHandler.handle(assertStatement.getMessage(), member);
	}

	private static boolean handle(Block block, MDefinition member) {
		if (block == null) {
			return true; // assume nothing to do is success
		}
		for (Statement statement : block.getStatements()) {
			if (!handle(statement, member)) {
				return false;
			}
		}
		return true;
	}

}
