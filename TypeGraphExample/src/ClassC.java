public class ClassC {
	static ClassA a;
	static void main(String[] args){
		ClassB b = new ClassB();
		a = new ClassA();
		b.calcStuff(a);
	}

}