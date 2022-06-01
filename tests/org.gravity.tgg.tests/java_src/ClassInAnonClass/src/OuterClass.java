
public final class OuterClass {

	public static AbstractType method() {
		return new AbstractType() {
			@Override
			public void method() {
				class InnerClass implements Interface {
					@Override
					public void method() {

					}
				}
			}
		};
	}
}
