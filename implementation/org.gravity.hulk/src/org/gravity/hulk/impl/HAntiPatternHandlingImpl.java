/**
 */
package org.gravity.hulk.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.gravity.hulk.HAntiPatternHandling;
import org.gravity.hulk.HDetector;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HAnti
 * Pattern Handling</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.gravity.hulk.impl.HAntiPatternHandlingImpl#getHDetector
 * <em>HDetector</em>}</li>
 * <li>{@link org.gravity.hulk.impl.HAntiPatternHandlingImpl#getApg
 * <em>Apg</em>}</li>
 * <li>{@link org.gravity.hulk.impl.HAntiPatternHandlingImpl#getProgramlocation
 * <em>Programlocation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class HAntiPatternHandlingImpl extends EObjectImpl implements HAntiPatternHandling {
	/**
	 * The cached value of the '{@link #getHDetector() <em>HDetector</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getHDetector()
	 * @generated
	 * @ordered
	 */
	protected List<HDetector> hDetector;

	/**
	 * The cached value of the '{@link #getApg() <em>Apg</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getApg()
	 * @generated
	 * @ordered
	 */
	protected HAntiPatternGraph apg;

	/**
	 * The default value of the '{@link #getProgramlocation()
	 * <em>Programlocation</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getProgramlocation()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAMLOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgramlocation()
	 * <em>Programlocation</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getProgramlocation()
	 * @generated
	 * @ordered
	 */
	protected String programlocation = PROGRAMLOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected HAntiPatternHandlingImpl() {
		this.hDetector = new ArrayList<>();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public List<HDetector> getHDetector() {
		return this.hDetector;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public HAntiPatternGraph getApg() {
		return this.apg;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setApg(HAntiPatternGraph newApg) {
		this.apg = newApg;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getProgramlocation() {
		return this.programlocation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setProgramlocation(String newProgramlocation) {
		this.programlocation = newProgramlocation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		if (this.eIsProxy()) {
			return super.toString();
		}

		return new StringBuilder(super.toString()).append(" (programlocation: ").append(this.programlocation)
				.append(')')
				.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // HAntiPatternHandlingImpl
