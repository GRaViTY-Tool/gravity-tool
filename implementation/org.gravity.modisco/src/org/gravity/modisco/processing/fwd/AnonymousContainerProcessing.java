/**
 *
 */
package org.gravity.modisco.processing.fwd;

import java.util.Collection;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.eclipse.modisco.java.ClassFile;
import org.eclipse.modisco.java.CompilationUnit;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.processing.AbstractTypedModiscoProcessor;

/**
 * A processor for adding anonymous classes to compilation units or class files
 * 
 * Has to be executed after TypeContainerProcessing
 *
 * @author speldszus
 *
 */
public class AnonymousContainerProcessing extends AbstractTypedModiscoProcessor<AnonymousClassDeclaration> {

	/**
	 * The logger of this class
	 */
	private static final Logger LOGGER = Logger.getLogger(AnonymousContainerProcessing.class);

	@Override
	public boolean process(final MGravityModel model, final Collection<AnonymousClassDeclaration> elements,
			final IFolder debug, final IProgressMonitor monitor) {
		for (AnonymousClassDeclaration type : elements) {
			if (type.getOriginalClassFile() == null && type.getOriginalCompilationUnit() == null) {
				EObject container = type.getClassInstanceCreation();
				while (!(container instanceof AbstractTypeDeclaration)) {
					container = container.eContainer();
					if (container == null) {
						LOGGER.error("Found anonymous class that ois not contained in a type: " + type);
						return false;
					}
				}
				CompilationUnit cu = ((AbstractTypeDeclaration) container).getOriginalCompilationUnit();
				if (cu != null) {
					type.setOriginalCompilationUnit(cu);
				} else {
					ClassFile cf = ((AbstractTypeDeclaration) container).getOriginalClassFile();
					if (cf != null) {
						type.setOriginalClassFile(cf);
					} else {
						LOGGER.error("The type containing an anonymous class is not in a container: " + container);
						return false;
					}
				}
			}
		}
		return true;
	}

	@Override
	public Class<AnonymousClassDeclaration> getSupportedType() {
		return AnonymousClassDeclaration.class;
	}

}
