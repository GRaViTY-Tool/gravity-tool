package org.gravity.refactorings.configuration.impl;

import java.util.List;

import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.refactorings.configuration.TRefactoringID;
import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TPackage;

public class CreateSuperClassConfiguration implements RefactoringConfiguration {

	private final TClass tParent;
	private final List<TClass> tChildren;

	public CreateSuperClassConfiguration(final String namespace, final String tParent, final List<TClass> tChildren) {
		this(createTClass(namespace, tParent), tChildren);
	}

	public CreateSuperClassConfiguration(final TClass tParent, final List<TClass> tChildren) {
		this.tParent = tParent;
		this.tChildren = tChildren;
	}

	public List<TClass> getChildren() {
		return this.tChildren;
	}

	public TClass getNewParent() {
		return this.tParent;
	}

	@Override
	public TRefactoringID getRefactoringID() {
		return TRefactoringID.CREATE_SUPERCLASS;
	}

	private static TClass createTClass(final String namespace, final String name) {
		TPackage pack = null;
		for (final String packageName : namespace.split("\\.")) {
			final TPackage next = BasicFactory.eINSTANCE.createTPackage();
			next.setTName(packageName);
			if (pack != null) {
				pack.getSubpackages().add(next);
			}
			pack = next;
		}
		final TClass tClass = BasicFactory.eINSTANCE.createTClass();
		tClass.setTLib(false);
		tClass.setTName(name);
		if (pack != null) {
			pack.getClasses().add(tClass);
			pack.getOwnedTypes().add(tClass);
		}
		return tClass;
	}
}
