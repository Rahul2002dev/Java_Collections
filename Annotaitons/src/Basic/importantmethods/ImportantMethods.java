package Basic.importantmethods;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface ImportantMethods {
    String level() default "HIGH";

    String yourName() default "your name is Printing";

    String yourFatherName() default "your father name Printing";
}

