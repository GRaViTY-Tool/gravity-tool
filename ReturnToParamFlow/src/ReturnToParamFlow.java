
public class ReturnToParamFlow {

	public int a() {
		return 5;
	}
	
	public int b(int p) {
		return p * p;
	}
	
	public int c() {
		return b(a()) + 7;
	}
}
