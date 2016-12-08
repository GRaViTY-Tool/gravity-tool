package example02;

public class ChildClass1 extends ParentClass {
	
	public ChildClass1() {}
	
	public void method() {
		System.out.println("Child says Hello World!");
	}
	
	public static void main(String[] args){
		ChildClass1 c = new ChildClass1();
		c.method();
		ParentClass p = new ParentClass();
		p.method();
	}
	
}
