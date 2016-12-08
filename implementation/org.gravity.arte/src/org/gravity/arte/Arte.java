package org.gravity.arte;

import org.eclipse.core.runtime.Plugin;
import org.gravity.arte.execution.TestExecution;
import org.gravity.arte.execution.Timer;
import org.gravity.arte.testcases.TestCaseUtil;
import org.gravity.arte.testdsl.ARTELanguageRuntimeModule;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Arte extends Plugin {

	public static final String ARTE_NATURE_ID = "org.eclipse.xtext.ui.shared.xtextNature"; //$NON-NLS-1$

	public final String version = "ARTE4GRaViTY 0.9.0 alpha"; //$NON-NLS-1$

	private static Arte INSTANCE;

	// Accessible classes
	private Timer timer;
	private TestExecution test_execution;
	private Injector xtext;
	private TestCaseUtil test_case_util;

	public Arte() {
		// Setup Xtext
		// new StandaloneSetup().setPlatformUri("../"); //$NON-NLS-1$
		xtext = Guice.createInjector(new ARTELanguageRuntimeModule());
		setTest_case_util(new TestCaseUtil(xtext));
		setTest_execution(new TestExecution(timer));
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		INSTANCE = null;
		super.stop(context);
	}

	public static Arte getInstance() {
		return INSTANCE;
	}

	public String getVersion() {
		return version;
	}

	public TestCaseUtil getTest_case_util() {
		return test_case_util;
	}

	public void setTest_case_util(TestCaseUtil test_case_util) {
		this.test_case_util = test_case_util;
	}

	public TestExecution getTest_execution() {
		return test_execution;
	}

	public void setTest_execution(TestExecution test_execution) {
		this.test_execution = test_execution;
	}
}
