/**
 *
 */
package org.gravity.modisco.util;

import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.InterfaceDeclaration;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.Package;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.PrimitiveTypeVoid;
import org.eclipse.modisco.java.SingleVariableDeclaration;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.UnresolvedClassDeclaration;
import org.eclipse.modisco.java.emf.JavaFactory;
import org.eclipse.osgi.util.NLS;
import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MConstructorDefinition;
import org.gravity.modisco.MEntry;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MParameterList;
import org.gravity.modisco.MSingleVariableDeclaration;
import org.gravity.modisco.Messages;
import org.gravity.modisco.ModiscoFactory;

/**
 * This class provides frequently required functionalities when working with
 * modisco models
 *
 * @author speldszus
 *
 */
public final class MoDiscoUtil {

	private static final Logger LOGGER = Logger.getLogger(MoDiscoUtil.class);

	/**
	 * The name of the Java default package as used by MoDisco
	 */
	public static final String DEFAULT_PACKAGE = "(default package)";

	private MoDiscoUtil() {
		// This class shouldn't be instantiated
	}

	public static ClassDeclaration getSuperClass(final ClassDeclaration mClass) {
		final var superAccess = mClass.getSuperClass();
		if (superAccess != null) {
			final var superType = superAccess.getType();
			if (superType instanceof ClassDeclaration declaration) {
				return declaration;
			} else if (superType instanceof ParameterizedType paramterizedType) {
				TypeAccess baseTypeAccess = paramterizedType.getType();
				if (baseTypeAccess != null) {
					var baseType = baseTypeAccess.getType();
					if (baseType instanceof ClassDeclaration classDecl) {
						return classDecl;
					} else {
						LOGGER.error("Super class of \"" + mClass + "\" is not a class: " + baseType);
					}
				} else {
					LOGGER.warn("Type access points to null");
				}
			} else {
				LOGGER.error("Super class of \"" + mClass + "\" is not a class: " + superType);
			}
		}
		return null;
	}

	/**
	 * Checks if supertype is a super type of type
	 *
	 * @param type      The type
	 * @param supertype The potential supertype
	 * @return true iff supertype is a supertype of type
	 */
	public static boolean isSuperType(final Type type, final Type supertype) {
		if (type instanceof AbstractTypeDeclaration) {
			if (type instanceof ClassDeclaration declaration) {
				final var superType = isSuperType(declaration, supertype);
				if (superType) {
					return true;
				}
			}
			return isSuperInterface(type, supertype);
		}
		return false;
	}

	/**
	 * Checks if supertype is a super type of type
	 *
	 * @param type      The type
	 * @param supertype The potential supertype
	 * @return true iff supertype is a supertype of type
	 */
	private static boolean isSuperType(final ClassDeclaration type, final Type supertype) {
		final var superClass = type.getSuperClass();
		if (superClass == null) {
			return false;
		}
		final var parent = superClass.getType();
		return supertype.equals(parent) || isSuperType(parent, supertype);
	}

