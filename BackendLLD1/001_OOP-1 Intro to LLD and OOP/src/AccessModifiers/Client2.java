package AccessModifiers;

import IntroToOOP.Student;

public class Client2 extends Student {
    public static void main(String[] args) {
        Student s = new Student();
        s.batch = "Academy Nov'25";
        System.out.println(s.batch);
    }
}
