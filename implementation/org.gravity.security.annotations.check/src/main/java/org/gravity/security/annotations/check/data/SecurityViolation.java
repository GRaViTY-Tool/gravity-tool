package org.gravity.security.annotations.check.data;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.jdt.core.IMember;
import org.gravity.security.annotations.check.SecureDependencyCheck;

public record SecurityViolation(IMember source, IMember target, IMember violating, SecurityProperty property) {

	public String getSourceMessage() {
		if (this.violating == this.source) {
			if (this.source.isBinary()) {
				return MessageFormat.format(
						"There is an access from the binary member {0} defined in {1} to {2} that violates the {3} requriement of the accessed member.",
						SecureDependencyCheck.getSimpleSignature(this.source),
						this.source.getClassFile().getElementName(),
						SecureDependencyCheck.getSimpleSignature(this.target), this.property);
			}
			return MessageFormat.format("This member is required to guarantee {0} for accessing \"{1}\".",
					this.property, SecureDependencyCheck.getSimpleSignature(this.target));
		}
		if (this.violating == this.target) {
			return MessageFormat.format(
					"This class requires {0} for \"{1}\" but it is not provided by the accessed member!", this.property,
					SecureDependencyCheck.getSimpleSignature(this.target));
		}
		return null;
	}

	public String getTargetMessage() {
		if (this.violating == this.source) {
			return MessageFormat.format(
					"\"{0}\" calls this member without guarnteeing the required {1} security level.",
					SecureDependencyCheck.getSimpleSignature(this.source), this.property);

		}
		if (this.violating == this.target) {
			return MessageFormat.format("\"{0}\" requires {1} for this member but it is not provided.",
					SecureDependencyCheck.getSimpleSignature(this.source), this.property);

		}
		return null;
	}

	public Collection<String> getRelevantElementSignatures() {
		return Arrays.asList(SecureDependencyCheck.getSignature(this.source),
				SecureDependencyCheck.getSignature(this.target));
	}

	@Override
	public boolean equals(final Object other) {
		if (other instanceof final SecurityViolation violation) {
			return this.property.equals(violation.property()) && this.source.equals(violation.source())
					&& this.target.equals(violation.target()) && this.violating.equals(violation.violating());
		}
		return false;
	}
}
