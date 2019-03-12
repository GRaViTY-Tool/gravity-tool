/**
 * 
 * Composite example containing the flows 'ParamToReturn', 'ReturnToParam' and 'ReturnToReturn'.
 *
 */
public class A {

	public int m() {
		return 5;
	}
	
	public int n(int a) {
		return a * a;
	}
	
	public int p() {
		return n(m()) + 7;
	}
}
