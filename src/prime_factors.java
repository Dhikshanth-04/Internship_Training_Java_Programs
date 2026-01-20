import java.util.*;
public class prime_factors {
    
    static void primeFactor(int n){
        int i = 2;
        while(i<=Math.sqrt(n)){
            while(n%i==0){
                System.out.println(i);
                n = n/i;
            }
            i++;
        }
        System.out.println(n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeFactor(n);
    }
}
