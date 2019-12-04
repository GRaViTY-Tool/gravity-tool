/**
 *
 */
package org.gravity.modisco.util;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.AbstractMethodInvocation;
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.AbstractVariablesContainer;
import org.eclipse.gmt.modisco.java.AnonymousClassDeclaration;
import org.eclipse.gmt.modisco.java.ArrayAccess;
import org.eclipse.gmt.modisco.java.ArrayCreation;
import org.eclipse.gmt.modisco.java.ArrayInitializer;
import org.eclipse.gmt.modisco.java.ArrayLengthAccess;
import org.eclipse.gmt.modisco.java.ArrayType;
import org.eclipse.gmt.modisco.java.Assignment;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.CastExpression;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.ConditionalExpression;
import org.eclipse.gmt.modisco.java.Expression;
import org.eclipse.gmt.modisco.java.ExpressionStatement;
import org.eclipse.gmt.modisco.java.FieldAccess;
import org.eclipse.gmt.modisco.java.ForStatement;
import org.eclipse.gmt.modisco.java.IfStatement;
import org.eclipse.gmt.modisco.java.InfixExpression;
import org.eclipse.gmt.modisco.java.MethodDeclaration;
import org.eclipse.gmt.modisco.java.MethodInvocation;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.Package;
import org.eclipse.gmt.modisco.java.ParameterizedType;
import org.eclipse.gmt.modisco.java.ParenthesizedExpression;
import org.eclipse.gmt.modisco.java.PrefixExpression;
import org.eclipse.gmt.modisco.java.PrimitiveTypeBoolean;
import org.eclipse.gmt.modisco.java.PrimitiveTypeInt;
import org.eclipse.gmt.modisco.java.PrimitiveTypeVoid;
import org.eclipse.gmt.modisco.java.ReturnStatement;
import org.eclipse.gmt.modisco.java.SingleVariableAccess;
import org.eclipse.gmt.modisco.java.SingleVariableDeclaration;
import org.eclipse.gmt.modisco.java.Statement;
import org.eclipse.gmt.modisco.java.ThrowStatement;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.TypeAccess;
import org.eclipse.gmt.modisco.java.VariableDeclaration;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;
import org.eclipse.gmt.modisco.java.WhileStatement;
import org.eclipse.gmt.modisco.java.emf.JavaFactory;
import org.eclipse.osgi.util.NLS;
import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MConstructorDefinition;
import org.gravity.modisco.MDefinition;
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

	/**
	 * Checks if supertype is a super type of type
	 *
	 * @param type      The type
	 * @param supertype The potential supertype
	 * @return true iff supertype is a supertype of type
	 */
	public static boolean isSuperType(Type type, Type supertype) {
		if (type instanceof AbstractTypeDeclaration) {
			if (type instanceof ClassDeclaration) {
				final boolean superType = isSuperType((ClassDeclaration) type, supertype);
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
	private static boolean isSuperType(ClassDeclaration type, Type supertype) {
		final TypeAccess superClass = type.getSuperClass();
		if (superClass == null) {
			return false;
		}
		final Type parent = superClass.getType();
		return supertype.equals(parent) || isSuperType(parent, supertype);
	}

	/**
	 * Checks if supertype is a super interface of type
	 *
	 * @param type      The type
	 * @param supertype The potential super interface
	 * @return true iff supertype is a supertype of type
	 */
	private static boolean isSuperInterface(Type type, Type supertype) {
		for (final TypeAccess interf : ((AbstractTypeDeclaration) type).getSuperInterfaces()) {
			if (interf.getType().equals(supertype) || isSuperType(interf.getType(), supertype)) {
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
	public static Type getMostGenericReturnType(MAbstractMethodDefinition method, MGravityModel model) {
		final AbstractTypeDeclaration abstractTypeDeclaration = method.getAbstractTypeDeclaration();
		if (method instanceof MConstructorDefinition) {
			if (abstractTypeDeclaration != null) {
				return abstractTypeDeclaration;
			}
			final AnonymousClassDeclaration anon = method.getAnonymousClassDeclarationOwner();
			if (anon != null) {
				return anon.getClassInstanceCreation().getType().getType();
			}
			return null;
		}
		Type returnType = getAndFixReturnType((MMethodDefinition) method, model);
		final Set<Type> allTypes = getAllParentTypes(abstractTypeDeclaration);
		for (final Type type : allTypes) {
			if (!(type instanceof AbstractTypeDeclaration)) {
				continue;
			}

			final MethodDeclaration otherDecl = getOtherDeclarationOfMethod((MMethodDefinition) method,
					(AbstractTypeDeclaration) type);
			if (otherDecl != null) {
				final TypeAccess returnTypeDecl = otherDecl.getReturnType();
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
	public static Set<Type> getAllParentTypes(AbstractTypeDeclaration child) {
		final HashSet<Type> allTypes = new HashSet<>();
		final Deque<Type> stack = new LinkedList<>();
		if (child != null) {
			stack.add(child);
		}
		while (!stack.isEmpty()) {
			final Type type = stack.pop();
			if (type instanceof AbstractTypeDeclaration) {
				allTypes.addAll(getTypesOfImplementedInterface(((AbstractTypeDeclaration) type)));
				if (type instanceof ClassDeclaration) {
					final TypeAccess superClass = ((ClassDeclaration) type).getSuperClass();
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
	public static Set<Type> getTypesOfImplementedInterface(AbstractTypeDeclaration type) {
		final Set<Type> types = new HashSet<>();
		for (final TypeAccess superInterfaceReference : type.getSuperInterfaces()) {
			final Type typeOfInterface = superInterfaceReference.getType();
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
	public static PrimitiveTypeVoid getVoid(MGravityModel pg) {
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
	private static MethodDeclaration getOtherDeclarationOfMethod(MMethodDefinition method,
			AbstractTypeDeclaration type) {
		MethodDeclaration otherDecl = null;
		for (final BodyDeclaration body : type.getBodyDeclarations()) {
			if (body instanceof MethodDeclaration) {
				final MethodDeclaration decl = (MethodDeclaration) body;
				if (method.getName().equals(decl.getName())
						&& isParamListEqual(method.getParameters(), decl.getParameters())) {
					otherDecl = decl;
				}

			}
		}
		return otherDecl;
	}

	/**
	 * Retrieves the return type of the given method. Iff the return type is null it
	 * is set to void!
	 *
	 * @param method The method for which the return type should be retrieved
	 * @param model  the model of the program
	 * @return The return type of the method
	 */
	private static Type getAndFixReturnType(MMethodDefinition method, final MGravityModel model) {
		TypeAccess returnType = method.getReturnType();

		if (returnType != null) {
			return returnType.getType();
		}
		Type type = null;
		for (final AbstractMethodInvocation invocation : method.getUsages()) {
			try {
				final Type tmpType = guessReturnTypeOfCall(model, invocation);
				if (tmpType != null && (type == null || isSuperType(tmpType, type))) {
					type = tmpType;
				}
			} catch (final IllegalStateException e) {
				logInfoOptimizeGuess(invocation, method);
			}
		}
		if (type == null) {
			if (LOGGER.isEnabledFor(Level.WARN)) {
				LOGGER.warn(NLS.bind(Messages.returnTypeNotSetAssumeObject, method.getName()));
			}
			type = getJavaLangObject(model);
			if (type == null) {
				LOGGER.error(NLS.bind(Messages.returnTypeIsNull, method.getName()));
				return null;
			}
		}
		returnType = JavaFactory.eINSTANCE.createTypeAccess();
		method.setReturnType(returnType);
		returnType.setType(type);
		return type;
	}

	/**
	 * Logs a possible optimization of a return type guess if logging is enabled
	 *
	 * @param invocation An invocation
	 * @param target     The target of the invocation
	 */
	private static void logInfoOptimizeGuess(final AbstractMethodInvocation invocation, MMethodDefinition target) {
		if (LOGGER.isInfoEnabled()) {
			final MDefinition source = getContainingMethod(invocation);
			final String targetName = NameUtil.getFullyQualifiedName(target);
			if (source != null) {
				final String sourceName = NameUtil.getFullyQualifiedName(source);
				LOGGER.info(NLS.bind(Messages.warnGuessMightBeOptimizedDetailed,
						new String[] { targetName, sourceName }));
			} else {
				LOGGER.info(NLS.bind(Messages.warnGuessMightBeOptimized, targetName));
			}
		}
	}

	/**
	 * try to guess the return type of the called method.
	 *
	 * @param pg         The model containing the invocation
	 * @param invocation The method invocation
	 * @return The return type of the method
	 */
	private static Type guessReturnTypeOfCall(MGravityModel pg, AbstractMethodInvocation invocation) {
		final EObject eContainer = invocation.eContainer();

		// Statement
		if (eContainer instanceof Statement) {
			return guessReturnTypeOfCall(pg, invocation, (Statement) eContainer);
		}

		// Expression
		else if (eContainer instanceof Expression) {
			return guessReturnTypeOfCall(pg, invocation, (Expression) eContainer);
		}

		// VariableDeclaration
		else if (eContainer instanceof VariableDeclarationFragment) {
			return ((VariableDeclarationFragment) eContainer).getVariablesContainer().getType().getType();
		}

		// AbstractMethodInvocation
		else if (eContainer instanceof AbstractMethodInvocation) {
			return getReturnType(invocation, (AbstractMethodInvocation) eContainer);
		}

		throw new IllegalStateException(NLS.bind(Messages.unknownType, eContainer.eClass().getName()));
	}

	/**
	 * try to guess the return type of the called method.
	 *
	 * @param pg         The model containing the invocation
	 * @param invocation The method invocation
	 * @param statement  The statement containing the invocation
	 * @return The return type of the method
	 */
	private static Type guessReturnTypeOfCall(MGravityModel pg, AbstractMethodInvocation invocation,
			Statement statement) {
		if (statement instanceof ForStatement) {
			return getJavaLangObject(pg);
		} else if (statement instanceof ExpressionStatement) {
			return null;
			// We cannot handle infix expressions but its also no error
		} else if (statement instanceof ReturnStatement) {
			final MDefinition definition = getContainingMethod(statement);
			if (definition instanceof MMethodDefinition) {
				return getAndFixReturnType((MMethodDefinition) definition, pg);
			} else if (definition instanceof MConstructorDefinition) {
				return ((MConstructorDefinition) definition).getAbstractTypeDeclaration();
			} else if (definition instanceof AbstractVariablesContainer) {
				return ((AbstractVariablesContainer) definition).getType().getType();
			} else {
				throw new IllegalStateException(
						NLS.bind(Messages.unknownMethodDef, statement.eClass().getName()));
			}
		} else if (statement instanceof IfStatement || statement instanceof WhileStatement) {
			return pg.getOrphanTypes().parallelStream().filter(t -> t instanceof PrimitiveTypeBoolean).findAny()
					.orElse(null);
		} else if (statement instanceof ThrowStatement) {
			// The return type is thrown
			return getThrowableClassOrObject(pg);
		}
		throw new IllegalStateException(
				NLS.bind(Messages.unhandeledExpression, statement.eClass().getName()));
	}

	/**
	 * try to guess the return type of the called method.
	 *
	 * @param pg         The model containing the invocation
	 * @param invocation The method invocation
	 * @param expression The expression containing the invocation
	 * @return The return type of the method
	 */
	private static Type guessReturnTypeOfCall(MGravityModel pg, AbstractMethodInvocation invocation,
			Expression expression) {
		if (expression instanceof ParenthesizedExpression || expression instanceof PrefixExpression
				|| expression instanceof InfixExpression) {
			return getJavaLangObject(pg);
		} else if (expression instanceof Assignment) {
			return getAssignmentType(pg, (Assignment) expression);
		} else if (expression instanceof ArrayInitializer) {
			final EObject initializedObject = ((ArrayInitializer) expression).eContainer();
			if (initializedObject instanceof VariableDeclarationFragment) {
				return ((VariableDeclarationFragment) initializedObject).getVariablesContainer().getType().getType();
			} else {
				throw new IllegalStateException(
						NLS.bind(Messages.unknownType, expression.eClass().getName()));
			}
		} else if (expression instanceof ArrayLengthAccess) {
			return pg.getOrphanTypes().parallelStream().filter(t -> t instanceof PrimitiveTypeInt).findAny()
					.orElse(null);
		} else if (expression instanceof CastExpression) {
			return ((CastExpression) expression).getType().getType();
		} else if (expression instanceof FieldAccess) {
			final VariableDeclaration variable = ((FieldAccess) expression).getField().getVariable();
			return getType(pg, variable);
		} else if (expression instanceof ArrayAccess) {
			return getArrayType(pg, (ArrayAccess) expression);
		} else if (expression instanceof ArrayCreation) {
			return ((ArrayCreation) expression).getType().getType();
		} else if (expression instanceof ConditionalExpression) {
			if (((ConditionalExpression) expression).getExpression().equals(invocation)) {
				return pg.getOrphanTypes().parallelStream().filter(t -> t instanceof PrimitiveTypeBoolean).findAny()
						.orElse(null);
			}
			return getJavaLangObject(pg);
		}
		throw new IllegalStateException(
				NLS.bind(Messages.unhandeledExpression, expression.eClass().getName()));
	}

	/**
	 * Search in the program model for a throwable class or java.lang.Object
	 *
	 * @param pg The program model
	 * @return The type
	 */
	private static Type getThrowableClassOrObject(MGravityModel pg) {
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
	 * Guess the return type of a method invocation based on an other invocation
	 * containing the invocation
	 *
	 * @param invocation The invocation whose return type should be guessed
	 * @param container  The invocation containing the other one
	 * @return The guessed return type
	 */
	private static Type getReturnType(AbstractMethodInvocation invocation, AbstractMethodInvocation container) {
		final int index = container.getArguments().indexOf(invocation);
		if (index >= 0) {
			return container.getMethod().getParameters().get(index).getType().getType();
		} else {
			if (container instanceof MethodInvocation) {
				final Expression expression = ((MethodInvocation) container).getExpression();
				if (expression.equals(invocation)) {
					return container.getMethod().getAbstractTypeDeclaration();
				} else {
					throw new IllegalStateException(
							NLS.bind(Messages.unknownType, invocation.eClass().getName()));
				}
			} else {
				throw new IllegalStateException(
						NLS.bind(Messages.unknownType, invocation.eClass().getName()));
			}
		}
	}

	/**
	 * Guesses the type of the accessed array
	 *
	 * @param pg          The program model containing the array
	 * @param arrayAccess The access to the array
	 * @return The type of the array
	 */
	private static Type getArrayType(MGravityModel pg, ArrayAccess arrayAccess) {
		final Expression expression = arrayAccess.getArray();
		if (expression instanceof SingleVariableAccess) {
			final VariableDeclaration variable = ((SingleVariableAccess) expression).getVariable();
			return getType(pg, variable);
		} else if (expression instanceof AbstractMethodInvocation) {
			return getJavaLangObject(pg);
		} else {
			throw new IllegalStateException(NLS.bind(Messages.unknownType, expression.eClass().getName()));
		}
	}

	/**
	 *
	 * Search the method or field containing the statement
	 *
	 * @param statement The statement
	 * @return The definition containing the statement
	 */
	private static MDefinition getContainingMethod(EObject statement) {
		EObject eContainer = statement;
		while (eContainer != null && !(eContainer instanceof MDefinition)) {
			eContainer = eContainer.eContainer();
		}
		return (MDefinition) eContainer;
	}

	/**
	 * Gets the type or a possible type of the variable
	 *
	 * @param pg       The program model containing the variable
	 * @param variable The variable
	 * @return The type of the variable
	 */
	private static Type getType(MGravityModel pg, VariableDeclaration variable) {
		if (variable instanceof VariableDeclarationFragment) {
			final TypeAccess typeAccess = ((VariableDeclarationFragment) variable).getVariablesContainer().getType();
			if (typeAccess == null) {
				return getJavaLangObject(pg);
			} else {
				return typeAccess.getType();
			}
		} else {
			throw new IllegalStateException(NLS.bind(Messages.unknownType, variable.eClass().getName()));
		}
	}

	/**
	 * Get the variable of the assignment
	 *
	 * @param assignment The assign statement
	 * @param pg         The model containing the assignment
	 * @return The variable
	 */
	private static Type getAssignmentType(MGravityModel pg, Assignment assignment) {
		final Expression expression = assignment.getLeftHandSide();
		if (expression instanceof SingleVariableAccess) {
			return getType(pg, ((SingleVariableAccess) expression).getVariable());
		} else if (expression instanceof FieldAccess) {
			return getType(pg, ((FieldAccess) expression).getField().getVariable());
		} else if (expression instanceof ArrayAccess) {
			return getArrayType(pg, (ArrayAccess) expression);
		} else {
			throw new IllegalStateException(NLS.bind(Messages.unknownType, expression.eClass().getName()));
		}
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
	 * Fills the MParameterList with MParam entries discovered from the given
	 * definition
	 *
	 * @param definition The definiton
	 * @param list       The empty parameter list
	 * @return true, iff no error occured
	 */
	public static boolean fillParamList(MAbstractMethodDefinition definition, MParameterList list) {
		final EList<MEntry> mEntrys = list.getMEntrys();
		if (!mEntrys.isEmpty()) {
			return false;
		}
		MEntry prev = null;
		for (final SingleVariableDeclaration param : definition.getParameters()) {
			final MEntry entry = ModiscoFactory.eINSTANCE.createMEntry();
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
	public static Type getOrCreateJavaLangString(Model model) {
		AbstractTypeDeclaration string = MoDiscoUtil.getType(model, "java.lang.String"); //$NON-NLS-1$
		if (string == null) {
			string = JavaFactory.eINSTANCE.createClassDeclaration();
			string.setName("String"); //$NON-NLS-1$
			Package lang = MoDiscoUtil.getPackage(model, new String[] { "java", "lang" }); //$NON-NLS-1$ //$NON-NLS-2$
			if (lang == null) {
				Package java = MoDiscoUtil.getPackage(model, new String[] { "java" }); //$NON-NLS-1$
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
	public static AbstractTypeDeclaration getType(Model model, String fullyQualifiedName) {
		final int index = fullyQualifiedName.lastIndexOf('.');
		String defaultPackage = "default"; //$NON-NLS-1$
		if (index > 0) {
			defaultPackage = fullyQualifiedName.substring(0, index);
		}
		final Package tPackage = getPackage(model, defaultPackage);
		if (tPackage != null) {
			final String name = fullyQualifiedName.substring(index + 1);
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
	public static Package getPackage(Model model, String namespace) {
		return getPackage(model, namespace.split("\\.")); //$NON-NLS-1$
	}

	/**
	 * Searches for the given name space in the model
	 *
	 * @param model     The model
	 * @param namespace The name space
	 * @return The last package of the namespace or null
	 */
	public static Package getPackage(Model model, String[] namespace) {
		EList<Package> next = model.getOwnedElements();
		for (int i = 0; i < namespace.length; i++) {
			final String name = namespace[i];
			boolean contains = false;
			for (final Package tPackage : next) {
				if (name.equals(tPackage.getName())) {
					if (i == namespace.length - 1) {
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
	public static Type getJavaLangObject(MGravityModel model) {
		Package javaLangPackage = getPackage(model, new String[] { "java", "lang" }); //$NON-NLS-1$ //$NON-NLS-2$
		if (javaLangPackage != null) {
			final Optional<AbstractTypeDeclaration> result = javaLangPackage.getOwnedElements().parallelStream()
					.filter(Objects::nonNull).filter(c -> c.getName().equals("Object")).findAny(); //$NON-NLS-1$
			if (result.isPresent()) {
				return result.get();
			}
		} else {
			Package javaPackage = getPackage(model, "java"); //$NON-NLS-1$
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
}
