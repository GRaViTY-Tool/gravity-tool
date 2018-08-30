/**
 * 
 */
package org.gravity.security.annotations.requirements;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Equivalent to umlsec <<critical>>{high={annotated member}}
 * 
 * @author speldszus
 *
 */
@Target(value={FIELD, METHOD, CONSTRUCTOR})
@Retention(RUNTIME)
public @interface High {

	String earlyReturn() default "";

}
