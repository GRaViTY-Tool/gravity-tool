package org.gravity.modisco;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.gmt.modisco.java.Annotation;
import org.eclipse.gmt.modisco.java.AnonymousClassDeclaration;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.emf.impl.JavaFactoryImpl;
import org.gravity.modisco.bugfixes.AnnotationImpl;
import org.gravity.modisco.util.MoDiscoUtil;

/**
 * A factory overwrite for providing GRaViTY MoDisco elements
 * 
 * @author speldszus
 *
 */
public class GravityMoDiscoFactoryImpl extends JavaFactoryImpl {

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
	public ClassDeclaration createClassDeclaration() {
		return ModiscoFactory.eINSTANCE.createMClass();
	}

	@Override
	public final Model createModel() {
		this.mdefs = new HashSet<>();
		this.fdefs = new HashSet<>();
		this.cdefs = new HashSet<>();
		return ModiscoFactory.eINSTANCE.createMGravityModel();
	}

	@Override
	public MConstructorDefinition createConstructorDeclaration() {
		MConstructorDefinition decl = ModiscoFactory.eINSTANCE.createMConstructorDefinition();
		MParameterList mParameterList = ModiscoFactory.eINSTANCE.createMParameterList();
		decl.setMParameterList(mParameterList);
		MoDiscoUtil.fillParamList(decl, mParameterList);
		this.cdefs.add(decl);
		return decl;
	}

	@Override
	public MMethodDefinition createMethodDeclaration() {
		MMethodDefinition decl = ModiscoFactory.eINSTANCE.createMMethodDefinition();
		this.mdefs.add(decl);
		return decl;
	}

	@Override
	public MFieldDefinition createFieldDeclaration() {
		MFieldDefinition decl = ModiscoFactory.eINSTANCE.createMFieldDefinition();
		this.fdefs.add(decl);
		return decl;
	}

	/**
	 * Get all MMethodDefinitions created by this factory
	 * 
	 * @return A set of the method definitions
	 */
	public Set<MMethodDefinition> getMdefs() {
		if (this.mdefs == null) {
			return Collections.emptySet();
		}
		return this.mdefs;
	}

	/**
	 * Get all MFieldDefinitions created by this factory
	 * 
	 * @return A set of the field definitions
	 */
	public Set<MFieldDefinition> getFdefs() {
		if (this.fdefs == null) {
			return Collections.emptySet();
		}
		return this.fdefs;
	}

	/**
	 * Get all MConstructorDefinitions created by this factory
	 * 
	 * @return A set of the constructor definitions
	 */
	public Set<MConstructorDefinition> getCdefs() {
		if (this.cdefs == null) {
			return Collections.emptySet();
		}
		return this.cdefs;
	}
	
	/**
	 * Removes all constructors, methods and fields which are not in a resource
	 */
	public void cleanup() {
		this.mdefs = this.mdefs.stream().filter(m -> m.eResource() != null).collect(Collectors.toSet());
		this.cdefs = this.cdefs.stream().filter(m -> m.eResource() != null).collect(Collectors.toSet());
		this.fdefs = this.fdefs.stream().filter(m -> m.eResource() != null).collect(Collectors.toSet());

		
	}
}
