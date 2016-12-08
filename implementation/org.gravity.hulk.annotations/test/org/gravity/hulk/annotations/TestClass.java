package org.gravity.hulk.annotations;

import org.gravity.hulk.annotations.resolve.Hulk_DontTouch;

@Blob(id = 0)
@Blob(id = 1)
@GodClass(id = 0)
@Hulk_DontTouch
public class TestClass {
	
	@Hulk_DontTouch
	int ID = 0;

	@Hulk_DontTouch
	public void main(String[] args){
		
	}
}
