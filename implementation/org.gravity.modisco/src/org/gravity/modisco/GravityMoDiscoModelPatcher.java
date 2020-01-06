package org.gravity.modisco;

import org.eclipse.modisco.java.Model;

/**
 * This interface is used to patch an existing modisco model to be equal to 
 * a given evolution of the model without considering EMF UUIDs.
 */
public interface GravityMoDiscoModelPatcher {
	
	/**
	 * Extension point at which implementations of this interface should be registered
	 */
	public static final String EXTENSIONPOINT_ID = "org.gravity.modisco.patcher";

	 /**
	  * Calculates the difference between modisco1 and modisco2,
	  * creates a patch from the difference and applies it to modisco1.
	  *
	  * @param modisco1 The original modisco model linked with the TGG.
	  * @param modisco2 An evolution of modisco1. 
	  *			The EMF UUIDs might have changed.
	  *			The model might be null.
	  */
	  public void update(Model modisco1, final Model modisco2);
	  
	  /**
		* Calculates the difference between modisco1 and modisco2,
		* creates a patch from the difference and applies it to modisco1.
		*
		* @param modisco1 The original modisco model linked with the TGG.
		* @param modisco2 An evolution of modisco1. 
		*			The EMF UUIDs might have changed.
		*			The model might be null.
		*/
	  public void update(MGravityModel modisco1, final MGravityModel modisco2);

	  /**
	   * Returns a short description when to choose this patcher
	   * 
	   * @return the description
	   */
	  public String getDescription();

	  /**
	   * Returns a short unique name for displaying in the GUI
	   * 
	   * @return the name
	   */
	  public String getName();

}
