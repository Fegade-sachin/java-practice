package java8feachers;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)   // Available at runtime
@Target(ElementType.METHOD)           // Can be applied to methods
public @interface MyAnnotation {
    String value() default "default"; // Single-value element
}
