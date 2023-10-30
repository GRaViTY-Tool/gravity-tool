package example;

import org.gravity.security.annotations.requirements.Critical;

@Critical(secrecy = "method(boolean,int,long,float,double,byte,char,short):void")
public class Client {

	public void call(Supplier s) {
		s.method(false);
	}
}
