/**
 * 
 * Flow from a reference to a method parameter followed by a flow into a field of the referenced object.
 *
 */
public class A {

	void m(B b) {
		b.a = 1;
	}
}

class B {
	int a = 0;
}
