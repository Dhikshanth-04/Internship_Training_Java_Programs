import java.util.Scanner;

public class AsciiSum {
    public static void printAsciiSubarray(String str){
        
        for(int size=1; size<=str.length(); size++){
            for(int i=0; i<=str.length()-size; i++){
                String t = "";
                int sum = 0;
                for(int j=i; j<i+size; j++){
                    t = t+str.charAt(j);
                    int k = (int)str.charAt(j);
                    sum+=k;
                }
                if(isPrime(sum)){
                    System.out.println(t);
                }
            }
        }
    }
    public static boolean isPrime(int k){
        if(k<=1){
            return false;
        }
        else if(k==2 || k==3){
            return true;
        }
        else if(k%2==0 || k%3==0){
            return false;
        }
        for(int i=5; i*i<=k; i=i+6){
            if(k%i==0 || k%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printAsciiSubarray(str);
    }
}
