package Basic.Todo;

public class Demo {

    Demo(){};

    @TodoAnnotation(task = "this is your task",assignedTo = "developer",priority = "High")
    void PrintingTodoTask(){
        System.out.println("we are printing the Todo task");
    }

    @TodoAnnotation
    void PrintingPendingTasks(){
        System.out.println("we are printing the pending tasks");
    }
}
