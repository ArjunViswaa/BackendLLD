package SyncMethod;

public class Value {
    public int value = 0;

    synchronized void incrementBy1() {
        this.value += 1;
    }

    synchronized void decrementBy1() {
        this.value -= 1;
    }
}