
public class SimpleClass {

	public static void main(String[] args) {
		String[] values = new SimpleClass().returnArray();
		values.toString();
	}
	
	String[] returnArray() {
		return new String[] {"a", "b"};
	}
	
}
