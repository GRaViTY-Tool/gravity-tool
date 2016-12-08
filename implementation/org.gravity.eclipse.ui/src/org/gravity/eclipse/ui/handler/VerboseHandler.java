package org.gravity.eclipse.ui.handler;

import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.commands.IElementUpdater;
import org.eclipse.ui.menus.UIElement;
import org.gravity.eclipse.GravityActivator;

public class VerboseHandler extends AbstractHandler implements IElementUpdater {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		GravityActivator gravity_activator = GravityActivator.getDefault();
		boolean verbose = gravity_activator.isVerbose();
		gravity_activator.setVerbose(!verbose);

		return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		return true;
	}

	@Override
	public void updateElement(UIElement element, @SuppressWarnings("rawtypes") Map parameters) {
		if (GravityActivator.getDefault().isVerbose()) {
			element.setText("Disable verbose");
		} else {
			element.setText("Enable verbose");
		}
	}
}
