package org.gravity.tgg.test.util;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import org.junit.Assert;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class ToFileLogger implements TestRule {

	private final Path path;

	public ToFileLogger(final Path path) {
		this.path = path;
	}

	@Override
	public Statement apply(final Statement base, final Description description) {

		return new Statement() {

			@Override
			public void evaluate() throws Throwable {

				Assert.assertFalse(
						String.format("%s links to a file. But the target for the log output needs to be a folder.",
								ToFileLogger.this.path),
						Files.isRegularFile(ToFileLogger.this.path));

				final String correctTestName = description	.getMethodName()
															.replaceAll("[^a-zA-Z0-9_\\.\\-]", "");
				final Path target = ToFileLogger.this.path.resolve(String.format("%s.testlog.txt", correctTestName));

				Files.createDirectories(ToFileLogger.this.path);

				final OutputStream outputStream = Files.newOutputStream(target, StandardOpenOption.CREATE,
						StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);

				final PrintStream outStream = new PrintStream(outputStream, true) {
					@Override
					public void print(final String out) {
						super.print("LOG: " + out);
					}
				};
				final PrintStream errorStream = new PrintStream(outputStream, true) {
					@Override
					public void print(final String out) {
						super.print("ERROR: " + out);
					}
				};

				Throwable error = null;

				try {

					System.setOut(outStream);
					System.setErr(errorStream);

					base.evaluate();

				} catch (final Throwable t) {
					error = t;
				} finally {

					try {
						outStream.close();
					} catch (final Throwable t) {

					}
					try {
						errorStream.close();
					} catch (final Throwable t) {

					}

					try {
						outputStream.flush();
					} catch (final Throwable t) {

					}

					System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
					System.setErr(new PrintStream(new FileOutputStream(FileDescriptor.err)));

				}

				if (error != null) {
					throw error;
				}

			}
		};
	}

}
