class Emp1{
    private int eId;
    private String eName;
    private int eSalary;

    public Emp1(){

    }
    public Emp1(int eId, String eName, int eSalary){
        this.eId = eId;
        this.eName = eName;
        this.eSalary = eSalary;
    }
    public int getId(){
        return eId;
    }
    public String getName(){
        return eName;
    }
    public int getSalary(){
        return eSalary;
    }
    @Override
    public String toString(){
        return eId+" "+eName+" "+eSalary;
    }
}

public class ToStringExp {
    public static void main(String[] args){
        Emp1 e = new Emp1(1,"Steve",30000);
        System.out.println(e.toString());
        Integer a = Integer.valueOf(10);//purely object oriented, Wrapper class
        int[]  arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arr1;
        

    }
}
