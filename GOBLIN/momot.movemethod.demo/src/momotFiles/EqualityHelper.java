package momotFiles;

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

public class EqualityHelper implements IEObjectEqualityHelper{

	
	public boolean equals(TAbstractType leftType, TAbstractType rightType){
		if(leftType == null && rightType == null){
			return true;
		}
		if(leftType == null || rightType == null){
			return false;
		}
		if(!(leftType.getTName().equals(rightType.getTName()))){
			return false;
		}
		if(!(equals(leftType.getPackage(), rightType.getPackage()))){
			return false;
		}
		return true;
	}
	
	public boolean equals(TFieldDefinition leftFieldDef, TFieldDefinition rightFieldDef){
		if(leftFieldDef == null && rightFieldDef == null){
			return true;
		}
		if(leftFieldDef == null || rightFieldDef == null){
			return false;
		}
		
		if(!(equals(leftFieldDef.getSignature(), rightFieldDef.getSignature()))){
			return false;
		}
		if(!(equals(leftFieldDef.getDefinedBy(), rightFieldDef.getDefinedBy()))){
			return false;
		}
		return true;		
	}
	
	public boolean equals(TField leftField, TField rightField){
		if(leftField == null && rightField == null){
			return true;
		}
		if(leftField == null || rightField == null){
			return false;
		}
		if(!(leftField.getTName().equals(rightField.getTName()))){
			return false;
		}
		return true;
	}
	
	public boolean equals(TFieldSignature leftFieldSig, TFieldSignature rightFieldSig){
		if(leftFieldSig == null && rightFieldSig == null){
			return true;
		}
		if(leftFieldSig == null || rightFieldSig == null){
			return false;
		}
		if(!(equals(leftFieldSig.getField(), rightFieldSig.getField()))){
			return false;
		}
		if(!(leftFieldSig.getSignatureString().equals(rightFieldSig.getSignatureString()))){
			return false;
		}
		return true;
	}
	
	public boolean equals(TMethodDefinition leftMethodDef, TMethodDefinition rightMethodDef){
		if(leftMethodDef == null && rightMethodDef == null){
			return true;
		}
		if(leftMethodDef == null || rightMethodDef == null){
			return false;
		}
		if(!(equals(leftMethodDef.getSignature(), rightMethodDef.getSignature()))){
			return false;
		}
		if(!(equals(leftMethodDef.getDefinedBy(), rightMethodDef.getDefinedBy()))){
			return false;
		}
		return true;
	}
	
	public boolean equals(TMethod leftMethod, TMethod rightMethod){
		if(leftMethod == null && rightMethod == null){
			return true;
		}
		if(leftMethod == null || rightMethod == null){
			return false;
		}
		if(!(leftMethod.getTName().equals(rightMethod.getTName()))){
			return false;
		}
		return true;
	}
	
	public boolean equals(TMethodSignature leftMethodSig, TMethodSignature rightMethodSig){
		if(leftMethodSig == null && rightMethodSig == null){
			return true;
		}
		if(leftMethodSig == null || rightMethodSig == null){
			return false;
		}
		if(!(equals(leftMethodSig.getMethod(), rightMethodSig.getMethod()))){
			return false;
		}
		if(!(leftMethodSig.getSignatureString().equals(rightMethodSig.getSignatureString()))){
			return false;
		}
		return true;
	}
	
	public boolean equals(TPackage leftPackage, TPackage rightPackage){
		if(leftPackage == null && rightPackage == null){
			return true;
		}
		if(leftPackage == null || rightPackage == null){
			return false;
		}
		if(!(equals(leftPackage.getParent(), rightPackage.getParent()))){
			return false;
		}
		if(!leftPackage.getTName().equals(rightPackage.getTName())){
			return false;
		}
		return true;
	}
	
	
	
	@Override
	public boolean equals(EObject left, EObject right) {
		if(left instanceof TMethodSignature && right instanceof TMethodSignature){
			return equals((TMethodSignature)left, (TMethodSignature) right);
		}
		if(left instanceof TAbstractType && right instanceof TAbstractType){
			return equals((TAbstractType)left, (TAbstractType) right);
		}
		
		
		// TODO Auto-generated method stub
		return left.equals(right);
	}

}
