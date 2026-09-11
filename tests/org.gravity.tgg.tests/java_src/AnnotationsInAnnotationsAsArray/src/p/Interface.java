package p;

public interface Interface {

	@MethodAnnotation(values = {@ParameterAnnotation,@ParameterAnnotation})
	void method();
}
