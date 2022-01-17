/**
 *
 */
package org.gravity.security.violation.patterns;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.common.util.URI;

/**
 * @author speldszus
 *
 */
public class SecurityViolationPatternsActivator extends Plugin {

	public static final String PLUGIN_ID = "org.gravity.security.violation.patterns";

	public static final URI URI_PATTERN_RULE = URI.createPlatformPluginURI('/'+PLUGIN_ID+"/SecureDependency.henshin", true);

}
