import java.util.*;
class bankLoan{
    private float principleAmount;
    private float tenure;
    private static float rateOfInterest;
    private float simpleInterest;

    static{
        rateOfInterest = 10.5f;
    }

    bankLoan(float principleAmount, float tenure){
        this.principleAmount = principleAmount;
        this.tenure = tenure;
    }

    public void calculate(){
        simpleInterest = principleAmount*tenure*rateOfInterest/100;
    }

    public float getInterest(){
        return simpleInterest;
    }
}

public class bankStatic {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        bankLoan[] bl = new bankLoan[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the principle amount: ");
            float principleAmount = sc.nextFloat();
            System.out.println("Enter the tenure: ");
            float tenure = sc.nextFloat();
            bl[i] = new bankLoan(principleAmount, tenure);
            bl[i].calculate();
        } 
        for(int i=0;i<n;i++){System.out.println(bl[i].getInterest());}
    }
}
