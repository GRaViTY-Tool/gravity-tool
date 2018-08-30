/**
 * 
 */
package org.gravity.security.annotations.requirements;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.CONSTRUCTOR;

import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;

/**
 * Equivalent to umlsec <<critical>>{integrity={annotated member}}
 * 
 * @author speldszus
 *
 */
@Target(value={FIELD, METHOD, CONSTRUCTOR})
@Retention(RUNTIME)
public @interface Integrity {

	String earlyReturn() default "";

}
