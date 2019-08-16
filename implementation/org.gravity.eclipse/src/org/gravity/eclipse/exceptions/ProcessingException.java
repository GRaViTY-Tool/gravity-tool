package org.gravity.eclipse.exceptions;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * An exception which should be thrown if a processing of some data fails
 * 
 * @author speldszus
 *
 */
public class ProcessingException extends Exception {

	private static final String MESSAGE_START = "The following object couldn't be processed: ";

	/**
	 * 
	 */
	private static final long serialVersionUID = 4378424824963356198L;

	private final transient Set<Object> objects;
	
	/**
	 * The default constructor
	 */
	public ProcessingException() {
		this.objects = Collections.emptySet();
	}
	
	/**
	 * A constructor taking a message describing the processiong error
	 * 
	 * @param message
	 */
	public ProcessingException(String message) {
		super(message);
		this.objects = Collections.emptySet();
	}
	
	/**
	 * A constructor taking the object which couldn't be processed
	 * 
	 * @param object The object which couldn't be processed
	 */
	public ProcessingException(Object object) {
		super(MESSAGE_START.concat(object.toString()));
		this.objects = Collections.singleton(object);
	}
	
	/**
	 * A constructor taking the objects which couldn't be processed
	 * 
	 * @param objects The objects which couldn't be processed
	 */
	public ProcessingException(Set<Object> objects) {
		super(objects.stream().map(o -> o.toString()).collect(Collectors.joining(", ", MESSAGE_START, "")));
		this.objects = Collections.unmodifiableSet(objects);
	}

	/**
	 * A getter returning the objects which couldn't be processed
	 * 
	 * @return the objects which couldn't be processed
	 */
	public Set<Object> getObjects() {
		return objects;
	}

}
