package org.gravity.typegraph.basic.compare;

import java.util.Hashtable;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TAnnotation;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TField;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TInterface;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TParameter;
import org.gravity.typegraph.basic.TParameterList;
import org.gravity.typegraph.basic.TypeGraph;

public class PGComparator {

	private boolean ordered;

	public PGComparator(boolean ordered) {
		this.ordered = ordered;
	}

	private Hashtable<EObject, EObject> compared = new Hashtable<>();

	public <T> boolean compare(T elementA, T elementB, boolean print) throws UnsupportetElementException {

		if (elementA == null) {
			if (elementB == null) {
				return true;
			}
			return false;
		}

		if (elementB == null) {
			return false;
		}

		if (!elementA.getClass().equals(elementB.getClass())) {
			return false;
		}

		if (this.compared.containsKey(elementA)) {
			return this.compared.get(elementA).equals(elementB);
		}

		if (elementA instanceof TypeGraph) {
			TypeGraph a = (TypeGraph) elementA;
			TypeGraph b = (TypeGraph) elementB;
			return compare(a, b, print);
		} else if (elementA instanceof TPackage) {
			TPackage a = (TPackage) elementA;
			TPackage b = (TPackage) elementB;
			return compare(a, b, print);

		} else if (elementA instanceof TClass) {
			TClass a = (TClass) elementA;
			TClass b = (TClass) elementB;
			return compare(a, b, print);

		} else if (elementA instanceof TInterface) {
			TInterface a = (TInterface) elementA;
			TInterface b = (TInterface) elementB;
			return compare(a, b, print);

		} else if (elementA instanceof TField) {
			TField a = (TField) elementA;
			TField b = (TField) elementB;
			return compare(a, b, print);

		} else if (elementA instanceof TFieldSignature) {
			TFieldSignature a = (TFieldSignature) elementA;
			TFieldSignature b = (TFieldSignature) elementB;
			return compare(a, b, print);

		} else if (elementA instanceof TFieldDefinition) {
			TFieldDefinition a = (TFieldDefinition) elementA;
			TFieldDefinition b = (TFieldDefinition) elementB;
			return compare(a, b, print);

		} else if (elementA instanceof TMethod) {
			TMethod a = (TMethod) elementA;
			TMethod b = (TMethod) elementB;
			return compare(a, b, print);

		} else if (elementA instanceof TMethodSignature) {
			TMethodSignature a = (TMethodSignature) elementA;
			TMethodSignature b = (TMethodSignature) elementB;
			return compare(a, b, print);

		} else if (elementA instanceof TParameterList) {
			TParameterList a = (TParameterList) elementA;
			TParameterList b = (TParameterList) elementB;
			return compare(a, b, print);

		} else if (elementA instanceof TParameter) {
			TParameter a = (TParameter) elementA;
			TParameter b = (TParameter) elementB;
			return compare(a, b, print);

		} else if (elementA instanceof TMethodDefinition) {
			TMethodDefinition a = (TMethodDefinition) elementA;
			TMethodDefinition b = (TMethodDefinition) elementB;
			return compare(a, b, print);

		} else if (elementA instanceof TAccess) {
			TAccess a = (TAccess) elementA;
			TAccess b = (TAccess) elementB;
			return compare(a, b, print);

		} else if (elementA instanceof TAnnotation) {
			TAnnotation a = (TAnnotation) elementA;
			TAnnotation b = (TAnnotation) elementB;
			return compare(a, b, print);

		} else if (elementA instanceof EList<?>) {
			EList<?> a = (EList<?>) elementA;
			EList<?> b = (EList<?>) elementB;

			if (this.ordered) {
				return compareOrdered(a, b, print);
			}
			return compareUnordered(a, b, print);

		}

		throw new UnsupportetElementException(elementA.getClass());
	}

