package org.gravity.hulk.annotations;

import java.lang.annotation.Repeatable;

@Repeatable(value = SpaghettiCodeContainer.class)
public @interface SpaghettiCode {

	int id();
}
