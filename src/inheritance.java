class GrandParent{
    String agility;
    void workingHours(){
        System.out.println("Worked 12hrs a day");
    }
}
class Parent extends GrandParent{
    String hairColor;
    String skinColor;
    float height;
    void readingBook(){
        System.out.println("Parent : Reading book");
    }
    void smoking(){
        System.out.println("Parent : Smoking is prohibited");
    }
}
class Child1 extends Parent{
}

class Child2 extends Parent{
}

class Child3 extends Parent{
}
public class inheritance {
    public static void main(String[] args){
        Child1 c = new Child1();
        c.readingBook();
        c.workingHours();

        Child2 c2 =new Child2();
        c2.readingBook();;
        c2.workingHours();

        Child3 c3 =new Child3();
        c3.readingBook();
        c3.workingHours();
    }
}
