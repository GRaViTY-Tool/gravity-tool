package org.gravity.tgg.modisco.pm.processing.pg;

import org.eclipse.core.runtime.IProgressMonitor;
import org.gravity.typegraph.basic.TypeGraph;

public interface IProgramGraphProcessor {
	
	public boolean process(TypeGraph pg, IProgressMonitor monitor);
}
