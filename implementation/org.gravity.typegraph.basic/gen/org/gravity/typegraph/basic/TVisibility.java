/**
 */
package org.gravity.typegraph.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TVisibility</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.gravity.typegraph.basic.BasicPackage#getTVisibility()
 * @model
 * @generated
 */
public enum TVisibility implements Enumerator {
	/**
	 * The '<em><b>TPrivate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TPRIVATE_VALUE
	 * @generated
	 * @ordered
	 */
	TPRIVATE(0, "TPrivate", "TPrivate"),

	/**
	 * The '<em><b>TPackage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TPACKAGE_VALUE
	 * @generated
	 * @ordered
	 */
	TPACKAGE(1, "TPackage", "TPackage"),

	/**
	 * The '<em><b>TProtected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TPROTECTED_VALUE
	 * @generated
	 * @ordered
	 */
	TPROTECTED(2, "TProtected", "TProtected"),

	/**
	 * The '<em><b>TPublic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TPUBLIC_VALUE
	 * @generated
	 * @ordered
	 */
	TPUBLIC(3, "TPublic", "TPublic");

	/**
	 * The '<em><b>TPrivate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TPrivate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TPRIVATE
	 * @model name="TPrivate"
	 * @generated
	 * @ordered
	 */
	public static final int TPRIVATE_VALUE = 0;

	/**
	 * The '<em><b>TPackage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TPackage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TPACKAGE
	 * @model name="TPackage"
	 * @generated
	 * @ordered
	 */
	public static final int TPACKAGE_VALUE = 1;

	/**
	 * The '<em><b>TProtected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TProtected</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TPROTECTED
	 * @model name="TProtected"
	 * @generated
	 * @ordered
	 */
	public static final int TPROTECTED_VALUE = 2;

	/**
	 * The '<em><b>TPublic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TPublic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TPUBLIC
	 * @model name="TPublic"
	 * @generated
	 * @ordered
	 */
	public static final int TPUBLIC_VALUE = 3;

	/**
	 * An array of all the '<em><b>TVisibility</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TVisibility[] VALUES_ARRAY = new TVisibility[] {
			TPRIVATE,
			TPACKAGE,
			TPROTECTED,
			TPUBLIC,
		};

	/**
	 * A public read-only list of all the '<em><b>TVisibility</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TVisibility> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TVisibility</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TVisibility get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TVisibility result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TVisibility</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TVisibility getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TVisibility result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TVisibility</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TVisibility get(int value) {
		switch (value) {
			case TPRIVATE_VALUE: return TPRIVATE;
			case TPACKAGE_VALUE: return TPACKAGE;
			case TPROTECTED_VALUE: return TPROTECTED;
			case TPUBLIC_VALUE: return TPUBLIC;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TVisibility(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //TVisibility
