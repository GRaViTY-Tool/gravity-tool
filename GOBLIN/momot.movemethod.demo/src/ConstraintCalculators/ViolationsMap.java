package ConstraintCalculators;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TVisibility;

import momotFiles.Utility;

public class ViolationsMap{
	
	private HashMap<TMember, TVisibility> violations;
	public HashMap<TMember, TVisibility> getHashmap(){
		if(violations == null){
			violations = new HashMap<TMember, TVisibility>();
		}
		return violations;
	}
	
	
	public void put(TMember member, TVisibility tVisibility){
		//do not override existing key, if the new visibility is lower than the old one
		if(getHashmap().containsKey(member)){			
			if(Utility.visibilityDominates(getHashmap().get(member), tVisibility)){
				return;
			}
		}
		getHashmap().put(member, tVisibility);
	}
	
	public void putAll(Map<? extends TMember, ? extends TVisibility> map){
		for(Map.Entry<? extends TMember, ? extends TVisibility> pair: map.entrySet()){
			put(pair.getKey(), pair.getValue());
		}
	}
	
	public void putAll(ViolationsMap map){
		putAll(map.getHashmap());
	}

	public int size(){
		return getHashmap().size();
	}


	public Set<Entry<TMember, TVisibility>> entrySet(){
		return getHashmap().entrySet();
	}
}
