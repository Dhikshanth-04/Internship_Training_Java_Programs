import java.util.*;
public class decimal_2_binary {
    static String d2b(int n){
        String b = "";
        while(n>=1){
            int x = n%2; //taking a remainder
            n = n/2; // altering the quotient to n
            b = x+b; //concatanate at before
        }
        return b;
    }

    //Iterate from the last index of the string, once the chat at 'i' is '1' add to powof2, 
    //then increase the powof2 exponentially, base 2
    static int b2d(String b){
        int res = 0;
        int powof2 = 1;
        int l = b.length()-1;
        for(int i=l; i>=0; i--){
            if(b.charAt(i)=='1'){ 
                res = res+powof2;
            }
            powof2 = 2*powof2;
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String b = d2b(n);
        System.out.println(b);
        System.out.println(b2d(b));

    }
}
