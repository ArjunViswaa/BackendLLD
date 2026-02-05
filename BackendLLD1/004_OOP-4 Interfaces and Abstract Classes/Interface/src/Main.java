import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//        Runnable r1 = new Dog();
//        Runnable r2 = new RoboticDog();
//        System.out.println(Runnable.x);
//        r1.run();
//        r2.run();

        List<Runnable> runners = new ArrayList<>();
        runners.add(new Dog());
        runners.add(new Dog());
        runners.add(new RoboticDog());

        for(Runnable runner : runners) {
            runner.run();
            runner.walk();
        }

        Stack<Integer> st = new Stack<>();
    }
}