import java.util.*;
public class trailing_zeros {
    static int zeros(int n){
        int res = 0;
        int powof5 =5;
        while(n>=powof5){
            res= res + (n/powof5);
            powof5 = 5*powof5;
        }
        return res;
    }    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(zeros(n));
    }
}
