import java.util.*;

public class n1n2PrimeNumber {

    static void primeNumberRange(int n1, int n2){
        for(int i=n1;i<=n2;i++){
            boolean flag = true;
            if(i==1){
                flag = false;
            }

            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag = false;
                }
            }
            if(flag){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        primeNumberRange(n1, n2);
    }
}
