import java.util.*;
public class multiplesOf357 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int count = 0;
        while(count<n){
            if(i%3==0 || i%5==0 || i%7==0){
                System.out.print(i+" ");
                count++;
            }
            i++;
        }
    }
}
