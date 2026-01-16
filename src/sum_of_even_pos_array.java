import java.util.*;
public class sum_of_even_pos_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=n-1; i>=0;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                sum+=arr[i];
            }
        }
        System.out.print(sum);
    }
}
