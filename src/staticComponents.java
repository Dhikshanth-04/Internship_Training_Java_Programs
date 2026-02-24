import java.util.*;
class demo{
    static int a;
    static int b;
    static{
        System.out.println("This is static block");
    }
    public static void printMethod(){
        System.out.println("This is static method");
    }

}

public class staticComponents {
    public static void main(String[] args ){
        demo.printMethod();
    }
}
