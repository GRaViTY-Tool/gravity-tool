package org.gravity.tgg.test.util;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

//http://stackoverflow.com/a/8301639
public class RetryTest implements TestRule {

	private static final Logger LOGGER = Logger.getLogger(RetryTest.class.getName());
	
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
						LOGGER.log(Level.WARN, "\n" + description.getDisplayName() + ": run " + (i + 1) + " failed.\n");
					}
				}
				LOGGER.log(Level.ERROR, "\n" + description.getDisplayName() + ": giving up after "
						+ RetryTest.this.retryCount + " failures.\n");
				throw caughtThrowable;
			}
		};

	}
}