package security.annotations.ui;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.gravity.eclipse.selection.SelectionHelper;
import org.gravity.security.annotations.AnnotationsActivator;

public class SecurityAnnotationsAdditionHandler implements IHandler {

	private static final Logger LOGGER = Logger.getLogger(SecurityAnnotationsAdditionHandler.class);

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// no listener needed
	}

	@Override
	public void dispose() {
		// nothing to do
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		ISelectionService service = window.getSelectionService();
		IStructuredSelection structured = (IStructuredSelection) service.getSelection();
		List<Object> workspaceSelection = Arrays.asList(structured.toArray());

		for (IJavaProject project : SelectionHelper.getJavaProjects(workspaceSelection)) {
			try {
				AnnotationsActivator.applyUMLsecLib(project, new NullProgressMonitor());
			} catch (CoreException | IOException e) {
				LOGGER.error(e);
			}
		}

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
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// nothing to do
	}

}
