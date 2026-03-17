package org.gravity.tgg.modisco.pm.processing.modisco;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.CompilationUnit;
import org.eclipse.modisco.java.ImportDeclaration;
import org.eclipse.modisco.java.NamedElement;
import org.eclipse.modisco.java.Package;
import org.eclipse.modisco.java.emf.JavaFactory;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.processing.IMoDiscoProcessor;

public class MoDiscoProcessorBwd implements IMoDiscoProcessor {

	@Override
	public boolean process(final MGravityModel model, final IFolder debug, final IProgressMonitor monitor) {
		final Deque<Package> packages = new LinkedList<>(model.getOwnedElements());
		while (!packages.isEmpty()) {
			final Package p = packages.pop();
			packages.addAll(p.getOwnedPackages());
			for (final AbstractTypeDeclaration t : p.getOwnedElements()) {
				if (!t.isProxy()) {
					CompilationUnit cu = t.getOriginalCompilationUnit();
					if ((t.getOriginalClassFile() == null) && (cu == null)) {
						cu = JavaFactory.eINSTANCE.createCompilationUnit();
						cu.getTypes().add(t);
						cu.setPackage(p);
						cu.setName(t.getName() + ".java"); //$NON-NLS-1$
						t.setOriginalCompilationUnit(cu);
						model.getCompilationUnits().add(cu);
					}
					final Set<NamedElement> types = new HashSet<>();
					for (final ImportDeclaration i : cu.getImports()) {
						types.add(i.getImportedElement());
					}
					for (final Annotation a : t.getAnnotations()) {
						final org.eclipse.modisco.java.Type type = a.getType().getType();
						if (!types.contains(type)) {
							final ImportDeclaration imp = JavaFactory.eINSTANCE.createImportDeclaration();
							imp.setImportedElement(type);
							cu.getImports().add(imp);
						}
					}
				}
			}
		}
		return true;
	}

}
