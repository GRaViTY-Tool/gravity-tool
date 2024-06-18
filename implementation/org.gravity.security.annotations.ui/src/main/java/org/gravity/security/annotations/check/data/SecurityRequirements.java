package org.gravity.security.annotations.check.data;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IMemberValuePair;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.gravity.security.annotations.requirements.Critical;

public class SecurityRequirements {

	private static final Logger LOGGER = Logger.getLogger(SecurityRequirements.class);

	private final IType type;

	private final Map<String, List<IAnnotation>> secrecySignatures = new HashMap<>();
	private final Map<String, List<IAnnotation>> integritySignatures = new HashMap<>();

	private final Set<IMember> definedMembers = new HashSet<>();
	private final Set<IMember> secrecyMembers = new HashSet<>();
	private final Set<IMember> integrityMembers = new HashSet<>();
	

	public SecurityRequirements(final IType type) {
		this.type = type;
		IJavaElement parent = type;
		while (parent != null) {
			if (parent instanceof final IType tmp) {
				final var annotation = this.getSecurityAnnotation(tmp);
				annotation.secrecy().forEach(s -> this.secrecySignatures.computeIfAbsent(s, k -> new LinkedList<>())
						.add(annotation.getAnnotation()));
				annotation.integrity().forEach(s -> this.integritySignatures.computeIfAbsent(s, k -> new LinkedList<>())
						.add(annotation.getAnnotation()));

			}
			parent = parent.getParent();
		}
	}

	public boolean isSecrecyMember(final IMember member) {
		return this.secrecyMembers.contains(member);
	}

	public boolean isIntegrityMember(final IMember member) {
		return this.integrityMembers.contains(member);
	}

	public Collection<IMember> getMembers() {
		return this.definedMembers;
	}

	public void addMember(final IMember member) {
		this.definedMembers.add(member);
	}

	public boolean addSecrecyMember(final IMember method) {
		return this.secrecyMembers.add(method);
	}

	public boolean addIntegrityMember(final IMember method) {
		return this.integrityMembers.add(method);
	}

	public Set<String> getSecrecySignatures() {
		return this.secrecySignatures.keySet();
	}

	public Set<String> getIntegritySignatures() {
		return this.integritySignatures.keySet();
	}

	public List<IAnnotation> getCriticals(final String signature,
			final SecurityRequirements.SecurityProperty property) {
		return switch (property) {
		case INTEGRITY -> this.integritySignatures.get(signature);
		case SECRECY -> this.secrecySignatures.get(signature);
		};
	}

	private CriticalAnnotation getSecurityAnnotation(final IType type) {
		final Set<String> secrecy = new HashSet<>();
		final Set<String> integrity = new HashSet<>();
		IAnnotation critical = null;
		try {
			for (final var a : type.getAnnotations()) {
				if (Critical.class.getSimpleName().equals(a.getElementName())) {
					critical = a;
					for (final IMemberValuePair pair : a.getMemberValuePairs()) {
						final var memberName = pair.getMemberName();
						if (SecurityProperty.SECRECY.toString().equals(memberName)) {
							this.addToSignatures(secrecy, pair);
						} else if (SecurityProperty.INTEGRITY.toString().equals(memberName)) {
							this.addToSignatures(integrity, pair);
						}
					}
				}
			}
		} catch (final JavaModelException e) {
			LOGGER.error(e);
		}
		return new CriticalAnnotation(critical, secrecy, integrity);

	}

	private void addToSignatures(final Set<String> signatures, final IMemberValuePair pair) {
		final var secrecyValue = pair.getValue();
		if (secrecyValue instanceof final String string) {
			signatures.add(string);
		} else {
			for (final Object secrecy : (Object[]) secrecyValue) {
				signatures.add((String) secrecy);
			}
		}
	}

	public Set<IMember> getDefinedMembers() {
		return this.definedMembers;
	}

	public enum SecurityProperty {

		SECRECY("secrecy"), INTEGRITY("integrity");

		private final String name;

		private SecurityProperty(final String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return this.name;
		}
	}

	public IType getType() {
		return this.type;
	}
}