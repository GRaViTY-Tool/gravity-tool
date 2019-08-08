/**
 * 
 */
package org.gravity.eclipse.importer.maven;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.importer.ImportException;
import org.gravity.eclipse.importer.ProjectImport;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * A project importer for maven projects
 * 
 * @author speldszus
 *
 */
public class MavenImport extends ProjectImport {

	private static final DocumentBuilderFactory DOCUMENT_BUILDER = DocumentBuilderFactory.newInstance();

	/**
	 * Creates an new instance of the maven project importer
	 * 
	 * @param rootDir The root directory of the maven project to import
	 * @param ignoreBuildErrors If build errors should be ignored
	 * @throws ImportException If the importer cannot be created for the project
	 */
	public MavenImport(File rootDir, boolean ignoreBuildErrors) throws ImportException {
		super(rootDir, "pom.xml", ignoreBuildErrors);
	}

	/* (non-Javadoc)
	 * @see org.gravity.eclipse.importer.ProjectImport#importProject(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public IJavaProject importProject(IProgressMonitor monitor) throws ImportException {
		File parentPom = getRootFile();
		Document document;
		try {
			document = DOCUMENT_BUILDER.newDocumentBuilder().parse(parentPom);
		} catch (SAXException | IOException | ParserConfigurationException e) {
			throw new ImportException(e);
		}
		NodeList modules = document.getElementsByTagName("module");
		for(int i = 0; i < modules.getLength(); i++) {
			Node module = modules.item(i);
			String text = module.getTextContent();
			new File(getRootDir(), text);
		}
		return null;
	}

}
