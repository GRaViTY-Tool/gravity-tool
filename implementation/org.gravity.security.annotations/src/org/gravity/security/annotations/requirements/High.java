/**
 * 
 */
package org.gravity.security.annotations.requirements;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Target;

/**
 * @author speldszus
 *
 */
@Target({FIELD, METHOD})
public @interface High {

}
