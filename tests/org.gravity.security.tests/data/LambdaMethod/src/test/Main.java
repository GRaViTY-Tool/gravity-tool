package test;

import java.util.stream.Stream;

import org.gravity.security.annotations.requirements.Critical;

@Critical
public class Main {

	public static void main(String[] args) {
		functionalInterface(args);
		lambdaMethod(args);
	}

	private static void functionalInterface(String[] args) {
		Stream.of(args).forEach(Supplier::secrecyCritical);
		Stream.of(args).forEach(Supplier::secrecyAnnoation);
		Stream.of(args).forEach(Supplier::integrityCritical);
		Stream.of(args).forEach(Supplier::integrityAnnotation);
	}

	private static void lambdaMethod(String[] args) {
		Stream.of(args).forEach(s -> Supplier.secrecyCritical(s));
		Stream.of(args).forEach(s -> Supplier.secrecyAnnoation(s));
		Stream.of(args).forEach(s -> Supplier.integrityCritical(s));
		Stream.of(args).forEach(s -> Supplier.integrityAnnotation(s));
	}
}
