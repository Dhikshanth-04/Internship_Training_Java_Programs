import java.util.*;
public class sum_of_odd_numbers_in_digit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d =0;
        int sum =0;
        while(n>0){
            d = n%10;
            if(d%2==1){
                sum+=d;
            }
            n = n/10;
        }
        System.out.println(sum);
    }
}
