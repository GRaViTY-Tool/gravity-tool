/**
 * 
 * Flow from return value to return value.
 *
 */
public class A {
	
	public int m() {
		return 5;
	}
	
	public int n() {
		return m();
	}
}
