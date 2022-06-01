
public class Main {

	public static void main(String[] args) {
		method(Double.toString(Math.random()), Double.toString(Math.random()));
	}

	private static void method(String... strings) {
		for (String s : strings) {
			System.out.println(s);
		}
	}
}
