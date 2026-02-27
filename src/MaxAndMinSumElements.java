import java.util.*;
public class MaxAndMinSumElements {

    static int sumOfDigit(int[] arr){
        int sum = 0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }

    static int largestElement(int[] arr){
        int max = arr[0];
        for(int i:arr){
            if(i>max){
                max = i;
            }
        }
        return max;
    }

    static int smallestElement(int[] arr){
        int min = arr[0];
        for(int i:arr){
            if(i<min){
                min = i;
            }
        }
        return min;
    }

    static int[] productOfDigit(int[] arr){
        int pro = 1;
        for(int i:arr){
            pro*=i;
        }
       int[] fre = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            fre[i] = pro/arr[i];
        }
        return fre;
    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);   
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int sum = sumOfDigit(arr);
        int max = largestElement(arr);
        int min = smallestElement(arr);
        System.out.println(sum-max);
        System.out.println(sum-min);
        int pro[] = productOfDigit(arr);
        
        for(int i:pro){
            System.out.print(i+" ");
        }

    }    
}
