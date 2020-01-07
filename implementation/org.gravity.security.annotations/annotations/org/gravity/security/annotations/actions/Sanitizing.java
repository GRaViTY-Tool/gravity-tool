/**
 *
 */
package org.gravity.security.annotations.actions;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * An annotation to mark methods, which sanitize tainted data and raise its
 * security level.
 *
 * @author dmebus
 *
 */
@Target(value = { METHOD, CONSTRUCTOR })
@Retention(RUNTIME)
public @interface Sanitizing {

}
