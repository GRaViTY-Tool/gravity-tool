package p;

public enum Enumeration {

	CONSTANT {
		@Override
		<T> Type<? extends T> method() {
			return new Type<T>() {

			};
		}
	};


	abstract <T> Type<? extends T> method();
}
