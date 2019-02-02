package wo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationDemo12 {
	String color() default "blue";
	String value();
	int [] age();
	//MetaAnnotation annotation();

}
