interface diamond{
    void add();
    void sub();
}

interface diamond1{
    void add();
    void sub();
}

class A implements diamond, diamond1{
    public void add(){
        System.out.println("a");
    }
    public void sub(){
        System.out.println("b");
    }
}

public class InterfaceDiamond{
    public static void main(String[] args){
        A a = new A();
        a.add();
        a.sub();
    }
}