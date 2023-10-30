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
		
		List<ClassFile> classFiles = model.getClassFiles();
		for (AbstractTypeDeclaration type : elements) {
			if (type.getOriginalClassFile() == null && type.getOriginalCompilationUnit() == null) {
				if (type.isProxy()) {
					classFiles.add(createClassFile(type));
				}
				else {
					LOGGER.error("Found source file that is not in compilation unit: "+type);
					return false;
				}
			}
		}

		return true;
	}

	private ClassFile createClassFile(AbstractTypeDeclaration type) {
		ClassFile file = JavaFactory.eINSTANCE.createClassFile();
		file.setName(type.getName() + ".class");
		file.setOriginalFilePath("${CP}/" + file.getName());
		file.setPackage(type.getPackage());
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
