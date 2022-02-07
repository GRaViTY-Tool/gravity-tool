/**
 *
 */
package org.gravity.modisco.codegen;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.java.ASTNode;
import org.eclipse.modisco.java.AbstractMethodDeclaration;
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.AnnotationTypeDeclaration;
import org.eclipse.modisco.java.ArrayInitializer;
import org.eclipse.modisco.java.ArrayType;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.Comment;
import org.eclipse.modisco.java.CompilationUnit;
import org.eclipse.modisco.java.Expression;
import org.eclipse.modisco.java.ImportDeclaration;
import org.eclipse.modisco.java.NamedElement;
import org.eclipse.modisco.java.Package;
import org.eclipse.modisco.java.StringLiteral;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.emf.JavaFactory;
import org.eclipse.modisco.java.generation.files.GenerateJavaExtended;
import org.gravity.eclipse.util.JavaProjectUtil;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.util.MoDiscoUtil;
import org.moflon.tgg.algorithm.delta.Delta;
import org.moflon.tgg.runtime.EMoflonEdge;

/**
 * @author speldszus
 *
 */
public class GravityModiscoCodeGenerator {

	private GravityModiscoCodeGenerator() {
		// This class shouldn't be instantiated
	}

	/**
	 * Generates Java code from the MoDisco model
	 *
	 * @param project the project into which the code should be generated
	 * @param model   the MoDisco model from which the code should be generated
	 * @param delta   the changes performed or null if the whole code base should be
	 *                generated
	 * @param monitor A progress monitor
	 * @throws CoreException
	 */
	public static void generateCode(final IJavaProject project, final MGravityModel model, final Delta delta,
			IProgressMonitor monitor) throws IOException, CoreException {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}
		postprocessAdditionsBwd(project, model, delta);

		final Collection<CompilationUnit> cus;
		if (delta == null) {
			cus = model.getCompilationUnits();
		} else {
			cus = getModifiedCUs(delta);
		}

