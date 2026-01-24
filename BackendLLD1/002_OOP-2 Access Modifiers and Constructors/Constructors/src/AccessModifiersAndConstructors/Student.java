package AccessModifiersAndConstructors;

public class Student {
    private String name;
    int age;
    protected double psp;
    public String batch;
    public Exam exam;
    public static int noOfStudents;

    public Student() {
        this.name = "Sagar";
        this.age = 27;
        this.psp = 100.0;
        noOfStudents++;
    }

    public Student(String name) {
        this.name = name;
        this.age = 27;
        this.psp = 100.0;
        noOfStudents++;
    }

    public Student(String name, int age, double psp) {
        this.name = name;
        this.age = age;
        this.psp = psp;
        noOfStudents++;
    }

    public Student(Student src) {
        this.name = src.name;
        this.age = src.age;
        this.psp = src.psp;
        this.batch = src.batch;
        this.exam = new Exam(src.exam);
        noOfStudents++;
    }

    void Test() {
        System.out.println(this);
    }

    void print() {
        System.out.println("Name: " + name);
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}