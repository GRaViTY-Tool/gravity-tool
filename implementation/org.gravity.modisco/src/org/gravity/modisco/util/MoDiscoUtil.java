/**
 *
 */
package org.gravity.modisco.util;

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
import org.eclipse.modisco.java.ArrayType;
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.Package;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.PrimitiveTypeVoid;
import org.eclipse.modisco.java.SingleVariableDeclaration;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;
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

	private MoDiscoUtil() {
		// This class shouldn't be instantiated
	}

	public static ClassDeclaration getSuperClass(final ClassDeclaration mClass) {
		final var superAccess = mClass.getSuperClass();
		if (superAccess != null) {
			final var superType = superAccess.getType();
			if (superType instanceof ClassDeclaration) {
				return (ClassDeclaration) superType;
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
			if (type instanceof ClassDeclaration) {
				final var superType = isSuperType((ClassDeclaration) type, supertype);
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
			if ((superInterface != null) && (superInterface.equals(supertype) || isSuperType(superInterface, supertype))) {
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
		if (method instanceof MConstructorDefinition) {
			if (abstractTypeDeclaration != null) {
				return abstractTypeDeclaration;
			}
			final var anon = method.getAnonymousClassDeclarationOwner();
			if (anon != null) {
				return anon.getClassInstanceCreation().getType().getType();
			}
			return null;
		}
		var returnType = ((MMethodDefinition) method).getReturnType().getType();
		final var allTypes = getAllParentTypes(abstractTypeDeclaration);
		for (final Type type : allTypes) {
			if (!(type instanceof AbstractTypeDeclaration)) {
				continue;
			}

			final var otherDecl = getOtherDeclarationOfMethod((MMethodDefinition) method,
					(AbstractTypeDeclaration) type);
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
	 * Searches recursively all parents (classes and interfaces) of the given child
	 *
	 * @param child The given child
	 * @return All parents
	 */
	public static Set<Type> getAllParentTypes(final AbstractTypeDeclaration child) {
		final var allTypes = new HashSet<Type>();
		final Deque<Type> stack = new LinkedList<>();
		if (child != null) {
			stack.add(child);
		}
		while (!stack.isEmpty()) {
			final var type = stack.pop();
			if (type instanceof AbstractTypeDeclaration) {
				allTypes.addAll(getTypesOfImplementedInterface(((AbstractTypeDeclaration) type)));
				if (type instanceof ClassDeclaration) {
					final var superClass = ((ClassDeclaration) type).getSuperClass();
					if (superClass != null) {
						allTypes.add(superClass.getType());
					}
				}
			} else if (type instanceof ParameterizedType) {
				allTypes.add(((ParameterizedType) type).getType().getType());
			} else if (type instanceof ArrayType) {
				allTypes.add(((ArrayType) type).getElementType().getType());
			}
		}
		return allTypes;
	}

	/**
	 * Searches the types of the interfaces directly implemented by the given type
	 *
	 * @param type The given type
	 * @return The implemented interfaces
	 */
	public static Set<Type> getTypesOfImplementedInterface(final AbstractTypeDeclaration type) {
		final Set<Type> types = new HashSet<>();
		for (final TypeAccess superInterfaceReference : type.getSuperInterfaces()) {
			final var typeOfInterface = superInterfaceReference.getType();
			if (typeOfInterface != null) {
				types.add(typeOfInterface);
			} else if (LOGGER.isEnabledFor(Level.WARN)) {
				LOGGER.warn(NLS.bind(Messages.skippedType, superInterfaceReference));
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
		PrimitiveTypeVoid voidType = null;
		for (final Type type : pg.getOrphanTypes()) {
			if (type instanceof PrimitiveTypeVoid) {
				voidType = (PrimitiveTypeVoid) type;
			}
		}
		if (voidType == null) {
			voidType = JavaFactory.eINSTANCE.createPrimitiveTypeVoid();
			pg.getOrphanTypes().add(voidType);
		}
		return voidType;
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
			if (body instanceof MethodDeclaration) {
				final var decl = (MethodDeclaration) body;
				if (method.getName().equals(decl.getName())
						&& isParamListEqual(method.getParameters(), decl.getParameters())) {
					otherDecl = decl;
				}

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
			type = getJavaLangObject(pg);
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

	/**
	 * Searches for the type "java.lang.Object" and creates it if not available
	 *
	 * @param model The model in which the type should be searched
	 * @return The type
	 */
	public static Type getJavaLangObject(final MGravityModel model) {
		var javaLangPackage = getPackage(model, new String[] { "java", "lang" }); //$NON-NLS-1$ //$NON-NLS-2$
		if (javaLangPackage != null) {
			final var result = javaLangPackage.getOwnedElements().parallelStream()
					.filter(Objects::nonNull).filter(c -> c.getName().equals("Object")).findAny(); //$NON-NLS-1$
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
		return object;

	}

	public static String getQualifiedName(final AbstractTypeDeclaration type) {
		return getQualifiedName(type, ".");
	}

	public static String getQualifiedName(final AbstractTypeDeclaration type, final CharSequence separator) {
		return getNameSpace(type.getPackage())+separator+type.getName();
	}

	public static String getNameSpace(final Package packageDecl) {
		return getNameSpace(packageDecl, ".");
	}

	public static String getNameSpace(final Package packageDecl, final CharSequence separator) {
		final List<String> names = new LinkedList<>();
		var p = packageDecl;
		while(p != null) {
			names.add(0, p.getName());
			p = p.getPackage();
		}
		return String.join(separator, names);
	}

	public static String getSignature(final MethodDeclaration m) {
		final var value = new StringBuilder(m.getName());
		value.append('(');
		final var parameters = m.getParameters();
		if(!parameters.isEmpty()) {
			value.append(parameters.get(0).getType().getType().getName());
			for(var i = 1 ; i < parameters.size(); i++) {
				value.append(',');
				value.append(parameters.get(i).getType().getType().getName());
			}
		}
		value.append("):");
		final var ret =m.getReturnType().getType();
		if(ret!=null) {
			value.append(ret.getName());
		}
		else {
			value.append("void");
		}
		return value.toString();
	}
}
