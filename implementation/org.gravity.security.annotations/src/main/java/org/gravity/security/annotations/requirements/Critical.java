/**
 *
 */
package org.gravity.security.annotations.requirements;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is used to declare that specific members, which are either
 * defined by the annotated class or accessed by members defined in this class,
 * are at a specific security level, meaning that secrecy or integrity is
 * required
 * for processed or stored information and this is guaranteed by the members of
 * the annotated class.
 * These circumstances must be reviewed before adding this annotation.
 * Using this annotation is equivalent to the UMLsec «critical» stereotype.
 * Instead or in addition to declaring a security level for members defined
 * within this class also the <code>@Secrecy</code> and <code>@Integrity</code>
 * annotations can be used by annotating the members directly.
 *
 * @author speldszus
 *
 */
@Target(value = { ElementType.TYPE, ElementType.RECORD_COMPONENT })
@Retention(RetentionPolicy.RUNTIME)
public @interface Critical {

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
