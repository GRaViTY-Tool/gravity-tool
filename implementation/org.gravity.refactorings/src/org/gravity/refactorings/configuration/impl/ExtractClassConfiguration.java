/**
 */
package org.gravity.refactorings.configuration.impl;

import java.util.Collection;

import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.refactorings.configuration.TRefactoringID;
import org.gravity.typegraph.basic.TMember;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Extract
 * Class Configuration</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.gravity.refactorings.configuration.ExtractClassConfiguration#getTMembers
 * <em>TMembers</em>}</li>
 * <li>{@link org.gravity.refactorings.configuration.ExtractClassConfiguration#getTNewClassName
 * <em>TNew Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtractClassConfiguration implements RefactoringConfiguration {

	private final Collection<TMember> tMembers;
	private final String tNewClassName;

	public ExtractClassConfiguration(Collection<TMember> tMembers, String tNewClassName) {
		this.tMembers = tMembers;
		this.tNewClassName = tNewClassName;
	}

	public Collection<TMember> getTMembers() {
		return this.tMembers;
	}

	public String getTNewClassName() {
		return this.tNewClassName;
	}

	@Override
	public String toString() {
		return new StringBuilder(50).append(super.toString()).append(" (tNewClassName: ").append(this.tNewClassName).append(')')
				.toString();
	}

	@Override
	public TRefactoringID getRefactoringID() {
		return TRefactoringID.EXTRACT_CLASS;
	}
} // ExtractClassConfigurationImpl
