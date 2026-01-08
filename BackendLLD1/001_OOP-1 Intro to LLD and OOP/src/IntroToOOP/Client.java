package IntroToOOP;

public class Client {
    public static void main(String[] args) {
        Student x = new Student();
//        x.age = 35;
//        Student y = x;
//        y.age += 10;
//        System.out.println(y.age);
//        System.out.println(x.age);
//
//        Student z = new Student();
//        z.age += 10;
//        System.out.println(z.age);
//
//        y = new Student();
//        System.out.println(y.age);
//        x.name = "srk"; // Name is a private variable - wont work
//        x.setName("Arjun"); // setter used for accessing private variables
        System.out.println(x.psp);
        System.out.println(x.getName());
    }
}