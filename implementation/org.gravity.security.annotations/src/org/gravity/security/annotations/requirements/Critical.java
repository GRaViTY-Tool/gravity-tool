/**
 * 
 */
package org.gravity.security.annotations.requirements;

import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Target;

/**
 * @author speldszus
 *
 */
@Target(TYPE)
public @interface Critical {
	
	String[] high() default {};
	String[] integrity() default {};
	String[] secrecy() default {};

}
