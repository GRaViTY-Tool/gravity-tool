package org.gravity.tgg.modisco.processing.pg;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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

public class ProgramGraphProcessorFWD implements IProgramGraphProcessor {

	private static final List<String> objectMethods = Arrays.asList("clone():void", "equals(Object):boolean",
			"finalize():void", "getClass():Class", "hashCode():int", "notify():void", "notifyAll():void",
			"toString():String", "wait():void", "wait(long):void", "wait(long,int):void");

	@Override
	public boolean process(TypeGraph pg, IProgressMonitor monitor) {
		createMissingOverrideEdges(pg);
		return true;
	}

	private static void createMissingOverrideEdges(TypeGraph pg) {
		for (final TClass tClass : pg.getClasses()) {
			final Map<String, TMethodDefinition> signatures = new HashMap<>();
			for (final TMethodDefinition tMethodDefinition : tClass.getDeclaredTMethodDefinitions()) {
				if (tMethodDefinition.getOverriding() == null) {
					signatures.put(tMethodDefinition.getSignatureString(), tMethodDefinition);
				}
			}

			final Deque<TAbstractType> parents = new LinkedList<>();
			addParentsToStack(tClass, parents);

			final TClass tObject = pg.getClass("java.lang.Object");
			int stackInitialSize = parents.size();
			if (parents.contains(tObject)) {
				stackInitialSize--;
			}

			// Search if a parent defines a method which has been overridden
			while (!parents.isEmpty()) {
				final TAbstractType tParent = parents.pop();
				addParentsToStack(tParent, parents);
				for (final String tMethodSignatureString : new ArrayList<>(signatures.keySet())) {
					final TMethodDefinition tMethodDefinition = tParent.getTMethodDefinition(tMethodSignatureString);
					if (tMethodDefinition != null) {
						tMethodDefinition.getOverriddenBy().add(signatures.remove(tMethodSignatureString));
					}
				}
			}

			// Check if a operation defined by java.lang.Object has been overriden
			for (final String tMethodSignatureString : new ArrayList<>(signatures.keySet())) {
				if (objectMethods.contains(tMethodSignatureString)) {
					final TMethodDefinition tMethodDefinition = signatures.remove(tMethodSignatureString);
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
				final Collection<TMethodDefinition> values = signatures.values();
				for (final TMethodDefinition tMethodDefinition : values) {
					for (final TAnnotation tAnnotation : tMethodDefinition.getTAnnotation()) {
						final TAnnotationType tAnnotatiopnType = tAnnotation.getType();
						if (tAnnotatiopnType != null && "Override".equals(tAnnotatiopnType.getTName())) {
							TAbstractType parent = tClass.getParentClass();
							if (parent == null || parent.equals(tObject)) {
								parent = tClass.getImplements().get(0);
							}
							final TMethodDefinition tObjectMethodDefinition = cloneAndAddDefintion(tObject,
									tMethodDefinition);
							tMethodDefinition.setOverriding(tObjectMethodDefinition);
						}
					}
				}
			}
		}
	}

	private static TMethodDefinition cloneAndAddDefintion(TAbstractType tType, TMethodDefinition tMethodDefinition) {
		final TMethodDefinition tObjectMethodDefinition = BasicFactory.eINSTANCE.createTMethodDefinition();
		tMethodDefinition.getSignature().getDefinitions().add(tObjectMethodDefinition);
		tObjectMethodDefinition.setDefinedBy(tType);
		tObjectMethodDefinition.setReturnType(tMethodDefinition.getReturnType());
		final TModifier tObjectModifier = BasicFactory.eINSTANCE.createTModifier();
		tObjectMethodDefinition.setTModifier(tObjectModifier);
		final TModifier tModifier = tMethodDefinition.getTModifier();
		tObjectModifier.setTVisibility(tModifier.getTVisibility());
		tObjectModifier.setIsStatic(tModifier.isIsStatic());
		return tObjectMethodDefinition;
	}

	private static void addParentsToStack(TAbstractType child, Deque<TAbstractType> stack) {
		if (child instanceof TClass) {
			final TClass tClass = (TClass) child;
			final TClass tParentClass = tClass.getParentClass();
			if (tParentClass != null) {
				stack.add(tParentClass);
			}
			stack.addAll(tClass.getImplements());

		} else if (child instanceof TInterface) {
			final TInterface tInterface = (TInterface) child;
			stack.addAll(tInterface.getParentInterfaces());
		} else if (child instanceof TAnnotationType) {
			// Nothing to do for AnnotationTypes
		} else {
			throw new InvalidParameterException();
		}
	}
}
