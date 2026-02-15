
public class ContinuousSumPair {
    public static void main(String[] args){
        int[] arr = {0,5,6,0,9,0,1,4,11};
        int sum = 0;
        int max = 0;
        for(int i=0;i<arr.length-1;i++){
            sum = arr[i] + arr[i+1];
            max = Math.max(max, sum);
        }
        System.out.print(max);
    }
}
