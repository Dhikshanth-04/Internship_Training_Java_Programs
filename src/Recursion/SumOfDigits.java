package Recursion;

public class SumOfDigits {
    public static int sumOfDigits(int n){
        int sum = 0;
        if(n==0){
            return 0;
        }
        sum += sumOfDigits(n%10);
        return sum;
    }
    public static void main(String[] args){
        System.out.println(sumOfDigits(12345));
    }    
}
