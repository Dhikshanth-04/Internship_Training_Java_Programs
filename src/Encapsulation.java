class Employee{
    private int eId;
    private String eName;
    private String eDesignation;

    Employee(int eId, String eName, String eDesignation){
        this.eId = eId;
        this.eName = eName;
        this.eDesignation = eDesignation;
    }

    Employee(){
        eId = 2;
        eName = "Steve Rojers";
        eDesignation = "Captain America";
    }

    public int geteId(){
        return eId;
    }
    public String geteName(){
        return eName;
    }
    public String geteDesignation(){
        return eDesignation;
    }
}

public class Encapsulation{
    public static void main(String[] args){
        Employee e1 = new Employee(1, "Tony Stark", "Ironman");
        System.out.println(e1.geteId());
        System.out.println(e1.geteName());
        System.out.println(e1.geteDesignation()); 

        e1 = new Employee();
        System.out.println(e1.geteId());
        System.out.println(e1.geteName());
        System.out.println(e1.geteDesignation()); 
    }
}