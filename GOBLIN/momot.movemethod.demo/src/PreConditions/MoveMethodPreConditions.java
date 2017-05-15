package PreConditions;

import java.util.ArrayList;
import java.util.List;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TInterface;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.annotations.TAnnotation;

import momotFiles.SearchParameters;
import momotFiles.Utility;

public class MoveMethodPreConditions {
	
	private static boolean getterSetterPrecondition(TMethodSignature methodSig, TClass sourceClass){
		if(methodSig.getSignatureString().toLowerCase().startsWith("set")){
			return false;
		}
		if(methodSig.getSignatureString().toLowerCase().startsWith("get")){
			return false;
		}
		return true;
}

private static boolean securityPrecondition(TMethodSignature methodSig, TClass sourceClass){
	List<TAnnotation> annotations = new ArrayList<TAnnotation>();
	annotations.addAll(methodSig.getTAnnotation());
	for(TMethodDefinition methodDef: methodSig.getDefinitions()){
		if(methodDef.getDefinedBy() == sourceClass){
			annotations.addAll(methodDef.getTAnnotation());
		}
	}	
	for(TAnnotation annot:annotations){
		if(Utility.isSecurityAnnotation(annot)){
			return false;
		}
	}
	return true;
}

private static boolean interfacePrecondition(TMethodSignature methodSig, TClass sourceClass){
	List<TInterface> interfaces = new ArrayList<TInterface>();
	TClass parent = sourceClass;
	while(parent != null){
		interfaces.addAll(parent.getImplements());
		parent = parent.getParentClass();
	}
	
	for(TInterface tInterface: interfaces){
		for(TSignature interfaceSig: tInterface.getSignature()){
			if(interfaceSig == methodSig){
				return false;
			}
		}
	}
	
	return true;
}

public static boolean methodPreconditions(TSignature sig, TClass sourceClass){
	if(!(sig instanceof TMethodSignature)){
		return true;
	}
	TMethodSignature methodSig = (TMethodSignature) sig;
	boolean success = getterSetterPrecondition(methodSig, sourceClass);
	success &= interfacePrecondition(methodSig, sourceClass);
	if(SearchParameters.useSecurity){
		success &= securityPrecondition(methodSig, sourceClass);
	}
	return success;
}

}
