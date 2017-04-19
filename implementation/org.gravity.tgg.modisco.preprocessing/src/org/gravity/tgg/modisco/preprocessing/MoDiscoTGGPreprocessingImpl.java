package org.gravity.tgg.modisco.preprocessing;

import java.lang.Iterable;
import java.util.LinkedList;
import java.util.Stack;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration;
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
import org.eclipse.gmt.modisco.java.InheritanceKind;
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
import org.eclipse.gmt.modisco.java.TypeParameter;
import org.eclipse.gmt.modisco.java.VariableDeclaration;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;
import org.eclipse.gmt.modisco.java.VariableDeclarationStatement;
import org.eclipse.gmt.modisco.java.VisibilityKind;
import org.eclipse.gmt.modisco.java.emf.JavaFactory;
import org.gravity.modisco.GravityMoDiscoFactoryImpl;
import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MAnnotation;
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
import org.gravity.modisco.MSignature;
import org.gravity.modisco.ModiscoFactory;

public class MoDiscoTGGPreprocessingImpl extends EObjectImpl {

	private boolean createParamList(MMethodDefinition mDef, MMethodSignature mSig) {
		MEntry prev = null;
		EList<MEntry> mEntrys = mSig.getMEntrys();
		for (SingleVariableDeclaration param : mDef.getParameters()) {
			MEntry entry = ModiscoFactory.eINSTANCE.createMEntry();
			entry.setSingleVariableDeclaration(param);
			mEntrys.add(entry);
			Type type = param.getType().getType();
			if (!(type instanceof TypeParameter)) {
				entry.setType(type);
			}
			if (prev == null) {
				mSig.setMFirstEntry(entry);
			} else {
				entry.setMPrevious(prev);
				prev.setMNext(entry);
			}
			prev = entry;
		}
		return true;
	}

	public boolean fixStaticMethodCallOnField(MGravityModel model) {
		for (Object[] result1_black : MoDiscoTGGPreprocessingImpl
				.pattern_MoDiscoTGGPreprocessing_1_1_ActivityNode28_blackFFFFBFFFFFFF(model)) {
			AbstractTypeDeclaration type = (AbstractTypeDeclaration) result1_black[0];
			FieldDeclaration varDecl = (FieldDeclaration) result1_black[10];
			Object[] result2_black = MoDiscoTGGPreprocessingImpl
					.pattern_MoDiscoTGGPreprocessing_1_2_ActivityNode29_blackBB(type, varDecl);
			if (result2_black != null) {
				MoDiscoTGGPreprocessingImpl.pattern_MoDiscoTGGPreprocessing_1_2_ActivityNode29_greenBFB(type, varDecl);
			}

		}
		return true;
	}

