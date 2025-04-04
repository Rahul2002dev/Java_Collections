package Basic.importantmethods;

import java.lang.annotation.*;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception{

        Class<?> demoClass = Demo.class;


        if (demoClass.isAnnotationPresent(ImportantMethods.class)) {
            ImportantMethods annotation = demoClass.getAnnotation(ImportantMethods.class);
            System.out.println("Annotation Found on Class!");
            System.out.println("Level: " + annotation.level());
            System.out.println("Your Name: " + annotation.yourName());
            System.out.println("Your Father's Name: " + annotation.yourFatherName());
        } else {
            System.out.println("No annotation found on class.");
        }

        // Check for annotation on method
        Method method = demoClass.getDeclaredMethod("print");
        ImportantMethods annot = method.getAnnotation(ImportantMethods.class);

        if (annot != null) {
            System.out.println("\nAnnotation Found on Method!");
            System.out.println("Level: " + annot.level());
            System.out.println("Your Name: " + annot.yourName());
            System.out.println("Your Father's Name: " + annot.yourFatherName());
        } else {
            System.out.println("No annotation found on method.");
        }




    }
}
