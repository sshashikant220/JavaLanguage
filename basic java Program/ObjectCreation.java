public class ObjectCreation {

    int a; // instance variable
    String name = "Rahul"; // Heap memory

    public static void main(String[] args) {

        int var = 10; // local variable or primitive variable

        ObjectCreation obj1 = new ObjectCreation(); // Refrence variable
        ObjectCreation obj2 = new ObjectCreation(); // stack memory

        obj1.name = "Pankaj";
        System.out.println(obj1.name);
        System.out.println(obj1.a);

        System.out.println(obj2.name);

    }

}
