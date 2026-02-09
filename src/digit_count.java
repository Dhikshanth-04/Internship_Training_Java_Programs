import java.util.*;
public class digit_count {
    static int count(int n){
        int count = 0;
        int d = 0;
        while(n>0){
            d = n%10;
            count++;
            n = n/10;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(count(n));
        int[] h = new int[-8];
		h[-1] = 6;
        System.out.print(h[-1]);
    }
}
