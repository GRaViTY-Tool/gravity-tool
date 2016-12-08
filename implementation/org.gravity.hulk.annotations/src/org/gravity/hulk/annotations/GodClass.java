package org.gravity.hulk.annotations;

import java.lang.annotation.Repeatable;

@Repeatable(value = GodClassContainer.class)
public @interface GodClass {

	int id();
}
