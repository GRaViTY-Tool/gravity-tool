/**
 * 
 */
package org.gravity.security.annotations.requirements;

import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Equivalent to umlsec <<critical>>
 * 
 * @author speldszus
 *
 */
@Target(value=TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Critical {
	
	String[] high() default {};
	String[] integrity() default {};
	String[] secrecy() default {};

}
