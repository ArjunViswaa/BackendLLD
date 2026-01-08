package IntroToOOP;

public class Student {
    private String name;
    int age;
    protected double psp;
    public String batch;

    public Student() {
        this.name = "Arjun";
        this.age = 27;
        this.psp = 100.0;
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