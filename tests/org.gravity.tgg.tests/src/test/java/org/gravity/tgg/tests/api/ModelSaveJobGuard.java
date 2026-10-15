package org.gravity.tgg.tests.api;

import org.eclipse.core.runtime.jobs.Job;

/** Test-only barrier: never delete a workspace project while model saves are running. */
final class ModelSaveJobGuard {
    private ModelSaveJobGuard() {}

    static void awaitPendingSaves() throws InterruptedException {
        // A save job can be scheduled by a different test's converter.
        // Join existing jobs before tearing down any shared Eclipse workspace state.
        for (final Job job : Job.getJobManager().find(null)) {
            if ("Save models".equals(job.getName())) {
                job.join();
            }
        }
    }
}
