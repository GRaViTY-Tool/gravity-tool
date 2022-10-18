/**
 *
 */
package org.gravity.eclipse.importer.gradle;

import java.util.LinkedList;
import java.util.List;

/**
 * A data class storing supported SDK versions for building a project
 *
 * @author speldszus
 *
 */
public class SdkVersion {

	private final int minSdk;
	private final int targetSdk;
	private final int maxSdk;

	/**
	 * Determines the SDK version information of the android project described in
	 * the gradle build file
	 *
	 * @param gradleContent The content of the gradle build file
	 */
	public SdkVersion(final CharSequence... gradleContent) {
		final List<Integer> minValues = new LinkedList<>();
		final List<Integer> targetValues = new LinkedList<>();
		final List<Integer> compileValues = new LinkedList<>();
		for(final CharSequence content: gradleContent) {
			final var matcherSdk = GradleRegexPatterns.ANDROID_SDK_VERSION.matcher(content);
			while (matcherSdk.find()) {
				final var group = matcherSdk.group(1);
				final var value = Integer.parseInt(matcherSdk.group(7));
				if ("minSdkVersion".equals(group)) {
					minValues.add(value);
				} else if ("targetSdkVersion".equals(group)) {
					targetValues.add(value);
				} else if ("compileSdkVersion".equals(group)) {
					compileValues.add(value);
				}
			}
		}
		final var min = minValues.stream().mapToInt(Integer::intValue).max();
		final var target = targetValues.stream().mapToInt(Integer::intValue).min();
		final var compile = compileValues.stream().mapToInt(Integer::intValue).min();

		this.minSdk = min.orElse(0);
		if (target.isPresent()) {
			this.targetSdk = target.getAsInt();
			this.maxSdk = compile.orElse(this.targetSdk);
		} else if (compile.isPresent()) {
			this.maxSdk = compile.getAsInt();
			this.targetSdk = this.maxSdk;
		} else {
			this.targetSdk = this.minSdk;
			this.maxSdk = this.minSdk;
		}
	}

	/**
	 * Returns the minimal required SDK version
	 *
	 * @return the SDK version
	 */
	public int getMinSdk() {
		return this.minSdk;
	}

	/**
	 * Returns the optimal target SDK version
	 *
	 * @return the SDK version
	 */
	public int getTargetSdk() {
		return this.targetSdk;
	}

	/**
	 * Returns the newest supported SDK version
	 *
	 * @return the SDK version
	 */
	public int getMaxSdk() {
		return this.maxSdk;
	}
}
