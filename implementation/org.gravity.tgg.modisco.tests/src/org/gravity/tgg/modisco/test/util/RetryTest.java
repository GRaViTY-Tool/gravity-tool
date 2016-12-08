package org.gravity.tgg.modisco.test.util;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

//http://stackoverflow.com/a/8301639
public class RetryTest implements TestRule {

	private final int retryCount;

	public RetryTest(final int retryCount) {
		this.retryCount = retryCount;
	}

	@Override
	public Statement apply(final Statement base, final Description description) {

		return new Statement() {
			@Override
			public void evaluate() throws Throwable {
				Throwable caughtThrowable = null;

				// implement retry logic here
				for (int i = 0; i < RetryTest.this.retryCount; i++) {
					try {
						base.evaluate();
						return;
					} catch (final Throwable t) {
						caughtThrowable = t;
						System.err.println("\n" + description.getDisplayName() + ": run " + (i + 1) + " failed.\n");
					}
				}
				System.err.println("\n" + description.getDisplayName() + ": giving up after "
						+ RetryTest.this.retryCount + " failures.\n");
				throw caughtThrowable;
			}
		};

	}
}