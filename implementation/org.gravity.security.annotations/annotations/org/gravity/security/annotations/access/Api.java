/**
 * 
 */
package org.gravity.security.annotations.access;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * For annotating expected api interfaces
 * 
 * @author speldszus
 *
 */
@Target(value={FIELD, METHOD, CONSTRUCTOR })
@Retention(RetentionPolicy.RUNTIME)
public @interface Api {

}
