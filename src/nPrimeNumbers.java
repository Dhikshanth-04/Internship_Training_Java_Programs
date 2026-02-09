import java.util.*;
public class nPrimeNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeNumber(n);
    }
    static void primeNumber(int n){
        int count = 0;
        while(count<n){
            for(int i=2;i<n*n;i++){
                boolean flag = true;
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        flag = false;
                    }
                }
                if(flag){
                    System.out.print(i+" ");
                    count++;
                }
            }
        }
    }
}
