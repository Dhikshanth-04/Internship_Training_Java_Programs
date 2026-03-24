interface funct {
    void fun();
}
class FunctionalInterface{
    public static void main(String[] args){
        funct fi = ()->{System.out.println("hello");};
        fi.fun();
    }
}