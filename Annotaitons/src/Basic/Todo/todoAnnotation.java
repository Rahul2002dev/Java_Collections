package Basic.Todo;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface TodoAnnotation{
    String task() default "write about description of task";
    String assignedTo() default "Developer Responsible";
    String priority() default "medium";
}