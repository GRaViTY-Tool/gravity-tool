package org.gravity.tgg.modisco.postprocessing;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Stack;

import org.eclipse.core.runtime.IProgressMonitor;
import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TInterface;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TModifier;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.annotations.TAnnotationType;

public class MoDiscoTGGPostprocessing {

	private static final List<String> objectMethods = Arrays.asList("clone():void", "equals(Object):boolean",
			"finalize():void", "getClass():Class", "hashCode():int", "notify():void", "notifyAll():void",
			"toString():String", "wait():void", "wait(long):void", "wait(long,int):void");

	public static boolean postprocess(TypeGraph pg, IProgressMonitor monitor) {
		for (TClass tClass : pg.getDeclaredTClasses()) {
			Hashtable<String, TMethodDefinition> signatures = new Hashtable<String, TMethodDefinition>();
			for (TMethodDefinition tMethodDefinition : tClass.getDeclaredTMethodDefinitions()) {
				if (tMethodDefinition.getOverriding() == null) {
					signatures.put(tMethodDefinition.getSignatureString(), tMethodDefinition);
				}
			}

			Stack<TAbstractType> parents = new Stack<>();
			addParentsToStack(tClass, parents);

			while (!parents.isEmpty()) {
				TAbstractType tParent = parents.pop();
				addParentsToStack(tParent, parents);
				Enumeration<String> keys = signatures.keys();
				while (keys.hasMoreElements()) {
					String tMethodSignatureString = keys.nextElement();
					TMethodDefinition tMethodDefinition = tParent.getTMethodDefinition(tMethodSignatureString);
					if (tMethodDefinition != null) {
						tMethodDefinition.getOverriddenBy().add(signatures.remove(tMethodSignatureString));
					}
				}
			}

			TClass tObject = pg.getClass("java.lang.Object");
			Enumeration<String> keys = signatures.keys();
			while (keys.hasMoreElements()) {
				String tMethodSignatureString = keys.nextElement();
				if (objectMethods.contains(tMethodSignatureString)) {
					TMethodDefinition tMethodDefinition = signatures.remove(tMethodSignatureString);
					TMethodDefinition tObjectMethodDefinition = tObject.getTMethodDefinition(tMethodSignatureString);
					if (tObjectMethodDefinition == null) {
						TModifier tModifier = tMethodDefinition.getTModifier();
						TModifier tObjectModifier = BasicFactory.eINSTANCE.createTModifier();
						tObjectModifier.setTVisibility(tModifier.getTVisibility());
						tObjectModifier.setIsStatic(tModifier.isIsStatic());
						
						tObjectMethodDefinition = BasicFactory.eINSTANCE.createTMethodDefinition();
						tObjectMethodDefinition.setSignature(tMethodDefinition.getSignature());
						tObjectMethodDefinition.setDefinedBy(tObject);
						tObjectMethodDefinition.setReturnType(tMethodDefinition.getReturnType());
						tObjectMethodDefinition.setTModifier(tObjectModifier);
					}
					tMethodDefinition.setOverriding(tObjectMethodDefinition);
				}
			}
		}
		return true;
	}

	private static void addParentsToStack(TAbstractType child, Stack<TAbstractType> stack) {
		if (child instanceof TClass) {
			TClass tClass = (TClass) child;
			TClass tParentClass = tClass.getParentClass();
			if (tParentClass != null) {
				stack.add(tParentClass);
			}
			stack.addAll(tClass.getImplements());

		} else if (child instanceof TInterface) {
			TInterface tInterface = (TInterface) child;
			stack.addAll(tInterface.getParentInterfaces());
		} else if (child instanceof TAnnotationType) {
			// TAnnotationType tAnnotationType = (TAnnotationType) child;
			// Nothing to do for AnnotationTypes
		} else {
			throw new InvalidParameterException();
		}
	}
}
