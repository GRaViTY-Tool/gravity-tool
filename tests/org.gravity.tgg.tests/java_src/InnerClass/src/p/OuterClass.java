package p;

public class OuterClass {
	public static final class InnerClass extends ParentClass {
		private static void innerClassMethod() {
			StaticClass.execute(
					new Interface() {

					});
		}
	}
}
