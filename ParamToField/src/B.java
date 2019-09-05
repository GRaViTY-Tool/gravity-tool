/**
 * 
 * Flow from a method parameter to a field with leftHandSide and rightHandSide of the assignment containing more than one element.
 *
 */
public class B {

	// Integrity
	int a;
	
	public void m(int b) {
		this.a = b + 1;
	}
	
}

