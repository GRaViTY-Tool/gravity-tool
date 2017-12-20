package org.gravity.modisco.preprocessing;

import java.lang.Iterable;
import java.util.LinkedList;
import java.util.Stack;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration;
import org.eclipse.gmt.modisco.java.AbstractMethodInvocation;
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.AbstractVariablesContainer;
import org.eclipse.gmt.modisco.java.Annotation;
import org.eclipse.gmt.modisco.java.AnonymousClassDeclaration;
import org.eclipse.gmt.modisco.java.Block;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.CompilationUnit;
import org.eclipse.gmt.modisco.java.Expression;
import org.eclipse.gmt.modisco.java.ExpressionStatement;
import org.eclipse.gmt.modisco.java.FieldDeclaration;
import org.eclipse.gmt.modisco.java.MethodDeclaration;
import org.eclipse.gmt.modisco.java.MethodInvocation;
import org.eclipse.gmt.modisco.java.Modifier;
import org.eclipse.gmt.modisco.java.ParameterizedType;
import org.eclipse.gmt.modisco.java.PrimitiveTypeVoid;
import org.eclipse.gmt.modisco.java.SingleVariableAccess;
import org.eclipse.gmt.modisco.java.SingleVariableDeclaration;
import org.eclipse.gmt.modisco.java.Statement;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.TypeAccess;
import org.eclipse.gmt.modisco.java.TypeDeclarationStatement;
import org.eclipse.gmt.modisco.java.TypeParameter;
import org.eclipse.gmt.modisco.java.VariableDeclaration;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;
import org.eclipse.gmt.modisco.java.VariableDeclarationStatement;
import org.eclipse.gmt.modisco.java.VisibilityKind;
import org.eclipse.gmt.modisco.java.emf.JavaFactory;
import org.gravity.modisco.GravityMoDiscoFactoryImpl;
import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MAnnotation;
import org.gravity.modisco.MAnonymous;
import org.gravity.modisco.MClass;
import org.gravity.modisco.MConstructorDefinition;
import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MEntry;
import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MFieldName;
import org.gravity.modisco.MFieldSignature;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MMethodName;
import org.gravity.modisco.MMethodSignature;
import org.gravity.modisco.MName;
import org.gravity.modisco.MParameterList;
import org.gravity.modisco.MSignature;
import org.gravity.modisco.ModiscoFactory;

public class GravityMoDiscoPreprocessing extends EObjectImpl {

