package MoDiscoTGG.org.moflon.tie.delta.rules;

import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.FieldDeclaration;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.TypeAccess;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;
import org.eclipse.gmt.modisco.java.emf.JavaFactory;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;

import MoDiscoTGG.org.moflon.tie.delta.DeltaGenerator;
import MoDiscoTGG.org.moflon.tie.delta.DeltaResult;
import MoDiscoTGG.org.moflon.tie.delta.IndexedModel;

public class FieldDec2Property4ClassDeltaGenerator implements DeltaGenerator {

	@Override
	public DeltaResult applyForward(IndexedModel<Model> model, Random r) {
		// find
		int s = model.size(ClassDeclaration.class);
		if (s == 0) {
			return DeltaResult.EMPTY;
		}
		ClassDeclaration container = model.get(ClassDeclaration.class, r.nextInt(s));
		s = model.size(Type.class);
		if (s == 0) {
			return DeltaResult.EMPTY;
		}
		Type type = model.get(Type.class, r.nextInt(s));
		// create objects
		FieldDeclaration fieldDeclaration = JavaFactory.eINSTANCE.createFieldDeclaration();
		TypeAccess typeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		VariableDeclarationFragment vdf = JavaFactory.eINSTANCE.createVariableDeclarationFragment();
		// create primitive types
		String name = Long.toString(r.nextLong(), 32);
		// create edges
		fieldDeclaration.setType(typeAccess);
		fieldDeclaration.getFragments().add(vdf);
		typeAccess.setType(type);
		container.getBodyDeclarations().add(fieldDeclaration);
		// set primitive types
		vdf.setName(name);

		return new DeltaResult(7, new EObject[] { fieldDeclaration, vdf, typeAccess });
	}

	@Override
	public DeltaResult applyBackward(IndexedModel<org.eclipse.uml2.uml.Model> model, Random r) {
		// find
		int s = model.size(org.eclipse.uml2.uml.Class.class);
		if (s == 0) {
			return DeltaResult.EMPTY;
		}
		org.eclipse.uml2.uml.Class clazz = model.get(org.eclipse.uml2.uml.Class.class, r.nextInt(s));

		s = model.size(org.eclipse.uml2.uml.Type.class);
		if (s == 0) {
			return DeltaResult.EMPTY;
		}
		org.eclipse.uml2.uml.Type type = model.get(org.eclipse.uml2.uml.Type.class, r.nextInt(s));
		// create objects
		Property property = UMLFactory.eINSTANCE.createProperty();
		// create "primitive" types
		String name = Long.toString(r.nextLong(), 32);
		// create edges
		clazz.getOwnedAttributes().add(property);
		property.setType(type);
		// set primitive types
		property.setName(name);

		return new DeltaResult(3, new EObject[] { property });
	}

	@Override
	public Set<Class<?>> getForwardInterests() {
		return Stream.of(ClassDeclaration.class, org.eclipse.gmt.modisco.java.Type.class).collect(Collectors.toSet());
	}

	@Override
	public Set<Class<?>> getBackwardInterests() {
		return Stream.of(org.eclipse.uml2.uml.Class.class, org.eclipse.uml2.uml.Type.class).collect(Collectors.toSet());
	}

}
