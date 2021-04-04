/**
 */
package org.gravity.refactorings.impl;

import java.util.Collection;
import java.util.Collections;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.osgi.util.NLS;
import org.gravity.refactorings.Refactoring;
import org.gravity.refactorings.RefactoringFailedException;
import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.refactorings.configuration.TRefactoringID;
import org.gravity.refactorings.configuration.impl.MoveMemberConfiguration;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TSignature;

public class MoveMember implements Refactoring {

	private static final Logger LOGGER = Logger.getLogger(MoveMember.class.getName());

	@Override
	public boolean isApplicable(final RefactoringConfiguration configuration) {
		if (getRefactoringID() == configuration.getRefactoringID()) {
			final MoveMemberConfiguration esc = (MoveMemberConfiguration) configuration;
			return isApplicable(esc.getSignature(), esc.getSourceClass(), esc.getTargetClass());
		}
		return false;
	}

	@Override
	public Collection<TClass> perform(final RefactoringConfiguration configuration) throws RefactoringFailedException {
		if (getRefactoringID() == configuration.getRefactoringID()) {
			final MoveMemberConfiguration esc = (MoveMemberConfiguration) configuration;
			return perform(esc.getSignature(), esc.getSourceClass(), esc.getTargetClass());
		}
		return Collections.emptyList();
	}

	public boolean isApplicable(final TSignature signature, final TClass tTargetClass, final TClass tSourceClass) {
		if (signature instanceof TMethodSignature) {
			final TMethodSignature method = (TMethodSignature) signature;
			final MoveMethod move = new MoveMethod();
			return move.isApplicable(method, tTargetClass, tSourceClass);
		} else if (signature instanceof TFieldSignature) {
			final TFieldSignature field = (TFieldSignature) signature;
			final MoveField move = new MoveField();
			return move.isApplicable(field, tTargetClass, tSourceClass);
		} else {
			LOGGER.log(Level.ERROR, "MoveMemberImpl: Unknown TSignature: " + signature);
			return false;
		}

	}

	public Collection<TClass> perform(final TSignature signature, final TClass tTargetClass, final TClass tSourceClass)
			throws RefactoringFailedException {
		if (signature instanceof TMethodSignature) {
			final TMethodSignature method = (TMethodSignature) signature;
			final MoveMethod move = new MoveMethod();
			return move.perform(method, tTargetClass, tSourceClass);
		} else if (signature instanceof TFieldSignature) {
			final TFieldSignature field = (TFieldSignature) signature;
			final MoveField move = new MoveField();
			return move.perform(field, tTargetClass, tSourceClass);
		}
		final String message = NLS.bind("MoveMemberImpl: Unknown TSignature: {0}", signature);
		LOGGER.error(message);
		throw new RefactoringFailedException(message);
	}

	public boolean noCallToAnyChildMember(final TMember member, final TClass clazz) {

		for (final TClass child : clazz.getAllChildren()) {
			for (final TMember childMember : child.getDefines()) {
				for (final TAccess tAccess : member.getAccessing()) {
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
