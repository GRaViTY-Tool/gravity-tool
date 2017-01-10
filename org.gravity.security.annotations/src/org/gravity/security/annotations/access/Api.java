/**
 * 
 */
package org.gravity.security.annotations.access;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Target;

@Target({ FIELD, METHOD, CONSTRUCTOR })
/**
 * @author speldszus
 *
 */
public @interface Api {

}
