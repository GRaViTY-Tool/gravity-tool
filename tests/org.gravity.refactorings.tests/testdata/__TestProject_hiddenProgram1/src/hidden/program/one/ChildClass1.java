package hidden.program.one;

public class ChildClass1 extends ParentClass {
	
	String field = "I am a field";

	public static void main(String[] args) {
		ChildClass1 c = new ChildClass1();
		System.out.println("Field: "+c.field);
		System.out.print("Method: ");
		c.method();
	}
	
	public void method(){
		System.out.println("Hello World!"+field);
	}

}
