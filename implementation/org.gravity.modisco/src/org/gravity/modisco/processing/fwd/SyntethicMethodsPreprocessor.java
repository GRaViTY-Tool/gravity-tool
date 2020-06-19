package org.gravity.modisco.processing.fwd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.VisibilityKind;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MSyntheticMethodDefinition;
import org.gravity.modisco.ModiscoFactory;
import org.gravity.modisco.processing.AbstractTypedModiscoProcessor;
import org.gravity.modisco.util.MoDiscoUtil;

/**
 * This processor adds synthetic methods to the model
 *
 * This processor is currently not used
 *
 * @author speldszus
 *
 */
public class SyntethicMethodsPreprocessor extends AbstractTypedModiscoProcessor<ClassDeclaration> {

	@Override
	public boolean process(MGravityModel model, Collection<ClassDeclaration> classes, IFolder debug,
			IProgressMonitor monitor) {
		List<ClassDeclaration> seen = new ArrayList<>(classes.size());
		for (ClassDeclaration mClass : classes) {
			addSyntethicMethods(mClass, seen);
		}
		return true;
	}

	private boolean definesWithEqualSignatureMethod(ClassDeclaration mClass, MMethodDefinition methodDef) {
		for (final BodyDeclaration declaration : mClass.getBodyDeclarations()) {
			if (declaration instanceof MMethodDefinition
					&& ((MMethodDefinition) declaration).getMSignature() == methodDef.getMSignature()) {
				return true;
			}

		}
		return false;
	}

	private boolean hasVisibility(ClassDeclaration mClass, ClassDeclaration superClass, MMethodDefinition mDef) {
		final VisibilityKind vis = mDef.getModifier().getVisibility();
		if (vis == VisibilityKind.PUBLIC || vis == VisibilityKind.PROTECTED) {
			return true;
		}
		return (vis == VisibilityKind.NONE && superClass.getPackage() == mClass.getPackage());
	}

	private void addSyntethicMethodsForClass(ClassDeclaration mClass, ClassDeclaration superClass) {
		for (final BodyDeclaration declaration : superClass.getBodyDeclarations()) {
			MMethodDefinition superMethod = null;
			if (declaration instanceof MMethodDefinition) {
				superMethod = (MMethodDefinition) declaration;
			}
			if (declaration instanceof MSyntheticMethodDefinition) {
				superMethod = ((MSyntheticMethodDefinition) declaration).getOriginalMethodDefinition();
			}

			if (superMethod != null && !definesWithEqualSignatureMethod(mClass, superMethod)
					&& hasVisibility(mClass, superClass, superMethod)) {
				final MSyntheticMethodDefinition synt = ModiscoFactory.eINSTANCE.createMSyntheticMethodDefinition();
				synt.setOriginalMethodDefinition(superMethod);
				synt.setName(superMethod.getName());
				mClass.getBodyDeclarations().add(synt);
				superMethod.getSyntheticMethodDefinitions().add(synt);
			}
		}
	}

	private void addSyntethicMethods(ClassDeclaration mClass, List<ClassDeclaration> seen) {
		final ClassDeclaration superClass = MoDiscoUtil.getSuperClass(mClass);
		if (superClass != null && !superClass.isProxy()) {
			if (!seen.contains(superClass)) {
				// has no syntethic methods added till now
				seen.add(superClass);
				addSyntethicMethods(superClass, seen);
			}

			addSyntethicMethodsForClass(mClass, superClass);
		}
	}

	@Override
	public Class<ClassDeclaration> getSupportedType() {
		return ClassDeclaration.class;
	}
}
