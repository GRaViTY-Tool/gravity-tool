package org.gravity.tgg.modisco.postprocessing;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Collection;
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
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.annotations.TAnnotationType;

public class MoDiscoTGGPostprocessing {

	private static final List<String> objectMethods = Arrays.asList("clone():void", "equals(Object):boolean",
			"finalize():void", "getClass():Class", "hashCode():int", "notify():void", "notifyAll():void",
			"toString():String", "wait():void", "wait(long):void", "wait(long,int):void");

	public static boolean postprocess(TypeGraph pg, IProgressMonitor monitor) {
		createMissingOverrideEdges(pg);
		return true;
	}

	private static void createMissingOverrideEdges(TypeGraph pg) {
		for (TClass tClass : pg.getDeclaredTClasses()) {
			Hashtable<String, TMethodDefinition> signatures = new Hashtable<String, TMethodDefinition>();
			for (TMethodDefinition tMethodDefinition : tClass.getDeclaredTMethodDefinitions()) {
				if (tMethodDefinition.getOverriding() == null) {
					signatures.put(tMethodDefinition.getSignatureString(), tMethodDefinition);
				}
			}

			Stack<TAbstractType> parents = new Stack<>();
			addParentsToStack(tClass, parents);

			TClass tObject = pg.getClass("java.lang.Object");
			int stackInitialSize = parents.size();
			if (parents.contains(tObject)) {
				stackInitialSize--;
			}

			// Search if a parent defines a method which has been overridden
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

			// Check if a operation defined by java.lang.Object has been overriden
			Enumeration<String> keys = signatures.keys();
			while (keys.hasMoreElements()) {
				String tMethodSignatureString = keys.nextElement();
				if (objectMethods.contains(tMethodSignatureString)) {
					TMethodDefinition tMethodDefinition = signatures.remove(tMethodSignatureString);
					TMethodDefinition tObjectMethodDefinition = tObject.getTMethodDefinition(tMethodSignatureString);
					if (tObjectMethodDefinition == null) {
						tObjectMethodDefinition = cloneAndAddDefintion(tObject, tMethodDefinition);
					}
					tMethodDefinition.setOverriding(tObjectMethodDefinition);
				}
			}

			// If a method has an @Override annotation and only one parent in the
			// inheritance tree we can add an according method definition and overriding
			// edge to this parent
			if (stackInitialSize == 1) {
				Collection<TMethodDefinition> values = signatures.values();
				for (TMethodDefinition tMethodDefinition : values) {
					for (TAnnotation tAnnotation : tMethodDefinition.getTAnnotation()) {
						TAnnotationType tAnnotatiopnType = tAnnotation.getType();
						if (tAnnotatiopnType != null && "Override".equals(tAnnotatiopnType.getTName())) {
							TAbstractType parent = tClass.getParentClass();
							if (parent == null || parent.equals(tObject)) {
								parent = tClass.getImplements().get(0);
							}
							TMethodDefinition tObjectMethodDefinition = cloneAndAddDefintion(tObject,
									tMethodDefinition);
							tMethodDefinition.setOverriding(tObjectMethodDefinition);
						}
					}
				}
			}
		}
	}

	private static TMethodDefinition cloneAndAddDefintion(TAbstractType tType, TMethodDefinition tMethodDefinition) {
		TMethodDefinition tObjectMethodDefinition;
		TModifier tModifier = tMethodDefinition.getTModifier();
		TModifier tObjectModifier = BasicFactory.eINSTANCE.createTModifier();
		tObjectModifier.setTVisibility(tModifier.getTVisibility());
		tObjectModifier.setIsStatic(tModifier.isIsStatic());

		tObjectMethodDefinition = BasicFactory.eINSTANCE.createTMethodDefinition();
		tObjectMethodDefinition.setSignature(tMethodDefinition.getSignature());
		tObjectMethodDefinition.setDefinedBy(tType);
		tObjectMethodDefinition.setReturnType(tMethodDefinition.getReturnType());
		tObjectMethodDefinition.setTModifier(tObjectModifier);
		return tObjectMethodDefinition;
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
