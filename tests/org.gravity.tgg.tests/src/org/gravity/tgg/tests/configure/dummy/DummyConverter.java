package org.gravity.tgg.tests.configure.dummy;

import java.util.Collection;
import java.util.function.Consumer;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.typegraph.basic.TypeGraph;

class DummyConverter implements IPGConverter {
	@Override
	public boolean syncProjectFwd(final Consumer<EObject> consumer, final IProgressMonitor monitor) {
		return false;
	}

	@Override
	public boolean syncProjectFwd(final IProgressMonitor monitor) {
		return false;
	}

	@Override
	public boolean syncProjectBwd(final Consumer<EObject> consumer, final IProgressMonitor monitor) {
		return false;
	}

	@Override
	public void setDebug(final boolean debug) {
	}

	@Override
	public boolean save(final IProgressMonitor monitor) {
		return false;
	}

	@Override
	public boolean isDebug() {
		return false;
	}

	@Override
	public TypeGraph getPG() {
		return null;
	}

	@Override
	public boolean discard() {
		return false;
	}

	@Override
	public boolean convertProject(final Collection<IPath> libs, final IProgressMonitor monitor) {
		return false;
	}

	@Override
	public boolean convertProject(final IProgressMonitor monitor) {
		return false;
	}
}