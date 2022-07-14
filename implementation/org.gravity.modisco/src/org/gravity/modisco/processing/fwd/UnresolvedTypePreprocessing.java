package org.gravity.modisco.processing.fwd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.UsageCrossReferencer;
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.UnresolvedItemAccess;
import org.eclipse.modisco.java.UnresolvedTypeDeclaration;
import org.eclipse.modisco.java.emf.JavaFactory;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.processing.AbstractTypedModiscoProcessor;
import org.gravity.modisco.util.MoDiscoUtil;

public class UnresolvedTypePreprocessing extends AbstractTypedModiscoProcessor<UnresolvedTypeDeclaration> {

	private static final Logger LOGGER = Logger.getLogger(UnresolvedTypePreprocessing.class);

	@Override
	public boolean process(final MGravityModel model, final Collection<UnresolvedTypeDeclaration> elements,
			final IFolder debug, final IProgressMonitor monitor) {

		final var types = MoDiscoUtil.getAllTypes(model);

		final List<EObject> delete = new LinkedList<>();
		final var replacements = new HashMap<UnresolvedTypeDeclaration, AbstractTypeDeclaration>();
		for (final UnresolvedTypeDeclaration decl : elements) {
			final var result = types.parallelStream().filter(t -> t.getName().equals(decl.getName())).findAny();
			if (result.isPresent()) {
				final var replacement = result.get();
				replacements.put(decl, replacement);
				for (final TypeAccess access : new ArrayList<>(decl.getUsagesInTypeAccess())) {
					access.setType(replacement);
				}
				delete.add(decl);
			}
		}

		final var usages = UsageCrossReferencer.findAll(replacements.keySet(), model.eResource());
		for (final Entry<EObject, Collection<Setting>> entry : usages.entrySet()) {
			final var decl = (UnresolvedTypeDeclaration) entry.getKey();
			for (final Setting setting : entry.getValue()) {
				final var eObject = setting.getEObject();
				if (eObject instanceof UnresolvedItemAccess) {
					final var access = JavaFactory.eINSTANCE.createTypeAccess();
					access.setType(replacements.get(decl));
					EcoreUtil.replace(eObject, access);
					delete.add(eObject);
				} else {
					LOGGER.error("Unhandled reference: "+setting);
				}
			}
		}

		EcoreUtil.deleteAll(delete, true);
		return true;
	}

	@Override
	public Class<UnresolvedTypeDeclaration> getSupportedType() {
		return UnresolvedTypeDeclaration.class;
	}

}
