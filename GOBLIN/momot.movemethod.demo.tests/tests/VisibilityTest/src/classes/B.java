package classes;

class B {
	private void method1(){
		A a = new A();
		a.protectedMethod();
		a.publicMethod();
		a.packageMethod();
	}
}
