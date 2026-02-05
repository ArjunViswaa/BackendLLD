public class Dog implements Runnable, RunnerPlus {

    @Override
    public void run() {
        System.out.println("Dog is running");
    }

    public void walk() {
        System.out.println("Dog walking");
    }
}
