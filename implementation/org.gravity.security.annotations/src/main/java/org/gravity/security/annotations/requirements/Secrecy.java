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
 * This annotation will be used to put the annotated member signature on the
 * security level of secrecy. The annotation is equivalent to UMLsec
 * <code>«critical»{secrecy={annotated member}}</code> or the corresponding Java
 * annotation <code>@Secrecy(secrecy={"annotated member"})</code>
 *
 * @author speldszus
 *
 */
@Target(value = { FIELD, METHOD, CONSTRUCTOR })
@Retention(RUNTIME)
public @interface Secrecy {

	/**
	 * If this annotation is used in UMLsecRT, an optional early return value can be
	 * specified. This can be a static value corresponding to the annotated member's
	 * field type or return type or the name of a static method that should be
	 * invoked an which will return the corresponding value.
	 *
	 * @return the early return value.
	 */
	String earlyReturn() default "";

}
