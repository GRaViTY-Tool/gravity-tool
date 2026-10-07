package org.gravity.hulk.resolve;

import org.eclipse.core.runtime.Plugin;
import org.gravity.hulk.resolve.antipattern.AntiPatternResolvePackage;
import org.osgi.framework.BundleContext;

public class ResolveActivator extends Plugin {

	@Override
	public void start(final BundleContext context) throws Exception {
		super.start(context);
		AntiPatternResolvePackage.INSTANCE.getClass();
	}
}
