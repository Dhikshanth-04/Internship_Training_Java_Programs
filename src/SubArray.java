import java.util.*;
public class SubArray{
    public static void printSubArrays(int[] arr, int k){
        for(int i=0;i<=arr.length-k;i++){
            for(int j=i;j<i+k;j++){
                System.out.print(arr[j]+" ");
            }
        System.out.println();
        }
    }

    public static void printSubArraySum(int[] arr, int k, int target){
        
    }

    public static void printAllSubArray(int[] arr, int target){
        int count = 0;
        for(int size=1;size<=arr.length;size++){
        for(int i=0;i<=arr.length-size;i++){
            int sum = 0;
            for(int j=i;j<i+size;j++){
                sum+=arr[j];
            }
        //System.out.println(sum);
        if(sum==target){
            for(int j=i;j<i+size;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
        }
    }
    //System.out.println(count);       
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        printAllSubArray(arr, target);
        
    }
}