
public class ClassB {
	public int field1B = 0;
	
	private void methodTwo(){
		ClassA a = new ClassA();
		int one = a.field1;
		int two = a.field2;
		int three = a.field3;
		int four = a.field4;
		int five = a.field5;
		
	}
	
	
	public void methodone(){
		methodTwo();
		int i =  field1B;
	}
	
}
