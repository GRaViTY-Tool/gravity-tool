/**
 * 
 */
package org.gravity.modisco.util;

import java.util.HashSet;
import java.util.Stack;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.ArrayType;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.MethodDeclaration;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.Package;
import org.eclipse.gmt.modisco.java.ParameterizedType;
import org.eclipse.gmt.modisco.java.PrimitiveTypeVoid;
import org.eclipse.gmt.modisco.java.SingleVariableDeclaration;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.TypeAccess;
import org.eclipse.gmt.modisco.java.emf.JavaFactory;
import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MEntry;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MParameterList;
import org.gravity.modisco.ModiscoFactory;

/**
 * This class provides frequently required functionalities when working with modisco models
 * 
 * @author speldszus
 *
 */
public class MoDiscoUtil {
	
	private static final Logger LOGGER = Logger.getLogger(MoDiscoUtil.class);

	/**
	 * Checks if supertype is a super type of type
	 * 
	 * @param type The type
	 * @param supertype The potential supertype
	 * @return true iff supertype is a supertype of type
	 */
	public static boolean isSuperType(Type type, Type supertype) {
		if (type instanceof AbstractTypeDeclaration) {
			if (type instanceof ClassDeclaration) {
				ClassDeclaration clazz = (ClassDeclaration) type;
				TypeAccess superClass = clazz.getSuperClass();
				if (superClass != null) {
					Type parent = superClass.getType();
					if (supertype.equals(parent) || isSuperType(parent, supertype)) {
						return true;
					}
				}
			}
			for (TypeAccess interf : ((AbstractTypeDeclaration) type).getSuperInterfaces()) {
				if (interf.getType().equals(supertype) || isSuperType(interf.getType(), supertype)) {
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * Searches the most generic return type of a method overwritten by the given method
	 * 
	 * @param method The method for which the most generic return type should be searched
	 * @return the most generic return type
	 */
	public static Type getMostGenericReturnType(MMethodDefinition method) {
		Type returnType = getAndFixReturnType(method);
		AbstractTypeDeclaration owner = method.getAbstractTypeDeclaration();

		HashSet<Type> allTypes = getAllParentTypes(owner);
		for(Type type : allTypes) {
			if (!(type instanceof AbstractTypeDeclaration)) {
				continue;
			}
			
			MethodDeclaration otherDecl = getOtherDeclarationOfMethod(method, (AbstractTypeDeclaration) type);
			if(otherDecl != null) {
				TypeAccess returnTypeDecl = otherDecl.getReturnType();
				if (returnTypeDecl == null) {
					LOGGER.log(Level.WARN, "Skipped return type of: " + otherDecl);
				}
				else if (MoDiscoUtil.isSuperType(returnType, returnTypeDecl.getType())) {
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
	public static HashSet<Type> getAllParentTypes(AbstractTypeDeclaration child) {
		HashSet<Type> allTypes = new HashSet<>();
		Stack<Type> stack = new Stack<>();
		if (child != null) {
			stack.add(child);
		}
		while (!stack.isEmpty()) {
			Type type = stack.pop();
			if (type instanceof AbstractTypeDeclaration) {
				allTypes.addAll(getTypesOfImplementedInterface(((AbstractTypeDeclaration) type)));
				if (type instanceof ClassDeclaration) {
					TypeAccess superClass = ((ClassDeclaration) type).getSuperClass();
					if (superClass != null) {
						allTypes.add(superClass.getType());
					}
				}
			}
			else if (type instanceof ParameterizedType) {
				allTypes.add(((ParameterizedType) type).getType().getType());
			}
			else if (type instanceof ArrayType) {
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
	public static HashSet<Type> getTypesOfImplementedInterface(AbstractTypeDeclaration type) {
		HashSet<Type> types = new HashSet<Type>();
		for (TypeAccess superInterfaceReference : type.getSuperInterfaces()) {
			Type typeOfInterface = superInterfaceReference.getType();
			if (typeOfInterface == null) {
				LOGGER.log(Level.WARN, "Skipped type of: " + superInterfaceReference);
			}
			else {
				types.add(typeOfInterface);
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
	public static PrimitiveTypeVoid getVoid(MGravityModel pg) {
		PrimitiveTypeVoid voidType = null;
		for (Type type : pg.getOrphanTypes()) {
			if (type instanceof PrimitiveTypeVoid) {
				voidType = (PrimitiveTypeVoid) type;
			}
		}
		if(voidType == null) {
			voidType = JavaFactory.eINSTANCE.createPrimitiveTypeVoid();
			pg.getOrphanTypes().add(voidType);
		}
		return voidType;
	}
	
	/**
	 * Searches if the type declares a method with the same signature
	 * 
	 * @param method The method signature for which should be searched
	 * @param type The type in which probably also implements the method
	 * @return The method declaration object implemented in the type or null
	 */
	private static MethodDeclaration getOtherDeclarationOfMethod(MMethodDefinition method,
			AbstractTypeDeclaration type) {
		MethodDeclaration otherDecl = null;
		for (BodyDeclaration body : type.getBodyDeclarations()) {
			if (body instanceof MethodDeclaration) {
				MethodDeclaration decl = (MethodDeclaration) body;
				if (method.getName().equals(decl.getName())) {
					if (isParamListEqual(method.getParameters(), decl.getParameters())) {
						otherDecl = decl;
					}
				}
			}
		}
		return otherDecl;
	}

	/**
	 * Retrieves the return type of the given method. 
	 * Iff the return type is null it is set to void! 
	 * 
	 * @param method The method for which the return type should be retrieved 
	 * @return The return type of the mehtod
	 */
	private static Type getAndFixReturnType(MMethodDefinition method) {
		TypeAccess returnType = method.getReturnType();
		if (returnType == null) {
			// TODO: Currently a dirty hack: assuming void
			returnType = JavaFactory.eINSTANCE.createTypeAccess();
			method.setReturnType(returnType);
			MGravityModel pg = method.getModel();
			returnType.setType(getVoid(pg));
			
		}
		Type ret = returnType.getType();
		if(ret == null) {
			LOGGER.log(Level.ERROR, "The return type of the method \"" + method.getName() + "\" is null!");
			return null;
		}
		return ret;
	}

	/**
	 * Compares two parameter lists
	 * 
	 * @param parameters1 The fist parameter list
	 * @param parameters2 The second parameter list
	 * @return true, iff the parameter lists are equal
	 */
	private static boolean isParamListEqual(EList<SingleVariableDeclaration> parameters1,
			EList<SingleVariableDeclaration> parameters2) {
		if (parameters1.size() == parameters2.size()) {
			for (int i = 0; i < parameters1.size(); i++) {
				if (!parameters1.get(i).getType().equals(parameters2.get(i).getType())) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	
	/**
	 * Fills the MParameterList with MParam entries discovered from the given definition
	 * 
	 * @param mDef The definiton
	 * @param mParams The empty parameter list
	 * @return true, iff no error occured
	 */
	public static boolean fillParamList(MAbstractMethodDefinition mDef, MParameterList mParams) {
		EList<MEntry> mEntrys = mParams.getMEntrys();
		if(mEntrys.size() > 0) {
			return false;
		}
		MEntry prev = null;
		for (SingleVariableDeclaration param : mDef.getParameters()) {
			MEntry entry = ModiscoFactory.eINSTANCE.createMEntry();
			entry.setSingleVariableDeclaration(param);
			mEntrys.add(entry);
			entry.setType(param.getType().getType());
			if (prev == null) {
				mParams.setMFirstEntry(entry);
			} else {
				entry.setMPrevious(prev);
				prev.setMNext(entry);
			}
			prev = entry;
		}
		return true;
	}
	
	/**
	 * Searches for the type "java.lang.Sting" and returns it.
	 * If there is no such type in the model, it is created and returned.
	 * @param model The MoDisco model
	 * 
	 * @return The Type representing "java.lang.String"
	 */
	public static Type getOrCreateJavaLangString(Model model) {
		AbstractTypeDeclaration string = MoDiscoUtil.getType(model, "java.lang.String");
		if(string == null) {
			string = JavaFactory.eINSTANCE.createClassDeclaration();
			string.setName("String");
			Package lang = MoDiscoUtil.getPackage(model, new String[] {"java", "lang"});
			if(lang == null) {
				Package java = MoDiscoUtil.getPackage(model, new String[] {"java"});
				if(java == null) {
					java = JavaFactory.eINSTANCE.createPackage();
					java.setName("java");
					model.getOwnedElements().add(java);
				}
				lang = JavaFactory.eINSTANCE.createPackage();
				lang.setName("lang");
				java.getOwnedPackages().add(java);
			}
			lang.getOwnedElements().add(string);
		}
		return string;
	}
	
	/**
	 * Searches for a type in a model
	 * 
	 * @param model The model
	 * @param fullyQualifiedName The fully qualified name of the type
	 * @return The type or null
	 */
	public static AbstractTypeDeclaration getType(Model model, String fullyQualifiedName) {
		int index = fullyQualifiedName.lastIndexOf('.');
		String defaultPackage = "default";
		if (index > 0) {
			defaultPackage = fullyQualifiedName.substring(0, index);
		}
		Package tPackage = getPackage(model, defaultPackage);
		if (tPackage != null) {
			String name = fullyQualifiedName.substring(index + 1);
			for (AbstractTypeDeclaration tType : tPackage.getOwnedElements()) {
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
	 * @param model The model
	 * @param namespace The name space
	 * @return The last package of the namespace or null
	 */
	public static Package getPackage(Model model, String namespace) {
		return getPackage(model, namespace.split("\\."));
	}

	/**
	 * Searches for the given name space in the model
	 * 
	 * @param model The model
	 * @param namespace The name space
	 * @return The last package of the namespace or null
	 */
	public static Package getPackage(Model model, String[] namespace) {
		EList<Package> next = model.getOwnedElements();
		for (int i = 0; i < namespace.length;) {
			String name = namespace[i++];
			boolean contains = false;
			for (Package tPackage : next) {
				if (name.equals(tPackage.getName())) {
					if (i == namespace.length) {
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
}
