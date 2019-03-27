/**
 * 
 * Combination of FieldToParam and ParamToReturn.
 *
 */
public class A {
	
	int a = 0;
	
	public int m(int b) {
		return b;
	}
	
	public void n() {
		m(a);
	}
}
