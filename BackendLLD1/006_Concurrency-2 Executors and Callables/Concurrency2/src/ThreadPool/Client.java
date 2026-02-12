package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
//        ExecutorService es = Executors.newFixedThreadPool(10);
        ExecutorService es = Executors.newCachedThreadPool();

        for(int i=1; i<=100000; i++) {
            NumberPrinter x1 = new NumberPrinter(i);
            es.execute(x1);
        }
    }
}
