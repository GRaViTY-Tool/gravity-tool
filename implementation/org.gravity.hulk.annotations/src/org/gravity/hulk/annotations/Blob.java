package org.gravity.hulk.annotations;

import java.lang.annotation.Repeatable;

@Repeatable(value = BlobContainer.class)
public @interface Blob {

	int id();
}
