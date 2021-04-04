package p;

public class OuterClass {
	private static final Object field = new Object[] {new Object() {
		public Object method() {
			return null;
		}
	}};
}
