/**
 *
 */
package org.gravity.security.violation.patterns;

import javax.script.ScriptEngineManager;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.common.util.URI;
import org.mozilla.javascript.engine.RhinoScriptEngineFactory;
import org.osgi.framework.BundleContext;

/**
 * @author speldszus
 *
 */
public class SecurityViolationPatternsActivator extends Plugin {

	public static final String PLUGIN_ID = "org.gravity.security.violation.patterns";

	public static final URI URI_PATTERN_RULE = URI.createPlatformPluginURI('/'+PLUGIN_ID+"/SecureDependency.henshin", true);

	@Override
	public void start(final BundleContext context) throws Exception {
		super.start(context);
		final var manager = new ScriptEngineManager();
		if(manager.getEngineByName("JavaScript") == null) {
			manager.put("JavaScript", new RhinoScriptEngineFactory().getScriptEngine());
		}
	}
}
