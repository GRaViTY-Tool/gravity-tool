/**
 *
 */
package org.gravity.modisco.codegen;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.java.ASTNode;
import org.eclipse.modisco.java.AbstractMethodDeclaration;
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.AnnotationTypeDeclaration;
import org.eclipse.modisco.java.AnnotationTypeMemberDeclaration;
import org.eclipse.modisco.java.ArrayInitializer;
import org.eclipse.modisco.java.ArrayType;
import org.eclipse.modisco.java.Block;
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
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.util.MoDiscoUtil;
import org.moflon.tgg.algorithm.delta.Delta;
import org.moflon.tgg.runtime.EMoflonEdge;

/**
 * @author speldszus
 *
 */
public class GravityModiscoCodeGenerator {

	private static final Logger LOGGER = Logger.getLogger(GravityModiscoCodeGenerator.class);

	/**
	 * Generates Java code from the MoDisco model
	 *
	 * @param project the project into which the code should be generated
	 * @param model   the MoDisco model from which the code should be generated
	 * @param delta   the changes performed or null if the whole code base should be
	 *                generated
	 * @param monitor A progress monitor
	 */
	public static void generateCode(final IProject project, final MGravityModel model, final Delta delta,
			IProgressMonitor monitor) throws IOException {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}
		postprocessAdditionsBwd(model, delta);

		final Collection<CompilationUnit> cus;
		if (delta == null) {
			cus = model.getCompilationUnits();
		} else {
			cus = getModifiedCUs(delta);
		}

