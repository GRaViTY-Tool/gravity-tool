package momotFiles;

import java.util.HashSet;

import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TConstructorDefinition;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.impl.TMethodDefinitionImpl;

public class TCallTest {

	public class accessContainer{
		TMember source;
		TMember target;
		TAbstractType staticType;
		public accessContainer(TMember source, TMember target, TAbstractType staticType) {
			this.source = source;
			this.target = target;
			this.staticType = staticType;
		}
		@Override
		public boolean equals(Object obj) {
			
			if(!(obj instanceof accessContainer)){
				return false;
				}
			
			accessContainer other = (accessContainer)obj;
			
			if(other.source != this.source){
				return false;
			}
			if(other.target != this.target){
				return false;
			}
			if(other.staticType != this.staticType){
				return false;
			}
			
			return true;
		}
	}
	
	public void run(){
		String file = "00_JavaSolitaire1.3";
		int count = 0;
		TypeGraph pg = Loader.load(file);
		HashSet<accessContainer> accesses = new HashSet<TCallTest.accessContainer>();

		for(TClass clazz:pg.getClasses()){
			if(clazz.getTName().equals("Solitaire")){
				int i = 0;
				i++;
			}
			for(TMember method:clazz.getDefines()){
				if(method instanceof TMethodDefinition){
					for(TAccess acc: ((TMethodDefinition)method).getTAccessing()){
						count++;
						if(	acc.getStaticType() == null){//acc.getStaticType()!= clazz){
							accessContainer cont = new accessContainer(method, acc.getTTarget(), acc.getStaticType());
							accesses.add(cont);
							
						}
					}
				}
			}
		}
		
		for(accessContainer access: accesses){
			String sourceString = access.source.getDefinedBy().getTName()+"."+access.source.getSignatureString();
			
			TMember target = access.target;
			String targetClass = target.getDefinedBy().getTName();
			String targetName = "";
			if(target instanceof TFieldDefinition){
				targetName = ((TFieldDefinition)target).getSignature().getField().getTName();
			}if(target instanceof TMethodDefinition){
				targetName = ((TMethodDefinition)target).getSignature().getMethod().getTName();
			}
			
			String targeString = targetClass+"."+targetName;
			String staticType = "";
			if(access.staticType == null){
				staticType = "Null";
			}else{
				staticType = access.staticType.getTName();
			}
			
			System.out.println(sourceString+" -> "+targeString +"; static Type: "+staticType);
		}
		System.out.println("Counted :"+count+" accesses");
	}
	public static void main(String[] args){
		new TCallTest().run();
		
		
	}
}
