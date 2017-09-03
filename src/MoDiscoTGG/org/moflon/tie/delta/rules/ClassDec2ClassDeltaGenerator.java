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

public class ClassDec2ClassDeltaGenerator implements DeltaGenerator {

	@Override
	public DeltaResult applyForward(IndexedModel<Model> model, Random r) {
		// find
		int size = model.size(Package.class);
		if (size == 0) {
			return DeltaResult.EMPTY;
		}
		Package container = model.get(Package.class, r.nextInt(size));
		// create objects
		ClassDeclaration classDeclaration = JavaFactory.eINSTANCE.createClassDeclaration();
		// create primitives
		String name = Long.toString(r.nextLong(), 32);
		// create edges
		container.getOwnedElements().add(classDeclaration);
		// set primitives
		classDeclaration.setName(name);

		return new DeltaResult(2, classDeclaration);
	}

	@Override
	public DeltaResult applyBackward(IndexedModel<org.eclipse.uml2.uml.Model> model, Random r) {
		// find
		int size = model.size(org.eclipse.uml2.uml.Package.class);
		if (size == 0) {
			return DeltaResult.EMPTY;
		}
		org.eclipse.uml2.uml.Package container = model.get(org.eclipse.uml2.uml.Package.class, r.nextInt(size));
		// create objects
		org.eclipse.uml2.uml.Class clazz = UMLFactory.eINSTANCE.createClass();
		// create primitives
		String name = Long.toString(r.nextLong(), 32);
		// create edges
		container.getPackagedElements().add(clazz);
		// set primitives
		clazz.setName(name);
		
		return new DeltaResult(2, clazz);
	}

	@Override
	public Set<Class<?>> getForwardInterests() {
		return Stream.of(Package.class).collect(Collectors.toSet());
	}

	@Override
	public Set<Class<?>> getBackwardInterests() {
		return Stream.of(org.eclipse.uml2.uml.Package.class).collect(Collectors.toSet());
	}

}