		for (final CompilationUnit cu : cus) {
			update(project, cu, monitor);
		}
	}

	/**
	 * @param project
	 * @param cu
	 * @param monitor
	 * @throws IOException
	 */
	private static void update(final IProject project, final CompilationUnit cu, final IProgressMonitor monitor)
			throws IOException {
		final Path fullPath = Paths.get(cu.getOriginalFilePath());
		if (cu.getTypes().isEmpty()) {
			if (Files.exists(fullPath)) {
				Files.delete(fullPath);
			}
		} else {
			Path srcFolder = fullPath.getParent();
			Package p = cu.getPackage();
			while (p != null) {
				srcFolder = srcFolder.getParent();
				p = p.getPackage();
			}
			new GenerateJavaExtended(cu, srcFolder.toFile(), Collections.emptyList())
			.doGenerate(new BasicMonitor.EclipseSubProgress(monitor, 1));
		}
	}

	/**
	 * @param delta
	 * @return
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
				final CompilationUnit cu = ((ASTNode) e).getOriginalCompilationUnit();
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
	 * @param model The model to be postprocessed
	 */
	private static void postprocessAdditionsBwd(final MGravityModel model, final Delta delta) {
		addTypesToCompilationUnit(model);

		addMissingBlocks(model);

		final Collection<EObject> added = getAddedSecurityAnnotations(model, delta);
		postprocessAddedAnnoatations(model, added);
	}

	/**
	 * @param model
	 * @param delta
	 * @return
	 */
	private static Collection<EObject> getAddedSecurityAnnotations(final MGravityModel model, final Delta delta) {
		Collection<EObject> added;
		if (delta == null) {
			added = new LinkedList<>();
			final Package pack = MoDiscoUtil.getPackage(model,
					new String[] { "org", "gravity", "security", "annotations", "requirements" });
			for (final AbstractTypeDeclaration type : pack.getOwnedElements()) {
				if (type instanceof AnnotationTypeDeclaration) {
					for (final TypeAccess access : ((AnnotationTypeDeclaration) type).getUsagesInTypeAccess()) {
						added.add(access.eContainer());
					}
				}
			}
		} else {
			added = delta.getAddedNodes();
		}
		return added;
	}

	/**
	 * @param model
	 */
	private static void addMissingBlocks(final MGravityModel model) {
		final Deque<Package> packages = new LinkedList<>(model.getOwnedElements());
		while (!packages.isEmpty()) {
			final Package p = packages.pop();
			packages.addAll(p.getOwnedPackages());
			for (final Object method : p.getOwnedElements().parallelStream()
					.filter(type -> !type.isProxy() && (type instanceof ClassDeclaration))
					.flatMap(type -> type.getBodyDeclarations().parallelStream())
					.filter(body -> (body instanceof AbstractMethodDeclaration))
					.map(body -> (AbstractMethodDeclaration) body).filter(method -> method.getBody() == null)
					.toArray()) {
				final Block block = JavaFactory.eINSTANCE.createBlock();
				((AbstractMethodDeclaration) method).setBody(block);
				final Comment comment = JavaFactory.eINSTANCE.createLineComment();
				comment.setContent("//TODO: Implement this operation");
				block.getComments().add(comment);
			}
		}
	}

	/**
	 * @param model
	 * @param additions
	 */
	private static void postprocessAddedAnnoatations(final MGravityModel model, final Collection<EObject> additions) {
		final Type string = MoDiscoUtil.getOrCreateJavaLangString(model);
		ArrayType array = null;
		for (final Type orphan : model.getOrphanTypes()) {
			if (orphan instanceof ArrayType) {
				final ArrayType tmp = (ArrayType) orphan;
				if (tmp.getElementType().getType().equals(string)) {
					array = tmp;
					break;
				}
			}
		}

		final Map<CompilationUnit, HashSet<NamedElement>> imports = new HashMap<>();
		for (final EObject eObject : additions) {
			if (eObject instanceof Annotation) {
				final Annotation annotation = (Annotation) eObject;
				CompilationUnit cu = annotation.getOriginalCompilationUnit();
				if (cu == null) {
					EObject current = eObject.eContainer();
					while (!(current instanceof AbstractTypeDeclaration)) {
						current = current.eContainer();
					}
					cu = ((AbstractTypeDeclaration) current).getOriginalCompilationUnit();
				}
				if (cu == null) {
					continue;
				}
				HashSet<NamedElement> importedTypes;
				if (imports.containsKey(cu)) {
					importedTypes = imports.get(cu);
				} else {
					importedTypes = new HashSet<>();
					for (final ImportDeclaration imp : cu.getImports()) {
						importedTypes.add(imp.getImportedElement());
					}
					imports.put(cu, importedTypes);
				}

				final Type type = annotation.getType().getType();
				if (!importedTypes.contains(type)) {
					importedTypes.add(type);
					final ImportDeclaration imp = JavaFactory.eINSTANCE.createImportDeclaration();
					imp.setImportedElement(type);
					cu.getImports().add(imp);
				}
			} else if (eObject instanceof AnnotationMemberValuePair) {
				final AnnotationMemberValuePair pair = (AnnotationMemberValuePair) eObject;
				if (pair.getMember() == null) {
					final AnnotationTypeMemberDeclaration decl = JavaFactory.eINSTANCE
							.createAnnotationTypeMemberDeclaration();
					decl.setName(pair.getName());
					pair.setMember(decl);
					final TypeAccess decl2Array = JavaFactory.eINSTANCE.createTypeAccess();
					decl.setType(decl2Array);
					decl2Array.setType(array);
				}
				final Expression value = pair.getValue();
				if (value instanceof ArrayInitializer) {
					for (final Expression entry : ((ArrayInitializer) value).getExpressions()) {
						if (entry instanceof StringLiteral) {
							final StringLiteral stringLiteral = (StringLiteral) entry;
							if (!stringLiteral.getEscapedValue().matches("\".*\"")) {
								stringLiteral.setEscapedValue('\"' + stringLiteral.getEscapedValue() + '\"');
							}
						}
					}

				}

			}
		}
	}

	private static void addTypesToCompilationUnit(final MGravityModel model) {
		final List<CompilationUnit> cus = new LinkedList<>();
		final Deque<Package> packages = new LinkedList<>(model.getOwnedElements());
		while (!packages.isEmpty()) {
			final Package p = packages.pop();
			packages.addAll(p.getOwnedPackages());
			for (final AbstractTypeDeclaration type : p.getOwnedElements()) {
				if ((type.getOriginalCompilationUnit() == null) && !type.isProxy()) {
					final CompilationUnit cu = JavaFactory.eINSTANCE.createCompilationUnit();
					cu.setName(type.getName() + ".java");
					cu.getTypes().add(type);
					cu.setPackage(type.getPackage());
					cus.add(cu);
				}
			}
		}
		model.getCompilationUnits().addAll(cus);
	}
}
