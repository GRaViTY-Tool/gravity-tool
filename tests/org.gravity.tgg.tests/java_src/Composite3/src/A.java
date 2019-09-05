/**
 * 
 * Composite example with two special data flow cases: ObjectFlow and MultiParamFlow
 *
 */
public class A {
	
	public int m(A a, int b) {
		int c = a.p() + b;
		return n(c);
	}
	
	public int n(int d) {
		return d;
	}
	
	public int p() {
		return 5;
	}
}
