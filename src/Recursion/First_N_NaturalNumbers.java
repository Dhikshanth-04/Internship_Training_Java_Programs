package Recursion;
public class First_N_NaturalNumbers {
    public static void naturalNumbers(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        naturalNumbers(n-1);
    }
    public static void main(String[] args){
        int n = 8;
        naturalNumbers(n);
    }
    
}
