package org.gravity.modisco;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.emf.impl.JavaFactoryImpl;

public class GravityMoDiscoFactoryImpl extends JavaFactoryImpl {

	private MGravityModel model = null;
	private Set<MMethodDefinition> mdefs;
	private Set<MFieldDefinition> fdefs;
	private Set<MConstructorDefinition> cdefs;

	@Override
	public Model createModel() {
		this.model = ModiscoFactory.eINSTANCE.createMGravityModel();
		this.mdefs = new HashSet<>();
		this.fdefs = new HashSet<>();
		this.cdefs = new HashSet<>();
		return this.model;
	}

	@Override
	public MConstructorDefinition createConstructorDeclaration() {
		MConstructorDefinition decl = ModiscoFactory.eINSTANCE.createMConstructorDefinition();
		if (this.model != null) {
			this.cdefs.add(decl);
			this.model.getMConstructorDefinitions().add(decl);
			this.model.getMAbstractMethodDefinitions().add(decl);
			decl.setModel(this.model);
		}
		return decl;
	}

	@Override
	public MMethodDefinition createMethodDeclaration() {
		MMethodDefinition decl = ModiscoFactory.eINSTANCE.createMMethodDefinition();
		if (this.model != null) {
			this.mdefs.add(decl);
			this.model.getMMethodDefinitions().add(decl);
			this.model.getMAbstractMethodDefinitions().add(decl);
			decl.setModel(this.model);
		}
		return decl;
	}

	@Override
	public MFieldDefinition createFieldDeclaration() {
		MFieldDefinition decl = ModiscoFactory.eINSTANCE.createMFieldDefinition();
		if (this.model != null) {
			this.fdefs.add(decl);
			this.model.getMFieldDefinitions().add(decl);
			decl.setModel(this.model);
		}
		return decl;
	}

	public Set<MMethodDefinition> getMdefs() {
		return this.mdefs;
	}

	public Set<MFieldDefinition> getFdefs() {
		return this.fdefs;
	}

	public Set<MConstructorDefinition> getCdefs() {
		return this.cdefs;
	}

}
