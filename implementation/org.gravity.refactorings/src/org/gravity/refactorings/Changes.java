package org.gravity.refactorings;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.EObject;

/**
 * A data class for storing changes made on a model
 * 
 * @author speldszus
 *
 */
public class Changes {
	
	private Set<String> changedClassfiles;
	private Consumer<EObject> changes;

	/**
	 * Initializes the performed changes with an empty set
	 */
	public Changes() {
		this.changedClassfiles = new HashSet<String>();
	}

	/**
	 * Initializes the changes with the given set and consumer
	 * 
	 * @param changedClassfiles The names of the changed class files
	 * @param changes A consumer for performing the changes
	 */
	public Changes(Set<String> changedClassfiles, Consumer<EObject> changes) {
		this.changedClassfiles = changedClassfiles;
		this.changes = changes;
	}

	/**
	 * Returns the class files changed by this change description 
	 * 
	 * @return a set with the names of changed class files
	 */
	public Set<String> getChangedClassfiles() {
		return this.changedClassfiles;
	}

	public void addChangedClassfile(String chhangedClassfile) {
		if (this.changedClassfiles == null) {
			this.changedClassfiles = new HashSet<>();
		}
		this.changedClassfiles.add(chhangedClassfile);
	}

	/**
	 * Adds new classes to the set of changed class files
	 * 
	 * @param changedClassfiles The new changes
	 */
	public void addChangedClassfiles(Set<String> changedClassfiles) {
		if (this.changedClassfiles == null) {
			this.changedClassfiles = new HashSet<>();
		}
		this.changedClassfiles.addAll(changedClassfiles);
	}

	/**
	 * Returns the consumer for performing the changes
	 * 
	 * @return the consumer
	 */
	public Consumer<EObject> getChanges() {
		return this.changes;
	}

	/**
	 * Sets a consumer for performing changes
	 * 
	 * @param changes The consumer
	 */
	public void setChanges(Consumer<EObject> changes) {
		this.changes = changes;
	}
}