	/**
	 * Checks if supertype is a super interface of type
	 *
	 * @param type      The type
	 * @param supertype The potential super interface
	 * @return true iff supertype is a supertype of type
	 */
	private static boolean isSuperInterface(final Type type, final Type supertype) {
		for (final TypeAccess interf : ((AbstractTypeDeclaration) type).getSuperInterfaces()) {
			final var superInterface = interf.getType();
			if ((superInterface != null)
					&& (superInterface.equals(supertype) || isSuperType(superInterface, supertype))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Searches the most generic return type of a method overwritten by the given
	 * method
	 *
	 * @param method The method for which the most generic return type should be
	 *               searched
	 * @param model  The model of the program
	 * @return the most generic return type
	 */
	public static Type getMostGenericReturnType(final MAbstractMethodDefinition method) {
		final var abstractTypeDeclaration = method.getAbstractTypeDeclaration();
		if (method instanceof MConstructorDefinition constructor) {
			return getType(constructor);
		}
		var returnType = ((MMethodDefinition) method).getReturnType().getType();
		final var allTypes = getAllParentTypes(abstractTypeDeclaration);
		for (final AbstractTypeDeclaration type : allTypes) {
			if (!(type instanceof AbstractTypeDeclaration)) {
				continue;
			}

			final var otherDecl = getOtherDeclarationOfMethod((MMethodDefinition) method, type);
			if (otherDecl != null) {
				final var returnTypeDecl = otherDecl.getReturnType();
				if (returnTypeDecl == null) {
					if (LOGGER.isEnabledFor(Level.WARN)) {
						LOGGER.warn(NLS.bind(Messages.skippedReturnType, otherDecl));
					}
				} else if (MoDiscoUtil.isSuperType(returnType, returnTypeDecl.getType())) {
					returnType = returnTypeDecl.getType();
				}
			}
		}
		return returnType;
	}

	/**
	 * Gets the type created by a constructor
	 *
	 * @param constructor The constructor
	 * @return The created type
	 */
	public static Type getType(final MConstructorDefinition constructor) {
		final var abstractTypeDeclaration = constructor.getAbstractTypeDeclaration();
		if (abstractTypeDeclaration != null) {
			return abstractTypeDeclaration;
		}
		final var anon = constructor.getAnonymousClassDeclarationOwner();
		if (anon != null) {
			return anon.getClassInstanceCreation().getType().getType();
		}
		return null;
	}

	/**
	 * Searches recursively all parents (classes and interfaces) of the given child
	 *
	 * @param child The given child
	 * @return All parents
	 */
	public static Set<AbstractTypeDeclaration> getAllParentTypes(final AbstractTypeDeclaration child) {
		final var allTypes = new HashSet<AbstractTypeDeclaration>();
		final Deque<AbstractTypeDeclaration> stack = new LinkedList<>();
		if (child != null) {
			stack.add(child);
		}
		while (!stack.isEmpty()) {
			for (AbstractTypeDeclaration next : getParentsTypes(stack.pop())) {
				// Only add the type to the stack if it has not been seen before
				if (allTypes.add(next)) {
					stack.add(next);
				}
			}
		}
		return allTypes;
	}

	/**
	 * Creates a collection with the super class and all implemented interfaces
	 * 
	 * @param child The class for which the parents should be returned
	 * @return The collection of parent types
	 */
	public static Collection<AbstractTypeDeclaration> getParentsTypes(AbstractTypeDeclaration type) {
		final Collection<AbstractTypeDeclaration> allTypes = new LinkedList<>();

		allTypes.addAll(getSuperInterfaces(type));

		if (type instanceof ClassDeclaration classDecl) {
			var parent = getSuperClass(classDecl);
			if (parent != null) {
				allTypes.add(parent);
			}
		} else if (type instanceof UnresolvedClassDeclaration unresolved) {
			TypeAccess superAccess = unresolved.getSuperClass();
			final var superType = superAccess.getType();
			if (superType instanceof ClassDeclaration declaration) {
				allTypes.add(declaration);
			}
		} else {
			// Do not handle enum, interface, annotation type, they cannot have a parent
		}

		return allTypes;
	}

	/**
	 * Searches the types of the interfaces directly implemented by the given type
	 *
	 * @param type The given type
	 * @return The implemented interfaces
	 */
	public static Set<InterfaceDeclaration> getSuperInterfaces(final AbstractTypeDeclaration type) {
		final Set<InterfaceDeclaration> types = new HashSet<>();
		for (final TypeAccess superInterfaceReference : type.getSuperInterfaces()) {
			final var typeOfInterface = superInterfaceReference.getType();
			if (typeOfInterface instanceof InterfaceDeclaration interfaceDecl) {
				types.add(interfaceDecl);
			} else if (typeOfInterface instanceof ParameterizedType parameterized) {
				if (parameterized.getType().getType() instanceof InterfaceDeclaration interfaceDecl) {
					types.add(interfaceDecl);
				} else {
					LOGGER.error("Unsupported type of interface implementation: " + type);
				}
			} else {
				LOGGER.error(NLS.bind(Messages.skippedType, superInterfaceReference));
			}
		}
		return types;
	}

	/**
	 * Searches in the pg for the primitive void type
	 *
	 * @param pg the program model
	 * @return The primitive void type
	 */
	public static PrimitiveTypeVoid getVoid(final MGravityModel pg) {
		return pg.getOrphanTypes().stream().filter(PrimitiveTypeVoid.class::isInstance)
				.map(PrimitiveTypeVoid.class::cast).findAny().orElseGet(() -> {
					var type = JavaFactory.eINSTANCE.createPrimitiveTypeVoid();
					pg.getOrphanTypes().add(type);
					return type;
				});
	}

	/**
	 * Searches if the type declares a method with the same signature
	 *
	 * @param method The method signature for which should be searched
	 * @param type   The type in which probably also implements the method
	 * @return The method declaration object implemented in the type or null
	 */
	private static MethodDeclaration getOtherDeclarationOfMethod(final MMethodDefinition method,
			final AbstractTypeDeclaration type) {
		MethodDeclaration otherDecl = null;
		for (final BodyDeclaration body : type.getBodyDeclarations()) {
			if (body instanceof MethodDeclaration decl && method.getName().equals(decl.getName())
					&& isParamListEqual(method.getParameters(), decl.getParameters())) {
				otherDecl = decl;

			}
		}
		return otherDecl;
	}

	/**
	 * Search in the program model for a throwable class or java.lang.Object
	 *
	 * @param pg The program model
	 * @return The type
	 */
	public static Type getThrowableClassOrObject(final MGravityModel pg) {
		Type type = getType(pg, "java.lang.Throwable"); //$NON-NLS-1$
		if (type == null) {
			type = getType(pg, "java.lang.Exception"); //$NON-NLS-1$
		}
		if (type == null) {
			type = getOrCreateJavaLangObject(pg);
		}
		return type;
	}

	/**
	 * Compares two parameter lists
	 *
	 * @param parameters1 The fist parameter list
	 * @param parameters2 The second parameter list
	 * @return true, iff the parameter lists are equal
	 */
	private static boolean isParamListEqual(final EList<SingleVariableDeclaration> parameters1,
			final EList<SingleVariableDeclaration> parameters2) {
		if (parameters1.size() == parameters2.size()) {
			for (var i = 0; i < parameters1.size(); i++) {
				if (!parameters1.get(i).getType().equals(parameters2.get(i).getType())) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	/**
	 * Fills the MParameterList with MParam entries discovered from the given
	 * definition
	 *
	 * @param definition The definiton
	 * @param list       The empty parameter list
	 * @return true, iff no error occured
	 */
	public static boolean fillParamList(final MAbstractMethodDefinition definition, final MParameterList list) {
		final var mEntrys = list.getMEntrys();
		if (!mEntrys.isEmpty()) {
			return false;
		}
		MEntry prev = null;
		for (final SingleVariableDeclaration param : definition.getParameters()) {
			final var entry = ModiscoFactory.eINSTANCE.createMEntry();
			entry.getParameters().add((MSingleVariableDeclaration) param);
			mEntrys.add(entry);
			entry.setType(param.getType().getType());
			if (prev == null) {
				list.setMFirstEntry(entry);
			} else {
				entry.setMPrevious(prev);
				prev.setMNext(entry);
			}
			prev = entry;
		}
		return true;
	}

	/**
	 * Searches for the type "java.lang.Sting" and returns it. If there is no such
	 * type in the model, it is created and returned.
	 *
	 * @param model The MoDisco model
	 *
	 * @return The Type representing "java.lang.String"
	 */
	public static Type getOrCreateJavaLangString(final Model model) {
		var string = MoDiscoUtil.getType(model, "java.lang.String"); //$NON-NLS-1$
		if (string == null) {
			string = JavaFactory.eINSTANCE.createClassDeclaration();
			string.setName("String"); //$NON-NLS-1$
			var lang = MoDiscoUtil.getPackage(model, new String[] { "java", "lang" }); //$NON-NLS-1$ //$NON-NLS-2$
			if (lang == null) {
				var java = MoDiscoUtil.getPackage(model, new String[] { "java" }); //$NON-NLS-1$
				if (java == null) {
					java = JavaFactory.eINSTANCE.createPackage();
					java.setName("java"); //$NON-NLS-1$
					model.getOwnedElements().add(java);
				}
				lang = JavaFactory.eINSTANCE.createPackage();
				lang.setName("lang"); //$NON-NLS-1$
				java.getOwnedPackages().add(java);
			}
			lang.getOwnedElements().add(string);
		}
		return string;
	}

	/**
	 * Searches for the type "java.lang.Object" and creates it if not available
	 *
	 * @param model The model in which the type should be searched
	 * @return The type
	 */
	public static AbstractTypeDeclaration getOrCreateJavaLangObject(final MGravityModel model) {
		var javaLangPackage = getPackage(model, new String[] { "java", "lang" }); //$NON-NLS-1$ //$NON-NLS-2$
		if (javaLangPackage != null) {
			final var result = javaLangPackage.getOwnedElements().parallelStream().filter(Objects::nonNull)
					.filter(c -> c.getName().equals("Object")).findAny(); //$NON-NLS-1$
			if (result.isPresent()) {
				return result.get();
			}
		} else {
			var javaPackage = getPackage(model, "java"); //$NON-NLS-1$
			if (javaPackage == null) {
				javaPackage = JavaFactory.eINSTANCE.createPackage();
				javaPackage.setName("java"); //$NON-NLS-1$
				model.getOwnedElements().add(javaPackage);
			}
			javaLangPackage = JavaFactory.eINSTANCE.createPackage();
			javaLangPackage.setName("lang"); //$NON-NLS-1$
			javaPackage.getOwnedPackages().add(javaLangPackage);
		}
		final AbstractTypeDeclaration object = ModiscoFactory.eINSTANCE.createMClass();
		object.setName("Object"); //$NON-NLS-1$
		object.setProxy(true);
		javaLangPackage.getOwnedElements().add(object);

		final var file = JavaFactory.eINSTANCE.createClassFile();
		file.setName("Object.class"); //$NON-NLS-1$
		file.setPackage(javaLangPackage);
		file.setType(object);
		file.setOriginalFilePath("Object.class"); //$NON-NLS-1$
		model.getClassFiles().add(file);

		LOGGER.warn("Class \"java.lang.Object\" is not contained in the MoDisco model and has been created");
		return object;

	}

	/**
	 * Searches for a type in a model
	 *
	 * @param model              The model
	 * @param fullyQualifiedName The fully qualified name of the type
	 * @return The type or null
	 */
	public static AbstractTypeDeclaration getType(final Model model, final String fullyQualifiedName) {
		final var index = fullyQualifiedName.lastIndexOf('.');
		var defaultPackage = "default"; //$NON-NLS-1$
		if (index > 0) {
			defaultPackage = fullyQualifiedName.substring(0, index);
		}
		final var tPackage = getPackage(model, defaultPackage);
		if (tPackage != null) {
			final var name = fullyQualifiedName.substring(index + 1);
			for (final AbstractTypeDeclaration tType : tPackage.getOwnedElements()) {
				if (tType.getName().equals(name) || tType.getName().contentEquals(fullyQualifiedName)) {
					return tType;
				}
			}
		}
		return null;
	}

	/**
	 * Searches for the given name space in the model
	 *
	 * @param model     The model
	 * @param namespace The name space
	 * @return The last package of the namespace or null
	 */
	public static Package getPackage(final Model model, final String namespace) {
		return getPackage(model, namespace.split("\\.")); //$NON-NLS-1$
	}

	/**
	 * Searches for the given name space in the model
	 *
	 * @param model     The model
	 * @param namespace The name space
	 * @return The last package of the namespace or null
	 */
	public static Package getPackage(final Model model, final String[] namespace) {
		var next = model.getOwnedElements();
		for (var i = 0; i < namespace.length; i++) {
			final var name = namespace[i];
			var contains = false;
			for (final Package tPackage : next) {
				if (name.equals(tPackage.getName())) {
					if (i == (namespace.length - 1)) {
						return tPackage;
					}
					next = tPackage.getOwnedPackages();
					contains = true;
					break;
				}
			}
			if (!contains) {
				return null;
			}
		}
		return null;
	}

	public static String getQualifiedName(final AbstractTypeDeclaration type) {
		return getQualifiedName(type, ".");
	}

	public static String getQualifiedName(final AbstractTypeDeclaration type, final CharSequence separator) {
		final var namespace = getNameSpace(type.getPackage());
		if (namespace == null) {
			return type.getName();
		}
		return namespace + separator + type.getName();
	}

	public static String getNameSpace(final Package packageDecl) {
		return getNameSpace(packageDecl, ".");
	}

	public static String getNameSpace(final Package packageDecl, final CharSequence separator) {
		if (DEFAULT_PACKAGE.equals(packageDecl.getName())) {
			return null;
		}
		final List<String> names = new LinkedList<>();
		var p = packageDecl;
		while (p != null) {
			names.add(0, p.getName());
			p = p.getPackage();
		}
		return String.join(separator, names);
	}

	public static String getSignature(final MethodDeclaration m) {
		final var value = new StringBuilder(m.getName());
		value.append('(');
		final var parameters = m.getParameters();
		if (!parameters.isEmpty()) {
			value.append(parameters.get(0).getType().getType().getName());
			for (var i = 1; i < parameters.size(); i++) {
				value.append(',');
				value.append(parameters.get(i).getType().getType().getName());
			}
		}
		value.append("):");
		final var ret = m.getReturnType().getType();
		if (ret != null) {
			value.append(ret.getName());
		} else {
			value.append("void");
		}
		return value.toString();
	}

	/**
	 * Searches all types defined in the model
	 *
	 * @param model a modisco model
	 * @return
	 */
	public static List<AbstractTypeDeclaration> getAllTypes(final Model model) {
		final List<AbstractTypeDeclaration> types = new LinkedList<>();
		final Deque<Package> packages = new LinkedList<>(model.getOwnedElements());
		while (!packages.isEmpty()) {
			final var p = packages.pop();
			packages.addAll(p.getOwnedPackages());
			types.addAll(p.getOwnedElements());
		}
		return types;
	}
}
