package org.gravity.tgg.tests;

import org.eclipse.core.runtime.jobs.Job;

/** Waits for converter autosaves before tests mutate models or delete projects. */
public final class ModelSaveJobGuard {

	private ModelSaveJobGuard() {
	}

	public static void awaitPendingSaves() {
		// GravityAPI can replace a converter while its previous save is still pending.
		// Include saves from those converters as well as the currently cached one.
		for (final Job job : Job.getJobManager().find(null)) {
			if ("Save models".equals(job.getName())) {
				try {
					job.join();
				} catch (final InterruptedException e) {
					Thread.currentThread().interrupt();
					throw new IllegalStateException("Interrupted waiting for model saves", e);
				}
			}
		}
	}
}
