package org.gravity.tgg.modisco.test.util;

import java.nio.file.Path;

public class TestBody {

	private final String testName;
	private final Path srcXMI;
	private final Path expXMI;
	private final Path outFolder;

	public TestBody(final String testName, final Path srcXMI, final Path expXMI, final Path outFolder) {
		this.testName = testName;
		this.srcXMI = srcXMI;
		this.expXMI = expXMI;
		this.outFolder = outFolder;
	}

	public String getTestName() {
		return this.testName;
	}

	public Path getSrcXMI() {
		return this.srcXMI;
	}

	public Path getExpXMI() {
		return this.expXMI;
	}

	public Path getOutFolder() {
		return this.outFolder;
	}

}
