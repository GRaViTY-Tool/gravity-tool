/**
 */
package org.gravity.refactorings.impl;

import org.gravity.refactorings.Refactoring;
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
import org.apache.log4j.Level;
import org.apache.log4j.Logger;


public class MoveMember implements Refactoring {

	private static final Logger LOGGER = Logger.getLogger(MoveMember.class.getName());
	
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
			MoveMethod move = new MoveMethod();
			return move.isApplicable(method, tTargetClass, tSourceClass);
		} else if (signature instanceof TFieldSignature) {
			TFieldSignature field = (TFieldSignature) signature;
			MoveField move = new MoveField();
			return move.isApplicable(field, tTargetClass, tSourceClass);
		} else {
			LOGGER.log(Level.ERROR, "MoveMemberImpl: Unknown TSignature: " + signature);
			return false;
		}

	}

	public List<TClass> perform(TSignature signature, TClass tTargetClass, TClass tSourceClass) {
		if (signature instanceof TMethodSignature) {
			TMethodSignature method = (TMethodSignature) signature;
			MoveMethod move = new MoveMethod();
			return move.perform(method, tTargetClass, tSourceClass);
		} else if (signature instanceof TFieldSignature) {
			TFieldSignature field = (TFieldSignature) signature;
			MoveField move = new MoveField();
			return move.perform(field, tTargetClass, tSourceClass);
		} else {
			LOGGER.log(Level.ERROR, "MoveMemberImpl: Unknown TSignature: " + signature);
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
		return TRefactoringID.MOVE_MEMBER;
	}

}
