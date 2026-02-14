
import java.util.Scanner;

public class MinPair {

    public static void minPair(int[] arr) {
        // Write your code here
        int min = 0;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                sum = arr[i]+arr[j];
                if(sum<min){
                    min = sum;
                }
            }
        }
        System.out.print(min);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        minPair(arr);
        
    }
}