	private Type getMostGenericReturnType(MMethodDefinition method) {
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

	private boolean isParamListEqual(MMethodDefinition mDef, MMethodSignature mSig) {
		EList<SingleVariableDeclaration> parameters1 = mDef.getParameters();
		EList<MEntry> parameters2 = mSig.getMEntrys();
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

	private boolean isSuperType(Type type, Type supertype) {
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

	private boolean preprocess(MGravityModel model) {
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
	private boolean preprocessFields(MGravityModel model) {
		// ActivityNode4
		Object[] result1_black = MoDiscoTGGPreprocessingImpl
				.pattern_MoDiscoTGGPreprocessing_6_1_ActivityNode4_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode4] failed." + " Variables: " + "[this] = " + this + ".");
		}
		// ForEach ActivityNode31
		for (Object[] result2_black : MoDiscoTGGPreprocessingImpl
				.pattern_MoDiscoTGGPreprocessing_6_2_ActivityNode31_blackBF(model)) {
			MFieldDefinition mDefinition = (MFieldDefinition) result2_black[1];

			// ActivityNode37
			Object[] result3_black = MoDiscoTGGPreprocessingImpl
					.pattern_MoDiscoTGGPreprocessing_6_3_ActivityNode37_blackFB(mDefinition);
			if (result3_black == null) {
				throw new RuntimeException("Pattern matching in node [ActivityNode37] failed." + " Variables: "
						+ "[mDefinition] = " + mDefinition + ".");
			}
			VariableDeclarationFragment fstDeclFragment = (VariableDeclarationFragment) result3_black[0];
			// ForEach ActivityNode36
			for (Object[] result4_black : MoDiscoTGGPreprocessingImpl
					.pattern_MoDiscoTGGPreprocessing_6_4_ActivityNode36_blackFBB(mDefinition, fstDeclFragment)) {
				VariableDeclarationFragment scndDeclFragment = (VariableDeclarationFragment) result4_black[0];
				MoDiscoTGGPreprocessingImpl.pattern_MoDiscoTGGPreprocessing_6_4_ActivityNode36_redBB(scndDeclFragment,
						mDefinition);

				// ActivityNode32
				Object[] result5_black = MoDiscoTGGPreprocessingImpl
						.pattern_MoDiscoTGGPreprocessing_6_5_ActivityNode32_blackBB(scndDeclFragment, model);
				if (result5_black != null) {
					Object[] result5_green = MoDiscoTGGPreprocessingImpl
							.pattern_MoDiscoTGGPreprocessing_6_5_ActivityNode32_greenBFBB(scndDeclFragment, model,
									mDefinition);
					MFieldDefinition newDef = (MFieldDefinition) result5_green[1];

					// ActivityNode38
					Object[] result6_black = MoDiscoTGGPreprocessingImpl
							.pattern_MoDiscoTGGPreprocessing_6_6_ActivityNode38_blackFBB(mDefinition, newDef);
					if (result6_black != null) {
						AbstractTypeDeclaration abstrType = (AbstractTypeDeclaration) result6_black[0];
						MoDiscoTGGPreprocessingImpl
								.pattern_MoDiscoTGGPreprocessing_6_6_ActivityNode38_greenBB(abstrType, newDef);

					} else {
					}
					// ActivityNode33
					Object[] result7_black = MoDiscoTGGPreprocessingImpl
							.pattern_MoDiscoTGGPreprocessing_6_7_ActivityNode33_blackBFBF(newDef, mDefinition);
					if (result7_black != null) {
						Type type = (Type) result7_black[1];
						// TypeAccess oldTypeAccess = (TypeAccess)
						// result7_black[3];
						MoDiscoTGGPreprocessingImpl.pattern_MoDiscoTGGPreprocessing_6_7_ActivityNode33_greenBFB(newDef,
								type);
						// TypeAccess newTypeAccess = (TypeAccess)
						// result7_green[1];

					} else {
					}
					// ActivityNode34
					Object[] result8_black = MoDiscoTGGPreprocessingImpl
							.pattern_MoDiscoTGGPreprocessing_6_8_ActivityNode34_blackBBF(mDefinition, newDef);
					if (result8_black != null) {
						Modifier modifier = (Modifier) result8_black[2];
						MoDiscoTGGPreprocessingImpl.pattern_MoDiscoTGGPreprocessing_6_8_ActivityNode34_greenBFB(newDef,
								modifier);
						// Modifier clonedModifier = (Modifier)
						// result8_green[1];

					} else {
					}
					// ActivityNode35
					Object[] result9_black = MoDiscoTGGPreprocessingImpl
							.pattern_MoDiscoTGGPreprocessing_6_9_ActivityNode35_blackBBF(mDefinition, newDef);
					if (result9_black != null) {
						AnonymousClassDeclaration anno = (AnonymousClassDeclaration) result9_black[2];
						MoDiscoTGGPreprocessingImpl.pattern_MoDiscoTGGPreprocessing_6_9_ActivityNode35_greenBB(newDef,
								anno);

					} else {
					}

				} else {
					return MoDiscoTGGPreprocessingImpl.pattern_MoDiscoTGGPreprocessing_6_10_expressionF();
				}

			}

		}
		// ForEach ActivityNode5
		for (Object[] result11_black : MoDiscoTGGPreprocessingImpl
				.pattern_MoDiscoTGGPreprocessing_6_11_ActivityNode5_blackFBF(model)) {
			VariableDeclarationFragment declFragment = (VariableDeclarationFragment) result11_black[0];
			MFieldDefinition mfDefinition = (MFieldDefinition) result11_black[2];
			// ActivityNode7
			Object[] result12_black = MoDiscoTGGPreprocessingImpl
					.pattern_MoDiscoTGGPreprocessing_6_12_ActivityNode7_blackFBBB(model, mfDefinition, declFragment);
			if (result12_black != null) {
				MFieldName mName = (MFieldName) result12_black[0];
				MoDiscoTGGPreprocessingImpl.pattern_MoDiscoTGGPreprocessing_6_12_ActivityNode7_greenBBB(mName,
						mfDefinition, declFragment);

			} else {

				// ActivityNode9
				Object[] result13_black = MoDiscoTGGPreprocessingImpl
						.pattern_MoDiscoTGGPreprocessing_6_13_ActivityNode9_blackBB(mfDefinition, model);
				if (result13_black == null) {
					throw new RuntimeException("Pattern matching in node [ActivityNode9] failed." + " Variables: "
							+ "[mfDefinition] = " + mfDefinition + ", " + "[model] = " + model + ".");
				}
				MoDiscoTGGPreprocessingImpl.pattern_MoDiscoTGGPreprocessing_6_13_ActivityNode9_greenBBFB(mfDefinition,
						model, declFragment);
				// MFieldName mName = (MFieldName) result13_green[2];

			}

		}
		// ForEach ActivityNode6
		for (Object[] result14_black : MoDiscoTGGPreprocessingImpl
				.pattern_MoDiscoTGGPreprocessing_6_14_ActivityNode6_blackFFB(model)) {
			MFieldDefinition mfDefinition2 = (MFieldDefinition) result14_black[0];
			MFieldName mName = (MFieldName) result14_black[1];
			// ActivityNode10
			Object[] result15_black = MoDiscoTGGPreprocessingImpl
					.pattern_MoDiscoTGGPreprocessing_6_15_ActivityNode10_blackFBFFB(mName, mfDefinition2);
			if (result15_black != null) {
				// Type mType = (Type) result15_black[0];
				// TypeAccess mAccess = (TypeAccess) result15_black[2];
				MFieldSignature mSig = (MFieldSignature) result15_black[3];
				MoDiscoTGGPreprocessingImpl.pattern_MoDiscoTGGPreprocessing_6_15_ActivityNode10_greenBB(mSig,
						mfDefinition2);

			} else {

				// ActivityNode11
				Object[] result16_black = MoDiscoTGGPreprocessingImpl
						.pattern_MoDiscoTGGPreprocessing_6_16_ActivityNode11_blackBBB(mfDefinition2, mName, model);
				if (result16_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [ActivityNode11] failed." + " Variables: " + "[mfDefinition2] = "
									+ mfDefinition2 + ", " + "[mName] = " + mName + ", " + "[model] = " + model + ".");
				}
				Object[] result16_green = MoDiscoTGGPreprocessingImpl
						.pattern_MoDiscoTGGPreprocessing_6_16_ActivityNode11_greenFBBB(mfDefinition2, mName, model);
				MFieldSignature mSig = (MFieldSignature) result16_green[0];

				// ActivityNode30
				Object[] result17_black = MoDiscoTGGPreprocessingImpl
						.pattern_MoDiscoTGGPreprocessing_6_17_ActivityNode30_blackBFBF(mSig, mfDefinition2);
				if (result17_black != null) {
					// TypeAccess mAccess = (TypeAccess) result17_black[1];
					Type mType = (Type) result17_black[3];
					MoDiscoTGGPreprocessingImpl.pattern_MoDiscoTGGPreprocessing_6_17_ActivityNode30_greenBB(mSig,
							mType);

				} else {
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
	private boolean preprocessMethods(MGravityModel model) {
		// ActivityNode12
		Object[] result1_black = MoDiscoTGGPreprocessingImpl
				.pattern_MoDiscoTGGPreprocessing_8_1_ActivityNode12_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [ActivityNode12] failed." + " Variables: " + "[this] = " + this + ".");
		}
		// ForEach ActivityNode13
		for (Object[] result2_black : MoDiscoTGGPreprocessingImpl
				.pattern_MoDiscoTGGPreprocessing_8_2_ActivityNode13_blackBF(model)) {
			MMethodDefinition mDef = (MMethodDefinition) result2_black[1];
			// ActivityNode15
			Object[] result3_black = MoDiscoTGGPreprocessingImpl
					.pattern_MoDiscoTGGPreprocessing_8_3_ActivityNode15_blackBFB(mDef, model);
			if (result3_black != null) {
				MMethodName mName = (MMethodName) result3_black[1];
				MoDiscoTGGPreprocessingImpl.pattern_MoDiscoTGGPreprocessing_8_3_ActivityNode15_greenBB(mDef, mName);

			} else {

				// ActivityNode16
				Object[] result4_black = MoDiscoTGGPreprocessingImpl
						.pattern_MoDiscoTGGPreprocessing_8_4_ActivityNode16_blackBB(model, mDef);
				if (result4_black == null) {
					throw new RuntimeException("Pattern matching in node [ActivityNode16] failed." + " Variables: "
							+ "[model] = " + model + ", " + "[mDef] = " + mDef + ".");
				}
				MoDiscoTGGPreprocessingImpl.pattern_MoDiscoTGGPreprocessing_8_4_ActivityNode16_greenFBB(model, mDef);
				// MMethodName mName = (MMethodName) result4_green[0];

			}
		}

		// ForEach ActivityNode14
		for (Object[] result5_black : MoDiscoTGGPreprocessingImpl
				.pattern_MoDiscoTGGPreprocessing_8_5_ActivityNode14_blackFFB(model)) {
			MMethodName mName = (MMethodName) result5_black[0];
			MMethodDefinition mDef = (MMethodDefinition) result5_black[1];

			// ActivityNode23
			Object[] result6_bindingAndBlack = MoDiscoTGGPreprocessingImpl
					.pattern_MoDiscoTGGPreprocessing_8_6_ActivityNode23_bindingAndBlackFBB(this, mDef);
			if (result6_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [ActivityNode23] failed." + " Variables: "
						+ "[this] = " + this + ", " + "[mDef] = " + mDef + ".");
			}
			Type mSigType = (Type) result6_bindingAndBlack[0];
			// ForEach ActivityNode17
			for (Object[] result7_black : MoDiscoTGGPreprocessingImpl
					.pattern_MoDiscoTGGPreprocessing_8_7_ActivityNode17_blackFBB(mSigType, mName)) {
				MMethodSignature mSig = (MMethodSignature) result7_black[0];
				// ActivityNode19
				if (MoDiscoTGGPreprocessingImpl.pattern_MoDiscoTGGPreprocessing_8_8_ActivityNode19_expressionFBBB(this,
						mDef, mSig)) {

					// ActivityNode20
					Object[] result9_black = MoDiscoTGGPreprocessingImpl
							.pattern_MoDiscoTGGPreprocessing_8_9_ActivityNode20_blackBB(mDef, mSig);
					if (result9_black == null) {
						throw new RuntimeException("Pattern matching in node [ActivityNode20] failed." + " Variables: "
								+ "[mDef] = " + mDef + ", " + "[mSig] = " + mSig + ".");
					}
					MoDiscoTGGPreprocessingImpl.pattern_MoDiscoTGGPreprocessing_8_9_ActivityNode20_greenBB(mDef, mSig);

				} else {
				}

			}
			// ActivityNode24
			Object[] result10_black = MoDiscoTGGPreprocessingImpl
					.pattern_MoDiscoTGGPreprocessing_8_10_ActivityNode24_blackFB(mDef);
			if (result10_black != null) {
				// MMethodSignature mOldSig = (MMethodSignature)
				// result10_black[0];
			} else {
				// ActivityNode18
				Object[] result11_black = MoDiscoTGGPreprocessingImpl
						.pattern_MoDiscoTGGPreprocessing_8_11_ActivityNode18_blackBBBB(mName, mDef, mSigType, model);
				if (result11_black != null) {
					Object[] result11_green = MoDiscoTGGPreprocessingImpl
							.pattern_MoDiscoTGGPreprocessing_8_11_ActivityNode18_greenBBBFB(mName, mDef, mSigType,
									model);
					MMethodSignature mNewSig = (MMethodSignature) result11_green[3];

					// ActivityNode21
					MoDiscoTGGPreprocessingImpl.pattern_MoDiscoTGGPreprocessing_8_12_ActivityNode21_expressionFBBB(this,
							mDef, mNewSig);

				} else {
				}

			}

		}
		return true;
	}

	private boolean updateName(MName mName, MDefinition mDef) {
		// [user code injected with eMoflon]
		// TODO: implement this method here but do not remove the injection
		// marker
		throw new UnsupportedOperationException();
	}

	private boolean preprocessAccesses(MGravityModel model) {
		for (MAbstractMethodDefinition def : model.getMAbstractMethodDefinitions()) {
			Block block = def.getBody();
			if (!StatementHandler.handle(block, def)) {
				return false;
			}
		}
		for (MFieldDefinition def : model.getMFieldDefinitions()) {
			for (VariableDeclarationFragment fragment : def.getFragments()) {
				if (!MiscHandler.handle(fragment, def)) {
					return false;
				}
			}
		}
		return true;
	}

	private boolean preprocessOrphanTypes(MGravityModel model) {
		// [user code injected with eMoflon]
		return true;
	}

	private static final Iterable<Object[]> pattern_MoDiscoTGGPreprocessing_1_1_ActivityNode28_blackFFFFBFFFFFFF(
			MGravityModel model) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
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
																		_result.add(new Object[] { type, block, access,
																				cu, model, expression, method, invoc,
																				clazz, var, varDecl, called });
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
		return _result;
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_1_2_ActivityNode29_black_nac_0B(
			FieldDeclaration varDecl) {
		TypeAccess old = varDecl.getType();
		if (old != null) {
			return new Object[] { varDecl };
		}

		return null;
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_1_2_ActivityNode29_blackBB(
			AbstractTypeDeclaration type, FieldDeclaration varDecl) {
		if (pattern_MoDiscoTGGPreprocessing_1_2_ActivityNode29_black_nac_0B(varDecl) == null) {
			return new Object[] { type, varDecl };
		}
		return null;
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_1_2_ActivityNode29_greenBFB(
			AbstractTypeDeclaration type, FieldDeclaration varDecl) {
		TypeAccess create = JavaFactory.eINSTANCE.createTypeAccess();
		type.getUsagesInTypeAccess().add(create);
		varDecl.setType(create);
		return new Object[] { type, create, varDecl };
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_6_1_ActivityNode4_blackB(
			MoDiscoTGGPreprocessingImpl _this) {
		return new Object[] { _this };
	}

	private static final Iterable<Object[]> pattern_MoDiscoTGGPreprocessing_6_2_ActivityNode31_blackBF(
			MGravityModel model) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MFieldDefinition mDefinition : model.getMFieldDefinitions()) {
			_result.add(new Object[] { model, mDefinition });
		}
		return _result;
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_6_3_ActivityNode37_blackFB(
			MFieldDefinition mDefinition) {
		for (VariableDeclarationFragment fstDeclFragment : mDefinition.getFragments()) {
			return new Object[] { fstDeclFragment, mDefinition };
		}
		return null;
	}

	private static final Iterable<Object[]> pattern_MoDiscoTGGPreprocessing_6_4_ActivityNode36_blackFBB(
			MFieldDefinition mDefinition, VariableDeclarationFragment fstDeclFragment) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mDefinition.getFragments().contains(fstDeclFragment)) {
			for (VariableDeclarationFragment scndDeclFragment : mDefinition.getFragments()) {
				if (!fstDeclFragment.equals(scndDeclFragment)) {
					_result.add(new Object[] { scndDeclFragment, mDefinition, fstDeclFragment });
				}
			}
		}
		return _result;
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_6_4_ActivityNode36_redBB(
			VariableDeclarationFragment scndDeclFragment, MFieldDefinition mDefinition) {
		scndDeclFragment.setVariablesContainer(null);
		return new Object[] { scndDeclFragment, mDefinition };
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_6_5_ActivityNode32_blackBB(
			VariableDeclarationFragment scndDeclFragment, MGravityModel model) {
		return new Object[] { scndDeclFragment, model };
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_6_5_ActivityNode32_greenBFBB(
			VariableDeclarationFragment scndDeclFragment, MGravityModel model, MFieldDefinition mDefinition) {
		MFieldDefinition newDef = ModiscoFactory.eINSTANCE.createMFieldDefinition();
		newDef.getFragments().add(scndDeclFragment);
		model.getMFieldDefinitions().add(newDef);
		String mDefinition_name = mDefinition.getName();
		String newDef_name_prime = mDefinition_name;
		newDef.setName(newDef_name_prime);
		boolean mDefinition_proxy = mDefinition.isProxy();
		boolean newDef_proxy_prime = Boolean.valueOf(mDefinition_proxy);
		newDef.setProxy(Boolean.valueOf(newDef_proxy_prime));
		return new Object[] { scndDeclFragment, newDef, model, mDefinition };

	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_6_6_ActivityNode38_blackFBB(
			MFieldDefinition mDefinition, MFieldDefinition newDef) {
		if (!mDefinition.equals(newDef)) {
			AbstractTypeDeclaration abstrType = mDefinition.getAbstractTypeDeclaration();
			if (abstrType != null) {
				return new Object[] { abstrType, mDefinition, newDef };
			}

		}
		return null;
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_6_6_ActivityNode38_greenBB(
			AbstractTypeDeclaration abstrType, MFieldDefinition newDef) {
		newDef.setAbstractTypeDeclaration(abstrType);
		return new Object[] { abstrType, newDef };
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_6_7_ActivityNode33_blackBFBF(MFieldDefinition newDef,
			MFieldDefinition mDefinition) {
		if (!mDefinition.equals(newDef)) {
			TypeAccess oldTypeAccess = mDefinition.getType();
			if (oldTypeAccess != null) {
				Type type = oldTypeAccess.getType();
				if (type != null) {
					return new Object[] { newDef, type, mDefinition, oldTypeAccess };
				}

			}

		}
		return null;
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_6_7_ActivityNode33_greenBFB(MFieldDefinition newDef,
			Type type) {
		TypeAccess newTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		newDef.setType(newTypeAccess);
		newTypeAccess.setType(type);
		return new Object[] { newDef, newTypeAccess, type };
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_6_8_ActivityNode34_blackBBF(
			MFieldDefinition mDefinition, MFieldDefinition newDef) {
		if (!mDefinition.equals(newDef)) {
			Modifier modifier = mDefinition.getModifier();
			if (modifier != null) {
				return new Object[] { mDefinition, newDef, modifier };
			}

		}
		return null;
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_6_8_ActivityNode34_greenBFB(MFieldDefinition newDef,
			Modifier modifier) {
		Modifier clonedModifier = JavaFactory.eINSTANCE.createModifier();
		newDef.setModifier(clonedModifier);
		VisibilityKind modifier_visibility = modifier.getVisibility();
		VisibilityKind clonedModifier_visibility_prime = modifier_visibility;
		clonedModifier.setVisibility(clonedModifier_visibility_prime);
		InheritanceKind modifier_inheritance = modifier.getInheritance();
		InheritanceKind clonedModifier_inheritance_prime = modifier_inheritance;
		clonedModifier.setInheritance(clonedModifier_inheritance_prime);
		return new Object[] { newDef, clonedModifier, modifier };

	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_6_9_ActivityNode35_blackBBF(
			MFieldDefinition mDefinition, MFieldDefinition newDef) {
		if (!mDefinition.equals(newDef)) {
			AnonymousClassDeclaration anno = mDefinition.getAnonymousClassDeclarationOwner();
			if (anno != null) {
				return new Object[] { mDefinition, newDef, anno };
			}

		}
		return null;
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_6_9_ActivityNode35_greenBB(MFieldDefinition newDef,
			AnonymousClassDeclaration anno) {
		anno.getBodyDeclarations().add(newDef);
		return new Object[] { newDef, anno };
	}

	private static final boolean pattern_MoDiscoTGGPreprocessing_6_10_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	private static final Iterable<Object[]> pattern_MoDiscoTGGPreprocessing_6_11_ActivityNode5_blackFBF(
			MGravityModel model) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MFieldDefinition mfDefinition : model.getMFieldDefinitions()) {
			for (VariableDeclarationFragment declFragment : mfDefinition.getFragments()) {
				_result.add(new Object[] { declFragment, model, mfDefinition });
			}
		}
		return _result;
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_6_12_ActivityNode7_blackFBBB(MGravityModel model,
			MFieldDefinition mfDefinition, VariableDeclarationFragment declFragment) {
		String declFragment_name = declFragment.getName();
		for (MFieldName mName : model.getMFieldNames()) {
			String mName_mName = mName.getMName();
			if (mName_mName.equals(declFragment_name)) {
				return new Object[] { mName, model, mfDefinition, declFragment };
			}

		}

		return null;
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_6_12_ActivityNode7_greenBBB(MFieldName mName,
			MFieldDefinition mfDefinition, VariableDeclarationFragment declFragment) {
		mName.getMFieldDefinitions().add(mfDefinition);
		return new Object[] { mName, mfDefinition, declFragment };
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_6_13_ActivityNode9_blackBB(
			MFieldDefinition mfDefinition, MGravityModel model) {
		return new Object[] { mfDefinition, model };
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_6_13_ActivityNode9_greenBBFB(
			MFieldDefinition mfDefinition, MGravityModel model, VariableDeclarationFragment declFragment) {
		MFieldName mName = ModiscoFactory.eINSTANCE.createMFieldName();
		mName.getMFieldDefinitions().add(mfDefinition);
		model.getMNames().add(mName);
		model.getMFieldNames().add(mName);
		String declFragment_name = declFragment.getName();
		String mName_mName_prime = declFragment_name;
		mName.setMName(mName_mName_prime);
		return new Object[] { mfDefinition, model, mName, declFragment };

	}

	private static final Iterable<Object[]> pattern_MoDiscoTGGPreprocessing_6_14_ActivityNode6_blackFFB(
			MGravityModel model) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MFieldName mName : model.getMFieldNames()) {
			for (MFieldDefinition mfDefinition2 : mName.getMFieldDefinitions()) {
				_result.add(new Object[] { mfDefinition2, mName, model });
			}
		}
		return _result;
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_6_15_ActivityNode10_blackFBFFB(MFieldName mName,
			MFieldDefinition mfDefinition2) {
		TypeAccess mAccess = mfDefinition2.getType();
		if (mAccess != null) {
			Type mType = mAccess.getType();
			if (mType != null) {
				for (MFieldSignature mSig : mName.getMFieldSignatures()) {
					if (mType.equals(mSig.getType())) {
						return new Object[] { mType, mName, mAccess, mSig, mfDefinition2 };
					}
				}
			}

		}

		return null;
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_6_15_ActivityNode10_greenBB(MFieldSignature mSig,
			MFieldDefinition mfDefinition2) {
		mSig.getMDefinitions().add(mfDefinition2);
		mSig.getMFieldDefinitions().add(mfDefinition2);
		return new Object[] { mSig, mfDefinition2 };
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_6_16_ActivityNode11_blackBBB(
			MFieldDefinition mfDefinition2, MFieldName mName, MGravityModel model) {
		return new Object[] { mfDefinition2, mName, model };
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_6_16_ActivityNode11_greenFBBB(
			MFieldDefinition mfDefinition2, MFieldName mName, MGravityModel model) {
		MFieldSignature mSig = ModiscoFactory.eINSTANCE.createMFieldSignature();
		mSig.getMDefinitions().add(mfDefinition2);
		model.getMFieldSignatures().add(mSig);
		mSig.setMFieldName(mName);
		mSig.getMFieldDefinitions().add(mfDefinition2);
		mName.getMSignatures().add(mSig);
		return new Object[] { mSig, mfDefinition2, mName, model };
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_6_17_ActivityNode30_blackBFBF(MFieldSignature mSig,
			MFieldDefinition mfDefinition2) {
		if (mSig.getMDefinitions().contains(mfDefinition2)) {
			if (mSig.getMFieldDefinitions().contains(mfDefinition2)) {
				TypeAccess mAccess = mfDefinition2.getType();
				if (mAccess != null) {
					Type mType = mAccess.getType();
					if (mType != null) {
						return new Object[] { mSig, mAccess, mfDefinition2, mType };
					}

				}

			}
		}
		return null;
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_6_17_ActivityNode30_greenBB(MFieldSignature mSig,
			Type mType) {
		mSig.setType(mType);
		return new Object[] { mSig, mType };
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_8_1_ActivityNode12_blackB(
			MoDiscoTGGPreprocessingImpl _this) {
		return new Object[] { _this };
	}

	private static final Iterable<Object[]> pattern_MoDiscoTGGPreprocessing_8_2_ActivityNode13_blackBF(
			MGravityModel model) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MMethodDefinition mDef : model.getMMethodDefinitions()) {
			_result.add(new Object[] { model, mDef });
		}
		return _result;
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_8_3_ActivityNode15_blackBFB(MMethodDefinition mDef,
			MGravityModel model) {
		String mDef_name = mDef.getName();
		for (MMethodName mName : model.getMMethodNames()) {
			String mName_mName = mName.getMName();
			if (mName_mName.equals(mDef_name)) {
				return new Object[] { mDef, mName, model };
			}

		}

		return null;
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_8_3_ActivityNode15_greenBB(MMethodDefinition mDef,
			MMethodName mName) {
		mName.getMMethodDefinitions().add(mDef);
		return new Object[] { mDef, mName };
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_8_4_ActivityNode16_blackBB(MGravityModel model,
			MMethodDefinition mDef) {
		return new Object[] { model, mDef };
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_8_4_ActivityNode16_greenFBB(MGravityModel model,
			MMethodDefinition mDef) {
		MMethodName mName = ModiscoFactory.eINSTANCE.createMMethodName();
		mName.setModel(model);
		model.getMNames().add(mName);
		mName.getMMethodDefinitions().add(mDef);
		String mDef_name = mDef.getName();
		String mName_mName_prime = mDef_name;
		mName.setMName(mName_mName_prime);
		return new Object[] { mName, model, mDef };

	}

	private static final Iterable<Object[]> pattern_MoDiscoTGGPreprocessing_8_5_ActivityNode14_blackFFB(
			MGravityModel model) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MMethodName mName : model.getMMethodNames()) {
			for (MMethodDefinition mDef : mName.getMMethodDefinitions()) {
				_result.add(new Object[] { mName, mDef, model });
			}
		}
		return _result;
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_8_6_ActivityNode23_bindingFBB(
			MoDiscoTGGPreprocessingImpl _this, MMethodDefinition mDef) {
		Type _localVariable_0 = _this.getMostGenericReturnType(mDef);
		Type mSigType = _localVariable_0;
		if (mSigType != null) {
			return new Object[] { mSigType, _this, mDef };
		}
		return null;
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_8_6_ActivityNode23_blackB(Type mSigType) {
		return new Object[] { mSigType };
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_8_6_ActivityNode23_bindingAndBlackFBB(
			MoDiscoTGGPreprocessingImpl _this, MMethodDefinition mDef) {
		Object[] result_pattern_MoDiscoTGGPreprocessing_8_6_ActivityNode23_binding = pattern_MoDiscoTGGPreprocessing_8_6_ActivityNode23_bindingFBB(
				_this, mDef);
		if (result_pattern_MoDiscoTGGPreprocessing_8_6_ActivityNode23_binding != null) {
			Type mSigType = (Type) result_pattern_MoDiscoTGGPreprocessing_8_6_ActivityNode23_binding[0];

			Object[] result_pattern_MoDiscoTGGPreprocessing_8_6_ActivityNode23_black = pattern_MoDiscoTGGPreprocessing_8_6_ActivityNode23_blackB(
					mSigType);
			if (result_pattern_MoDiscoTGGPreprocessing_8_6_ActivityNode23_black != null) {

				return new Object[] { mSigType, _this, mDef };
			}
		}
		return null;
	}

	private static final Iterable<Object[]> pattern_MoDiscoTGGPreprocessing_8_7_ActivityNode17_blackFBB(Type mSigType,
			MMethodName mName) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MMethodSignature mSig : mName.getMMethodSignatures()) {
			if (mSigType.equals(mSig.getReturnType())) {
				_result.add(new Object[] { mSig, mSigType, mName });
			}
		}
		return _result;
	}

	private static final boolean pattern_MoDiscoTGGPreprocessing_8_8_ActivityNode19_expressionFBBB(
			MoDiscoTGGPreprocessingImpl _this, MMethodDefinition mDef, MMethodSignature mSig) {
		boolean _localVariable_0 = _this.isParamListEqual(mDef, mSig);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_8_9_ActivityNode20_blackBB(MMethodDefinition mDef,
			MMethodSignature mSig) {
		return new Object[] { mDef, mSig };
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_8_9_ActivityNode20_greenBB(MMethodDefinition mDef,
			MMethodSignature mSig) {
		mSig.getMMethodDefinitions().add(mDef);
		mSig.getMDefinitions().add(mDef);
		return new Object[] { mDef, mSig };
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_8_10_ActivityNode24_blackFB(MMethodDefinition mDef) {
		MMethodSignature mOldSig = mDef.getMMethodSignature();
		if (mOldSig != null) {
			return new Object[] { mOldSig, mDef };
		}

		return null;
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_8_11_ActivityNode18_blackBBBB(MMethodName mName,
			MMethodDefinition mDef, Type mSigType, MGravityModel model) {
		return new Object[] { mName, mDef, mSigType, model };
	}

	private static final Object[] pattern_MoDiscoTGGPreprocessing_8_11_ActivityNode18_greenBBBFB(MMethodName mName,
			MMethodDefinition mDef, Type mSigType, MGravityModel model) {
		MMethodSignature mNewSig = ModiscoFactory.eINSTANCE.createMMethodSignature();
		mName.getMSignatures().add(mNewSig);
		mNewSig.setMMethodName(mName);
		mNewSig.getMMethodDefinitions().add(mDef);
		mNewSig.setModel(model);
		mNewSig.setReturnType(mSigType);
		mNewSig.getMDefinitions().add(mDef);
		return new Object[] { mName, mDef, mSigType, mNewSig, model };
	}

	private static final boolean pattern_MoDiscoTGGPreprocessing_8_12_ActivityNode21_expressionFBBB(
			MoDiscoTGGPreprocessingImpl _this, MMethodDefinition mDef, MMethodSignature mNewSig) {
		boolean _localVariable_0 = _this.createParamList(mDef, mNewSig);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	// <-- [user code injected with eMoflon]
	private boolean isParamListEqual(EList<SingleVariableDeclaration> parameters1,
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
		MoDiscoTGGPreprocessingImpl preprocessing = new MoDiscoTGGPreprocessingImpl();
		preprocessing.fixStaticMethodCallOnField(model);
		if (!preprocessing.preprocess(model)) {
			return false;
		}
		TreeIterator<EObject> iterator = model.eResource().getAllContents();
		while (iterator.hasNext()) {
			EObject next = iterator.next();
			if (next instanceof AnonymousClassDeclaration) {
				model.getAnonymousClassDeclarations().add((AnonymousClassDeclaration) next);
			} else if (next instanceof TypeParameter) {
				model.getTypeParameters().add((TypeParameter) next);
			} else if (next instanceof Annotation) {
				EObject eObject = next.eContainer();
				((MAnnotation) next).setMRelevant(!(eObject instanceof VariableDeclarationStatement
						|| eObject instanceof SingleVariableDeclaration));
			}
			if (progressMonitor.isCanceled()) {
				return false;
			}
		}
		
		new SyntethicMethodsPreprocessor().addSyntethicMethods(model);
		new StaticTypePreprocessor(model).addStaticTypeAccesses();
		
		return true;
	}
}