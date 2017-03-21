package applications.clazz;

import annotations.clazz.AnnotationOneClazz;
import annotations.clazz.AnnotationTwoClazzArrays;

@AnnotationOneClazz(clazz=String.class)
@AnnotationTwoClazzArrays(clazzArray1 = {String.class, Integer.class}, clazzArray2={})
public class MultipleClazzAnnotations {

}
