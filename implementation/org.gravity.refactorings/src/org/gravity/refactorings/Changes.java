package org.gravity.refactorings;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.EObject;

public class Changes {
	private Set<String> changed_classfiles;
	private Consumer<EObject> changes;

	public Changes() {
		this.changed_classfiles = new HashSet<String>();
	}

	public Changes(Set<String> changed_classfiles, Consumer<EObject> changes) {
		this.changed_classfiles = changed_classfiles;
		this.changes = changes;
	}

	public Set<String> getChanged_classfiles() {
		return this.changed_classfiles;
	}

	public void addChanged_classfile(String chhanged_classfile) {
		if (this.changed_classfiles == null) {
			this.changed_classfiles = new HashSet<>();
		}
		this.changed_classfiles.add(chhanged_classfile);
	}

	public void addChangedClassfiles(Set<String> changed_classfiles) {
		if (this.changed_classfiles == null) {
			this.changed_classfiles = new HashSet<>();
		}
		this.changed_classfiles.addAll(changed_classfiles);
	}

	public Consumer<EObject> getChanges() {
		return this.changes;
	}

	public void setChanges(Consumer<EObject> changes) {
		this.changes = changes;
	}
}