package org.gravity.hulk;

import org.eclipse.core.runtime.Plugin;
import org.gravity.hulk.detection.antipattern.AntiPatternPackage;
import org.gravity.hulk.detection.codesmells.CodeSmellPackage;
import org.gravity.hulk.detection.metrics.MetricsPackage;
import org.osgi.framework.BundleContext;

public class HulkActivator extends Plugin {

	public static final String PLUGIN_ID = "org.gravity.hulk";

	public static final String ANTI_PATTERN_XMI_NAME = "AntiPattern.xmi";

	@Override
	public void start(final BundleContext context) throws Exception {
		super.start(context);
		MetricsPackage.INSTANCE.getClass();
		CodeSmellPackage.INSTANCE.getClass();
		AntiPatternPackage.INSTANCE.getClass();
	}
}
