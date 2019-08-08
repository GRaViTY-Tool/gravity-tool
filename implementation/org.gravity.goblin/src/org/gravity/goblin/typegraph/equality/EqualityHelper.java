package org.gravity.goblin.typegraph.equality;

import org.eclipse.emf.ecore.EObject;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TField;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TPackage;

import at.ac.tuwien.big.momot.problem.unit.parameter.comparator.IEObjectEqualityHelper;

//TODO: Create own project for compare of different PGs for equivalent elements
public class EqualityHelper implements IEObjectEqualityHelper {

	public boolean equals(TAbstractType leftType, TAbstractType rightType) {
		if (leftType == null && rightType == null) {
			return true;
		}
		if (leftType == null || rightType == null) {
			return false;
		}
		if (!(leftType.getTName().equals(rightType.getTName()))) {
			return false;
		}
		return equals(leftType.getPackage(), rightType.getPackage());
	}

	public boolean equals(TFieldDefinition leftFieldDef, TFieldDefinition rightFieldDef) {
		if (leftFieldDef == null && rightFieldDef == null) {
			return true;
		}
		if (leftFieldDef == null || rightFieldDef == null) {
			return false;
		}

		if (!(equals(leftFieldDef.getSignature(), rightFieldDef.getSignature()))) {
			return false;
		}
		return equals(leftFieldDef.getDefinedBy(), rightFieldDef.getDefinedBy());
	}

	public boolean equals(TField leftField, TField rightField) {
		if (leftField == null && rightField == null) {
			return true;
		}
		if (leftField == null || rightField == null) {
			return false;
		}
		return leftField.getTName().equals(rightField.getTName());
	}

	public boolean equals(TFieldSignature leftFieldSig, TFieldSignature rightFieldSig) {
		if (leftFieldSig == null && rightFieldSig == null) {
			return true;
		}
		if (leftFieldSig == null || rightFieldSig == null) {
			return false;
		}
		if (!(equals(leftFieldSig.getField(), rightFieldSig.getField()))) {
			return false;
		}
		return leftFieldSig.getSignatureString().equals(rightFieldSig.getSignatureString());
	}

	public boolean equals(TMethodDefinition leftMethodDef, TMethodDefinition rightMethodDef) {
		if (leftMethodDef == null && rightMethodDef == null) {
			return true;
		}
		if (leftMethodDef == null || rightMethodDef == null) {
			return false;
		}
		if (!(equals(leftMethodDef.getSignature(), rightMethodDef.getSignature()))) {
			return false;
		}
		return equals(leftMethodDef.getDefinedBy(), rightMethodDef.getDefinedBy());
	}

	public boolean equals(TMethod leftMethod, TMethod rightMethod) {
		if (leftMethod == null && rightMethod == null) {
			return true;
		}
		if (leftMethod == null || rightMethod == null) {
			return false;
		}
		return leftMethod.getTName().equals(rightMethod.getTName());
	}

	public boolean equals(TMethodSignature leftMethodSig, TMethodSignature rightMethodSig) {
		if (leftMethodSig == null && rightMethodSig == null) {
			return true;
		}
		if (leftMethodSig == null || rightMethodSig == null) {
			return false;
		}
		if (!(equals(leftMethodSig.getMethod(), rightMethodSig.getMethod()))) {
			return false;
		}
		return leftMethodSig.getSignatureString().equals(rightMethodSig.getSignatureString());
	}

	public boolean equals(TPackage leftPackage, TPackage rightPackage) {
		if (leftPackage == null && rightPackage == null) {
			return true;
		}
		if (leftPackage == null || rightPackage == null) {
			return false;
		}
		if (!(equals(leftPackage.getParent(), rightPackage.getParent()))) {
			return false;
		}
		return leftPackage.getTName().equals(rightPackage.getTName());
	}

	@Override
	public boolean equals(EObject left, EObject right) {
		if (left instanceof TMethodSignature && right instanceof TMethodSignature) {
			return equals((TMethodSignature) left, (TMethodSignature) right);
		}
		if (left instanceof TAbstractType && right instanceof TAbstractType) {
			return equals((TAbstractType) left, (TAbstractType) right);
		}
		return left.equals(right);
	}

}
