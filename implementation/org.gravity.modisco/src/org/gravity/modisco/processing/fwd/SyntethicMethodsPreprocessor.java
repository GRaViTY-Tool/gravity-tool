package org.gravity.modisco.processing.fwd;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.Package;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.VisibilityKind;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MSyntheticMethodDefinition;
import org.gravity.modisco.ModiscoFactory;
import org.gravity.modisco.processing.AbstractTypedModiscoProcessor;

/**
 * This processor adds synthetic methods to the model
 *
 * This processor is currently not used
 *
 * @author speldszus
 *
 */
public class SyntethicMethodsPreprocessor extends AbstractTypedModiscoProcessor<MMethodDefinition> {

	@Override
	public boolean process(MGravityModel model, Collection<MMethodDefinition> elements, IProgressMonitor monitor) {
		elements.forEach(SyntethicMethodsPreprocessor::addSyntethicMembers);
		return true;
	}

	private static void addSyntethicMembers(MMethodDefinition mDef) {
		final AbstractTypeDeclaration abstractTypeDeclaration = mDef.getAbstractTypeDeclaration();
		if (abstractTypeDeclaration instanceof ClassDeclaration) {
			final ClassDeclaration mClass = (ClassDeclaration) abstractTypeDeclaration;

			final TypeAccess superClassAccess = mClass.getSuperClass();
			if (superClassAccess != null) {
				final Type superClassType = superClassAccess.getType();
				if (superClassType instanceof ClassDeclaration) {
					final ClassDeclaration superClass = (ClassDeclaration) superClassType;
					if (!superClass.eIsProxy()) {
						boolean needsSynt = true;
						for (final BodyDeclaration body : superClass.getBodyDeclarations()) {
							if (body instanceof MMethodDefinition) {

								final MMethodDefinition superMDef = (MMethodDefinition) body;
								if (superMDef.getMSignature() == mDef.getMSignature()) {
									needsSynt = false;
								}
							}
						}

						if (needsSynt) {
							// TODO Implement this preprocessing
						}

					}
				}
			}
		}
	}

	private ClassDeclaration getSuperClass(ClassDeclaration mClass) {
		final TypeAccess superAccess = mClass.getSuperClass();
		if (superAccess != null) {
			final Type superType = superAccess.getType();
			if (superType instanceof ClassDeclaration) {
				return (ClassDeclaration) superType;
			}
		}
		return null;
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

	private void addSyntethicMethods(ClassDeclaration mClass, ArrayList<ClassDeclaration> remainingClasses) {
		final ClassDeclaration superClass = getSuperClass(mClass);
		if (superClass != null && !superClass.isProxy()) {
			if (remainingClasses.contains(superClass)) {
				// has no syntethic methods added till now
				remainingClasses.remove(superClass);
				addSyntethicMethods(superClass, remainingClasses);
			}

			addSyntethicMethodsForClass(mClass, superClass);
		}

		if (!remainingClasses.isEmpty()) {
			final ClassDeclaration nextMClass = remainingClasses.remove(0);
			addSyntethicMethods(nextMClass, remainingClasses);
		}
	}

	private ArrayList<Package> getAllPackages(ArrayList<Package> packages) {
		final ArrayList<Package> newPackages = new ArrayList<>();
		for (final Package mPackage : packages) {
			for (final Package ownedPackage : mPackage.getOwnedPackages()) {
				if (!packages.contains(ownedPackage)) {
					newPackages.add(ownedPackage);
				}
			}
		}
		if (!newPackages.isEmpty()) {
			newPackages.addAll(getAllPackages(newPackages));
			return newPackages;
		}
		return newPackages;
	}

	private ArrayList<ClassDeclaration> getAllClasses(MGravityModel model) {
		final ArrayList<ClassDeclaration> classes = new ArrayList<>();
		final ArrayList<Package> packages = new ArrayList<>();
		packages.addAll(model.getOwnedElements());
		packages.addAll(getAllPackages(packages));
		for (final Package mPackage : packages) {
			for (final AbstractTypeDeclaration element : mPackage.getOwnedElements()) {
				if (element instanceof ClassDeclaration) {
					final ClassDeclaration mClass = (ClassDeclaration) element;
					if (!mClass.isProxy()) {
						classes.add(mClass);
					}
				}
			}
		}
		return classes;
	}

	@Override
	public boolean process(MGravityModel model, IProgressMonitor monitor) {
		final ArrayList<ClassDeclaration> classes = getAllClasses(model);
		if (!classes.isEmpty()) {
			final ClassDeclaration mClass = classes.get(0);
			classes.remove(mClass);
			addSyntethicMethods(mClass, classes);
		}
		return true;
	}

	@Override
	public Class<MMethodDefinition> getSupportedType() {
		return MMethodDefinition.class;
	}

}
