/*
Rules of Recursion
1. Problem can be broken down into smaller problem
2. Are the results are dependent upon the previous results
3. Does it have the base conditions

fibonacci : nth term = (n-1)th term + (n-2)th term
Base condition : 1st and 2nd fibonacci term is 1
*/
package Recursion;
public class FibonacciRecursion {
    public static int fib(int n){
        if(n==1||n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args){
        int n = 8;
        int res = fib(n);
        System.out.println(res);
    }
    
}
