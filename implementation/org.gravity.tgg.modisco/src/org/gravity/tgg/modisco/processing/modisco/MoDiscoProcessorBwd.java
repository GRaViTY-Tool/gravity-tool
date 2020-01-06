package org.gravity.tgg.modisco.processing.modisco;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Deque;

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
	public boolean process(MGravityModel model, IProgressMonitor monitor) {
		Deque<Package> packages = new LinkedList<>();
		packages.addAll(model.getOwnedElements());

		while (!packages.isEmpty()) {
			Package p = packages.pop();
			packages.addAll(p.getOwnedPackages());
			for (AbstractTypeDeclaration t : p.getOwnedElements()) {
				if (!t.isProxy()) {
					if (t.getOriginalClassFile() != null && t.getOriginalCompilationUnit() == null) {
						CompilationUnit cu = JavaFactory.eINSTANCE.createCompilationUnit();
						cu.getTypes().add(t);
						cu.setPackage(p);
						cu.setName(t.getName() + ".java");
						t.setOriginalCompilationUnit(cu);
						model.getCompilationUnits().add(cu);
					}
					CompilationUnit cu = t.getOriginalCompilationUnit();
					Set<NamedElement> types = new HashSet<>();
					for (ImportDeclaration i : cu.getImports()) {
						types.add(i.getImportedElement());
					}
					for (Annotation a : t.getAnnotations()) {
						org.eclipse.modisco.java.Type type = a.getType().getType();
						if (!types.contains(type)) {
							ImportDeclaration imp = JavaFactory.eINSTANCE.createImportDeclaration();
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
