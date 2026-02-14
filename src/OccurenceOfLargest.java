
import java.util.Scanner;
public class OccurenceOfLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // implement your logic here
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int count = 0;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
        for(int i=0;i<n;i++){
            if(arr[i] == max){
                count=count+1;
            }
        }
        System.out.print(count);
    }
}