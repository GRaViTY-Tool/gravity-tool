package org.gravity.typegraph.spl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.DefaultWorkingCopyOwner;
import org.eclipse.core.resources.IFile;
import org.gravity.eclipse.java.spl.ElementPosition;
import org.gravity.eclipse.java.spl.JavaProjectSplDiscoverer;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TConstructor;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TParameter;
import org.gravity.typegraph.basic.annotations.TAnnotatable;

public class TypeProcessor {

	private static final String ENUM = "%ENUM%";

	private static final Logger LOGGER = Logger.getLogger(TypeProcessor.class);

	private HashMap<TAbstractType, ElementPosition<TAnnotatable>> allClassifierPositions;
	private JavaProjectSplDiscoverer<TAnnotatable> discoverer;
	private TAbstractType tType;

	
	public TypeProcessor(TAbstractType tType, IJavaProject javaProject) throws IOException, CoreException {
		this.allClassifierPositions = new HashMap<>();
		this.tType = tType;
		String fullyQualifiedName = tType.getPackage().getFullyQualifiedName();
		String prefix = "(default package)";
		if (fullyQualifiedName.startsWith(prefix)) {
			fullyQualifiedName = fullyQualifiedName.substring(prefix.length());
		}
		IType eclipseType;
		try {
			eclipseType = javaProject.findType(fullyQualifiedName, tType.getTName(), DefaultWorkingCopyOwner.PRIMARY, null);
		} catch (JavaModelException e) {
			LOGGER.error(e);
			return;
		}
		try (InputStream stream = ((IFile) eclipseType.getResource())
				.getContents()) {
			discoverer = new JavaProjectSplDiscoverer<>(stream, fullyQualifiedName);
		}
	}
	
	public void process() {
		HashMap<ElementPosition<TAnnotatable>, Set<String>> pcs = getPCsOfTypeAndOwnedTypes(tType);
		if (pcs == null || pcs.isEmpty()) {
			return;
		}

		for (Entry<ElementPosition<TAnnotatable>, Set<String>> element : pcs.entrySet()) {
			Set<String> conditions = element.getValue();
			if (!conditions.isEmpty()) {
				TPresenceCondition pc = SplFactory.eINSTANCE.createTPresenceCondition();
				pc.setPc(conditions.stream().collect(Collectors.joining(") and (", "(", ")")));
				pc.setTAnnotated(element.getKey().getElement());
			}
		}

	}

	/**
	 * Gets the PC of the given member without PC on surrounding elements
	 * 
	 * @param tMember         The given member
	 * @param tMemberPosition The position of the given member
	 * @param pcs             All PCs discovered before
	 * 
	 * @return true iff the PC could be discovered
	 */
	private boolean getRelevantPCs(TMember tMember, ElementPosition<TAnnotatable> tMemberPosition,
			HashMap<ElementPosition<TAnnotatable>, Set<String>> pcs) {
		if (!tMember.equals(tMemberPosition.getElement())) {
			return false;
		}
		Set<String> annotations = discoverer.getSurroundingAntennaAnnotations(tMemberPosition);
		TAbstractType outer = tMember.getDefinedBy();
		while (outer != null) {
			ElementPosition<TAnnotatable> outerPosition = allClassifierPositions.get(outer);
			if (outerPosition != null) {
				annotations.removeAll(pcs.get(outerPosition));
			}
			outer = outer.getOuterType();
		}
		pcs.put(tMemberPosition, annotations);
		return true;
	}

