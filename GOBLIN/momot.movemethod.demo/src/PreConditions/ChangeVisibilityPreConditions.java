package PreConditions;

import java.util.Map.Entry;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TInterface;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.annotations.TAnnotation;

import momotFiles.Utility;

public class ChangeVisibilityPreConditions {
	//if a childClass implements an interface with the same field as the field in the violation do not change the visibility as this may introduce ambiguity
	private static boolean checkINH2Preconditions(TClass sourceClass,Entry<TMember, TVisibility> violation){
		if(!(violation.getKey() instanceof TFieldDefinition)){
			return true;
		}
		if(!violation.getKey().getTModifier().isIsStatic()){
			return true;
		}
		
		for(TClass child : sourceClass.getChildClasses()){
			for(TInterface tInterface: child.getImplements()){
				
				for(TMember member: tInterface.getDefines()){
					if(member.getTModifier() == null){
						return false;
					}					
					if(member.getTModifier().isIsStatic() 
						&& member.getSignature() == violation.getKey().getSignature()){
						return false;
					}
				}
			}			
		}
		return true;
	}
	
	//if a parentclass defines a method with the same signature do not change the visibility as this may introduce a new dynamic binding
	private static boolean checkDynPreconditions(TClass sourceClass, Entry<TMember, TVisibility> violation){
				
		TClass parent = sourceClass.getParentClass();
		if(parent == null){
			return true;
		}
		for(TMember member: parent.getDefines()){
			if(member.getSignature() == violation.getKey().getSignature()){
				return false;
			}
		}
		return true;
	}
	
	
	
	private static boolean checkSecurityPreconditions(TClass sourceClass, Entry<TMember, TVisibility> violation){
		for(TAnnotation annotation: violation.getKey().getTAnnotation()){
			if(Utility.isSecurityAnnotation(annotation)){
				return false;
			}
		}
		return true;
	}

	public static boolean checkPreconditions(Entry<TMember, TVisibility> violation) {
		TAbstractType definedBy = violation.getKey().getDefinedBy();
		// do not change method visibility that is not defined by a class
		if(!(definedBy instanceof TClass)){
			return false;
		}
		TClass sourceClass = ((TClass)definedBy);
		boolean result = checkDynPreconditions(sourceClass, violation) ;
		result &= checkINH2Preconditions(sourceClass, violation);
		result &= checkSecurityPreconditions(sourceClass, violation);
		
		return result;
	}
}
