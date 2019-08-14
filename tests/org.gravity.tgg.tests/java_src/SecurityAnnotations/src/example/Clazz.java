package example;

import org.gravity.security.annotations.requirements.Critical;
import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

@Critical(secrecy = {"other():void"})
public class Clazz {

	@Secrecy@Integrity
	int field;
	
	@Secrecy@Integrity
	public void method(){
		
	}
}
