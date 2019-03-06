
public class SimpleParamToReturnFlow {
	
	public int m(int a) {
		if (a >= 100) {
			return 100;
		}
		int b = a + 2;
		return m(b);
	}
	
}
