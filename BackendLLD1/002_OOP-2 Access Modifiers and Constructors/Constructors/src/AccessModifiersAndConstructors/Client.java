package AccessModifiersAndConstructors;

public class Client {
    public static void main(String[] args) {
//        Student st = new Student();
//        System.out.println(st.getName());
//        Student y = new Student("Arjun");
//        System.out.println(y.getName());

//        // this keyword
//        Student x = new Student("Arjun");
//        x.setName("Puneet");
//        System.out.println(x);
//        x.Test();
//
//        Student y = new Student();
//        y.setName("Aman");
//        System.out.println(y);
//        y.Test();

        // Copy Constructor
        Student src = new Student("Sarath", 27, 100);
        Student destOr = src;
        Student dest = new Student(src);

        System.out.println(src);
        System.out.println(destOr);
        System.out.println(dest);
        System.out.println(dest.getName());
    }
}
