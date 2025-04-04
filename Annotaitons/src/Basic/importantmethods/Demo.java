package Basic.importantmethods;


public class Demo {


    Demo(){};

    @ImportantMethods(level = "low",yourFatherName = "cyr",yourName = "xyz")
    void print(){
        System.out.println("my name rahul");
        System.out.println();
    }

    @ImportantMethods
    void PrintNumber(){
        System.out.print("this is number");
    }
}
