package Intermediate.LogExecution;

public class Demo {
    Demo(){};

    @logExecutionAnnotation
    void firstMethd(){
        System.out.println("printing first method");

        try{
            Thread.sleep(5000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @logExecutionAnnotation
    void SecondMethod(){
        System.out.println("we are printing second method :  ");

        for(int i = 0; i < 1000; i++){

        }
    }
}
