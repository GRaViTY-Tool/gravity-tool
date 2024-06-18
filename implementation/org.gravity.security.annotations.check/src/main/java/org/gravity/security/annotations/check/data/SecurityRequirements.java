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

public class SecurityRequirements {

	private static final Logger LOGGER = Logger.getLogger(SecurityRequirements.class);

	private final IType type;

	private Set<String> secrecySignatures;
	private final Map<String, List<IAnnotation>> allSecrecySignatures = new HashMap<>();
	private Set<String> integritySignatures;
	private final Map<String, List<IAnnotation>> allIntegritySignatures = new HashMap<>();

	private final Set<IMember> definedMembers = new HashSet<>();
	private final Set<IMember> secrecyMembers = new HashSet<>();
	private final Set<IMember> integrityMembers = new HashSet<>();

	public SecurityRequirements(final IType type) {
		this.type = type;
		IJavaElement parent = type;
		while (parent != null) {
			if (parent instanceof final IType tmp) {

				final var annotation = this.getSecurityAnnotation(tmp);
				annotation.secrecy().forEach(s -> this.allSecrecySignatures.computeIfAbsent(s, k -> new LinkedList<>())
						.add(annotation.getAnnotation()));
				annotation.integrity()
						.forEach(s -> this.allIntegritySignatures.computeIfAbsent(s, k -> new LinkedList<>())
								.add(annotation.getAnnotation()));
				if (type == tmp) {
					this.secrecySignatures = annotation.secrecy();
					this.integritySignatures = annotation.integrity();
				}

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

	public Set<String> getAllSecrecySignatures() {
		return this.allSecrecySignatures.keySet();
	}

	public Set<String> getSecrecySignatures() {
		return this.secrecySignatures;
	}

	public Set<String> getAllIntegritySignatures() {
		return this.allIntegritySignatures.keySet();
	}

	public Set<String> getIntegritySignatures() {
		return this.integritySignatures;
	}

	public List<IAnnotation> getCriticals(final String signature, final SecurityProperty property) {
		return switch (property) {
			case INTEGRITY -> this.allIntegritySignatures.get(signature);
			case SECRECY -> this.allSecrecySignatures.get(signature);
		};
	}

	private CriticalAnnotation getSecurityAnnotation(final IType type) {
		final Set<String> secrecy = new HashSet<>();
		final Set<String> integrity = new HashSet<>();
		IAnnotation critical = null;
		try {
			for (final var a : type.getAnnotations()) {
				if ("Critical".equals(a.getElementName())) {
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
		final var values = pair.getValue();
		if (values instanceof final String string) {
			signatures.add(string);
		} else if (values != null) {
			for (final Object val : (Object[]) values) {
				signatures.add((String) val);
			}
		}
	}

	public Set<IMember> getDefinedMembers() {
		return this.definedMembers;
	}

	public IType getType() {
		return this.type;
	}
}
