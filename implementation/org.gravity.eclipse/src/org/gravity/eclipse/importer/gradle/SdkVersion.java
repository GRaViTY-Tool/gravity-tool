/**
 * 
 */
package org.gravity.eclipse.importer.gradle;

/**
 * A data class storing supported SDK versions for building a project
 * 
 * @author speldszus
 *
 */
public class SdkVersion {

	private double minSdk = Double.NaN;
	private double targetSdk = Double.NaN;
	private double maxSdk = Double.NaN;
	/**
	 * Returns the minimal required SDK version
	 * 
	 * @return the SDK version
	 */
	public double getMinSdk() {
		return minSdk;
	}

	/**
	 * Sets the minimal required SDK version
	 * 
	 * @param minSdk the SDK version
	 */
	public void setMinSdk(double minSdk) {
		this.minSdk = minSdk;
	}

	/**
	 * Returns the optimal target SDK version
	 * 
	 * @return the SDK version
	 */
	public double getTargetSdk() {
		return targetSdk;
	}

	/**
	 * Sets the optimal target SDK version
	 * 
	 * @param minSdk the SDK version
	 */
	public void setTargetSdk(double targetSdk) {
		this.targetSdk = targetSdk;
	}

	/**
	 * Returns the newest supported SDK version
	 * 
	 * @return the SDK version
	 */
	public double getMaxSdk() {
		return maxSdk;
	}

	/**
	 * Sets the newest supported SDK version
	 * 
	 * @param minSdk the SDK version
	 */
	public void setMaxSdk(double maxSdk) {
		this.maxSdk = maxSdk;
	}
}
