/**
 *
 */
package org.gravity.modisco.processing.fwd;

import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.TypeDeclarationStatement;
import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.processing.AbstractTypedModiscoProcessor;

/**
 * Adds a reference to types declared in methods in the outer type
 *
 * @author speldszus
 *
 */
public class TypeDeclarationStatementPreprocessor extends AbstractTypedModiscoProcessor<TypeDeclarationStatement> {

	@Override
	public boolean process(MGravityModel model, Collection<TypeDeclarationStatement> elements, IProgressMonitor monitor) {
		elements.forEach(this::preprocessTypeDeclarationStatement);
		return true;
	}

	@Override
	public Class<TypeDeclarationStatement> getSupportedType() {
		return TypeDeclarationStatement.class;
	}

	/**
	 * Searches the method in which a type is declared and adds the type to the
	 * inner types of the method
	 *
	 * @param statement The type declaration statement
	 */
	private void preprocessTypeDeclarationStatement(TypeDeclarationStatement statement) {
		final AbstractTypeDeclaration type = statement.getDeclaration();
		EObject eObject = statement.eContainer();
		while (!(eObject instanceof MAbstractMethodDefinition)) {
			eObject = eObject.eContainer();
		}
		((MAbstractMethodDefinition) eObject).getMInnerTypes().add(type);
	}

}
