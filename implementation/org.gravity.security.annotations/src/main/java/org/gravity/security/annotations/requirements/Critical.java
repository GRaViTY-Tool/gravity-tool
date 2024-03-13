/**
 *
 */
package org.gravity.security.annotations.requirements;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Equivalent to UMLsec «critical»
 *
 * @author speldszus
 *
 */
@Target(value = { ElementType.TYPE, ElementType.RECORD_COMPONENT })
@Retention(RetentionPolicy.RUNTIME)
public @interface Critical {

	/**
	 * The member signatures on the high level secrecy.
	 *
	 * @return A list of member signatures
	 */
	String[] high() default {};

	/**
	 * The member signatures on the integrity level secrecy.
	 *
	 * @return A list of member signatures
	 */
	String[] integrity() default {};

	/**
	 * The member signatures on the security level secrecy.
	 *
	 * @return A list of member signatures
	 */
	String[] secrecy() default {};

}
