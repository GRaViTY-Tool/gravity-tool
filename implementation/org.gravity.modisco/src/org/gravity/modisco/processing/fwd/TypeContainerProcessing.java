/**
 *
 */
package org.gravity.modisco.processing.fwd;

import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.ClassFile;
import org.eclipse.modisco.java.emf.JavaFactory;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.processing.AbstractTypedModiscoProcessor;
import org.gravity.modisco.util.MoDiscoUtil;

/**
 * A processor for adding accesses to members
 *
 * @author speldszus
 *
 */
public class TypeContainerProcessing extends AbstractTypedModiscoProcessor<AbstractTypeDeclaration> {

	/**
	 * The logger of this class
	 */
	private static final Logger LOGGER = Logger.getLogger(TypeContainerProcessing.class);

	@Override
	public boolean process(final MGravityModel model, final Collection<AbstractTypeDeclaration> elements,
			final IFolder debug, final IProgressMonitor monitor) {
		elements.add(MoDiscoUtil.getOrCreateJavaLangObject(model));

		final List<ClassFile> classFiles = model.getClassFiles();
		for (final AbstractTypeDeclaration type : elements) {
			if (type.getOriginalClassFile() == null && type.getOriginalCompilationUnit() == null) {
				if (!type.isProxy()) {
					LOGGER.error("Found source file that is not in compilation unit: " + type);
					return false;
				}
				classFiles.add(this.createClassFile(type, model));
			}
		}

		return true;
	}

	private ClassFile createClassFile(final AbstractTypeDeclaration type, final MGravityModel model) {
		final var file = JavaFactory.eINSTANCE.createClassFile();
		var name = type.getName();
		String qualifiedName;
		if (name.endsWith(";")) {
			qualifiedName = name.substring(1, name.length() - 1);
			final var separator = qualifiedName.lastIndexOf('/');
			name = qualifiedName.substring(separator + 1);
			if (type.getPackage() == null) {
				final var namespace = qualifiedName.substring(0, separator);
				final var object = MoDiscoUtil.getOrCreatePackage(model, namespace.split("/"));
				type.setPackage(object);
			}
		} else {
			qualifiedName = MoDiscoUtil.getQualifiedName(type, "/");
		}
		file.setName(name + ".class");
		file.setOriginalFilePath("${CP}/" + qualifiedName + ".class");
		var namespace = type.getPackage();
		if (namespace == null && type.eContainer() instanceof final AbstractTypeDeclaration container) {
			namespace = container.getPackage();
		}
		file.setPackage(namespace);
		file.setProxy(file.isProxy());
		file.setType(type);
		type.setOriginalClassFile(file);
		return file;
	}

	@Override
	public Class<AbstractTypeDeclaration> getSupportedType() {
		return AbstractTypeDeclaration.class;
	}

}
