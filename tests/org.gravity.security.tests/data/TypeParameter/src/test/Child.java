package test;

public class Child extends ParameterizedClass {

	@Override
	public <D> D fwd1(D d) {
		return d;
	}
}
