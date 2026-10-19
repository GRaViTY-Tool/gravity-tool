package org.gravity.tgg.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.core.runtime.jobs.Job;
import org.junit.Test;

public class ModelSaveJobGuardTest {

	@Test
	public void waitsForAllScheduledSaves() throws InterruptedException {
		final var saved = new AtomicInteger();
		final var first = Job.create("Save models", monitor -> { saved.incrementAndGet(); });
		final var second = Job.create("Save models", monitor -> { saved.incrementAndGet(); });
		try {
			first.schedule(100);
			second.schedule(200);
			ModelSaveJobGuard.awaitPendingSaves();
			assertEquals("Both converters must finish saving before cleanup", 2, saved.get());
		} finally {
			first.cancel();
			second.cancel();
			first.join();
			second.join();
		}
	}

	@Test
	public void interruptionAbortsCleanupAndPreservesInterruptFlag() throws InterruptedException {
		final var save = Job.create("Save models", monitor -> { });
		try {
			save.schedule(60_000);
			Thread.currentThread().interrupt();
			try {
				ModelSaveJobGuard.awaitPendingSaves();
				fail("Cleanup must not proceed when waiting for saves is interrupted");
			} catch (final IllegalStateException e) {
				assertTrue(e.getCause() instanceof InterruptedException);
				assertTrue(Thread.currentThread().isInterrupted());
			}
		} finally {
			Thread.interrupted();
			save.cancel();
			save.join();
		}
	}
}