	private boolean compare(TField a, TField b, boolean print) throws UnsupportetElementException {
		if (a == null) {
			if (b == null) {
				return true;
			}
			return false;
		}

		if (b == null) {
			return false;
		}

		if (this.compared.containsKey(a)) {
			return this.compared.get(a).equals(b);
		}
		this.compared.put(a, b);

		if (a.getTName().equals(b.getTName())) {
			if (compare(a.getPg(), b.getPg(), print)) {
				if (compare(a.getSignatures(), b.getSignatures(), print)) {
					return true;
				} else {
					if (print)
						System.out.println(a + ": The signatures doesn't match");
				}
			} else {
				if (print)
					System.out.println(a + ": The TypeGraph containers doesn't match");
			}
		} else {
			if (print)
				System.out.println(a + ": The fields have different names");
		}
		this.compared.remove(a, b);
		return false;
	}

	private boolean compare(TFieldSignature a, TFieldSignature b, boolean print) throws UnsupportetElementException {
		if (a == null) {
			if (b == null) {
				return true;
			}
			return false;
		}
		if (b == null) {
			return false;
		}

		if (this.compared.containsKey(a)) {
			return this.compared.get(a).equals(b);
		}
		this.compared.put(a, b);

		if (compare(a.getField(), b.getField(), print)) {
			if (compare(a.getType(), b.getType(), print)) {
				try {
					if (compare(a.getDefinitions(), b.getDefinitions(), print)) {
						if (compare(a.getTAnnotation(), b.getTAnnotation(), print)) {
							return true;
						} else {
							if (print)
								System.out.println(a + ": The annotations are different");
						}
					} else {
						if (print)
							System.out.println(a + ": The definitions are different");
					}
				} catch (UnsupportetElementException e) {
					e.printStackTrace();
				}
			} else {
				if (print)
					System.out.println(a + ": The types are different");
			}
		} else {
			if (print)
				System.out.println(a + ": The fields are different");
		}
		this.compared.remove(a, b);
		return false;
	}

	/*
	 * Override this method if TAnnotations have been implemented
	 * 
	 * Currently only a null check and for equal types is performed
	 */
	private boolean compare(TAnnotation a, TAnnotation b) {
		if (a == null) {
			if (b == null) {
				return true;
			}
			return false;
		}
		if (b == null) {
			return false;
		}

		if (this.compared.containsKey(a)) {
			return this.compared.get(a).equals(b);
		}
		return a.getClass().equals(b.getClass());
	}

	private boolean compare(TFieldDefinition a, TFieldDefinition b, boolean print) throws UnsupportetElementException {
		if (a == null) {
			if (b == null) {
				return true;
			}
			return false;
		}
		if (b == null) {
			return false;
		}

		if (this.compared.containsKey(a)) {
			return this.compared.get(a).equals(b);
		}
		this.compared.put(a, b);

		if (compare(a.getSignature(), b.getSignature(), print)) {
			if (compare(a.getHiding(), b.getHiding(), print)) {
				if (compare((TMember) a, (TMember) b, print)) {
					if (compareUnordered(a.getHiddenBy(), b.getHiddenBy(), print)) {
						return true;
					} else {
						if (print)
							System.out.println(a + ": The hiding is different");
					}
				}
			} else {
				if (print)
					System.out.println(a + ": The hidden field definitions are different");
			}
		} else {
			if (print)
				System.out.println(a + ": The signature is different");
		}
		this.compared.remove(a, b);
		return false;
	}

	private boolean compare(TMember a, TMember b, boolean print) throws UnsupportetElementException {
		if (a == null) {
			if (b == null) {
				return true;
			}
			return false;
		}
		if (b == null) {
			return false;
		}

		if (compareUnordered(a.getTAccessing(), b.getTAccessing(), print)) {
			if (compareUnordered(a.getAccessedBy(), b.getAccessedBy(), print)) {
				if (compare(a.getDefinedBy(), b.getDefinedBy(), print)) {
					if (compare(a.getTAnnotation(), b.getTAnnotation(), print)) {
						return true;
					} else {
						if (print)
							System.out.println(a + ": The annotations are different");
					}
				} else {
					if (print)
						System.out.println(a + ": The defining type is different");
				}
			} else {
				if (print)
					System.out.println(a + ": The incomming accesses are different");
			}
		} else {
			if (print)
				System.out.println(a + ": The accesses are different");
		}
		return false;
	}

