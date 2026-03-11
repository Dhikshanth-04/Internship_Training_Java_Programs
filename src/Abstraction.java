abstract class Bird{
    abstract public void fly();
    abstract public void eat();
}

abstract class Eagle extends Bird{
    abstract public void eat();
    public void fly(){
        System.out.println("Eagles fly at higher altitudes.");
    }
}

class SerpentEagle extends Eagle{
    @Override
    public void eat(){
        System.out.println("Serpent Eagles eat Serpents.");
    }
}

class GoldenEagle extends Eagle{
    @Override
    public void eat(){
        System.out.println("Golden Eagle eats Fishes.");
    }
}

public class Abstraction {
    public static void main(String[] args){
        SerpentEagle se = new SerpentEagle();
        GoldenEagle ge = new GoldenEagle();
        Eagle ref;
        ref = se;
        ref.eat();
        ref.fly();
        
        ref = ge;
        ref.eat();
        ref.fly();
    }
}
