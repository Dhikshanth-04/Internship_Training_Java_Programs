import java.util.Scanner;
public class LCFexcluding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int low[] = new int[m];
        // implement your logic here
        for(int i=3;i<m;i++){
            if(n%i==0 && m%i==0){
                System.out.print(i);
                break;
            }
        }
        
    }
}