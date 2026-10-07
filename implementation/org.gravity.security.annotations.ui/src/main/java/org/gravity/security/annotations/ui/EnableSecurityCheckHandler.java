package org.gravity.security.annotations.ui;

import java.util.Map;
import java.util.function.Function;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.ui.commands.IElementUpdater;
import org.eclipse.ui.menus.UIElement;
import org.gravity.eclipse.ui.handler.UISelectionHelper;
import org.gravity.security.annotations.SecurityAnnoationsCheckActivator;

public class EnableSecurityCheckHandler implements IHandler, IElementUpdater {

	/**
	 * True if this handler will enable security checks
	 */
	private boolean enable = false;

	@Override
	public void addHandlerListener(final IHandlerListener handlerListener) {
		// Nothing to do
	}

	@Override
	public void dispose() {
		// Nothing to do
	}

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		this.enable = this.disabledSecurityCheckInSelection(event);
		for (final var project : UISelectionHelper.getJavaProjects(event)) {
			SecurityAnnoationsCheckActivator.setChecksEnabled(project.getProject(), this.enable);
		}
		return null;
	}

	/**
	 * Checks whether the Java projects in the selection contain at least one
	 * project for which the security checks are disabled
	 *
	 * @param event The event triggering this handler
	 * @return <code>true</code> if for at least one project the security checks are
	 *         disabled, <code>false</code> otherwise
	 * @throws ExecutionException
	 */
	private boolean disabledSecurityCheckInSelection(final ExecutionEvent event) throws ExecutionException {
		return UISelectionHelper.getJavaProjects(event).stream()
				.map((Function<? super IJavaProject, ? extends IProject>) IJavaProject::getProject)
				.map(SecurityAnnoationsCheckActivator::checksEnabled).filter(s -> !s).findAny().orElse(false);
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
	public void removeHandlerListener(final IHandlerListener handlerListener) {
		// Nothing to do
	}

	@Override
	public void updateElement(final UIElement element, final Map parameters) {
		if (this.enable) {
			element.setText("Enable Secure Dependency Check");
		} else {
			element.setText("Disable Secure Dependency Check");
		}
	}

}
