import java.util.*;
public class commomMultiples {
    static void multiples(int n, int a , int b){
        int i = 1;
        int count = 0;
        while(count<=n){
            if(i%a==0 && i%b==0){
                System.out.print(i+" ");
                count++;
            }
            i++;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        multiples(n, a, b);
    }
}
