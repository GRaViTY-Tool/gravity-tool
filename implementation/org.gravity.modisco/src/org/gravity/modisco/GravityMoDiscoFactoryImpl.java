package org.gravity.modisco;

import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.EnumConstantDeclaration;
import org.eclipse.modisco.java.Initializer;
import org.eclipse.modisco.java.MethodInvocation;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.emf.impl.JavaFactoryImpl;
import org.gravity.modisco.bugfixes.MAnnotation;

/**
 * A factory overwrite for providing GRaViTY MoDisco elements
 *
 * @author speldszus
 *
 */
public class GravityMoDiscoFactoryImpl extends JavaFactoryImpl {

	@Override
	public Annotation createAnnotation() {
		return new MAnnotation();
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
		return ModiscoFactory.eINSTANCE.createMConstructorDefinition();
	}

	@Override
	public MMethodDefinition createMethodDeclaration() {
		return ModiscoFactory.eINSTANCE.createMMethodDefinition();
	}

	@Override
	public Initializer createInitializer() {
		return ModiscoFactory.eINSTANCE.createMInitializer();
	}

	@Override
	public MFieldDefinition createFieldDeclaration() {
		return ModiscoFactory.eINSTANCE.createMFieldDefinition();
	}

	@Override
	public MethodInvocation createMethodInvocation() {
		return ModiscoFactory.eINSTANCE.createMMethodInvocation();
	}

	@Override
	public MSingleVariableAccess createSingleVariableAccess() {
		return ModiscoFactory.eINSTANCE.createMSingleVariableAccess();
	}

	@Override
	public MConstructorInvocation createConstructorInvocation() {
		return ModiscoFactory.eINSTANCE.createMConstructorInvocation();
	}

	@Override
	public MSingleVariableDeclaration createSingleVariableDeclaration() {
		return ModiscoFactory.eINSTANCE.createMSingleVariableDeclaration();
	}

	@Override
	public MClassInstanceCreation createClassInstanceCreation() {
		return ModiscoFactory.eINSTANCE.createMClassInstanceCreation();
	}

	@Override
	public MSuperMethodInvocation createSuperMethodInvocation() {
		return ModiscoFactory.eINSTANCE.createMSuperMethodInvocation();
	}

	@Override
	public MSuperConstructorInvocation createSuperConstructorInvocation() {
		return ModiscoFactory.eINSTANCE.createMSuperConstructorInvocation();
	}

	@Override
	public EnumConstantDeclaration createEnumConstantDeclaration() {
		return ModiscoFactory.eINSTANCE.createMEnumConstantDeclaration();
	}
}
