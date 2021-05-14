package org.gravity.security.analysis.handlers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.annotations.TAnnotationType;

/**
 * This class contains an experiment for searching paths from sensitive data to
 * public interfaces not declared with <code>@Api</code>
 *
 * @author speldszus
 *
 */
public class PublicInterfacesAccessHandler extends AbstractHandler {

	static final Logger LOGGER = Logger.getLogger(PublicInterfacesAccessHandler.class.getName());

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		final ISelectionService service = window.getSelectionService();
		final IStructuredSelection structured = (IStructuredSelection) service.getSelection();
		final List<Object> selection = Arrays.asList(structured.toArray());

		final Job job = new CreateProgramModelJob("Create PG", selection);
		job.setUser(true);
		job.schedule();

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

	static void dfs(final TMember member, final Set<TAnnotationType> allowed, final Set<String> names, final Set<TMember> visited) {
		final Set<TMember> accessing = new HashSet<>();
		for (final TAccess access : member.getAccessedBy()) {
			final TMember tSource = access.getSource();
			if (!visited.contains(tSource)) {
				accessing.add(tSource);
			}
		}
		for (final TMember tSource : accessing) {
			visited.add(tSource);
			if (names.contains(tSource.getDefinedBy().getFullyQualifiedName())) {
				LOGGER.log(Level.INFO,
						"Access violation for \"" + member.getSignatureString() + "\" at \""
								+ tSource.getSignatureString() + "\" in class \""
								+ tSource.getDefinedBy().getFullyQualifiedName() + "\"");
				continue;
			}
			if (tSource.getAccessedBy().isEmpty()) { // TODO: Replace by access modifier check
				boolean bool = false;
				for (final TAnnotation annotation : tSource.getTAnnotation()) {
					bool |= allowed.contains(annotation.getType());
				}
				if (!bool) {
					LOGGER.log(Level.INFO,
							"Potential access violation for \"" + member.getSignatureString() + "\" at \""
									+ tSource.getSignatureString() + "\" in class \""
									+ tSource.getDefinedBy().getFullyQualifiedName() + "\"");
				}
			}
			dfs(tSource, allowed, names, visited);
		}
	}
}
