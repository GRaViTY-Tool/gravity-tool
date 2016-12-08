package org.gravity.hulk.annotations;

import java.lang.annotation.Repeatable;

@Repeatable(value = SwissArmyKnifeContainer.class)
public @interface SwissArmyKnife {

	int id();
}
