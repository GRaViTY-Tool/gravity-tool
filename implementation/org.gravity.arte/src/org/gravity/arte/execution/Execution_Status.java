package org.gravity.arte.execution;


enum Execution_Status {
	Changed,
	Synchronized,
	Compiled;

	public boolean isCompatible(Execution_Status requiredStatus) {
		if (requiredStatus == this)
			return true;
		if (requiredStatus == Changed)
			return true;
		if (requiredStatus == Synchronized)
			return this==Compiled || this == Synchronized;
		if (requiredStatus == Compiled)
			return this == Compiled;
		return false;
	}
}
