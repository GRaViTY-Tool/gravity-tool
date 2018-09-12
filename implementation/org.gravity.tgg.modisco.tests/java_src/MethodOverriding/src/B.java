
public class B extends A {

	@Override
	A newInstance() {
		return new B();
	}
}
