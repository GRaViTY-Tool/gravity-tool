package org.gravity.typegraph.basic;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class BasicCode {

	public void execute() throws IOException {

		// Load the BasicPackage
		BasicPackage basicInstance = BasicPackage.eINSTANCE;

		// Load / Create Resource
		ResourceSet resourceSet = new ResourceSetImpl();
		// Register Meta Model
		resourceSet.getPackageRegistry().put(basicInstance.getNsURI(), basicInstance);
		Resource packageResource = resourceSet.getResource(URI.createURI("/path/Basic.xmi", true), true);

		System.out.println("Resource: " + packageResource);

	}

}
