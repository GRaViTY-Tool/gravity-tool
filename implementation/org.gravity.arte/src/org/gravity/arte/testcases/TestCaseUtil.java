package org.gravity.arte.testcases;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.gravity.arte.testdsl.arteLanguage.Test_File;

import com.google.inject.Injector;

public class TestCaseUtil {

	private Injector xtext;

	public TestCaseUtil(Injector xtext) {
		this.xtext = xtext;
	}

	public Test_File parseTestCase(IFile test_case_file) throws IOException, CoreException {
		XtextResourceSet resourceSet = xtext.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.createResource(URI.createFileURI(test_case_file.toString()));
		resource.load(test_case_file.getContents(), Collections.EMPTY_MAP);
		return (Test_File) resource.getContents().get(0);
	}
}
