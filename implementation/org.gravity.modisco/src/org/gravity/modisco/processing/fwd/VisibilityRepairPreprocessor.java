package org.gravity.modisco.processing.fwd;

import java.util.Collection;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.Modifier;
import org.eclipse.gmt.modisco.java.TypeDeclarationStatement;
import org.eclipse.gmt.modisco.java.VisibilityKind;
import org.eclipse.osgi.util.NLS;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.Messages;
import org.gravity.modisco.processing.AbstractTypedModiscoProcessor;
import org.gravity.modisco.util.NameUtil;

/**
 * Checks and repairs all modifiers of the model
 *
 * @author speldszus
 *
 */
public class VisibilityRepairPreprocessor extends AbstractTypedModiscoProcessor<Modifier> {

	private static final Logger LOGGER = Logger.getLogger(VisibilityRepairPreprocessor.class);

	@Override
	public boolean process(MGravityModel model, Collection<Modifier> elements, IProgressMonitor monitor) {
		for (final Modifier modifier : elements) {
			if (!checkAndrepairModifierVisibility(modifier)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public Class<Modifier> getSupportedType() {
		return Modifier.class;
	}

	/**
	 * Checks if the visibility of a modifier is set and tries to repair it if not
	 *
	 * @param modifier The modifier
	 * @return true, if there was no problem or the problem has been repaired.
	 */
	private boolean checkAndrepairModifierVisibility(Modifier modifier) {
		if (modifier.getVisibility() == null) {
			final AbstractTypeDeclaration typeDecl = modifier.getBodyDeclaration().getAbstractTypeDeclaration();
			if (typeDecl.eContainer() instanceof TypeDeclarationStatement) {
				modifier.setVisibility(VisibilityKind.PRIVATE);
			} else {
				if (LOGGER.isEnabledFor(Level.WARN)) {
					LOGGER.warn(NLS.bind(Messages.errorTypeNoVisibility, NameUtil.getFullyQualifiedName(typeDecl)));
				}
				return false;
			}
		}
		return true;
	}
}
