package org.gravity.modisco.processing.fwd;

import java.util.Collection;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration;
import org.eclipse.gmt.modisco.java.AbstractMethodInvocation;
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.AbstractVariablesContainer;
import org.eclipse.gmt.modisco.java.Annotation;
import org.eclipse.gmt.modisco.java.Block;
import org.eclipse.gmt.modisco.java.FieldDeclaration;
import org.eclipse.gmt.modisco.java.Javadoc;
import org.eclipse.gmt.modisco.java.Modifier;
import org.eclipse.gmt.modisco.java.SingleVariableAccess;
import org.eclipse.gmt.modisco.java.SingleVariableDeclaration;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.TypeDeclarationStatement;
import org.eclipse.gmt.modisco.java.TypeParameter;
import org.eclipse.gmt.modisco.java.VariableDeclaration;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;
import org.eclipse.gmt.modisco.java.VariableDeclarationStatement;
import org.eclipse.gmt.modisco.java.VisibilityKind;
import org.eclipse.gmt.modisco.java.emf.JavaFactory;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;
import org.gravity.eclipse.util.EMFUtil;
import org.gravity.modisco.GravityMoDiscoFactoryImpl;
import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MAnnotation;
import org.gravity.modisco.MClass;
import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MEntry;
import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MMethodName;
import org.gravity.modisco.MMethodSignature;
import org.gravity.modisco.MName;
import org.gravity.modisco.MParameterList;
import org.gravity.modisco.MSignature;
import org.gravity.modisco.ModiscoFactory;
import org.gravity.modisco.processing.IMoDiscoProcessor;
import org.gravity.modisco.util.MoDiscoUtil;

public class GravityMoDiscoPreprocessing implements IMoDiscoProcessor {

	private static final Logger LOGGER = Logger.getLogger(GravityMoDiscoPreprocessing.class);

	@Override
	public boolean process(MGravityModel model, IProgressMonitor monitor) {
		GravityMoDiscoFactoryImpl factory = (GravityMoDiscoFactoryImpl) JavaFactory.eINSTANCE;
		factory.cleanup();
		model.getMFieldDefinitions().addAll(factory.getFdefs());
		model.getMMethodDefinitions().addAll(factory.getMdefs());
		model.getMConstructorDefinitions().addAll(factory.getCdefs());

		// fixStaticMethodCallOnField(model);
		if (!preprocessMethods(model) || !preprocessAccesses(model) || !preprocessImplementedSignatures(model)) {
			return false;
		}

		LinkedList<EObject> delete = new LinkedList<>();
		TreeIterator<EObject> iterator = model.eResource().getAllContents();
		while (iterator.hasNext()) {
			EObject next = iterator.next();
			if (next instanceof TypeDeclarationStatement) {
				preprocessTypeDeclarationStatement((TypeDeclarationStatement) next);
			} else if (next instanceof TypeParameter) {
				model.getTypeParameters().add((TypeParameter) next);
			} else if (next instanceof Annotation) {
				EObject eObject = next.eContainer();
				((MAnnotation) next).setMRelevant(!(eObject instanceof VariableDeclarationStatement
						|| eObject instanceof SingleVariableDeclaration));
			} else if (next instanceof MMethodDefinition) {
				SyntethicMethodsPreprocessor.addSyntethicMembers((MMethodDefinition) next);
			} else if (next instanceof Modifier) {
				checkModifierVisibility((Modifier) next);
			} else if (next instanceof Javadoc) {
				delete.add(next); // TODO: check if we can remove this
			}
			if (monitor.isCanceled()) {
				return false;
			}
		}
		LOGGER.log(Level.INFO, "Deleting " + delete.size() + " EObjects");
		long start = System.nanoTime();
		EMFUtil.deleteAll(delete, model.eResource());
		LOGGER.log(Level.INFO, "Deletion took " + (System.nanoTime() - start) / 1000 / 1000 + "ms");
		return true;
	}