	private static boolean createParamList(MAbstractMethodDefinition mDef, MParameterList mParams) {
		MEntry prev = null;
		EList<MEntry> mEntrys = mParams.getMEntrys();
		for (SingleVariableDeclaration param : mDef.getParameters()) {
			MEntry entry = ModiscoFactory.eINSTANCE.createMEntry();
			entry.setSingleVariableDeclaration(param);
			mEntrys.add(entry);
			Type type = param.getType().getType();
			if (!(type instanceof TypeParameter)) {
				entry.setType(type);
			}
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

	private static Type getMostGenericReturnType(MMethodDefinition method) {
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
		AbstractTypeDeclaration abstractTypeDeclaration = method.getAbstractTypeDeclaration();
		if (abstractTypeDeclaration != null) {
			stack.add(abstractTypeDeclaration);
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
						System.err.println("Skipped type of: " + interf);
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
									System.err.println("Skipped return type of: " + decl);
									continue;
								}
								if (isSuperType(ret, returnTypeDecl.getType())) {
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

	private static boolean isParamListEqual(MMethodDefinition mDef, MMethodSignature mSig) {
		EList<SingleVariableDeclaration> parameters1 = mDef.getParameters();
		EList<MEntry> parameters2 = mSig.getMParameterList().getMEntrys();
		if (parameters1.size() == parameters2.size()) {
			for (int i = 0; i < parameters1.size(); i++) {
				if (!parameters1.get(i).getType().getType().equals(parameters2.get(i).getType())) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	private static boolean isSuperType(Type type, Type supertype) {
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

	private static boolean preprocess(MGravityModel model) {
		for(MConstructorDefinition mConst : model.getMConstructorDefinitions()) {
			MParameterList mParameterList = ModiscoFactory.eINSTANCE.createMParameterList();
			mConst.setMParameterList(mParameterList);
			createParamList(mConst, mParameterList);
		}
		
		if (preprocessFields(model) && preprocessMethods(model) && preprocessAccesses(model)) {
			for (MName mName : model.getMNames()) {
				for (MSignature mSignature : mName.getMSignatures()) {
					for (MDefinition mDefinition : mSignature.getMDefinitions()) {
						AbstractTypeDeclaration mType = mDefinition.getAbstractTypeDeclaration();
						if (mType != null) {
							mSignature.getImplementedBy().add(mType);
						}
					}
				}
			}
			return preprocessOrphanTypes(model);

		} else {
			return false;
		}

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean preprocessFields(MGravityModel model) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MFieldDefinition mDefinition : model.getMFieldDefinitions()) {
			_result.add(new Object[] { model, mDefinition });
		}
		for (Object[] result2_black : _result) {
			MFieldDefinition mDefinition = (MFieldDefinition) result2_black[1];

			VariableDeclarationFragment fstDeclFragment;
			EList<VariableDeclarationFragment> fragments = mDefinition.getFragments();
			if (fragments.size() > 0) {
				fstDeclFragment = fragments.get(0);
			}
			else {
				throw new RuntimeException("Pattern matching in node [ActivityNode37] failed." + " Variables: "
						+ "[mDefinition] = " + mDefinition + ".");
			}
			// ForEach ActivityNode36
			for (VariableDeclarationFragment scndDeclFragment : getOtherFragments(mDefinition, fstDeclFragment)) {
				scndDeclFragment.setVariablesContainer(null);

				MFieldDefinition newDef = ModiscoFactory.eINSTANCE.createMFieldDefinition();
				newDef.getFragments().add(scndDeclFragment);
				model.getMFieldDefinitions().add(newDef);
				newDef.setName(mDefinition.getName());
				newDef.setProxy(mDefinition.isProxy());
				newDef.setAbstractTypeDeclaration(mDefinition.getAbstractTypeDeclaration());

				TypeAccess oldTypeAccess = mDefinition.getType();
				if (oldTypeAccess != null) {
					Type type = oldTypeAccess.getType();
					if (type != null) {
						TypeAccess newTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
						newDef.setType(newTypeAccess);
						newTypeAccess.setType(type);
					}

				}

				if (!mDefinition.equals(newDef)) {
					Modifier modifier = mDefinition.getModifier();
					Modifier clonedModifier = JavaFactory.eINSTANCE.createModifier();
					newDef.setModifier(clonedModifier);
					clonedModifier.setVisibility(modifier.getVisibility());
					clonedModifier.setInheritance(modifier.getInheritance());

					AnonymousClassDeclaration anno = mDefinition.getAnonymousClassDeclarationOwner();
					if (anno != null) {
						anno.getBodyDeclarations().add(newDef);
					}

				}
			}

		}
		
		for (MFieldDefinition mfDefinition : model.getMFieldDefinitions()) {
			for (VariableDeclarationFragment declFragment : mfDefinition.getFragments()) {
				MFieldName mName = null;
				String declFragment_name = declFragment.getName();
				for (MFieldName m : model.getMFieldNames()) {
					String mName_mName = m.getMName();
					if (mName_mName.equals(declFragment_name)) {
						mName = m;
					}

				}
				if (mName == null) {
					mName = ModiscoFactory.eINSTANCE.createMFieldName();
					model.getMNames().add(mName);
					model.getMFieldNames().add(mName);
					mName.setMName(declFragment_name);
				}
				mName.getMFieldDefinitions().add(mfDefinition);

			}
		}
		// ForEach ActivityNode6
		for (MFieldName mName : model.getMFieldNames()) {
			for (MFieldDefinition mfDefinition2 : mName.getMFieldDefinitions()) {
				MFieldSignature mSig = getMFieldSignature(mName, mfDefinition2);
				if (mSig != null) {
					mSig.getMDefinitions().add(mfDefinition2);
					mSig.getMFieldDefinitions().add(mfDefinition2);

				} else {

					mSig = ModiscoFactory.eINSTANCE.createMFieldSignature();
					mSig.getMDefinitions().add(mfDefinition2);
					model.getMFieldSignatures().add(mSig);
					mSig.setMFieldName(mName);
					mSig.getMFieldDefinitions().add(mfDefinition2);
					mName.getMSignatures().add(mSig);

					if (mSig.getMFieldDefinitions().contains(mfDefinition2)) {
						TypeAccess mAccess = mfDefinition2.getType();
						if (mAccess != null) {
							Type mType = mAccess.getType();
							if (mType != null) {
								mSig.setType(mType);
							}
						}
					}

				}

			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean preprocessMethods(MGravityModel model) {
		// Create MMethodNames for MMethodDefinitions
		for (MMethodDefinition mDef : model.getMMethodDefinitions()) {
			MMethodName mName = null;
			for (MMethodName mMethodName : model.getMMethodNames()) {
				if (mMethodName.getMName().equals(mDef.getName())) {
					mName = mMethodName;
				}
			}
			if (mName != null) {
				mName.getMMethodDefinitions().add(mDef);

			} else {
				mName = ModiscoFactory.eINSTANCE.createMMethodName();
				mName.setModel(model);
				model.getMNames().add(mName);
				mName.getMMethodDefinitions().add(mDef);
				String mDef_name = mDef.getName();
				String mName_mName_prime = mDef_name;
				mName.setMName(mName_mName_prime);
			}

		}
		// Create MMethodSignatures for MMethodNames
		for (MMethodName mName : model.getMMethodNames()) {
			for (MMethodDefinition mDef : mName.getMMethodDefinitions()) {

				Type mSigReturnType = getMostGenericReturnType(mDef);
				if (mSigReturnType == null) {
					throw new RuntimeException("Couldn't find most geric return type for method definition:" + mDef + ".");
				}
				for (MMethodSignature mSig : mName.getMMethodSignatures()) {
					if (mSigReturnType.equals(mSig.getReturnType())) {
				
					if (isParamListEqual(mDef, mSig)) {
						mSig.getMMethodDefinitions().add(mDef);
						mSig.getMDefinitions().add(mDef);
					}

				}}
				MMethodSignature mOldSig = mDef.getMMethodSignature();
				if (mOldSig == null) {
					MParameterList mParams = ModiscoFactory.eINSTANCE.createMParameterList();
					MMethodSignature mNewSig = ModiscoFactory.eINSTANCE.createMMethodSignature();
					mName.getMSignatures().add(mNewSig);
					mNewSig.setMMethodName(mName);
					mNewSig.getMMethodDefinitions().add(mDef);
					mNewSig.setModel(model);
					mNewSig.setReturnType(mSigReturnType);
					mNewSig.getMDefinitions().add(mDef);
					mNewSig.setMParameterList(mParams);
					
					createParamList(mDef, mParams);

				}

			}
		}
		return true;
	}

	private boolean updateName(MName mName, MDefinition mDef) {
		// TODO: implement this method
		throw new UnsupportedOperationException();
	}

	private static boolean preprocessAccesses(MGravityModel model) {
		for (MAbstractMethodDefinition def : model.getMAbstractMethodDefinitions()) {
			Block block = def.getBody();
			if (!StatementHandler.handle(block, def)) {
				return false;
			}
			calculateTypeDependencies(def);
		}
		for (MFieldDefinition def : model.getMFieldDefinitions()) {
			for (VariableDeclarationFragment fragment : def.getFragments()) {
				if (!MiscHandler.handle(fragment, def)) {
					return false;
				}
			}
			calculateTypeDependencies(def);
		}
		return true;
	}

	private static void calculateTypeDependencies(MDefinition def) {
		Type mType = def.getAbstractTypeDeclaration();
		if (mType instanceof MClass) {
			EList<Type> deps = ((MClass) mType).getDependencies();
			for(AbstractMethodInvocation methodInvocation : def.getAbstractMethodInvocations()) {
				deps.add(methodInvocation.getMethod().getAbstractTypeDeclaration());
			}
			for(SingleVariableAccess methodInvocation : def.getMAbstractFieldAccess()) {
				VariableDeclaration variable = methodInvocation.getVariable();
				if (variable instanceof VariableDeclarationFragment) {
					AbstractVariablesContainer variablesContainer = ((VariableDeclarationFragment) variable).getVariablesContainer();
					if (variablesContainer instanceof FieldDeclaration) {
						deps.add(((FieldDeclaration) variablesContainer).getAbstractTypeDeclaration());
					}
				}
			}
		}
	}

	private static boolean preprocessOrphanTypes(MGravityModel model) {
		// [user code injected with eMoflon]
		return true;
	}

	private static final void fixStaticMethodCallOnField(
			MGravityModel model) {
		for (CompilationUnit cu : model.getCompilationUnits()) {
			for (AbstractTypeDeclaration tmpClazz : cu.getTypes()) {
				if (tmpClazz instanceof ClassDeclaration) {
					ClassDeclaration clazz = (ClassDeclaration) tmpClazz;
					for (BodyDeclaration tmpMethod : clazz.getBodyDeclarations()) {
						if (tmpMethod instanceof MethodDeclaration) {
							MethodDeclaration method = (MethodDeclaration) tmpMethod;
							Block block = method.getBody();
							if (block != null) {
								for (Statement tmpExpression : block.getStatements()) {
									if (tmpExpression instanceof ExpressionStatement) {
										ExpressionStatement expression = (ExpressionStatement) tmpExpression;
										Expression tmpInvoc = expression.getExpression();
										if (tmpInvoc instanceof MethodInvocation) {
											MethodInvocation invoc = (MethodInvocation) tmpInvoc;
											Expression tmpAccess = invoc.getExpression();
											if (tmpAccess instanceof SingleVariableAccess) {
												SingleVariableAccess access = (SingleVariableAccess) tmpAccess;
												AbstractMethodDeclaration tmpCalled = invoc.getMethod();
												if (tmpCalled instanceof MethodDeclaration) {
													MethodDeclaration called = (MethodDeclaration) tmpCalled;
													if (!called.equals(method)) {
														VariableDeclaration tmpVar = access.getVariable();
														if (tmpVar instanceof VariableDeclarationFragment) {
															VariableDeclarationFragment var = (VariableDeclarationFragment) tmpVar;
															AbstractTypeDeclaration type = called
																	.getAbstractTypeDeclaration();
															if (type != null) {
																if (!clazz.equals(type)) {
																	AbstractVariablesContainer tmpVarDecl = var
																			.getVariablesContainer();
																	if (tmpVarDecl instanceof FieldDeclaration) {
																		FieldDeclaration varDecl = (FieldDeclaration) tmpVarDecl;
																		if (varDecl.getType() != null) {
																			TypeAccess create = JavaFactory.eINSTANCE.createTypeAccess();
																			type.getUsagesInTypeAccess().add(create);
																			varDecl.setType(create);
																		}
																	}

																}
															}

														}

													}
												}

											}

										}

									}
								}
							}

						}
					}
				}
			}
		}
	}

	private static final Iterable<VariableDeclarationFragment> getOtherFragments(MFieldDefinition mDefinition,
			VariableDeclarationFragment fragment) {
		LinkedList<VariableDeclarationFragment> _result = new LinkedList<VariableDeclarationFragment>();
		if (mDefinition.getFragments().contains(fragment)) {
			for (VariableDeclarationFragment otherFragment : mDefinition.getFragments()) {
				if (!fragment.equals(otherFragment)) {
					_result.add(otherFragment);
				}
			}
		}
		return _result;
	}

	private static final MFieldSignature getMFieldSignature(MFieldName mName, MFieldDefinition mfDefinition) {
		TypeAccess mAccess = mfDefinition.getType();
		if (mAccess != null) {
			Type mType = mAccess.getType();
			if (mType != null) {
				for (MFieldSignature mSig : mName.getMFieldSignatures()) {
					if (mType.equals(mSig.getType())) {
						return mSig;
					}
				}
			}

		}

		return null;
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

	public static boolean preprocess(IProgressMonitor progressMonitor, MGravityModel model) {
		GravityMoDiscoFactoryImpl factory = (GravityMoDiscoFactoryImpl) JavaFactory.eINSTANCE;
		if (model.getMFieldDefinitions().size() == 0) {
			model.getMFieldDefinitions().addAll(factory.getFdefs());
		}
		if (model.getMMethodDefinitions().size() == 0) {
			model.getMMethodDefinitions().addAll(factory.getMdefs());
		}
		if (model.getMConstructorDefinitions().size() == 0) {
			model.getMConstructorDefinitions().addAll(factory.getCdefs());
		}	
		fixStaticMethodCallOnField(model);
		if (!preprocess(model)) {
			return false;
		}
		StaticTypePreprocessor staticTypePreprocessor = new StaticTypePreprocessor(model);
		TreeIterator<EObject> iterator = model.eResource().getAllContents();
		while (iterator.hasNext()) {
			EObject next = iterator.next();
			if (next instanceof TypeDeclarationStatement) {
				TypeDeclarationStatement statement = (TypeDeclarationStatement) next;
				AbstractTypeDeclaration type = statement.getDeclaration();
				EObject eObject = statement.eContainer();
				while(!(eObject instanceof MAbstractMethodDefinition)) {
					eObject = eObject.eContainer();
				}
				((MAbstractMethodDefinition) eObject).getMInnerTypes().add(type);
			}
			else if (next instanceof MAnonymous) {
				MAnonymous mAnonymous = (MAnonymous) next;
				EObject owner = mAnonymous.eContainer();
				while(!(owner instanceof AbstractTypeDeclaration)) {
					owner = owner.eContainer();
				}
				mAnonymous.setMSourroundingType((AbstractTypeDeclaration) owner);
				model.getAnonymousClassDeclarations().add(mAnonymous);
			} else if (next instanceof TypeParameter) {
				model.getTypeParameters().add((TypeParameter) next);
			} else if (next instanceof Annotation) {
				EObject eObject = next.eContainer();
				((MAnnotation) next).setMRelevant(!(eObject instanceof VariableDeclarationStatement
						|| eObject instanceof SingleVariableDeclaration));
			} else if (next instanceof MAbstractMethodDefinition) {
				staticTypePreprocessor.addStaticTypeAccesses((MAbstractMethodDefinition) next);	
				if (next instanceof MMethodDefinition) {
					SyntethicMethodsPreprocessor.addSyntethicMembers((MMethodDefinition) next);			
				}
			}
			else if (next instanceof Modifier) {
				Modifier modifier = (Modifier) next;
				if(modifier.getVisibility() == null) {
					AbstractTypeDeclaration typeDecl = modifier.getBodyDeclaration().getAbstractTypeDeclaration();
					if(typeDecl.eContainer() instanceof TypeDeclarationStatement) {
						modifier.setVisibility(VisibilityKind.PRIVATE);
					}
					else {
						System.err.println("Type \""+typeDecl.getName()+"\" has no visibility.");
					}
				}
				
			}
			if (progressMonitor.isCanceled()) {
				return false;
			}
		}
		return true;
	}
}
