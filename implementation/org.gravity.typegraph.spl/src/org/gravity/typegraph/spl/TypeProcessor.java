package org.gravity.typegraph.spl;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.DefaultWorkingCopyOwner;
import org.gravity.eclipse.java.spl.ElementPosition;
import org.gravity.eclipse.java.spl.JavaProjectSplDiscoverer;
import org.gravity.typegraph.basic.BasicPackage;
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

	private static final Logger LOGGER = Logger.getLogger(TypeProcessor.class);

	private HashMap<TAbstractType, ElementPosition<TAnnotatable>> allClassifierPositions;
	private JavaProjectSplDiscoverer<TAnnotatable> discoverer;
	private TAbstractType tType;

	public TypeProcessor(final TAbstractType tType, final IJavaProject javaProject) throws IOException, CoreException {
		this.allClassifierPositions = new HashMap<>();
		this.tType = tType;
		String fullyQualifiedName = tType.getPackage().getFullyQualifiedName();
		final String prefix = "(default package)";
		if (fullyQualifiedName.startsWith(prefix)) {
			fullyQualifiedName = fullyQualifiedName.substring(prefix.length());
		}
		IType eclipseType;
		try {
			eclipseType = javaProject.findType(fullyQualifiedName, tType.getTName(), DefaultWorkingCopyOwner.PRIMARY,
					null);
		} catch (final JavaModelException e) {
			LOGGER.error(e);
			return;
		}
		if (eclipseType.isBinary()) {
			LOGGER.error("Cannot process binary type");
			return;
		}
		try (InputStream stream = ((IFile) eclipseType.getResource()).getContents()) {
			this.discoverer = new JavaProjectSplDiscoverer<>(stream, tType.getFullyQualifiedName());
		}
	}

	public void process() {
		if ((this.discoverer == null) || !this.discoverer.hasAntennaAnnotations()) {
			return;
		}
		final HashMap<ElementPosition<TAnnotatable>, Set<String>> pcs = getPCsOfTypeAndOwnedTypes(this.tType);
		if ((pcs == null) || pcs.isEmpty()) {
			return;
		}

		for (final Entry<ElementPosition<TAnnotatable>, Set<String>> element : pcs.entrySet()) {
			final Set<String> conditions = element.getValue();
			if (!conditions.isEmpty()) {
				final TPresenceCondition pc = SplFactory.eINSTANCE.createTPresenceCondition();
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
	private boolean getRelevantPCs(final TMember tMember, final ElementPosition<TAnnotatable> tMemberPosition,
			final HashMap<ElementPosition<TAnnotatable>, Set<String>> pcs) {
		if (!tMember.equals(tMemberPosition.getElement())) {
			return false;
		}
		final Set<String> annotations = this.discoverer.getSurroundingAntennaAnnotations(tMemberPosition);
		TAbstractType outer = tMember.getDefinedBy();
		while (outer != null) {
			final ElementPosition<TAnnotatable> outerPosition = this.allClassifierPositions.get(outer);
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
	private ElementPosition<TAnnotatable> getPosition(final TFieldDefinition tFieldDefinintion,
			final Set<ElementPosition<TAnnotatable>> methodPositions) {
		final TFieldSignature signature = tFieldDefinintion.getSignature();
		final Collection<ElementPosition<TAnnotatable>> tFieldPositions = this.discoverer.getAttributePosition(
				signature.getField().getTName(), signature.getType().getTName(), tFieldDefinintion);

		final List<ElementPosition<TAnnotatable>> relevantFieldPositions = new LinkedList<>();
		for (final ElementPosition<TAnnotatable> fieldPosition : tFieldPositions) {
			if (ownedByExpectedOwner(tFieldDefinintion.getDefinedBy(), fieldPosition)) {
				boolean relevant = true;
				for (final ElementPosition<TAnnotatable> methodPosition : methodPositions) {
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
	private ElementPosition<TAnnotatable> getPosition(final TMethodDefinition tMethodDefinition) {
		final TAbstractType tDefiningType = tMethodDefinition.getDefinedBy();
		final TMethodSignature methodSignature = tMethodDefinition.getSignature();
		final List<String> paramNames = new ArrayList<>();
		final List<String> paramTypes = new ArrayList<>();
		final List<Boolean> paramsAreArrays = new ArrayList<>();
		TParameter param = methodSignature.getFirstParameter();
		while (param != null) {
			paramNames.add(JavaProjectSplDiscoverer.REGEX_VARIABLE_NAME);
			final TAbstractType paramType = param.getType();
			paramTypes.add(paramType.getTName());
			paramsAreArrays.add(param.getUpperBound() != 1);
			param = param.getNext();
		}
		final String tName = methodSignature.getMethod().getTName();
		String returnTypeName;
		if (TConstructor.isConstructor(tMethodDefinition)) {
			returnTypeName = null; //"(?<!new)";
		} else {
			final TAbstractType returnType = tMethodDefinition.getReturnType();
			returnTypeName = returnType.getTName();
			if(tMethodDefinition.getUpperBound() == -1) {
				returnTypeName += "\\s*?(\\[.*?\\])";
			}
		}
		final Collection<ElementPosition<TAnnotatable>> tMethodPositons = this.discoverer.getOperationPosition(tName,
				paramNames, paramTypes, paramsAreArrays, returnTypeName, tMethodDefinition);
		if (tMethodPositons.isEmpty()) {
			if (TConstructor.isConstructor(tMethodDefinition) && paramTypes.isEmpty()) {
				LOGGER.log(Level.WARN, "Returned null for constructor \"" + tMethodDefinition.getSignatureString()
				+ "\" as it is probably the default constructor");
				return null;
			}
			throw new IllegalStateException(
					"Didn't found the position of the method \"" + tMethodDefinition.getSignatureString() + "\"");
		}
		final List<ElementPosition<TAnnotatable>> positions = new LinkedList<>();
		final Iterator<ElementPosition<TAnnotatable>> iterator = tMethodPositons.iterator();
		while (iterator.hasNext()) {
			final ElementPosition<TAnnotatable> element = iterator.next();
			final boolean relevant = ownedByExpectedOwner(tDefiningType, element);
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
	private ElementPosition<TAnnotatable> getRelevantPosition(final TMember member,
			final List<ElementPosition<TAnnotatable>> positions) {
		if (positions.size() != 1) {
			final TAbstractType owner = member.getDefinedBy();
			final String signature = member.getSignatureString();
			final LinkedList<TMember> definitions = new LinkedList<>();
			for (final TMember tDefinition : owner.getDefines()) {
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
	private HashMap<ElementPosition<TAnnotatable>, Set<String>> getPCsOfTypeAndOwnedTypes(final TAbstractType tType) {
		final HashMap<ElementPosition<TAnnotatable>, Set<String>> allPcs = new HashMap<>();

		final Deque<TAbstractType> stack = new LinkedList<>();
		stack.add(tType);
		while (!stack.isEmpty()) {
			final TAbstractType next = stack.pop();
			stack.addAll(next.getInnerTypes());
			if (!next.isDeclared()) {
				continue;
			}
			final String tName = next.getTName();
			final ElementPosition<TAnnotatable> classifierPosition = this.discoverer.getClassifierPosition(tName, next);
			final Set<String> classifierAnnotations = new HashSet<>(
					this.discoverer.getSurroundingAntennaAnnotations(classifierPosition));
			TAbstractType outer = next.getOuterType();
			while (outer != null) {
				final ElementPosition<TAnnotatable> outerPosition = this.allClassifierPositions.get(outer);
				if (outerPosition != null) {
					final Set<String> pcs = allPcs.get(outerPosition);
					classifierAnnotations.removeAll(pcs);
				}
				outer = outer.getOuterType();
			}
			this.allClassifierPositions.put(next, classifierPosition);
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
			final HashMap<ElementPosition<TAnnotatable>, Set<String>> pcs) {
		for (final TAbstractType entry : this.allClassifierPositions.keySet()) {
			final Set<ElementPosition<TAnnotatable>> methodPositions = new HashSet<>();
			final Set<TFieldDefinition> fields = new HashSet<>();

			for (final TMember tMember : entry.getDefines()) {
				if (tMember instanceof TMethodDefinition) {
					final TMethodSignature signature = (TMethodSignature) tMember.getSignature();
					if (!tMember.getDefinedBy().getTAnnotation(BasicPackage.eINSTANCE.getTEnum()).isEmpty()) {
						if ((signature.getParameters().isEmpty() && "values".equals(signature.getMethod().getTName()))
								|| ("valueOf".equals(signature.getMethod().getTName())
										&& (signature.getParameters().size() == 1)
										&& "String".equals(signature.getFirstParameter().getType().getTName()))) {
							// Skip the default values() and valueOf(String) methods of enumerations
							continue;
						}
					}
					final ElementPosition<TAnnotatable> position = getPosition((TMethodDefinition) tMember);
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

			for (final TFieldDefinition field : fields) {
				final ElementPosition<TAnnotatable> position = getPosition(field, methodPositions);

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
	private boolean ownedByExpectedOwner(final TAbstractType expectedOwner,
			final ElementPosition<TAnnotatable> ownedElement) {
		boolean relevant = ownedElement.insideOf(this.allClassifierPositions.get(expectedOwner));
		if (!relevant) {
			return false;
		}
		final Deque<TAbstractType> innerclasses = new LinkedList<>(expectedOwner.getInnerTypes());
		while (!innerclasses.isEmpty()) {
			final TAbstractType innerType = innerclasses.pop();
			innerclasses.addAll(innerType.getInnerTypes());
			if (innerType.isDeclared() && ownedElement.insideOf(this.allClassifierPositions.get(innerType))) {
				relevant = false;
				break;
			}
		}
		return relevant;
	}
}