		for (final CompilationUnit cu : cus) {
			update(cu, monitor);
		}
	}

	/**
	 * Updates the compilation unit on the file system
	 *
	 * @param cu      The compilation unit
	 * @param monitor A progress monitor
	 * @throws IOException If the compilation unit cannot be updated on the file
	 *                     system
	 */
	private static void update(final CompilationUnit cu, final IProgressMonitor monitor) throws IOException {
		final var fullPath = Paths.get(cu.getOriginalFilePath());
		if (cu.getTypes().isEmpty()) {
			if (Files.exists(fullPath)) {
				Files.delete(fullPath);
			}
		} else {
			var srcFolder = fullPath.getParent();
			var p = cu.getPackage();
			while (p != null) {
				srcFolder = srcFolder.getParent();
				p = p.getPackage();
			}
			new GenerateJavaExtended(cu, srcFolder.toFile(), Collections.emptyList())
			.doGenerate(new BasicMonitor.EclipseSubProgress(monitor, 1));
		}
	}

	/**
	 * Searches the modified compilation units from a delta
	 *
	 * @param delta The delta
	 * @return The modified CUs
	 */
	private static Set<CompilationUnit> getModifiedCUs(final Delta delta) {
		final Set<EObject> modified = new HashSet<>(delta.getAddedNodes());
		modified.addAll(delta.getDeletedNodes());
		for (final EMoflonEdge e : delta.getAddedEdges()) {
			if (!"usagesInTypeAccess".equals(e.getName())) {
				modified.add(e.getSrc());
			}
		}
		for (final EMoflonEdge e : delta.getDeletedEdges()) {
			if (!"usagesInTypeAccess".equals(e.getName())) {
				modified.add(e.getSrc());
			}
		}
		final Set<CompilationUnit> cus = new HashSet<>();
		for (final EObject e : modified) {
			if (e instanceof CompilationUnit) {
				cus.add((CompilationUnit) e);
			} else if (e instanceof ASTNode) {
				final var cu = ((ASTNode) e).getOriginalCompilationUnit();
				if (cu != null) {
					cus.add(cu);
				}
			}
		}
		return cus;
	}

	/**
	 * Postprocesses the transformation
	 *
	 * @param project
	 *
	 * @param model   The model to be postprocessed
	 * @throws CoreException
	 */
	private static void postprocessAdditionsBwd(final IJavaProject project, final MGravityModel model,
			final Delta delta) throws CoreException {
		addTypesToCompilationUnit(project, model);

		addMissingBlocks(model);

		final var added = getAddedSecurityAnnotations(model, delta);
		postprocessAddedAnnoatations(model, added);
	}

	/**
	 * Searches all newly added security annotations in the model or all security
	 * annotations if no delta is given
	 *
	 * @param model The model of the program
	 * @param delta The delta performed on the model
	 * @return The security annotations
	 */
	private static Collection<EObject> getAddedSecurityAnnotations(final MGravityModel model, final Delta delta) {
		Collection<EObject> added;
		if (delta == null) {
			added = getSecurityAnnotations(model);
		} else {
			added = delta.getAddedNodes();
		}
		return added;
	}

	/**
	 * Searches all security annotations in the given model
	 *
	 * @param model The MoDisco model
	 * @return all contained security annotation instances
	 */
	public static Collection<EObject> getSecurityAnnotations(final MGravityModel model) {
		Collection<EObject> added;
		added = new LinkedList<>();
		final var pack = MoDiscoUtil.getPackage(model,
				new String[] { "org", "gravity", "security", "annotations", "requirements" });
		if (pack != null) {
			for (final AbstractTypeDeclaration type : pack.getOwnedElements()) {
				if (type instanceof AnnotationTypeDeclaration) {
					for (final TypeAccess access : ((AnnotationTypeDeclaration) type).getUsagesInTypeAccess()) {
						added.add(access.eContainer());
					}
				}
			}
		}
		return added;
	}

	/**
	 * Adds a block and a todo-note to empty methods
	 *
	 * @param model The MoDisco model
	 */
	private static void addMissingBlocks(final MGravityModel model) {
		final Deque<Package> packages = new LinkedList<>(model.getOwnedElements());
		while (!packages.isEmpty()) {
			final var p = packages.pop();
			packages.addAll(p.getOwnedPackages());
			for (final Object method : p.getOwnedElements().parallelStream()
					.filter(type -> !type.isProxy() && (type instanceof ClassDeclaration))
					.flatMap(type -> type.getBodyDeclarations().parallelStream())
					.filter(AbstractMethodDeclaration.class::isInstance).map((AbstractMethodDeclaration.class::cast))
					.filter(method -> method.getBody() == null).toArray()) {
				final var block = JavaFactory.eINSTANCE.createBlock();
				((AbstractMethodDeclaration) method).setBody(block);
				final Comment comment = JavaFactory.eINSTANCE.createLineComment();
				comment.setContent("//TODO: Implement this operation");
				block.getComments().add(comment);
			}
		}
	}

	/**
	 * Fixes inconsistencies in added annotations
	 *
	 * @param model The model of the program
	 * @param additions the added annotations
	 */
	private static void postprocessAddedAnnoatations(final MGravityModel model, final Collection<EObject> additions) {
		final var array = getStringArray(model);

		for (final EObject eObject : additions) {
			if (eObject instanceof Annotation) {
				final var annotation = (Annotation) eObject;
				final var cu = getCUContainingAnnotation(annotation);
				if (cu == null) {
					continue;
				}
				updateImports(annotation, cu);
			} else if (eObject instanceof AnnotationMemberValuePair) {
				final var pair = (AnnotationMemberValuePair) eObject;
				if (pair.getMember() == null) {
					final var decl = JavaFactory.eINSTANCE.createAnnotationTypeMemberDeclaration();
					decl.setName(pair.getName());
					pair.setMember(decl);
					final var decl2Array = JavaFactory.eINSTANCE.createTypeAccess();
					decl.setType(decl2Array);
					decl2Array.setType(array);
				}
				final var value = pair.getValue();
				if (value instanceof ArrayInitializer) {
					escapeValueStrings(((ArrayInitializer) value));
				}
			}
		}
	}

	/**
	 * Escapes all strings in the array
	 *
	 * @param value An array initializer
	 */
	private static void escapeValueStrings(final ArrayInitializer value) {
		for (final Expression entry : value.getExpressions()) {
			if (entry instanceof StringLiteral) {
				final var stringLiteral = (StringLiteral) entry;
				if (!stringLiteral.getEscapedValue().matches("\".*\"")) {
					stringLiteral.setEscapedValue('\"' + stringLiteral.getEscapedValue() + '\"');
				}
			}
		}
	}

	private static void updateImports(final Annotation annotation, final CompilationUnit cu) {
		final var importedTypes = getImportedTypes(cu);

		final var type = annotation.getType().getType();
		if (!importedTypes.contains(type)) {
			importedTypes.add(type);
			final var imp = JavaFactory.eINSTANCE.createImportDeclaration();
			imp.setImportedElement(type);
			cu.getImports().add(imp);
		}
	}

	/**
	 * Retrieves all imports for a compilation unit
	 *
	 * @param cu      A compilation unit
	 * @return The types imported in the compilation unit
	 */
	private static HashSet<NamedElement> getImportedTypes(final CompilationUnit cu) {
		final var importedTypes = new HashSet<NamedElement>();
		for (final ImportDeclaration imp : cu.getImports()) {
			importedTypes.add(imp.getImportedElement());
		}
		return importedTypes;
	}

	/**
	 * Searches the compilation unit that contains the annotation
	 *
	 * @param annotation An annotation
	 * @return The compilation unit containing the annotation
	 */
	private static CompilationUnit getCUContainingAnnotation(final Annotation annotation) {
		var cu = annotation.getOriginalCompilationUnit();
		if (cu == null) {
			var current = annotation.eContainer();
			while (!(current instanceof AbstractTypeDeclaration)) {
				current = current.eContainer();
			}
			cu = ((AbstractTypeDeclaration) current).getOriginalCompilationUnit();
		}
		return cu;
	}

	/**
	 * Searches the array type representing string arrays
	 *
	 * @param model The model in which the type should be searched
	 * @return The type representing string arrays or null if not present
	 */
	private static ArrayType getStringArray(final MGravityModel model) {
		final var string = MoDiscoUtil.getOrCreateJavaLangString(model);
		ArrayType array = null;
		for (final Type orphan : model.getOrphanTypes()) {
			if (orphan instanceof ArrayType) {
				final var tmp = (ArrayType) orphan;
				if (tmp.getElementType().getType().equals(string)) {
					array = tmp;
					break;
				}
			}
		}
		return array;
	}

	private static void addTypesToCompilationUnit(final IJavaProject project, final MGravityModel model)
			throws CoreException {
		File src;
		final var result = Stream.of(project.getRawClasspath())
				.filter(c -> c.getEntryKind() == IClasspathEntry.CPE_SOURCE).findAny();
		if (result.isPresent()) {
			src = project.getProject().getWorkspace().getRoot().getFile(result.get().getPath()).getLocation().toFile();
		} else {
			JavaProjectUtil.createSrcFolders(Collections.singleton("src"), project, null);
			src = project.getProject().getFolder("src").getLocation().toFile().getAbsoluteFile();
		}

		final List<CompilationUnit> cus = new LinkedList<>();
		final Deque<Package> packages = new LinkedList<>(model.getOwnedElements());
		while (!packages.isEmpty()) {
			final var p = packages.pop();
			packages.addAll(p.getOwnedPackages());
			for (final AbstractTypeDeclaration type : p.getOwnedElements()) {
				if ((type.getOriginalCompilationUnit() == null) && !type.isProxy()) {
					final var cu = JavaFactory.eINSTANCE.createCompilationUnit();
					cu.setName(type.getName() + ".java");
					cu.getTypes().add(type);
					cu.setPackage(type.getPackage());
					cu.setOriginalFilePath(new File(src, MoDiscoUtil.getQualifiedName(type, "/") + ".java").toString());
					cus.add(cu);
				}
			}
		}
		model.getCompilationUnits().addAll(cus);
	}
}
