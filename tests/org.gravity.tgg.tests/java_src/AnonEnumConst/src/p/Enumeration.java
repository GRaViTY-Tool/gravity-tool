package p;

public enum Enumeration {

	CONSTANT1 {
		@Override
		<T> Type<? extends T> method() {
			return new Type<T>() {

			};
		}
	},
	CONSTANT2 {
		@Override
		<T> Type<? extends T> method() {
			return new Type<T>() {

			};
		}
	};

	abstract <T> Type<? extends T> method();
}