	/**
	 * Calculates the position of a field in the discovered file
	 * 
	 * @param tFieldDefinintion the field
	 * @param methodPositions   the positions of all methods declared in the same
	 *                          type as the field
	 * @return the position of the field in the file
	 */
	private ElementPosition<TAnnotatable> getPosition(TFieldDefinition tFieldDefinintion,
			Set<ElementPosition<TAnnotatable>> methodPositions) {
		TFieldSignature signature = tFieldDefinintion.getSignature();
		Collection<ElementPosition<TAnnotatable>> tFieldPositions = discoverer.getAttributePosition(
				signature.getField().getTName(), signature.getType().getTName().replace(ENUM, ""), tFieldDefinintion);

		List<ElementPosition<TAnnotatable>> relevantFieldPositions = new LinkedList<>();
		for (ElementPosition<TAnnotatable> fieldPosition : tFieldPositions) {
			if (ownedByExpectedOwner(tFieldDefinintion.getDefinedBy(), fieldPosition)) {
				boolean relevant = true;
				for (ElementPosition<TAnnotatable> methodPosition : methodPositions) {
					if (fieldPosition.insideOf(methodPosition)) {
						relevant = false;
						break;
					}
				}
				if (relevant) {
					relevantFieldPositions.add(fieldPosition);
				}
			}
		}
		return getRelevantPosition(tFieldDefinintion, relevantFieldPositions);
	}

	/**
	 * Calculates the position of a method in the discovered file
	 * 
	 * @param tMethodDefinition The method
	 * @return the position of the method in the file
	 */
	private ElementPosition<TAnnotatable> getPosition(TMethodDefinition tMethodDefinition) {
		TAbstractType tDefiningType = tMethodDefinition.getDefinedBy();
		TMethodSignature method = tMethodDefinition.getSignature();
		List<String> paramNames = new LinkedList<>();
		List<String> paramTypes = new LinkedList<>();
		TParameter param = method.getFirstParameter();
		while (param != null) {
			paramNames.add("\\w+");
			TAbstractType paramType = param.getType();
			paramTypes.add(paramType.getTName().replace(ENUM, ""));
			param = param.getNext();
		}
		String tName = method.getMethod().getTName();
		String returnTypeName;
		if (TConstructor.isConstructor(tMethodDefinition)) {
			returnTypeName = "(?<!new)";
		} else {
			TAbstractType returnType = tMethodDefinition.getReturnType();
			returnTypeName = returnType.getTName().replace(ENUM, "");
		}
		Collection<ElementPosition<TAnnotatable>> tMethodPositons = discoverer.getOperationPosition(tName, paramNames,
				paramTypes, returnTypeName, tMethodDefinition);
		if (tMethodPositons.isEmpty()) {
			if (TConstructor.isConstructor(tMethodDefinition) && paramTypes.isEmpty()) {
				LOGGER.log(Level.WARN, "Returned null for constructor \"" + tMethodDefinition.getSignatureString()
						+ "\" as it is probably the default constructor");
				return null;
			}
			throw new IllegalStateException(
					"Didn't found the position of the method \"" + tMethodDefinition.getSignatureString() + "\"");
		}
		List<ElementPosition<TAnnotatable>> positions = new LinkedList<>();
		Iterator<ElementPosition<TAnnotatable>> iterator = tMethodPositons.iterator();
		while (iterator.hasNext()) {
			ElementPosition<TAnnotatable> element = iterator.next();
			boolean relevant = ownedByExpectedOwner(tDefiningType, element);
			if (relevant) {
				positions.add(element);
			}

		}
		return getRelevantPosition(tMethodDefinition, positions);
	}

	/**
	 * Searches the position of the member if it has been defined multiple times in
	 * a class
	 * 
	 * @param member    The member whose position is required
	 * @param positions The list of possible positions of the member
	 * @return The position of the member
	 */
	private ElementPosition<TAnnotatable> getRelevantPosition(TMember member,
			List<ElementPosition<TAnnotatable>> positions) {
		if (positions.size() != 1) {
			TAbstractType owner = member.getDefinedBy();
			String signature = member.getSignatureString();
			LinkedList<TMember> definitions = new LinkedList<>();
			for (TMember tDefinition : owner.getDefines()) {
				if (signature.equals(tDefinition.getSignatureString())) {
					definitions.add(tDefinition);
				}
			}
			if (definitions.size() != positions.size()) {
				return null;
			}
			return positions.get(definitions.indexOf(member));
		}

		return positions.get(0);
	}

