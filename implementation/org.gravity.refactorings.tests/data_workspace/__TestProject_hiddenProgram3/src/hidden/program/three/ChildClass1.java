package hidden.program.three;

public class ChildClass1{
	
	public void method(){
		System.out.println("Hello World");
	}

	public static void main(String[] args) {
		ChildClass1 c1 = new ChildClass1();
					c1.method();
		ChildClass2 c2 = new ChildClass2();
					c2.method();
	}
}
