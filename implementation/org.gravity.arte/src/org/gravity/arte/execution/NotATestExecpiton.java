package org.gravity.arte.execution;

public class NotATestExecpiton extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7858636105297263745L;
	private String test_name;

	public NotATestExecpiton(String test_name) {
		this.test_name = test_name;
	}

	public String getTest_name() {
		return test_name;
	}
}
