package org.gravity.modisco;

import org.eclipse.gmt.modisco.java.Annotation;
import org.eclipse.gmt.modisco.java.AnonymousClassDeclaration;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.MethodInvocation;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.emf.impl.JavaFactoryImpl;
import org.gravity.modisco.bugfixes.MAnnotationImpl_bugfix;

/**
 * A factory overwrite for providing GRaViTY MoDisco elements
 * 
 * @author speldszus
 *
 */
@SuppressWarnings("restriction")
public class GravityMoDiscoFactoryImpl extends JavaFactoryImpl {

	@Override
	public AnonymousClassDeclaration createAnonymousClassDeclaration() {
		return ModiscoFactory.eINSTANCE.createMAnonymous();
	}

	@Override
	public Annotation createAnnotation() {
		return new MAnnotationImpl_bugfix();
	}

	@Override
	public ClassDeclaration createClassDeclaration() {
		return ModiscoFactory.eINSTANCE.createMClass();
	}

	@Override
	public final Model createModel() {
		return ModiscoFactory.eINSTANCE.createMGravityModel();
	}

	@Override
	public MConstructorDefinition createConstructorDeclaration() {
		MConstructorDefinition decl = ModiscoFactory.eINSTANCE.createMConstructorDefinition();
		MParameterList mParameterList = ModiscoFactory.eINSTANCE.createMParameterList();
		decl.setMParameterList(mParameterList);
		return decl;
	}

	@Override
	public MMethodDefinition createMethodDeclaration() {
		return ModiscoFactory.eINSTANCE.createMMethodDefinition();
	}

	@Override
	public MFieldDefinition createFieldDeclaration() {
		return ModiscoFactory.eINSTANCE.createMFieldDefinition();
	}

	@Override
	public MethodInvocation createMethodInvocation() {
		return ModiscoFactory.eINSTANCE.createMMethodInvocation();
	}
}
