package a;

public class A {
	protected int i;
	void n(){
		(new b.B()).i = 1;
	}
	
	void m(){
		b.B b = new b.B();
		b.i = 1;
	}

}