	private boolean compare(TAccess a, TAccess b, boolean print) throws UnsupportetElementException {
		if (a == null) {
			if (b == null) {
				return true;
			}
			return false;
		}
		if (b == null) {
			return false;
		}

		if (this.compared.containsKey(a)) {
			return this.compared.get(a).equals(b);
		}
		this.compared.put(a, b);

		if (compare(a.getTSource(), b.getTSource(), print)) {
			if (compare(a.getTTarget(), b.getTTarget(), print)) {
				return true;
			} else {
				if (print)
					System.out.println(a + ": The accessed member is different");
			}
		} else {
			if (print)
				System.out.println(a + ": The accessing member is different");
		}
		this.compared.remove(a, b);
		return false;
	}

	private boolean resolveAndCompare(TAbstractType a, TAbstractType b, boolean print)
			throws UnsupportetElementException {
		if (a == null) {
			if (b == null) {
				return true;
			}
			return false;
		}
		if (b == null) {
			return false;
		}

		if (!a.eClass().equals(b.eClass())) {
			return false;
		}
		if (a instanceof TClass) {
			return compare((TClass) a, (TClass) b, print);
		} else if (a instanceof TInterface) {
			return compare((TInterface) a, (TInterface) b, print);
		}
		return false;
	}

	private boolean compare(TMethod a, TMethod b, boolean print) throws UnsupportetElementException {
		if (a == null) {
			if (b == null) {
				return true;
			}
			return false;
		}
		if (b == null) {
			return false;
		}

		if (this.compared.containsKey(a)) {
			return this.compared.get(a).equals(b);
		}
		this.compared.put(a, b);

		if (a.getTName().equals(b.getTName())) {
			if (compare(a.getPg(), b.getPg(), print)) {
				if (compare(a.getSignatures(), b.getSignatures(), print)) {
					return true;
				} else {
					if (print)
						System.out.println(a + ": The signatures are different");
				}
			} else {
				if (print)
					System.out.println(a + ": The TypeGraph containers are different");
			}
		} else {
			if (print)
				System.out.println(a + ": The names are different");
		}
		this.compared.remove(a, b);
		return false;
	}

	private boolean compare(TMethodSignature a, TMethodSignature b, boolean print) throws UnsupportetElementException {
		if (a == null) {
			if (b == null) {
				return true;
			}
			return false;
		}
		if (b == null) {
			return false;
		}

		if (this.compared.containsKey(a)) {
			return this.compared.get(a).equals(b);
		}
		this.compared.put(a, b);

		if (compare(a.getMethod(), b.getMethod(), print)) {
			if (resolveAndCompare(a.getReturnType(), b.getReturnType(), print)) {
				if (compare(a.getParamList(), b.getParamList(), print)) {
					if (compare(a.getDefinitions(), b.getDefinitions(), print)) {
						if (compare(a.getTAnnotation(), b.getTAnnotation(), print)) {
							return true;
						} else {
							if (print)
								System.out.println(a + ": The annotations are different");
						}
					} else {
						if (print)
							System.out.println(a + ": The definitions are different");
					}
				} else {
					if (print)
						System.out.println(a + ": The parameter lists are different");
				}
			} else {
				if (print)
					System.out.println(a + ": The return types are different");
			}
		} else {
			if (print)
				System.out.println(a + ": The method names are different");
		}
		this.compared.remove(a, b);
		return false;
	}

