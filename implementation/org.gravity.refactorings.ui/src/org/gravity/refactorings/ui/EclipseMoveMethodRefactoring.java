package org.gravity.refactorings.ui;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.ILocalVariable;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.eclipse.jdt.core.dom.IVariableBinding;
import org.eclipse.jdt.core.refactoring.IJavaRefactorings;
import org.eclipse.jdt.core.refactoring.descriptors.MoveMethodDescriptor;
import org.eclipse.jdt.internal.corext.refactoring.JavaRefactoringDescriptorUtil;
import org.eclipse.jdt.internal.corext.refactoring.structure.MoveInstanceMethodProcessor;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringCore;
import org.eclipse.ltk.core.refactoring.RefactoringDescriptor;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.MoveRefactoring;
import org.gravity.eclipse.JavaHelper;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TParameter;
import org.gravity.typegraph.basic.TParameterList;

public class EclipseMoveMethodRefactoring {
	
	private Hashtable<String, IType> types;
	private IJavaProject project;
	
	public EclipseMoveMethodRefactoring(IJavaProject project) throws JavaModelException {
		this.project = project;
		this.types = JavaHelper.getTypesForProject(project);
	}
	
	public boolean moveMethod(TClass tSourceClass, TClass tTargetClass, TMethodSignature tMethod,
					IProgressMonitor monitor) throws JavaModelException, IllegalArgumentException {
		if (tSourceClass.isTLib() || tTargetClass.isTLib()) {
			System.err.println("Source or target class is library.");
			return false;
		}

		if (types == null) {
			throw new RuntimeException();
		}

		IType src = types.get(tSourceClass.getFullyQualifiedName());
		IType trg = types.get(tTargetClass.getFullyQualifiedName());

		TParameterList tParamList = tMethod.getParamList();
		String tName = tMethod.getMethod().getTName();
		for (IMethod m : src.getMethods()) {
			if (m.getElementName().equals(tName)) {
				if (m.getNumberOfParameters() == tParamList.getEntries().size()) {
					boolean equal = true;
					TParameter tParam = tParamList.getFirst();
					for (ILocalVariable param : m.getParameters()) {
						if (!(equal = tParam.getType().getFullyQualifiedName()
								.endsWith(Signature.toString(param.getTypeSignature())))) {
							break;
						}
						tParam = tParam.getNext();
					}
					if (equal) {
						System.out.println(m);
						return move2(project, monitor, trg, m);
					} else {
						return false;
					}
				}
			}
		}
		return false;
	}

	@SuppressWarnings("restriction")
	private static boolean move2(IJavaProject project, IProgressMonitor monitor, IType trg, IMethod method) {
		Map<String, String> map = new HashMap<String, String>();
		map.put(JavaRefactoringDescriptorUtil.ATTRIBUTE_INPUT, method.getHandleIdentifier());
		map.put(JavaRefactoringDescriptorUtil.ATTRIBUTE_NAME, method.getElementName());
		map.put("deprecate", "false");
		map.put("remove", "true");
		map.put("inline", "true");
		map.put("getter", "true");
		map.put("setter", "true");
		map.put("targetName", trg.getElementName());
		map.put("targetIndex", "0");

		MoveMethodDescriptor refactoringDescriptor = (MoveMethodDescriptor) RefactoringCore
				.getRefactoringContribution(IJavaRefactorings.MOVE_METHOD)
				.createDescriptor(IJavaRefactorings.MOVE_METHOD, project.getProject().getName(), "move method", "", map,
						RefactoringDescriptor.MULTI_CHANGE);
		RefactoringStatus status = new RefactoringStatus();
		try {
			MoveRefactoring refactoring = (MoveRefactoring) refactoringDescriptor.createRefactoring(status);
			refactoring.checkAllConditions(monitor);
			MoveInstanceMethodProcessor processor = (MoveInstanceMethodProcessor) refactoring.getProcessor();
			boolean detected = false;
			for (IVariableBinding possibleTrg : processor.getPossibleTargets()) {
				String qualifiedName = possibleTrg.getType().getQualifiedName();
				if (trg.getFullyQualifiedName().equals(qualifiedName)) {
					processor.setTarget(possibleTrg);
					detected = true;
					break;
				}
			}
			if (!detected) {
				return false;
			}
			Change change = refactoring.createChange(monitor);
			change.perform(monitor);
			return true;

		} catch (Exception e) {
		}
		return false;
	}
	
	public IJavaProject getJavaProject(){
		return this.project;
	}
}
