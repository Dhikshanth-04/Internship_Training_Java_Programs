interface Bird1{
    void fly();
    void eat();
}
class Eagle1 implements Bird1{
    @Override
    public void fly(){
        System.out.println("Eagle1 flys at higher Altitude");
    }
    @Override
    public void eat(){
        System.out.println("Eagles eat other reptiles, fishes");
    }
}
class SerpentEagle1 extends Eagle1{
    @Override
    public void eat(){
        System.out.println("Serpet Eagles eat Snakes");
    }
}
class GoldenEagle1 implements Bird1{
    @Override
    public void fly(){
        System.out.println("Eagles fly at higher altitude");
    }
    @Override
    public void eat(){
        System.out.println("Golden Eagles eat Fishes");
    }
}
class poly{
    public void polyPrint(Bird1 ref){
        ref.eat();
        ref.fly();
    }
}
public class Interface{
    public static void main(String[] args){
        SerpentEagle1 se = new SerpentEagle1();
        GoldenEagle1 ge = new GoldenEagle1();
        poly p = new poly();
        p.polyPrint(ge);
        p.polyPrint(se);
    }
}