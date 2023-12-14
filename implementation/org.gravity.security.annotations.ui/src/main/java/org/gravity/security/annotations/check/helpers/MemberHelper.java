package org.gravity.security.annotations.check.helpers;

import java.util.List;
import java.util.stream.Stream;

import org.apache.log4j.Logger;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;

public class MemberHelper {

	private static final Logger LOGGER = Logger.getLogger(MemberHelper.class);

	private MemberHelper() {
		// This class only provides static methods
	}

	public static boolean isExpectedField(final ICompilationUnit cu, final String name, final IField field,
			final String signature) {
		return isInExpectedType(signature, field, cu) && isFieldWithName(name, signature)
				&& compareFieldType(field, signature);
	}

	public static boolean isExpectedMethod(final ICompilationUnit cu, final String name, final IMethod method,
			final String signature) throws JavaModelException {
		return isInExpectedType(signature, method, cu) && isMethodWithName(name, signature)
				&& compareReturnType(method, signature) && compareParameters(method, signature);
	}

	public static boolean isExpectedConstructor(final ICompilationUnit cu, final String name, final IType constructor,
			final String signature) {
		return isInExpectedType(signature, constructor, cu) && isMethodWithName(name, signature)
				&& signature.substring(signature.indexOf('('), signature.lastIndexOf(')') - 1).isBlank();
	}

	private static boolean isInExpectedType(final String signature, final IMember member, final ICompilationUnit cu) {
		var method = signature.indexOf('(');
		if (method == -1) {
			method = signature.indexOf(':');
		}
		if (method == -1) {
			return false;
		}
		final var dot = signature.substring(0, method).lastIndexOf('.');
		if (dot >= 0) {
			final var signatureType = ASTHelper.getFullyQualifiedName4Text(cu, signature.substring(0, dot));
			final var memberType = member.getDeclaringType().getFullyQualifiedName();
			if (!signatureType.equals(memberType)) {
				return false;
			}
		}
		return true;
	}

	private static boolean isFieldWithName(final String name, final String signature) {
		final var notMethod = signature.indexOf('(') == -1;
		return notMethod && signature.substring(0, signature.indexOf(':')).endsWith(name);
	}

	private static boolean compareFieldType(final IField field, final String signature) {
		try {
			final var signatureType = ASTHelper.getFullyQualifiedName4Text(field.getCompilationUnit(),
					signature.substring(signature.indexOf(':') + 1));
			final var fieldType = ASTHelper.getFullyQualifiedName4JDT(field.getCompilationUnit(),
					field.getTypeSignature(), field);
			return signatureType.equals(fieldType);
		} catch (final JavaModelException e) {
			throw new IllegalStateException(e);
		}
	}

	private static boolean isMethodWithName(final String name, final String signature) {
		final var open = signature.indexOf('(');
		return open > 0 && signature.substring(0, open).trim().endsWith(name);
	}

	private static boolean compareParameters(final IMethod method, final String signature) {
		final var end = signature.indexOf(')');
		final var start = signature.indexOf('(') + 1;
		if (start == end) {
			return true;
		}
		final var signaturePlainParameters = signature.substring(start, end).split(",");
		final var methodPlainParameters = method.getParameterTypes();
		if (signaturePlainParameters.length == methodPlainParameters.length) {
			final var signatureParameters = Stream.of(signaturePlainParameters).map(String::trim)
					.map(p -> ASTHelper.getFullyQualifiedName4Text(method.getCompilationUnit(), p)).toList();
			final var methodParameters = Stream.of(methodPlainParameters).map(p -> {
				try {
					return ASTHelper.getFullyQualifiedName4JDT(method.getCompilationUnit(), p, method);
				} catch (final JavaModelException e) {
					LOGGER.error(e);
					return null;
				}
			}).toList();
			if (equals(signatureParameters, methodParameters)) {
				return true;
			}
		}
		return false;
	}

	private static boolean compareReturnType(final IMethod method, final String signature) throws JavaModelException {
		String signatureReturnType;
		final var colon = signature.indexOf(':');
		final var cu = method.getCompilationUnit();
		if (colon >= 0) {
			signatureReturnType = signature.substring(colon + 1).trim();
			if ("void".equalsIgnoreCase(signatureReturnType)) {
				signatureReturnType = "void";
			} else {
				signatureReturnType = ASTHelper.getFullyQualifiedName4Text(cu, signatureReturnType);
			}
		} else {
			signatureReturnType = "void";
		}
		final var methodReturnType = ASTHelper.getFullyQualifiedName4JDT(cu, method.getReturnType(), method);
		return methodReturnType.equals(signatureReturnType);
	}

	private static boolean equals(final List<String> signatureParameters, final List<String> methodParameters) {
		for (var i = 0; i < signatureParameters.size(); i++) {
			if (!methodParameters.get(i).equals(signatureParameters.get(i))) {
				return false;
			}
		}
		return true;
	}
}
