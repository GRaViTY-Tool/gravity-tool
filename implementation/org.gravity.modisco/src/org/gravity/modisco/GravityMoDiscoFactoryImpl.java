package org.gravity.modisco;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmt.modisco.java.Annotation;
import org.eclipse.gmt.modisco.java.AnonymousClassDeclaration;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.SingleVariableDeclaration;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.TypeParameter;
import org.eclipse.gmt.modisco.java.emf.impl.JavaFactoryImpl;
import org.gravity.modisco.bugfixes.AnnotationImpl;
import org.gravity.modisco.util.MoDiscoUtil;

public class GravityMoDiscoFactoryImpl extends JavaFactoryImpl {

	private MGravityModel model = null;
	private Set<MMethodDefinition> mdefs;
	private Set<MFieldDefinition> fdefs;
	private Set<MConstructorDefinition> cdefs;

	
	@Override
	public AnonymousClassDeclaration createAnonymousClassDeclaration() {
		return ModiscoFactory.eINSTANCE.createMAnonymous();
	}
	@Override
	public Annotation createAnnotation() {
		return new AnnotationImpl();
	}
	
	@Override
	public final Model createModel() {
		this.model = ModiscoFactory.eINSTANCE.createMGravityModel();
		this.mdefs = new HashSet<>();
		this.fdefs = new HashSet<>();
		this.cdefs = new HashSet<>();
		return this.model;
	}

	@Override
	public MConstructorDefinition createConstructorDeclaration() {
		MConstructorDefinition decl = ModiscoFactory.eINSTANCE.createMConstructorDefinition();
		MParameterList mParameterList = ModiscoFactory.eINSTANCE.createMParameterList();
		decl.setMParameterList(mParameterList);
		MoDiscoUtil.fillParamList(decl, mParameterList);
		addMconstructorDefinition(decl);
		return decl;
	}
	public void addMconstructorDefinition(MConstructorDefinition decl) {
		if (this.model != null) {
			this.cdefs.add(decl);
			this.model.getMConstructorDefinitions().add(decl);
			this.model.getMAbstractMethodDefinitions().add(decl);
			decl.setModel(this.model);
		}
	}

	@Override
	public MMethodDefinition createMethodDeclaration() {
		MMethodDefinition decl = ModiscoFactory.eINSTANCE.createMMethodDefinition();
		addMMethodDefinition(decl);
		return decl;
	}
	public void addMMethodDefinition(MMethodDefinition decl) {
		if (this.model != null) {
			this.mdefs.add(decl);
			this.model.getMMethodDefinitions().add(decl);
			this.model.getMAbstractMethodDefinitions().add(decl);
			decl.setModel(this.model);
		}
	}

	@Override
	public MFieldDefinition createFieldDeclaration() {
		MFieldDefinition decl = ModiscoFactory.eINSTANCE.createMFieldDefinition();
		addMFieldDefinition(decl);
		return decl;
	}
	
	public void addMFieldDefinition(MFieldDefinition decl) {
		if (this.model != null) {
			this.fdefs.add(decl);
			this.model.getMFieldDefinitions().add(decl);
			decl.setModel(this.model);
		}
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
