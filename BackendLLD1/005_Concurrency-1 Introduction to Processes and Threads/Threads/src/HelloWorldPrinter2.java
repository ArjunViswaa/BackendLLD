public class HelloWorldPrinter2 extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Hello world");
    }
}
