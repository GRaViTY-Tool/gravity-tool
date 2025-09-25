package example;

import org.gravity.security.annotations.requirements.Critical;

@Critical(secrecy = "method(boolean,int,long,float,double,byte,char,short):void")
public class Client {

	public void call(Supplier supplier) {
		byte b = 0;
		short s = 0;
		supplier.method(false, 1, 1l, 1f, 1.1, b, 'a', s);
	}
}
