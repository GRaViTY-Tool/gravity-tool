/**
 */
package org.gravity.refactorings.impl;

import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.refactorings.configuration.TRefactoringID;
import org.gravity.refactorings.configuration.impl.MoveMemberConfiguration;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TSignature;

import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodSignature;

import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Move_MemberImpl extends RefactoringImpl {

	@Override
	public boolean isApplicable(RefactoringConfiguration configuration) {
		if (getRefactoringID() == configuration.getRefactoringID()) {
			MoveMemberConfiguration esc = (MoveMemberConfiguration) configuration;
			return isApplicable(esc.getSignature(), esc.getSourceClass(), esc.getTargetClass());
		}
		return false;
	}

	@Override
	public Collection<TClass> perform(RefactoringConfiguration configuration) {
		if (getRefactoringID() == configuration.getRefactoringID()) {
			MoveMemberConfiguration esc = (MoveMemberConfiguration) configuration;
			return perform(esc.getSignature(), esc.getSourceClass(), esc.getTargetClass());
		}
		return Collections.emptyList();
	}
	
	public boolean isApplicable(TSignature signature, TClass tTargetClass, TClass tSourceClass) {
		if (signature instanceof TMethodSignature) {
			TMethodSignature method = (TMethodSignature) signature;
			Move_MethodImpl move = new Move_MethodImpl();
			return move.isApplicable(method, tTargetClass, tSourceClass);
		} else if (signature instanceof TFieldSignature) {
			TFieldSignature field = (TFieldSignature) signature;
			Move_FieldImpl move = new Move_FieldImpl();
			return move.isApplicable(field, tTargetClass, tSourceClass);
		} else {
			System.err.println("Move_MemberImpl: Unknown TSignature: " + signature);
			return false;
		}

	}

	public List<TClass> perform(TSignature signature, TClass tTargetClass, TClass tSourceClass) {
		if (signature instanceof TMethodSignature) {
			TMethodSignature method = (TMethodSignature) signature;
			Move_MethodImpl move = new Move_MethodImpl();
			return move.perform(method, tTargetClass, tSourceClass);
		} else if (signature instanceof TFieldSignature) {
			TFieldSignature field = (TFieldSignature) signature;
			Move_FieldImpl move = new Move_FieldImpl();
			return move.perform(field, tTargetClass, tSourceClass);
		} else {
			System.err.println("Move_MemberImpl: Unknown TSignature: " + signature);
			return null;
		}

	}

	public boolean noCallToAnyChildMember(TMember member, TClass clazz) {

		for (TClass child : clazz.getAllChildren()) {
			for (TMember childMember : child.getDefines()) {
				for (TAccess tAccess : member.getTAccessing()) {
					if (childMember.getAccessedBy().contains(tAccess)) {
						return false;
					}
				}
			}
		}
		return true;

	}
	
	@Override
	public TRefactoringID getRefactoringID() {
		return TRefactoringID.TMoveMember;
	}

}