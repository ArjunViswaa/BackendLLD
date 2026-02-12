public class Main {
    public static void main(String[] args) {
        for(int i=1; i<=1000000 ; i++) {
            NumberPrinter np = new NumberPrinter(i);
            Thread th = new Thread(np);
            th.start();
        }
    }
}