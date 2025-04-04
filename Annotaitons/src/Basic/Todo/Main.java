package Basic.Todo;

public class Main {
    public static void main(String[] args) throws Exception {
        Demo demo = new Demo();

        Class<?> cs  = demo.getClass();
        TodoAnnotation trm  = cs.getDeclaredMethod("PrintingPendingTasks").getAnnotation(TodoAnnotation.class);
        System.out.println(trm.assignedTo());
        System.out.println(trm.priority());
        System.out.println(trm.task());

    }
}
