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

	String[] high() default {};

	String[] integrity() default {};

	String[] secrecy() default {};

}
