public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter h = new HelloWorldPrinter();
        for(int i=0; i<100; i++) {
//            Thread th = new Thread(h);
//            Thread th = new Thread(new NumberPrinter(i));
            Thread th = new HelloWorldPrinter2();
//            h.run();
            th.start();
        }
    }
}
