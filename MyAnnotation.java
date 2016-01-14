import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Documented()//indicates that elements using this annotation should be documented by JavaDoc
@Target({ElementType.METHOD})//It specifies where we can use the annotation
@Retention(RetentionPolicy.CLASS)//indicates how long annotations with the annotated type are to be retained, the annotation would be in the .class file but it would not be available at runtime.
@Inherited()//annotation signals that a custom annotation used in a class should be inherited by all of its sub classes
public @interface MyAnnotation {
    String title();
    int version() default 1;
    String text();
}

