package MoDiscoTGG.org.moflon.tie.delta.rules;

import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.Package;
import org.eclipse.gmt.modisco.java.emf.JavaFactory;
import org.eclipse.uml2.uml.UMLFactory;

import MoDiscoTGG.org.moflon.tie.delta.DeltaGenerator;
import MoDiscoTGG.org.moflon.tie.delta.DeltaResult;
import MoDiscoTGG.org.moflon.tie.delta.IndexedModel;
import jdk.nashorn.internal.ir.SetSplitState;

public class JavaPackageToUMLPackageDeltaGenerator implements DeltaGenerator {

	@Override
	public DeltaResult applyForward(IndexedModel<Model> model, Random r) {
		// find
		int s = model.size(org.eclipse.gmt.modisco.java.Package.class);
		if (s == 0) {
			return DeltaResult.EMPTY;
		}
		org.eclipse.gmt.modisco.java.Package container = model.get(org.eclipse.gmt.modisco.java.Package.class, r.nextInt(s));
		// create objects
		Package newPackage = JavaFactory.eINSTANCE.createPackage();
		
		// create primitives
		String name = Long.toString(r.nextLong(), 32);
		
		// create edges
		container.getOwnedPackages().add(newPackage);

		// set primitives
		newPackage.setName(name);

		return new DeltaResult(2, newPackage);
	}

	@Override
	public DeltaResult applyBackward(IndexedModel<org.eclipse.uml2.uml.Model> model, Random r) {
		// find
		int s = model.size(org.eclipse.uml2.uml.Package.class);
		if (s == 0) {
			return DeltaResult.EMPTY;
		}
		org.eclipse.uml2.uml.Package container = model.get(org.eclipse.uml2.uml.Package.class, r.nextInt(s));
		// create objects
		org.eclipse.uml2.uml.Package newPackage = UMLFactory.eINSTANCE.createPackage();
		
		// create primitives
		String name = Long.toString(r.nextLong(), 32);
		
		// create edges
		container.getPackagedElements().add(newPackage);

		// set primitives
		newPackage.setName(name);

		return new DeltaResult(2, newPackage);
	}

	@Override
	public Set<Class<?>> getForwardInterests() {
		return Stream.of(org.eclipse.gmt.modisco.java.Package.class).collect(Collectors.toSet());
	}

	@Override
	public Set<Class<?>> getBackwardInterests() {
		return Stream.of(org.eclipse.uml2.uml.Package.class).collect(Collectors.toSet());
	}

}
