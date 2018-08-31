/**
 * 
 */
package org.gravity.modisco.util;

import java.util.Stack;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.MethodDeclaration;
import org.eclipse.gmt.modisco.java.ParameterizedType;
import org.eclipse.gmt.modisco.java.PrimitiveTypeVoid;
import org.eclipse.gmt.modisco.java.SingleVariableDeclaration;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.TypeAccess;
import org.eclipse.gmt.modisco.java.emf.JavaFactory;
import org.gravity.modisco.MMethodDefinition;

/**
 * This class provides frequently required functionalities when working with modisco models
 * 
 * @author speldszus
 *
 */
public class MoDiscoUtil {
	
	public static final Logger LOGGER = Logger.getLogger(MoDiscoUtil.class);

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
	 * @param method
	 * @return
	 */
	public static Type getMostGenericReturnType(MMethodDefinition method) {
		TypeAccess returnType = method.getReturnType();
		if (returnType == null) {
			// TODO: Currently a dirty hack: assuming void
			TypeAccess a = JavaFactory.eINSTANCE.createTypeAccess();
			method.setReturnType(a);
			for (Type t : method.getModel().getOrphanTypes()) {
				if (t instanceof PrimitiveTypeVoid) {
					a.setType(t);
					return t;
				}
			}
		}
		Type ret = returnType.getType();

		Stack<Type> stack = new Stack<>();
		AbstractTypeDeclaration owner = method.getAbstractTypeDeclaration();
		if (owner != null) {
			stack.add(owner);
		}
		while (!stack.isEmpty()) {
			Type type = stack.pop();
			if (type instanceof ClassDeclaration) {
				ClassDeclaration clazz = (ClassDeclaration) type;
				TypeAccess superClass = clazz.getSuperClass();
				if (superClass != null) {
					stack.add(superClass.getType());
				}
			} else if (type instanceof ParameterizedType) {
				stack.add(((ParameterizedType) type).getType().getType());
			} else {
				AbstractTypeDeclaration abst = (AbstractTypeDeclaration) type;
				for (TypeAccess interf : abst.getSuperInterfaces()) {
					Type typeInterf = interf.getType();
					if (typeInterf == null) {
						LOGGER.log(Level.WARN, "Skipped type of: " + interf);
						continue;
					}
					stack.add(typeInterf);
				}

				for (BodyDeclaration body : abst.getBodyDeclarations()) {
					if (body instanceof MethodDeclaration) {
						MethodDeclaration decl = (MethodDeclaration) body;
						if (method.getName().equals(decl.getName())) {
							if (isParamListEqual(method.getParameters(), decl.getParameters())) {
								TypeAccess returnTypeDecl = decl.getReturnType();
								if (returnTypeDecl == null) {
									LOGGER.log(Level.WARN, "Skipped return type of: " + decl);
									continue;
								}
								if (MoDiscoUtil.isSuperType(ret, returnTypeDecl.getType())) {
									ret = returnTypeDecl.getType();
								}
							}
						}
					}
				}
			}
		}
		return ret;
	}
	
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

	
}
