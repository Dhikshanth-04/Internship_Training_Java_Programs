import java.util.*;
class laptopMaintenance{
    public void cleanMaster() throws Exception{
        System.out.println("Maintain the lap with clean and virus-free");
    }
    public void applicationInstallation(){
       try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the application size: ");
            int size = sc.nextInt();
            System.out.println(size);
       }
       catch(InputMismatchException e){
        System.out.println("Enter the valid input in integer");
        throw e;
       }
    }
}
public class ExceptionHandling {
    public static void main(String[] args){
        try{
            laptopMaintenance lm = new laptopMaintenance();
            lm.cleanMaster();
            lm.applicationInstallation();
        }
        catch(Exception e){
            System.out.println("Manage an exception");
        }
    }    
}
