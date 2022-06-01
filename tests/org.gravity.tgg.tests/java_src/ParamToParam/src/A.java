/**
 * 
 * Flow from parameter to parameter.
 *
 */
public class A {
	
	public void m(int a) {
		n(a);
	}
	
	public int n(int b) {
		return 5;
	}
}