	private boolean compare(TParameterList a, TParameterList b, boolean print) throws UnsupportetElementException {
		if (a == null) {
			if (b == null) {
				return true;
			}
			return false;
		}
		if (b == null) {
			return false;
		}

		if (this.compared.containsKey(a)) {
			return this.compared.get(a).equals(b);
		}
		this.compared.put(a, b);

		// Order is irrelevant as it is preserved by previous an next edges
		if (compareUnordered(a.getEntries(), b.getEntries(), false)) {
			if (compare(a.getFirst(), b.getFirst(), print)) {
				return true;
			} else {
				if (print)
					System.out.println(a + ": The first parameters are different");
			}
		} else {
			if (print)
				System.out.println(a + ": The parameters are different");
		}
		this.compared.remove(a, b);
		return false;
	}

	private boolean compare(TParameter a, TParameter b, boolean print) throws UnsupportetElementException {
		if (a == null) {
			if (b == null) {
				return true;
			}
			return false;
		}
		if (b == null) {
			return false;
		}

		if (this.compared.containsKey(a)) {
			return this.compared.get(a).equals(b);
		}
		this.compared.put(a, b);

		if (resolveAndCompare(a.getType(), b.getType(), print)) {
			if (compare(a.getNext(), b.getNext(), print)) {
				if (compare(a.getPrevious(), b.getPrevious(), print)) {
					return true;
				} else {
					if (print)
						System.out.println(a + ": The previous parameters are different");
				}
			} else {
				if (print)
					System.out.println(a + ": The next are different");
			}
		} else {
			if (print)
				System.out.println(a + ": The parameter types are different");
		}
		this.compared.remove(a, b);
		return false;
	}

	private boolean compare(TMethodDefinition a, TMethodDefinition b, boolean print)
			throws UnsupportetElementException {
		if (a == null) {
			if (b == null) {
				return true;
			}
			return false;
		}
		if (b == null) {
			return false;
		}

		if (this.compared.containsKey(a)) {
			return this.compared.get(a).equals(b);
		}
		this.compared.put(a, b);

		if (compare(a.getSignature(), b.getSignature(), print)) {
			if (compare(a.getOverriding(), b.getOverriding(), print)) {
				if (compareUnordered(a.getOverriddenBy(), b.getOverriddenBy(), print)) {
					if (compareUnordered(a.getOverloading(), b.getOverloading(), print)) {
						if (compareUnordered(a.getOverloadedBy(), b.getOverloadedBy(), print)) {
							if (compare((TMember) a, (TMember) b, print)) {
								if (compare(a.getReturnType(), b.getReturnType(), print)) {
									if (compare(a.getTAnnotation(), b.getTAnnotation(), print)) {
										return true;
									} else {
										if (print)
											System.out.println(a + ": The annotations are different");
									}
								} else {
									if (print)
										System.out.println(a + ": The return types are different");
								}
							}
						} else {
							if (print)
								System.out.println(a + ": The overloading methods are different");
						}
					} else {
						if (print)
							System.out.println(a + ": The overloaded methods are different");
					}
				} else {
					if (print)
						System.out.println(a + ": The overriding definitions are different");
				}
			} else {
				if (print)
					System.out.println(a + ": The overridden definitions are different");
			}
		} else {
			if (print)
				System.out.println(a + ": The signatures are different");
		}
		this.compared.remove(a, b);
		return false;
	}

