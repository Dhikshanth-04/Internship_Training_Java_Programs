package Recursion;
import java.util.*;
public class Nto1Recursion {
    static void fun(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun(n);
        sc.close();
    }
}
