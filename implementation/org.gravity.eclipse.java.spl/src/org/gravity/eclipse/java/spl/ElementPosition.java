package org.gravity.eclipse.java.spl;

/**
 * Describes the position of an element in a file
 * 
 * @author speldszus
 *
 * @param <T> The type of the element
 */
public class ElementPosition<T> implements Comparable<ElementPosition<?>>{

	private final T element;
	private final String id;
	private final int startIndex;
	private final int endIndex;
	
	/**
	 * Creates a new position object
	 * 
	 * @param element The element
	 * @param id A string id of the element
	 * @param startIndex The start index of the element in the file
	 * @param endIndex The end index of the element in the file
	 */
	public ElementPosition(T element, String id, int startIndex, int endIndex) {
		this.element = element;
		this.id = id;
		this.startIndex = startIndex;
		this.endIndex = endIndex;
	}

	/**
	 * A getter for the start index
	 * 
	 * @return the index
	 */
	public int getStartIndex() {
		return startIndex;
	}

	/**
	 * A getter for the end index
	 * 
	 * @return the index
	 */
	public int getEndIndex() {
		return endIndex;
	}

	/**
	 * A getter for element id
	 * 
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * A getter for the element
	 * 
	 * @return the element
	 */
	public T getElement() {
		return element;
	}

	@Override
	public int compareTo(ElementPosition<?> o) {
		return this.startIndex - o.startIndex;
	}
		
	/**
	 * Checks if the element is inside of an other element
	 * 
	 * @param other The element position of the other element
	 * @return true, iff this element is inside of the other element
	 */
	public boolean insideOf(ElementPosition<?> other) {
		if(endIndex <= other.startIndex) {
			return false;
		}
		if(startIndex >= other.endIndex) {
			return false;
		}
		if(startIndex <= other.startIndex) {
			if( endIndex >= other.endIndex) {
				return false;
			}
			else {
				throw new IllegalStateException("Positions are overlapping!");
			}
		}
		else {
			if(endIndex <= other.endIndex) {
				return true;
			}
			else {
				throw new IllegalStateException("Positions are overlapping!");
			}
		}
	}
}
