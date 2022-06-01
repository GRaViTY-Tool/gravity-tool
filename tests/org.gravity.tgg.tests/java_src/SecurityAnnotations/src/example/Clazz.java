package example;

import org.gravity.security.annotations.CounterMeasure;
import org.gravity.security.annotations.requirements.Critical;
import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

@Critical(secrecy = {"other():void"})
public class Clazz {

	@Secrecy@Integrity
	int field;

	@Secrecy@Integrity(earlyReturn = "counterMeasure():String")
	public void method(){

	}

	@CounterMeasure
	public String counterMeasure() {
		return "";
	}
}
