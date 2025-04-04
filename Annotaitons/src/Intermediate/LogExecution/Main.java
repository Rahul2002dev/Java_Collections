package Intermediate.LogExecution;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Demo dc = new Demo();

        Class<?> sc = Demo.class;
        for (Method method : sc.getDeclaredMethods()){
            if(method.isAnnotationPresent(logExecutionAnnotation.class)){
                double st = System.currentTimeMillis();

                method.invoke(dc);

                double tf = System.currentTimeMillis();
                System.out.println("Execution time of " + method.getName() + ": " + (tf -st) + " ms\n");
            }
        }

    }
}
