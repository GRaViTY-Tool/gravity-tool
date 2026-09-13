/**
 */
package org.gravity.hulk.impl;

import java.util.ArrayList;
import java.util.List;

import org.gravity.hulk.HDetector;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HAnti
 * Pattern Handling</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.gravity.hulk.impl.HAntiPatternHandling#getHDetector
 * <em>HDetector</em>}</li>
 * <li>{@link org.gravity.hulk.impl.HAntiPatternHandling#getApg
 * <em>Apg</em>}</li>
 * <li>{@link org.gravity.hulk.impl.HAntiPatternHandling#getProgramlocation
 * <em>Programlocation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class HAntiPatternHandling {
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
	 * The default value of the '{@link #getProgramLocation()
	 * <em>Programlocation</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getProgramLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAMLOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgramLocation()
	 * <em>Programlocation</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getProgramLocation()
	 * @generated
	 * @ordered
	 */
	protected String programlocation = PROGRAMLOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected HAntiPatternHandling() {
		this.hDetector = new ArrayList<>();
	}

	public List<HDetector> getHDetector() {
		return this.hDetector;
	}

	public HAntiPatternGraph getApg() {
		return this.apg;
	}

	public void setApg(final HAntiPatternGraph newApg) {
		this.apg = newApg;
	}

	public String getProgramLocation() {
		return this.programlocation;
	}

	public void setProgramLocation(final String newProgramlocation) {
		this.programlocation = newProgramlocation;
	}

	@Override
	public String toString() {
		return new StringBuilder(super.toString()).append(" (programlocation: ").append(this.programlocation)
				.append(')')
				.toString();
	}

} // HAntiPatternHandlingImpl
