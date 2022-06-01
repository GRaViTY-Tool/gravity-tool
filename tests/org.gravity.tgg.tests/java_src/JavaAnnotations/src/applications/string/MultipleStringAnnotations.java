package applications.string;

import annotations.Annotation;
import annotations.string.AnnotationOneString;
import annotations.string.AnnotationTwoStringArrays;

@Annotation
@AnnotationOneString(string="S")
@AnnotationTwoStringArrays(stringArray1 = {"a", "b"}, stringArray2={})
public class MultipleStringAnnotations {

}
