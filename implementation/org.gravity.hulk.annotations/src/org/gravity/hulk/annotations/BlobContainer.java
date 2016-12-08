package org.gravity.hulk.annotations;

public @interface BlobContainer {
	Blob[] value() default {};
}
