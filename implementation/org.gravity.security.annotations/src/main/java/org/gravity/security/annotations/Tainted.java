/**
 *
 */
package org.gravity.security.annotations;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * An annotation to mark tainted data (i. e. unfiltered user input) or methods, which accepts this kind of data.
 *
 * @author dmebus
 *
 */
@Target(value={FIELD, METHOD, CONSTRUCTOR})
@Retention(RUNTIME)
public @interface Tainted {

}