	/**
	 * Searches all PCs of the given type and its owned types
	 * 
	 * @param tType the given type
	 * @return a mapping between the types and their PCs
	 */
	private HashMap<ElementPosition<TAnnotatable>, Set<String>> getPCsOfTypeAndOwnedTypes(TAbstractType tType) {
		HashMap<ElementPosition<TAnnotatable>, Set<String>> allPcs = new HashMap<>();

		Deque<TAbstractType> stack = new LinkedList<>();
		stack.add(tType);
		while (!stack.isEmpty()) {
			TAbstractType next = stack.pop();
			stack.addAll(next.getInnerTypes());
			if (!next.isDeclared()) {
				continue;
			}
			String tName = next.getTName().replace(ENUM, "");
			ElementPosition<TAnnotatable> classifierPosition = discoverer.getClassifierPosition(tName, next);
			Set<String> classifierAnnotations = new HashSet<>(
					discoverer.getSurroundingAntennaAnnotations(classifierPosition));
			TAbstractType outer = next.getOuterType();
			while (outer != null) {
				ElementPosition<TAnnotatable> outerPosition = allClassifierPositions.get(outer);
				if (outerPosition != null) {
					Set<String> pcs = allPcs.get(outerPosition);
					classifierAnnotations.removeAll(pcs);
				}
				outer = outer.getOuterType();
			}
			allClassifierPositions.put(next, classifierPosition);
			allPcs.put(classifierPosition, classifierAnnotations);
		}

		return getPCsOfMembers(allPcs);
	}

	/**
	 * Calculates the presence conditions of all members owned by the types stored
	 * in the field allClassifierPositions
	 * 
	 * @param pcs The pcs of the types contained in allClassifierPositions
	 * @return the hashtable pcs now also containing the pcs of all members or null
	 *         if an error occurred
	 */
	private HashMap<ElementPosition<TAnnotatable>, Set<String>> getPCsOfMembers(
			HashMap<ElementPosition<TAnnotatable>, Set<String>> pcs) {
		for (TAbstractType entry : allClassifierPositions.keySet()) {
			Set<ElementPosition<TAnnotatable>> methodPositions = new HashSet<>();
			Set<TFieldDefinition> fields = new HashSet<>();

			for (TMember tMember : entry.getDefines()) {
				if (tMember instanceof TMethodDefinition) {
					ElementPosition<TAnnotatable> position = getPosition((TMethodDefinition) tMember);
					if (position == null) {
						if (TConstructor.isConstructor(tMember)
								&& ((TMethodDefinition) tMember).getSignature().getParameters().isEmpty()) {
							continue;
						}
						LOGGER.log(Level.ERROR,
								"Couldn't get the position of the method \"" + tMember.getSignatureString() + "\"!");
						return null;
					}
					methodPositions.add(position);

					if (!getRelevantPCs(tMember, position, pcs)) {
						return null;
					}
				} else if (tMember instanceof TFieldDefinition) {
					fields.add((TFieldDefinition) tMember);
				}
			}

			for (TFieldDefinition field : fields) {
				ElementPosition<TAnnotatable> position = getPosition(field, methodPositions);

				if (!getRelevantPCs(field, position, pcs)) {
					return null;
				}
			}
		}

		return pcs;
	}

	/**
	 * Checks if the ownedElement is inside of the expected owner and not inside of
	 * any subclass of the expected owning class
	 * 
	 * @param expectedOwner The expected owner of the owned element
	 * @param ownedElement  The owned element
	 * @return true if the member is directly owned by the expected owner, false
	 *         otherwise
	 */
	private boolean ownedByExpectedOwner(TAbstractType expectedOwner, ElementPosition<TAnnotatable> ownedElement) {
		boolean relevant = ownedElement.insideOf(allClassifierPositions.get(expectedOwner));
		if (!relevant) {
			return false;
		}
		Deque<TAbstractType> innerclasses = new LinkedList<>();
		innerclasses.addAll(expectedOwner.getInnerTypes());
		while (!innerclasses.isEmpty()) {
			TAbstractType innerType = innerclasses.pop();
			innerclasses.addAll(innerType.getInnerTypes());
			if (innerType.isDeclared() && ownedElement.insideOf(allClassifierPositions.get(innerType))) {
				relevant = false;
				break;
			}
		}
		return relevant;
	}
}