	/**
	 * Adds implementedBy edge from Classes to Signatures if the classes contain
	 * according definitions
	 * 
	 * @param model The model which should be preprocessed
	 */
	private static boolean preprocessImplementedSignatures(MGravityModel model) {
		Hashtable<MSignature, Collection<AbstractTypeDeclaration>> mapping = new Hashtable<>();
		for (MName mName : model.getMNames()) {
			for (MSignature mSignature : mName.getMSignatures()) {
				List<AbstractTypeDeclaration> implementingTypes = new LinkedList<>();
				for (MDefinition mDefinition : mSignature.getMDefinitions()) {
					AbstractTypeDeclaration mType = mDefinition.getAbstractTypeDeclaration();
					if (mType != null) {
						implementingTypes.add(mType);
					} else {
						EObject eContainer = mDefinition.eContainer();
						if (JavaPackage.eINSTANCE.getAnonymousClassDeclaration().isSuperTypeOf(eContainer.eClass())) {
							// Ignore this case
						} else {
							LOGGER.log(Level.ERROR, "Couldn't preprocess implemented siganture: " + mSignature);
							return false;
						}
					}
				}
				mapping.put(mSignature, implementingTypes);
			}
		}
		for (Entry<MSignature, Collection<AbstractTypeDeclaration>> entry : mapping.entrySet()) {
			entry.getKey().getImplementedBy().addAll(entry.getValue());
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
					continue;
				}
			}
			if (mName != null) {
				mName.getMMethodDefinitions().add(mDef);

			} else {
				mName = ModiscoFactory.eINSTANCE.createMMethodName();
				mName.setModel(model);
				model.getMNames().add(mName);
				mName.getMMethodDefinitions().add(mDef);
				mName.setMName(mDef.getName());
			}

		}
		// Create MMethodSignatures for MMethodNames
		for (MMethodName mName : model.getMMethodNames()) {
			for (MMethodDefinition mDef : mName.getMMethodDefinitions()) {

				Type mSigReturnType = MoDiscoUtil.getMostGenericReturnType(mDef);
				if (mSigReturnType == null) {
					LOGGER.log(Level.ERROR, "Couldn't find most geric return type for method definition:" + mDef + ".");
					return false;
				}
				for (MMethodSignature mSig : mName.getMMethodSignatures()) {
					if (mSigReturnType.equals(mSig.getReturnType())) {
						if (isParamListEqual(mDef, mSig)) {
							mSig.getMMethodDefinitions().add(mDef);
							mSig.getMDefinitions().add(mDef);
							continue;
						}

					}
				}
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

					MoDiscoUtil.fillParamList(mDef, mParams);

				}

			}
		}
		return true;
	}

	private static boolean preprocessAccesses(MGravityModel model) {
		for (MAbstractMethodDefinition def : model.getMAbstractMethodDefinitions()) {
			Block block = def.getBody();
			if (!StatementHandler.handle(block, def)) {
				LOGGER.log(Level.ERROR,
						"Couldn't handle method statement \"" + block + "\" at preprocessing of accesses.");
				return false;
			}
			calculateTypeDependencies(def);
		}
		for (MFieldDefinition def : model.getMFieldDefinitions()) {
			for (VariableDeclarationFragment fragment : def.getFragments()) {
				if (!MiscHandler.handle(fragment, def)) {
					LOGGER.log(Level.ERROR,
							"Couldn't handle field statement \"" + fragment + "\" at preprocessing of accesses.");
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
			for (AbstractMethodInvocation methodInvocation : def.getAbstractMethodInvocations()) {
				AbstractMethodDeclaration method = methodInvocation.getMethod();
				AbstractTypeDeclaration abstractTypeDeclaration = method.getAbstractTypeDeclaration();
				if (abstractTypeDeclaration == null
						&& JavaPackage.eINSTANCE.getUnresolvedMethodDeclaration().isSuperTypeOf(method.eClass())) {
					LOGGER.log(Level.WARN, "Skipped unresolved method: " + method.getName());
					continue;
				}
				deps.add(abstractTypeDeclaration);
			}
			for (SingleVariableAccess methodInvocation : def.getMAbstractFieldAccess()) {
				VariableDeclaration variable = methodInvocation.getVariable();
				if (variable instanceof VariableDeclarationFragment) {
					AbstractVariablesContainer variablesContainer = ((VariableDeclarationFragment) variable)
							.getVariablesContainer();
					if (variablesContainer instanceof FieldDeclaration) {
						deps.add(((FieldDeclaration) variablesContainer).getAbstractTypeDeclaration());
					}
				}
			}
		}
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

	/**
	 * Searches the method in which a type is declared and adds the type to the
	 * inner types of the method
	 * 
	 * @param statement The type declaration statement
	 */
	private void preprocessTypeDeclarationStatement(TypeDeclarationStatement statement) {
		AbstractTypeDeclaration type = statement.getDeclaration();
		EObject eObject = statement.eContainer();
		while (!(eObject instanceof MAbstractMethodDefinition)) {
			eObject = eObject.eContainer();
		}
		((MAbstractMethodDefinition) eObject).getMInnerTypes().add(type);
	}

	/**
	 * Checks if the visibility of a modifier is set and tries to repair it if not
	 * 
	 * @param modifier The modifier
	 * @return true, if there was no problem or the problem has been repaired.
	 */
	private boolean checkModifierVisibility(Modifier modifier) {
		if (modifier.getVisibility() == null) {
			AbstractTypeDeclaration typeDecl = modifier.getBodyDeclaration().getAbstractTypeDeclaration();
			if (typeDecl.eContainer() instanceof TypeDeclarationStatement) {
				modifier.setVisibility(VisibilityKind.PRIVATE);
			} else {
				LOGGER.log(Level.WARN, "Type \"" + typeDecl.getName() + "\" has no visibility.");
				return false;
			}
		}
		return true;
	}

//	private static final void fixStaticMethodCallOnField(MGravityModel model) {
//		for (CompilationUnit cu : model.getCompilationUnits()) {
//			for (AbstractTypeDeclaration tmpClazz : cu.getTypes()) {
//				if (tmpClazz instanceof ClassDeclaration) {
//					ClassDeclaration clazz = (ClassDeclaration) tmpClazz;
//					for (BodyDeclaration tmpMethod : clazz.getBodyDeclarations()) {
//						if (tmpMethod instanceof MethodDeclaration) {
//							MethodDeclaration method = (MethodDeclaration) tmpMethod;
//							Block block = method.getBody();
//							if (block != null) {
//								for (Statement tmpExpression : block.getStatements()) {
//									if (tmpExpression instanceof ExpressionStatement) {
//										ExpressionStatement expression = (ExpressionStatement) tmpExpression;
//										Expression tmpInvoc = expression.getExpression();
//										if (tmpInvoc instanceof MethodInvocation) {
//											MethodInvocation invoc = (MethodInvocation) tmpInvoc;
//											Expression tmpAccess = invoc.getExpression();
//											if (tmpAccess instanceof SingleVariableAccess) {
//												SingleVariableAccess access = (SingleVariableAccess) tmpAccess;
//												AbstractMethodDeclaration tmpCalled = invoc.getMethod();
//												if (tmpCalled instanceof MethodDeclaration) {
//													MethodDeclaration called = (MethodDeclaration) tmpCalled;
//													if (!called.equals(method)) {
//														VariableDeclaration tmpVar = access.getVariable();
//														if (tmpVar instanceof VariableDeclarationFragment) {
//															VariableDeclarationFragment var = (VariableDeclarationFragment) tmpVar;
//															AbstractTypeDeclaration type = called
//																	.getAbstractTypeDeclaration();
//															if (type != null) {
//																if (!clazz.equals(type)) {
//																	AbstractVariablesContainer tmpVarDecl = var
//																			.getVariablesContainer();
//																	if (tmpVarDecl instanceof FieldDeclaration) {
//																		FieldDeclaration varDecl = (FieldDeclaration) tmpVarDecl;
//																		if (varDecl.getType() != null) {
//																			TypeAccess create = JavaFactory.eINSTANCE
//																					.createTypeAccess();
//																			type.getUsagesInTypeAccess().add(create);
//																			varDecl.setType(create);
//																		}
//																	}
//
//																}
//															}
//
//														}
//
//													}
//												}
//
//											}
//
//										}
//
//									}
//								}
//							}
//
//						}
//					}
//				}
//			}
//		}
//	}
//
}
