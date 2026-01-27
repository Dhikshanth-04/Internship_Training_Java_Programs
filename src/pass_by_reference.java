 class dog{
    String name;
    String breed;
    int age;
}

public class pass_by_reference {
    public static void main(String args[]){
        dog d1 = new dog();
        d1.name = "Max";
        d1.breed = "Pitbull";
        d1.age = 12;
        System.out.println(d1.name);
        System.out.println(d1.breed);
        System.out.println(d1.age);

        dog d2 = d1;
        d2.name = "peter";
        System.out.println(d1.name);

        dog d3 = d2;
        d3.name = "Tobey";
        System.out.println(d2.name);

        dog d4 = d3;
        d4.name = "Magus";
        System.out.println(d3.name);
    }
}
