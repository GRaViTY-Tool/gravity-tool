/**
 * 
 * Flow from parameter to parameter with infinite recursion.
 *
 */
public class B {

	public void m(int a) {
		m(a);
	}
}
