/**
 *
 */
package org.gravity.modisco.processing.fwd;

import java.util.Collection;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.java.AbstractMethodDeclaration;
import org.eclipse.modisco.java.SingleVariableAccess;
import org.eclipse.modisco.java.VariableDeclarationExpression;
import org.eclipse.modisco.java.emf.JavaFactory;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.processing.AbstractTypedModiscoProcessor;

/**
 * Adds a reference to types declared in methods in the outer type
 *
 * @author speldszus
 *
 */
public class TryWithPreprocessing extends AbstractTypedModiscoProcessor<SingleVariableAccess> {

	@Override
	public boolean process(final MGravityModel model, final Collection<SingleVariableAccess> elements,
			final IFolder debug,
			final IProgressMonitor monitor) {
		elements.forEach(this::preprocessSingleVariableAccess);
		return true;
	}

	@Override
	public Class<SingleVariableAccess> getSupportedType() {
		return SingleVariableAccess.class;
	}

	/**
	 * Searches the method in which a type is declared and adds the type to the
	 * inner types of the method
	 *
	 * @param statement The type declaration statement
	 */
	private void preprocessSingleVariableAccess(final SingleVariableAccess access) {
		final var decl = access.getVariable().eContainer();
		if (decl instanceof final VariableDeclarationExpression expression && decl.eContainer() == null) {
			EObject container = access;
			while (!(container instanceof AbstractMethodDeclaration)) {
				container = container.eContainer();
			}
			final var statement = JavaFactory.eINSTANCE.createVariableDeclarationStatement();
			statement.getFragments().addAll(expression.getFragments());
			statement.setType(expression.getType());
			statement.setModifier(expression.getModifier());
			statement.getAnnotations().addAll(expression.getAnnotations());
			((AbstractMethodDeclaration) container).getBody().getStatements().add(statement);
		}
	}

}