	private boolean compare(TInterface a, TInterface b, boolean print) throws UnsupportetElementException {
		if (a == null) {
			if (b == null) {
				return true;
			}
			return false;
		}
		if (b == null) {
			return false;
		}

		if (this.compared.containsKey(a)) {
			return this.compared.get(a).equals(b);
		}
		this.compared.put(a, b);

		if (compare((TAbstractType) a, (TAbstractType) b, print)) {
			if (compareUnordered(a.getParentInterfaces(), b.getParentInterfaces(), print)) {
				if (compare(a.getChildInterfaces(), b.getChildInterfaces(), print)) {
					if (compare(a.getImplementedBy(), b.getImplementedBy(), print)) {
						return true;
					} else {
						if (print)
							System.out.println(a + ": The implementing classes are different");
					}
				} else {
					if (print)
						System.out.println(a + ": The child interfaces are different");
				}
			} else {
				if (print)
					System.out.println(a + ": The parent interfaces are different");
			}
		}
		this.compared.remove(a, b);
		return false;
	}

	private boolean compare(TClass a, TClass b, boolean print) throws UnsupportetElementException {
		if (a == null) {
			if (b == null) {
				return true;
			}
			return false;
		}
		if (b == null) {
			return false;
		}

		if (this.compared.containsKey(a)) {
			return this.compared.get(a).equals(b);
		}
		this.compared.put(a, b);

		if (compare((TAbstractType) a, (TAbstractType) b, print)) {
			if (compare(a.getParentClass(), b.getParentClass(), print)) {
				if (compareUnordered(a.getImplements(), b.getImplements(), print)) {
					if (compareUnordered(a.getChildClasses(), b.getChildClasses(), print)) {
						return true;
					} else {
						if (print)
							System.out.println(a + ": The child classes are different");
					}
				} else {
					if (print)
						System.out.println(a + ": The implemented interfaces are different");
				}
			} else {
				if (print)
					System.out.println(a + ": The parent classes are different");
			}
		}
		this.compared.remove(a, b);
		return false;
	}

