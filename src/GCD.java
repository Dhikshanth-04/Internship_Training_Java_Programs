import java.util.*;
public class GCD{
    //Brute Force Approach
    static int gcd(int a, int b){
        int div =0;
        int min = 0;
        if(a>b){
            min = a;
        }else{
            min = b;
        }
        for(int i=min; i>=1; i--){
            if(a%i==0 && b%i==0){
                div = i;
                break;
            }
        }

        return div;
    }

    //Euclid's algorithm
    static int euclidgcd(int a, int b){
        while(a!=b){
            if(a>b){
                a = a-b;
            }else{
                b = b-a;
            }
        }
        return a;
    }

    //Gabrieal Lame algorithm
    static int Gabrieallamegcd(int a, int b){
        while(a!=0 && b!=0){
            if(a>b){
                a = a%b;
            }
            else{
                b = b%a;
            }
        }
        if(a!=0){
            return a;
        }else{
            return b;
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
        System.out.println(euclidgcd(a, b));
        System.out.println(Gabrieallamegcd(a, b));
        
    }
}