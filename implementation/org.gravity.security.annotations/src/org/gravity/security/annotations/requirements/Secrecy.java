/**
 * 
 */
package org.gravity.security.annotations.requirements;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Target;

@Target({FIELD, METHOD})
/**
 * @author speldszus
 *
 */
public @interface Secrecy {

}
