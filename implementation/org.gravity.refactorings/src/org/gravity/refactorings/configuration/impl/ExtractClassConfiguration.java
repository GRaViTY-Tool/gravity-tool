/**
 */
package org.gravity.refactorings.configuration.impl;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.refactorings.configuration.TRefactoringID;
import org.gravity.typegraph.basic.TMember;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extract Class Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gravity.refactorings.configuration.ExtractClassConfiguration#getTMembers <em>TMembers</em>}</li>
 *   <li>{@link org.gravity.refactorings.configuration.ExtractClassConfiguration#getTNewClassName <em>TNew Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtractClassConfiguration implements RefactoringConfiguration {
	
	final private List<TMember> tMembers;
	final private String tNewClassName;


	public ExtractClassConfiguration(EList<TMember> tMembers, String tNewClassName) {
		this.tMembers = tMembers;
		this.tNewClassName = tNewClassName;
	}

	public List<TMember> getTMembers() {
		return tMembers;
	}
	
	public String getTNewClassName() {
		return tNewClassName;
	}
	
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tNewClassName: ");
		result.append(tNewClassName);
		result.append(')');
		return result.toString();
	}
	@Override
	public TRefactoringID getRefactoringID() {
		return TRefactoringID.TExtractClass;
	}
} //ExtractClassConfigurationImpl