	private boolean compareOrdered(EList<?> a, EList<?> b, boolean print) {
		if (a == null) {
			if (b == null) {
				return true;
			}
			return false;
		}
		if (b == null) {
			return false;
		}

		if (a.size() != b.size()) {
			return false;
		}
		for (int i = 0; i < a.size(); i++) {
			try {
				if (!compare(a.get(i), b.get(i), print)) {
					if (print) {
						if (print)
							System.out.println("Lists don't match");
					}
					return false;
				}
			} catch (UnsupportetElementException e) {
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}

	private boolean compareUnordered(EList<?> a, EList<?> b, boolean print) throws UnsupportetElementException {
		if (a == null) {
			if (b == null) {
				return true;
			}
			return false;
		}
		if (b == null) {
			return false;
		}

		int size = a.size();
		if (size != b.size()) {
			if (print) {
				if (print)
					System.out.println("Lists don't have the same size.");
			}
			return false;
		}

		int[] ij = new int[size];
		int[] ji = new int[size];
		for (int k = 0; k < size; k++) {
			ij[k] = -1;
			ji[k] = -1;
		}

		for (int i = 0; i < size; i++) {
			boolean success = false;
			for (int j = 0; j < size; j++) {
				if (ji[j] == -1) {
					Object elementA = a.get(i);
					Object elementB = b.get(j);
					if (compare(elementA, elementB, false)) {
						ij[i] = j;
						ji[j] = i;
						success = true;
						break;
					}
				}
			}
			if (!success) {
				if (print) {
					if (print)
						System.out.println(a.get(i) + " No corresponding entry");
				}
				return false;
			}
		}
		return true;
	}

	private boolean compare(TAbstractType a, TAbstractType b, boolean print) throws UnsupportetElementException {
		if (a == null) {
			if (b == null) {
				return true;
			}
			return false;
		}
		if (b == null) {
			return false;
		}

		if (a.eClass().equals(b.eClass())) {
			if (a.isTLib() == b.isTLib()) {
				if (a.getTName().equals(b.getTName())) {
					if (compare(a.getPackage(), b.getPackage(), print)) {
						if (compare(a.getPg(), b.getPg(), print)) {
							if (compare(a.getSignature(), b.getSignature(), print)) {
								if (compare(a.getDefines(), b.getDefines(), print)) {
									if (compare(a.getTAnnotation(), b.getTAnnotation(), print)) {
										return true;
									} else {
										if (print)
											System.out.println(a + ": The annotations are different");
									}
								} else {
									if (print)
										System.out.println(a + ": The definitions are different");
								}
							} else {
								if (print)
									System.out.println(a + ": The signatures are different");
							}
						} else {
							if (print)
								System.out.println(a + ": The TypeGraph containers are different");
						}
					} else {
						if (print)
							System.out.println(a + ": The packages are different");
					}
				} else {
					if (print)
						System.out.println(a + ": The names are different");
				}
			} else {
				if (print)
					System.out.println(a + ": The library values are different");
			}
		} else {
			if (print)
				System.out.println(a + ": The types are different");
		}
		return false;
	}

	private boolean compare(TPackage a, TPackage b, boolean print) throws UnsupportetElementException {
		if (a == null) {
			if (b == null) {
				return true;
			}
			return false;
		}
		if (b == null) {
			return false;
		}

		if (this.compared.containsKey(a)) {
			return this.compared.get(a).equals(b);
		}
		this.compared.put(a, b);

		if (a.getTName().equals(b.getTName())) {
			if (compare(a.getParent(), b.getParent(), print)) {
				if (compare(a.getTypeGraph(), b.getTypeGraph(), print)) {
					if (compare(a.getClasses(), b.getClasses(), print)) {
						if (compare(a.getInterfaces(), b.getInterfaces(), print)) {
							if (compare(a.getOwnedTypes(), b.getOwnedTypes(), print)) {
								if (compare(a.getSubpackage(), b.getSubpackage(), print)) {
									if (compare(a.getTAnnotation(), b.getTAnnotation(), print)) {
										return true;
									} else {
										if (print)
											System.out.println(a + ": The annotations are different");
									}
								}
							} else {
								if (print)
									System.out.println(a + ": The subpackages are different");
							}
						} else {
							if (print)
								System.out.println(a + ": The interfaces are different");
						}
					} else {
						if (print)
							System.out.println(a + ": The classes are different");
					}
				} else {
					if (print)
						System.out.println(a + ": The TypeGraph containers are different");
				}
			} else {
				if (print)
					System.out.println(a + ": The parent packages are different");
			}
		}
		this.compared.remove(a, b);
		return false;
	}

	private boolean compare(TypeGraph a, TypeGraph b, boolean print) throws UnsupportetElementException {
		if (a == null) {
			if (b == null) {
				return true;
			}
			return false;
		}
		if (b == null) {
			return false;
		}

		if (this.compared.containsKey(a)) {
			return this.compared.get(a).equals(b);
		}
		this.compared.put(a, b);

		if (a.getTName().equals(b.getTName())) {
			if (compareUnordered(a.getPackages(), b.getPackages(), print)) {
				if (compareUnordered(a.getOwnedTypes(), b.getOwnedTypes(), print)) {
					if (compareUnordered(a.getClasses(), b.getClasses(), print)) {
						if (compareUnordered(a.getInterfaces(), b.getInterfaces(), print)) {
							if (compareUnordered(a.getMethods(), b.getMethods(), print)) {
								if (compareUnordered(a.getFields(), b.getFields(), print)) {
									return true;
								} else {
									if (print)
										System.out.println(a + " Fields don't match");
								}
							} else {
								if (print)
									System.out.println(a + ": The defined method names are different");
							}
						} else {
							if (print)
								System.out.println(a + ": The defined interfaces are different");
						}
					} else {
						if (print)
							System.out.println(a + ": The defined classes are different");
					}
				} else {
					if (print)
						System.out.println(a + ": The owned types are different");
				}
			} else {
				if (print)
					System.out.println(a + ": The defined packages are different");
			}
		} else {
			if (print)
				System.out.println(a + ": The names are different");
		}
		this.compared.remove(a, b);
		return false;
	}
}
