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
		return this.minSdk;
	}

	/**
	 * Sets the minimal required SDK version
	 *
	 * @param minSdk the SDK version
	 */
	public void setMinSdk(final double minSdk) {
		this.minSdk = minSdk;
		if(this.targetSdk == Double.NaN) {
			this.targetSdk = minSdk;
		}
	}

	/**
	 * Returns the optimal target SDK version
	 *
	 * @return the SDK version
	 */
	public double getTargetSdk() {
		return this.targetSdk;
	}

	/**
	 * Sets the optimal target SDK version
	 *
	 * @param targetSdk the SDK version
	 */
	public void setTargetSdk(final double targetSdk) {
		this.targetSdk = targetSdk;
	}

	/**
	 * Returns the newest supported SDK version
	 *
	 * @return the SDK version
	 */
	public double getMaxSdk() {
		return this.maxSdk;
	}

	/**
	 * Sets the newest supported SDK version
	 *
	 * @param maxSdk the SDK version
	 */
	public void setMaxSdk(final double maxSdk) {
		this.maxSdk = maxSdk;
	}

	/**
	 * Updates the values of this SdkVersion
	 *
	 * @param other
	 */
	public void update(final SdkVersion other) {
		if (Double.isNaN(this.minSdk) || this.minSdk < other.getMinSdk()) {
			this.minSdk = other.getMinSdk();
		}

		if (Double.isNaN(this.maxSdk) || this.maxSdk > other.getMaxSdk()) {
			this.maxSdk = other.getMaxSdk();
		}

		if(Double.isNaN(this.targetSdk)) {
			this.targetSdk = other.getTargetSdk();
		}
	}
}
